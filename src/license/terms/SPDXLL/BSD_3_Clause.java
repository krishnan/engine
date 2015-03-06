package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:13Z
 * LicenseName: AGPL-3.0+
 * FileName: BSD_3_Clause.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class BSD_3_Clause extends License{
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
        return "BSD-3-Clause"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "BSD 3-clause \"New\" or \"Revised\" License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) <<var;name=copyright;original= <year> <owner>;match=.+>>. All righ"
        + "ts reserved. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain the above copyright notice, this l"
        + "ist of conditions and the following disclaimer. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution. \n"
        + "\n"
        + "3. Neither the name of <<var;name=organizationClause3;original=the copyright hol"
        + "der;match=.+>> nor the names of its contributors may be used to endorse or promo"
        + "te products derived from this software without specific prior written permission"
        + ".\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY <<var;name=copyrightHolderAsIs;original=THE COPYRIG"
        + "HT HOLDERS AND CONTRIBUTORS;match=.+>> \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRAN"
        + "TIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY A"
        + "ND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <<var;name"
        + "=copyrightHolderLiability;original=THE COPYRIGHT HOLDER OR CONTRIBUTORS;match=.+"
        + ">> BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQ"
        + "UENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS "
        + "OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CA"
        + "USED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR T"
        + "ORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THI"
        + "S SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. \n"
; // the license text
    }
 
    
}
