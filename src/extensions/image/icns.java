package extensions.image;

import java.io.File;
import FileExtension.FileExtension;
import spdxlib.ContentType;
import spdxlib.FileCategory;
import spdxlib.FileLanguage;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito
 * Created: 2014-12-06T18:03:30Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: icns.java  
 * FileCopyrightText: <text> Copyright (c) 2014, Nuno Brito </text>
 * FileComment: <text> icns file type.
        The ICNS file type is primarily associated with 'Macintosh OS X' by 
        Apple Inc.. ICNS files are icon files for the Macintosh operating 
        systems. They are different from Windows .ICO files in that they act 
        like a container with individual icon resources enclosed within it. 
        ICNS file images are not displayed outside the icon, but are enclosed 
        inside the files as data. 

        Description retrieved from http://filext.com/file-extension/icns
</text> 
 */


/**
 *
 * @file provenance by Nuno Brito
 */
public class icns extends FileExtension{
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
        return true;
    }

    /**
     * A short text explaining what this file type is all about
     * @return 
     */
    @Override
    public String getDescription() {
        return "OSX Icons files"; // file type description
    }
    
    /**
     * We can typically group data structures inside files to a few categories.
     * Albeit not perfect, it does help to sort out files into groups.
     * @return the category generally associated with this file type
     */
    @Override
    public FileCategory getCategory() {
        return FileCategory.IMAGE; // does it group under a category?
    }

    /**
     * Typically, this is the four letter identifier of the file extension.
     * We use everything in lower case to speed the processing performance.
     * @return the unique identifier for this file type
     */
    @Override
    public String getIdentifierShort() {
        return "icns";
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
        return ContentType.BINARY; // is it a binary or text file?
    }
    
}
