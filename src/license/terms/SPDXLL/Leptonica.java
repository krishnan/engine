package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:43Z
 * LicenseName: AGPL-3.0+
 * FileName: Leptonica.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Leptonica extends License{
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
        return "Leptonica"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Leptonica License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (C) 2001 Leptonica.  All rights reserved.\n"
        + "\n"
        + "This software is distributed in the hope that it will be useful, but with NO WAR"
        + "RANTY OF ANY KIND.\n"
        + "\n"
        + "No author or distributor accepts responsibility to anyone for the consequences o"
        + "f using this software, or for whether it serves any particular purpose or works "
        + "at all, unless he or she says so in writing.  Everyone is granted permission to "
        + "copy, modify and redistribute this source code, for commercial or non-commercial"
        + " purposes, with the following restrictions: \n"
        + "\n"
        + "(1) the origin of this source code must not be misrepresented; \n"
        + "(2) modified versions must be plainly marked as such; and \n"
        + "(3) this notice may not be removed or altered from any source or modified source"
        + " distribution.\n"
; // the license text
    }
 
    
}
