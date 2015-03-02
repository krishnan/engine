package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:57Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Newsletr.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Newsletr extends License{
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
        return "Newsletr"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Newsletr License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright 1989--2004 by Hunter Goatley.   \n"
        + "\n"
        + "Permission is granted to anyone to use this software for any purpose  on any com"
        + "puter system, and to redistribute it freely, subject to the  following restricti"
        + "ons:   \n"
        + "\n"
        + "1. This software is distributed in the hope that it will be useful,  but WITHOUT"
        + " ANY WARRANTY; without even the implied warranty of  MERCHANTABILITY or FITNESS "
        + "FOR A PARTICULAR PURPOSE.   \n"
        + "\n"
        + "2. Altered versions must be plainly marked as such, and must not be  misrepresen"
        + "ted as being the original software.\n"
; // the license text
    }
 
    
}
