/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-02T20:54:20Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: EvaluateLicensingQuality.java  
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Using an SPDX tag/value document as starting point, 
    we will gather information in regards to the licensing quality of the
    provided source code.</text> 
 */

package spdxlib;

import java.io.File;

/**
 *
 * @author Nuno Brito, 2nd of November 2014 in Darmstadt, Germany
 */
public class EvaluateLicensingQuality {

    private SPDXfile2 spdx;
    private int 
            score = 0,
            copyrightDeclared = 0,
            copyrightNotDeclared = 0,
            
            licensesDeclared = 0,
            licensesNotDeclared = 0,
            
            licensesConcluded = 0,
            licensesNotConcluded = 0,
            
            score_Step1 = 0,
            scoreCopyright = 0,
            scoreLicensesConcluded = 0,
            scoreLicensesDeclared = 0;
    
    
    
    // define the doc types that one might encounter
    private final String[] docsMandatory = new String[]{
            "readme",                   // Introduction to the project
            "license",                  // declared license for authored code
            "contributing",             // How to contribute code improvements
            "credits",                  // Whom influenced this project
            "maintainers",              // Developers maintaining the code
            "reporting-bugs",           // How can defects be reported?
            "thirdpartylicensereadme",  // Summary and list of applicable licenses
            "copying",                  // Copyright holders of authored code
    };

    private final String[] docsOptional = new String[]{
            "patents",
            "changelog|changes",        // optional
            "building",                 // optional
            "status",                   // optional
            "development",              // optional
            "tasks"                     // optional
    };
    
    
    /**
     * First step to evaluate the licensing quality of an SPDX document.
     * @param file An SPDX document in tag/value format, available on disk
     */
    public void process(final File file) {
        // the first step is interpreting the SPDX document
        spdx = new SPDXfile2(file);
        // iterate through each item on a single loop (for performance reasons)
        for(final FileInfo2 fileInfo : spdx.getFiles()){
            // start the evaluation steps with the licensing and copyright ratio
             countFileCopyrightAndLicense(fileInfo);
        }

        // how well described was the license and copyright? (20 points) 
        step1_CopyrightAndLicenseQuality();
         
        // proceed to evaluate the documentation status for this document
        step2_EvaluateDocumentation();
    }

    
    /**
     * The first step is accounting the quality of authorship attribution.
     * This means to check the percentage of files that have:
     * - license(s) declared
     * - license(s) concluded
     * - applicable copyright assigned
     */
    private void  countFileCopyrightAndLicense(final FileInfo2 fileInfo){
        /**
         * The maximum score that a source code file can have is 3. This means
         * scoring on a declared copyright, declared license and concluded
         * licenses. In some cases, like icon files it might not be possible
         * to declare copyright or licenses. However, it is possible to mark
         * them on the document.
         */
        
        // only process source code files inside this method
        if(fileInfo.getExtensionObject().getCategory() == FileCategory.SOURCE){
            // evaluate how this source code file fairs in licensability
            // *Note: we don't expect script files such as Javascript
            // to have a license nor copyright declared. Basic rule is to
            // focus on source code files that are "compilable" such as Java.
            processSourceCodeFileCopyrightAndLicenseEvidence(fileInfo);
            // other types of files will have licensing information inside,
            // that might one count as extra points for this evaluation.
        }
        
        // for each file, we expect to see a concluded license field to be
        // counted as a good quality practice. This is done on the SPDX, not
        // the file itself. Therefore no excuse to fail this point.
        if(fileInfo.hasLicenseConcluded()){
            licensesConcluded++;
        }else{
            licensesNotConcluded++;
        }
        
        
    }

    /**
     * Look inside the source code file and expect to find a declared license,
     * a concluded license and (at minimum) a copyright declaration.
     * @param fileInfo The file being processed
     */
    private void processSourceCodeFileCopyrightAndLicenseEvidence(final FileInfo2 fileInfo){
        // account for the copyright declaration
        if(fileInfo.hasCopyrightDeclared()){
            copyrightDeclared++;
        }else{
            copyrightNotDeclared++;
        }
        // if it is a source code, we ask for license evidence inside
        if(fileInfo.hasLicenseInfoInFile()){
            licensesDeclared++;
        }else{
            licensesNotDeclared++;
        }
    }
    
    /**
     * Proceed withe the calculations for copyright and license assignment
     */
    private void step1_CopyrightAndLicenseQuality() {
        // 20 points available, we split 10 for copyright and 10 for licenses
        
        // do the copyright scoring
        int sumCopyright = copyrightDeclared + copyrightNotDeclared;
        scoreCopyright = (copyrightDeclared * 10) / sumCopyright;
        
        // calculate the license scoring, we split 5 to concluded licenses
        // and another 5 points to declared licenses
        int sumLicensesConcluded = licensesConcluded + licensesNotConcluded;
        scoreLicensesConcluded = (licensesConcluded * 5) / sumLicensesConcluded;
        
        int sumLicensesDeclared = licensesDeclared + licensesNotDeclared;
        scoreLicensesDeclared = (licensesDeclared * 5) / sumLicensesDeclared;
        
        System.out.println("- Copyright score: " + scoreCopyright);
        System.out.println("\tDeclared: " + copyrightDeclared);
        System.out.println("\tNon-declared: " + copyrightNotDeclared);
        
        System.out.println("- License score = " + scoreLicensesConcluded 
                + " + " + scoreLicensesDeclared);
        System.out.println("\tConcluded " + licensesConcluded);
        System.out.println("\tNot-concluded " + licensesNotConcluded);
        System.out.println("\tDeclared " + licensesDeclared);
        System.out.println("\tNot-declared " + licensesNotDeclared);
        
        // sum up all the scores from this evaluation
        score_Step1 = scoreCopyright + scoreLicensesConcluded + scoreLicensesDeclared;
        
        System.out.println("License and Copyright score: " + score_Step1);
    }

    /**
     * Check how well documented is this project.
     */
    private void step2_EvaluateDocumentation() {
        /**
         * There are things we like about documentation that should be simple:
         * - a README or README.md text file on the root of the project
         * - an INSTALL or some indication where this kind of file can be found
         * - a README folder where misc documents can be found
         * 
         * Either one of the options will count as "checked".
         * 
         * The second part are the auxiliary documents to express the licensing
         * side of the software. These would be:
         * - CONTRIBUTING (explaining how to contribute)
         * - LICENSE (the applicable or declared license terms for the authored software)
         * - PATENTS (award a patent grant when applicable, optional)
         * - CHANGELOG (to describe the changes across each relevant release, optional)
         * - COPYING (mentioning the list of contributors)
         */
        
        
    }
    
}
