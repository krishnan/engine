package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:45Z
 * LicenseName: AGPL-3.0+
 * FileName: Zlib.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Zlib extends License{
   /**
     * Was this license approved by the OSI?
     * @return  True if the license is listed as approved   
     */
    @Override
    public Boolean approvedOSI(){
        return true; // was this license OSI approved or not?
    }
    
    /**
     * The SPDX identifier
     * @return  The unique identifier for this license
     */
    @Override
    public String getId(){
        return "Zlib"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "zlib License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "zlib License\n"
        + "\n"
        + "This software is provided 'as-is', without any express or implied warranty.  In "
        + "no event will the authors be held liable for any damages arising from the use of"
        + " this software.\n"
        + "\n"
        + "Permission is granted to anyone to use this software for any purpose, including "
        + "commercial applications, and to alter it and redistribute it freely, subject to "
        + "the following restrictions:\n"
        + "\n"
        + "     1. The origin of this software must not be misrepresented; you must not cla"
        + "im that you wrote the original software. If you use this software in a product, "
        + "an acknowledgment in the product documentation would be appreciated but is not r"
        + "equired.\n"
        + "  \n"
        + "     2. Altered source versions must be plainly marked as such, and must not be "
        + "misrepresented as being the original software.\n"
        + "  \n"
        + "     3. This notice may not be removed or altered from any source distribution.\n"
; // the license text
    }
 
    
}
