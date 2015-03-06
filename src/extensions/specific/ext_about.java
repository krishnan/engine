package extensions.specific;

import java.io.File;
import FileExtension.FileExtension;
import spdxlib.ContentType;
import spdxlib.FileCategory;
import spdxlib.FileLanguage;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito
 * Created: 2014-12-02T23:40:52Z
 * LicenseName: AGPL-3.0+
 * FileName: about.java  
 * FileCopyrightText: <text> Copyright (c) 2014, Nuno Brito </text>
 * FileComment: <text> "about" file type. </text> 
 */


/**
 *
 * @file provenance by Nuno Brito
 */
public class ext_about extends FileExtension{
    
    final String 
        rubyDescription = "A shell script used by Ruby",
        textDescription = "A document with details about a software package";    
    
    // which version to use by default?
    String defaultDescription = textDescription;
    // default category?
    FileCategory defaultCategory = FileCategory.DOCUMENT;
    
    /**
     * How can we confirm that this file extension is applicable to this file?
     * This method analyses the binary contents of a file to get the answer.
     * @param binaryFile the pointer to a file on disk
     * @return True if file matches the data structure reported by the extension
     */
    @Override
    public Boolean isApplicable(File binaryFile) {
        return true;
    }
  
    /**
     * How can we confirm that this file extension is applicable to this file?
     * This method analyses the text of a file to get the answer. You can either
     * specify a file or the text. The advantage of using this method is that
     * you will not need to read the text from the file for each extension test.
     * This brings significant performance improvements when analyzing
     * thousands of files.
     * @param textFile The content of a text file
     * @return True if file matches the data structure reported by the extension
     */
    @Override
    public Boolean isApplicable(String textFile) {
        
        // is this one of ruby build files as seen in the past?
        if(textFile.contains("#!/usr/bin/env ruby")){
            // change to ruby mode
            defaultDescription = rubyDescription;
            defaultCategory = FileCategory.SCRIPT;
        }
        
        return true;
    }

    /**
     * A short text explaining what this file type is all about
     * @return 
     */
    @Override
    public String getDescription() {
        return defaultDescription; // file type description
    }
    
    /**
     * We can typically group data structures inside files to a few categories.
     * Albeit not perfect, it does help to sort out files into groups.
     * @return the category generally associated with this file type
     */
    @Override
    public FileCategory getCategory() {
        return defaultCategory; // does it group under a category?
    }

    /**
     * Typically, this is the three letter identifier of the file extension.
     * We use everything in lower case to speed the processing performance.
     * @return the unique identifier for this file type
     */
    @Override
    public String getIdentifierShort() {
        return "about";
    }
    
    /**
     * To which kind of language does this file relates the most?
     * @return 
     */
    @Override
    public FileLanguage getLanguage(){
        return FileLanguage.UNSORTED; // to which language is the file more related?
    }

    /**
     * Returns information is this file has a binary or text based structure.
     * This is later used by the "isApplicable()" methods to speed up the
     * processing of each file
     * @return the type of content expected inside the file
     */
    @Override
    public ContentType getContentType() {
        return ContentType.TEXT; // is it a binary or text file?
    }
    
}
