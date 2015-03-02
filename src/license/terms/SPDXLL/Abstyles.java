package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:51Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Abstyles.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Abstyles extends License{
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
        return "Abstyles"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Abstyles License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This is APREAMBL.TEX, version 1.10e, written by Hans-Hermann Bode \n"
        + "(HHBODE@DOSUNI1.BITNET), for the BibTeX `adaptable' family, version 1.10. \n"
        + "See the file APREAMBL.DOC for a detailed documentation.  \n"
        + "\n"
        + "This program is distributed WITHOUT ANY WARRANTY, express or implied.  \n"
        + "\n"
        + "Copyright (C) 1991, 1992 Hans-Hermann Bode  \n"
        + "\n"
        + "Permission is granted to make and distribute verbatim copies of this  document p"
        + "rovided that the copyright notice and this permission notice are preserved on al"
        + "l copies.  \n"
        + "\n"
        + "Permission is granted to copy and distribute modified versions of this document "
        + "under the conditions for verbatim copying, provided that the entire resulting de"
        + "rived work is distributed under the terms of a permission notice identical to th"
        + "is one.\n"
; // the license text
    }
 
    
}
