/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-05-12T10:13:05Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: FileInfo.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Stores the relevant informations about files contained
 * inside an SPDX document.</text> 
 */

package spdxlib;

import license.LicenseType;
import spdxlib.swing.TreeNodeSPDX;
import java.io.File;
import java.util.ArrayList;
import main.engine;
import FileExtension.FileExtension;
import definitions.is;
import spdxlib.swing.TreeviewUtils;
import tokenizator.BinaryFile;


/**
 *
 * @author Nuno Brito, 10th of April 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class FileInfo {
    // file name declared
    private String fileName;
    private String filePath;    // the path portion without the file name
    private String name;        // the name portion of the file without the path
    private String extension;   // the extension portion path nor name
    
    // source, archive, binary or unknown?
    private FileType fileType;          // official SPDX types of files
    private FileCategory fileCategory;  // our own categories for files
    private FileOrigin fileOrigin = FileOrigin.UNKNOWN;
    private FileExtension fileExtensionObject;
    private String fileComponent;       // to which component this file belongs?
    
    // in which line of the text file is this file placed?
    private int linePosition;
    private int fileExtensionIndex = -1;
    
    // checksums
    private String tagFileChecksumSHA1;
    private String tagFileChecksumSHA256;
    private String tagFileChecksumMD5;
    private String tagFileChecksumTLSH;
    
    // how many lines of code has this file? (when applicable)
    private int fileLOC = 0;
    
    // what is the size of this file?
    private long fileSize = 0;
    
    // what are the licenses present on this file?
    private final ArrayList<LicenseType> licenseInfoInFile = new ArrayList();
    private String licenseInfoInFileSummary = "";
    private boolean licenseInfoInFileAvailable = false;
    private int licenseInfoInFileCounter = 0;
     
    // was a license concluded for this file?
    private LicenseType licenseConcluded;
    private boolean licenseConcludedAvailable = false;
    
    // was copyright text found for this file?
    private String fileCopyrightText;
    private boolean hasCopyrightDeclared = false;
    
    // to which SPDX object is this file related?
    private final SPDXfile spdx;
    
    
    // the node that will be displayed on the treeview
    private TreeNodeSPDX node;
    private String toString; // we add use this for the node label
    
    
    // portion related to file matching and code originality
    private final ArrayList<BinaryFile> matchesBinary = new ArrayList();
    
    
    public FileInfo(final SPDXfile spdx){
        this.spdx = spdx;
    }
    
    // setters and getters
    public void setFileName(final String fileName) {
        this.fileName = fileName;
        computeFileNamePortions();
    }
    public FileType getFileType() {
        return fileType;
    }
    public void setFileType(final FileType fileType) {
        this.fileType = fileType;
    }

    public int getLinePosition() {
        return linePosition;
    }

    public void setLinePosition(final int linePosition) {
        this.linePosition = linePosition;
    }

    public String getTagFileChecksumSHA1() {
        return tagFileChecksumSHA1;
    }

    public void setTagFileChecksumSHA1(final String tagFileChecksumSHA1) {
        this.tagFileChecksumSHA1 = tagFileChecksumSHA1;
    }

    public String getTagFileChecksumMD5() {
        return tagFileChecksumMD5;
    }

    public void setTagFileChecksumMD5(final String tagFileChecksumMD5) {
        this.tagFileChecksumMD5 = tagFileChecksumMD5;
    }

    public String getTagFileChecksumSHA256() {
        return tagFileChecksumSHA256;
    }

    public void setTagFileChecksumSHA256(final String tagFileChecksumSHA256) {
        this.tagFileChecksumSHA256 = tagFileChecksumSHA256;
    }

    public String getTagFileChecksumTLSH() {
        return tagFileChecksumTLSH;
    }

    public void setTagFileChecksumTLSH(final String tagFileChecksumTLSH) {
        this.tagFileChecksumTLSH = tagFileChecksumTLSH;
    }

    public int getFileLOC() {
        return fileLOC;
    }

    public void setFileLOC(final int fileLOC) {
        this.fileLOC = fileLOC;
    }

    public long getFileSize() {
        return fileSize;
    }
    
    public void setFileSize(final long fileSize) {
        this.fileSize = fileSize;
    }

    public final ArrayList<LicenseType> getLicenseInfoInFile() {
        return licenseInfoInFile;
    }

    public void addLicenseInfoInFile(final LicenseType licenseInfoInFileSingle) {
        // add this license to the summary
        if(this.licenseInfoInFile.isEmpty()){
            licenseInfoInFileSummary 
                    = licenseInfoInFileSummary.concat(licenseInfoInFileSingle.toId());
        }else{
            // for the case when exists more than a single license
            licenseInfoInFileSummary 
                    = licenseInfoInFileSummary.concat(", " + licenseInfoInFileSingle.toId());
        }
        // add it up
        licenseInfoInFile.add(licenseInfoInFileSingle);
        licenseInfoInFileCounter++;
        // do the summary of licenses + name if no license was yet concluded
        if(licenseConcludedAvailable == false){
            toString = getName() + " (" + licenseInfoInFileSummary + ")";
        }
        licenseInfoInFileAvailable = true;
    }

    public String getFileCopyrightText() {
        return fileCopyrightText;
    }

    public void setFileCopyrightText(final String fileCopyrightText) {
        this.fileCopyrightText = fileCopyrightText;
        hasCopyrightDeclared = true;
    }

    public boolean hasCopyrightDeclared() {
        return hasCopyrightDeclared;
    }

    public FileOrigin getFileOrigin() {
        return fileOrigin;
    }

    public void setFileOrigin(FileOrigin fileOrigin) {
        this.fileOrigin = fileOrigin;
    }
    
    public void setFileComponent(String componentName) {
        this.fileComponent = componentName;
    }

    public String getFileComponent() {
        return fileComponent;
    }
    
    public LicenseType getLicenseConcluded() {
        return licenseConcluded;
    }

    public void setLicenseConcluded(LicenseType licenseConcluded) {
        this.licenseConcluded = licenseConcluded;
        licenseConcludedAvailable = true;
        toString = getName() + " (" + licenseConcluded.toId() + ")";
    }
    
    /**
     * Has this file a license concluded?
     * @return true if a license was defined for this file object
     */
    public boolean hasLicenseConcluded() {
        return licenseConcludedAvailable;
    }
    
    /**
     * Has this file a license concluded?
     * @return true if a license was defined for this file object
     */
    public boolean hasLicenseInfoInFile() {
        return licenseInfoInFileAvailable;
    }
    
    /**
     * Returns the file name with the path part
     * @return the file name of this object
     */
    public String getFileName(){
        // get the name in un-processed state (still with slashes)
        String result = fileName;
        // all done
        return result;
    }
 
    /**
     * Returns the file name without the path part
     * @return the file name of this object
     */
    public String getName(){
        return name;
    }

    public String getExtension() {
        return extension;
    }
    
    /**
     * This method returns a more advanced type of file category than FileType
     * @return 
     */
    public FileCategory getFileCategory() {
        return fileCategory;
    }

    public int getLicenseInfoInFileCounter() {
        return licenseInfoInFileCounter;
    }
    
    /**
     * Returns the path portion from a given FileInfo object
     * @return  The path portion of the file (no file name included)
     */
    public String getFilePath(){
        return filePath;
    }
    
   
    /**
     * Calculate the UID for this item
     * @return          The UID to find this item inside a tree view
     */
    public String getUID() {
        return node.getUID();
    }

    /**
     * If the SPDX was generated on the local machine, we can get a pointer
     * to the real file on disk. This method attempts to retrieve that file.
     * @param spdx  The SPDX object where the file was indexed
     * @return      The pointer to a file on disk if found or null if not found.
     */
    public File getFile(SPDXfile spdx){
        // get our target file
        File targetFile = new File(spdx.getSourceFolder(), fileName);
        // doesn't exist? No need to continue
        if(targetFile.exists() == false){
            System.err.println("FI363, getFileName(): Didn't found: " + targetFile.getAbsolutePath());
            return null;
        }
        // all done
        return targetFile;
    }

     /**
     * What is the extension of this file?
     * @return the extension object with more info about this specific filetype
     */
    public FileExtension getExtensionObject(){
        return fileExtensionObject;
    }
   
    public SPDXfile getSPDX() {
        return spdx;
   }

    /**
     * This method should only be called when the FileName is modified. It's
     * goal is place on a single location the calculations needed for splitting
     * the differents portions of a filename as used by SPDX
     */
    private void computeFileNamePortions(){
        // there is a path available, let's get it
        final int index = fileName.lastIndexOf("/");
        filePath = fileName.substring(0, index);
        name = fileName.substring(index + 1);
        // set the initial value for toString()
        toString = name;
        // get the extension
        final int lastDot = name.lastIndexOf(".");
        extension = name.substring(lastDot+1).toLowerCase();
        fileExtensionIndex = engine.extensions.getIndex(extension);
        // add the file extension object
        if(fileExtensionIndex != -1){
            fileExtensionObject = engine.extensions.get(fileExtensionIndex);
        }else{
            fileExtensionObject = engine.extensions.getUnknownExtension();
        }        
    }
    
    /**
     * Create the node to be placed on the treeview
     * @param nodeFiles     The root node from where all files are found
     */
    void computeNode(final TreeNodeSPDX nodeFiles) {
        final String thisFileName = fileName;
        node = TreeviewUtils.mkdirNodes(nodeFiles, thisFileName);
        node.setUserObject(this);
        // in the process, we also define the file Category
//        fileCategory = this.getExtensionObject().getCategory();
    }

    public TreeNodeSPDX getNode() {
        return node;
    }
     
    
   
    /**
     * If the report was created on this machine, it might be possible to
     * be able of finding this file on its original location.
     * @return 
     */
    public File getFile(){
        // what is the relative path?
        final String relativePath = getFileName();
        // get our target file
        final File targetFile = new File(spdx.getSourceFolder(), relativePath);
        System.out.println("123-->" + targetFile.getAbsolutePath());
        System.out.println("124-->" + relativePath);
        // doesn't exist? No need to continue
        if(targetFile.exists() == false){
            System.err.println("FI385, getFile(): Didn't found: " + targetFile.getAbsolutePath());
            return null;
        }
        System.err.println("FI388 - GetFile: " + targetFile.getAbsolutePath());
        // all done
        return targetFile;
    }
        
    /**
     * This is a handy method that reflects how the node should be converted 
     * to a string format. In this specific case, we want to show the name
     * plus the applicable license when available.
     * @return  The name of the node plus applicable licenses.
     */
    @Override
    public String toString(){
        return toString;
    }

    public String getLicenseInfoInFileSummary() {
        return licenseInfoInFileSummary;
    }

    /**
     * We have a group of files somewhere else that match with this one
     * @param matches 
     */
    public void addBinaryMatches(ArrayList<BinaryFile> matches) {
        matchesBinary.addAll(matches);
    }

    /**
     * Outputs a text string with the contents of this FileInfo object that
     * can be written to an SPDX 1.x document
     * @return 
     */
    public String toSPDX() {
        // handles the case of the license being null
        String licenseConcludedText;
        if(getLicenseConcluded() == null){
            licenseConcludedText = "";
        }else{
            licenseConcludedText = getLicenseConcluded().toId();
        }
        
        StringBuilder output = new StringBuilder();
        output.append(addText(is.tagFileName + " ", getFileName()));
        output.append(addText(is.tagFileType + " ", getFileType().toString()));
        output.append(addText(is.tagFileChecksum + " " + is.tagFileChecksumSHA1 + " ", getTagFileChecksumSHA1()));
        output.append(addText(is.tagFileChecksum + " " + is.tagFileChecksumSHA256 + " ", getTagFileChecksumSHA256()));
        output.append(addText(is.tagFileChecksum + " " + is.tagFileChecksumMD5 + " ", getTagFileChecksumMD5()));
        output.append(addText(is.tagFileChecksum + " " + is.tagFileChecksumTLSH + " ", getTagFileChecksumTLSH()));
        output.append(getFileSizeTag(getFileSize()));
        output.append(addText(is.tagFileLOC + " ", getFileLOC() + ""));
        
        // add the license references inside this file
        for(LicenseType licenseType : licenseInfoInFile){
            output.append(addText(is.tagLicenseInfoInFile + " ", licenseType.toId()));
        }
        // concluded license
        output.append(addText(is.tagLicenseConcluded + " ", licenseConcludedText));
        // copyright statements
        //TODO we need an array here one day
        output.append(addText(is.tagFileCopyrightText + " ", fileCopyrightText));
        // add the file origin details
        output.append(addText(is.tagFileOrigin + " ", fileOrigin.toString()));
        // add the file origin details
        // TODO: we might have this file belonging to different component layers
        output.append(addText(is.tagFileComponent + " ", fileComponent));
        // add the binary matches
        for(BinaryFile binaryFile : this.matchesBinary){
            output.append(addText(is.tagFileMatchBinary + " ", binaryFile.getReference()));
        }
        
        
        output.append("\n");
        return output.toString();
    }
    
    /**
     * Output a text string related to the size of the file on disk. This
     * string is intended for use within an SPDX entry.
     * @param fileSize
     * @return 
     */
    private String getFileSizeTag(long fileSize){
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
     * Adds a simple line of text with a carriage return at the end
     * @param text the text to be included
     * @return a formatted string ready to be written at an ASCII file
     */
    private String addText(final String key, final String text){
        if(text == null || text.isEmpty()){
            return "";
        }
        return key + text + "\n";
    }
    
}
