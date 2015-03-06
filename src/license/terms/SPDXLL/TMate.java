package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:35Z
 * LicenseName: AGPL-3.0+
 * FileName: TMate.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class TMate extends License{
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
        return "TMate"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "TMate Open Source License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The TMate Open Source License. \n"
        + "\n"
        + "This license applies to all portions of TMate SVNKit library, which are not exte"
        + "rnally-maintained libraries (e.g. Ganymed SSH library).\n"
        + "\n"
        + "All the source code and compiled classes in package org.tigris.subversion.javahl"
        + " except SvnClient class are covered by the license in JAVAHL-LICENSE file\n"
        + "\n"
        + "Copyright (c) 2004-2012 TMate Software. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     * Redistributions of source code must retain the above copyright notice, th"
        + "is list of conditions and the following disclaimer.  \n"
        + "     \n"
        + "     * Redistributions in binary form must reproduce the above copyright notice,"
        + " this list of conditions and the following disclaimer in the documentation and/o"
        + "r other materials provided with the distribution. \n"
        + "     \n"
        + "     * Redistributions in any form must be accompanied by information on how to "
        + "obtain complete source code for the software that uses SVNKit and any accompanyi"
        + "ng software that uses the software that uses SVNKit. The source code must either"
        + " be included in the distribution or be available for no more than the cost of di"
        + "stribution plus a nominal fee, and must be freely redistributable under reasonab"
        + "le conditions. For an executable file, complete source code means the source cod"
        + "e for all modules it contains. It does not include source code for modules or fi"
        + "les that typically accompany the major components of the operating system on whi"
        + "ch the executable file runs. \n"
        + "  \n"
        + "     * Redistribution in any form without redistributing source code for softwar"
        + "e that uses SVNKit is possible only when such redistribution is explictly permit"
        + "ted by TMate Software. Please, contact TMate Software at support@svnkit.com to g"
        + "et such permission.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY TMATE SOFTWARE ``AS IS'' AND ANY EXPRESS OR IMPLIED"
        + " WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTAB"
        + "ILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT, ARE DISCLAIMED. \n"
        + "\n"
        + "IN NO EVENT SHALL TMATE SOFTWARE BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,"
        + " SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PR"
        + "OCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUS"
        + "INESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CO"
        + "NTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN"
        + " ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF "
        + "SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
