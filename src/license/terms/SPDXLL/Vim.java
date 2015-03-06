package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:37Z
 * LicenseName: AGPL-3.0+
 * FileName: Vim.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Vim extends License{
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
        return "Vim"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Vim License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "VIM LICENSE\n"
        + "\n"
        + "I) There are no restrictions on distributing unmodified copies of Vim except tha"
        + "t they must include this license text. You can also distribute unmodified parts "
        + "of Vim, likewise unrestricted except that they must include this license text. Y"
        + "ou are also allowed to include executables that you made from the unmodified Vim"
        + " sources, plus your own usage examples and Vim scripts.\n"
        + "\n"
        + "II) It is allowed to distribute a modified (or extended) version of Vim, includi"
        + "ng executables and/or source code, when the following four conditions are met: \n"
        + "\n"
        + "     1) This license text must be included unmodified. \n"
        + "\n"
        + "     2) The modified Vim must be distributed in one of the following five ways: \n"
        + "          a) If you make changes to Vim yourself, you must clearly describe in t"
        + "he distribution how to contact you. When the maintainer asks you (in any way) fo"
        + "r a copy of the modified Vim you distributed, you must make your changes, includ"
        + "ing source code, available to the maintainer without fee. The maintainer reserve"
        + "s the right to include your changes in the official version of Vim. What the mai"
        + "ntainer will do with your changes and under what license they will be distribute"
        + "d is negotiable. If there has been no negotiation then this license, or a later "
        + "version, also applies to your changes. The current maintainer is Bram Moolenaar "
        + "<Bram@vim.org>. If this changes it will be announced in appropriate places (most"
        + " likely vim.sf.net, www.vim.org and/or comp.editors). When it is completely impo"
        + "ssible to contact the maintainer, the obligation to send him your changes ceases"
        + ". Once the maintainer has confirmed that he has received your changes they will "
        + "not have to be sent again. \n"
        + "          b) If you have received a modified Vim that was distributed as mention"
        + "ed under a) you are allowed to further distribute it unmodified, as mentioned at"
        + " I). If you make additional changes the text under a) applies to those changes. \n"
        + "          c) Provide all the changes, including source code, with every copy of "
        + "the modified Vim you distribute. This may be done in the form of a context diff."
        + " You can choose what license to use for new code you add. The changes and their "
        + "license must not restrict others from making their own changes to the official v"
        + "ersion of Vim. \n"
        + "          d) When you have a modified Vim which includes changes as mentioned un"
        + "der c), you can distribute it without the source code for the changes if the fol"
        + "lowing three conditions are met: \n"
        + "          - The license that applies to the changes permits you to distribute th"
        + "e changes to the Vim maintainer without fee or restriction, and permits the Vim "
        + "maintainer to include the changes in the official version of Vim without fee or "
        + "restriction. \n"
        + "          - You keep the changes for at least three years after last distributin"
        + "g the corresponding modified Vim. When the maintainer or someone who you distrib"
        + "uted the modified Vim to asks you (in any way) for the changes within this perio"
        + "d, you must make them available to him. \n"
        + "          - You clearly describe in the distribution how to contact you. This co"
        + "ntact information must remain valid for at least three years after last distribu"
        + "ting the corresponding modified Vim, or as long as possible. \n"
        + "          e) When the GNU General Public License (GPL) applies to the changes, y"
        + "ou can distribute the modified Vim under the GNU GPL version 2 or any later vers"
        + "ion. \n"
        + "\n"
        + "     3) A message must be added, at least in the output of the \":version\" comman"
        + "d and in the intro screen, such that the user of the modified Vim is able to see"
        + " that it was modified. When distributing as mentioned under 2)e) adding the mess"
        + "age is only required for as far as this does not conflict with the license used "
        + "for the changes. \n"
        + "\n"
        + "     4) The contact information as required under 2)a) and 2)d) must not be remo"
        + "ved or changed, except that the person himself can make corrections.\n"
        + "\n"
        + "III) If you distribute a modified version of Vim, you are encouraged to use the "
        + "Vim license for your changes and make them available to the maintainer, includin"
        + "g the source code. The preferred way to do this is by e-mail or by uploading the"
        + " files to a server and e-mailing the URL. If the number of changes is small (e.g"
        + "., a modified Makefile) e-mailing a context diff will do. The e-mail address to "
        + "be used is <maintainer@vim.org> \n"
        + "\n"
        + "IV) It is not allowed to remove this license from the distribution of the Vim so"
        + "urces, parts of it or from a modified version. You may use this license for prev"
        + "ious Vim releases instead of the license that they came with, at your option. \n"
; // the license text
    }
 
    
}
