package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:42Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Latex2e.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Latex2e extends License{
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
        return "Latex2e"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Latex2e License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (C) 2007, 2008, 2009, 2010 Karl Berry.\n"
        + "Copyright (C) 1988, 1994, 2007 Stephen Gilmore.\n"
        + "Copyright (C) 1994, 1995, 1996 Torsten Martinsen.\n"
        + "     \n"
        + "Permission is granted to make and distribute verbatim copies of this manual prov"
        + "ided the copyright notice and this permission notice are preserved on all copies"
        + ".\n"
        + "     \n"
        + "Permission is granted to copy and distribute modified versions of this manual un"
        + "der the conditions for verbatim copying, provided that the entire resulting deri"
        + "ved work is distributed under the terms of a permission notice identical to this"
        + " one.\n"
        + "     \n"
        + "Permission is granted to copy and distribute translations of this manual into an"
        + "other language, under the above conditions for modified versions.\n"
; // the license text
    }
 
    
}
