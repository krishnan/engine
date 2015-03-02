package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:05Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: OLDAP_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OLDAP_2_0 extends License{
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
        return "OLDAP-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The OpenLDAP Public License\n"
        + "Version 2.0, 7 June 1999 \n"
        + "\n"
        + "Copyright 1999, The OpenLDAP Foundation, Redwood City, California, USA. All Righ"
        + "ts Reserved.\n"
        + "\n"
        + "Redistribution and use of this software and associated documentation (\"Software\""
        + "), with or without modification, are permitted provided that the following condi"
        + "tions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain copyright statements and notices. "
        + "Redistributions must also contain a copy of this document.\n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution.\n"
        + "\n"
        + "3. The name \"OpenLDAP\" must not be used to endorse or promote products derived f"
        + "rom this Software without prior written permission of the OpenLDAP Foundation. F"
        + "or written permission, please contact foundation@openldap.org.\n"
        + "\n"
        + "4. Products derived from this Software may not be called \"OpenLDAP\" nor may \"Ope"
        + "nLDAP\" appear in their names without prior written permission of the OpenLDAP Fo"
        + "undation. OpenLDAP is a registered trademark of the OpenLDAP Foundation.\n"
        + "\n"
        + "5. Due credit should be given to the OpenLDAP Project (http://www.openldap.org/)"
        + ".\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE OPENLDAP FOUNDATION AND CONTRIBUTORS ``AS IS'' "
        + "AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPL"
        + "IED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCL"
        + "AIMED. IN NO EVENT SHALL THE OPENLDAP FOUNDATION OR ITS CONTRIBUTORS BE LIABLE F"
        + "OR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGE"
        + "S (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; L"
        + "OSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON AN"
        + "Y THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING"
        + " NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EV"
        + "EN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
