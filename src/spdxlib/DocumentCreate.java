/*
 * SPDXVersion: SPDX-1.1
 * DocumentCreate: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * DocumentCreate: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-05-14T11:02:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: DocumentCreate.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Creates an SPDX document from a given source </text> 
 */


package spdxlib;

import FileExtension.ExtensionCreate;
import definitions.is;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.engine;
import FileExtension.FileExtension;
import script.Trigger;
import script.log;
import utils.ReadWrite.FileWriteLinesWithBuffer;

/**
 *
 * @author Nuno Brito, 1st of November 2013 in Darmstadt, Germany.
 * nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class DocumentCreate {
    
    // in which folder are our files located?
    File folderSource;
    int folderSourceLength;
    
    // the object for the new SPDX document
    SPDXfile spdx = new SPDXfile();
    
    // are we processing a new document right now?
    private boolean processing = false;

    // how many files have been processed, how many missing?
    private int
            filesProcessed,
            filesTotal;
    
    private File
            outputFile;
    
    // define the name for the SPDX document
    private String
            documentCreator = "",
            packageName = "",
            packageURL = "";
    
    // misc variables
    
    // the generic file writer (where we store the results on disk)
    FileWriteLinesWithBuffer buffer;
    FileInfo tempInfo;
   
    
    public boolean isProcessing() {
        return processing;
    }

    public int getFilesProcessed() {
        return filesProcessed;
    }

    public int getFilesTotal() {
        return filesTotal;
    }

    public File getOutputFile() {
        return outputFile;
    }
    
    
    /**
     * From a given folder on disk, create an SPDX report
     * @param folderToAnalyze   The folder on disk
     * @return  True if the report was created with success, false otherwise
     */ 
    public boolean create(final File folderToAnalyze) {
        String filename = folderToAnalyze.getName() + ".spdx";
        // create the file pointer
        outputFile = new File(engine.getProductsFolder(), filename);
        return create(folderToAnalyze, outputFile);
    }
    /**
     * From a given folder on disk, create an SPDX report
     * @param folderToAnalyze   The folder where files to analyze are located
     * @param resultFile        The file where the SPDX data will be written
     * @return                  true if everything went as planned
     */
    public boolean create(final File folderToAnalyze, final File resultFile) {
        
        try {
            // get rid of dots and shortcuts, we want the real path
            final String canonicalPath = folderToAnalyze.getCanonicalPath();
            // setup the real path
            folderSource = new File(canonicalPath);
        } catch (IOException ex) {
            Logger.getLogger(DocumentCreate.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            // something failed, no problem. We can recover
            folderSource = folderToAnalyze;
        }
        // keep on processing
        folderSourceLength = folderSource.getAbsolutePath().length();
        processing = true;
        // open our file for writing the new information
        try {
            buffer = new FileWriteLinesWithBuffer(resultFile);
            // do the header
            createHeader(folderSource);
            // get down to business
            processFiles(folderSource, 25);
            
        } catch (Exception e){
                System.err.println("Error DC131: Failed to process files");
                e.printStackTrace();
                processing = false;
                return false;
            }
        // all done
        processing = false;
        buffer.close();
        // we are expected to return the pointer to the new report on disk
        return true;
    }

/**
 * Find all files in a given folder and respective subfolders to
 * start indexing them.
 * @param where A file object of the start folder
 * @param maxDeep How deep is the crawl allowed to proceed
 * @throws java.io.IOException
 */
 private void processFiles(File where, int maxDeep) throws Exception{
    File[] files = where.listFiles();
    if(files != null)
        for (File file : files) {
        if (file.isFile())
            processFile(file);
        else
            if ( (file.isDirectory())
                    &&( maxDeep-1 > 0 ) ){
                
                // ignore intentionally the repository folders
                if(isRepositoryFolder(file)){
                    continue;
                }
                
                // do the recursive crawling
                processFiles(file, maxDeep-1);
            }
        }
 }

 /**
  * Avoid the indexing of folders that belong to popular versioning systems
  * @param folder   The folder on disk to evaluate
  * @return True is this is a repository folder, false otherwise
  */
     boolean isRepositoryFolder(final File folder){
         final String folderName = folder.getName();
         if(utils.text.equals(folderName, ".git")){
             return true;
         }else
             if(utils.text.equals(folderName, ".svn")){
                 return true;
         }else
             if(utils.text.equals(folderName, ".hg")){
                 return true;
         }
         // not one of those folders. All good to go.
         return false;
     }
 

 /**
  * Process a given file to extract the information relevant to SPDX
  * @param file     A file on disk
  */
 private void processFile(File file) throws Exception {
     
     final String fileName = "." + file.getAbsolutePath()
             .substring(folderSourceLength).replace("\\", "/");
     
     // create the fileInfo pointer
     tempInfo = new FileInfo(spdx);
     
     // write the file name
     tempInfo.setFileName(fileName);
     final String tagFileName = is.tagFileName.concat(" " + fileName + "\n");

     // what kind of file are we dealing here?
     final FileExtension tagFileExtension = tempInfo.getExtensionObject();
     // process the file type
     final String tagFileType = getFileType(tagFileExtension);
     // now process the checksums
     final String tagChecksum = getChecksums(file);
     // now calculate the metrics
     final String tagSize= getFileSize(file);
     // get the Lines of Code, licensing and copyright information
     final String tagCodeInsight = getCodeInsight(file);
     
     final String result = tagFileName + tagFileType + tagChecksum 
             + tagSize + tagCodeInsight + "\n";
     
     buffer.write(result);
     // increase the counter
     filesProcessed++;
 }

    public SPDXfile getSpdx() {
        return spdx;
    }
    
 
    /**
     * Returns if a given file type is SOURCE, ARCHIVE and OTHER
     * @param fileInfo      The file info to be processed
     * @return              A string ready to be written on the SPDX document
     */
    private String getFileType(final FileExtension tagFileExtension){
        // preflight, when null just output the default value
        if(tagFileExtension == null){
            // when the extension doesn't exist, we can create a template
            // for indexing this kind of extension in the future
            createExtension();
            // save the information into our file object
            tempInfo.setFileType(FileType.OTHER);
            return is.tagFileType.concat(" OTHER\n");
        }
        // get the respective category for this file type
        FileCategory category = tagFileExtension.getCategory();
        // now process accordingly
        switch(category){
            case INTERNET:
            case SCRIPT:
            case SOURCE: 
                tempInfo.setFileType(FileType.SOURCE);
                return is.tagFileType.concat(" SOURCE\n");
            case BINARY:
            case EXECUTABLE: 
                tempInfo.setFileType(FileType.BINARY);
                return is.tagFileType.concat(" BINARY\n");
            case ARCHIVE: 
                tempInfo.setFileType(FileType.ARCHIVE);
                return is.tagFileType.concat(" ARCHIVE\n");
            default: 
                tempInfo.setFileType(FileType.OTHER);
                return is.tagFileType.concat(" OTHER\n");    
        }
    }

    /**
     * This methods gets the most popular checksums available for indexing.
     * At the same time, it will update fileInfo with the relevant data.
     * @param file      A file on disk
     * @return          The text ready to be written on the SPDX document
     */
    private String getChecksums(final File file) throws Exception {
        // compute the checksums
        final ChecksumedFile checksum = new ChecksumedFile(file);
        
        // now save this information into our file info object
        tempInfo.setTagFileChecksumMD5(checksum.MD5);
        tempInfo.setTagFileChecksumSHA1(checksum.SHA1);
        tempInfo.setTagFileChecksumSHA256(checksum.SHA256);
        tempInfo.setTagFileChecksumSSDEEP(checksum.SSDEEP);
        
        // give back the result from the checksum computation
        return checksum.SHA1.concat(checksum.SHA256.concat
            (checksum.MD5).concat(checksum.SSDEEP));
    }

    /**
     * Get the file size text
     * @param file  A file on disk
     * @return      A text ready to include on the SPDX document
     */
    private String getFileSize(File file) {
        // define the file size in human readable format
        final long fileSize = file.length();
        // write this value onto the file info object
        tempInfo.setFileSize(fileSize);
        // get the text for the SPDX tag
        final String tagFileSize = ( fileSize > 1000 ? 
                is.tagFileSize.concat(" ".concat(
                        utils.files.humanReadableSize( fileSize ).concat(
                        " (".concat( fileSize + " bytes)")
                        )
                ))
                :
                is.tagFileSize.concat(" ".concat( fileSize + " bytes")
                )).concat("\n");
        // all done
        return tagFileSize;
    }

    /**
     * This method does the most time-consuming operation of the SPDX creation.
     * We will read the full content of the source code file into memory and
     * then pass the content against the triggers to check if anything is
     * "triggered". In case that happens, we add the output onto the final 
     * result, which might be a license identificator or copyright assignment.
     * In the process, we also provide a Lines Of Code count for text files.
     * @param file  A file on disk
     * @return      A piece of text ready to be inserted inside the SPDX content
     */
    private String getCodeInsight(final File file) {        
        // read this file from disk onto local memory
        final String contentNormalCase = utils.files.readAsString(file);
        final String contentLowerCase = contentNormalCase.toLowerCase();
        String result = "";
        
        // when the file has source code, we count the lines of code
        if(tempInfo.getFileType() == FileType.SOURCE){
            // calculate the lines of code
            final int LOC = getLOC(contentNormalCase);
            // get the tag to be written on the SPDX
            final String fileLOC = is.tagFileLOC.concat(" " + LOC + "\n");
            // save this value to the file info object
            tempInfo.setFileLOC(LOC);
            // get everything together
            result = result.concat(fileLOC);
        }
        
        // when the file is identified as containing text, we'd like to take
        // a look inside and identify its content where possible
//        if(tempInfo.getExtensionObject() != null 
//                && tempInfo.getExtensionObject()
//                        .getContentType() == ContentType.TEXT){
            // try to identify some of the most common triggers
        
        if(file.length() < 15000000){
            for(Trigger thisTrigger: engine.triggers.getList()){
                // does our text contains an applicable trigger?
                if(thisTrigger.isApplicable(contentNormalCase, contentLowerCase)){
                   result = result.concat(thisTrigger.getResult()).concat("\n");
                }
            }
        }else{
            System.err.println("DC368 - File too big for processing: " + file.getAbsolutePath());
        }
        return result;
    }

    /**
     * Given a piece of source code, count the number of lines that are code.
     * On this calculation, comments are included. However, empty lines aren't
     * There exist many different manners
     * @param sourceCodeText
     * @return 
     */
    private int getLOC(String sourceCodeText){
        String[] lines = sourceCodeText.split("\n");
        int LOC = 0;
        // iterate all lines on the text file
        for(String line : lines){
            // skip the empty lines
            if(line.isEmpty()){
                continue;
            }
            // count one line
            LOC++;
        }
        return LOC;
    }
    
    
    /**
     * Creates a new file extension when it was not previously indexed in
     * our records. No parameters are needed, it is supposed to be called
     * during the processing of files. This code is launched on a separate
     * thread to prevent delaying the overall progress
     */
    private void createExtension() {
        Thread thread = new Thread(){
            @Override
            public void run(){
              ExtensionCreate ext = new ExtensionCreate();
              ext.automatically(tempInfo.getExtension(), false);
            }
        };
        thread.start();
    }
    
    
    /**
     * Provides a simple summary of what has been indexed
     */
    public void printSummary(){
    
    }

    /**
     * Writes the header for this SPDX document
     * @param folderSource  The folder from where we get information
     */
    private void createHeader(final File folderSourceCode) {
//            Thread thread = new Thread(){
//            @Override
//            public void run(){
                
        launchCreateHeaderThread(folderSourceCode);
//           }
//       };
//        thread.start();
    }

    /**
     * The thread that creates the header and license inference
     * @param folderSourceCode 
     */
    private void launchCreateHeaderThread(final File folderSourceCode) {
        // let's hold everything in memory until the buffer is written
        //buffer.setHoldInMemory(true);
        // define the package name if still empty at this stage
        if(packageName.isEmpty()){
            packageName = folderSourceCode.getName();
        }
        
        // define the document author if still empty at this stage
        if(documentCreator.isEmpty()){
            // use the name assigned on this system
            documentCreator = System.getProperty("user.name");
        }

        // perhaps this source code folder has some license(s) declared?
        String packageLicenseDeclared = "NOASSERTION";
        // try to infer the license for this source code folder
        log.write(is.INFO, "Detecting declared license for this project, please wait");
        LicenseInfer infer = new LicenseInfer(folderSource);
        // positive results?
        if(infer.isValid()){
            // record the license that was found
            packageLicenseDeclared = infer.getLicense().getId();
        }
        // prepare the header
        final String header =  
                  addParagraph("SPDX Document Information")
                + addText("SPDXVersion: ", "SPDX-1.2")
                + addText("DataLicense: ", "CC-BY-4.0")
                + "\n"
                
                + addParagraph("Creation Information")
                + addText("Creator: ", documentCreator)
                + addText("Creator: Tool: ", "TripleCheck " + engine.version)
                + addText("Created: ", utils.time.getDateSPDX())
                + "\n"
                
                + addParagraph("Package Information")
                + addText("PackageName: ",  packageName)
                + addText("PackageLicenseDeclared: ",  packageLicenseDeclared)
                + addText("PackageDownloadLocation: ", packageURL)
                
                + "\n"
                + addParagraph("File Information")
                ;
        
        // write the header
        // buffer.setHeaderText(header);
        // buffer.setHoldInMemory(false);
        buffer.write(header);
        log.write(is.INFO, "Finished detecting declared license for this project");
    }
    
     /**
     * Provides an ASCII paragraph
     * @param title the header text of the title
     * @return the ASCII text to be included on the final output
     */
    private String addParagraph(String title){
        return    "##-------------------------\n"
                + "## " + title + "\n"
                + "##-------------------------\n"
                ;
    }
    
     /**
     * Adds a simple line of text with a carriage return at the end
     * @param text the text to be included
     * @return a formatted string ready to be written at an ASCII file
     */
    private String addText(final String key, final String text){
        if(text.isEmpty()){
            return "";
        }
        return key + text + "\n";
    }

    
        
    /**
     * Assigns the person who generated the document
     * @param documentCreator   A plain text
     */
    public void setDocumentCreator(final String documentCreator) {
        if(documentCreator == null || documentCreator.isEmpty()){
            return;
        }
        // define the author of the SPDX document
        this.documentCreator = documentCreator;
    }
    
    /**
     * Defines the package name for this SPDX document
     * @param packageName The value to be written. If empty then the value is
     * ignored and no change takes place.
     */
    public void setPackageName(final String packageName) {
        if(packageName == null || packageName.isEmpty()){
            return;
        }
        // define the package name
        this.packageName = packageName;
    }

    public void setPackageURL(final String packageURL) {
        if(packageURL == null || packageURL.isEmpty()){
            return;
        }
        // define the package location on the network (public or private)
        this.packageURL = packageURL;
    }
    
    /**
     *
     * @param params
     */
    public static void main(String[] params){
        
        File folderSource = new File("../../source/7z922//");
        File fileOutput = new File("test/example.spdx");
        
        engine.warmUp();
        
        System.out.println("Creating document: " + fileOutput.getAbsolutePath());
        DocumentCreate create = new DocumentCreate();
        create.create(folderSource, fileOutput);
        
    }
    
}