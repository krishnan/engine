package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:39Z
 * LicenseName: AGPL-3.0+
 * FileName: Wsuipa.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Wsuipa extends License{
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
        return "Wsuipa"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Wsuipa License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This file was added by Clea F. Rees on 2008/11/30 with the permission of Dean Gu"
        + "enther and pointers to this file were added to all source files.\n"
        + "\n"
        + "Unlimited copying and redistribution of each of the files is permitted as long a"
        + "s the file is not modified. Modifications, and redistribution of modified versio"
        + "ns, are also permitted, but only if the resulting file is renamed.\n"
        + "\n"
        + "The copyright holder is Washington State University. The original author of the "
        + "fonts is Janene Winter. The primary contact (as of 2008) is Dean Guenther.\n"
; // the license text
    }
 
    
}
