package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:15Z
 * LicenseName: AGPL-3.0+
 * FileName: BSD_3_Clause_Attribution.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class BSD_3_Clause_Attribution extends License{
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
        return "BSD-3-Clause-Attribution"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "BSD with attribution"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     1. Redistributions of source code must retain the above copyright notice, t"
        + "his list of conditions and the following disclaimer.\n"
        + "\n"
        + "     2. Redistributions in binary form must reproduce the above copyright notice"
        + ", this list of conditions and the following disclaimer in the documentation and/"
        + "or other materials provided with the distribution.\n"
        + "\n"
        + "     3. Neither the name of the copyright holder nor the names of its contributo"
        + "rs may be used to endorse or promote products derived from this software without"
        + " specific prior written permission.\n"
        + "\n"
        + "     4. Redistributions of any form whatsoever must retain the following acknowl"
        + "edgment: 'This product includes software developed by the <<var;name=organizatio"
        + "n;original=\"Universidad de Palermo, Argentina\" (http://www.palermo.edu/).';match"
        + "=.+>>\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND "
        + "ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WA"
        + "RRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED."
        + " IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT"
        + ", INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,"
        + " BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, D"
        + "ATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF L"
        + "IABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE O"
        + "R OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED"
        + " OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
