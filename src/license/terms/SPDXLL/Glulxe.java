package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:13Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Glulxe.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Glulxe extends License{
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
        return "Glulxe"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Glulxe License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The source code in this package is copyright 1999-2010 by Andrew Plotkin.\n"
        + "\n"
        + "You may copy and distribute it freely, by any means and under any conditions, as"
        + " long as the code and documentation is not changed. You may also incorporate thi"
        + "s code into your own program and distribute that, or modify this code and use an"
        + "d distribute the modified version, as long as you retain a notice in your progra"
        + "m or documentation which mentions my name and the URL shown above.\n"
; // the license text
    }
 
    
}
