package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:55Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Adobe_Glyph.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Adobe_Glyph extends License{
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
        return "Adobe-Glyph"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Adobe Glyph List License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1997,1998,2002,2007 Adobe Systems Incorporated \n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person obtaining a copy of "
        + "this documentation file to use, copy, publish, distribute, sublicense, and/or se"
        + "ll copies of the documentation, and to permit others to do the same, provided th"
        + "at: \n"
        + "     - No modification, editing or other alteration of this document is allowed;"
        + " and \n"
        + "     - The above copyright notice and this permission notice shall be included i"
        + "n all copies of the documentation. \n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person obtaining a copy of "
        + "this documentation file, to create their own derivative works from the content o"
        + "f this document to use, copy, publish, distribute, sublicense, and/or sell the d"
        + "erivative works, and to permit others to do the same, provided that the derived "
        + "work is not represented as being a copy or version of this document. \n"
        + "\n"
        + "Adobe shall not be liable to any party for any loss of revenue or profit or for "
        + "indirect, incidental, special, consequential, or other similar damages, whether "
        + "based on tort (including without limitation negligence or strict liability), con"
        + "tract or other legal or equitable grounds even if Adobe has been advised or had "
        + "reason to know of the possibility of such damages.Ê The Adobe materials are prov"
        + "ided on an \"AS IS\" basis.Ê Adobe specifically disclaims all express, statutory, "
        + "or implied warranties relating to the Adobe materials, including but not limited"
        + " to those concerning merchantability or fitness for a particular purpose or non-"
        + "infringement of any third party rights regarding the Adobe materials. \n"
; // the license text
    }
 
    
}
