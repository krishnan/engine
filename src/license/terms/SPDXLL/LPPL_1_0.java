package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:39Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LPPL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class LPPL_1_0 extends License{
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
        return "LPPL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "LaTeX Project Public License v1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "LaTeX Project Public License \n"
        + "\n"
        + "LPPL Version 1.0 1999-03-01\n"
        + "\n"
        + "Copyright 1999 LaTeX3 Project \n"
        + "\n"
        + "Everyone is permitted to copy and distribute verbatim copies of this license doc"
        + "ument, but modification is not allowed. \n"
        + "\n"
        + "Preamble \n"
        + "\n"
        + "The LaTeX Project Public License (LPPL) is the license under which the base LaTe"
        + "X distribution is distributed. As described below you may use this licence for a"
        + "ny software that you wish to distribute. \n"
        + "\n"
        + "It may be particularly suitable if your software is TeX related (such as a LaTeX"
        + " package file) but it may be used for any software, even if it is unrelated to T"
        + "eX.\n"
        + "\n"
        + "To use this license, the files of your distribution should have an explicit copy"
        + "right notice giving your name and the year, together with a reference to this li"
        + "cense.\n"
        + "\n"
        + "A typical example would be\n"
        + "\n"
        + "     %% pig.sty %% Copyright 2001 M. Y. Name\n"
        + "\n"
        + "     % This program can redistributed and/or modified under the terms \n"
        + "     % of the LaTeX Project Public License Distributed from CTAN \n"
        + "     % archives in directory macros/latex/base/lppl.txt; either \n"
        + "     % version 1 of the License, or (at your option) any later version.\n"
        + "\n"
        + "Given such a notice in the file, the conditions of this document would apply, wi"
        + "th:\n"
        + "\n"
        + "`The Program' referring to the software `pig.sty' and `The Copyright Holder' ref"
        + "erring to the person `M. Y. Name'.\n"
        + "\n"
        + "To see a real example, see the file legal.txt which carries the copyright notice"
        + " for the base latex distribution.\n"
        + "\n"
        + "This license gives terms under which files of The Program may be distributed and"
        + " modified. Individual files may have specific further constraints on modificatio"
        + "n, but no file should have restrictions on distribution other than those specifi"
        + "ed below. \n"
        + "\n"
        + "This is to ensure that a distributor wishing to distribute a complete unmodified"
        + " copy of The Program need only check the conditions in this file, and does not n"
        + "eed to check every file in The Program for extra restrictions. If you do need to"
        + " modify the distribution terms of some files, do not refer to this license, inst"
        + "ead distribute The Program under a different license. You may use the parts of t"
        + "he text of LPPL as a model for your own license, but your license should not dir"
        + "ectly refer to the LPPL or otherwise give the impression that The Program is dis"
        + "tributed under the LPPL. \n"
        + "\n"
        + " The LaTeX Project Public License \n"
        + "================================ \n"
        + "Terms And Conditions For Copying, Distribution And Modification \n"
        + "=============================================================== \n"
        + "\n"
        + "\n"
        + "WARRANTY \n"
        + "========\n"
        + "\n"
        + "There is no warranty for The Program, to the extent permitted by applicable law."
        + " Except when otherwise stated in writing, The Copyright Holder provides The Prog"
        + "ram `as is' without warranty of any kind, either expressed or implied, including"
        + ", but not limited to, the implied warranties of merchantability and fitness for "
        + "a particular purpose. The entire risk as to the quality and performance of the p"
        + "rogram is with you. Should The Program prove defective, you assume the cost of a"
        + "ll necessary servicing, repair or correction.\n"
        + "\n"
        + "In no event unless required by applicable law or agreed to in writing will The C"
        + "opyright Holder, or any of the individual authors named in the source for The Pr"
        + "ogram, be liable to you for damages, including any general, special, incidental "
        + "or consequential damages arising out of any use of The Program or out of inabili"
        + "ty to use The Program (including but not limited to loss of data or data being r"
        + "endered inaccurate or losses sustained by you or by third parties as a result of"
        + " a failure of The Program to operate with any other programs), even if such hold"
        + "er or other party has been advised of the possibility of such damages. \n"
        + "\n"
        + "\n"
        + "DISTRIBUTION \n"
        + "============\n"
        + "\n"
        + "Redistribution of unchanged files is allowed provided that all files that make u"
        + "p the distribution of The Program are distributed. In particular this means that"
        + " The Program has to be distributed including its documentation if documentation "
        + "was part of the original distribution.\n"
        + "\n"
        + "The distribution of The Program will contain a prominent file listing all the fi"
        + "les covered by this license.\n"
        + "\n"
        + "If you receive only some of these files from someone, complain!\n"
        + "\n"
        + "The distribution of changed versions of certain files included in the The Progra"
        + "m, and the reuse of code from The Program, are allowed under the following restr"
        + "ictions:\n"
        + "\n"
        + "     * It is allowed only if the legal notice in the file does not expressly for"
        + "bid it. See note below, under \"Conditions on individual files\". \n"
        + "\n"
        + "     * You rename the file before you make any changes to it, unless the file ex"
        + "plicitly says that renaming is not required. Any such changed files must be dist"
        + "ributed under a license that forbids distribution of those files, and any files "
        + "derived from them, under the names used by the original files in the distributio"
        + "n of The Program.\n"
        + "\n"
        + "     * You change any `identification string' in The Program to clearly indicate"
        + " that the file is not part of the standard system.\n"
        + "\n"
        + "     * If The Program includes an `error report address' so that errors may be r"
        + "eported to The Copyright Holder, or other specified addresses, this address must"
        + " be changed in any modified versions of The Program, so that reports for files n"
        + "ot maintained by the original program maintainers are directed to the maintainer"
        + "s of the changed files. \n"
        + "\n"
        + "     * You acknowledge the source and authorship of the original version in the "
        + "modified file.\n"
        + "\n"
        + "     * You also distribute the unmodified version of the file or alternatively p"
        + "rovide sufficient information so that the user of your modified file can be reas"
        + "onably expected to be able to obtain an original, unmodified copy of The Program"
        + ". For example, you may specify a URL to a site that you expect will freely provi"
        + "de the user with a copy of The Program (either the version on which your modific"
        + "ation is based, or perhaps a later version).\n"
        + "\n"
        + "     * If The Program is intended to be used with, or is based on, LaTeX, then f"
        + "iles with the following file extensions which have special meaning in LaTeX Soft"
        + "ware, have special modification rules under the license: \n"
        + "\n"
        + "          - Files with extension `.ins' (installation files): these files may no"
        + "t be modified at all because they contain the legal notices that are placed in t"
        + "he generated files. \n"
        + "\n"
        + "          - Files with extension `.fd' (LaTeX font definitions files): these fil"
        + "es are allowed to be modified without changing the name, but only to enable use "
        + "of all available fonts and to prevent attempts to access unavailable fonts. Howe"
        + "ver, modified files are not allowed to be distributed in place of original files"
        + ". \n"
        + "\n"
        + "          - Files with extension `.cfg' (configuration files): these files can b"
        + "e created or modified to enable easy configuration of the system. The documentat"
        + "ion in cfgguide.tex in the base LaTeX distribution describes when it makes sense"
        + " to modify or generate such files. \n"
        + "\n"
        + "The above restrictions are not intended to prohibit, and hence do not apply to, "
        + "the updating, by any method, of a file so that it becomes identical to the lates"
        + "t version of that file in The Program.\n"
        + "\n"
        + "========================================================================\n"
        + "\n"
        + "NOTES \n"
        + "=====\n"
        + "\n"
        + "We believe that these requirements give you the freedom you to make modification"
        + "s that conform with whatever technical specifications you wish, whilst maintaini"
        + "ng the availability, integrity and reliability of The Program. If you do not see"
        + " how to achieve your goal whilst adhering to these requirements then read the do"
        + "cument cfgguide.tex in the base LaTeX distribution for suggestions. \n"
        + "\n"
        + "Because of the portability and exchangeability aspects of systems like LaTeX, Th"
        + "e LaTeX3 Project deprecates the distribution of non-standard versions of compone"
        + "nts of LaTeX or of generally available contributed code for them but such distri"
        + "butions are permitted under the above restrictions.\n"
        + "\n"
        + "The document modguide.tex in the base LaTeX distribution details the reasons for"
        + " the legal requirements detailed above. Even if The Program is unrelated to LaTe"
        + "X, the argument in modguide.tex may still apply, and should be read before a mod"
        + "ified version of The Program is distributed. \n"
        + "\n"
        + "Conditions on individual files \n"
        + "==============================\n"
        + "\n"
        + "The individual files may bear additional conditions which supersede the general "
        + "conditions on distribution and modification contained in this file. If there are"
        + " any such files, the distribution of The Program will contain a prominent file t"
        + "hat lists all the exceptional files.\n"
        + "\n"
        + "Typical examples of files with more restrictive modification conditions would be"
        + " files that contain the text of copyright notices.\n"
        + "\n"
        + "     * The conditions on individual files differ only in the extent of *modifica"
        + "tion* that is allowed.\n"
        + "\n"
        + "     * The conditions on *distribution* are the same for all the files. Thus a ("
        + "re)distributor of a complete, unchanged copy of The Program need meet only the c"
        + "onditions in this file; it is not necessary to check the header of every file in"
        + " the distribution to check that a distribution meets these requirements.\n"
; // the license text
    }
 
    
}
