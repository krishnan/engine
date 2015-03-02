package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:40Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LPPL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class LPPL_1_1 extends License{
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
        return "LPPL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "LaTeX Project Public License v1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The LaTeX Project Public License \n"
        + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
        + "\n"
        + "LPPL Version 1.1 1999-07-10\n"
        + "\n"
        + "Copyright 1999 LaTeX3 Project \n"
        + "\n"
        + "Everyone is allowed to distribute verbatim copies of this license document, but "
        + "modification of it is not allowed. \n"
        + "\n"
        + "PREAMBLE \n"
        + "========\n"
        + "\n"
        + "The LaTeX Project Public License (LPPL) is the license under which the base LaTe"
        + "X distribution is distributed.\n"
        + "\n"
        + "You may use this license for any program that you have written and wish to distr"
        + "ibute. This license may be particularly suitable if your program is TeX-related "
        + "(such as a LaTeX package), but you may use it even if your program is unrelated "
        + "to TeX. The section `WHETHER AND HOW TO DISTRIBUTE PROGRAMS UNDER THIS LICENSE',"
        + " below, gives instructions, examples, and recommendations for authors who are co"
        + "nsidering distributing their programs under this license.\n"
        + "\n"
        + "In this license document, `The Program' refers to any program distributed under "
        + "this license.\n"
        + "\n"
        + "This license gives conditions under which The Program may be distributed and con"
        + "ditions under which modified versions of The Program may be distributed. Individ"
        + "ual files of The Program may bear supplementary and/or superseding conditions on"
        + " modification of themselves and on the distribution of modified versions of them"
        + "selves, but *no* file of The Program may bear supplementary or superseding condi"
        + "tions on the distribution of an unmodified copy of the file. A distributor wishi"
        + "ng to distribute a complete, unmodified copy of The Program therefore needs to c"
        + "heck the conditions only in this license and nowhere else.\n"
        + "\n"
        + "Activities other than distribution and/or modification of The Program are not co"
        + "vered by this license; they are outside its scope. In particular, the act of run"
        + "ning The Program is not restricted.\n"
        + "\n"
        + "We, the LaTeX3 Project, believe that the conditions below give you the freedom t"
        + "o make and distribute modified versions of The Program that conform with whateve"
        + "r technical specifications you wish while maintaining the availability, integrit"
        + "y, and reliability of The Program. If you do not see how to achieve your goal wh"
        + "ile meeting these conditions, then read the document `cfgguide.tex' in the base "
        + "LaTeX distribution for suggestions. \n"
        + "\n"
        + "CONDITIONS ON DISTRIBUTION AND MODIFICATION \n"
        + "===========================================\n"
        + "\n"
        + "You may distribute a complete, unmodified copy of The Program. Distribution of o"
        + "nly part of The Program is not allowed.\n"
        + "\n"
        + "You may not modify in any way a file of The Program that bears a legal notice fo"
        + "rbidding modification of that file.\n"
        + "\n"
        + "You may distribute a modified file of The Program if, and only if, the following"
        + " eight conditions are met:\n"
        + "\n"
        + "     1. You must meet any additional conditions borne by the file on the distrib"
        + "ution of a modified version of the file as described below in the subsection `Ad"
        + "ditional Conditions on Individual Files of The Program'. \n"
        + "\n"
        + "     2. If the file is a LaTeX software file, then you must meet any applicable "
        + "additional conditions on the distribution of a modified version of the file that"
        + " are described below in the subsection `Additional Conditions on LaTeX Software "
        + "Files'. \n"
        + "\n"
        + "     3. You must not distribute the modified file with the filename of the origi"
        + "nal file. \n"
        + "\n"
        + "     4. In the modified file, you must acknowledge the authorship and name of th"
        + "e original file, and the name (if any) of the program which contains it. \n"
        + "\n"
        + "     5. You must change any identification string in the file to indicate clearl"
        + "y that the modified file is not part of The Program. \n"
        + "\n"
        + "     6. You must change any addresses in the modified file for the reporting of "
        + "errors in the file or in The Program generally to ensure that reports for files "
        + "no longer maintained by the original maintainers will be directed to the maintai"
        + "ners of the modified files. \n"
        + "\n"
        + "     7. You must distribute the modified file under a license that forbids distr"
        + "ibution both of the modified file and of any files derived from the modified fil"
        + "e with the filename of the original file. \n"
        + "\n"
        + "     8. You must do either (A) or (B):\n"
        + "\n"
        + "          (A) distribute a copy of The Program (that is, a complete, unmodified "
        + "copy of The Program) together with the modified file; if your distribution of th"
        + "e modified file is made by offering access to copy the modified file from a desi"
        + "gnated place, then offering equivalent access to copy The Program from the same "
        + "place meets this condition, even though third parties are not compelled to copy "
        + "The Program along with the modified file;\n"
        + "\n"
        + "          (B) provide to those who receive the modified file information that is"
        + " sufficient for them to obtain a copy of The Program; for example, you may provi"
        + "de a Uniform Resource Locator (URL) for a site that you expect will provide them"
        + " with a copy of The Program free of charge (either the version from which your m"
        + "odification is derived, or perhaps a later version).\n"
        + "\n"
        + "Note that in the above, `distribution' of a file means making the file available"
        + " to others by any means. This includes, for instance, installing the file on any"
        + " machine in such a way that the file is accessible by users other than yourself."
        + " `Modification' of a file means any procedure that produces a derivative file un"
        + "der any applicable law -- that is, a file containing the original file or a sign"
        + "ificant portion of it, either verbatim or with modifications and/or translated i"
        + "nto another language.\n"
        + "\n"
        + "Changing the name of a file is considered to be a modification of the file.\n"
        + "\n"
        + "The distribution conditions in this license do not have to be applied to files t"
        + "hat have been modified in accordance with the above conditions. Note, however, t"
        + "hat Condition 7. does apply to any such modified file.\n"
        + "\n"
        + "The conditions above are not intended to prohibit, and hence do not apply to, th"
        + "e updating, by any method, of a file so that it becomes identical to the latest "
        + "version of that file of The Program. \n"
        + "\n"
        + "A Recommendation on Modification Without Distribution \n"
        + "-----------------------------------------------------\n"
        + "\n"
        + "It is wise never to modify a file of The Program, even for your own personal use"
        + ", without also meeting the above eight conditions for distributing the modified "
        + "file. While you might intend that such modified files will never be distributed,"
        + " often this will happen by accident -- you may forget that you have modified the"
        + " file; or it may not occur to you when allowing others to access the modified fi"
        + "le that you are thus distributing it and violating the conditions of this licens"
        + "e. It is usually in your best interest to keep your copy of The Program identica"
        + "l with the public one. Many programs provide ways to control the behavior of tha"
        + "t program without altering its licensed files. \n"
        + "\n"
        + "Additional Conditions on Individual Files of The Program \n"
        + "--------------------------------------------------------\n"
        + "\n"
        + "An individual file of The Program may bear additional conditions that supplement"
        + " and/or supersede the conditions in this license if, and only if, such additiona"
        + "l conditions exclusively concern modification of the file or distribution of a m"
        + "odified version of the file. The conditions on individual files of The Program t"
        + "herefore may differ only with respect to the kind and extent of modification of "
        + "those files that is allowed, and with respect to the distribution of modified ve"
        + "rsions of those files. \n"
        + "\n"
        + "Additional Conditions on LaTeX Software Files \n"
        + "---------------------------------------------\n"
        + "\n"
        + "If a file of The Program is intended to be used with LaTeX (that is, if it is a "
        + "LaTeX software file), then the following additional conditions, which supplement"
        + " and/or supersede the conditions above, apply to the file according to its filen"
        + "ame extension:\n"
        + "\n"
        + "     - You may not modify any file with filename extension `.ins' since these ar"
        + "e installation files containing the legal notices that are placed in the files t"
        + "hey generate. \n"
        + "\n"
        + "     - You may distribute modified versions of files with filename extension `.f"
        + "d' (LaTeX font definition files) under the standard conditions of the LPPL as de"
        + "scribed above. You may also distribute such modified LaTeX font definition files"
        + " with their original names provided that: \n"
        + "          (1) the only changes to the original files either enable use of availa"
        + "ble fonts or prevent attempts to access unavailable fonts; \n"
        + "          (2) you also distribute the original, unmodified files (TeX input path"
        + "s can be used to control which set of LaTeX font definition files is actually us"
        + "ed by TeX).\n"
        + "\n"
        + "     - You may distribute modified versions of files with filename extension `.c"
        + "fg' (configuration files) with their original names. The Program may (and usuall"
        + "y will) specify the range of commands that are allowed in a particular configura"
        + "tion file. \n"
        + "\n"
        + "Because of portability and exchangeability issues in LaTeX software, The LaTeX3 "
        + "Project deprecates the distribution of modified versions of components of LaTeX "
        + "or of generally available contributed code for them, but such distribution can m"
        + "eet the conditions of this license. \n"
        + "\n"
        + "NO WARRANTY \n"
        + "===========\n"
        + "\n"
        + "There is no warranty for The Program. Except when otherwise stated in writing, T"
        + "he Copyright Holder provides The Program `as is', without warranty of any kind, "
        + "either expressed or implied, including, but not limited to, the implied warranti"
        + "es of merchantability and fitness for a particular purpose. The entire risk as t"
        + "o the quality and performance of The Program is with you. Should The Program pro"
        + "ve defective, you assume the cost of all necessary servicing, repair, or correct"
        + "ion.\n"
        + "\n"
        + "In no event unless agreed to in writing will The Copyright Holder, or any author"
        + " named in the files of The Program, or any other party who may distribute and/or"
        + " modify The Program as permitted below, be liable to you for damages, including "
        + "any general, special, incidental or consequential damages arising out of any use"
        + " of The Program or out of inability to use The Program (including, but not limit"
        + "ed to, loss of data, data being rendered inaccurate, or losses sustained by anyo"
        + "ne as a result of any failure of The Program to operate with any other programs)"
        + ", even if The Copyright Holder or said author or said other party has been advis"
        + "ed of the possibility of such damages. \n"
        + "\n"
        + "WHETHER AND HOW TO DISTRIBUTE PROGRAMS UNDER THIS LICENSE \n"
        + "=========================================================\n"
        + "\n"
        + "This section contains important instructions, examples, and recommendations for "
        + "authors who are considering distributing their programs under this license. Thes"
        + "e authors are addressed as `you' in this section. \n"
        + "\n"
        + "Choosing This License or Another License \n"
        + "----------------------------------------\n"
        + "\n"
        + "If for any part of your program you want or need to use *distribution* condition"
        + "s that differ from those in this license, then do not refer to this license anyw"
        + "here in your program but instead distribute your program under a different licen"
        + "se. You may use the text of this license as a model for your own license, but yo"
        + "ur license should not refer to the LPPL or otherwise give the impression that yo"
        + "ur program is distributed under the LPPL.\n"
        + "\n"
        + "The document `modguide.tex' in the base LaTeX distribution explains the motivati"
        + "on behind the conditions of this license. It explains, for example, why distribu"
        + "ting LaTeX under the GNU General Public License (GPL) was considered inappropria"
        + "te. Even if your program is unrelated to LaTeX, the discussion in `modguide.tex'"
        + " may still be relevant, and authors intending to distribute their programs under"
        + " any license are encouraged to read it. \n"
        + "\n"
        + "How to Use This License \n"
        + "-----------------------\n"
        + "\n"
        + "To use this license, place in each of the files of your program both an explicit"
        + " copyright notice including your name and the year and also a statement that the"
        + " distribution and/or modification of the file is constrained by the conditions i"
        + "n this license.\n"
        + "\n"
        + "Here is an example of such a notice and statement:\n"
        + "\n"
        + "     %% pig.dtx \n"
        + "     %% Copyright 2001 M. Y. Name \n"
        + "     % \n"
        + "     % This program may be distributed and/or modified under the \n"
        + "     % conditions of the LaTeX Project Public License, either version 1.1 \n"
        + "     % of this license or (at your option) any later version. \n"
        + "     % The latest version of this license is in % http://www.latex-project.org/l"
        + "ppl.txt \n"
        + "     % and version 1.1 or later is part of all distributions of LaTeX % version "
        + "1999/06/01 or later. \n"
        + "     % \n"
        + "     % This program consists of the files pig.dtx and pig.ins\n"
        + "\n"
        + "Given such a notice and statement in a file, the conditions given in this licens"
        + "e document would apply, with `The Program' referring to the two files `pig.dtx' "
        + "and `pig.ins', and `The Copyright Holder' referring to the person `M. Y. Name'. \n"
        + "\n"
        + "Important Recommendations \n"
        + "-------------------------\n"
        + "\n"
        + "Defining What Constitutes The Program\n"
        + "\n"
        + "The LPPL requires that distributions of The Program contain all the files of The"
        + " Program. It is therefore important that you provide a way for the licensee to d"
        + "etermine which files constitute The Program. This could, for example, be achieve"
        + "d by explicitly listing all the files of The Program near the copyright notice o"
        + "f each file or by using a line like\n"
        + "\n"
        + "      % This program consists of all files listed in manifest.txt.\n"
        + "\n"
        + "in that place. In the absence of an unequivocal list it might be impossible for "
        + "the licensee to determine what is considered by you to comprise The Program.\n"
        + "\n"
        + "Noting Exceptional Files \n"
        + "\n"
        + "If The Program contains any files bearing additional conditions on modification,"
        + " or on distribution of modified versions, of those files (other than those liste"
        + "d in `Additional Conditions on LaTeX Software Files'), then it is recommended th"
        + "at The Program contain a prominent file that defines the exceptional conditions,"
        + " and either lists the exceptional files or defines one or more categories of exc"
        + "eptional files.\n"
        + "\n"
        + "Files containing the text of a license (such as this file) are often examples of"
        + " files bearing more restrictive conditions on modification. LaTeX configuration "
        + "files (with filename extension `.cfg') are examples of files bearing less restri"
        + "ctive conditions on the distribution of a modified version of the file. The addi"
        + "tional conditions on LaTeX software given above are examples of declaring a cate"
        + "gory of files bearing exceptional additional conditions.\n"
; // the license text
    }
 
    
}
