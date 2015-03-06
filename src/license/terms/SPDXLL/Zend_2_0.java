package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:44Z
 * LicenseName: AGPL-3.0+
 * FileName: Zend_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Zend_2_0 extends License{
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
        return "Zend-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Zend License v2.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Zend Engine License, version 2.00 \n"
        + "Copyright (c) 1999-2002 Zend Technologies Ltd. All rights reserved. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " is permitted provided that the following conditions are met:\n"
        + "\n"
        + "     1. Redistributions of source code must retain the above copyright notice, t"
        + "his list of conditions and the following disclaimer. \n"
        + "\n"
        + "     2. Redistributions in binary form must reproduce the above copyright notice"
        + ", this list of conditions and the following disclaimer in the documentation and/"
        + "or other materials provided with the distribution. \n"
        + "\n"
        + "     3. The names \"Zend\" and \"Zend Engine\" must not be used to endorse or promot"
        + "e products derived from this software without prior permission from Zend Technol"
        + "ogies Ltd. For written permission, please contact license@zend.com. \n"
        + "\n"
        + "     4. Zend Technologies Ltd. may publish revised and/or new versions of the li"
        + "cense from time to time. Each version will be given a distinguishing version num"
        + "ber. Once covered code has been published under a particular version of the lice"
        + "nse, you may always continue to use it under the terms of that version. You may "
        + "also choose to use such covered code under the terms of any subsequent version o"
        + "f the license published by Zend Technologies Ltd. No one other than Zend Technol"
        + "ogies Ltd. has the right to modify the terms applicable to covered code created "
        + "under this License.\n"
        + "\n"
        + "     5. Redistributions of any form whatsoever must retain the following acknowl"
        + "edgment: \"This product includes the Zend Engine, freely available at http://www."
        + "zend.com\"\n"
        + "\n"
        + "     6. All advertising materials mentioning features or use of this software mu"
        + "st display the following acknowledgment: \"The Zend Engine is freely available at"
        + " http://www.zend.com\"\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY ZEND TECHNOLOGIES LTD. ``AS IS'' AND ANY EXPRESSED "
        + "OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF "
        + "MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT"
        + " SHALL ZEND TECHNOLOGIES LTD. BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SP"
        + "ECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCU"
        + "REMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINE"
        + "SS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTR"
        + "ACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN AN"
        + "Y WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUC"
        + "H DAMAGE. \n"
; // the license text
    }
 
    
}
