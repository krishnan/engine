package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:09Z
 * LicenseName: AGPL-3.0+
 * FileName: Eurosym.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Eurosym extends License{
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
        return "Eurosym"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Eurosym License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1999-2002 Henrik Theiling \n"
        + "Licence Version 2\n"
        + "\n"
        + "This software is provided 'as-is', without warranty of any kind, express or impl"
        + "ied. In no event will the authors or copyright holders be held liable for any da"
        + "mages arising from the use of this software.\n"
        + "\n"
        + "Permission is granted to anyone to use this software for any purpose, including "
        + "commercial applications, and to alter it and redistribute it freely, subject to "
        + "the following restrictions:\n"
        + "\n"
        + "     1. The origin of this software must not be misrepresented; you must not cla"
        + "im that you wrote the original software. If you use this software in a product, "
        + "an acknowledgment in the product documentation would be appreciated.\n"
        + "\n"
        + "     2. Altered source versions must be plainly marked as such, and must not be "
        + "misrepresented as being the original software.\n"
        + "\n"
        + "     3. You must not use any of the names of the authors or copyright holders of"
        + " the original software for advertising or publicity pertaining to distribution w"
        + "ithout specific, written prior permission.\n"
        + "\n"
        + "     4. If you change this software and redistribute parts or all of it in any f"
        + "orm, you must make the source code of the altered version of this software avail"
        + "able.\n"
        + "\n"
        + "     5. This notice may not be removed or altered from any source distribution.\n"
        + "\n"
        + "This licence is governed by the Laws of Germany. Disputes shall be settled by Sa"
        + "arbruecken City Court.\n"
; // the license text
    }
 
    
}
