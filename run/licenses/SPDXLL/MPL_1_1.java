package SPDXLL;

import spdxlib.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:29:12Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: MPL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class MPL_1_1 extends License{
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
        return "MPL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Mozilla Public License 1.1 "; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Mozilla Public License Version 1.1\n"
        + "\n"
        + "1. Definitions.\n"
        + "\n"
        + "1.0.1. \"Commercial Use\"\n"
        + "means distribution or otherwise making the Covered Code available to a third par"
        + "ty.\n"
        + "1.1. \"Contributor\"\n"
        + "means each entity that creates or contributes to the creation of Modifications.\n"
        + "1.2. \"Contributor Version\"\n"
        + "means the combination of the Original Code, prior Modifications used by a Contri"
        + "butor, and the Modifications made by that particular Contributor.\n"
        + "1.3. \"Covered Code\"\n"
        + "means the Original Code or Modifications or the combination of the Original Code"
        + " and Modifications, in each case including portions thereof.\n"
        + "1.4. \"Electronic Distribution Mechanism\"\n"
        + "means a mechanism generally accepted in the software development community for t"
        + "he electronic transfer of data.\n"
        + "1.5. \"Executable\"\n"
        + "means Covered Code in any form other than Source Code.\n"
        + "1.6. \"Initial Developer\"\n"
        + "means the individual or entity identified as the Initial Developer in the Source"
        + " Code notice required by Exhibit A.\n"
        + "1.7. \"Larger Work\"\n"
        + "means a work which combines Covered Code or portions thereof with code not gover"
        + "ned by the terms of this License.\n"
        + "1.8. \"License\"\n"
        + "means this document.\n"
        + "1.8.1. \"Licensable\"\n"
        + "means having the right to grant, to the maximum extent possible, whether at the "
        + "time of the initial grant or subsequently acquired, any and all of the rights co"
        + "nveyed herein.\n"
        + "1.9. \"Modifications\"\n"
        + "means any addition to or deletion from the substance or structure of either the "
        + "Original Code or any previous Modifications. When Covered Code is released as a "
        + "series of files, a Modification is:\n"
        + "Any addition to or deletion from the contents of a file containing Original Code"
        + " or previous Modifications.\n"
        + "Any new file that contains any part of the Original Code or previous Modificatio"
        + "ns.\n"
        + "1.10. \"Original Code\"\n"
        + "means Source Code of computer software code which is described in the Source Cod"
        + "e notice required by Exhibit A as Original Code, and which, at the time of its r"
        + "elease under this License is not already Covered Code governed by this License.\n"
        + "1.10.1. \"Patent Claims\"\n"
        + "means any patent claim(s), now owned or hereafter acquired, including without li"
        + "mitation, method, process, and apparatus claims, in any patent Licensable by gra"
        + "ntor.\n"
        + "1.11. \"Source Code\"\n"
        + "means the preferred form of the Covered Code for making modifications to it, inc"
        + "luding all modules it contains, plus any associated interface definition files, "
        + "scripts used to control compilation and installation of an Executable, or source"
        + " code differential comparisons against either the Original Code or another well "
        + "known, available Covered Code of the Contributor's choice. The Source Code can b"
        + "e in a compressed or archival form, provided the appropriate decompression or de"
        + "-archiving software is widely available for no charge.\n"
        + "1.12. \"You\" (or \"Your\")\n"
        + "means an individual or a legal entity exercising rights under, and complying wit"
        + "h all of the terms of, this License or a future version of this License issued u"
        + "nder Section 6.1. For legal entities, \"You\" includes any entity which controls, "
        + "is controlled by, or is under common control with You. For purposes of this defi"
        + "nition, \"control\" means (a) the power, direct or indirect, to cause the directio"
        + "n or management of such entity, whether by contract or otherwise, or (b) ownersh"
        + "ip of more than fifty percent (50%) of the outstanding shares or beneficial owne"
        + "rship of such entity.\n"
        + "2. Source Code License.\n"
        + "\n"
        + "2.1. The Initial Developer Grant.\n"
        + "\n"
        + "The Initial Developer hereby grants You a world-wide, royalty-free, non-exclusiv"
        + "e license, subject to third party intellectual property claims:\n"
        + "\n"
        + "under intellectual property rights (other than patent or trademark) Licensable b"
        + "y Initial Developer to use, reproduce, modify, display, perform, sublicense and "
        + "distribute the Original Code (or portions thereof) with or without Modifications"
        + ", and/or as part of a Larger Work; and\n"
        + "under Patents Claims infringed by the making, using or selling of Original Code,"
        + " to make, have made, use, practice, sell, and offer for sale, and/or otherwise d"
        + "ispose of the Original Code (or portions thereof).\n"
        + "the licenses granted in this Section 2.1 (a) and (b) are effective on the date I"
        + "nitial Developer first distributes Original Code under the terms of this License"
        + ".\n"
        + "Notwithstanding Section 2.1 (b) above, no patent license is granted: 1) for code"
        + " that You delete from the Original Code; 2) separate from the Original Code; or "
        + "3) for infringements caused by: i) the modification of the Original Code or ii) "
        + "the combination of the Original Code with other software or devices.\n"
        + "2.2. Contributor Grant.\n"
        + "\n"
        + "Subject to third party intellectual property claims, each Contributor hereby gra"
        + "nts You a world-wide, royalty-free, non-exclusive license\n"
        + "\n"
        + "under intellectual property rights (other than patent or trademark) Licensable b"
        + "y Contributor, to use, reproduce, modify, display, perform, sublicense and distr"
        + "ibute the Modifications created by such Contributor (or portions thereof) either"
        + " on an unmodified basis, with other Modifications, as Covered Code and/or as par"
        + "t of a Larger Work; and\n"
        + "under Patent Claims infringed by the making, using, or selling of Modifications "
        + "made by that Contributor either alone and/or in combination with its Contributor"
        + " Version (or portions of such combination), to make, use, sell, offer for sale, "
        + "have made, and/or otherwise dispose of: 1) Modifications made by that Contributo"
        + "r (or portions thereof); and 2) the combination of Modifications made by that Co"
        + "ntributor with its Contributor Version (or portions of such combination).\n"
        + "the licenses granted in Sections 2.2 (a) and 2.2 (b) are effective on the date C"
        + "ontributor first makes Commercial Use of the Covered Code.\n"
        + "Notwithstanding Section 2.2 (b) above, no patent license is granted: 1) for any "
        + "code that Contributor has deleted from the Contributor Version; 2) separate from"
        + " the Contributor Version; 3) for infringements caused by: i) third party modific"
        + "ations of Contributor Version or ii) the combination of Modifications made by th"
        + "at Contributor with other software (except as part of the Contributor Version) o"
        + "r other devices; or 4) under Patent Claims infringed by Covered Code in the abse"
        + "nce of Modifications made by that Contributor.\n"
        + "3. Distribution Obligations.\n"
        + "\n"
        + "3.1. Application of License.\n"
        + "\n"
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
        + "3.2. Availability of Source Code.\n"
        + "\n"
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
        + "3.3. Description of Modifications.\n"
        + "\n"
        + "You must cause all Covered Code to which You contribute to contain a file docume"
        + "nting the changes You made to create that Covered Code and the date of any chang"
        + "e. You must include a prominent statement that the Modification is derived, dire"
        + "ctly or indirectly, from Original Code provided by the Initial Developer and inc"
        + "luding the name of the Initial Developer in (a) the Source Code, and (b) in any "
        + "notice in an Executable version or related documentation in which You describe t"
        + "he origin or ownership of the Covered Code.\n"
        + "\n"
        + "3.4. Intellectual Property Matters\n"
        + "\n"
        + "(a) Third Party Claims\n"
        + "\n"
        + "If Contributor has knowledge that a license under a third party's intellectual p"
        + "roperty rights is required to exercise the rights granted by such Contributor un"
        + "der Sections 2.1 or 2.2, Contributor must include a text file with the Source Co"
        + "de distribution titled \"LEGAL\" which describes the claim and the party making th"
        + "e claim in sufficient detail that a recipient will know whom to contact. If Cont"
        + "ributor obtains such knowledge after the Modification is made available as descr"
        + "ibed in Section 3.2, Contributor shall promptly modify the LEGAL file in all cop"
        + "ies Contributor makes available thereafter and shall take other steps (such as n"
        + "otifying appropriate mailing lists or newsgroups) reasonably calculated to infor"
        + "m those who received the Covered Code that new knowledge has been obtained.\n"
        + "\n"
        + "(b) Contributor APIs\n"
        + "\n"
        + "If Contributor's Modifications include an application programming interface and "
        + "Contributor has knowledge of patent licenses which are reasonably necessary to i"
        + "mplement that API, Contributor must also include this information in the LEGAL f"
        + "ile.\n"
        + "\n"
        + "(c) Representations.\n"
        + "\n"
        + "Contributor represents that, except as disclosed pursuant to Section 3.4 (a) abo"
        + "ve, Contributor believes that Contributor's Modifications are Contributor's orig"
        + "inal creation(s) and/or Contributor has sufficient rights to grant the rights co"
        + "nveyed by this License.\n"
        + "\n"
        + "3.5. Required Notices.\n"
        + "\n"
        + "You must duplicate the notice in Exhibit A in each file of the Source Code. If i"
        + "t is not possible to put such notice in a particular Source Code file due to its"
        + " structure, then You must include such notice in a location (such as a relevant "
        + "directory) where a user would be likely to look for such a notice. If You create"
        + "d one or more Modification(s) You may add your name as a Contributor to the noti"
        + "ce described in Exhibit A. You must also duplicate this License in any documenta"
        + "tion for the Source Code where You describe recipients' rights or ownership righ"
        + "ts relating to Covered Code. You may choose to offer, and to charge a fee for, w"
        + "arranty, support, indemnity or liability obligations to one or more recipients o"
        + "f Covered Code. However, You may do so only on Your own behalf, and not on behal"
        + "f of the Initial Developer or any Contributor. You must make it absolutely clear"
        + " than any such warranty, support, indemnity or liability obligation is offered b"
        + "y You alone, and You hereby agree to indemnify the Initial Developer and every C"
        + "ontributor for any liability incurred by the Initial Developer or such Contribut"
        + "or as a result of warranty, support, indemnity or liability terms You offer.\n"
        + "\n"
        + "3.6. Distribution of Executable Versions.\n"
        + "\n"
        + "You may distribute Covered Code in Executable form only if the requirements of S"
        + "ections 3.1, 3.2, 3.3, 3.4 and 3.5 have been met for that Covered Code, and if Y"
        + "ou include a notice stating that the Source Code version of the Covered Code is "
        + "available under the terms of this License, including a description of how and wh"
        + "ere You have fulfilled the obligations of Section 3.2. The notice must be conspi"
        + "cuously included in any notice in an Executable version, related documentation o"
        + "r collateral in which You describe recipients' rights relating to the Covered Co"
        + "de. You may distribute the Executable version of Covered Code or ownership right"
        + "s under a license of Your choice, which may contain terms different from this Li"
        + "cense, provided that You are in compliance with the terms of this License and th"
        + "at the license for the Executable version does not attempt to limit or alter the"
        + " recipient's rights in the Source Code version from the rights set forth in this"
        + " License. If You distribute the Executable version under a different license You"
        + " must make it absolutely clear that any terms which differ from this License are"
        + " offered by You alone, not by the Initial Developer or any Contributor. You here"
        + "by agree to indemnify the Initial Developer and every Contributor for any liabil"
        + "ity incurred by the Initial Developer or such Contributor as a result of any suc"
        + "h terms You offer.\n"
        + "\n"
        + "3.7. Larger Works.\n"
        + "\n"
        + "You may create a Larger Work by combining Covered Code with other code not gover"
        + "ned by the terms of this License and distribute the Larger Work as a single prod"
        + "uct. In such a case, You must make sure the requirements of this License are ful"
        + "filled for the Covered Code.\n"
        + "\n"
        + "4. Inability to Comply Due to Statute or Regulation.\n"
        + "\n"
        + "If it is impossible for You to comply with any of the terms of this License with"
        + " respect to some or all of the Covered Code due to statute, judicial order, or r"
        + "egulation then You must: (a) comply with the terms of this License to the maximu"
        + "m extent possible; and (b) describe the limitations and the code they affect. Su"
        + "ch description must be included in the LEGAL file described in Section 3.4 and m"
        + "ust be included with all distributions of the Source Code. Except to the extent "
        + "prohibited by statute or regulation, such description must be sufficiently detai"
        + "led for a recipient of ordinary skill to be able to understand it.\n"
        + "\n"
        + "5. Application of this License.\n"
        + "\n"
        + "This License applies to code to which the Initial Developer has attached the not"
        + "ice in Exhibit A and to related Covered Code.\n"
        + "\n"
        + "6. Versions of the License.\n"
        + "\n"
        + "6.1. New Versions\n"
        + "\n"
        + "Netscape Communications Corporation (\"Netscape\") may publish revised and/or new "
        + "versions of the License from time to time. Each version will be given a distingu"
        + "ishing version number.\n"
        + "\n"
        + "6.2. Effect of New Versions\n"
        + "\n"
        + "Once Covered Code has been published under a particular version of the License, "
        + "You may always continue to use it under the terms of that version. You may also "
        + "choose to use such Covered Code under the terms of any subsequent version of the"
        + " License published by Netscape. No one other than Netscape has the right to modi"
        + "fy the terms applicable to Covered Code created under this License.\n"
        + "\n"
        + "6.3. Derivative Works\n"
        + "\n"
        + "If You create or use a modified version of this License (which you may only do i"
        + "n order to apply it to code which is not already Covered Code governed by this L"
        + "icense), You must (a) rename Your license so that the phrases \"Mozilla\", \"MOZILL"
        + "APL\", \"MOZPL\", \"Netscape\", \"MPL\", \"NPL\" or any confusingly similar phrase do not"
        + " appear in your license (except to note that your license differs from this Lice"
        + "nse) and (b) otherwise make it clear that Your version of the license contains t"
        + "erms which differ from the Mozilla Public License and Netscape Public License. ("
        + "Filling in the name of the Initial Developer, Original Code or Contributor in th"
        + "e notice described in Exhibit A shall not of themselves be deemed to be modifica"
        + "tions of this License.)\n"
        + "\n"
        + "7. DISCLAIMER OF WARRANTY\n"
        + "\n"
        + "COVERED CODE IS PROVIDED UNDER THIS LICENSE ON AN \"AS IS\" BASIS, WITHOUT WARRANT"
        + "Y OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRA"
        + "NTIES THAT THE COVERED CODE IS FREE OF DEFECTS, MERCHANTABLE, FIT FOR A PARTICUL"
        + "AR PURPOSE OR NON-INFRINGING. THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE "
        + "OF THE COVERED CODE IS WITH YOU. SHOULD ANY COVERED CODE PROVE DEFECTIVE IN ANY "
        + "RESPECT, YOU (NOT THE INITIAL DEVELOPER OR ANY OTHER CONTRIBUTOR) ASSUME THE COS"
        + "T OF ANY NECESSARY SERVICING, REPAIR OR CORRECTION. THIS DISCLAIMER OF WARRANTY "
        + "CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY COVERED CODE IS AUT"
        + "HORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "8. Termination\n"
        + "\n"
        + "8.1. This License and the rights granted hereunder will terminate automatically "
        + "if You fail to comply with terms herein and fail to cure such breach within 30 d"
        + "ays of becoming aware of the breach. All sublicenses to the Covered Code which a"
        + "re properly granted shall survive any termination of this License. Provisions wh"
        + "ich, by their nature, must remain in effect beyond the termination of this Licen"
        + "se shall survive.\n"
        + "\n"
        + "8.2. If You initiate litigation by asserting a patent infringement claim (exclud"
        + "ing declatory judgment actions) against Initial Developer or a Contributor (the "
        + "Initial Developer or Contributor against whom You file such action is referred t"
        + "o as \"Participant\") alleging that:\n"
        + "\n"
        + "such Participant's Contributor Version directly or indirectly infringes any pate"
        + "nt, then any and all rights granted by such Participant to You under Sections 2."
        + "1 and/or 2.2 of this License shall, upon 60 days notice from Participant termina"
        + "te prospectively, unless if within 60 days after receipt of notice You either: ("
        + "i) agree in writing to pay Participant a mutually agreeable reasonable royalty f"
        + "or Your past and future use of Modifications made by such Participant, or (ii) w"
        + "ithdraw Your litigation claim with respect to the Contributor Version against su"
        + "ch Participant. If within 60 days of notice, a reasonable royalty and payment ar"
        + "rangement are not mutually agreed upon in writing by the parties or the litigati"
        + "on claim is not withdrawn, the rights granted by Participant to You under Sectio"
        + "ns 2.1 and/or 2.2 automatically terminate at the expiration of the 60 day notice"
        + " period specified above.\n"
        + "any software, hardware, or device, other than such Participant's Contributor Ver"
        + "sion, directly or indirectly infringes any patent, then any rights granted to Yo"
        + "u by such Participant under Sections 2.1(b) and 2.2(b) are revoked effective as "
        + "of the date You first made, used, sold, distributed, or had made, Modifications "
        + "made by that Participant.\n"
        + "8.3. If You assert a patent infringement claim against Participant alleging that"
        + " such Participant's Contributor Version directly or indirectly infringes any pat"
        + "ent where such claim is resolved (such as by license or settlement) prior to the"
        + " initiation of patent infringement litigation, then the reasonable value of the "
        + "licenses granted by such Participant under Sections 2.1 or 2.2 shall be taken in"
        + "to account in determining the amount or value of any payment or license.\n"
        + "\n"
        + "8.4. In the event of termination under Sections 8.1 or 8.2 above, all end user l"
        + "icense agreements (excluding distributors and resellers) which have been validly"
        + " granted by You or any distributor hereunder prior to termination shall survive "
        + "termination.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY\n"
        + "\n"
        + "UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING NEGLIG"
        + "ENCE), CONTRACT, OR OTHERWISE, SHALL YOU, THE INITIAL DEVELOPER, ANY OTHER CONTR"
        + "IBUTOR, OR ANY DISTRIBUTOR OF COVERED CODE, OR ANY SUPPLIER OF ANY OF SUCH PARTI"
        + "ES, BE LIABLE TO ANY PERSON FOR ANY INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENT"
        + "IAL DAMAGES OF ANY CHARACTER INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF "
        + "GOODWILL, WORK STOPPAGE, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL OTHER C"
        + "OMMERCIAL DAMAGES OR LOSSES, EVEN IF SUCH PARTY SHALL HAVE BEEN INFORMED OF THE "
        + "POSSIBILITY OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY SHALL NOT APPLY TO LIA"
        + "BILITY FOR DEATH OR PERSONAL INJURY RESULTING FROM SUCH PARTY'S NEGLIGENCE TO TH"
        + "E EXTENT APPLICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISDICTIONS DO NOT ALL"
        + "OW THE EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THIS E"
        + "XCLUSION AND LIMITATION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "10. U.S. government end users\n"
        + "\n"
        + "The Covered Code is a \"commercial item,\" as that term is defined in 48 C.F.R. 2."
        + "101 (Oct. 1995), consisting of \"commercial computer software\" and \"commercial co"
        + "mputer software documentation,\" as such terms are used in 48 C.F.R. 12.212 (Sept"
        + ". 1995). Consistent with 48 C.F.R. 12.212 and 48 C.F.R. 227.7202-1 through 227.7"
        + "202-4 (June 1995), all U.S. Government End Users acquire Covered Code with only "
        + "those rights set forth herein.\n"
        + "\n"
        + "11. Miscellaneous\n"
        + "\n"
        + "This License represents the complete agreement concerning subject matter hereof."
        + " If any provision of this License is held to be unenforceable, such provision sh"
        + "all be reformed only to the extent necessary to make it enforceable. This Licens"
        + "e shall be governed by California law provisions (except to the extent applicabl"
        + "e law, if any, provides otherwise), excluding its conflict-of-law provisions. Wi"
        + "th respect to disputes in which at least one party is a citizen of, or an entity"
        + " chartered or registered to do business in the United States of America, any lit"
        + "igation relating to this License shall be subject to the jurisdiction of the Fed"
        + "eral Courts of the Northern District of California, with venue lying in Santa Cl"
        + "ara County, California, with the losing party responsible for costs, including w"
        + "ithout limitation, court costs and reasonable attorneys' fees and expenses. The "
        + "application of the United Nations Convention on Contracts for the International "
        + "Sale of Goods is expressly excluded. Any law or regulation which provides that t"
        + "he language of a contract shall be construed against the drafter shall not apply"
        + " to this License.\n"
        + "\n"
        + "12. Responsibility for claims\n"
        + "\n"
        + "As between Initial Developer and the Contributors, each party is responsible for"
        + " claims and damages arising, directly or indirectly, out of its utilization of r"
        + "ights under this License and You agree to work with Initial Developer and Contri"
        + "butors to distribute such responsibility on an equitable basis. Nothing herein i"
        + "s intended or shall be deemed to constitute any admission of liability.\n"
        + "\n"
        + "13. Multiple-licensed code\n"
        + "\n"
        + "Initial Developer may designate portions of the Covered Code as \"Multiple-Licens"
        + "ed\". \"Multiple-Licensed\" means that the Initial Developer permits you to utilize"
        + " portions of the Covered Code under Your choice of the MPL or the alternative li"
        + "censes, if any, specified by the Initial Developer in the file described in Exhi"
        + "bit A.\n"
        + "\n"
        + "Exhibit A - Mozilla Public License.\n"
        + "\n"
        + "\"The contents of this file are subject to the Mozilla Public License\n"
        + "Version 1.1 (the \"License\"); you may not use this file except in\n"
        + "compliance with the License. You may obtain a copy of the License at\n"
        + "http://www.mozilla.org/MPL/\n"
        + "\n"
        + "Software distributed under the License is distributed on an \"AS IS\"\n"
        + "basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the\n"
        + "License for the specific language governing rights and limitations\n"
        + "under the License.\n"
        + "\n"
        + "The Original Code is ______________________________________.\n"
        + "\n"
        + "The Initial Developer of the Original Code is ________________________.\n"
        + "Portions created by ______________________ are Copyright (C) ______\n"
        + "_______________________. All Rights Reserved.\n"
        + "\n"
        + "Contributor(s): ______________________________________.\n"
        + "\n"
        + "Alternatively, the contents of this file may be used under the terms\n"
        + "of the _____ license (the  \"[___] License\"), in which case the\n"
        + "provisions of [______] License are applicable instead of those\n"
        + "above. If you wish to allow use of your version of this file only\n"
        + "under the terms of the [____] License and not to allow others to use\n"
        + "your version of this file under the MPL, indicate your decision by\n"
        + "deleting the provisions above and replace them with the notice and\n"
        + "other provisions required by the [___] License. If you do not delete\n"
        + "the provisions above, a recipient may use your version of this file\n"
        + "under either the MPL or the [___] License.\"\n"
        + "NOTE: The text of this Exhibit A may differ slightly from the text of the notice"
        + "s in the Source Code files of the Original Code. You should use the text of this"
        + " Exhibit A rather than the text found in the Original Code Source Code for Your "
        + "Modifications.\n"
; // the license text
    }
 
    
}
