package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:58Z
 * LicenseName: AGPL-3.0+
 * FileName: Nokia.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Nokia extends License{
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
        return "Nokia"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Nokia Open Source License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Nokia Open Source License (NOKOS License) \n"
        + "\n"
        + "Version 1.0a \n"
        + "\n"
        + "1. DEFINITIONS.\n"
        + "\n"
        + "\"Affiliates\" of a party shall mean an entity\n"
        + "\n"
        + "     a) which is directly or indirectly controlling such party;\n"
        + "\n"
        + "     b) which is under the same direct or indirect ownership or control as such "
        + "party; or\n"
        + "\n"
        + "     c) which is directly or indirectly owned or controlled by such party.\n"
        + "\n"
        + "     For these purposes, an entity shall be treated as being controlled by anoth"
        + "er if that other entity has fifty percent (50%) or more of the votes in such ent"
        + "ity, is able to direct its affairs and/or to control the composition of its boar"
        + "d of directors or equivalent body.\n"
        + "\n"
        + "\"Commercial Use\" shall mean distribution or otherwise making the Covered Softwar"
        + "e available to a third party.\n"
        + "\n"
        + "\"Contributor\" shall mean each entity that creates or contributes to the creation"
        + " of Modifications.\n"
        + "\n"
        + "\"Contributor Version\" shall mean in case of any Contributor the combination of t"
        + "he Original Software, prior Modifications used by a Contributor, and the Modific"
        + "ations made by that particular Contributor and in case of Nokia in addition the "
        + "Original Software in any form, including the form as Exceutable.\n"
        + "\n"
        + "\"Covered Software\" shall mean the Original Software or Modifications or the comb"
        + "ination of the Original Software and Modifications, in each case including porti"
        + "ons thereof.\n"
        + "\n"
        + "\"Electronic Distribution Mechanism\" shall mean a mechanism generally accepted in"
        + " the software development community for the electronic transfer of data.\n"
        + "\n"
        + "\"Executable\" shall mean Covered Software in any form other than Source Code.\n"
        + "\n"
        + "\"Nokia\" shall mean Nokia Corporation and its Affiliates.\n"
        + "\n"
        + "\"Larger Work\" shall mean a work, which combines Covered Software or portions the"
        + "reof with code not governed by the terms of this License.\n"
        + "\n"
        + "\"License\" shall mean this document.\n"
        + "\n"
        + "\"Licensable\" shall mean having the right to grant, to the maximum extent possibl"
        + "e, whether at the time of the initial grant or subsequently acquired, any and al"
        + "l of the rights conveyed herein.\n"
        + "\n"
        + "\"Modifications\" shall mean any addition to or deletion from the substance or str"
        + "ucture of either the Original Software or any previous Modifications. When Cover"
        + "ed Software is released as a series of files, a Modification is:\n"
        + "\n"
        + "     a) Any addition to or deletion from the contents of a file containing Origi"
        + "nal Software or previous Modifications.\n"
        + "\n"
        + "     b) Any new file that contains any part of the Original Software or previous"
        + " Modifications.\n"
        + "\n"
        + "\"Original Software\" shall mean the Source Code of computer software code which i"
        + "s described in the Source Code notice required by Exhibit A as Original Software"
        + ", and which, at the time of its release under this License is not already Covere"
        + "d Software governed by this License.\n"
        + "\n"
        + "\"Patent Claims\" shall mean any patent claim(s), now owned or hereafter acquired,"
        + " including without limitation, method, process, and apparatus claims, in any pat"
        + "ent Licensable by grantor.\n"
        + "\n"
        + "\"Source Code\" shall mean the preferred form of the Covered Software for making m"
        + "odifications to it, including all modules it contains, plus any associated inter"
        + "face definition files, scripts used to control compilation and installation of a"
        + "n Executable, or source code differential comparisons against either the Origina"
        + "l Software or another well known, available Covered Software of the Contributor'"
        + "s choice. The Source Code can be in a compressed or archival form, provided the "
        + "appropriate decompression or de-archiving software is widely available for no ch"
        + "arge.\n"
        + "\n"
        + "\"You\" (or \"Your\") shall mean an individual or a legal entity exercising rights u"
        + "nder, and complying with all of the terms of, this License or a future version o"
        + "f this License issued under Section 6.1. For legal entities, \"You\" includes Affi"
        + "liates of such entity.\n"
        + "\n"
        + "2. SOURCE CODE LICENSE.\n"
        + "\n"
        + "     2.1 Nokia Grant.\n"
        + "     Subject to the terms of this License, Nokia hereby grants You a world-wide,"
        + " royalty-free, non-exclusive license, subject to third party intellectual proper"
        + "ty claims:\n"
        + "\n"
        + "     a) under copyrights Licensable by Nokia to use, reproduce, modify, display,"
        + " perform, sublicense and distribute the Original Software (or portions thereof) "
        + "with or without Modifications, and/or as part of a Larger Work;\n"
        + "\n"
        + "     b) and under Patents Claims necessarily infringed by the making, using or s"
        + "elling of Original Software, to make, have made, use, practice, sell, and offer "
        + "for sale, and/or otherwise dispose of the Original Software (or portions thereof"
        + ").\n"
        + "\n"
        + "     c) The licenses granted in this Section 2.1(a) and (b) are effective on the"
        + " date Nokia first distributes Original Software under the terms of this License.\n"
        + "\n"
        + "     d) Notwithstanding Section 2.1(b) above, no patent license is granted: 1) f"
        + "or code that You delete from the Original Software; 2) separate from the Origina"
        + "l Software; or 3) for infringements caused by: i) the modification of the Origin"
        + "al Software or ii) the combination of the Original Software with other software "
        + "or devices.\n"
        + "\n"
        + "     2.2 Contributor Grant.\n"
        + "     Subject to the terms of this License and subject to third party intellectua"
        + "l property claims, each Contributor hereby grants You a world-wide, royalty-free"
        + ", non-exclusive license\n"
        + "\n"
        + "     a) under copyrights Licensable by Contributor, to use, reproduce, modify, d"
        + "isplay, perform, sublicense and distribute the Modifications created by such Con"
        + "tributor (or portions thereof) either on an unmodified basis, with other Modific"
        + "ations, as Covered Software and/or as part of a Larger Work; and\n"
        + "\n"
        + "     b) under Patent Claims necessarily infringed by the making, using, or selli"
        + "ng of Modifications made by that Contributor either alone and/or in combination "
        + "with its Contributor Version (or portions of such combination), to make, use, se"
        + "ll, offer for sale, have made, and/or otherwise dispose of: 1) Modifications mad"
        + "e by that Contributor (or portions thereof); and 2) the combination of Modificat"
        + "ions made by that Contributor with its Contributor Version (or portions of such "
        + "combination).\n"
        + "\n"
        + "     c) The licenses granted in Sections 2.2(a) and 2.2(b) are effective on the "
        + "date Contributor first makes Commercial Use of the Covered Software.\n"
        + "\n"
        + "     d) Notwithstanding Section 2.2(b) above, no patent license is granted: 1) f"
        + "or any code that Contributor has deleted from the Contributor Version; 2) separa"
        + "te from the Contributor Version; 3) for infringements caused by: i) third party "
        + "modifications of Contributor Version or ii) the combination of Modifications mad"
        + "e by that Contributor with other software (except as part of the Contributor Ver"
        + "sion) or other devices; or 4) under Patent Claims infringed by Covered Software "
        + "in the absence of Modifications made by that Contributor.\n"
        + "\n"
        + "3. DISTRIBUTION OBLIGATIONS.\n"
        + "\n"
        + "     3.1 Application of License. \n"
        + "     The Modifications which You create or to which You contribute are governed "
        + "by the terms of this License, including without limitation Section 2.2. The Sour"
        + "ce Code version of Covered Software may be distributed only under the terms of t"
        + "his License or a future version of this License released under Section 6.1, and "
        + "You must include a copy of this License with every copy of the Source Code You d"
        + "istribute. You may not offer or impose any terms on any Source Code version that"
        + " alters or restricts the applicable version of this License or the recipients' r"
        + "ights hereunder. However, You may include an additional document offering the ad"
        + "ditional rights described in Section 3.5.\n"
        + "\n"
        + "     3.2 Availability of Source Code.\n"
        + "     Any Modification which You create or to which You contribute must be made a"
        + "vailable in Source Code form under the terms of this License either on the same "
        + "media as an Executable version or via an accepted Electronic Distribution Mechan"
        + "ism to anyone to whom you made an Executable version available; and if made avai"
        + "lable via Electronic Distribution Mechanism, must remain available for at least "
        + "twelve (12) months after the date it initially became available, or at least six"
        + " (6) months after a subsequent version of that particular Modification has been "
        + "made available to such recipients. You are responsible for ensuring that the Sou"
        + "rce Code version remains available even if the Electronic Distribution Mechanism"
        + " is maintained by a third party.\n"
        + "\n"
        + "     3.3 Description of Modifications.\n"
        + "     You must cause all Covered Software to which You contribute to contain a fi"
        + "le documenting the changes You made to create that Covered Software and the date"
        + " of any change. You must include a prominent statement that the Modification is "
        + "derived, directly or indirectly, from Original Software provided by Nokia and in"
        + "cluding the name of Nokia in (a) the Source Code, and (b) in any notice in an Ex"
        + "ecutable version or related documentation in which You describe the origin or ow"
        + "nership of the Covered Software.\n"
        + "\n"
        + "     3.4 Intellectual Property Matters\n"
        + "\n"
        + "          (a) Third Party Claims. If Contributor has knowledge that a license un"
        + "der a third party's intellectual property rights is required to exercise the rig"
        + "hts granted by such Contributor under Sections 2.1 or 2.2, Contributor must incl"
        + "ude a text file with the Source Code distribution titled \"LEGAL\" which describes"
        + " the claim and the party making the claim in sufficient detail that a recipient "
        + "will know whom to contact. If Contributor obtains such knowledge after the Modif"
        + "ication is made available as described in Section 3.2, Contributor shall promptl"
        + "y modify the LEGAL file in all copies Contributor makes available thereafter and"
        + " shall take other steps (such as notifying appropriate mailing lists or newsgrou"
        + "ps) reasonably calculated to inform those who received the Covered Software that"
        + " new knowledge has been obtained.\n"
        + "\n"
        + "          (b) Contributor APIs. If Contributor's Modifications include an applic"
        + "ation programming interface and Contributor has knowledge of patent licenses whi"
        + "ch are reasonably necessary to implement that API, Contributor must also include"
        + " this information in the LEGAL file.\n"
        + "\n"
        + "          (c) Representations. Contributor represents that, except as disclosed "
        + "pursuant to Section 3.4(a) above, Contributor believes that Contributor's Modifi"
        + "cations are Contributor's original creation(s) and/or Contributor has sufficient"
        + " rights to grant the rights conveyed by this License.\n"
        + "\n"
        + "     3.5 Required Notices.\n"
        + "     You must duplicate the notice in Exhibit A in each file of the Source Code."
        + " If it is not possible to put such notice in a particular Source Code file due t"
        + "o its structure, then You must include such notice in a location (such as a rele"
        + "vant directory) where a user would be likely to look for such a notice. If You c"
        + "reated one or more Modification(s) You may add your name as a Contributor to the"
        + " notice described in Exhibit A. You must also duplicate this License in any docu"
        + "mentation for the Source Code where You describe recipients' rights or ownership"
        + " rights relating to Covered Software. You may choose to offer, and to charge a f"
        + "ee for, warranty, support, indemnity or liability obligations to one or more rec"
        + "ipients of Covered Software. However, You may do so only on Your own behalf, and"
        + " not on behalf of Nokia or any Contributor. You must make it absolutely clear th"
        + "at any such warranty, support, indemnity or liability obligation is offered by Y"
        + "ou alone, and You hereby agree to indemnify Nokia and every Contributor for any "
        + "liability incurred by Nokia or such Contributor as a result of warranty, support"
        + ", indemnity or liability terms You offer.\n"
        + "\n"
        + "     3.6 Distribution of Executable Versions.\n"
        + "     You may distribute Covered Software in Executable form only if the requirem"
        + "ents of Section 3.1-3.5 have been met for that Covered Software, and if You incl"
        + "ude a notice stating that the Source Code version of the Covered Software is ava"
        + "ilable under the terms of this License, including a description of how and where"
        + " You have fulfilled the obligations of Section 3.2. The notice must be conspicuo"
        + "usly included in any notice in an Executable version, related documentation or c"
        + "ollateral in which You describe recipients' rights relating to the Covered Softw"
        + "are. You may distribute the Executable version of Covered Software or ownership "
        + "rights under a license of Your choice, which may contain terms different from th"
        + "is License, provided that You are in compliance with the terms of this License a"
        + "nd that the license for the Executable version does not attempt to limit or alte"
        + "r the recipient's rights in the Source Code version from the rights set forth in"
        + " this License. If You distribute the Executable version under a different licens"
        + "e You must make it absolutely clear that any terms which differ from this Licens"
        + "e are offered by You alone, not by Nokia or any Contributor. You hereby agree to"
        + " indemnify Nokia and every Contributor for any liability incurred by Nokia or su"
        + "ch Contributor as a result of any such terms You offer.\n"
        + "\n"
        + "     3.7 Larger Works.\n"
        + "     You may create a Larger Work by combining Covered Software with other softw"
        + "are not governed by the terms of this License and distribute the Larger Work as "
        + "a single product. In such a case, You must make sure the requirements of this Li"
        + "cense are fulfilled for the Covered Software.\n"
        + "\n"
        + "4. INABILITY TO COMPLY DUE TO STATUTE OR REGULATION.\n"
        + "If it is impossible for You to comply with any of the terms of this License with"
        + " respect to some or all of the Covered Software due to statute, judicial order, "
        + "or regulation then You must: (a) comply with the terms of this License to the ma"
        + "ximum extent possible; and (b) describe the limitations and the code they affect"
        + ". Such description must be included in the LEGAL file described in Section 3.4 a"
        + "nd must be included with all distributions of the Source Code.\n"
        + "\n"
        + "Except to the extent prohibited by statute or regulation, such description must "
        + "be sufficiently detailed for a recipient of ordinary skill to be able to underst"
        + "and it.\n"
        + "\n"
        + "5. APPLICATION OF THIS LICENSE.\n"
        + "This License applies to code to which Nokia has attached the notice in Exhibit A"
        + " and to related Covered Software.\n"
        + "\n"
        + "6. VERSIONS OF THE LICENSE. \n"
        + "\n"
        + "     6.1 New Versions.\n"
        + "     Nokia may publish revised and/or new versions of the License from time to t"
        + "ime. Each version will be given a distinguishing version number.\n"
        + "\n"
        + "     6.2 Effect of New Versions.\n"
        + "     Once Covered Software has been published under a particular version of the "
        + "License, You may always continue to use it under the terms of that version. You "
        + "may also choose to use such Covered Software under the terms of any subsequent v"
        + "ersion of the License published by Nokia. No one other than Nokia has the right "
        + "to modify the terms applicable to Covered Software created under this License.\n"
        + "\n"
        + "7. DISCLAIMER OF WARRANTY.\n"
        + "COVERED SOFTWARE IS PROVIDED UNDER THIS LICENSE ON AN \"AS IS\" BASIS, WITHOUT WAR"
        + "RANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, W"
        + "ARRANTIES THAT THE COVERED SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT FOR A "
        + "PARTICULAR PURPOSE OR NON-INFRINGING. THE ENTIRE RISK AS TO THE QUALITY AND PERF"
        + "ORMANCE OF THE COVERED SOFTWARE IS WITH YOU. SHOULD ANY COVERED SOFTWARE PROVE D"
        + "EFECTIVE IN ANY RESPECT, YOU (NOT NOKIA, ITS LICENSORS OR AFFILIATES OR ANY OTHE"
        + "R CONTRIBUTOR) ASSUME THE COST OF ANY NECESSARY SERVICING, REPAIR OR CORRECTION."
        + " THIS DISCLAIMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO U"
        + "SE OF ANY COVERED SOFTWARE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "8. TERMINATION.\n"
        + "\n"
        + "     8.1 This License and the rights granted hereunder will terminate automatica"
        + "lly if You fail to comply with terms herein and fail to cure such breach within "
        + "30 days of becoming aware of the breach. All sublicenses to the Covered Software"
        + " which are properly granted shall survive any termination of this License. Provi"
        + "sions which, by their nature, must remain in effect beyond the termination of th"
        + "is License shall survive.\n"
        + "\n"
        + "     8.2 If You initiate litigation by asserting a patent infringement claim (ex"
        + "cluding declatory judgment actions) against Nokia or a Contributor (Nokia or Con"
        + "tributor against whom You file such action is referred to as \"Participant\") alle"
        + "ging that:\n"
        + "\n"
        + "          a) such Participant's Contributor Version directly or indirectly infri"
        + "nges any patent, then any and all rights granted by such Participant to You unde"
        + "r Sections 2.1 and/or 2.2 of this License shall, upon 60 days notice from Partic"
        + "ipant terminate prospectively, unless if within 60 days after receipt of notice "
        + "You either: (i) agree in writing to pay Participant a mutually agreeable reasona"
        + "ble royalty for Your past and future use of Modifications made by such Participa"
        + "nt, or (ii) withdraw Your litigation claim with respect to the Contributor Versi"
        + "on against such Participant. If within 60 days of notice, a reasonable royalty a"
        + "nd payment arrangement are not mutually agreed upon in writing by the parties or"
        + " the litigation claim is not withdrawn, the rights granted by Participant to You"
        + " under Sections 2.1 and/or 2.2 automatically terminate at the expiration of the "
        + "60 day notice period specified above.\n"
        + "\n"
        + "          b) any software, hardware, or device, other than such Participant's Co"
        + "ntributor Version, directly or indirectly infringes any patent, then any rights "
        + "granted to You by such Participant under Sections 2.1(b) and 2.2(b) are revoked "
        + "effective as of the date You first made, used, sold, distributed, or had made, M"
        + "odifications made by that Participant.\n"
        + "\n"
        + "     8.3 If You assert a patent infringement claim against Participant alleging "
        + "that such Participant's Contributor Version directly or indirectly infringes any"
        + " patent where such claim is resolved (such as by license or settlement) prior to"
        + " the initiation of patent infringement litigation, then the reasonable value of "
        + "the licenses granted by such Participant under Sections 2.1 or 2.2 shall be take"
        + "n into account in determining the amount or value of any payment or license.\n"
        + "\n"
        + "     8.4 In the event of termination under Sections 8.1 or 8.2 above, all end us"
        + "er license agreements (excluding distributors and resellers) which have been val"
        + "idly granted by You or any distributor hereunder prior to termination shall surv"
        + "ive termination.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY.\n"
        + "UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING NEGLIG"
        + "ENCE), CONTRACT, OR OTHERWISE, SHALL YOU, NOKIA, ANY OTHER CONTRIBUTOR, OR ANY D"
        + "ISTRIBUTOR OF COVERED SOFTWARE, OR ANY SUPPLIER OF ANY OF SUCH PARTIES, BE LIABL"
        + "E TO ANY PERSON FOR ANY INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES "
        + "OF ANY CHARACTER INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, WO"
        + "RK STOPPAGE, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL OTHER COMMERCIAL DA"
        + "MAGES OR LOSSES, EVEN IF SUCH PARTY SHALL HAVE BEEN INFORMED OF THE POSSIBILITY "
        + "OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY SHALL NOT APPLY TO LIABILITY FOR D"
        + "EATH OR PERSONAL INJURY RESULTING FROM SUCH PARTY'S NEGLIGENCE TO THE EXTENT APP"
        + "LICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISDICTIONS DO NOT ALLOW THE EXCLU"
        + "SION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, BUT MAY ALLOW LIABILI"
        + "TY TO BE LIMITED; IN SUCH CASES, A PARTY's, ITS EMPLOYEES, LICENSORS OR AFFILIAT"
        + "ES' LIABILITY SHALL BE LIMITED TO U.S. $50. Nothing contained in this License sh"
        + "all prejudice the statutory rights of any party dealing as a consumer.\n"
        + "\n"
        + "10. MISCELLANEOUS.\n"
        + "This License represents the complete agreement concerning subject matter hereof."
        + " All rights in the Covered Software not expressly granted under this License are"
        + " reserved. Nothing in this License shall grant You any rights to use any of the "
        + "trademarks of Nokia or any of its Affiliates, even if any of such trademarks are"
        + " included in any part of Covered Software and/or documentation to it.\n"
        + "\n"
        + "This License is governed by the laws of Finland excluding its conflict-of-law pr"
        + "ovisions. All disputes arising from or relating to this Agreement shall be settl"
        + "ed by a single arbitrator appointed by the Central Chamber of Commerce of Finlan"
        + "d. The arbitration procedure shall take place in Helsinki, Finland in the Englis"
        + "h language. If any part of this Agreement is found void and unenforceable, it wi"
        + "ll not affect the validity of the balance of the Agreement, which shall remain v"
        + "alid and enforceable according to its terms.\n"
        + "\n"
        + "11. RESPONSIBILITY FOR CLAIMS.\n"
        + "As between Nokia and the Contributors, each party is responsible for claims and "
        + "damages arising, directly or indirectly, out of its utilization of rights under "
        + "this License and You agree to work with Nokia and Contributors to distribute suc"
        + "h responsibility on an equitable basis. Nothing herein is intended or shall be d"
        + "eemed to constitute any admission of liability.\n"
        + "\n"
        + "EXHIBIT A\n"
        + "\n"
        + "The contents of this file are subject to the NOKOS License Version 1.0 (the \"Lic"
        + "ense\"); you may not use this file except in compliance with the License.\n"
        + "\n"
        + "Software distributed under the License is distributed on an \"AS IS\" basis, WITHO"
        + "UT WARRANTY OF ANY KIND, either express or implied. See the License for the spec"
        + "ific language governing rights and limitations under the License.\n"
        + "\n"
        + "The Original Software is\n"
        + "\n"
        + "______________________________________.\n"
        + "\n"
        + "Copyright © <year> Nokia and others. All Rights Reserved.\n"
        + "\n"
        + "Contributor(s): ______________________________________.\n"
; // the license text
    }
 
    
}
