package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:15Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: psfrag.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class psfrag extends License{
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
        return "psfrag"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "psfrag License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "psfrag.dtx \n"
        + "Copyright (C) 1996 Craig Barratt, Michael C. Grant, and David Carlisle.  \n"
        + "All rights are reserved.   \n"
        + "\n"
        + "This system is distributed in the hope that it will be  useful, but WITHOUT ANY "
        + "WARRANTY; without even the  implied warranty of MERCHANTABILITY or FITNESS FOR A"
        + " PARTICULAR PURPOSE. Don't come complaining to us if you modify this file and it"
        + " doesn't work! If this file is modified by anyone but the authors, those changes"
        + " and their authors must be explicitly stated HERE.\n"
; // the license text
    }
 
    
}
