package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:37Z
 * LicenseName: AGPL-3.0+
 * FileName: NCSA.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NCSA extends License{
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
        return "NCSA"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "University of Illinois/NCSA Open Source License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "University of Illinois/NCSA Open Source License \n"
        + "\n"
        + "Copyright (c) <<var;name=copyright;original= <Year> <Owner Organization Name>;ma"
        + "tch=.+>>. All rights reserved.\n"
        + "\n"
        + "Developed by: <<var;name=organization;original=<Name of Development Group> <Name"
        + " of Institution> <URL for Development Group/Institution>;match=.+>>\n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person obtaining a copy of "
        + "this software and associated documentation files (the \"Software\"), to deal with "
        + "the Software without restriction, including without limitation the rights to use"
        + ", copy, modify, merge, publish, distribute, sublicense, and/or sell copies of th"
        + "e Software, and to permit persons to whom the Software is furnished to do so, su"
        + "bject to the following conditions:\n"
        + "\n"
        + "     * Redistributions of source code must retain the above copyright notice, th"
        + "is list of conditions and the following disclaimers. \n"
        + "\n"
        + "     * Redistributions in binary form must reproduce the above copyright notice,"
        + " this list of conditions and the following disclaimers in the documentation and/"
        + "or other materials provided with the distribution. \n"
        + "\n"
        + "     * Neither the names of <<var;name=organizationClause3;original=<Name of Dev"
        + "elopment Group, Name of Institution>;match=.+>>, nor the names of its contributo"
        + "rs may be used to endorse or promote products derived from this Software without"
        + " specific prior written permission. \n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE CONTRIBUTORS OR "
        + "COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER I"
        + "N AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTIO"
        + "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE SOFTWARE.\n"
; // the license text
    }
 
    
}
