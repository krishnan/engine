package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:42Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: XSkat.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class XSkat extends License{
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
        return "XSkat"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "XSkat License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This program is free software; you can redistribute it freely.\n"
        + "Use it at your own risk; there is NO WARRANTY.\n"
        + "\n"
        + "Redistribution of modified versions is permitted provided that the following con"
        + "ditions are met:\n"
        + "\n"
        + "1. All copyright & permission notices are preserved.\n"
        + "\n"
        + "2.a) Only changes required for packaging or porting are made.\n"
        + "     or\n"
        + "2.b) It is clearly stated who last changed the program. The program is renamed o"
        + "r the version number is of the form x.y.z, where x.y is the version of the origi"
        + "nal program and z is an arbitrary suffix.\n"
; // the license text
    }
 
    
}
