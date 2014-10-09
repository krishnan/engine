/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-08-29T00:00:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: FileCategory.java  
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Declare the established types of files </text> 
 */
package spdxlib;

import javax.swing.Icon;
import main.coreSPDX;

public enum FileCategory{
    TEXT,
    SOURCE,
    DOCUMENT,
    INTERNET,
    SCRIPT,
    SCHEMA,
    CONFIG,
    VERSIONING,
    EXECUTABLE,
    FONT,
    ARCHIVE,
    BINARY,
    DATABASE,
    IMAGE,
    VIDEO,
    SOUND,
    MUSIC,
    OTHER,
    TEMP,
    UNKNOWN;
    
    
    /**
     * Based on the name of the category, get the associated icon
     * @return 
     */
    public Icon toIcon() {
        switch(this){
            case TEXT: return coreSPDX.iconTEXT;
            case SOURCE: return coreSPDX.iconSOURCE;
            case DOCUMENT: return coreSPDX.iconDOCUMENT;
            case INTERNET: return coreSPDX.iconINTERNET;
            case SCRIPT: return coreSPDX.iconSCRIPT;
            case SCHEMA: return coreSPDX.iconSCHEMA;
            case CONFIG: return coreSPDX.iconCONFIG;
            case VERSIONING: return coreSPDX.iconVERSIONING;
            case EXECUTABLE: return coreSPDX.iconEXECUTABLE;
            case FONT: return coreSPDX.iconFONT;
            case ARCHIVE: return coreSPDX.iconARCHIVE;
            case BINARY: return coreSPDX.iconBINARY;
            case DATABASE: return coreSPDX.iconDATABASE;
            case IMAGE: return coreSPDX.iconIMAGE;
            case VIDEO: return coreSPDX.iconVIDEO;
            case SOUND: return coreSPDX.iconSOUND;
            case MUSIC: return coreSPDX.iconMUSIC;
            case OTHER: return coreSPDX.iconOTHER;
            case TEMP: return coreSPDX.iconTEMP;
            default: return coreSPDX.iconUNKNOWN;
        }
    }
    
    
    @Override
    public String toString() {
       String result = this.name().toLowerCase();
       
//        result = // just upgrade the first case 
//                Character.toString(result.charAt(0)).toUpperCase()
//                // keep the rest in lower case
//                + result.substring(1);
        return result;
    }
       
        public String toStringCapitalLetter() {
       String result = this.name().toLowerCase();
        result = // just upgrade the first case 
                Character.toString(result.charAt(0)).toUpperCase()
                // keep the rest in lower case
                + result.substring(1);
        return result;
    }
        
}
