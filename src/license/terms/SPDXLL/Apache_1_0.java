package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:59Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Apache_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Apache_1_0 extends License{
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
        return "Apache-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Apache License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1995-1999 The Apache Group. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain the above copyright notice, this l"
        + "ist of conditions and the following disclaimer. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution.\n"
        + "\n"
        + "3. All advertising materials mentioning features or use of this software must di"
        + "splay the following acknowledgment: \"This product includes software developed by"
        + " the <<var;name=organization;original=Apache Group for use in the Apache HTTP se"
        + "rver project (http://www.apache.org/);match=.+>>.\"\n"
        + "\n"
        + "4. The <<var;name=organizationClause4;original=\"Apache\" and \"Apache Software Fou"
        + "ndation\";match=.+>> must not be used to endorse or promote products derived from"
        + " this software without prior written permission. For written permission, please "
        + "contact <<var;name=contactClause4;original=apache@apache.org;match=.+>>\n"
        + "\n"
        + "5. Products derived from this software may not be called <<var;name=nameClause5;"
        + "original=\"Apache\";match=.+>> nor may <<var;name=name2clause5;original=\"Apache\";m"
        + "atch=.+>> appear in their name, without prior written permission of <<var;name=n"
        + "ame3clause5;original=the Apache Group;match=.+>>.\n"
        + "\n"
        + "6. Redistributions of any form whatsoever must retain the following acknowledgme"
        + "nt: \n"
        + "\"This product includes software developed by <<var;name=nameClause6;original=the"
        + " Apache Group for use in the Apache HTTP server project (http://www.apache.org/)"
        + ";match=.+>>.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY <<var;name=copyrightHolderAsIs;original=THE APACHE "
        + "GROUP;match=.+>> ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, B"
        + "UT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A P"
        + "ARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <<var;name=copyrightHolderLi"
        + "ability;original=THE APACHE GROUP OR ITS CONTRIBUTORS;match=.+>> BE LIABLE FOR A"
        + "NY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (I"
        + "NCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS "
        + "OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY TH"
        + "EORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEG"
        + "LIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN I"
        + "F ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. \n"
        + "\n"
        + "<<beginOptional;name=apacheOptionalAppendix>> This software consists of voluntar"
        + "y contributions made by many individuals on behalf of the Apache Group and was o"
        + "riginally based on public domain software written at the National Center for Sup"
        + "ercomputing Applications, University of Illinois, Urbana-Champaign. For more inf"
        + "ormation on the Apache Group and the Apache HTTP server project, please see <htt"
        + "p://www.apache.org/>. <<endOptional>>\n"
; // the license text
    }
 
    
}
