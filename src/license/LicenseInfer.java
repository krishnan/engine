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

package license;

import definitions.is;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import main.engine;
import script.log;
import utils.hashing.TLSH;


/**
 *
 * @author Nuno Brito, 20th of November 2014 in Paris, France
 */
public class LicenseInfer {
    
    // options that we can change
    final int maxMatches = 10;
    
    // variables that we should not change
    // where the licenses are declared
    private final String licenseFilename = "license";
    // where the source code files are located
    private File sourceCodeFolder;
    
    private int
            // what we accept as minimum
            tlshMatch = 200,
            // the current high-score
            levenMatch = 80
            ;
    // the up-to-date license that was found
    private License license;
    
    // where we keep nice matches
    final ArrayList<License> licenseFinalist = new ArrayList();
    
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
            
            // use a specific regular expression to detect license combinations
            Pattern pattern = Pattern.compile("(\\b[\\w]+-|)licen(c|s)e(.|)+");
            Matcher matcher = pattern.matcher(fileName);
            
            /*
            This regular expression should work for these combinations:
                LICENSE
                MIT-LICENSE
                LICENSE-MIT
                LICENCE-APACHE
                APACHE-LICENSE
                MIT-LICENSE.txt
                MIT-LICENSE.md
                LICENSE-MIT.txt
            */
            if(matcher.matches()==false){
                continue;
            }
          
            // we have a match, process the file
            processLicense(file);
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
        
        if(engine.licenses == null){
            engine.licenses = new LicenseControl();
        }
        processLicenseWithCache(file);
    }
    
    

    /**
     * Use the license control object with the cached licenses to speed-up
     * processing of this value.
     * @param file The file with the content we want to discover the license
     */
    private void processLicenseWithCache(final File file) {
        // start by reading the content of this LICENSE file
        final String content = utils.files.readAsString(file);
        
        // compute the TLSH checksum for this license file
        final TLSH tlshThisLicense = new TLSH();
        tlshThisLicense.update(content);
        tlshThisLicense.finale();
        
        // do the comparison against all licenses in memory
        for(final License thisLicense : engine.licenses.getList()){
                //utils.bytecode.getObject(file);
            if(thisLicense == null || thisLicense.getId().isEmpty()){
                continue;
            }
            // compare the content against this specific license
            licenseCompare(content, tlshThisLicense, thisLicense);
        }
        
        // compare between what we have on our queue to find a match
        for(License thisLicense : licenseFinalist){
            final int levenValue = utils.hashing.similarity
                    .levenshteinPercentage(content, thisLicense.getTerms());
            
            if(levenValue > levenMatch){
                // mark the license and keep moving
                levenMatch = levenValue;
                license = thisLicense;
            }
        }
    } 
    
    /**
     * How similar is this license compared against a given content?
     * @param content   The thing we want to compare
     * @param license   The license on our database
     */
    private void licenseCompare(final String foundContent, 
            final TLSH content, final License thisLicense) {
        // get the license contents in lower case
        final String contentThisLicense = thisLicense.getTerms();
        // compute the TLSH checksum for this license file
        final TLSH tlshLicense = new TLSH();
        tlshLicense.update(contentThisLicense);
        tlshLicense.finale();
        final int value = tlshLicense.totalDiff(content, false);
       
         // do we have a high-probability match?
        if(value <= tlshMatch){
            tlshMatch = value;
            // add the new license to our list
            licenseFinalist.add(0, thisLicense);
        }else
        // not the best match, but still worth to consider on the final round
        if(value <= tlshMatch + 50 && licenseFinalist.size() > 0){
            licenseFinalist.add(1, thisLicense);
        }
               
        // trim the list size
        if(licenseFinalist.size() > maxMatches){
            licenseFinalist.remove(licenseFinalist.size()-1);
        }
    }
   
    public License getLicense() {
        return license;
    }

    public int getMatchValue() {
        return levenMatch;
    }

    /**
     * Did we had success in inferring a license?
     * @return True if a license was found, false otherwise
     */
    public boolean isValid(){
        return license != null;
    }
    
    public static void main(String[] args){
        final String location = "../../source/corefx-master-2014-11-15/";
        File folder = new File(location);
        LicenseInfer infer = new LicenseInfer(folder);
        
        if(infer.getLicense() != null){
            System.out.println("Found: " + infer.getMatchValue() 
                    + "%: " + infer.getLicense().getId());
        }
    }

   

}
