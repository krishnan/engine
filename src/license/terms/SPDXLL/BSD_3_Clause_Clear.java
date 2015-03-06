package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:14Z
 * LicenseName: AGPL-3.0+
 * FileName: BSD_3_Clause_Clear.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class BSD_3_Clause_Clear extends License{
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
        return "BSD-3-Clause-Clear"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "BSD 3-clause Clear License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Clear BSD License\n"
        + "\n"
        + "This is a license template.\n"
        + "\n"
        + "\n"
        + "Copyright (c) <<var;name=copyright;original=[xxxx]-[xxxx] [Owner Organization];m"
        + "atch=.+>>\n"
        + "All rights reserved.\n"
        + "\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted (subject to the limitations in the disclaimer below) provided tha"
        + "t the following conditions are met:\n"
        + "\n"
        + "* Redistributions of source code must retain the above copyright notice, this li"
        + "st of conditions and the following disclaimer.\n"
        + "\n"
        + "* Redistributions in binary form must reproduce the above copyright notice, this"
        + " list of conditions and the following disclaimer in the documentation and/or oth"
        + "er materials provided with the distribution.\n"
        + "\n"
        + "* Neither the name of <<var;name=organizationClause3;original=[Owner Organizatio"
        + "n];match=.+>> nor the names of its contributors may be used to endorse or promot"
        + "e products derived from this software without specific prior written permission."
        + "\n"
        + "\n"
        + "NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS "
        + "LICENSE. THIS SOFTWARE IS PROVIDED BY <<var;name=copyrightHolderAsIs;original=TH"
        + "E COPYRIGHT HOLDERS AND CONTRIBUTORS;match=.+>> \"AS IS\" AND ANY EXPRESS OR IMPLI"
        + "ED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANT"
        + "ABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <"
        + "<var;name=copyrightHolderLiability;original=THE COPYRIGHT HOLDER OR CONTRIBUTORS"
        + ";match=.+>> BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, "
        + "OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITU"
        + "TE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) H"
        + "OWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABIL"
        + "ITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE U"
        + "SE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
