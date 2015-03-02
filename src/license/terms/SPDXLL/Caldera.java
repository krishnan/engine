package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:17Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Caldera.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Caldera extends License{
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
        return "Caldera"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Caldera License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Caldera International, Inc. hereby grants a fee free license that includes the r"
        + "ights use, modify and distribute this named source code, including creating deri"
        + "ved binary products created from the source code. The source code for which Cald"
        + "era International, Inc. grants rights are limited to the following UNIX Operatin"
        + "g Systems that operate on the 16-Bit PDP-11 CPU and early versions of the 32-Bit"
        + " UNIX Operating System, with specific exclusion of UNIX System III and UNIX Syst"
        + "em V and successor operating systems:\n"
        + "\n"
        + "     32-bit 32V UNIX\n"
        + "     16 bit UNIX Versions 1, 2, 3, 4, 5, 6, 7\n"
        + "\n"
        + "Caldera International, Inc. makes no guarantees or commitments that any source c"
        + "ode is available from Caldera\n"
        + "International, Inc.\n"
        + "\n"
        + "The following copyright notice applies to the source code files for which this l"
        + "icense is granted.\n"
        + "\n"
        + "Copyright(C) Caldera International Inc. 2001-2002. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     Redistributions of source code and documentation must retain the above copy"
        + "right notice, this list of conditions and the following disclaimer. \n"
        + "\n"
        + "     Redistributions in binary form must reproduce the above copyright notice, t"
        + "his list of conditions and the following disclaimer in the documentation and/or "
        + "other materials provided with the distribution.\n"
        + "\n"
        + "     All advertising materials mentioning features or use of this software must "
        + "display the following acknowledgement:\n"
        + "This product includes software developed or owned by Caldera International, Inc."
        + "\n"
        + "\n"
        + "     Neither the name of Caldera International, Inc. nor the names of other cont"
        + "ributors may be used to endorse or promote products derived from this software w"
        + "ithout specific prior written permission.\n"
        + "\n"
        + "USE OF THE SOFTWARE PROVIDED FOR UNDER THIS LICENSE BY CALDERA INTERNATIONAL, IN"
        + "C. AND CONTRIBUTORS ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, "
        + "BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A "
        + "PARTICULAR\n"
        + "PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL CALDERA INTERNATIONAL, INC. BE LIABLE "
        + "FOR ANY DIRECT, INDIRECT INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGE"
        + "S (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; L"
        + "OSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON AN"
        + "Y THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING"
        + " NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EV"
        + "EN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
