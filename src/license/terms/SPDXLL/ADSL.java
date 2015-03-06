package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:58Z
 * LicenseName: AGPL-3.0+
 * FileName: ADSL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ADSL extends License{
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
        return "ADSL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Amazon Digital Services License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This software code is made available \"AS IS\" without warranties of any kind. You"
        + " may copy, display, modify and redistribute the software code either by itself o"
        + "r as incorporated into your code; provided that > you do not remove any propriet"
        + "ary notices. Your use of this software code is at your own risk and you waive an"
        + "y claim against Amazon Digital Services, Inc. or its affiliates with respect to "
        + "your use of this software code. (c) 2006 Amazon Digital Services, Inc. or its af"
        + "filiates.\n"
; // the license text
    }
 
    
}
