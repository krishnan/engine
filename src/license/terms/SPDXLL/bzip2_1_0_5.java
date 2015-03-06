package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:16Z
 * LicenseName: AGPL-3.0+
 * FileName: bzip2_1_0_5.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class bzip2_1_0_5 extends License{
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
        return "bzip2-1.0.5"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "bzip2 and libbzip2 License v1.0.5"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Version 1.0.5 of 10 December 2007\n"
        + "\n"
        + "Copyright © 1996-2007 Julian Seward\n"
        + "\n"
        + "This program, bzip2, the associated library libbzip2, and all documentation, are"
        + " copyright © 1996-2007 Julian Seward. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     • Redistributions of source code must retain the above copyright notice, th"
        + "is list of conditions and the following disclaimer.\n"
        + "\n"
        + "     • The origin of this software must not be misrepresented; you must not clai"
        + "m that you wrote the original software. If you use this software in a product, a"
        + "n acknowledgment in the product documentation would be appreciated but is not re"
        + "quired.\n"
        + "\n"
        + "     • Altered source versions must be plainly marked as such, and must not be m"
        + "isrepresented as being the original software.\n"
        + "\n"
        + "     • The name of the author may not be used to endorse or promote products der"
        + "ived from this software without specific prior written permission.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE AUTHOR \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRA"
        + "NTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY "
        + "AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHO"
        + "R BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQU"
        + "ENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS O"
        + "R SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAU"
        + "SED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TO"
        + "RT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS"
        + " SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "PATENTS: To the best of my knowledge, bzip2 and libbzip2 do not use any patented"
        + " algorithms. However, I do not have the resources to carry out a patent search. "
        + "Therefore I cannot give any guarantee of the above statement.\n"
; // the license text
    }
 
    
}
