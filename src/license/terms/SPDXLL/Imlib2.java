package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:35Z
 * LicenseName: AGPL-3.0+
 * FileName: Imlib2.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Imlib2 extends License{
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
        return "Imlib2"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Imlib2 License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Imlib2 License\n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person obtaining a copy of "
        + "this software and associated documentation files (the \"Software\"), to deal in th"
        + "e Software without restriction, including without limitation the rights to use, "
        + "copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the "
        + "Software, and to permit persons to whom the Software is furnished to do so, subj"
        + "ect to the following conditions:\n"
        + "\n"
        + "The above copyright notice and this permission notice shall be included in all c"
        + "opies of the Software and its Copyright notices. In addition publicly documented"
        + " acknowledgment must be given that this software has been used if no source code"
        + " of this software is made available publicly. Making the source available public"
        + "ly means including the source for this software with the distribution, or a meth"
        + "od to get this software via some reasonable mechanism (electronic transfer via a"
        + " network or media) as well as making an offer to supply the source on request. T"
        + "his Copyright notice serves as an offer to supply the source on on request as we"
        + "ll. Instead of this, supplying acknowledgments of use of this software in either"
        + " Copyright notices, Manuals, Publicity and Marketing documents or any documentat"
        + "ion provided with any product containing this software. This License does not ap"
        + "ply to any software that links to the libraries provided by this software (stati"
        + "cally or dynamically), but only to the software provided.\n"
        + "\n"
        + "Please see the COPYING-PLAIN for a plain-english explanation of this notice and "
        + "its intent.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS BE LIABL"
        + "E FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T"
        + "ORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE"
        + " USE OR OTHER DEALINGS IN THE SOFTWARE. \n"
; // the license text
    }
 
    
}
