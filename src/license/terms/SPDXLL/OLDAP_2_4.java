package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:07Z
 * LicenseName: AGPL-3.0+
 * FileName: OLDAP_2_4.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OLDAP_2_4 extends License{
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
        return "OLDAP-2.4"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open LDAP Public License v2.4"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The OpenLDAP Public License \n"
        + "Version 2.4, 8 December 2000\n"
        + "\n"
        + "Redistribution and use of this software and associated documentation (\"Software\""
        + "), with or without modification, are permitted provided that the following condi"
        + "tions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain copyright statements and notices.\n"
        + "\n"
        + "2. Redistributions in binary form must reproduce applicable copyright statements"
        + " and notices, this list of conditions, and the following disclaimer in the docum"
        + "entation and/or other materials provided with the distribution.\n"
        + "\n"
        + "3. Redistributions must contain a verbatim copy of this document.\n"
        + "\n"
        + "4. The names and trademarks of the authors and copyright holders must not be use"
        + "d in advertising or otherwise to promote the sale, use or other dealing in this "
        + "Software without specific, written prior permission.\n"
        + "\n"
        + "5. Due credit should be given to the OpenLDAP Project.\n"
        + "\n"
        + "6. The OpenLDAP Foundation may revise this license from time to time. Each revis"
        + "ion is distinguished by a version number. You may use the Software under terms o"
        + "f this license revision or under the terms of any subsequent revision of the lic"
        + "ense.\n"
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
        + "\n"
        + "OpenLDAP is a trademark of the OpenLDAP Foundation.\n"
        + "\n"
        + "Copyright 1999-2000 The OpenLDAP Foundation, Redwood City, California, USA. All "
        + "Rights Reserved. Permission to copy and distributed verbatim copies of this docu"
        + "ment is granted.\n"
; // the license text
    }
 
    
}
