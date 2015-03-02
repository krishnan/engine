package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:17Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: bzip2_1_0_6.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class bzip2_1_0_6 extends License{
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
        return "bzip2-1.0.6"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "bzip2 and libbzip2 License v1.0.6"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This program, \"bzip2\", the associated library \"libbzip2\", and all documentation,"
        + " are copyright (C) 1996-2010 Julian R Seward. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     1. Redistributions of source code must retain the above copyright notice, t"
        + "his list of conditions and the following disclaimer.\n"
        + "\n"
        + "     2. The origin of this software must not be misrepresented; you must not cla"
        + "im that you wrote the original software. If you use this software in a product, "
        + "an acknowledgment in the product documentation would be appreciated but is not r"
        + "equired.\n"
        + "\n"
        + "     3. Altered source versions must be plainly marked as such, and must not be "
        + "misrepresented as being the original software.\n"
        + "\n"
        + "     4. The name of the author may not be used to endorse or promote products de"
        + "rived from this software without specific prior written permission.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR IMPLIED WAR"
        + "RANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILIT"
        + "Y AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUT"
        + "HOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSE"
        + "QUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS"
        + " OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER C"
        + "AUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR "
        + "TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF TH"
        + "IS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "Julian Seward, jseward@bzip.org bzip2/libbzip2 version 1.0.6 of 6 September 2010\n"
; // the license text
    }
 
    
}
