package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:34Z
 * LicenseName: AGPL-3.0+
 * FileName: Unlicense.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Unlicense extends License{
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
        return "Unlicense"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "The Unlicense"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This is free and unencumbered software released into the public domain.\n"
        + "\n"
        + "Anyone is free to copy, modify, publish, use, compile, sell, or distribute this "
        + "software, either in source code form or as a compiled binary, for any purpose, c"
        + "ommercial or non-commercial, and by any means.\n"
        + "\n"
        + "In jurisdictions that recognize copyright laws, the author or authors of this so"
        + "ftware dedicate any and all copyright interest in the software to the public dom"
        + "ain. We make this dedication for the benefit of the public at large and to the d"
        + "etriment of our heirs and\n"
        + "successors. We intend this dedication to be an overt act of relinquishment in pe"
        + "rpetuity of all present and future rights to this software under copyright law.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS BE LIABL"
        + "E FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T"
        + "ORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE"
        + " USE OR OTHER DEALINGS IN THE SOFTWARE.\n"
        + "\n"
        + "For more information, please refer to <http://unlicense.org/>\n"
; // the license text
    }
 
    
}
