/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-20T14:28:55Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LicenseInfer.java  
 * FileCopyrightText: <text> Infer the license applicable to a project
    using the license(s) included on the LICENSE file</text> 
 */

package spdxlib;

import definitions.is;
import java.io.File;
import java.util.ArrayList;
import main.engine;
import script.log;
import script.exec;


/**
 *
 * @author Nuno Brito, 20th of November 2014 in Paris, France
 */
public class LicenseInfer {
    
    // where the licenses are declared
    private final String licenseFilename = "license";
    // where the source code files are located
    private File sourceCodeFolder;
    
    // 
    private int
            // what we accept as minimum
            minMatch = 80,
            // the current high-score
            highestSimilar = minMatch
            ;
    // the up-to-date license that was found
    private License license;
    
    
    
    /**
     * Indicate the folder where the source code files are located.
     * @param folder A folder on disk
     */
    public LicenseInfer(final File folder){
        // preflight checks
        if(folder.exists() == false){
            log.write(is.ERROR, "LI31 - Error, folder does not exist: %1",
                    folder.getAbsolutePath());
            return;
        }
        if(folder.isFile()){
            log.write(is.ERROR, "LI37 - Error, mentioned folder is a file: %1",
                    folder.getAbsolutePath());
            return;
        }
        // begin the processing of this folder
        this.sourceCodeFolder = folder;
        processFolder();
    }

    /**
     * Process the files inside the source code folder to find a match with
     * a license declaration
     */
    private void processFolder() {
        // find the files on the root and first folders
        final ArrayList<File> files = utils.files.findFiles(sourceCodeFolder, 2);
        // iterate each file
        for(final File file : files){
            // transform the file name to lower case
            final String fileName = file.getName().toLowerCase();
            
            // first test, matching file names
            if(fileName.equals(licenseFilename)){
                processLicense(file);
                return;
            }
            
            if(fileName.endsWith(licenseFilename + ".md")){
                processLicense(file);
                return;
            }
             
            if(fileName.endsWith(licenseFilename + ".txt")){
                processLicense(file);
                return;
            }
        }
    }
    
    /**
     * This method is called when we have a good match to be a license file.
     * Attention that we ignore on purpose the cases where there might exist
     * several instances of a license file. We need to proceed with a content
     * comparison to discover the applicable license
     * @param file A file on disk with the possible License information
     */
    private void processLicense(final File file) {
        // do we have a license cache enabled?
        if(engine.licenses != null){
            processLicenseWithCache(file);
        }else{
            // otherwise read all files from disk
            processLicenseNoCache(file);
        }
    }
    
    /**
     * Compare two licenses without using a pre-cached version of the licenses
     * that would be available in memory. This method adds up a few seconds
     * to the processing
     * @param file The file with the content we want to discover the license
     */
    private void processLicenseNoCache(final File file) {
        // start by reading the content of this LICENSE file
        final String content = utils.files.readAsString(file).toLowerCase();
        // get the folder where we have our list of licenses to compare against
        final File licensesFolder = engine.getLicensesFolder();
        ArrayList<File> files = utils.files.findFilesFiltered(licensesFolder, ".java", 4);
        // do the comparison against all licenses
        for(final File fileLicense : files){
            License thisLicense = (License) exec.runJava(fileLicense, is.license);
                //utils.bytecode.getObject(file);
            if(thisLicense == null || thisLicense.getId().isEmpty()){
                continue;
            }
            // compare the content against this specific license
            licenseCompare(content, thisLicense);
        }
    }    
    

    /**
     * Use the license control object with the cached licenses to speed-up
     * processing of this value.
     * @param file The file with the content we want to discover the license
     */
    private void processLicenseWithCache(final File file) {
        // start by reading the content of this LICENSE file
        final String content = utils.files.readAsString(file).toLowerCase();
        // do the comparison against all licenses in memory
        for(final License thisLicense : engine.licenses.getList()){
                //utils.bytecode.getObject(file);
            if(thisLicense == null || thisLicense.getId().isEmpty()){
                continue;
            }
            // compare the content against this specific license
            licenseCompare(content, thisLicense);
        }
    } 
    
    /**
     * How similar is this license compared against a given content?
     * @param content   The thing we want to compare
     * @param license   The license on our database
     */
    private void licenseCompare(final String content, final License thisLicense) {
        // get the license contents in lower case
        final String contentLicense = thisLicense.getTerms().toLowerCase();
        // do the comparison
        final int value = utils.similarity.levenshteinPercentage(content, contentLicense);

        // do we have a high-probability match?
        if(value > highestSimilar){
            // mark the license and keep moving
            highestSimilar = value;
            license = thisLicense;
        }
    }
    
    public static void main(String[] args){
        final String location = "/mnt/06B6C215B6C20561/core/code/source/corefx-master-2014-11-15/";
        File folder = new File(location);
        LicenseInfer infer = new LicenseInfer(folder);
        
        if(infer.getLicense() != null){
            System.out.println("Found: " + infer.getMatchValue() 
                    + "%: " + infer.getLicense().getId());
        }
    }

    public License getLicense() {
        return license;
    }

    public int getMatchValue() {
        return highestSimilar;
    }

    /**
     * Did we had success in inferring a license?
     * @return True if a license was found, false otherwise
     */
    public boolean isValid(){
        return license != null;
    }
    

}
