package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: ECL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ECL_1_0 extends License{
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
        return "ECL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Educational Community License v1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Educational Community License\n"
        + "\n"
        + "This Educational Community License (the \"License\") applies to any original work "
        + "of authorship (the \"Original Work\") whose owner (the \"Licensor\") has placed the "
        + "following notice immediately following the copyright notice for the Original Wor"
        + "k:\n"
        + "\n"
        + "Copyright (c) <<var;name=copyright;original=<year> <copyright holders>;match=.+>"
        + ">\n"
        + "\n"
        + "Licensed under the Educational Community License version 1.0\n"
        + "\n"
        + "This Original Work, including software, source code, documents, or other related"
        + " items, is being provided by the copyright holder(s) subject to the terms of the"
        + " Educational Community License. By obtaining, using and/or copying this Original"
        + " Work, you agree that you have read, understand, and will comply with the follow"
        + "ing terms and conditions of the Educational Community License:\n"
        + "\n"
        + "Permission to use, copy, modify, merge, publish, distribute, and sublicense this"
        + " Original Work and its documentation, with or without modification, for any purp"
        + "ose, and without fee or royalty to the copyright holder(s) is hereby granted, pr"
        + "ovided that you include the following on ALL copies of the Original Work or port"
        + "ions thereof, including modifications or derivatives, that you make: \n"
        + "\n"
        + "     The full text of the Educational Community License in a location viewable t"
        + "o users of the redistributed or derivative work. \n"
        + "\n"
        + "     Any pre-existing intellectual property disclaimers, notices, or terms and c"
        + "onditions. \n"
        + "\n"
        + "     Notice of any changes or modifications to the Original Work, including the "
        + "date the changes were made. \n"
        + "\n"
        + "     Any modifications of the Original Work must be distributed in such a manner"
        + " as to avoid any confusion with the Original Work of the copyright holders.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYR"
        + "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN "
        + "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WIT"
        + "H THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.\n"
        + "\n"
        + "The name and trademarks of copyright holder(s) may NOT be used in advertising or"
        + " publicity pertaining to the Original or Derivative Works without specific, writ"
        + "ten prior permission. Title to copyright in the Original Work and any associated"
        + " documentation will at all times remain with the copyright holders.\n"
; // the license text
    }
 
    
}
