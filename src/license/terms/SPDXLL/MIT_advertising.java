package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:04Z
 * LicenseName: AGPL-3.0+
 * FileName: MIT_advertising.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MIT_advertising extends License{
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
        return "MIT-advertising"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Enlightenment License (e16)"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (C) 2000-2008 Carsten Haitzler, Geoff Harrison and various contributor"
        + "s Copyright (C) 2004-2008 Kim Woelders\n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person obtaining a copy of "
        + "this software and associated documentation files (the \"Software\"), to deal in th"
        + "e Software without restriction, including without limitation the rights to use, "
        + "copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the "
        + "Software, and to permit persons to whom the Software is furnished to do so, subj"
        + "ect to the following conditions:\n"
        + "\n"
        + "The above copyright notice and this permission notice shall be included in all c"
        + "opies of the Software, its documentation and marketing & publicity materials, an"
        + "d acknowledgment shall be given in the documentation, materials and software pac"
        + "kages that this Software was used.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS BE LIABL"
        + "E FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T"
        + "ORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE"
        + " USE OR OTHER DEALINGS IN THE SOFTWARE.\n"
; // the license text
    }
 
    
}
