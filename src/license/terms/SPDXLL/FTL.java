package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:11Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: FTL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class FTL extends License{
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
        return "FTL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Freetype Project License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The FreeType Project LICENSE \n"
        + "\n"
        + "2006-Jan-27\n"
        + "\n"
        + "Copyright 1996-2002, 2006 by David Turner, Robert Wilhelm, and Werner Lemberg \n"
        + "\n"
        + "Introduction \n"
        + "\n"
        + "The FreeType Project is distributed in several archive packages; some of them ma"
        + "y contain, in addition to the FreeType font engine, various tools and contributi"
        + "ons which rely on, or relate to, the FreeType Project.\n"
        + "\n"
        + "This license applies to all files found in such packages, and which do not fall "
        + "under their own explicit license. The license affects thus the FreeType font eng"
        + "ine, the test programs, documentation and makefiles, at the very least.\n"
        + "\n"
        + "This license was inspired by the BSD, Artistic, and IJG (Independent JPEG Group)"
        + " licenses, which all encourage inclusion and use of free software in commercial "
        + "and freeware products alike. As a consequence, its main points are that:\n"
        + "\n"
        + "     o We don't promise that this software works. However, we will be interested"
        + " in any kind of bug reports. (`as is' distribution)\n"
        + "\n"
        + "     o You can use this software for whatever you want, in parts or full form, w"
        + "ithout having to pay us. (`royalty-free' usage)\n"
        + "\n"
        + "     o You may not pretend that you wrote this software. If you use it, or only "
        + "parts of it, in a program, you must acknowledge somewhere in your documentation "
        + "that you have used the FreeType code. (`credits')\n"
        + "\n"
        + "We specifically permit and encourage the inclusion of this software, with or wit"
        + "hout modifications, in commercial products. We disclaim all warranties covering "
        + "The FreeType Project and assume no liability related to The FreeType Project. \n"
        + "\n"
        + "Finally, many people asked us for a preferred form for a credit/disclaimer to us"
        + "e in compliance with this license. We thus encourage you to use the following te"
        + "xt:\n"
        + "\n"
        + "     \"\"\" Portions of this software are copyright © <year> The FreeType Project ("
        + "www.freetype.org). All rights reserved. \"\"\"\n"
        + "\n"
        + "Please replace <year> with the value from the FreeType version you actually use."
        + " \n"
        + "\n"
        + "Legal Terms \n"
        + "\n"
        + "0. Definitions \n"
        + "\n"
        + "Throughout this license, the terms `package', `FreeType Project', and `FreeType "
        + "archive' refer to the set of files originally distributed by the authors (David "
        + "Turner, Robert Wilhelm, and Werner Lemberg) as the `FreeType Project', be they n"
        + "amed as alpha, beta or final release.\n"
        + "\n"
        + "`You' refers to the licensee, or person using the project, where `using' is a ge"
        + "neric term including compiling the project's source code as well as linking it t"
        + "o form a `program' or `executable'. This program is referred to as `a program us"
        + "ing the FreeType engine'.\n"
        + "\n"
        + "This license applies to all files distributed in the original FreeType Project, "
        + "including all source code, binaries and documentation, unless otherwise stated i"
        + "n the file in its original, unmodified form as distributed in the original archi"
        + "ve. If you are unsure whether or not a particular file is covered by this licens"
        + "e, you must contact us to verify this.\n"
        + "\n"
        + "The FreeType Project is copyright (C) 1996-2000 by David Turner, Robert Wilhelm,"
        + " and Werner Lemberg. All rights reserved except as specified below.\n"
        + "\n"
        + "1. No Warranty \n"
        + "\n"
        + "THE FREETYPE PROJECT IS PROVIDED `AS IS' WITHOUT WARRANTY OF ANY KIND, EITHER EX"
        + "PRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, WARRANTIES OF MERCHANTABILITY A"
        + "ND FITNESS FOR A PARTICULAR PURPOSE. IN NO EVENT WILL ANY OF THE AUTHORS OR COPY"
        + "RIGHT HOLDERS BE LIABLE FOR ANY DAMAGES CAUSED BY THE USE OR THE INABILITY TO US"
        + "E, OF THE FREETYPE PROJECT.\n"
        + "\n"
        + "2. Redistribution\n"
        + "\n"
        + "This license grants a worldwide, royalty-free, perpetual and irrevocable right a"
        + "nd license to use, execute, perform, compile, display, copy, create derivative w"
        + "orks of, distribute and sublicense the FreeType Project (in both source and obje"
        + "ct code forms) and derivative works thereof for any purpose; and to authorize ot"
        + "hers to exercise some or all of the rights granted herein, subject to the follow"
        + "ing conditions:\n"
        + "\n"
        + "     o Redistribution of source code must retain this license file (`FTL.TXT') u"
        + "naltered; any additions, deletions or changes to the original files must be clea"
        + "rly indicated in accompanying documentation. The copyright notices of the unalte"
        + "red, original files must be preserved in all copies of source files.\n"
        + "\n"
        + "     o Redistribution in binary form must provide a disclaimer that states that "
        + "the software is based in part of the work of the FreeType Team, in the distribut"
        + "ion documentation. We also encourage you to put an URL to the FreeType web page "
        + "in your documentation, though this isn't mandatory.\n"
        + "\n"
        + "These conditions apply to any software derived from or based on the FreeType Pro"
        + "ject, not just the unmodified files. If you use our work, you must acknowledge u"
        + "s. However, no fee need be paid to us.\n"
        + "\n"
        + "3. Advertising \n"
        + "\n"
        + "Neither the FreeType authors and contributors nor you shall use the name of the "
        + "other for commercial, advertising, or promotional purposes without specific prio"
        + "r written permission.\n"
        + "\n"
        + "We suggest, but do not require, that you use one or more of the following phrase"
        + "s to refer to this software in your documentation or advertising materials: `Fre"
        + "eType Project', `FreeType Engine', `FreeType library', or `FreeType Distribution"
        + "'.\n"
        + "\n"
        + "As you have not signed this license, you are not required to accept it. However,"
        + " as the FreeType Project is copyrighted material, only this license, or another "
        + "one contracted with the authors, grants you the right to use, distribute, and mo"
        + "dify it. Therefore, by using, distributing, or modifying the FreeType Project, y"
        + "ou indicate that you understand and accept all the terms of this license.\n"
        + "\n"
        + "4. Contacts \n"
        + "\n"
        + "There are two mailing lists related to FreeType:\n"
        + "\n"
        + "     o freetype@nongnu.org\n"
        + "\n"
        + "     Discusses general use and applications of FreeType, as well as future and w"
        + "anted additions to the library and distribution. If you are looking for support,"
        + " start in this list if you haven't found anything to help you in the documentati"
        + "on.\n"
        + "\n"
        + "     o freetype-devel@nongnu.org\n"
        + "\n"
        + "     Discusses bugs, as well as engine internals, design issues, specific licens"
        + "es, porting, etc.\n"
        + "\n"
        + "Our home page can be found at\n"
        + "\n"
        + " http://www.freetype.org \n"
        + "\n"
        + "--- end of FTL.TXT --- \n"
; // the license text
    }
 
    
}
