package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:36Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: IJG.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class IJG extends License{
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
        return "IJG"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Independent JPEG Group License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Independent JPEG Group License \n"
        + "\n"
        + "LEGAL ISSUES \n"
        + "\n"
        + "In plain English:\n"
        + "\n"
        + "1. We don't promise that this software works. (But if you find any bugs, please "
        + "let us know!) \n"
        + "2. You can use this software for whatever you want. You don't have to pay us. \n"
        + "3. You may not pretend that you wrote this software. If you use it in a program,"
        + " you must acknowledge somewhere in your documentation that you've used the IJG c"
        + "ode.\n"
        + "\n"
        + "In legalese:\n"
        + "\n"
        + "The authors make NO WARRANTY or representation, either express or implied, with "
        + "respect to this software, its quality, accuracy, merchantability, or fitness for"
        + " a particular purpose. This software is provided \"AS IS\", and you, its user, ass"
        + "ume the entire risk as to its quality and accuracy.\n"
        + "\n"
        + "This software is copyright (C) 1991-1998, Thomas G. Lane. All Rights Reserved ex"
        + "cept as specified below.\n"
        + "\n"
        + "Permission is hereby granted to use, copy, modify, and distribute this software "
        + "(or portions thereof) for any purpose, without fee, subject to these conditions:"
        + "    \n"
        + "\n"
        + "     (1) If any part of the source code for this software is distributed, then t"
        + "his README file must be included, with this copyright and no-warranty notice una"
        + "ltered; and any additions, deletions, or changes to the original files must be c"
        + "learly indicated in accompanying documentation. \n"
        + "     (2) If only executable code is distributed, then the accompanying documenta"
        + "tion must state that \"this software is based in part on the work of the Independ"
        + "ent JPEG Group\". \n"
        + "     (3) Permission for use of this software is granted only if the user accepts"
        + " full responsibility for any undesirable consequences; the authors accept NO LIA"
        + "BILITY for damages of any kind.\n"
        + "\n"
        + "These conditions apply to any software derived from or based on the IJG code, no"
        + "t just to the unmodified library. If you use our work, you ought to acknowledge "
        + "us.\n"
        + "\n"
        + "Permission is NOT granted for the use of any IJG author's name or company name i"
        + "n advertising or publicity relating to this software or products derived from it"
        + ". This software may be referred to only as \"the Independent JPEG Group's softwar"
        + "e\".\n"
        + "\n"
        + "We specifically permit and encourage the use of this software as the basis of co"
        + "mmercial products, provided that all warranty or liability claims are assumed by"
        + " the product vendor. \n"
        + "\n"
        + "ansi2knr.c is included in this distribution by permission of L. Peter Deutsch, s"
        + "ole proprietor of its copyright holder, Aladdin Enterprises of Menlo Park, CA. a"
        + "nsi2knr.c is NOT covered by the above copyright and conditions, but instead by t"
        + "he usual distribution terms of the Free Software Foundation; principally, that y"
        + "ou must include source code if you redistribute it. (See the file ansi2knr.c for"
        + " full details.) However, since ansi2knr.c is not needed as part of any program g"
        + "enerated from the IJG code, this does not limit you more than the foregoing para"
        + "graphs do.\n"
        + "\n"
        + "The Unix configuration script \"configure\" was produced with GNU Autoconf. It is "
        + "copyright by the Free Software Foundation but is freely distributable. The same "
        + "holds for its supporting scripts (config.guess, config.sub, ltconfig, ltmain.sh)"
        + ". Another support script, install-sh, is copyright by M.I.T. but is also freely "
        + "distributable.\n"
        + "\n"
        + "It appears that the arithmetic coding option of the JPEG spec is covered by pate"
        + "nts owned by IBM, AT&T, and Mitsubishi. Hence arithmetic coding cannot legally b"
        + "e used without obtaining one or more licenses. For this reason, support for arit"
        + "hmetic coding has been removed from the free JPEG software. (Since arithmetic co"
        + "ding provides only a marginal gain over the unpatented Huffman mode, it is unlik"
        + "ely that very many implementations will support it.) So far as we are aware, the"
        + "re are no patent restrictions on the remaining code.\n"
        + "\n"
        + "The IJG distribution formerly included code to read and write GIF files. To avoi"
        + "d entanglement with the Unisys LZW patent, GIF reading support has been removed "
        + "altogether, and the GIF writer has been simplified to produce \"uncompressed GIFs"
        + "\". This technique does not use the LZW algorithm; the resulting GIF files are la"
        + "rger than usual, but are readable by all standard GIF decoders.\n"
        + "\n"
        + "We are required to state that \n"
        + "     \"The Graphics Interchange Format(c) is the Copyright property of CompuServe"
        + " Incorporated. GIF(sm) is a Service Mark property of CompuServe Incorporated.\" \n"
; // the license text
    }
 
    
}
