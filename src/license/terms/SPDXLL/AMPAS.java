package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:54Z
 * LicenseName: AGPL-3.0+
 * FileName: AMPAS.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class AMPAS extends License{
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
        return "AMPAS"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Academy of Motion Picture Arts and Sciences BSD"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 2006 Academy of Motion Picture Arts and Sciences (\"A.M.P.A.S.\"). P"
        + "ortions contributed by others as indicated. All rights reserved.\n"
        + "\n"
        + "A world-wide, royalty-free, non-exclusive right to distribute, copy, modify, cre"
        + "ate derivatives, and use, in source and binary forms, is hereby granted, subject"
        + " to acceptance of this license. Performance of any of the aforementioned acts in"
        + "dicates acceptance to be bound by the following terms and conditions:\n"
        + "\n"
        + "     * Redistributions of source code must retain the above copyright notice, th"
        + "is list of conditions and the Disclaimer of Warranty.\n"
        + "\n"
        + "     * Redistributions in binary form must reproduce the above copyright notice,"
        + " this list of conditions and the Disclaimer of Warranty in the documentation and"
        + "/or other materials provided with the distribution.\n"
        + "\n"
        + "     * Nothing in this license shall be deemed to grant any rights to trademarks"
        + ", copyrights, patents, trade secrets or any other intellectual property of A.M.P"
        + ".A.S. or any contributors, except as expressly stated herein, and neither the na"
        + "me of A.M.P.A.S. nor of any other contributors to this software, may be used to "
        + "endorse or promote products derived from this software without specific prior wr"
        + "itten permission of A.M.P.A.S. or contributor, as appropriate.\n"
        + "\n"
        + "This license shall be governed by the laws of the State of California, and subje"
        + "ct to the jurisdiction of the courts therein.\n"
        + "\n"
        + "Disclaimer of Warranty: THIS SOFTWARE IS PROVIDED BY A.M.P.A.S. AND CONTRIBUTORS"
        + " \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, T"
        + "HE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND "
        + "NON-INFRINGEMENT ARE DISCLAIMED. IN NO EVENT SHALL A.M.P.A.S., ANY CONTRIBUTORS "
        + "OR DISTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLA"
        + "RY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBS"
        + "TITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTIO"
        + "N) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LI"
        + "ABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF T"
        + "HE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
