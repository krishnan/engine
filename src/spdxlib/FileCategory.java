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
import main.engine;

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
            case TEXT: return engine.iconTEXT;
            case SOURCE: return engine.iconSOURCE;
            case DOCUMENT: return engine.iconDOCUMENT;
            case INTERNET: return engine.iconINTERNET;
            case SCRIPT: return engine.iconSCRIPT;
            case SCHEMA: return engine.iconSCHEMA;
            case CONFIG: return engine.iconCONFIG;
            case VERSIONING: return engine.iconVERSIONING;
            case EXECUTABLE: return engine.iconEXECUTABLE;
            case FONT: return engine.iconFONT;
            case ARCHIVE: return engine.iconARCHIVE;
            case BINARY: return engine.iconBINARY;
            case DATABASE: return engine.iconDATABASE;
            case IMAGE: return engine.iconIMAGE;
            case VIDEO: return engine.iconVIDEO;
            case SOUND: return engine.iconSOUND;
            case MUSIC: return engine.iconMUSIC;
            case OTHER: return engine.iconOTHER;
            case TEMP: return engine.iconTEMP;
            default: return engine.iconUNKNOWN;
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
