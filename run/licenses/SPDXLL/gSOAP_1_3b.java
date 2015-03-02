package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:28:51Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: gSOAP_1_3b.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class gSOAP_1_3b extends License{
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
        return "gSOAP-1.3b"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "gSOAP Public License v1.3b"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "gSOAP Public License\n"
        + "\n"
        + "Version 1.3b\n"
        + "\n"
        + "The gSOAP public license is derived from the Mozilla Public License (MPL1.1). Th"
        + "e sections that were deleted from the original MPL1.1 text are 1.0.1, 2.1.(c),(d"
        + "), 2.2.(c),(d), 8.2.(b), 10, and 11. Section 3.8 was added. The modified section"
        + "s are 2.1.(b), 2.2.(b), 3.2 (simplified), 3.5 (deleted the last sentence), and 3"
        + ".6 (simplified).\n"
        + "\n"
        + "This license applies to the gSOAP software package, with the exception of the so"
        + "apcpp2 and wsdl2h source code located in gsoap/src and gsoap/wsdl, all code gene"
        + "rated by soapcpp2 and wsdl2h, the UDDI source code gsoap/uddi2, and the Web serv"
        + "er sample source code samples/webserver. To use any of these software tools and "
        + "components commercially, a commercial license is required and can be obtained fr"
        + "om www.genivia.com.\n"
        + "\n"
        + "1  DEFINITIONS.\n"
        + "\n"
        + "1.0.1.\n"
        + "1.1. \"Contributor\"\n"
        + "means each entity that creates or contributes to the creation of Modifications.\n"
        + "1.2. \"Contributor Version\"\n"
        + "means the combination of the Original Code, prior Modifications used by a Contri"
        + "butor, and the Modifications made by that particular Contributor.\n"
        + "1.3. \"Covered Code\"\n"
        + "means the Original Code, or Modifications or the combination of the Original Cod"
        + "e, and Modifications, in each case including portions thereof.\n"
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
        + "A.  Any addition to or deletion from the contents of a file containing Original"
        + " Code or previous Modifications.\n"
        + "B.  Any new file that contains any part of the Original Code, or previous Modif"
        + "ications.\n"
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
        + "\n"
        + "2  SOURCE CODE LICENSE.\n"
        + "\n"
        + "2.1. The Initial Developer Grant.\n"
        + "\n"
        + "The Initial Developer hereby grants You a world-wide, royalty-free, non-exclusiv"
        + "e license, subject to third party intellectual property claims:\n"
        + "(a)  under intellectual property rights (other than patent or trademark) Licensa"
        + "ble by Initial Developer to use, reproduce, modify, display, perform, sublicense"
        + " and distribute the Original Code (or portions thereof) with or without Modifica"
        + "tions, and/or as part of a Larger Work; and\n"
        + "(b)  under patents now or hereafter owned or controlled by Initial Developer, to"
        + " make, have made, use and sell (\"offer to sell and import\") the Original Code, M"
        + "odifications, or portions thereof, but solely to the extent that any such patent"
        + " is reasonably necessary to enable You to utilize, alone or in combination with "
        + "other software, the Original Code, Modifications, or any combination or portions"
        + " thereof.\n"
        + "(c)\n"
        + "(d)\n"
        + "\n"
        + "2.2. Contributor Grant.\n"
        + "\n"
        + "Subject to third party intellectual property claims, each Contributor hereby gra"
        + "nts You a world-wide, royalty-free, non-exclusive license\n"
        + "(a)  under intellectual property rights (other than patent or trademark) Licensa"
        + "ble by Contributor, to use, reproduce, modify, display, perform,   sublicense an"
        + "d distribute the Modifications created by such Contributor (or portions thereof)"
        + " either on an unmodified basis, with other Modifications, as Covered Code and/or"
        + " as part of a Larger Work; and\n"
        + "(b)  under patents now or hereafter owned or controlled by Contributor, to make,"
        + " have made, use and sell (\"offer to sell and import\") the Contributor Version (o"
        + "r portions thereof), but solely to the extent that any such patent is reasonably"
        + " necessary to enable You to utilize, alone or in combination with other software"
        + ", the Contributor Version (or portions thereof).\n"
        + "(c)\n"
        + "(d)\n"
        + "\n"
        + "3  DISTRIBUTION OBLIGATIONS.\n"
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
        + "rights described in Section 3.5. \n"
        + "\n"
        + "3.2. Availability of Source Code.\n"
        + "\n"
        + "Any Modification created by You will be provided to the Initial Developer in Sou"
        + "rce Code form and are subject to the terms of the License. \n"
        + "\n"
        + "3.3. Description of Modifications.\n"
        + "\n"
        + "You must cause all Covered Code to which You contribute to contain a file docume"
        + "nting the changes You made to create that Covered Code and the date of any chang"
        + "e. You must include a prominent statement that the Modification is derived, dire"
        + "ctly or indirectly, from Original Code provided by the Initial Developer and inc"
        + "luding the name of the Initial Developer in (a) the Source Code, and (b) in any "
        + "notice in an Executable version or related documentation in which You describe t"
        + "he origin or ownership of the Covered Code. \n"
        + "\n"
        + "3.4. Intellectual Property Matters.\n"
        + "(a) Third Party Claims.\n"
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
        + "(b) Contributor APIs.\n"
        + "If Contributor's Modifications include an application programming interface and "
        + "Contributor has knowledge of patent licenses which are reasonably necessary to i"
        + "mplement that API, Contributor must also include this information in the LEGAL f"
        + "ile.\n"
        + "(c) Representations.\n"
        + "Contributor represents that, except as disclosed pursuant to Section 3.4(a) abov"
        + "e, Contributor believes that Contributor's Modifications are Contributor's origi"
        + "nal creation(s) and/or Contributor has sufficient rights to grant the rights con"
        + "veyed by this License.\n"
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
        + "f of the Initial Developer or any Contributor. \n"
        + "\n"
        + "3.6. Distribution of Executable Versions.\n"
        + "\n"
        + "You may distribute Covered Code in Executable form only if the requirements of S"
        + "ection 3.1-3.5 have been met for that Covered Code. You may distribute the Execu"
        + "table version of Covered Code or ownership rights under a license of Your choice"
        + ", which may contain terms different from this License, provided that You are in "
        + "compliance with the terms of this License and that the license for the Executabl"
        + "e version does not attempt to limit or alter the recipient's rights in the Sourc"
        + "e Code version from the rights set forth in this License. If You distribute the "
        + "Executable version under a different license You must make it absolutely clear t"
        + "hat any terms which differ from this License are offered by You alone, not by th"
        + "e Initial Developer or any Contributor. If you distribute executable versions co"
        + "ntaining Covered Code as part of a product, you must reproduce the notice in Exh"
        + "ibit B in the documentation and/or other materials provided with the product. \n"
        + "\n"
        + "3.7. Larger Works.\n"
        + "\n"
        + "You may create a Larger Work by combining Covered Code with other code not gover"
        + "ned by the terms of this License and distribute the Larger Work as a single prod"
        + "uct. In such a case, You must make sure the requirements of this License are ful"
        + "filled for the Covered Code. \n"
        + "\n"
        + "3.8. Restrictions.\n"
        + "\n"
        + "You may not remove any product identification, copyright, proprietary notices or"
        + " labels from gSOAP.\n"
        + "\n"
        + "4  INABILITY TO COMPLY DUE TO STATUTE OR REGULATION.\n"
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
        + "5  APPLICATION OF THIS LICENSE.\n"
        + "\n"
        + "This License applies to code to which the Initial Developer has attached the not"
        + "ice in Exhibit A and to related Covered Code.\n"
        + "\n"
        + "6  VERSIONS OF THE LICENSE.\n"
        + "\n"
        + "6.1. New Versions.\n"
        + "\n"
        + "Grantor may publish revised and/or new versions of the License from time to time"
        + ". Each version will be given a distinguishing version number. \n"
        + "\n"
        + "6.2. Effect of New Versions.\n"
        + "\n"
        + "Once Covered Code has been published under a particular version of the License, "
        + "You may always continue to use it under the terms of that version. You may also "
        + "choose to use such Covered Code under the terms of any subsequent version of the"
        + " License. \n"
        + "\n"
        + "6.3. Derivative Works.\n"
        + "\n"
        + "If You create or use a modified version of this License (which you may only do i"
        + "n order to apply it to code which is not already Covered Code governed by this L"
        + "icense), You must (a) rename Your license so that the phrase \"gSOAP\" or any conf"
        + "usingly similar phrase do not appear in your license (except to note that your l"
        + "icense differs from this License) and (b) otherwise make it clear that Your vers"
        + "ion of the license contains terms which differ from the gSOAP Public License. (F"
        + "illing in the name of the Initial Developer, Original Code or Contributor in the"
        + " notice described in Exhibit A shall not of themselves be deemed to be modificat"
        + "ions of this License.)\n"
        + "\n"
        + "7  DISCLAIMER OF WARRANTY.\n"
        + "\n"
        + "COVERED CODE IS PROVIDED UNDER THIS LICENSE ON AN \"AS IS\" BASIS, WITHOUT WARRANT"
        + "Y OF ANY KIND, WHETHER EXPRESS, IMPLIED OR STATUTORY, INCLUDING, WITHOUT LIMITAT"
        + "ION, THE IMPLIED WARRANTIES OF MERCHANTABILITY, OF FITNESS FOR A PARTICULAR PURP"
        + "OSE, NONINFRINGEMENT OF THIRD PARTY INTELLECTUAL PROPERTY RIGHTS, AND ANY WARRAN"
        + "TY THAT MAY ARISE BY REASON OF TRADE USAGE, CUSTOM, OR COURSE OF DEALING. WITHOU"
        + "T LIMITING THE FOREGOING, YOU ACKNOWLEDGE THAT THE SOFTWARE IS PROVIDED \"AS IS\" "
        + "AND THAT THE AUTHORS DO NOT WARRANT THE SOFTWARE WILL RUN UNINTERRUPTED OR ERROR"
        + " FREE. LIMITED LIABILITY THE ENTIRE RISK AS TO RESULTS AND PERFORMANCE OF THE SO"
        + "FTWARE IS ASSUMED BY YOU. UNDER NO CIRCUMSTANCES WILL THE AUTHORS BE LIABLE FOR "
        + "ANY SPECIAL, INDIRECT, INCIDENTAL, EXEMPLARY OR CONSEQUENTIAL DAMAGES OF ANY KIN"
        + "D OR NATURE WHATSOEVER, WHETHER BASED ON CONTRACT, WARRANTY, TORT (INCLUDING NEG"
        + "LIGENCE), STRICT LIABILITY OR OTHERWISE, ARISING OUT OF OR IN ANY WAY RELATED TO"
        + " THE SOFTWARE, EVEN IF THE AUTHORS HAVE BEEN ADVISED ON THE POSSIBILITY OF SUCH "
        + "DAMAGE OR IF SUCH DAMAGE COULD HAVE BEEN REASONABLY FORESEEN, AND NOTWITHSTANDIN"
        + "G ANY FAILURE OF ESSENTIAL PURPOSE OF ANY EXCLUSIVE REMEDY PROVIDED. SUCH LIMITA"
        + "TION ON DAMAGES INCLUDES, BUT IS NOT LIMITED TO, DAMAGES FOR LOSS OF GOODWILL, L"
        + "OST PROFITS, LOSS OF DATA OR SOFTWARE, WORK STOPPAGE, COMPUTER FAILURE OR MALFUN"
        + "CTION OR IMPAIRMENT OF OTHER GOODS. IN NO EVENT WILL THE AUTHORS BE LIABLE FOR T"
        + "HE COSTS OF PROCUREMENT OF SUBSTITUTE SOFTWARE OR SERVICES. YOU ACKNOWLEDGE THAT"
        + " THIS SOFTWARE IS NOT DESIGNED FOR USE IN ON-LINE EQUIPMENT IN HAZARDOUS ENVIRON"
        + "MENTS SUCH AS OPERATION OF NUCLEAR FACILITIES, AIRCRAFT NAVIGATION OR CONTROL, O"
        + "R LIFE-CRITICAL APPLICATIONS. THE AUTHORS EXPRESSLY DISCLAIM ANY LIABILITY RESUL"
        + "TING FROM USE OF THE SOFTWARE IN ANY SUCH ON-LINE EQUIPMENT IN HAZARDOUS ENVIRON"
        + "MENTS AND ACCEPTS NO LIABILITY IN RESPECT OF ANY ACTIONS OR CLAIMS BASED ON THE "
        + "USE OF THE SOFTWARE IN ANY SUCH ON-LINE EQUIPMENT IN HAZARDOUS ENVIRONMENTS BY Y"
        + "OU. FOR PURPOSES OF THIS PARAGRAPH, THE TERM \"LIFE-CRITICAL APPLICATION\" MEANS A"
        + "N APPLICATION IN WHICH THE FUNCTIONING OR MALFUNCTIONING OF THE SOFTWARE MAY RES"
        + "ULT DIRECTLY OR INDIRECTLY IN PHYSICAL INJURY OR LOSS OF HUMAN LIFE. THIS DISCLA"
        + "IMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY CO"
        + "VERED CODE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "8  TERMINATION.\n"
        + "\n"
        + "8.1.\n"
        + "This License and the rights granted hereunder will terminate automatically if Yo"
        + "u fail to comply with terms herein and fail to cure such breach within 30 days o"
        + "f becoming aware of the breach. All sublicenses to the Covered Code which are pr"
        + "operly granted shall survive any termination of this License. Provisions which, "
        + "by their nature, must remain in effect beyond the termination of this License sh"
        + "all survive.\n"
        + "8.2.\n"
        + "8.3.\n"
        + "If You assert a patent infringement claim against Participant alleging that such"
        + " Participant's Contributor Version directly or indirectly infringes any patent w"
        + "here such claim is resolved (such as by license or settlement) prior to the init"
        + "iation of patent infringement litigation, then the reasonable value of the licen"
        + "ses granted by such Participant under Sections 2.1 or 2.2 shall be taken into ac"
        + "count in determining the amount or value of any payment or license.\n"
        + "8.4.\n"
        + "In the event of termination under Sections 8.1 or 8.2 above, all end user licens"
        + "e agreements (excluding distributors and resellers) which have been validly gran"
        + "ted by You or any distributor hereunder prior to termination shall survive termi"
        + "nation.\n"
        + "\n"
        + "9  LIMITATION OF LIABILITY.\n"
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
        + "10  U.S. GOVERNMENT END USERS.\n"
        + "\n"
        + "11  MISCELLANEOUS.\n"
        + "\n"
        + "12  RESPONSIBILITY FOR CLAIMS.\n"
        + "\n"
        + "As between Initial Developer and the Contributors, each party is responsible for"
        + " claims and damages arising, directly or indirectly, out of its utilization of r"
        + "ights under this License and You agree to work with Initial Developer and Contri"
        + "butors to distribute such responsibility on an equitable basis. Nothing herein i"
        + "s intended or shall be deemed to constitute any admission of liability.\n"
        + "\n"
        + "EXHIBIT A.\n"
        + "\n"
        + "\"The contents of this file are subject to the gSOAP Public License Version 1.3 ("
        + "the \"License\"); you may not use this file except in compliance with the License."
        + " You may obtain a copy of the License at\n"
        + "http://www.cs.fsu.edu/ engelen/soaplicense.html\n"
        + "Software distributed under the License is distributed on an \"AS IS\" basis, WITHO"
        + "UT WARRANTY OF ANY KIND, either express or implied. See the License for the spec"
        + "ific language governing rights and limitations under the License.\n"
        + "The Original Code of the gSOAP Software is: stdsoap.h, stdsoap2.h, stdsoap.c, st"
        + "dsoap2.c, stdsoap.cpp, stdsoap2.cpp, soapcpp2.h, soapcpp2.c, soapcpp2_lex.l, soa"
        + "pcpp2_yacc.y, error2.h, error2.c, symbol2.c, init2.c, soapdoc2.html, and soapdoc"
        + "2.pdf, httpget.h, httpget.c, stl.h, stldeque.h, stllist.h, stlvector.h, stlset.h"
        + ".\n"
        + "The Initial Developer of the Original Code is Robert A. van Engelen. Portions cr"
        + "eated by Robert A. van Engelen are Copyright (C) 2001-2004 Robert A. van Engelen"
        + ", Genivia inc. All Rights Reserved.\n"
        + "Contributor(s):\n"
        + "\"________________________.\"\n"
        + "[Note: The text of this Exhibit A may differ slightly form the text of the notic"
        + "es in the Source Code files of the Original code. You should use the text of thi"
        + "s Exhibit A rather than the text found in the Original Code Source Code for Your"
        + " Modifications.]\n"
        + "EXHIBIT B.\n"
        + "\n"
        + "\"Part of the software embedded in this product is gSOAP software.\n"
        + "Portions created by gSOAP are Copyright (C) 2001-2009 Robert A. van Engelen, Gen"
        + "ivia inc. All Rights Reserved.\n"
        + "THE SOFTWARE IN THIS PRODUCT WAS IN PART PROVIDED BY GENIVIA INC AND ANY EXPRESS"
        + " OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF"
        + " MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVEN"
        + "T SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEM"
        + "PLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF S"
        + "UBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUP"
        + "TION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT"
        + " LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT O"
        + "F THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\"\n"
; // the license text
    }
 
    
}
