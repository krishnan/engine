package extensions.archive;

import java.io.File;
import FileExtension.FileExtension;
import spdxlib.ContentType;
import spdxlib.FileCategory;
import spdxlib.FileLanguage;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito
 * Created: 2014-12-06T21:51:37Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: dmg.java  
 * FileCopyrightText: <text> Copyright (c) 2014, Nuno Brito </text>
 * FileComment: <text> 
    Mountable disk image created in Mac OS X; contains raw block data typically
    compressed and sometimes encrypted; commonly used for Mac OS software 
    installers that are downloaded from the Internet; mounts a virtual disk on
    the desktop when opened.

    The DMG format replaces the older .IMG file format used in Mac OS Classic.
    DMG disk images can be opened using the Apple Disk Utility that is bundled
    with Mac OS X on Apple computers.

    Retrieved from http://www.fileinfo.com/extension/dmg
</text> 
 */


/**
 *
 * @file provenance by Nuno Brito
 */
public class dmg extends FileExtension{
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
        return "MacOSX archive file"; // file type description
    }
    
    /**
     * We can typically group data structures inside files to a few categories.
     * Albeit not perfect, it does help to sort out files into groups.
     * @return the category generally associated with this file type
     */
    @Override
    public FileCategory getCategory() {
        return FileCategory.ARCHIVE; // does it group under a category?
    }

    /**
     * Typically, this is the three letter identifier of the file extension.
     * We use everything in lower case to speed the processing performance.
     * @return the unique identifier for this file type
     */
    @Override
    public String getIdentifierShort() {
        return "dmg";
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
