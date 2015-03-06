package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:35Z
 * LicenseName: AGPL-3.0+
 * FileName: BSL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class BSL_1_0 extends License{
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
        return "BSL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Boost Software License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Boost Software License - Version 1.0 - August 17th, 2003\n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person or organization obta"
        + "ining a copy of the software and accompanying documentation covered by this lice"
        + "nse (the \"Software\") to use, reproduce, display, distribute, execute, and transm"
        + "it the Software, and to prepare derivative works of the Software, and to permit "
        + "third-parties to whom the Software is furnished to do so, all subject to the fol"
        + "lowing:\n"
        + "\n"
        + "The copyright notices in the Software and this entire statement, including the a"
        + "bove license grant, this restriction and the following disclaimer, must be inclu"
        + "ded in all copies of the Software, in whole or in part, and all derivative works"
        + " of the Software, unless such copies or derivative works are solely in the form "
        + "of machine-executable object code generated by a source language processor.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLI"
        + "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR "
        + "A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE COPYRIGH"
        + "T HOLDERS OR ANYONE DISTRIBUTING THE SOFTWARE BE LIABLE FOR ANY DAMAGES OR OTHER"
        + " LIABILITY, WHETHER IN CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN C"
        + "ONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.\n"
; // the license text
    }
 
    
}
