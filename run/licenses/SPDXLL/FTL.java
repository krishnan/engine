package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:28:23Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: FTL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
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
        return "                    The FreeType Project LICENSE\n"
        + "                    ----------------------------\n"
        + "\n"
        + "                            2006-Jan-27\n"
        + "\n"
        + "                    Copyright 1996-2002, 2006 by\n"
        + "          David Turner, Robert Wilhelm, and Werner Lemberg\n"
        + "\n"
        + "\n"
        + "\n"
        + "Introduction\n"
        + "============\n"
        + "\n"
        + "  The FreeType  Project is distributed in  several archive packages;\n"
        + "  some of them may contain, in addition to the FreeType font engine,\n"
        + "  various tools and  contributions which rely on, or  relate to, the\n"
        + "  FreeType Project.\n"
        + "\n"
        + "  This  license applies  to all  files found  in such  packages, and\n"
        + "  which do not  fall under their own explicit  license.  The license\n"
        + "  affects  thus  the  FreeType   font  engine,  the  test  programs,\n"
        + "  documentation and makefiles, at the very least.\n"
        + "\n"
        + "  This  license   was  inspired  by  the  BSD,   Artistic,  and  IJG\n"
        + "  (Independent JPEG  Group) licenses, which  all encourage inclusion\n"
        + "  and  use of  free  software in  commercial  and freeware  products\n"
        + "  alike.  As a consequence, its main points are that:\n"
        + "\n"
        + "    o We don't promise that this software works. However, we will be\n"
        + "      interested in any kind of bug reports. (`as is' distribution)\n"
        + "\n"
        + "    o You can  use this software for whatever you  want, in parts or\n"
        + "      full form, without having to pay us. (`royalty-free' usage)\n"
        + "\n"
        + "    o You may not pretend that  you wrote this software.  If you use\n"
        + "      it, or  only parts of it,  in a program,  you must acknowledge\n"
        + "      somewhere  in  your  documentation  that  you  have  used  the\n"
        + "      FreeType code. (`credits')\n"
        + "\n"
        + "  We  specifically  permit  and  encourage  the  inclusion  of  this\n"
        + "  software, with  or without modifications,  in commercial products.\n"
        + "  We  disclaim  all warranties  covering  The  FreeType Project  and\n"
        + "  assume no liability related to The FreeType Project.\n"
        + "\n"
        + "\n"
        + "  Finally,  many  people  asked  us  for  a  preferred  form  for  a\n"
        + "  credit/disclaimer to use in compliance with this license.  We thus\n"
        + "  encourage you to use the following text:\n"
        + "\n"
        + "   \"\"\"  \n"
        + "    Portions of this software are copyright © <year> The FreeType\n"
        + "    Project (www.freetype.org).  All rights reserved.\n"
        + "   \"\"\"\n"
        + "\n"
        + "  Please replace <year> with the value from the FreeType version you\n"
        + "  actually use.\n"
        + "\n"
        + "\n"
        + "Legal Terms\n"
        + "===========\n"
        + "\n"
        + "0. Definitions\n"
        + "--------------\n"
        + "\n"
        + "  Throughout this license,  the terms `package', `FreeType Project',\n"
        + "  and  `FreeType  archive' refer  to  the  set  of files  originally\n"
        + "  distributed  by the  authors  (David Turner,  Robert Wilhelm,  and\n"
        + "  Werner Lemberg) as the `FreeType Project', be they named as alpha,\n"
        + "  beta or final release.\n"
        + "\n"
        + "  `You' refers to  the licensee, or person using  the project, where\n"
        + "  `using' is a generic term including compiling the project's source\n"
        + "  code as  well as linking it  to form a  `program' or `executable'.\n"
        + "  This  program is  referred to  as  `a program  using the  FreeType\n"
        + "  engine'.\n"
        + "\n"
        + "  This  license applies  to all  files distributed  in  the original\n"
        + "  FreeType  Project,   including  all  source   code,  binaries  and\n"
        + "  documentation,  unless  otherwise  stated   in  the  file  in  its\n"
        + "  original, unmodified form as  distributed in the original archive.\n"
        + "  If you are  unsure whether or not a particular  file is covered by\n"
        + "  this license, you must contact us to verify this.\n"
        + "\n"
        + "  The FreeType  Project is copyright (C) 1996-2000  by David Turner,\n"
        + "  Robert Wilhelm, and Werner Lemberg.  All rights reserved except as\n"
        + "  specified below.\n"
        + "\n"
        + "1. No Warranty\n"
        + "--------------\n"
        + "\n"
        + "  THE FREETYPE PROJECT  IS PROVIDED `AS IS' WITHOUT  WARRANTY OF ANY\n"
        + "  KIND, EITHER  EXPRESS OR IMPLIED,  INCLUDING, BUT NOT  LIMITED TO,\n"
        + "  WARRANTIES  OF  MERCHANTABILITY   AND  FITNESS  FOR  A  PARTICULAR\n"
        + "  PURPOSE.  IN NO EVENT WILL ANY OF THE AUTHORS OR COPYRIGHT HOLDERS\n"
        + "  BE LIABLE  FOR ANY DAMAGES CAUSED  BY THE USE OR  THE INABILITY TO\n"
        + "  USE, OF THE FREETYPE PROJECT.\n"
        + "\n"
        + "2. Redistribution\n"
        + "-----------------\n"
        + "\n"
        + "  This  license  grants  a  worldwide, royalty-free,  perpetual  and\n"
        + "  irrevocable right  and license to use,  execute, perform, compile,\n"
        + "  display,  copy,   create  derivative  works   of,  distribute  and\n"
        + "  sublicense the  FreeType Project (in  both source and  object code\n"
        + "  forms)  and  derivative works  thereof  for  any  purpose; and  to\n"
        + "  authorize others  to exercise  some or all  of the  rights granted\n"
        + "  herein, subject to the following conditions:\n"
        + "\n"
        + "    o Redistribution of  source code  must retain this  license file\n"
        + "      (`FTL.TXT') unaltered; any  additions, deletions or changes to\n"
        + "      the original  files must be clearly  indicated in accompanying\n"
        + "      documentation.   The  copyright   notices  of  the  unaltered,\n"
        + "      original  files must  be  preserved in  all  copies of  source\n"
        + "      files.\n"
        + "\n"
        + "    o Redistribution in binary form must provide a  disclaimer  that\n"
        + "      states  that  the software is based in part of the work of the\n"
        + "      FreeType Team,  in  the  distribution  documentation.  We also\n"
        + "      encourage you to put an URL to the FreeType web page  in  your\n"
        + "      documentation, though this isn't mandatory.\n"
        + "\n"
        + "  These conditions  apply to any  software derived from or  based on\n"
        + "  the FreeType Project,  not just the unmodified files.   If you use\n"
        + "  our work, you  must acknowledge us.  However, no  fee need be paid\n"
        + "  to us.\n"
        + "\n"
        + "3. Advertising\n"
        + "--------------\n"
        + "\n"
        + "  Neither the  FreeType authors and  contributors nor you  shall use\n"
        + "  the name of the  other for commercial, advertising, or promotional\n"
        + "  purposes without specific prior written permission.\n"
        + "\n"
        + "  We suggest,  but do not require, that  you use one or  more of the\n"
        + "  following phrases to refer  to this software in your documentation\n"
        + "  or advertising  materials: `FreeType Project',  `FreeType Engine',\n"
        + "  `FreeType library', or `FreeType Distribution'.\n"
        + "\n"
        + "  As  you have  not signed  this license,  you are  not  required to\n"
        + "  accept  it.   However,  as  the FreeType  Project  is  copyrighted\n"
        + "  material, only  this license, or  another one contracted  with the\n"
        + "  authors, grants you  the right to use, distribute,  and modify it.\n"
        + "  Therefore,  by  using,  distributing,  or modifying  the  FreeType\n"
        + "  Project, you indicate that you understand and accept all the terms\n"
        + "  of this license.\n"
        + "\n"
        + "4. Contacts\n"
        + "-----------\n"
        + "\n"
        + "  There are two mailing lists related to FreeType:\n"
        + "\n"
        + "    o freetype@nongnu.org\n"
        + "\n"
        + "      Discusses general use and applications of FreeType, as well as\n"
        + "      future and  wanted additions to the  library and distribution.\n"
        + "      If  you are looking  for support,  start in  this list  if you\n"
        + "      haven't found anything to help you in the documentation.\n"
        + "\n"
        + "    o freetype-devel@nongnu.org\n"
        + "\n"
        + "      Discusses bugs,  as well  as engine internals,  design issues,\n"
        + "      specific licenses, porting, etc.\n"
        + "\n"
        + "  Our home page can be found at\n"
        + "\n"
        + "    http://www.freetype.org\n"
        + "\n"
        + "\n"
        + "--- end of FTL.TXT ---\n"
; // the license text
    }
 
    
}
