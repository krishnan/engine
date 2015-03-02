package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:46Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: ZPL_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ZPL_2_0 extends License{
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
        return "ZPL-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Zope Public License 2.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Zope Public License (ZPL) Version 2.0\n"
        + "\n"
        + "This software is Copyright (c) Zope Corporation (tm) and Contributors. All right"
        + "s reserved.\n"
        + "\n"
        + "This license has been certified as open source. It has also been designated as G"
        + "PL compatible by the Free Software Foundation (FSF).\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     1. Redistributions in source code must retain the above copyright notice, t"
        + "his list of conditions, and the following disclaimer.\n"
        + "\n"
        + "     2. Redistributions in binary form must reproduce the above copyright notice"
        + ", this list of conditions, and the following disclaimer in the documentation and"
        + "/or other materials provided with the distribution.\n"
        + "\n"
        + "     3. The name Zope Corporation (tm) must not be used to endorse or promote pr"
        + "oducts derived from this software without prior written permission from Zope Cor"
        + "poration.\n"
        + "\n"
        + "     4. The right to distribute this software or to use it for any purpose does "
        + "not give you the right to use Servicemarks (sm) or Trademarks (tm) of Zope Corpo"
        + "ration. Use of them is covered in a separate agreement (see http://www.zope.com/"
        + "Marks).\n"
        + "\n"
        + "     5. If any files are modified, you must cause the modified files to carry pr"
        + "ominent notices stating that you changed the files and the date of any change. \n"
        + "\n"
        + "Disclaimer\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY ZOPE CORPORATION ``AS IS'' AND ANY EXPRESSED OR IMP"
        + "LIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHA"
        + "NTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHAL"
        + "L ZOPE CORPORATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCID"
        + "ENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED "
        + "TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; "
        + "OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER"
        + " IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARIS"
        + "ING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILI"
        + "TY OF SUCH DAMAGE.\n"
        + "\n"
        + "This software consists of contributions made by Zope Corporation and many indivi"
        + "duals on behalf of Zope Corporation.  Specific attributions are listed in the ac"
        + "companying credits file.\n"
; // the license text
    }
 
    
}
