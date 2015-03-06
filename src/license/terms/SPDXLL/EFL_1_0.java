package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:03Z
 * LicenseName: AGPL-3.0+
 * FileName: EFL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class EFL_1_0 extends License{
   /**
     * Was this license approved by the OSI?
     * @return  True if the license is listed as approved   
     */
    @Override
    public Boolean approvedOSI(){
        return true; // was this license OSI approved or not?
    }
    
    /**
     * The SPDX identifier
     * @return  The unique identifier for this license
     */
    @Override
    public String getId(){
        return "EFL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Eiffel Forum License v1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Eiffel Forum License, version 1\n"
        + "\n"
        + "Permission is hereby granted to use, copy, modify and/or distribute this package"
        + ", provided that:\n"
        + "\n"
        + "     - copyright notices are retained unchanged\n"
        + "\n"
        + "     - any distribution of this package, whether modified or not, includes this "
        + "file\n"
        + "\n"
        + "Permission is hereby also granted to distribute binary programs which depend on "
        + "this package, provided that:\n"
        + "\n"
        + "     - if the binary program depends on a modified version of this package, you "
        + "must publicly release the modified version of this package\n"
        + "\n"
        + "THIS PACKAGE IS PROVIDED \"AS IS\" AND WITHOUT WARRANTY. ANY EXPRESS OR IMPLIED WA"
        + "RRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILI"
        + "TY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AU"
        + "THORS BE LIABLE TO ANY PARTY FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEM"
        + "PLARY, OR CONSEQUENTIAL DAMAGES ARISING IN ANY WAY OUT OF THE USE OF THIS PACKAG"
        + "E.\n"
; // the license text
    }
 
    
}
