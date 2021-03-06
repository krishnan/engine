package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:22Z
 * LicenseName: AGPL-3.0+
 * FileName: RHeCos_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class RHeCos_1_1 extends License{
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
        return "RHeCos-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Red Hat eCos Public License v1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Red Hat eCos Public License v1.1\n"
        + "\n"
        + "1. DEFINITIONS\n"
        + "\n"
        + "     1.1. \"Contributor\" means each entity that creates or contributes to the cre"
        + "ation of Modifications.\n"
        + "\n"
        + "     1.2. \"Contributor Version\" means the combination of the Original Code, prio"
        + "r Modifications used by a Contributor, and the Modifications made by that partic"
        + "ular Contributor.\n"
        + "\n"
        + "     1.3. \"Covered Code\" means the Original Code or Modifications or the combina"
        + "tion of the Original Code and Modifications, in each case including portions the"
        + "reof.\n"
        + "\n"
        + "     1.4. \"Electronic Distribution Mechanism\" means a mechanism generally accept"
        + "ed in the software development community for the electronic transfer of data.\n"
        + "\n"
        + "     1.5. \"Executable\" means Covered Code in any form other than Source Code.\n"
        + "\n"
        + "     1.6. \"Initial Developer\" means the individual or entity identified as the I"
        + "nitial Developer in the Source Code notice required by Exhibit A.\n"
        + "\n"
        + "     1.7. \"Larger Work\" means a work which combines Covered Code or portions the"
        + "reof with code not governed by the terms of this License.\n"
        + "\n"
        + "     1.8. \"License\" means this document.\n"
        + "\n"
        + "     1.9. \"Modifications\" means any addition to or deletion from the substance o"
        + "r structure of either the Original Code or any previous Modifications. When Cove"
        + "red Code is released as a series of files, a Modification is:\n"
        + "\n"
        + "          A. Any addition to or deletion from the contents of a file containing "
        + "Original Code or previous Modifications.\n"
        + "\n"
        + "          B. Any new file that contains any part of the Original Code or previou"
        + "s Modifications.\n"
        + "\n"
        + "     1.10. \"Original Code\" means Source Code of computer software code which is "
        + "described in the Source Code notice required by Exhibit A as Original Code, and "
        + "which, at the time of its release under this License is not already Covered Code"
        + " governed by this License.\n"
        + "\n"
        + "     1.11. \"Source Code\" means the preferred form of the Covered Code for making"
        + " modifications to it, including all modules it contains, plus any associated int"
        + "erface definition files, scripts used to control compilation and installation of"
        + " an Executable, or a list of source code differential comparisons against either"
        + " the Original Code or another well known, available Covered Code of the Contribu"
        + "tor's choice. The Source Code can be in a compressed or archival form, provided "
        + "the appropriate decompression or de-archiving software is widely available for n"
        + "o charge.\n"
        + "\n"
        + "     1.12. \"You\" means an individual or a legal entity exercising rights under, "
        + "and complying with all of the terms of, this License or a future version of this"
        + " License issued under Section 6.1. For legal entities, \"You\" includes any entity"
        + " which controls, is controlled by, or is under common control with You. For purp"
        + "oses of this definition, \"control\" means (a) the power, direct or indirect, to c"
        + "ause the direction or management of such entity, whether by contract or otherwis"
        + "e, or (b) ownership of fifty percent (50%) or more of the outstanding shares or "
        + "beneficial ownership of such entity.\n"
        + "\n"
        + "     1.13. \"Red Hat Branded Code\" is code that Red Hat distributes and/or permit"
        + "s others to distribute under different terms than the Red Hat eCos Public Licens"
        + "e. Red Hat's Branded Code may contain part or all of the Covered Code.\n"
        + "\n"
        + "2. SOURCE CODE LICENSE\n"
        + "\n"
        + "     2.1. The Initial Developer Grant. The Initial Developer hereby grants You a"
        + " world-wide, royalty-free, non-exclusive license, subject to third party intelle"
        + "ctual property claims:\n"
        + "\n"
        + "          (a) to use, reproduce, modify, display, perform, sublicense and distri"
        + "bute the Original Code (or portions thereof) with or without Modifications, or a"
        + "s part of a Larger Work; and\n"
        + "\n"
        + "          (b) under patents now or hereafter owned or controlled by Initial Deve"
        + "loper, to make, have made, use and sell (\"Utilize\") the Original Code (or portio"
        + "ns thereof), but solely to the extent that any such patent is reasonably necessa"
        + "ry to enable You to Utilize the Original Code (or portions thereof) and not to a"
        + "ny greater extent that may be necessary to Utilize further Modifications or comb"
        + "inations.\n"
        + "\n"
        + "     2.2. Contributor Grant. Each Contributor hereby grants You a world-wide, ro"
        + "yalty-free, non-exclusive license, subject to third party intellectual property "
        + "claims:\n"
        + "\n"
        + "          (a) to use, reproduce, modify, display, perform, sublicense and distri"
        + "bute the Modifications created by such Contributor (or portions thereof) either "
        + "on an unmodified basis, with other Modifications, as Covered Code or as part of "
        + "a Larger Work; and\n"
        + "\n"
        + "          (b) under patents now or hereafter owned or controlled by Contributor,"
        + " to Utilize the Contributor Version (or portions thereof), but solely to the ext"
        + "ent that any such patent is reasonably necessary to enable You to Utilize the Co"
        + "ntributor Version (or portions thereof), and not to any greater extent that may "
        + "be necessary to Utilize further Modifications or combinations.\n"
        + "\n"
        + "3. DISTRIBUTION OBLIGATIONS\n"
        + "\n"
        + "     3.1. Application of License. The Modifications which You create or to which"
        + " You contribute are governed by the terms of this License, including without lim"
        + "itation Section 2.2. The Source Code version of Covered Code may be distributed "
        + "only under the terms of this License or a future version of this License release"
        + "d under Section 6.1, and You must include a copy of this License with every copy"
        + " of the Source Code You distribute. You may not offer or impose any terms on any"
        + " Source Code version that alters or restricts the applicable version of this Lic"
        + "ense or the recipients' rights hereunder. However, You may include an additional"
        + " document offering the additional rights described in Section 3.5.\n"
        + "\n"
        + "     3.2. Availability of Source Code. Any Modification which You create or to w"
        + "hich You contribute must be made available in Source Code form under the terms o"
        + "f this License via an accepted Electronic Distribution Mechanism to anyone to wh"
        + "om you made an Executable version available and to the Initial Developer; and if"
        + " made available via Electronic Distribution Mechanism, must remain available for"
        + " at least twelve (12) months after the date it initially became available, or at"
        + " least six (6) months after a subsequent version of that particular Modification"
        + " has been made available to such recipients. You are responsible for ensuring th"
        + "at the Source Code version remains available even if the Electronic Distribution"
        + " Mechanism is maintained by a third party. You are responsible for notifying the"
        + " Initial Developer of the Modification and the location of the Source if a conta"
        + "ct means is provided. Red Hat will be acting as maintainer of the Source and may"
        + " provide an Electronic Distribution mechanism for the Modification to be made av"
        + "ailable. You can contact Red Hat to make the Modification available and to notif"
        + "y the Initial Developer. (http://sourceware.cygnus.com/ecos/)\n"
        + "\n"
        + "     3.3. Description of Modifications. You must cause all Covered Code to which"
        + " you contribute to contain a file documenting the changes You made to create tha"
        + "t Covered Code and the date of any change. You must include a prominent statemen"
        + "t that the Modification is derived, directly or indirectly, from Original Code p"
        + "rovided by the Initial Developer and including the name of the Initial Developer"
        + " in (a) the Source Code, and (b) in any notice in an Executable version or relat"
        + "ed documentation in which You describe the origin or ownership of the Covered Co"
        + "de.\n"
        + "\n"
        + "     3.4. Intellectual Property Matters\n"
        + "\n"
        + "          (a) Third Party Claims.  If You have knowledge that a party claims an "
        + "intellectual property right in particular functionality or code (or its utilizat"
        + "ion under this License), you must include a text file with the source code distr"
        + "ibution titled \"LEGAL\" which describes the claim and the party making the claim "
        + "in sufficient detail that a recipient will know whom to contact. If you obtain s"
        + "uch knowledge after You make Your Modification available as described in Section"
        + " 3.2, You shall promptly modify the LEGAL file in all copies You make available "
        + "thereafter and shall take other steps (such as notifying appropriate mailing lis"
        + "ts or newsgroups) reasonably calculated to inform those who received the Covered"
        + " Code that new knowledge has been obtained.\n"
        + "\n"
        + "          (b) Contributor APIs. If Your Modification is an application programmi"
        + "ng interface and You own or control patents which are reasonably necessary to im"
        + "plement that API, you must also include this information in the LEGAL file.\n"
        + "\n"
        + "     3.5. Required Notices. You must duplicate the notice in Exhibit A in each f"
        + "ile of the Source Code, and this License in any documentation for the Source Cod"
        + "e, where You describe recipients' rights relating to Covered Code. If You create"
        + "d one or more Modification(s), You may add your name as a Contributor to the Sou"
        + "rce Code. If it is not possible to put such notice in a particular Source Code f"
        + "ile due to its structure, then you must include such notice in a location (such "
        + "as a relevant directory file) where a user would be likely to look for such a no"
        + "tice. You may choose to offer, and to charge a fee for, warranty, support, indem"
        + "nity or liability obligations to one or more recipients of Covered Code.\n"
        + "\n"
        + "     However, You may do so only on Your own behalf, and not on behalf of the In"
        + "itial Developer or any Contributor. You must make it absolutely clear that any s"
        + "uch warranty, support, indemnity or liability obligation is offered by You alone"
        + ", and You hereby agree to indemnify the Initial Developer and every Contributor "
        + "for any liability incurred by the Initial Developer or such Contributor as a res"
        + "ult of warranty, support, indemnity or liability terms You offer.\n"
        + "\n"
        + "     3.6. Distribution of Executable Versions. You may distribute Covered Code i"
        + "n Executable form only if the requirements of Section 3.1-3.5 have been met for "
        + "that Covered Code, and if You include a notice stating that the Source Code vers"
        + "ion of the Covered Code is available under the terms of this License, including "
        + "a description of how and where You have fulfilled the obligations of Section 3.2"
        + ". The notice must be conspicuously included in any notice in an Executable versi"
        + "on, related documentation or collateral in which You describe recipients' rights"
        + " relating to the Covered Code. You may distribute the Executable version of Cove"
        + "red Code under a license of Your choice, which may contain terms different from "
        + "this License, provided that You are in compliance with the terms of this License"
        + " and that the license for the Executable version does not attempt to limit or al"
        + "ter the recipient's rights in the Source Code version from the rights set forth "
        + "in this License. If You distribute the Executable version under a different lice"
        + "nse You must make it absolutely clear that any terms which differ from this Lice"
        + "nse are offered by You alone, not by the Initial Developer or any Contributor. Y"
        + "ou hereby agree to indemnify the Initial Developer and every Contributor for any"
        + " liability incurred by the Initial Developer or such Contributor as a result of "
        + "any such terms You offer.\n"
        + "\n"
        + "     If you distribute executable versions containing Covered Code, you must rep"
        + "roduce the notice in Exhibit B in the documentation and/or other materials provi"
        + "ded with the product.\n"
        + "\n"
        + "     3.7. Larger Works. You may create a Larger Work by combining Covered Code w"
        + "ith other code not governed by the terms of this License and distribute the Larg"
        + "er Work as a single product. In such a case, You must make sure the requirements"
        + " of this License are fulfilled for the Covered Code.\n"
        + "\n"
        + "4. INABILITY TO COMPLY DUE TO STATUTE OR REGULATION\n"
        + "\n"
        + "If it is impossible for You to comply with any of the terms of this License with"
        + " respect to some or all of the Covered Code due to statute or regulation then Yo"
        + "u must: (a) comply with the terms of this License to the maximum extent possible"
        + "; (b) cite the statute or regulation that prohibits you from adhering to the lic"
        + "ense; and (c) describe the limitations and the code they affect. Such descriptio"
        + "n must be included in the LEGAL file described in Section 3.4 and must be includ"
        + "ed with all distributions of the Source Code. Except to the extent prohibited by"
        + " statute or regulation, such description must be sufficiently detailed for a rec"
        + "ipient of ordinary skill to be able to understand it. You must submit this LEGAL"
        + " file to Red Hat for review, and You will not be able use the covered code in an"
        + "y means until permission is granted from Red Hat to allow for the inability to c"
        + "omply due to statute or regulation.\n"
        + "\n"
        + "5. APPLICATION OF THIS LICENSE\n"
        + "\n"
        + "This License applies to code to which the Initial Developer has attached the not"
        + "ice in Exhibit A, and to related Covered Code.\n"
        + "\n"
        + "Red Hat may include Covered Code in products without such additional products be"
        + "coming subject to the terms of this License, and may license such additional pro"
        + "ducts on different terms from those contained in this License.\n"
        + "\n"
        + "Red Hat may license the Source Code of Red Hat Branded Code without Red Hat Bran"
        + "ded Code becoming subject to the terms of this License, and may license Red Hat "
        + "Branded Code on different terms from those contained in this License. Contact Re"
        + "d Hat for details of alternate licensing terms available.\n"
        + "\n"
        + "6. VERSIONS OF THE LICENSE\n"
        + "\n"
        + "     6.1. New Versions. Red Hat may publish revised and/or new versions of the L"
        + "icense from time to time. Each version will be given a distinguishing version nu"
        + "mber.\n"
        + "\n"
        + "     6.2. Effect of New Versions. Once Covered Code has been published under a p"
        + "articular version of the License, You may always continue to use it under the te"
        + "rms of that version. You may also choose to use such Covered Code under the term"
        + "s of any subsequent version of the License published by Red Hat. No one other th"
        + "an Red Hat has the right to modify the terms applicable to Covered Code beyond w"
        + "hat is granted under this and subsequent Licenses.\n"
        + "\n"
        + "     6.3. Derivative Works. If you create or use a modified version of this Lice"
        + "nse (which you may only do in order to apply it to code which is not already Cov"
        + "ered Code governed by this License), you must (a) rename Your license so that th"
        + "e phrases \"ECOS\", \"eCos\", \"Red Hat\", \"RHEPL\" or any confusingly similar phrase d"
        + "o not appear anywhere in your license and (b) otherwise make it clear that your "
        + "version of the license contains terms which differ from the Red Hat eCos Public "
        + "License. (Filling in the name of the Initial Developer, Original Code or Contrib"
        + "utor in the notice described in Exhibit A shall not of themselves be deemed to b"
        + "e modifications of this License.)\n"
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
        + "8. TERMINATION\n"
        + "\n"
        + "This License and the rights granted hereunder will terminate automatically if Yo"
        + "u fail to comply with terms herein and fail to cure such breach within 30 days o"
        + "f becoming aware of the breach. All sublicenses to the Covered Code which are pr"
        + "operly granted shall survive any termination of this License. Provisions which, "
        + "by their nature, must remain in effect beyond the termination of this License sh"
        + "all survive.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY\n"
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
        + "10. U.S. GOVERNMENT END USERS\n"
        + "\n"
        + "The Covered Code is a \"commercial item,\" as that term is defined in 48 C.F.R. 2."
        + "101 (Oct. 1995), consisting of \"commercial computer software\" and \"commercial co"
        + "mputer software documentation,\" as such terms are used in 48 C.F.R. 12.212 (Sept"
        + ". 1995). Consistent with 48 C.F.R. 12.212 and 48 C.F.R. 227.7202-1 through 227.7"
        + "202-4 (June 1995), all U.S. Government End Users acquire Covered Code with only "
        + "those rights set forth herein.\n"
        + "\n"
        + "11. MISCELLANEOUS\n"
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
        + "12. RESPONSIBILITY FOR CLAIMS\n"
        + "\n"
        + "Except in cases where another Contributor has failed to comply with Section 3.4,"
        + " You are responsible for damages arising, directly or indirectly, out of Your ut"
        + "ilization of rights under this License, based on the number of copies of Covered"
        + " Code you made available, the revenues you received from utilizing such rights, "
        + "and other relevant factors. You agree to work with affected parties to distribut"
        + "e responsibility on an equitable basis.\n"
        + "\n"
        + "13. ADDITIONAL TERMS APPLICABLE TO THE RED HAT ECOS PUBLIC LICENSE\n"
        + "\n"
        + "Nothing in this License shall be interpreted to prohibit Red Hat from licensing "
        + "under different terms than this License any code which Red Hat otherwise would h"
        + "ave a right to license.\n"
        + "\n"
        + "Red Hat and logo - This License does not grant any rights to use the trademark R"
        + "ed Hat, the Red Hat logo, eCos logo, even if such marks are included in the Orig"
        + "inal Code. You may contact Red Hat for permission to display the Red Hat and eCo"
        + "s marks in either the documentation or the Executable version beyond that requir"
        + "ed in Exhibit B.\n"
        + "\n"
        + "Inability to Comply Due to Contractual Obligation - To the extent that Red Hat i"
        + "s limited contractually from making third party code available under this Licens"
        + "e, Red Hat may choose to integrate such third party code into Covered Code witho"
        + "ut being required to distribute such third party code in Source Code form, even "
        + "if such third party code would otherwise be considered \"Modifications\" under thi"
        + "s License.\n"
        + "\n"
        + "EXHIBIT A\n"
        + "\n"
        + "\"The contents of this file are subject to the Red Hat eCos Public License Versio"
        + "n 1.1 (the \"License\"); you may not use this file except in compliance with the L"
        + "icense. You may obtain a copy of the License at http://www.redhat.com/\n"
        + "\n"
        + "Software distributed under the License is distributed on an \"AS IS\" basis, WITHO"
        + "UT WARRANTY OF ANY KIND, either express or implied. See the License for the spec"
        + "ific language governing rights and limitations under the License.\n"
        + "\n"
        + "The Original Code is eCos - Embedded Configurable Operating System, released Sep"
        + "tember 30, 1998. The Initial Developer of the Original Code is Red Hat. Portions"
        + " created by Red Hat are Copyright (C) 1998, 1999, 2000 Red Hat, Inc. All Rights "
        + "Reserved.\"\n"
        + "\n"
        + "EXHIBIT B\n"
        + "\n"
        + "Part of the software embedded in this product is eCos - Embedded Configurable Op"
        + "erating System, a trademark of Red Hat. Portions created by Red Hat are Copyrigh"
        + "t (C) 1998, 1999, 2000 Red Hat, Inc. (http://www.redhat.com/). All Rights Reserv"
        + "ed.\n"
        + "\n"
        + "THE SOFTWARE IN THIS PRODUCT WAS IN PART PROVIDED BY RED HAT AND ANY EXPRESS OR "
        + "IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MER"
        + "CHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SH"
        + "ALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLAR"
        + "Y, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBST"
        + "ITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION"
        + ") HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIA"
        + "BILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF TH"
        + "E USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
