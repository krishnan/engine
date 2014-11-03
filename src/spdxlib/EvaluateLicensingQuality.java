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
            countCopyrightDeclared = 0,      // declared by author(s)
            countCopyrightNotDeclared = 0,   // no declaration was found
            
            countLicensesDeclared = 0,       // licenses applicable to authored code
            countLicensesNotDeclared = 0,    // no licenses evidence was found
            
            countLicensesConcluded = 0,      // auditor concluded a given license(s)
            countLicensesNotConcluded = 0,   // no information about auditor review
            countUnknownOriginFiles = 0,     // number of files without origin identified
            
            count3rdPartyAssociated = 0,     // 3rd party files with a component
            count3rdPartyNotAssociated = 0,  // 3rd party without a component
            
            scoreCopyright = 0,         // 0..10 points for copyright quality 
            scoreLicensesConcluded = 0, // up to 5 points for verifying licenses
            scoreLicensesDeclared = 0,  // up to 5 points for declaring licenses
            scoreAuthorship = 0,        // how many files were assigned an origin?
    
        // documentation points
            scoreMandatoryDocs = 0,             // overall points score from 0..20
            countMandatoryDocs = 0,     // are the mandatory docs included?
            countOptionalDocs = 0,      // can optional docs help the scoring?
            score3rdPartyAssociated = 0,// are 3rd party files with a component?
            scoreOriginalityTest = 0;   // was the code verified as original?
            
    private final int
            maxPointsForCopyright = 20,
            maxPointsForLicensesDeclared = 15,
            maxPointsForLicensesConcluded = 15,
            maxPointsForAuthorshipAttribution = 20,
            maxPointsForMandatoryDocs = 20,
            maxPointsFor3rdPartyAssociation = 10,
            maxPointsForOriginalityTest = 00;       // later to be plugged
            // max possible score: 60 
    
    // the maximum score that is possible to achieve.
    private final int scoreMax = 
                  maxPointsForCopyright
                + maxPointsForLicensesDeclared
                + maxPointsForLicensesConcluded
                + maxPointsForAuthorshipAttribution
                + maxPointsForMandatoryDocs
                + maxPointsFor3rdPartyAssociation
                + maxPointsForOriginalityTest;
    
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
        
        // evaluate the third-party libraries, are they described?
        step3_EvaluateThirdPartyComponentDescription();
        
        // is the code verified as original or non-original?
        step4_EvaluateCodeOriginality();
        
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
            countLicensesConcluded++;
        }else{
            countLicensesNotConcluded++;
        }
        
        // count the number of files unknown
        if(fileInfo.getFileOrigin() == FileOrigin.UNKNOWN){
            // ideally, we'd have zero unknown files on a perfect document
            countUnknownOriginFiles++;
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
            countCopyrightDeclared++;
        }else{
            countCopyrightNotDeclared++;
        }
        // if it is a source code, we ask for license evidence inside
        if(fileInfo.hasLicenseInfoInFile()){
            countLicensesDeclared++;
        }else{
            countLicensesNotDeclared++;
        }
    }
    
    /**
     * Proceed withe the calculations for copyright and license assignment
     */
    private void step1_CopyrightAndLicenseQuality() {
        // 30 points available, we split these points as:
        // - 10 for copyright in authored code
        // - 10 for licenses in authored code
        // - 10 for defining authorship of each file
        
        // do the copyright scoring
        final int sumCopyright = countCopyrightDeclared + countCopyrightNotDeclared;
        scoreCopyright = (countCopyrightDeclared * maxPointsForCopyright) / sumCopyright;
        
        // up to 5 points to concluded licenses by an auditor
        final int sumLicensesConcluded = countLicensesConcluded + countLicensesNotConcluded;
        scoreLicensesConcluded = (countLicensesConcluded * maxPointsForLicensesConcluded) / sumLicensesConcluded;
        
        // add another 5 points when declaring licenses 
        final int sumLicensesDeclared = countLicensesDeclared + countLicensesNotDeclared;
        scoreLicensesDeclared = (countLicensesDeclared * maxPointsForLicensesDeclared) / sumLicensesDeclared;
        
        // now calculate the authorship ratio
        final int nonUnknown = spdx.getFiles().size() - countUnknownOriginFiles;
        scoreAuthorship = (nonUnknown * maxPointsForAuthorshipAttribution) / spdx.getFiles().size();
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
            countMandatoryDocs = isDocumentAvailable(item, countMandatoryDocs);
        }
        // repeat the same procedure, this time for 
        for(final String item : docsOptional){
            countOptionalDocs = isDocumentAvailable(item, countOptionalDocs);
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
        scoreMandatoryDocs = (countMandatoryDocs * maxPointsForMandatoryDocs) 
                / sumMandatoryDocs;
       
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
                //System.out.println("Found a doc match: " +fileInfo.getName());
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
                counter++;
                continue;
            }
            
            if(utils.text.equals(fileName, item + ".md")){
                counter++;
                continue;
            }
             
            if(utils.text.equals(fileName, item + ".txt")){
                counter++;
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
                
        
        // output the results to the end-user screen
        System.out.println("\n- Copyright score: " + scoreCopyright 
                + "/" + maxPointsForCopyright);
        System.out.println("\t- Declared: " + countCopyrightDeclared);
        System.out.println("\t- Non-declared: " + countCopyrightNotDeclared);
        
        System.out.println("\n- License score = " 
                + (scoreLicensesConcluded + scoreLicensesDeclared) 
                + "/" + (maxPointsForLicensesDeclared 
                        + maxPointsForLicensesConcluded));
        System.out.println("\t- Concluded: " + countLicensesConcluded);
        System.out.println("\t- Not-concluded: " + countLicensesNotConcluded);
        System.out.println("\t- Declared: " + countLicensesDeclared);
        System.out.println("\t- Not-declared: " + countLicensesNotDeclared);
        
        System.out.println("\n- Authorship score: " + scoreAuthorship 
                + "/" + maxPointsForAuthorshipAttribution);
        System.out.println("\t- Unknown files: " + countUnknownOriginFiles);
        System.out.println("\t- Total files: " + spdx.getFiles().size());
         
        // output the third-party association status
        System.out.println("\n- 3rd Party association score: " + score3rdPartyAssociated 
                + "/" + maxPointsFor3rdPartyAssociation);
        
        // do the final output for this evaluation
        System.out.println("\n- Documentation score: " + scoreMandatoryDocs 
                + "/" + maxPointsForMandatoryDocs);
        System.out.println("\t- Mandatory: " + countMandatoryDocs);
        System.out.println("\t- Optional: " + countOptionalDocs);
        
        System.out.println("\n- Originality score: " + scoreOriginalityTest 
                + "/" + maxPointsForOriginalityTest);
        
        // sum up the scores for this analysis
        score =   scoreAuthorship
                + scoreCopyright
                + scoreLicensesConcluded
                + scoreLicensesDeclared
                + scoreMandatoryDocs 
                + score3rdPartyAssociated;
        
        System.out.println("\n- Final score: " + score + "/" + scoreMax);
    }

    /**
     * How well are the non-authored files described in our document?
     */
    private void step3_EvaluateThirdPartyComponentDescription() {
        /**
         * This step only gets scored after the developer/maintainer has
         * identified which files on the code are authored, and which files
         * belong to third-party authors. With this information we can now
         * identify which files were already associated to a component, and
         * which files haven't.
         */
        
        // iterate our list of files inside the document
        for(final FileInfo2 fileInfo : spdx.getFiles()){
            // we can only look on files that were marked as:
            // - External (belonging to a third party)
            // - Modified (belongs to a third-party, was modified by our side)
            if(fileInfo.getFileOrigin() != FileOrigin.EXTERNAL 
                    && fileInfo.getFileOrigin() != FileOrigin.MODIFIED){
                // no point in proceeding further, jump to the next file
                continue;
            }
            
            // is this file already associated to a component of some kind?
            if(fileInfo.getFileComponent()==null || fileInfo.getFileComponent().isEmpty()){
                // not associated (yet), mark this negatively
                count3rdPartyNotAssociated++;
            }else{
                // a good file, score positive points
                count3rdPartyAssociated++;
            }
        }
        
        // do the math related to 3rd party reporting
        final int sum3rdPartyAssociations = count3rdPartyAssociated
                + count3rdPartyNotAssociated;
        // calculate the scoring
        score3rdPartyAssociated = (count3rdPartyAssociated 
                * maxPointsFor3rdPartyAssociation)
                / sum3rdPartyAssociations;
    }

    /**
     * Verify if the source code was scanned against a similarity
     * knowledge base to prove its originality (or not).
     */
    private void step4_EvaluateCodeOriginality() {
       scoreOriginalityTest = 0; 
    }
    
}