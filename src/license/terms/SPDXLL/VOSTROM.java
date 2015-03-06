package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:37Z
 * LicenseName: AGPL-3.0+
 * FileName: VOSTROM.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class VOSTROM extends License{
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
        return "VOSTROM"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "VOSTROM Public License for Open Source"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "VOSTROM Public License for Open Source \n"
        + "\n"
        + "Copyright (c) 2007 VOSTROM Holdings, Inc.\n"
        + "\n"
        + "This VOSTROM Holdings, Inc. (VOSTROM) Distribution (code and documentation) is m"
        + "ade available to the open source community as a public service by VOSTROM. Conta"
        + "ct VOSTROM at license@vostrom.com for information on other licensing arrangement"
        + "s (e.g. for use in proprietary applications).\n"
        + "\n"
        + "Under this license, this Distribution may be modified and the original version a"
        + "nd modified versions may be copied, distributed, publicly displayed and performe"
        + "d provided that the following conditions are met:\n"
        + "\n"
        + "1. Modified versions are distributed with source code and documentation and with"
        + " permission for others to use any code and documentation (whether in original or"
        + " modified versions) as granted under this license;\n"
        + "\n"
        + "2. if modified, the source code, documentation, and user run-time elements shoul"
        + "d be clearly labeled by placing an identifier of origin (such as a name, initial"
        + ", or other tag) after the version number;\n"
        + "\n"
        + "3. users, modifiers, distributors, and others coming into possession or using th"
        + "e Distribution in original or modified form accept the entire risk as to the pos"
        + "session, use, and performance of the Distribution;\n"
        + "\n"
        + "4. this copyright management information (software identifier and version number"
        + ", copyright notice and license) shall be retained in all versions of the Distrib"
        + "ution;\n"
        + "\n"
        + "5. VOSTROM may make modifications to the Distribution that are substantially sim"
        + "ilar to modified versions of the Distribution, and may make, use, sell, copy, di"
        + "stribute, publicly display, and perform such modifications, including making suc"
        + "h modifications available under this or other licenses, without obligation or re"
        + "striction;\n"
        + "\n"
        + "6. modifications incorporating code, libraries, and/or documentation subject to "
        + "any other open source license may be made, and the resulting work may be distrib"
        + "uted under the terms of such open source license if required by that open source"
        + " license, but doing so will not affect this Distribution, other modifications ma"
        + "de under this license or modifications made under other VOSTROM licensing arrang"
        + "ements;\n"
        + "\n"
        + "7. no permission is granted to distribute, publicly display, or publicly perform"
        + " modifications to the Distribution made using proprietary materials that cannot "
        + "be released in source format under conditions of this license;\n"
        + "\n"
        + "8. the name of VOSTROM may not be used in advertising or publicity pertaining to"
        + " Distribution of the software without specific, prior written permission.\n"
        + "\n"
        + "This software is made available \"as is\", and\n"
        + "\n"
        + "VOSTROM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, WITH REGARD TO THIS SOFTWA"
        + "RE, INCLUDING WITHOUT LIMITATION ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND F"
        + "ITNESS FOR A PARTICULAR PURPOSE, AND IN NO EVENT SHALL VOSTROM BE LIABLE FOR ANY"
        + " SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING "
        + "FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, TORT (INCLU"
        + "DING NEGLIGENCE) OR STRICT LIABILITY, ARISING OUT OF OR IN CONNECTION WITH THE U"
        + "SE OR PERFORMANCE OF THIS SOFTWARE. \n"
; // the license text
    }
 
    
}
