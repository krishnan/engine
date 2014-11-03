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
    
    private final int
            pointsForCopyright = 10,
            pointsForLicensesDeclared = 5,
            pointsForLicensesConcluded = 5,
            pointsForMandatoryDocs = 20;
    
    
    private int 
            score = 0,
            copyrightDeclared = 0,      // declared by author(s)
            copyrightNotDeclared = 0,   // no declaration was found
            
            licensesDeclared = 0,       // licenses applicable to authored code
            licensesNotDeclared = 0,    // no licenses evidence was found
            
            licensesConcluded = 0,      // auditor concluded a given license(s)
            licensesNotConcluded = 0,   // no information about auditor review
            
            scoreStep1 = 0,             // overall point score from 0 to 20
            scoreCopyright = 0,         // 0..10 points for copyright quality 
            scoreLicensesConcluded = 0, // up to 5 points for verifying licenses
            scoreLicensesDeclared = 0,  // up to 5 points for declaring licenses
    
        // documentation points
            scoreStep2 = 0,             // overall points score from 0..20
            scoreMandatoryDocs = 0,     // are the mandatory docs included?
            scoreOptionalDocs = 0;      // can optional docs help the scoring?
            
    
    
    // define the doc types that one might encounter
    private final String[] docsMandatory = new String[]{
            "readme",                   // Introduction to the project
            "license",                  // declared license for authored code
            "contributing",             // How to contribute code improvements
            "credits",                  // Whom influenced this project
            "maintainers",              // Developers maintaining the code
            "reporting-bugs",           // How can defects be reported?
            "thirdpartylicensereadme",  // Summary and list of applicable licenses
            "copying",                  // Copyright holders for authored code
    };

    private final String[] docsOptional = new String[]{
            "patents",                  // declaration of patent status on software 
            "changelog|changes",        // log the changes across each version
            "building",                 // explain how to build the software
            "status",                   // current status and on going work
            "development",              // the procedure to become a developer
            "tasks"                     // what needs to be be done/is desired
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
        
        // do final calculation
        stepFinal();
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
        // at this point we only care about original or modified files
        // anything else at this point doesn't count for our scoring
        if(
            (fileInfo.getFileOrigin()!= FileOrigin.AUTHORED )
         && (fileInfo.getFileOrigin()!= FileOrigin.MODIFIED )
                ){
            // nothing else to do here
            return;
        }
        
        
        
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
        final int sumCopyright = copyrightDeclared + copyrightNotDeclared;
        scoreCopyright = (copyrightDeclared * pointsForCopyright) / sumCopyright;
        
        // calculate the license scoring, we split 5 to concluded licenses
        // and another 5 points to declared licenses
        final int sumLicensesConcluded = licensesConcluded + licensesNotConcluded;
        scoreLicensesConcluded = (licensesConcluded * pointsForLicensesConcluded) / sumLicensesConcluded;
        
        final int sumLicensesDeclared = licensesDeclared + licensesNotDeclared;
        scoreLicensesDeclared = (licensesDeclared * pointsForLicensesDeclared) / sumLicensesDeclared;
        
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
        scoreStep1 = scoreCopyright + scoreLicensesConcluded + scoreLicensesDeclared;
        
        System.out.println("License and Copyright score: " + scoreStep1);
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
        
        // go through each mandatory item, it is available on the source code?
        for(final String item : docsMandatory){
            scoreMandatoryDocs = isDocumentAvailable(item, scoreMandatoryDocs);
        }
        // repeat the same procedure, this time for 
        for(final String item : docsOptional){
            scoreOptionalDocs = isDocumentAvailable(item, scoreOptionalDocs);
        }
        
        // get the initial scoring from documents found on the SPDX
        int sumMandatoryDocs = docsMandatory.length;
        /**
         * We need to evaluate other details such as:
         * - URL to homepage of project or package
         * - URL to package download (zip file, tar.gz, etc)
         * - URL to source code repository (or just N/A when not available)
         * - description of the package
         * - version (when available)
         * - license concluded (or declared as applicable) about package
         */


        // 20 points available to score in regards to mandatory docs
        scoreStep2 = (scoreMandatoryDocs * pointsForMandatoryDocs) / sumMandatoryDocs;
        
        // do the final output for this evaluation
        System.out.println("- Documentation score: " + scoreStep2);
        System.out.println("\tMandatory: " + scoreMandatoryDocs);
        System.out.println("\tOptional: " + scoreOptionalDocs);
    }

    /**
     * Looks inside the document to find possible matches with a specific
     * documentation item.
     * @param item  The item that we are looking for.
     */
    private int isDocumentAvailable(final String item, int counter) {
        /**
         * A mandatory document can assume the following forms when
         * using a "readme" as example:
         * - README (text file)
         * - README (folder with documentation inside)
         * - README.txt (text file with .txt extension)
         * - README.md (with markup data, as seen on github)
         * - readme* (all examples above, this time in lowercase)
         */
        
        // how the file should look inside the document file path structure
        final String itemPath = "./"+item;
        
        // iterate all the files reported inside our SPDX document
        for(final FileInfo2 fileInfo : spdx.getFiles()){
            // get the file path portion in lowercase to ease comparison
            final String filePath = fileInfo.getFilePath().toLowerCase();
            // if there is a folder with this name, it is a good sign
            if(utils.text.equals(filePath, itemPath)){
                System.out.println("Found a doc match: " +fileInfo.getName());
                counter++;
                continue;
            }
            // or else just continue if we have these files on the root folder
            if(utils.text.equals(filePath, ".") == false){
                // no point in proceeding, we just want root files for now
                continue;
            }
                
            // transform the file name to lower case
            final String fileName = fileInfo.getName().toLowerCase();
            
            // first test, matching file names
            if(utils.text.equals(fileName, item)){
                System.out.println("Found a doc match: " +fileInfo.getName());
                counter++;
                continue;
            }
            
            if(utils.text.equals(fileName, item + ".md")){
                System.out.println("Found a doc match: " +fileInfo.getName());
                counter++;
                continue;
            }
             
            if(utils.text.equals(fileName, item + ".txt")){
                System.out.println("Found a doc match: " +fileInfo.getName());
                counter++;
                //continue;
            }
            // if we reached this point, it means less one point
        }
        // give back the updated number of counts
        return counter;
    }

    /**
     * Sums up all the scores together
     */
    private void stepFinal() {
        score = scoreStep1 + scoreStep2;
        System.out.println("- Final score: " + score);
    }
    
}
