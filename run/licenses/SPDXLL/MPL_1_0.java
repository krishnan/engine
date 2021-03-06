package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:29:11Z
 * LicenseName: AGPL-3.0+
 * FileName: MPL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class MPL_1_0 extends License{
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
        return "MPL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Mozilla Public License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "MOZILLA PUBLIC LICENSE\n"
        + "Version 1.0\n"
        + "\n"
        + "1. Definitions.\n"
        + "\n"
        + "1.1. ``Contributor'' means each entity that creates or contributes to the creati"
        + "on of Modifications.\n"
        + "\n"
        + "1.2. ``Contributor Version'' means the combination of the Original Code, prior M"
        + "odifications used by a Contributor, and the Modifications made by that particula"
        + "r Contributor.\n"
        + "\n"
        + "1.3. ``Covered Code'' means the Original Code or Modifications or the combinatio"
        + "n of the Original Code and Modifications, in each case including portions thereo"
        + "f.\n"
        + "\n"
        + "1.4. ``Electronic Distribution Mechanism'' means a mechanism generally accepted "
        + "in the software development community for the electronic transfer of data.\n"
        + "\n"
        + "1.5. ``Executable'' means Covered Code in any form other than Source Code.\n"
        + "\n"
        + "1.6. ``Initial Developer'' means the individual or entity identified as the Init"
        + "ial Developer in the Source Code notice required by Exhibit A.\n"
        + "\n"
        + "1.7. ``Larger Work'' means a work which combines Covered Code or portions thereo"
        + "f with code not governed by the terms of this License.\n"
        + "\n"
        + "1.8. ``License'' means this document.\n"
        + "\n"
        + "1.9. ``Modifications'' means any addition to or deletion from the substance or s"
        + "tructure of either the Original Code or any previous Modifications. When Covered"
        + " Code is released as a series of files, a Modification is:\n"
        + "\n"
        + "A. Any addition to or deletion from the contents of a file containing Original C"
        + "ode or previous Modifications.\n"
        + "\n"
        + "B. Any new file that contains any part of the Original Code or previous Modifica"
        + "tions.\n"
        + "\n"
        + "1.10. ``Original Code'' means Source Code of computer software code which is des"
        + "cribed in the Source Code notice required by Exhibit A as Original Code, and whi"
        + "ch, at the time of its release under this License is not already Covered Code go"
        + "verned by this License.\n"
        + "\n"
        + "1.11. ``Source Code'' means the preferred form of the Covered Code for making mo"
        + "difications to it, including all modules it contains, plus any associated interf"
        + "ace definition files, scripts used to control compilation and installation of an"
        + " Executable, or a list of source code differential comparisons against either th"
        + "e Original Code or another well known, available Covered Code of the Contributor"
        + "'s choice. The Source Code can be in a compressed or archival form, provided the"
        + " appropriate decompression or de-archiving software is widely available for no c"
        + "harge.\n"
        + "\n"
        + "1.12. ``You'' means an individual or a legal entity exercising rights under, and"
        + " complying with all of the terms of, this License or a future version of this Li"
        + "cense issued under Section 6.1. For legal entities, ``You'' includes any entity "
        + "which controls, is controlled by, or is under common control with You. For purpo"
        + "ses of this definition, ``control'' means (a) the power, direct or indirect, to "
        + "cause the direction or management of such entity, whether by contract or otherwi"
        + "se, or (b) ownership of fifty percent (50%) or more of the outstanding shares or"
        + " beneficial ownership of such entity.\n"
        + "\n"
        + "2. Source Code License.\n"
        + "\n"
        + "2.1. The Initial Developer Grant. \n"
        + "The Initial Developer hereby grants You a world-wide, royalty-free, non-exclusiv"
        + "e license, subject to third party intellectual property claims:\n"
        + "\n"
        + "(a) to use, reproduce, modify, display, perform, sublicense and distribute the O"
        + "riginal Code (or portions thereof) with or without Modifications, or as part of "
        + "a Larger Work; and\n"
        + "\n"
        + "(b) under patents now or hereafter owned or controlled by Initial Developer, to "
        + "make, have made, use and sell (``Utilize'') the Original Code (or portions there"
        + "of), but solely to the extent that any such patent is reasonably necessary to en"
        + "able You to Utilize the Original Code (or portions thereof) and not to any grea"
        + "ter extent that may be necessary to Utilize further Modifications or combination"
        + "s.\n"
        + "\n"
        + "2.2. Contributor Grant. \n"
        + "Each Contributor hereby grants You a world-wide, royalty-free, non-exclusive lic"
        + "ense, subject to third party intellectual property claims:\n"
        + "\n"
        + "(a) to use, reproduce, modify, display, perform, sublicense and distribute the M"
        + "odifications created by such Contributor (or portions thereof) either on an unmo"
        + "dified basis, with other Modifications, as Covered Code or as part of a Larger W"
        + "ork; and\n"
        + "\n"
        + "(b) under patents now or hereafter owned or controlled by Contributor, to Utiliz"
        + "e the Contributor Version (or portions thereof), but solely to the extent that a"
        + "ny such patent is reasonably necessary to enable You to Utilize the Contributor "
        + "Version (or portions thereof), and not to any greater extent that may be necess"
        + "ary to Utilize further Modifications or combinations.\n"
        + "\n"
        + "3. Distribution Obligations.\n"
        + "\n"
        + "3.1. Application of License. \n"
        + "The Modifications which You create or to which You contribute are governed by th"
        + "e terms of this License, including without limitation Section 2.2. The Source Co"
        + "de version of Covered Code may be distributed only under the terms of this Licen"
        + "se or a future version of this License released under Section 6.1, and You must "
        + "include a copy of this License with every copy of the Source Code You distribute"
        + ". You may not offer or impose any terms on any Source Code version that alters o"
        + "r restricts the applicable version of this License or the recipients' rights her"
        + "eunder. However, You may include an additional document offering the additional "
        + "rights described in Section 3.5.\n"
        + "\n"
        + "3.2. Availability of Source Code. \n"
        + "Any Modification which You create or to which You contribute must be made availa"
        + "ble in Source Code form under the terms of this License either on the same media"
        + " as an Executable version or via an accepted Electronic Distribution Mechanism t"
        + "o anyone to whom you made an Executable version available; and if made available"
        + " via Electronic Distribution Mechanism, must remain available for at least twelv"
        + "e (12) months after the date it initially became available, or at least six (6) "
        + "months after a subsequent version of that particular Modification has been made "
        + "available to such recipients. You are responsible for ensuring that the Source C"
        + "ode version remains available even if the Electronic Distribution Mechanism is m"
        + "aintained by a third party.\n"
        + "\n"
        + "3.3. Description of Modifications. \n"
        + "You must cause all Covered Code to which you contribute to contain a file docume"
        + "nting the changes You made to create that Covered Code and the date of any chang"
        + "e. You must include a prominent statement that the Modification is derived, dire"
        + "ctly or indirectly, from Original Code provided by the Initial Developer and inc"
        + "luding the name of the Initial Developer in (a) the Source Code, and (b) in any "
        + "notice in an Executable version or related documentation in which You describe t"
        + "he origin or ownership of the Covered Code.\n"
        + "\n"
        + "3.4. Intellectual Property Matters\n"
        + "\n"
        + "(a) Third Party Claims. \n"
        + "If You have knowledge that a party claims an intellectual property right in part"
        + "icular functionality or code (or its utilization under this License), you must i"
        + "nclude a text file with the source code distribution titled ``LEGAL'' which desc"
        + "ribes the claim and the party making the claim in sufficient detail that a recip"
        + "ient will know whom to contact. If you obtain such knowledge after You make Your"
        + " Modification available as described in Section 3.2, You shall promptly modify t"
        + "he LEGAL file in all copies You make available thereafter and shall take other s"
        + "teps (such as notifying appropriate mailing lists or newsgroups) reasonably calc"
        + "ulated to inform those who received the Covered Code that new knowledge has been"
        + " obtained.\n"
        + "\n"
        + "(b) Contributor APIs. \n"
        + "If Your Modification is an application programming interface and You own or cont"
        + "rol patents which are reasonably necessary to implement that API, you must also "
        + "include this information in the LEGAL file.\n"
        + "\n"
        + "3.5. Required Notices. \n"
        + "You must duplicate the notice in Exhibit A in each file of the Source Code, and "
        + "this License in any documentation for the Source Code, where You describe recipi"
        + "ents' rights relating to Covered Code. If You created one or more Modification(s"
        + "), You may add your name as a Contributor to the notice described in Exhibit A. "
        + "If it is not possible to put such notice in a particular Source Code file due to"
        + " its structure, then you must include such notice in a location (such as a relev"
        + "ant directory file) where a user would be likely to look for such a notice. You "
        + "may choose to offer, and to charge a fee for, warranty, support, indemnity or li"
        + "ability obligations to one or more recipients of Covered Code. However, You may "
        + "do so only on Your own behalf, and not on behalf of the Initial Developer or any"
        + " Contributor. You must make it absolutely clear than any such warranty, support,"
        + " indemnity or liability obligation is offered by You alone, and You hereby agree"
        + " to indemnify the Initial Developer and every Contributor for any liability incu"
        + "rred by the Initial Developer or such Contributor as a result of warranty, suppo"
        + "rt, indemnity or liability terms You offer.\n"
        + "\n"
        + "3.6. Distribution of Executable Versions. \n"
        + "You may distribute Covered Code in Executable form only if the requirements of S"
        + "ection 3.1-3.5 have been met for that Covered Code, and if You include a notice "
        + "stating that the Source Code version of the Covered Code is available under the "
        + "terms of this License, including a description of how and where You have fulfill"
        + "ed the obligations of Section 3.2. The notice must be conspicuously included in "
        + "any notice in an Executable version, related documentation or collateral in whic"
        + "h You describe recipients' rights relating to the Covered Code. You may distribu"
        + "te the Executable version of Covered Code under a license of Your choice, which "
        + "may contain terms different from this License, provided that You are in complian"
        + "ce with the terms of this License and that the license for the Executable versio"
        + "n does not attempt to limit or alter the recipient's rights in the Source Code v"
        + "ersion from the rights set forth in this License. If You distribute the Executab"
        + "le version under a different license You must make it absolutely clear that any "
        + "terms which differ from this License are offered by You alone, not by the Initia"
        + "l Developer or any Contributor. You hereby agree to indemnify the Initial Develo"
        + "per and every Contributor for any liability incurred by the Initial Developer or"
        + " such Contributor as a result of any such terms You offer.\n"
        + "\n"
        + "3.7. Larger Works. \n"
        + "You may create a Larger Work by combining Covered Code with other code not gover"
        + "ned by the terms of this License and distribute the Larger Work as a single prod"
        + "uct. In such a case, You must make sure the requirements of this License are ful"
        + "filled for the Covered Code.\n"
        + "\n"
        + "4. Inability to Comply Due to Statute or Regulation.\n"
        + "\n"
        + "If it is impossible for You to comply with any of the terms of this License with"
        + " respect to some or all of the Covered Code due to statute or regulation then Yo"
        + "u must: (a) comply with the terms of this License to the maximum extent possible"
        + "; and (b) describe the limitations and the code they affect. Such description mu"
        + "st be included in the LEGAL file described in Section 3.4 and must be included w"
        + "ith all distributions of the Source Code. Except to the extent prohibited by sta"
        + "tute or regulation, such description must be sufficiently detailed for a recipie"
        + "nt of ordinary skill to be able to understand it.\n"
        + "\n"
        + "5. Application of this License.\n"
        + "\n"
        + "This License applies to code to which the Initial Developer has attached the not"
        + "ice in Exhibit A, and to related Covered Code.\n"
        + "\n"
        + "6. Versions of the License.\n"
        + "\n"
        + "6.1. New Versions. \n"
        + "Netscape Communications Corporation (``Netscape'') may publish revised and/or ne"
        + "w versions of the License from time to time. Each version will be given a distin"
        + "guishing version number.\n"
        + "\n"
        + "6.2. Effect of New Versions. \n"
        + "Once Covered Code has been published under a particular version of the License, "
        + "You may always continue to use it under the terms of that version. You may also "
        + "choose to use such Covered Code under the terms of any subsequent version of the"
        + " License published by Netscape. No one other than Netscape has the right to modi"
        + "fy the terms applicable to Covered Code created under this License.\n"
        + "\n"
        + "6.3. Derivative Works. \n"
        + "If you create or use a modified version of this License (which you may only do i"
        + "n order to apply it to code which is not already Covered Code governed by this L"
        + "icense), you must (a) rename Your license so that the phrases ``Mozilla'', ``MOZ"
        + "ILLAPL'', ``MOZPL'', ``Netscape'', ``NPL'' or any confusingly similar phrase do "
        + "not appear anywhere in your license and (b) otherwise make it clear that your ve"
        + "rsion of the license contains terms which differ from the Mozilla Public License"
        + " and Netscape Public License. (Filling in the name of the Initial Developer, Ori"
        + "ginal Code or Contributor in the notice described in Exhibit A shall not of them"
        + "selves be deemed to be modifications of this License.)\n"
        + "\n"
        + "7. DISCLAIMER OF WARRANTY.\n"
        + "\n"
        + "COVERED CODE IS PROVIDED UNDER THIS LICENSE ON AN ``AS IS'' BASIS, WITHOUT WARRA"
        + "NTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WAR"
        + "RANTIES THAT THE COVERED CODE IS FREE OF DEFECTS, MERCHANTABLE, FIT FOR A PARTIC"
        + "ULAR PURPOSE OR NON-INFRINGING. THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANC"
        + "E OF THE COVERED CODE IS WITH YOU. SHOULD ANY COVERED CODE PROVE DEFECTIVE IN AN"
        + "Y RESPECT, YOU (NOT THE INITIAL DEVELOPER OR ANY OTHER CONTRIBUTOR) ASSUME THE C"
        + "OST OF ANY NECESSARY SERVICING, REPAIR OR CORRECTION. THIS DISCLAIMER OF WARRANT"
        + "Y CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY COVERED CODE IS A"
        + "UTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "8. TERMINATION.\n"
        + "\n"
        + "This License and the rights granted hereunder will terminate automatically if Yo"
        + "u fail to comply with terms herein and fail to cure such breach within 30 days o"
        + "f becoming aware of the breach. All sublicenses to the Covered Code which are pr"
        + "operly granted shall survive any termination of this License. Provisions which, "
        + "by their nature, must remain in effect beyond the termination of this License sh"
        + "all survive.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY.\n"
        + "\n"
        + "UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING NEGLIG"
        + "ENCE), CONTRACT, OR OTHERWISE, SHALL THE INITIAL DEVELOPER, ANY OTHER CONTRIBUTO"
        + "R, OR ANY DISTRIBUTOR OF COVERED CODE, OR ANY SUPPLIER OF ANY OF SUCH PARTIES, B"
        + "E LIABLE TO YOU OR ANY OTHER PERSON FOR ANY INDIRECT, SPECIAL, INCIDENTAL, OR CO"
        + "NSEQUENTIAL DAMAGES OF ANY CHARACTER INCLUDING, WITHOUT LIMITATION, DAMAGES FOR "
        + "LOSS OF GOODWILL, WORK STOPPAGE, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL"
        + " OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF SUCH PARTY SHALL HAVE BEEN INFORMED"
        + " OF THE POSSIBILITY OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY SHALL NOT APPL"
        + "Y TO LIABILITY FOR DEATH OR PERSONAL INJURY RESULTING FROM SUCH PARTY'S NEGLIGEN"
        + "CE TO THE EXTENT APPLICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISDICTIONS DO"
        + " NOT ALLOW THE EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, S"
        + "O THAT EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "10. U.S. GOVERNMENT END USERS.\n"
        + "\n"
        + "The Covered Code is a ``commercial item,'' as that term is defined in 48 C.F.R. "
        + "2.101 (Oct. 1995), consisting of ``commercial computer software'' and ``commerci"
        + "al computer software documentation,'' as such terms are used in 48 C.F.R. 12.212"
        + " (Sept. 1995). Consistent with 48 C.F.R. 12.212 and 48 C.F.R. 227.7202-1 through"
        + " 227.7202-4 (June 1995), all U.S. Government End Users acquire Covered Code with"
        + " only those rights set forth herein.\n"
        + "\n"
        + "11. MISCELLANEOUS.\n"
        + "\n"
        + "This License represents the complete agreement concerning subject matter hereof."
        + " If any provision of this License is held to be unenforceable, such provision sh"
        + "all be reformed only to the extent necessary to make it enforceable. This Licens"
        + "e shall be governed by California law provisions (except to the extent applicabl"
        + "e law, if any, provides otherwise), excluding its conflict-of-law provisions. Wi"
        + "th respect to disputes in which at least one party is a citizen of, or an entity"
        + " chartered or registered to do business in, the United States of America: (a) un"
        + "less otherwise agreed in writing, all disputes relating to this License (excepti"
        + "ng any dispute relating to intellectual property rights) shall be subject to fin"
        + "al and binding arbitration, with the losing party paying all costs of arbitratio"
        + "n; (b) any arbitration relating to this Agreement shall be held in Santa Clara C"
        + "ounty, California, under the auspices of JAMS/EndDispute; and (c) any litigation"
        + " relating to this Agreement shall be subject to the jurisdiction of the Federal "
        + "Courts of the Northern District of California, with venue lying in Santa Clara C"
        + "ounty, California, with the losing party responsible for costs, including withou"
        + "t limitation, court costs and reasonable attorneys fees and expenses. The applic"
        + "ation of the United Nations Convention on Contracts for the International Sale o"
        + "f Goods is expressly excluded. Any law or regulation which provides that the lan"
        + "guage of a contract shall be construed against the drafter shall not apply to th"
        + "is License.\n"
        + "\n"
        + "12. RESPONSIBILITY FOR CLAIMS.\n"
        + "\n"
        + "Except in cases where another Contributor has failed to comply with Section 3.4,"
        + " You are responsible for damages arising, directly or indirectly, out of Your ut"
        + "ilization of rights under this License, based on the number of copies of Covered"
        + " Code you made available, the revenues you received from utilizing such rights, "
        + "and other relevant factors. You agree to work with affected parties to distribut"
        + "e responsibility on an equitable basis.\n"
        + "\n"
        + "EXHIBIT A.\n"
        + "\n"
        + "``The contents of this file are subject to the Mozilla Public License Version 1."
        + "0 (the \"License\"); you may not use this file except in compliance with the Licen"
        + "se. You may obtain a copy of the License at http://www.mozilla.org/MPL/\n"
        + "\n"
        + "Software distributed under the License is distributed on an \"AS IS\" basis, WITHO"
        + "UT WARRANTY OF ANY KIND, either express or implied. See the License for the spec"
        + "ific language governing rights and limitations under the License.\n"
        + "\n"
        + "The Original Code is ______________________________________.\n"
        + "\n"
        + "The Initial Developer of the Original Code is ________________________. Portions"
        + " created by ______________________ are Copyright (C) ______ ____________________"
        + "___. All Rights Reserved.\n"
        + "\n"
        + "Contributor(s): ______________________________________.''\n"
; // the license text
    }
 
    
}
