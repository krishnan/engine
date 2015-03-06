package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:06Z
 * LicenseName: AGPL-3.0+
 * FileName: Barr.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Barr extends License{
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
        return "Barr"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Barr License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This is a package of commutative diagram macros built on top of Xy-pic  by Micha"
        + "el Barr (email: barr@barrs.org). Its use is unrestricted. It  may be freely dist"
        + "ributed, unchanged, for non-commercial or commercial  use. If changed, it must b"
        + "e renamed. Inclusion in a commercial  software package is also permitted, but I "
        + "would appreciate receiving a  free copy for my personal examination and use. The"
        + "re are no guarantees  that this package is good for anything. I have tested it w"
        + "ith LaTeX 2e,  LaTeX 2.09 and Plain TeX. Although I know of no reason it will no"
        + "t work  with AMSTeX, I have not tested it.\n"
; // the license text
    }
 
    
}
