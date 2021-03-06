/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-11-15T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: FileExtension.java  
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> This class defines an extension and how it can be
 *  verified accurately as a file of this extension</text>
 * 
 * Handy link to find the MIME descriptions:
 * https://gist.github.com/luislobo/6127027
 */

package FileExtension;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import spdxlib.ContentType;
import spdxlib.FileCategory;
import spdxlib.FileLanguage;
import utils.www.html;


/**
 *
 * @author Nuno Brito, 15th of November 2013 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class FileExtension {

    String infoDataURL;
    
    // this is used this extension applies to multiple languages simultaneously
    protected ArrayList<FileLanguage> languages = new ArrayList();
    
    
    // binary or text file?
    public ContentType getContentType(){
        return null;
    }
    // Category type? Source? executable? config?
    public FileCategory getCategory(){
        return null;
    }
    // To which kind of language does this file relates the most?
    public FileLanguage getLanguage(){
        return FileLanguage.UNSORTED;
    }
    // checks if the given file contains the magic signature bytes
    public Boolean isApplicable(File binaryFile){
        return true;
    }
    // checks if the content of this text file apply to a given file type
    public Boolean isApplicable(String textFile){
        return true;
    }
    // one-line description about this file type
    public String getDescription(){
        return null;
    }
    // are we collecting the information from somewhere?
    public String getDescriptionURL(){
        return null;
    }
    // are we collecting the information from someone else?
    public String getDescriptionCredits(){
        return null;
    }
    
    // short identifier
    public String getIdentifierShort(){
        return null;
    }
    
    // short identifier
    public String getIdentifierLong(){
        return null;
    }
    
    // who owns this file?
    public String getCopyright(){
        return null;
    }
    // version information?
    public String getVersion(){
        return null;
    }
   // MIME type?
    public String getMIME(){
        return null;
    }
    
    // how old is the oldest file that we have found of this kind?
    public Date earliestKnownRecord(){
        return null;
    }
    
    
    // how can we write a comment for this kind of file?
    public String writeComment(){
        return null;
    }

    public ArrayList<FileLanguage> getLanguages() {
        return languages;
    }

    /**
     * This method takes a file as parameter and outputs the most suited
     * visualization of its content to a web page.
     * @param targetFile    the file on disk
     * @return              an HTML code ready for displaing the content
     */
    public String format(File targetFile) {
        
        // what kind of file do we have here?
        FileCategory category = getCategory();
        
        // source code of some kind?
//        if((category == FileCategory.SOURCE)
//                ||(category == FileCategory.SCRIPT)
//                && (targetFile.length() < 1000)){
//            // read the contents of this file
//            String result = utils.files.readAsString(targetFile);
//
//            return utils.code.convertToHTML(result);
//        }
        
//        // if this is a compressed file of some kind, no need to bother
//        if(category == FileCategory.SCHEMA 
//                ||category == FileCategory.INTERNET){
//            String result = utils.files.readAsString(targetFile);
//            // We don't what we have here, but display it anyways
//            String tag = "pre";
//            //result = result.replace("\n", "\n" + html.br);
//            result = "<pre>" + result + "</pre>";
//            result = html.div() + result + html._div;
//            return result;
//        }
        
        // if this is a compressed file of some kind, no need to bother
        if(category == FileCategory.ARCHIVE){
            return "";
        }
        
        
        // if this is an image, show it as HTML code
        if(category == FileCategory.IMAGE){
            String iconPath = "file:///" 
                    + targetFile.getAbsolutePath().replace("\\", "/");
            return  "<img align=\"middle;\" hspace=\"3\" src=\""
                    + iconPath
                    + "\"> ";
        }
        
        String result = utils.files.readAsString(targetFile);
        result = "<pre>" + result + "</pre>";
        result = html.div() + result + html._div;
        // We don't what we have here, but display it anyways
        return result;
    }
    
    
}

