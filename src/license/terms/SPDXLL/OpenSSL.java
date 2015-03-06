package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:12Z
 * LicenseName: AGPL-3.0+
 * FileName: OpenSSL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OpenSSL extends License{
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
        return "OpenSSL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "OpenSSL License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "OpenSSL License\n"
        + "\n"
        + "Copyright (c) 1998-2008 The OpenSSL Project. All rights reserved. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met: \n"
        + "\n"
        + "1. Redistributions of source code must retain the above copyright notice, this l"
        + "ist of conditions and the following disclaimer. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution. \n"
        + "\n"
        + "3. All advertising materials mentioning features or use of this software must di"
        + "splay the following acknowledgment: \"This product includes software developed by"
        + " the OpenSSL Project for use in the OpenSSL Toolkit. (http://www.openssl.org/)\" \n"
        + "\n"
        + "4. The names \"OpenSSL Toolkit\" and \"OpenSSL Project\" must not be used to endorse"
        + " or promote products derived from this software without prior written permission"
        + ". For written permission, please contact openssl-core@openssl.org. \n"
        + "\n"
        + "5. Products derived from this software may not be called \"OpenSSL\" nor may \"Open"
        + "SSL\" appear in their names without prior written permission of the OpenSSL Proje"
        + "ct. \n"
        + "\n"
        + "6. Redistributions of any form whatsoever must retain the following acknowledgme"
        + "nt: \"This product includes software developed by the OpenSSL Project for use in "
        + "the OpenSSL Toolkit (http://www.openssl.org/)\" \n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE OpenSSL PROJECT ``AS IS'' AND ANY EXPRESSED OR "
        + "IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MER"
        + "CHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SH"
        + "ALL THE OpenSSL PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, "
        + "INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIM"
        + "ITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROF"
        + "ITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WH"
        + "ETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)"
        + " ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSS"
        + "IBILITY OF SUCH DAMAGE. \n"
        + "\n"
        + "This product includes cryptographic software written by Eric Young (eay@cryptsof"
        + "t.com). This product includes software written by Tim Hudson (tjh@cryptsoft.com)"
        + ". \n"
        + "\n"
        + "\n"
        + "Original SSLeay License \n"
        + "\n"
        + "Copyright (C) 1995-1998 Eric Young (eay@cryptsoft.com) All rights reserved. \n"
        + "\n"
        + "This package is an SSL implementation written by Eric Young (eay@cryptsoft.com)."
        + " The implementation was written so as to conform with Netscapes SSL. \n"
        + "\n"
        + "This library is free for commercial and non-commercial use as long as the follow"
        + "ing conditions are aheared to. The following conditions apply to all code found "
        + "in this distribution, be it the RC4, RSA, lhash, DES, etc., code; not just the S"
        + "SL code. The SSL documentation included with this distribution is covered by the"
        + " same copyright terms except that the holder is Tim Hudson (tjh@cryptsoft.com). \n"
        + "\n"
        + "Copyright remains Eric Young's, and as such any Copyright notices in the code ar"
        + "e not to be removed. If this package is used in a product, Eric Young should be "
        + "given attribution as the author of the parts of the library used. This can be in"
        + " the form of a textual message at program startup or in documentation (online or"
        + " textual) provided with the package. \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met: \n"
        + "\n"
        + "1. Redistributions of source code must retain the copyright notice, this list of"
        + " conditions and the following disclaimer. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution. \n"
        + "\n"
        + "3. All advertising materials mentioning features or use of this software must di"
        + "splay the following acknowledgement: \n"
        + "\"This product includes cryptographic software written by Eric Young (eay@cryptso"
        + "ft.com)\" \n"
        + "The word 'cryptographic' can be left out if the rouines from the library being u"
        + "sed are not cryptographic related :-). \n"
        + "\n"
        + "4. If you include any Windows specific code (or a derivative thereof) from the a"
        + "pps directory (application code) you must include an acknowledgement: \"This prod"
        + "uct includes software written by Tim Hudson (tjh@cryptsoft.com)\" \n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY ERIC YOUNG ``AS IS'' AND ANY EXPRESS OR IMPLIED WAR"
        + "RANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILIT"
        + "Y AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUT"
        + "HOR OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXE"
        + "MPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF "
        + "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRU"
        + "PTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRIC"
        + "T LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT "
        + "OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. \n"
        + "\n"
        + "The licence and distribution terms for any publically available version or deriv"
        + "ative of this code cannot be changed. i.e. this code cannot simply be copied and"
        + " put under another distribution licence [including the GNU Public Licence.] \n"
; // the license text
    }
 
    
}
