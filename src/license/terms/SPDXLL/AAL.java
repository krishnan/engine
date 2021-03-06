package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:06Z
 * LicenseName: AGPL-3.0+
 * FileName: AAL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class AAL extends License{
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
        return "AAL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Attribution Assurance License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Attribution Assurance License \n"
        + "\n"
        + "Copyright (c) <<var;name=copyright;original=2002 by AUTHOR PROFESSIONAL IDENTIFI"
        + "CATION * URL \"PROMOTIONAL SLOGAN FOR AUTHOR'S PROFESSIONAL PRACTICE\";match=.+>>\n"
        + "\n"
        + "All Rights Reserved \n"
        + "\n"
        + "ATTRIBUTION ASSURANCE LICENSE (adapted from the original BSD license)\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the conditions below are met. These conditions requ"
        + "ire a modest attribution to <<var;name=author;original=<AUTHOR>;match=.+>> (the "
        + "\"Author\"), who hopes that its promotional value may help justify the thousands o"
        + "f dollars in otherwise billable time invested in writing this and other freely a"
        + "vailable, open-source software.\n"
        + "\n"
        + "1. Redistributions of source code, in whole or part and with or without modifica"
        + "tion (the \"Code\"), must prominently display this GPG-signed text in verifiable f"
        + "orm. \n"
        + "\n"
        + "2. Redistributions of the Code in binary form must be accompanied by this GPG-si"
        + "gned text in any documentation and, each time the resulting executable program o"
        + "r a program dependent thereon is launched, a prominent display (e.g., splash scr"
        + "een or banner text) of the Author's attribution information, which includes: \n"
        + "\n"
        + "     (a) <<var;name=author;original=Name;match=.+>> (\"AUTHOR\"), \n"
        + "     (b) <<var;name=profIdent;original=Professional identification;match=.+>> (\""
        + "PROFESSIONAL IDENTIFICATION\"), and \n"
        + "     (c) <<var;name=url;original=URL;match=.+>> (\"URL\"). \n"
        + "\n"
        + "3. Neither the name nor any trademark of the Author may be used to endorse or pr"
        + "omote products derived from this software without specific prior written permiss"
        + "ion. \n"
        + "\n"
        + "4. Users are entirely responsible, to the exclusion of the Author and any other "
        + "persons, for compliance with (1) regulations set by owners or administrators of "
        + "employed equipment, (2) licensing terms of any other software, and (3) local reg"
        + "ulations regarding use, including those regarding import, export, and use of enc"
        + "ryption software.\n"
        + "\n"
        + "THIS FREE SOFTWARE IS PROVIDED BY THE AUTHOR \"AS IS\" AND ANY EXPRESS OR IMPLIED "
        + "WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABI"
        + "LITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE "
        + "AUTHOR OR ANY CONTRIBUTOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIA"
        + "L, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, EFFECTS O"
        + "F UNAUTHORIZED OR MALICIOUS NETWORK ACCESS; PROCUREMENT OF SUBSTITUTE GOODS OR S"
        + "ERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED"
        + " AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT "
        + "(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SO"
        + "FTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
