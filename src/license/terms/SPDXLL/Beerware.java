package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:08Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Beerware.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Beerware extends License{
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
        return "Beerware"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Beerware License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "\"THE BEER-WARE LICENSE\" (Revision 42):  <phk@FreeBSD.ORG> wrote this file. As lo"
        + "ng as you retain this notice you  can do whatever you want with this stuff. If w"
        + "e meet some day, and you think  this stuff is worth it, you can buy me a beer in"
        + " return Poul-Henning Kamp\n"
; // the license text
    }
 
    
}
