package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:28:59Z
 * LicenseName: AGPL-3.0+
 * FileName: LPPL_1_2.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class LPPL_1_2 extends License{
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
        return "LPPL-1.2"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "LaTeX Project Public License v1.2"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "\n"
        + "The LaTeX Project Public License\n"
        + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
        + "\n"
        + "LPPL Version 1.2  1999-09-03\n"
        + "\n"
        + "Copyright 1999 LaTeX3 Project\n"
        + "    Everyone is allowed to distribute verbatim copies of this\n"
        + "    license document, but modification of it is not allowed.\n"
        + "\n"
        + "\n"
        + "PREAMBLE\n"
        + "========\n"
        + "\n"
        + "The LaTeX Project Public License (LPPL) is the license under which the\n"
        + "base LaTeX distribution is distributed.\n"
        + "\n"
        + "You may use this license for any program that you have written and wish\n"
        + "to distribute.  This license may be particularly suitable if your\n"
        + "program is TeX-related (such as a LaTeX package), but you may use it\n"
        + "even if your program is unrelated to TeX.  The section `WHETHER AND HOW\n"
        + "TO DISTRIBUTE PROGRAMS UNDER THIS LICENSE', below, gives instructions,\n"
        + "examples, and recommendations for authors who are considering\n"
        + "distributing their programs under this license.\n"
        + "\n"
        + "In this license document, `The Program' refers to any program\n"
        + "distributed under this license.\n"
        + "\n"
        + "This license gives conditions under which The Program may be distributed\n"
        + "and conditions under which modified versions of The Program may be\n"
        + "distributed.  Individual files of The Program may bear supplementary\n"
        + "and/or superseding conditions on modification of themselves and on the\n"
        + "distribution of modified versions of themselves, but *no* file of The\n"
        + "Program may bear supplementary or superseding conditions on the\n"
        + "distribution of an unmodified copy of the file.  A distributor wishing\n"
        + "to distribute a complete, unmodified copy of The Program therefore\n"
        + "needs to check the conditions only in this license and nowhere else.\n"
        + "\n"
        + "Activities other than distribution and/or modification of The Program\n"
        + "are not covered by this license; they are outside its scope.  In\n"
        + "particular, the act of running The Program is not restricted.\n"
        + "\n"
        + "We, the LaTeX3 Project, believe that the conditions below give you\n"
        + "the freedom to make and distribute modified versions of The Program\n"
        + "that conform with whatever technical specifications you wish while\n"
        + "maintaining the availability, integrity, and reliability of\n"
        + "The Program.  If you do not see how to achieve your goal while \n"
        + "meeting these conditions, then read the document `cfgguide.tex'\n"
        + "in the base LaTeX distribution for suggestions.\n"
        + "\n"
        + "\n"
        + "CONDITIONS ON DISTRIBUTION AND MODIFICATION\n"
        + "===========================================\n"
        + "\n"
        + "You may distribute a complete, unmodified copy of The Program.\n"
        + "Distribution of only part of The Program is not allowed.\n"
        + "\n"
        + "You may not modify in any way a file of The Program that bears a legal\n"
        + "notice forbidding modification of that file.\n"
        + "\n"
        + "You may distribute a modified file of The Program if, and only if, the\n"
        + "following eight conditions are met:\n"
        + "\n"
        + "  1. You must meet any additional conditions borne by the file on the\n"
        + "     distribution of a modified version of the file as described below\n"
        + "     in the subsection `Additional Conditions on Individual Files of\n"
        + "     The Program'.\n"
        + " \n"
        + "  2. If the file is a LaTeX software file, then you must meet any\n"
        + "     applicable additional conditions on the distribution of a modified\n"
        + "     version of the file that are described below in the subsection\n"
        + "     `Additional Conditions on LaTeX Software Files'.\n"
        + " \n"
        + "  3. You must not distribute the modified file with the filename of the\n"
        + "     original file.\n"
        + " \n"
        + "  4. In the modified file, you must acknowledge the authorship and\n"
        + "     name of the original file, and the name (if any) of the program\n"
        + "     which contains it.\n"
        + " \n"
        + "  5. You must change any identification string in the file to indicate\n"
        + "     clearly that the modified file is not part of The Program.\n"
        + " \n"
        + "  6. You must change any addresses in the modified file for the\n"
        + "     reporting of errors in the file or in The Program generally to\n"
        + "     ensure that reports for files no longer maintained by the original\n"
        + "     maintainers will be directed to the maintainers of the modified\n"
        + "     files.\n"
        + " \n"
        + "  7. You must distribute the modified file under a license that forbids\n"
        + "     distribution both of the modified file and of any files derived\n"
        + "     from the modified file with the filename of the original file.\n"
        + " \n"
        + "  8. You must do either (A) or (B):\n"
        + "\n"
        + "       (A) distribute a copy of The Program (that is, a complete,\n"
        + "           unmodified copy of The Program) together with the modified\n"
        + "           file; if your distribution of the modified file is made by\n"
        + "           offering access to copy the modified file from a designated\n"
        + "           place, then offering equivalent access to copy The Program\n"
        + "           from the same place meets this condition, even though third\n"
        + "           parties are not compelled to copy The Program along with the\n"
        + "           modified file;\n"
        + "\n"
        + "       (B) provide to those who receive the modified file information\n"
        + "           that is sufficient for them to obtain a copy of The Program;\n"
        + "           for example, you may provide a Uniform Resource Locator (URL)\n"
        + "           for a site that you expect will provide them with a copy of \n"
        + "           The Program free of charge (either the version from which\n"
        + "           your modification is derived, or perhaps a later version).\n"
        + "\n"
        + "Note that in the above, `distribution' of a file means making the\n"
        + "file available to others by any means.  This includes, for instance,\n"
        + "installing the file on any machine in such a way that the file is\n"
        + "accessible by users other than yourself.  `Modification' of a file\n"
        + "means any procedure that produces a derivative file under any\n"
        + "applicable law -- that is, a file containing the original file or\n"
        + "a significant portion of it, either verbatim or with modifications\n"
        + "and/or translated into another language.\n"
        + "\n"
        + "Changing the name of a file (other than as necessitated by the file\n"
        + "conventions of the target file systems) is considered to be a\n"
        + "modification of the file.\n"
        + "\n"
        + "The distribution conditions in this license do not have to be\n"
        + "applied to files that have been modified in accordance with the\n"
        + "above conditions.  Note, however, that Condition 7. does apply to\n"
        + "any such modified file.\n"
        + "\n"
        + "The conditions above are not intended to prohibit, and hence do not\n"
        + "apply to, the updating, by any method, of a file so that it becomes\n"
        + "identical to the latest version of that file of The Program.\n"
        + "\n"
        + " \n"
        + "\n"
        + "A Recommendation on Modification Without Distribution\n"
        + "-----------------------------------------------------\n"
        + "\n"
        + "It is wise never to modify a file of The Program, even for your own\n"
        + "personal use, without also meeting the above eight conditions for\n"
        + "distributing the modified file.  While you might intend that such\n"
        + "modified files will never be distributed, often this will happen by\n"
        + "accident -- you may forget that you have modified the file; or it may\n"
        + "not occur to you when allowing others to access the modified file\n"
        + "that you are thus distributing it and violating the conditions of\n"
        + "this license.  It is usually in your best interest to keep your copy\n"
        + "of The Program identical with the public one.  Many programs provide\n"
        + "ways to control the behavior of that program without altering its\n"
        + "licensed files.\n"
        + "\n"
        + "\n"
        + "Additional Conditions on Individual Files of The Program\n"
        + "--------------------------------------------------------\n"
        + "\n"
        + "An individual file of The Program may bear additional conditions that\n"
        + "supplement and/or supersede the conditions in this license if, and only\n"
        + "if, such additional conditions exclusively concern modification of the\n"
        + "file or distribution of a modified version of the file.  The conditions\n"
        + "on individual files of The Program therefore may differ only with\n"
        + "respect to the kind and extent of modification of those files that\n"
        + "is allowed, and with respect to the distribution of modified versions\n"
        + "of those files.\n"
        + "\n"
        + "\n"
        + "Additional Conditions on LaTeX Software Files\n"
        + "---------------------------------------------\n"
        + "\n"
        + "If a file of The Program is intended to be used with LaTeX (that is,\n"
        + "if it is a LaTeX software file), then the following additional\n"
        + "conditions, which supplement and/or supersede the conditions\n"
        + "above, apply to the file according to its filename extension:\n"
        + "\n"
        + "  - You may not modify any file with filename extension `.ins' since\n"
        + "    these are installation files containing the legal notices that are\n"
        + "    placed in the files they generate.\n"
        + " \n"
        + "  - You may distribute modified versions of files with filename\n"
        + "    extension `.fd' (LaTeX font definition files) under the standard\n"
        + "    conditions of the LPPL as described above.  You may also distribute\n"
        + "    such modified LaTeX font definition files with their original names\n"
        + "    provided that:\n"
        + "    (1) the only changes to the original files either enable use of\n"
        + "        available fonts or prevent attempts to access unavailable fonts;\n"
        + "    (2) you also distribute the original, unmodified files (TeX input\n"
        + "        paths can be used to control which set of LaTeX font definition\n"
        + "        files is actually used by TeX).\n"
        + "\n"
        + "  - You may distribute modified versions of files with filename\n"
        + "    extension `.cfg' (configuration files) with their original names.\n"
        + "    The Program may (and usually will) specify the range of commands\n"
        + "    that are allowed in a particular configuration file.\n"
        + " \n"
        + "Because of portability and exchangeability issues in LaTeX software,\n"
        + "The LaTeX3 Project deprecates the distribution of modified versions of\n"
        + "components of LaTeX or of generally available contributed code for them,\n"
        + "but such distribution can meet the conditions of this license.\n"
        + "\n"
        + "\n"
        + "NO WARRANTY\n"
        + "===========\n"
        + "\n"
        + "There is no warranty for The Program.  Except when otherwise stated in\n"
        + "writing, The Copyright Holder provides The Program `as is', without\n"
        + "warranty of any kind, either expressed or implied, including, but not\n"
        + "limited to, the implied warranties of merchantability and fitness for\n"
        + "a particular purpose.  The entire risk as to the quality and performance\n"
        + "of The Program is with you.  Should The Program prove defective, you\n"
        + "assume the cost of all necessary servicing, repair, or correction.\n"
        + "\n"
        + "In no event unless agreed to in writing will The Copyright Holder, or\n"
        + "any author named in the files of The Program, or any other party who may\n"
        + "distribute and/or modify The Program as permitted above, be liable to\n"
        + "you for damages, including any general, special, incidental or\n"
        + "consequential damages arising out of any use of The Program or out of\n"
        + "inability to use The Program (including, but not limited to, loss of\n"
        + "data, data being rendered inaccurate, or losses sustained by anyone as\n"
        + "a result of any failure of The Program to operate with any other\n"
        + "programs), even if The Copyright Holder or said author or said other\n"
        + "party has been advised of the possibility of such damages.\n"
        + "\n"
        + "\n"
        + "WHETHER AND HOW TO DISTRIBUTE PROGRAMS UNDER THIS LICENSE\n"
        + "=========================================================\n"
        + "\n"
        + "This section contains important instructions, examples, and\n"
        + "recommendations for authors who are considering distributing their\n"
        + "programs under this license.  These authors are addressed as `you' in\n"
        + "this section.\n"
        + "\n"
        + "\n"
        + "Choosing This License or Another License\n"
        + "----------------------------------------\n"
        + "\n"
        + "If for any part of your program you want or need to use *distribution*\n"
        + "conditions that differ from those in this license, then do not refer to\n"
        + "this license anywhere in your program but instead distribute your\n"
        + "program under a different license.  You may use the text of this license\n"
        + "as a model for your own license, but your license should not refer to\n"
        + "the LPPL or otherwise give the impression that your program is\n"
        + "distributed under the LPPL.\n"
        + "\n"
        + "The document `modguide.tex' in the base LaTeX distribution explains\n"
        + "the motivation behind the conditions of this license.  It explains,\n"
        + "for example, why distributing LaTeX under the GNU General Public\n"
        + "License (GPL) was considered inappropriate.  Even if your program is\n"
        + "unrelated to LaTeX, the discussion in `modguide.tex' may still be\n"
        + "relevant, and authors intending to distribute their programs under any\n"
        + "license are encouraged to read it.\n"
        + "\n"
        + "\n"
        + "How to Use This License\n"
        + "-----------------------\n"
        + "\n"
        + "To use this license, place in each of the files of your program both\n"
        + "an explicit copyright notice including your name and the year and also\n"
        + "a statement that the distribution and/or modification of the file is\n"
        + "constrained by the conditions in this license.\n"
        + "\n"
        + "Here is an example of such a notice and statement:\n"
        + "\n"
        + "  %% pig.dtx\n"
        + "  %% Copyright 2001 M. Y. Name\n"
        + "  %\n"
        + "  % This program may be distributed and/or modified under the\n"
        + "  % conditions of the LaTeX Project Public License, either version 1.2\n"
        + "  % of this license or (at your option) any later version.\n"
        + "  % The latest version of this license is in\n"
        + "  %   http://www.latex-project.org/lppl.txt\n"
        + "  % and version 1.2 or later is part of all distributions of LaTeX \n"
        + "  % version 1999/12/01 or later.\n"
        + "  %\n"
        + "  % This program consists of the files pig.dtx and pig.ins\n"
        + "\n"
        + "Given such a notice and statement in a file, the conditions given in\n"
        + "this license document would apply, with `The Program' referring to the\n"
        + "two files `pig.dtx' and `pig.ins', and `The Copyright Holder' referring\n"
        + "to the person `M. Y. Name'.\n"
        + "\n"
        + "\n"
        + "Important Recommendations\n"
        + "-------------------------\n"
        + "\n"
        + " Defining What Constitutes The Program\n"
        + "\n"
        + "   The LPPL requires that distributions of The Program contain all the\n"
        + "   files of The Program.  It is therefore important that you provide a\n"
        + "   way for the licensee to determine which files constitute The Program.\n"
        + "   This could, for example, be achieved by explicitly listing all the\n"
        + "   files of The Program near the copyright notice of each file or by\n"
        + "   using a line like\n"
        + "\n"
        + "    % This program consists of all files listed in manifest.txt.\n"
        + "\n"
        + "   in that place.  In the absence of an unequivocal list it might be\n"
        + "   impossible for the licensee to determine what is considered by you\n"
        + "   to comprise The Program.\n"
        + "\n"
        + " Noting Exceptional Files\n"
        + "  \n"
        + "   If The Program contains any files bearing additional conditions on\n"
        + "   modification, or on distribution of modified versions, of those\n"
        + "   files (other than those listed in `Additional Conditions on LaTeX\n"
        + "   Software Files'), then it is recommended that The Program contain a\n"
        + "   prominent file that defines the exceptional conditions, and either\n"
        + "   lists the exceptional files or defines one or more categories of\n"
        + "   exceptional files.\n"
        + "\n"
        + "   Files containing the text of a license (such as this file) are\n"
        + "   often examples of files bearing more restrictive conditions on\n"
        + "   modification.  LaTeX configuration files (with filename extension\n"
        + "   `.cfg') are examples of files bearing less restrictive conditions\n"
        + "   on the distribution of a modified version of the file.  The\n"
        + "   additional conditions on LaTeX software given above are examples \n"
        + "   of declaring a category of files bearing exceptional additional\n"
        + "   conditions.\n"
; // the license text
    }
 
    
}
