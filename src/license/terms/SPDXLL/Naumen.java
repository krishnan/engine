package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:53Z
 * LicenseName: AGPL-3.0+
 * FileName: Naumen.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Naumen extends License{
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
        return "Naumen"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Naumen Public License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "NAUMEN Public License \n"
        + "\n"
        + "This software is Copyright (c) NAUMEN (tm) and Contributors. All rights reserved"
        + ".\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "1. Redistributions in source code must retain the above copyright notice, this l"
        + "ist of conditions, and the following disclaimer.\n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions, and the following disclaimer in the documentation and/or o"
        + "ther materials provided with the distribution.\n"
        + "\n"
        + "3. The name NAUMEN (tm) must not be used to endorse or promote products derived "
        + "from this software without prior written permission from NAUMEN.\n"
        + "\n"
        + "4. The right to distribute this software or to use it for any purpose does not g"
        + "ive you the right to use Servicemarks (sm) or Trademarks (tm) of NAUMEN.\n"
        + "\n"
        + "5. If any files originating from NAUMEN or Contributors are modified, you must c"
        + "ause the modified files to carry prominent notices stating that you changed the "
        + "files and the date of any change.\n"
        + "\n"
        + "Disclaimer:\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY NAUMEN \"AS IS\" AND ANY EXPRESSED OR IMPLIED WARRANT"
        + "IES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AN"
        + "D FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL NAUMEN OR I"
        + "TS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLA"
        + "RY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBS"
        + "TITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTIO"
        + "N) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LI"
        + "ABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF T"
        + "HE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "This software consists of contributions made by NAUMEN and Contributors. Specifi"
        + "c attributions are listed in the accompanying credits file.\n"
; // the license text
    }
 
    
}
