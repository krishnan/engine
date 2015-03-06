package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:26Z
 * LicenseName: AGPL-3.0+
 * FileName: ANTLR_PD.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class ANTLR_PD extends License{
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
        return "ANTLR-PD"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "ANTLR Software Rights Notice"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "ANTLR 2 License\n"
        + "\n"
        + "We reserve no legal rights to the ANTLR--it is fully in the public domain. An in"
        + "dividual or company may do whatever they wish with source code distributed with "
        + "ANTLR or the code generated by ANTLR, including the incorporation of ANTLR, or i"
        + "ts output, into commerical software.\n"
        + "\n"
        + "We encourage users to develop software with ANTLR. However, we do ask that credi"
        + "t is given to us for developing ANTLR. By \"credit\", we mean that if you use ANTL"
        + "R or incorporate any source code into one of your programs (commercial product, "
        + "research project, or otherwise) that you acknowledge this fact somewhere in the "
        + "documentation, research report, etc... If you like ANTLR and have developed a ni"
        + "ce tool with the output, please mention that you developed it using ANTLR. In ad"
        + "dition, we ask that the headers remain intact in our source code. As long as the"
        + "se guidelines are kept, we expect to continue enhancing this system and expect t"
        + "o make other tools available as they are completed.\n"
; // the license text
    }
 
    
}
