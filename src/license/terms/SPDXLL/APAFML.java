package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:55Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: APAFML.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class APAFML extends License{
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
        return "APAFML"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Adobe Postscript AFM License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1985, 1987, 1989, 1990, 1991, 1992, 1993, 1997 Adobe Systems Incor"
        + "porated. All Rights Reserved.\n"
        + "\n"
        + "This file and the 14 PostScript(R) AFM files it accompanies may be used, copied,"
        + " and distributed for any purpose and without charge, with or without modificatio"
        + "n, provided that all copyright notices are retained; that the AFM files are not "
        + "distributed without this file; that all modifications to this file or any of the"
        + " AFM files are prominently noted in the modified file(s); and that this paragrap"
        + "h is not modified. Adobe Systems has no responsibility or obligation to support "
        + "the use of the AFM files.\n"
; // the license text
    }
 
    
}
