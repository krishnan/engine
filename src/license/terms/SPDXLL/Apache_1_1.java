package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:00Z
 * LicenseName: AGPL-3.0+
 * FileName: Apache_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Apache_1_1 extends License{
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
        return "Apache-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Apache License 1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Apache License 1.1 \n"
        + "\n"
        + "Copyright (c) 2000 The Apache Software Foundation.  All rights reserved. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain the above copyright notice, this l"
        + "ist of conditions and the following disclaimer.\n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution.\n"
        + "\n"
        + "3. The end-user documentation included with the redistribution, if any, must inc"
        + "lude the following acknowledgment: \n"
        + "\"This product includes software developed by <<var;name=organizationClause3;orig"
        + "inal=the Apache Software Foundation (http://www.apache.org/);match=.+>>.\" \n"
        + "Alternately, this acknowledgment may appear in the software itself, if and where"
        + "ver such third-party acknowledgments normally appear.\n"
        + "\n"
        + "4. The <<var;name=organizationClause4;original=\"Apache\" and \"Apache Software Fou"
        + "ndation\";match=.+>> must not be used to endorse or promote products derived from"
        + " this software without prior written permission. For written permission, please "
        + "contact <<var;name=contactClause4;original=apache@apache.org;match=.+>>\n"
        + "\n"
        + "5. Products derived from this software may not be called <<var;name=nameClause5;"
        + "original=\"Apache\" [ex. \"Jakarta,\" \"Apache,\" or \"Apache Commons,\"];match=.+>> nor"
        + " may <<var;name=name2clause5;original=\"Apache\" [ex. the names];match=.+>> appear"
        + " in their name, without prior written permission of <<var;name=name3clause5;orig"
        + "inal=the Apache Software Foundation;match=.+>>.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED ''AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INC"
        + "LUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNES"
        + "S FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL <<var;name=copyrigh"
        + "tHolderLiability;original=THE APACHE SOFTWARE FOUNDATION OR ITS CONTRIBUTORS;mat"
        + "ch=.+>> BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR C"
        + "ONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE G"
        + "OODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEV"
        + "ER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,"
        + " OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE O"
        + "F THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "<<beginOptional;name=apacheOptionalAppendix>> This software consists of voluntar"
        + "y contributions made by many individuals on behalf of the Apache Software Founda"
        + "tion. For more information on the Apache Software Foundation, please see http://"
        + "www.apache.org/. Portions of this software are based upon public domain software"
        + " originally written at the National Center for Supercomputing Applications, Univ"
        + "ersity of Illinois, Urbana-Champaign. <<endOptional>>\n"
; // the license text
    }
 
    
}
