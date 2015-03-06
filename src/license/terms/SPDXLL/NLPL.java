package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:57Z
 * LicenseName: AGPL-3.0+
 * FileName: NLPL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NLPL extends License{
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
        return "NLPL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "No Limit Public License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "NO LIMIT PUBLIC LICENSE\n"
        + "     Version 0, June 2012\n"
        + "\n"
        + "Gilles LAMIRAL\n"
        + "La Billais\n"
        + "35580 Baulon\n"
        + "France\n"
        + "\n"
        + "NO LIMIT PUBLIC LICENSE\n"
        + "\n"
        + "Terms and conditions for copying, distribution, modification\n"
        + "or anything else.\n"
        + "\n"
        + "     0. No limit to do anything with this work and this license.\n"
; // the license text
    }
 
    
}
