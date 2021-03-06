package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:42Z
 * LicenseName: AGPL-3.0+
 * FileName: LPPL_1_3c.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class LPPL_1_3c extends License{
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
        return "LPPL-1.3c"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "LaTeX Project Public License v1.3c"; // full text title
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
        + "LPPL Version 1.3c 2008-05-04\n"
        + "\n"
        + "Copyright 1999 2002-2008 LaTeX3 Project \n"
        + "\n"
        + "Everyone is allowed to distribute verbatim copies of this license document, but "
        + "modification of it is not allowed. \n"
        + "\n"
        + "PREAMBLE \n"
        + "========\n"
        + "\n"
        + "The LaTeX Project Public License (LPPL) is the primary license under which the L"
        + "aTeX kernel and the base LaTeX packages are distributed.\n"
        + "\n"
        + "You may use this license for any work of which you hold the copyright and which "
        + "you wish to distribute. This license may be particularly suitable if your work i"
        + "s TeX-related (such as a LaTeX package), but it is written in such a way that yo"
        + "u can use it even if your work is unrelated to TeX.\n"
        + "\n"
        + "The section `WHETHER AND HOW TO DISTRIBUTE WORKS UNDER THIS LICENSE', below, giv"
        + "es instructions, examples, and recommendations for authors who are considering d"
        + "istributing their works under this license.\n"
        + "\n"
        + "This license gives conditions under which a work may be distributed and modified"
        + ", as well as conditions under which modified versions of that work may be distri"
        + "buted.\n"
        + "\n"
        + "We, the LaTeX3 Project, believe that the conditions below give you the freedom t"
        + "o make and distribute modified versions of your work that conform with whatever "
        + "technical specifications you wish while maintaining the availability, integrity,"
        + " and reliability of that work. If you do not see how to achieve your goal while "
        + "meeting these conditions, then read the document `cfgguide.tex' and `modguide.te"
        + "x' in the base LaTeX distribution for suggestions. \n"
        + "\n"
        + "DEFINITIONS \n"
        + "===========\n"
        + "\n"
        + "In this license document the following terms are used:\n"
        + "\n"
        + "`Work' Any work being distributed under this License. `Derived Work' Any work th"
        + "at under any applicable law is derived from the Work.\n"
        + "\n"
        + "`Modification' Any procedure that produces a Derived Work under any applicable l"
        + "aw -- for example, the production of a file containing an original file associat"
        + "ed with the Work or a significant portion of such a file, either verbatim or wit"
        + "h modifications and/or translated into another language.\n"
        + "\n"
        + "`Modify' To apply any procedure that produces a Derived Work under any applicabl"
        + "e law. `Distribution' Making copies of the Work available from one person to ano"
        + "ther, in whole or in part. Distribution includes (but is not limited to) making "
        + "any electronic components of the Work accessible by file transfer protocols such"
        + " as FTP or HTTP or by shared file systems such as Sun's Network File System (NFS"
        + ").\n"
        + "\n"
        + "`Compiled Work' A version of the Work that has been processed into a form where "
        + "it is directly usable on a computer system. This processing may include using in"
        + "stallation facilities provided by the Work, transformations of the Work, copying"
        + " of components of the Work, or other activities. Note that modification of any i"
        + "nstallation facilities provided by the Work constitutes modification of the Work"
        + ".\n"
        + "\n"
        + "`Current Maintainer' A person or persons nominated as such within the Work. If t"
        + "here is no such explicit nomination then it is the `Copyright Holder' under any "
        + "applicable law.\n"
        + "\n"
        + "`Base Interpreter' A program or process that is normally needed for running or i"
        + "nterpreting a part or the whole of the Work. \n"
        + "\n"
        + "A Base Interpreter may depend on external components but these are not considere"
        + "d part of the Base Interpreter provided that each external component clearly ide"
        + "ntifies itself whenever it is used interactively. Unless explicitly specified wh"
        + "en applying the license to the Work, the only applicable Base Interpreter is a `"
        + "LaTeX-Format' or in the case of files belonging to the `LaTeX-format' a program "
        + "implementing the `TeX language'. \n"
        + "\n"
        + "CONDITIONS ON DISTRIBUTION AND MODIFICATION \n"
        + "===========================================\n"
        + "\n"
        + "1. Activities other than distribution and/or modification of the Work are not co"
        + "vered by this license; they are outside its scope. In particular, the act of run"
        + "ning the Work is not restricted and no requirements are made concerning any offe"
        + "rs of support for the Work.\n"
        + "\n"
        + "2. You may distribute a complete, unmodified copy of the Work as you received it"
        + ". Distribution of only part of the Work is considered modification of the Work, "
        + "and no right to distribute such a Derived Work may be assumed under the terms of"
        + " this clause.\n"
        + "\n"
        + "3. You may distribute a Compiled Work that has been generated from a complete, u"
        + "nmodified copy of the Work as distributed under Clause 2 above, as long as that "
        + "Compiled Work is distributed in such a way that the recipients may install the C"
        + "ompiled Work on their system exactly as it would have been installed if they gen"
        + "erated a Compiled Work directly from the Work.\n"
        + "\n"
        + "4. If you are the Current Maintainer of the Work, you may, without restriction, "
        + "modify the Work, thus creating a Derived Work. You may also distribute the Deriv"
        + "ed Work without restriction, including Compiled Works generated from the Derived"
        + " Work. Derived Works distributed in this manner by the Current Maintainer are co"
        + "nsidered to be updated versions of the Work.\n"
        + "\n"
        + "5. If you are not the Current Maintainer of the Work, you may modify your copy o"
        + "f the Work, thus creating a Derived Work based on the Work, and compile this Der"
        + "ived Work, thus creating a Compiled Work based on the Derived Work.\n"
        + "\n"
        + "6. If you are not the Current Maintainer of the Work, you may distribute a Deriv"
        + "ed Work provided the following conditions are met for every component of the Wor"
        + "k unless that component clearly states in the copyright notice that it is exempt"
        + " from that condition. Only the Current Maintainer is allowed to add such stateme"
        + "nts of exemption to a component of the Work. \n"
        + "\n"
        + "     a. If a component of this Derived Work can be a direct replacement for a co"
        + "mponent of the Work when that component is used with the Base Interpreter, then,"
        + " wherever this component of the Work identifies itself to the user when used int"
        + "eractively with that Base Interpreter, the replacement component of this Derived"
        + " Work clearly and unambiguously identifies itself as a modified version of this "
        + "component to the user when used interactively with that Base Interpreter. \n"
        + "\n"
        + "     b. Every component of the Derived Work contains prominent notices detailing"
        + " the nature of the changes to that component, or a prominent reference to anothe"
        + "r file that is distributed as part of the Derived Work and that contains a compl"
        + "ete and accurate log of the changes. \n"
        + "\n"
        + "     c. No information in the Derived Work implies that any persons, including ("
        + "but not limited to) the authors of the original version of the Work, provide any"
        + " support, including (but not limited to) the reporting and handling of errors, t"
        + "o recipients of the Derived Work unless those persons have stated explicitly tha"
        + "t they do provide such support for the Derived Work.\n"
        + "\n"
        + "     d. You distribute at least one of the following with the Derived Work:\n"
        + "\n"
        + "          1. A complete, unmodified copy of the Work; if your distribution of a "
        + "modified component is made by offering access to copy the modified component fro"
        + "m a designated place, then offering equivalent access to copy the Work from the "
        + "same or some similar place meets this condition, even though third parties are n"
        + "ot compelled to copy the Work along with the modified component;\n"
        + "\n"
        + "          2. Information that is sufficient to obtain a complete, unmodified cop"
        + "y of the Work.\n"
        + "\n"
        + "7. If you are not the Current Maintainer of the Work, you may distribute a Compi"
        + "led Work generated from a Derived Work, as long as the Derived Work is distribut"
        + "ed to all recipients of the Compiled Work, and as long as the conditions of Clau"
        + "se 6, above, are met with regard to the Derived Work.\n"
        + "\n"
        + "8. The conditions above are not intended to prohibit, and hence do not apply to,"
        + " the modification, by any method, of any component so that it becomes identical "
        + "to an updated version of that component of the Work as it is distributed by the "
        + "Current Maintainer under Clause 4, above.\n"
        + "\n"
        + "9. Distribution of the Work or any Derived Work in an alternative format, where "
        + "the Work or that Derived Work (in whole or in part) is then produced by applying"
        + " some process to that format, does not relax or nullify any sections of this lic"
        + "ense as they pertain to the results of applying that process. \n"
        + "\n"
        + "10. \n"
        + "     a. A Derived Work may be distributed under a different license provided tha"
        + "t license itself honors the conditions listed in Clause 6 above, in regard to th"
        + "e Work, though it does not have to honor the rest of the conditions in this lice"
        + "nse. \n"
        + "     \n"
        + "     b. If a Derived Work is distributed under a different license, that Derived"
        + " Work must provide sufficient documentation as part of itself to allow each reci"
        + "pient of that Derived Work to honor the restrictions in Clause 6 above, concerni"
        + "ng changes from the Work.\n"
        + "\n"
        + "11. This license places no restrictions on works that are unrelated to the Work,"
        + " nor does this license place any restrictions on aggregating such works with the"
        + " Work by any means.\n"
        + "\n"
        + "12. Nothing in this license is intended to, or may be used to, prevent complete "
        + "compliance by all parties with all applicable laws. \n"
        + "\n"
        + "NO WARRANTY \n"
        + "===========\n"
        + "\n"
        + "There is no warranty for the Work. Except when otherwise stated in writing, the "
        + "Copyright Holder provides the Work `as is', without warranty of any kind, either"
        + " expressed or implied, including, but not limited to, the implied warranties of "
        + "merchantability and fitness for a particular purpose. The entire risk as to the "
        + "quality and performance of the Work is with you. Should the Work prove defective"
        + ", you assume the cost of all necessary servicing, repair, or correction.\n"
        + "\n"
        + "In no event unless required by applicable law or agreed to in writing will The C"
        + "opyright Holder, or any author named in the components of the Work, or any other"
        + " party who may distribute and/or modify the Work as permitted above, be liable t"
        + "o you for damages, including any general, special, incidental or consequential d"
        + "amages arising out of any use of the Work or out of inability to use the Work (i"
        + "ncluding, but not limited to, loss of data, data being rendered inaccurate, or l"
        + "osses sustained by anyone as a result of any failure of the Work to operate with"
        + " any other programs), even if the Copyright Holder or said author or said other "
        + "party has been advised of the possibility of such damages. \n"
        + "\n"
        + "MAINTENANCE OF THE WORK \n"
        + "=======================\n"
        + "\n"
        + "The Work has the status `author-maintained' if the Copyright Holder explicitly a"
        + "nd prominently states near the primary copyright notice in the Work that the Wor"
        + "k can only be maintained by the Copyright Holder or simply that it is `author-ma"
        + "intained'.\n"
        + "\n"
        + "The Work has the status `maintained' if there is a Current Maintainer who has in"
        + "dicated in the Work that they are willing to receive error reports for the Work "
        + "(for example, by supplying a valid e-mail address). It is not required for the C"
        + "urrent Maintainer to acknowledge or act upon these error reports.\n"
        + "\n"
        + "The Work changes from status `maintained' to `unmaintained' if there is no Curre"
        + "nt Maintainer, or the person stated to be Current Maintainer of the work cannot "
        + "be reached through the indicated means of communication for a period of six mont"
        + "hs, and there are no other significant signs of active maintenance.\n"
        + "\n"
        + "You can become the Current Maintainer of the Work by agreement with any existing"
        + " Current Maintainer to take over this role.\n"
        + "\n"
        + "If the Work is unmaintained, you can become the Current Maintainer of the Work t"
        + "hrough the following steps:\n"
        + "\n"
        + "1. Make a reasonable attempt to trace the Current Maintainer (and the Copyright "
        + "Holder, if the two differ) through the means of an Internet or similar search.\n"
        + "\n"
        + "2. If this search is successful, then enquire whether the Work is still maintain"
        + "ed.\n"
        + "\n"
        + "     a. If it is being maintained, then ask the Current Maintainer to update the"
        + "ir communication data within one month. \n"
        + "\n"
        + "     b. If the search is unsuccessful or no action to resume active maintenance "
        + "is taken by the Current Maintainer, then announce within the pertinent community"
        + " your intention to take over maintenance. (If the Work is a LaTeX work, this cou"
        + "ld be done, for example, by posting to comp.text.tex.)\n"
        + "\n"
        + "3a. If the Current Maintainer is reachable and agrees to pass maintenance of the"
        + " Work to you, then this takes effect immediately upon announcement. \n"
        + "\n"
        + "b. If the Current Maintainer is not reachable and the Copyright Holder agrees th"
        + "at maintenance of the Work be passed to you, then this takes effect immediately "
        + "upon announcement. \n"
        + "\n"
        + "4. If you make an `intention announcement' as described in 2b. above and after t"
        + "hree months your intention is challenged neither by the Current Maintainer nor b"
        + "y the Copyright Holder nor by other people, then you may arrange for the Work to"
        + " be changed so as to name you as the (new) Current Maintainer. \n"
        + "\n"
        + "5. If the previously unreachable Current Maintainer becomes reachable once more "
        + "within three months of a change completed under the terms of 3b) or 4), then tha"
        + "t Current Maintainer must become or remain the Current Maintainer upon request p"
        + "rovided they then update their communication data within one month.\n"
        + "\n"
        + "A change in the Current Maintainer does not, of itself, alter the fact that the "
        + "Work is distributed under the LPPL license.\n"
        + "\n"
        + "If you become the Current Maintainer of the Work, you should immediately provide"
        + ", within the Work, a prominent and unambiguous statement of your status as Curre"
        + "nt Maintainer. You should also announce your new status to the same pertinent co"
        + "mmunity as in 2b) above. \n"
        + "\n"
        + "WHETHER AND HOW TO DISTRIBUTE WORKS UNDER THIS LICENSE \n"
        + "======================================================\n"
        + "\n"
        + "This section contains important instructions, examples, and recommendations for "
        + "authors who are considering distributing their works under this license. These a"
        + "uthors are addressed as `you' in this section.\n"
        + "\n"
        + "Choosing This License or Another License \n"
        + "----------------------------------------\n"
        + "\n"
        + "If for any part of your work you want or need to use *distribution* conditions t"
        + "hat differ significantly from those in this license, then do not refer to this l"
        + "icense anywhere in your work but, instead, distribute your work under a differen"
        + "t license. You may use the text of this license as a model for your own license,"
        + " but your license should not refer to the LPPL or otherwise give the impression "
        + "that your work is distributed under the LPPL.\n"
        + "\n"
        + "The document `modguide.tex' in the base LaTeX distribution explains the motivati"
        + "on behind the conditions of this license. It explains, for example, why distribu"
        + "ting LaTeX under the GNU General Public License (GPL) was considered inappropria"
        + "te. Even if your work is unrelated to LaTeX, the discussion in `modguide.tex' ma"
        + "y still be relevant, and authors intending to distribute their works under any l"
        + "icense are encouraged to read it.\n"
        + "\n"
        + "A Recommendation on Modification Without Distribution \n"
        + "-----------------------------------------------------\n"
        + "\n"
        + "It is wise never to modify a component of the Work, even for your own personal u"
        + "se, without also meeting the above conditions for distributing the modified comp"
        + "onent. While you might intend that such modifications will never be distributed,"
        + " often this will happen by accident -- you may forget that you have modified tha"
        + "t component; or it may not occur to you when allowing others to access the modif"
        + "ied version that you are thus distributing it and violating the conditions of th"
        + "is license in ways that could have legal implications and, worse, cause problems"
        + " for the community. It is therefore usually in your best interest to keep your c"
        + "opy of the Work identical with the public one. Many works provide ways to contro"
        + "l the behavior of that work without altering any of its licensed components.\n"
        + "\n"
        + "How to Use This License \n"
        + "-----------------------\n"
        + "\n"
        + "To use this license, place in each of the components of your work both an explic"
        + "it copyright notice including your name and the year the work was authored and/o"
        + "r last substantially modified. Include also a statement that the distribution an"
        + "d/or modification of that component is constrained by the conditions in this lic"
        + "ense.\n"
        + "\n"
        + "Here is an example of such a notice and statement:\n"
        + "\n"
        + "     %% pig.dtx \n"
        + "     %% Copyright 2005 M. Y. Name \n"
        + "     % \n"
        + "     % This work may be distributed and/or modified under the \n"
        + "     % conditions of the LaTeX Project Public License, either version 1.3 \n"
        + "     % of this license or (at your option) any later version. \n"
        + "     % The latest version of this license is in \n"
        + "     % http://www.latex-project.org/lppl.txt \n"
        + "     % and version 1.3 or later is part of all distributions of LaTeX \n"
        + "     % version 2005/12/01 or later. \n"
        + "     % \n"
        + "     % This work has the LPPL maintenance status `maintained'. \n"
        + "     % \n"
        + "     % The Current Maintainer of this work is M. Y. Name. \n"
        + "     % \n"
        + "     % This work consists of the files pig.dtx and pig.ins \n"
        + "     % and the derived file pig.sty.\n"
        + "\n"
        + "Given such a notice and statement in a file, the conditions given in this licens"
        + "e document would apply, with the `Work' referring to the three files `pig.dtx', "
        + "`pig.ins', and `pig.sty' (the last being generated from `pig.dtx' using `pig.ins"
        + "'), the `Base Interpreter' referring to any `LaTeX-Format', and both `Copyright "
        + "Holder' and `Current Maintainer' referring to the person `M. Y. Name'.\n"
        + "\n"
        + "If you do not want the Maintenance section of LPPL to apply to your Work, change"
        + " `maintained' above into `author-maintained'. However, we recommend that you use"
        + " `maintained', as the Maintenance section was added in order to ensure that your"
        + " Work remains useful to the community even when you can no longer maintain and s"
        + "upport it yourself.\n"
        + "\n"
        + "Derived Works That Are Not Replacements \n"
        + "---------------------------------------\n"
        + "\n"
        + "Several clauses of the LPPL specify means to provide reliability and stability f"
        + "or the user community. They therefore concern themselves with the case that a De"
        + "rived Work is intended to be used as a (compatible or incompatible) replacement "
        + "of the original Work. If this is not the case (e.g., if a few lines of code are "
        + "reused for a completely different task), then clauses 6b and 6d shall not apply."
        + " \n"
        + "\n"
        + "Important Recommendations \n"
        + "-------------------------\n"
        + "\n"
        + "Defining What Constitutes the Work\n"
        + "\n"
        + "The LPPL requires that distributions of the Work contain all the files of the Wo"
        + "rk. It is therefore important that you provide a way for the licensee to determi"
        + "ne which files constitute the Work. This could, for example, be achieved by expl"
        + "icitly listing all the files of the Work near the copyright notice of each file "
        + "or by using a line such as:\n"
        + "\n"
        + "     % This work consists of all files listed in manifest.txt. \n"
        + "\n"
        + "in that place. In the absence of an unequivocal list it might be impossible for "
        + "the licensee to determine what is considered by you to comprise the Work and, in"
        + " such a case, the licensee would be entitled to make reasonable conjectures as t"
        + "o which files comprise the Work. \n"
; // the license text
    }
 
    
}
