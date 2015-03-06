package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:44Z
 * LicenseName: AGPL-3.0+
 * FileName: libtiff.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class libtiff extends License{
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
        return "libtiff"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "libtiff License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1988-1997 Sam Leffler\n"
        + "Copyright (c) 1991-1997 Silicon Graphics, Inc.\n"
        + "\n"
        + "Permission to use, copy, modify, distribute, and sell this software and its docu"
        + "mentation for any purpose is hereby granted without fee, provided that (i) the a"
        + "bove copyright notices and this permission notice appear in all copies of the so"
        + "ftware and related documentation, and (ii) the names of Sam Leffler and Silicon "
        + "Graphics may not be used in any advertising or publicity relating to the softwar"
        + "e without the specific, prior written permission of Sam Leffler and Silicon Grap"
        + "hics.\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED \"AS-IS\" AND WITHOUT WARRANTY OF ANY KIND, EXPRESS, IMPL"
        + "IED OR OTHERWISE, INCLUDING WITHOUT LIMITATION, ANY WARRANTY OF MERCHANTABILITY "
        + "OR FITNESS FOR A PARTICULAR PURPOSE.\n"
        + "\n"
        + "IN NO EVENT SHALL SAM LEFFLER OR SILICON GRAPHICS BE LIABLE FOR ANY SPECIAL, INC"
        + "IDENTAL, INDIRECT OR CONSEQUENTIAL DAMAGES OF ANY KIND, OR ANY DAMAGES WHATSOEVE"
        + "R RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER OR NOT ADVISED OF THE POS"
        + "SIBILITY OF DAMAGE, AND ON ANY THEORY OF LIABILITY, ARISING OUT OF OR IN CONNECT"
        + "ION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.\n"
; // the license text
    }
 
    
}
