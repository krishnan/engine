package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:13Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: PHP_3_01.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class PHP_3_01 extends License{
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
        return "PHP-3.01"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "PHP License v3.01"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The PHP License, version 3.01\n"
        + "\n"
        + "Copyright (c) 1999 - 2012 The PHP Group. All rights reserved. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " is permitted provided that the following conditions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain the above copyright notice, this l"
        + "ist of conditions and the following disclaimer. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution. \n"
        + "\n"
        + "3. The name \"PHP\" must not be used to endorse or promote products derived from t"
        + "his software without prior written permission. For written permission, please co"
        + "ntact group@php.net. \n"
        + "\n"
        + "4. Products derived from this software may not be called \"PHP\", nor may \"PHP\" ap"
        + "pear in their name, without prior written permission from group@php.net. You may"
        + " indicate that your software works in conjunction with PHP by saying \"Foo for PH"
        + "P\" instead of calling it \"PHP Foo\" or \"phpfoo\" \n"
        + "\n"
        + "5. The PHP Group may publish revised and/or new versions of the license from tim"
        + "e to time. Each version will be given a distinguishing version number. Once cove"
        + "red code has been published under a particular version of the license, you may a"
        + "lways continue to use it under the terms of that version. You may also choose to"
        + " use such covered code under the terms of any subsequent version of the license "
        + "published by the PHP Group. No one other than the PHP Group has the right to mod"
        + "ify the terms applicable to covered code created under this License.\n"
        + "\n"
        + "6. Redistributions of any form whatsoever must retain the following acknowledgme"
        + "nt: \"This product includes PHP software, freely available from <http://www.php.n"
        + "et/software/>\".\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE PHP DEVELOPMENT TEAM ``AS IS'' AND ANY EXPRESSE"
        + "D OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES O"
        + "F MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVE"
        + "NT SHALL THE PHP DEVELOPMENT TEAM OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, "
        + "INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, B"
        + "UT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DAT"
        + "A, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIA"
        + "BILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR "
        + "OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED O"
        + "F THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "This software consists of voluntary contributions made by many individuals on be"
        + "half of the PHP Group.\n"
        + "\n"
        + "The PHP Group can be contacted via Email at group@php.net.\n"
        + "\n"
        + "For more information on the PHP Group and the PHP project, please see <http://ww"
        + "w.php.net>.\n"
        + "\n"
        + "PHP includes the Zend Engine, freely available at <http://www.zend.com>. \n"
; // the license text
    }
 
    
}
