/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito
 * Created: 2014-04-28T22:24:34Z
 * LicenseName: AGPL-3.0+
 * FileName: PublicDomain.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, Nuno Brito </text>
 *   
 * Footnote before somebody's feelings get hurt: Public Domain is NOT a license.
 * It is used here on a licensing context that specifies a very unique licensing
 * characteristic.
 */
package license.terms.custom;

import license.License;

public class PublicDomain extends License{
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
     * @return  The unique identifier. This is not a license, but it treated similarly
     */
    @Override
    public String getId(){
        return "Public_Domain"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Released as public domain"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return ""; // the license text
    }
 
    
}
