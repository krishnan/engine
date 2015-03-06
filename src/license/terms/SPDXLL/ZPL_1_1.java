package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:46Z
 * LicenseName: AGPL-3.0+
 * FileName: ZPL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ZPL_1_1 extends License{
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
        return "ZPL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Zope Public License 1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Zope Public License (ZPL) Version 1.1\n"
        + "\n"
        + "Copyright (c) Zope Corporation. All rights reserved.\n"
        + "\n"
        + "This license has been certified as open source.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     1.  Redistributions in source code must retain the above copyright notice, "
        + "this list of conditions, and the following disclaimer.\n"
        + "\n"
        + "     2.  Redistributions in binary form must reproduce the above copyright notic"
        + "e, this list of conditions, and the following disclaimer in the documentation an"
        + "d/or other materials provided with the distribution.\n"
        + "\n"
        + "     3.  All advertising materials and documentation mentioning features derived"
        + " from or use of this software must display the following acknowledgement:\n"
        + "\n"
        + "     \"This product includes software developed by Zope Corporation for use in th"
        + "e Z Object Publishing Environment (http://www.zope.com/).\"\n"
        + "\n"
        + "     In the event that the product being advertised includes an intact Zope dist"
        + "ribution (with copyright and license included) then this clause is waived.\n"
        + "\n"
        + "     4.  Names associated with Zope or Zope Corporation must not be used to endo"
        + "rse or promote products derived from this software without prior written permiss"
        + "ion from Zope Corporation.\n"
        + "\n"
        + "     5.  Modified redistributions of any form whatsoever must retain the followi"
        + "ng acknowledgment:\n"
        + "\n"
        + "     \"This product includes software developed by Zope Corporation for use in th"
        + "e Z Object Publishing Environment (http://www.zope.com/).\"\n"
        + "\n"
        + "     Intact (re-)distributions of any official Zope release do not require an ex"
        + "ternal acknowledgement.\n"
        + "\n"
        + "     6.  Modifications are encouraged but must be packaged separately as patches"
        + " to official Zope releases. Distributions that do not clearly separate the patch"
        + "es from the original work must be clearly labeled as unofficial distributions. M"
        + "odifications which do not carry the name Zope may be packaged in any form, as lo"
        + "ng as they conform to all of the clauses above.\n"
        + "\n"
        + "Disclaimer\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY ZOPE CORPORATION ``AS IS'' AND ANY EXPRESSED OR IMP"
        + "LIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHA"
        + "NTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL"
        + " ZOPE CORPORATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDE"
        + "NTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED T"
        + "O, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; O"
        + "R BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER "
        + "IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISI"
        + "NG IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILIT"
        + "Y OF SUCH DAMAGE.\n"
        + "\n"
        + "This software consists of contributions made by Zope Corporation and many indivi"
        + "duals on behalf of Zope Corporation. Specific attributions are listed in the acc"
        + "ompanying credits file.\n"
; // the license text
    }
 
    
}
