package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:49Z
 * LicenseName: AGPL-3.0+
 * FileName: CATOSL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class CATOSL_1_1 extends License{
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
        return "CATOSL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Computer Associates Trusted Open Source License 1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Computer Associates Trusted Open Source License\n"
        + "Version 1.1\n"
        + "\n"
        + "PLEASE READ THIS DOCUMENT CAREFULLY AND IN ITS ENTIRETY. THE ACCOMPANYING PROGRA"
        + "M IS PROVIDED UNDER THE TERMS OF THIS COMPUTER ASSOCIATES TRUSTED OPEN SOURCE LI"
        + "CENSE (\"LICENSE\"). ANY USE, REPRODUCTION, MODIFICATION OR DISTRIBUTION OF THE PR"
        + "OGRAM CONSTITUTES THE RECIPIENT'S ACCEPTANCE OF THIS LICENSE.\n"
        + "\n"
        + "License Background\n"
        + "\n"
        + "Computer Associates International, Inc. (CA) believes in open source. We believe"
        + " that the open source development approach can take appropriate software program"
        + "s to unprecedented levels of quality, growth, and innovation. To demonstrate our"
        + " continuing commitment to open source, we are releasing the Program (as defined "
        + "below) under this License.\n"
        + "\n"
        + "This License is intended to permit contributors and recipients of the Program to"
        + " use the Program, including its source code, freely and without many of the conc"
        + "erns of some other open source licenses. Although we expect the underlying Progr"
        + "am, and Contributions (as defined below) made to such Program, to remain open, t"
        + "his License is designed to permit you to maintain your own software programs fre"
        + "e of this License unless you choose to do so. Thus, only your Contributions to t"
        + "he Program must be distributed under the terms of this License.\n"
        + "\n"
        + "The provisions that follow set forth the terms and conditions under which you ma"
        + "y use the Program.\n"
        + "\n"
        + "1. DEFINITIONS\n"
        + "\n"
        + "1.1 Contribution means (a) in the case of CA, the Original Program; and (b) in t"
        + "he case of each Contributor (including CA), changes and additions to the Program"
        + ", where such changes and/or additions to the Program originate from and are dist"
        + "ributed by that particular Contributor to unaffiliated third parties. A Contribu"
        + "tion originates from a Contributor if it was added to the Program by such Contri"
        + "butor itself or anyone acting on such Contributors behalf. Contributions do not "
        + "include additions to the Program which: (x) are separate modules of software dis"
        + "tributed in conjunction with the Program under their own license agreement, and "
        + "(y) are not derivative works of the Program.\n"
        + "\n"
        + "1.2 Contributor means CA and any other person or entity that distributes the Pro"
        + "gram.\n"
        + "\n"
        + "1.3 Contributor Version means as to a Contributor, that version of the Program t"
        + "hat includes the Contributors Contribution but not any Contributions made to the"
        + " Program thereafter.\n"
        + "\n"
        + "1.4 Larger Work means a work that combines the Program or portions thereof with "
        + "code not governed by the terms of this License.\n"
        + "\n"
        + "1.5 Licensed Patents mean patents licensable by a Contributor that are infringed"
        + " by the use or sale of its Contribution alone or when combined with the Program.\n"
        + "\n"
        + "1.6 Original Program means the original version of the software to which this Li"
        + "cense is attached and as released by CA, including source code, object code and "
        + "documentation, if any.\n"
        + "\n"
        + "1.7 Program means the Original Program and Contributions.\n"
        + "\n"
        + "1.8 Recipient means anyone who modifies, copies, uses or distributes the Program"
        + ".\n"
        + "\n"
        + "2. GRANT OF RIGHTS\n"
        + "\n"
        + "2.1 Subject to the terms of this License, each Contributor hereby grants Recipie"
        + "nt an irrevocable, non-exclusive, worldwide, royalty-free license to reproduce, "
        + "prepare derivative works of, publicly display, publicly perform, distribute and "
        + "sublicense the Contribution of such Contributor, if any, and such derivative wor"
        + "ks, in source code and object code form. For the avoidance of doubt, the license"
        + " provided in this Section 2.1 shall not include a license to any Licensed Patent"
        + "s of a Contributor.\n"
        + "\n"
        + "2.2 Subject to the terms of this License, each Contributor hereby grants Recipie"
        + "nt an irrevocable, non-exclusive, worldwide, royalty-free license to the License"
        + "d Patents to the extent necessary to make, use, sell, offer to sell and import t"
        + "he Contribution of such Contributor, if any, in source code and object code form"
        + ". The license granted in this Section 2.2 shall apply to the combination of the "
        + "Contribution and the Program if, at the time the Contribution is added by the Co"
        + "ntributor, such addition of the Contribution causes the Licensed Patents to be i"
        + "nfringed by such combination. Notwithstanding the foregoing, no license is grant"
        + "ed under this Section 2.2: (a) for any code or works that do not include the Con"
        + "tributor Version, as it exists and is used in accordance with the terms hereof; "
        + "(b) for infringements caused by: (i) third party modifications of the Contributo"
        + "r Version; or (ii) the combination of Contributions made by each such Contributo"
        + "r with other software (except as part of the Contributor Version) or other devic"
        + "es; or (c) with respect to Licensed Patents infringed by the Program in the abse"
        + "nce of Contributions made by that Contributor.\n"
        + "\n"
        + "2.3 Recipient understands that although each Contributor grants the licenses to "
        + "its Contributions set forth herein, except as provided in Section 2.4, no assura"
        + "nces are provided by any Contributor that the Program does not infringe the pate"
        + "nt or other intellectual property rights of any other person or entity. Each Con"
        + "tributor disclaims any liability to Recipient for claims brought by any other pe"
        + "rson or entity based on infringement of intellectual property rights or otherwis"
        + "e. As a condition to exercising the rights and licenses granted hereunder, each "
        + "Recipient hereby assumes sole responsibility to secure any other intellectual pr"
        + "operty rights needed, if any.\n"
        + "\n"
        + "2.4 Each Contributor represents and warrants that it has all right, title and in"
        + "terest in the copyrights in its Contributions, and has the right to grant the co"
        + "pyright licenses set forth in this License.\n"
        + "\n"
        + "3. DISTRIBUTION REQUIREMENTS\n"
        + "\n"
        + "3.1 If the Program is distributed in object code form, then a prominent notice m"
        + "ust be included in the code itself as well as in any related documentation, stat"
        + "ing that the source code for the Program is available from the Contributor with "
        + "information on how and where to obtain the source code. A Contributor may choose"
        + " to distribute the Program in object code form under its own license agreement, "
        + "provided that:\n"
        + "\n"
        + " * it complies with the terms and conditions of this License; and\n"
        + " * its license agreement:\n"
        + "   * effectively disclaims on behalf of all Contributors all warranties and cond"
        + "itions, express and implied, including warranties or conditions of title and non"
        + "-infringement, and implied warranties or conditions of merchantability and fitne"
        + "ss for a particular purpose, to the maximum extent permitted by applicable law;\n"
        + "   * effectively excludes on behalf of all Contributors all liability for damage"
        + "s, including direct, indirect, special, incidental and consequential damages, su"
        + "ch as lost profits, to the maximum extent permitted by applicable law;\n"
        + "   * states that any provisions which are inconsistent with this License are off"
        + "ered by that Contributor alone and not by any other party; and\n"
        + "   * states that source code for the Program is available from such Contributor "
        + "at the cost of distribution, and informs licensees how to obtain it in a reasona"
        + "ble manner.\n"
        + "   \n"
        + "3.2 When the Program is made available in source code form:\n"
        + "\n"
        + " * it must be made available under this License; and\n"
        + " * a copy of this License must be included with each copy of the Program.\n"
        + " \n"
        + "3.3 This License is intended to facilitate the commercial distribution of the Pr"
        + "ogram by any Contributor. However, Contributors may only charge Recipients a one"
        + "-time, upfront fee for the distribution of the Program. Contributors may not cha"
        + "rge Recipients any recurring charge, license fee, or any ongoing royalty for the"
        + " Recipients exercise of its rights under this License to the Program. Contributo"
        + "rs shall make the source code for the Contributor Version they distribute availa"
        + "ble at a cost, if any, equal to the cost to the Contributor to physically copy a"
        + "nd distribute the work. It is not the intent of this License to prohibit a Contr"
        + "ibutor from charging fees for any service or maintenance that a Contributor may "
        + "charge to a Recipient, so long as such fees are not an attempt to circumvent the"
        + " foregoing restrictions on charging royalties or other recurring fees for the Pr"
        + "ogram itself.\n"
        + "\n"
        + "3.4 A Contributor may create a Larger Work by combining the Program with other s"
        + "oftware code not governed by the terms of this License, and distribute the Large"
        + "r Work as a single product. In such a case, the Contributor must make sure that "
        + "the requirements of this License are fulfilled for the Program. Any Contributor "
        + "who includes the Program in a commercial product offering, including as part of "
        + "a Larger Work, may subject itself, but not any other Contributor, to additional "
        + "contractual commitments, including, but not limited to, performance warranties a"
        + "nd non-infringement representations on suchContributors behalf. No Contributor m"
        + "ay create any additional liability for other Contributors. Therefore, if a Contr"
        + "ibutor includes the Program in a commercial product offering, such Contributor ("
        + "Commercial Contributor) hereby agrees to defend and indemnify every other Contri"
        + "butor (Indemnified Contributor) who made Contributions to the Program distribute"
        + "d by the Commercial Contributor against any losses, damages and costs (collectiv"
        + "ely Losses) arising from claims, lawsuits and other legal actions brought by a t"
        + "hird party against the Indemnified Contributor to the extent caused by the acts "
        + "or omissions, including any additional contractual commitments, of such Commerci"
        + "al Contributor in connection with its distribution of the Program. The obligatio"
        + "ns in this section do not apply to any claims or Losses relating to any actual o"
        + "r alleged intellectual property infringement.\n"
        + "\n"
        + "3.5 If Contributor has knowledge that a license under a third partys intellectua"
        + "l property rights is required to exercise the rights granted by such Contributor"
        + " under Sections 2.1 or 2.2, Contributor must (a) include a text file with the Pr"
        + "ogram source code distribution titled ../IP_ISSUES, and (b) notify CA in writing"
        + " at Computer Associates International, Inc., One Computer Associates Plaza, Isla"
        + "ndia, New York 11749, Attn: Open Source Group or by email at opensource@ca.com, "
        + "both describing the claim and the party making the claim in sufficient detail th"
        + "at a Recipient and CA will know whom to contact with regard to such matter. If C"
        + "ontributor obtains such knowledge after the Contribution is made available, Cont"
        + "ributor shall also promptly modify the IP_ISSUES file in all copies Contributor "
        + "makes available thereafter and shall take other steps (such as notifying appropr"
        + "iate mailing lists or newsgroups) reasonably calculated to inform those who rece"
        + "ived the Program that such new knowledge has been obtained.\n"
        + "\n"
        + "3.6 Recipient shall not remove, obscure, or modify any CA or other Contributor c"
        + "opyright or patent proprietary notices appearing in the Program, whether in the "
        + "source code, object code or in any documentation. In addition to the obligations"
        + " set forth in Section 4, each Contributor must identify itself as the originator"
        + " of its Contribution, if any, in a manner that reasonably allows subsequent Reci"
        + "pients to identify the originator of the Contribution.\n"
        + "\n"
        + "4. CONTRIBUTION RESTRICTIONS\n"
        + "\n"
        + "4.1 Each Contributor must cause the Program to which the Contributor provides a "
        + "Contribution to contain a file documenting the changes the Contributor made to c"
        + "reate its version of the Program and the date of any change. Each Contributor mu"
        + "st also include a prominent statement that the Contribution is derived, directly"
        + " or indirectly, from the Program distributed by a prior Contributor, including t"
        + "he name of the prior Contributor from which such Contribution was derived, in (a"
        + ") the Program source code, and (b) in any notice in an executable version or rel"
        + "ated documentation in which the Contributor describes the origin or ownership of"
        + " the Program.\n"
        + "\n"
        + "5. NO WARRANTY\n"
        + "\n"
        + "5.1 EXCEPT AS EXPRESSLY SET FORTH IN THIS LICENSE, THE PROGRAM IS PROVIDED AS IS"
        + " AND IN ITS PRESENT STATE AND CONDITION. NO WARRANTY, REPRESENTATION, CONDITION,"
        + " UNDERTAKING OR TERM, EXPRESS OR IMPLIED, STATUTORY OR OTHERWISE, AS TO THE COND"
        + "ITION, QUALITY, DURABILITY, PERFORMANCE, NON-INFRINGEMENT, MERCHANTABILITY, OR F"
        + "ITNESS FOR A PARTICULAR PURPOSE OR USE OF THE PROGRAM IS GIVEN OR ASSUMED BY ANY"
        + " CONTRIBUTOR AND ALL SUCH WARRANTIES, REPRESENTATIONS, CONDITIONS, UNDERTAKINGS "
        + "AND TERMS ARE HEREBY EXCLUDED TO THE FULLEST EXTENT PERMITTED BY LAW.\n"
        + "\n"
        + "5.2 Each Recipient is solely responsible for determining the appropriateness of "
        + "using and distributing the Program and assumes all risks associated with its exe"
        + "rcise of rights under this License, including but not limited to the risks and c"
        + "osts of program errors, compliance with applicable laws, damage to or loss of da"
        + "ta, programs or equipment, and unavailability or interruption of operations.\n"
        + "\n"
        + "5.3 Each Recipient acknowledges that the Program is not intended for use in the "
        + "operation of nuclear facilities, aircraft navigation, communication systems, or "
        + "air traffic control machines in which case the failure of the Program could lead"
        + " to death, personal injury, or severe physical or environmental damage.\n"
        + "\n"
        + "6. DISCLAIMER OF LIABILITY\n"
        + "\n"
        + "6.1 EXCEPT AS EXPRESSLY SET FORTH IN THIS LICENSE, AND TO THE EXTENT PERMITTED B"
        + "Y LAW, NO CONTRIBUTOR SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDEN"
        + "TAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION "
        + "LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRAC"
        + "T, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY "
        + "WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE EXERCISE OF ANY RIGHTS "
        + "GRANTED HEREUNDER, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.\n"
        + "\n"
        + "7. TRADEMARKS AND BRANDING\n"
        + "\n"
        + "7.1 This License does not grant any Recipient or any third party any rights to u"
        + "se the trademarks or trade names now or subsequently posted at http://www.ca.com"
        + "/catrdmrk.htm, or any other trademarks, service marks, logos or trade names belo"
        + "nging to CA (collectively CA Marks) or to any trademark, service mark, logo or t"
        + "rade name belonging to any Contributor. Recipient agrees not to use any CA Marks"
        + " in or as part of the name of products derived from the Original Program or to e"
        + "ndorse or promote products derived from the Original Program.\n"
        + "\n"
        + "7.2 Subject to Section 7.1, Recipients may distribute the Program under trademar"
        + "ks, logos, and product names belonging to the Recipient provided that all copyri"
        + "ght and other attribution notices remain in the Program.\n"
        + "\n"
        + "8. PATENT LITIGATION\n"
        + "\n"
        + "8.1 If Recipient institutes patent litigation against any person or entity (incl"
        + "uding a cross-claim or counterclaim in a lawsuit) alleging that the Program itse"
        + "lf (excluding combinations of the Program with other software or hardware) infri"
        + "nges such Recipients patent(s), then such Recipients rights granted under Sectio"
        + "n 2.2 shall terminate as of the date such litigation is filed.\n"
        + "\n"
        + "9. OWNERSHIP\n"
        + "\n"
        + "9.1 Subject to the licenses granted under this License in Sections 2.1 and 2.2 a"
        + "bove, each Contributor retains all rights, title and interest in and to any Cont"
        + "ributions made by such Contributor. CA retains all rights, title and interest in"
        + " and to the Original Program and any Contributions made by or on behalf of CA (C"
        + "A Contributions), and such CA Contributions will not be automatically subject to"
        + " this License. CA may, at its sole discretion, choose to license such CA Contrib"
        + "utions under this License, or on different terms from those contained in this Li"
        + "cense or may choose not to license them at all.\n"
        + "\n"
        + "10. TERMINATION\n"
        + "\n"
        + "10.1 All of Recipients rights under this License shall terminate if it fails to "
        + "comply with any of the material terms or conditions of this License and does not"
        + " cure such failure in a reasonable period of time after becoming aware of such n"
        + "oncompliance. If Recipients rights under this License terminate, Recipient agree"
        + "s to cease use and distribution of the Program as soon as reasonably practicable"
        + ". However, Recipients obligations under this License and any licenses granted by"
        + " Recipient as a Contributor relating to the Program shall continue and survive t"
        + "ermination.\n"
        + "\n"
        + "11. GENERAL\n"
        + "\n"
        + "11.1 If any provision of this License is invalid or unenforceable under applicab"
        + "le law, it shall not affect the validity or enforceability of the remainder of t"
        + "he terms of this License, and without further action by the parties hereto, such"
        + " provision shall be reformed to the minimum extent necessary to make such provis"
        + "ion valid and enforceable.\n"
        + "\n"
        + "11.2 CA may publish new versions (including revisions) of this License from time"
        + " to time. Each new version of the License will be given a distinguishing version"
        + " number. The Program (including Contributions) may always be distributed subject"
        + " to the version of the License under which it was received. In addition, after a"
        + " new version of the License is published, Contributor may elect to distribute th"
        + "e Program (including its Contributions) under the new version. No one other than"
        + " CA has the right to modify this License.\n"
        + "\n"
        + "11.3 If it is impossible for Recipient to comply with any of the terms of this L"
        + "icense with respect to some or all of the Program due to statute, judicial order"
        + ", or regulation, then Recipient must: (a) comply with the terms of this License "
        + "to the maximum extent possible; and (b) describe the limitations and the code th"
        + "ey affect. Such description must be included in the IP_ISSUES file described in "
        + "Section 3.5 and must be included with all distributions of the Program source co"
        + "de. Except to the extent prohibited by statute or regulation, such description m"
        + "ust be sufficiently detailed for a Recipient of ordinary skill to be able to und"
        + "erstand it.\n"
        + "\n"
        + "11.4 This License is governed by the laws of the State of New York. No Recipient"
        + " will bring a legal action under this License more than one year after the cause"
        + " of action arose. Each Recipient waives its rights to a jury trial in any result"
        + "ing litigation. Any litigation or other dispute resolution between a Recipient a"
        + "nd CA relating to this License shall take place in the State of New York, and Re"
        + "cipient and CA hereby consent to the personal jurisdiction of, and venue in, the"
        + " state and federal courts within that district with respect to this License. The"
        + " application of the United Nations Convention on Contracts for the International"
        + " Sale of Goods is expressly excluded.\n"
        + "\n"
        + "11.5 Where Recipient is located in the province of Quebec, Canada, the following"
        + " clause applies: The parties hereby confirm that they have requested that this L"
        + "icense and all related documents be drafted in English. Les parties contractante"
        + "s confirment qu'elles ont exige que le present contrat et tous les documents ass"
        + "ocies soient rediges en anglais.\n"
        + "\n"
        + "11.6 The Program is subject to all export and import laws, restrictions and regu"
        + "lations of the country in which Recipient receives the Program. Recipient is sol"
        + "ely responsible for complying with and ensuring that Recipient does not export, "
        + "re-export, or import the Program in violation of such laws, restrictions or regu"
        + "lations, or without any necessary licenses and authorizations.\n"
        + "\n"
        + "11.7 This License constitutes the entire agreement between the parties with resp"
        + "ect to the subject matter hereof.\n"
; // the license text
    }
 
    
}
