package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:57Z
 * LicenseName: AGPL-3.0+
 * FileName: Afmparse.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Afmparse extends License{
   /**
     * Was this license approved by the OSI?
     * @return  True if the license is listed as approved   
     */
    @Override
    public Boolean approvedOSI(){
        return false; // was this license OSI approved or not?
    }
    
    /**
     * The SPDX identifier
     * @return  The unique identifier for this license
     */
    @Override
    public String getId(){
        return "Afmparse"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Afmparse License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "(C) 1988, 1989 by Adobe Systems Incorporated. All rights reserved.   \n"
        + "\n"
        + "This file may be freely copied and redistributed as long as:  \n"
        + "\n"
        + "     1) This entire notice continues to be included in the file,  \n"
        + "     2) If the file has been modified in any way, a notice of such modification "
        + "is conspicuously indicated.   \n"
        + "\n"
        + "PostScript, Display PostScript,and Adobe are registered trademarks of Adobe Syst"
        + "ems Incorporated.     \n"
        + "\n"
        + "THE INFORMATION BELOW IS FURNISHED AS IS, IS SUBJECT TO CHANGE WITHOUT NOTICE, A"
        + "ND SHOULD NOT BE CONSTRUED AS A COMMITMENT BY ADOBE SYSTEMS INCORPORATED. ADOBE "
        + "SYSTEMS INCORPORATED ASSUMES NO RESPONSIBILITY OR LIABILITY FOR ANY ERRORS OR IN"
        + "ACCURACIES, MAKES NO WARRANTY OF ANY KIND (EXPRESS, IMPLIED OR STATUTORY) WITH R"
        + "ESPECT TO THIS INFORMATION, AND EXPRESSLY DISCLAIMS ANY AND ALL WARRANTIES OF ME"
        + "RCHANTABILITY, FITNESS FOR PARTICULAR PURPOSES AND NONINFRINGEMENT OF THIRD PART"
        + "Y RIGHTS.  \n"
; // the license text
    }
 
    
}
