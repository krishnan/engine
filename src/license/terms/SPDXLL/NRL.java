package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:59Z
 * LicenseName: AGPL-3.0+
 * FileName: NRL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NRL extends License{
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
        return "NRL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "NRL License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "NRL License\n"
        + "\n"
        + "COPYRIGHT NOTICE\n"
        + "\n"
        + "All of the documentation and software included in this software distribution fro"
        + "m the US Naval Research Laboratory (NRL) are copyrighted by their respective dev"
        + "elopers.\n"
        + "\n"
        + "Portions of the software are derived from the Net/2 and 4.4-Lite Berkeley Softwa"
        + "re Distributions (BSD) of the University of California at Berkeley and those por"
        + "tions are copyright by The Regents of the University of California. All Rights R"
        + "eserved. The UC Berkeley Copyright and License agreement is binding on those por"
        + "tions of the software. In all cases, the NRL developers have retained the origin"
        + "al UC Berkeley copyright and license notices in the respective files in accordan"
        + "ce with the UC Berkeley copyrights and license.\n"
        + "\n"
        + "Portions of this software and documentation were developed at NRL by various peo"
        + "ple. Those developers have each copyrighted the portions that they developed at "
        + "NRL and have assigned All Rights for those portions to NRL. Outside the USA, NRL"
        + " has copyright on some of the software developed at NRL. The affected files all "
        + "contain specific copyright notices and those notices must be retained in any der"
        + "ived work.\n"
        + "\n"
        + "NRL LICENSE\n"
        + "\n"
        + "NRL grants permission for redistribution and use in source and binary forms, wit"
        + "h or without modification, of the software and documentation created at NRL prov"
        + "ided that the following conditions are met:\n"
        + "\n"
        + "     1. All terms of the UC Berkeley copyright and license must be followed. \n"
        + "     2. Redistributions of source code must retain the above copyright notice, t"
        + "his list of conditions and the following disclaimer. \n"
        + "     3. Redistributions in binary form must reproduce the above copyright notice"
        + ", this list of conditions and the following disclaimer in the documentation and/"
        + "or other materials provided with the distribution. \n"
        + "     4. All advertising materials mentioning features or use of this software mu"
        + "st display the following acknowledgements:\n"
        + "\n"
        + "          This product includes software developed by the University of Californ"
        + "ia, Berkeley and its contributors.\n"
        + "\n"
        + "          This product includes software developed at the Information Technology"
        + " Division, US Naval Research Laboratory.\n"
        + "\n"
        + "     5. Neither the name of the NRL nor the names of its contributors may be use"
        + "d to endorse or promote products derived from this software without specific pri"
        + "or written permission.\n"
        + "\n"
        + "THE SOFTWARE PROVIDED BY NRL IS PROVIDED BY NRL AND CONTRIBUTORS ``AS IS'' AND A"
        + "NY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WAR"
        + "RANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. "
        + "IN NO EVENT SHALL NRL OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDE"
        + "NTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED T"
        + "O, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; O"
        + "R BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER "
        + "IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISI"
        + "NG IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILIT"
        + "Y OF SUCH DAMAGE.\n"
        + "\n"
        + "The views and conclusions contained in the software and documentation are those "
        + "of the authors and should not be interpreted as representing official policies, "
        + "either expressed or implied, of the US Naval Research Laboratory (NRL).\n"
; // the license text
    }
 
    
}
