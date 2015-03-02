package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:34Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Watcom_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Watcom_1_0 extends License{
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
        return "Watcom-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Sybase Open Watcom Public License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Sybase Open Watcom Public License version 1.0\n"
        + "\n"
        + "USE OF THE SYBASE OPEN WATCOM SOFTWARE DESCRIBED BELOW (\"SOFTWARE\") IS SUBJECT T"
        + "O THE TERMS AND CONDITIONS SET FORTH IN THE SYBASE OPEN WATCOM PUBLIC LICENSE SE"
        + "T FORTH BELOW (\"LICENSE\"). YOU MAY NOT USE THE SOFTWARE IN ANY MANNER UNLESS YOU"
        + " ACCEPT THE TERMS AND CONDITIONS OF THE LICENSE. YOU INDICATE YOUR ACCEPTANCE BY"
        + " IN ANY MANNER USING (INCLUDING WITHOUT LIMITATION BY REPRODUCING, MODIFYING OR "
        + "DISTRIBUTING) THE SOFTWARE. IF YOU DO NOT ACCEPT ALL OF THE TERMS AND CONDITIONS"
        + " OF THE LICENSE, DO NOT USE THE SOFTWARE IN ANY MANNER.\n"
        + "\n"
        + "Sybase Open Watcom Public License version 1.0\n"
        + "\n"
        + "1. General; Definitions. This License applies only to the following software pro"
        + "grams: the open source versions of Sybase's Watcom C/C++ and Fortran compiler pr"
        + "oducts (\"Software\"), which are modified versions of, with significant changes fr"
        + "om, the last versions made commercially available by Sybase. As used in this Lic"
        + "ense:\n"
        + "\n"
        + "     1.1 \"Applicable Patent Rights\" mean: (a) in the case where Sybase is the gr"
        + "antor of rights, (i) claims of patents that are now or hereafter acquired, owned"
        + " by or assigned to Sybase and (ii) that cover subject matter contained in the Or"
        + "iginal Code, but only to the extent necessary to use, reproduce and/or distribut"
        + "e the Original Code without infringement; and (b) in the case where You are the "
        + "grantor of rights, (i) claims of patents that are now or hereafter acquired, own"
        + "ed by or assigned to You and (ii) that cover subject matter in Your Modification"
        + "s, taken alone or in combination with Original Code.\n"
        + "\n"
        + "     1.2 \"Contributor\" means any person or entity that creates or contributes to"
        + " the creation of Modifications.\n"
        + "\n"
        + "     1.3 \"Covered Code\" means the Original Code, Modifications, the combination "
        + "of Original Code and any Modifications, and/or any respective portions thereof.\n"
        + "\n"
        + "     1.4 \"Deploy\" means to use, sublicense or distribute Covered Code other than"
        + " for Your internal research and development (R&D) and/or Personal Use, and inclu"
        + "des without limitation, any and all internal use or distribution of Covered Code"
        + " within Your business or organization except for R&D use and/or Personal Use, as"
        + " well as direct or indirect sublicensing or distribution of Covered Code by You "
        + "to any third party in any form or manner.\n"
        + "\n"
        + "     1.5 \"Larger Work\" means a work which combines Covered Code or portions ther"
        + "eof with code not governed by the terms of this License.\n"
        + "\n"
        + "     1.6 \"Modifications\" mean any addition to, deletion from, and/or change to, "
        + "the substance and/or structure of the Original Code, any previous Modifications,"
        + " the combination of Original Code and any previous Modifications, and/or any res"
        + "pective portions thereof. When code is released as a series of files, a Modifica"
        + "tion is: (a) any addition to or deletion from the contents of a file containing "
        + "Covered Code; and/or (b) any new file or other representation of computer progra"
        + "m statements that contains any part of Covered Code.\n"
        + "\n"
        + "     1.7 \"Original Code\" means (a) the Source Code of a program or other work as"
        + " originally made available by Sybase under this License, including the Source Co"
        + "de of any updates or upgrades to such programs or works made available by Sybase"
        + " under this License, and that has been expressly identified by Sybase as such in"
        + " the header file(s) of such work; and (b) the object code compiled from such Sou"
        + "rce Code and originally made available by Sybase under this License.\n"
        + "\n"
        + "     1.8 \"Personal Use\" means use of Covered Code by an individual solely for hi"
        + "s or her personal, private and non-commercial purposes. An individual's use of C"
        + "overed Code in his or her capacity as an officer, employee, member, independent "
        + "contractor or agent of a corporation, business or organization (commercial or no"
        + "n-commercial) does not qualify as Personal Use.\n"
        + "\n"
        + "     1.9 \"Source Code\" means the human readable form of a program or other work "
        + "that is suitable for making modifications to it, including all modules it contai"
        + "ns, plus any associated interface definition files, scripts used to control comp"
        + "ilation and installation of an executable (object code).\n"
        + "\n"
        + "     1.10 \"You\" or \"Your\" means an individual or a legal entity exercising right"
        + "s under this License. For legal entities, \"You\" or \"Your\" includes any entity wh"
        + "ich controls, is controlled by, or is under common control with, You, where \"con"
        + "trol\" means (a) the power, direct or indirect, to cause the direction or managem"
        + "ent of such entity, whether by contract or otherwise, or (b) ownership of fifty "
        + "percent (50%) or more of the outstanding shares or beneficial ownership of such "
        + "entity.\n"
        + "\n"
        + "2. Permitted Uses; Conditions & Restrictions.Subject to the terms and conditions"
        + " of this License, Sybase hereby grants You, effective on the date You accept thi"
        + "s License and download the Original Code, a world-wide, royalty-free, non-exclus"
        + "ive license, to the extent of Sybase's Applicable Patent Rights and copyrights c"
        + "overing the Original Code, to do the following:\n"
        + "\n"
        + "     2.1 You may use, reproduce, display, perform, modify and distribute Origina"
        + "l Code, with or without Modifications, solely for Your internal research and dev"
        + "elopment and/or Personal Use, provided that in each instance:\n"
        + "\n"
        + "          (a) You must retain and reproduce in all copies of Original Code the c"
        + "opyright and other proprietary notices and disclaimers of Sybase as they appear "
        + "in the Original Code, and keep intact all notices in the Original Code that refe"
        + "r to this License; and \n"
        + "\n"
        + "          (b) You must retain and reproduce a copy of this License with every co"
        + "py of Source Code of Covered Code and documentation You distribute, and You may "
        + "not offer or impose any terms on such Source Code that alter or restrict this Li"
        + "cense or the recipients' rights hereunder, except as permitted under Section 6.\n"
        + "\n"
        + "          (c) Whenever reasonably feasible you should include the copy of this L"
        + "icense in a click-wrap format, which requires affirmative acceptance by clicking"
        + " on an \"I accept\" button or similar mechanism. If a click-wrap format is not inc"
        + "luded, you must include a statement that any use (including without limitation r"
        + "eproduction, modification or distribution) of the Software, and any other affirm"
        + "ative act that you define, constitutes acceptance of the License, and instructin"
        + "g the user not to use the Covered Code in any manner if the user does not accept"
        + " all of the terms and conditions of the License.\n"
        + "\n"
        + "     2.2 You may use, reproduce, display, perform, modify and Deploy Covered Cod"
        + "e, provided that in each instance:\n"
        + "\n"
        + "          (a) You must satisfy all the conditions of Section 2.1 with respect to"
        + " the Source Code of the Covered Code; \n"
        + "\n"
        + "          (b) You must duplicate, to the extent it does not already exist, the n"
        + "otice in Exhibit A in each file of the Source Code of all Your Modifications, an"
        + "d cause the modified files to carry prominent notices stating that You changed t"
        + "he files and the date of any change; \n"
        + "\n"
        + "          (c) You must make Source Code of all Your Deployed Modifications publi"
        + "cly available under the terms of this License, including the license grants set "
        + "forth in Section 3 below, for as long as you Deploy the Covered Code or twelve ("
        + "12) months from the date of initial Deployment, whichever is longer. You should "
        + "preferably distribute the Source Code of Your Deployed Modifications electronica"
        + "lly (e.g. download from a web site); \n"
        + "\n"
        + "          (d) if You Deploy Covered Code in object code, executable form only, Y"
        + "ou must include a prominent notice, in the code itself as well as in related doc"
        + "umentation, stating that Source Code of the Covered Code is available under the "
        + "terms of this License with information on how and where to obtain such Source Co"
        + "de; and \n"
        + "\n"
        + "          (e) the object code form of the Covered Code may be distributed under "
        + "Your own license agreement, provided that such license agreement contains terms "
        + "no less protective of Sybase and each Contributor than the terms of this License"
        + ", and stating that any provisions which differ from this License are offered by "
        + "You alone and not by any other party.\n"
        + "\n"
        + "     2.3 You expressly acknowledge and agree that although Sybase and each Contr"
        + "ibutor grants the licenses to their respective portions of the Covered Code set "
        + "forth herein, no assurances are provided by Sybase or any Contributor that the C"
        + "overed Code does not infringe the patent or other intellectual property rights o"
        + "f any other entity. Sybase and each Contributor disclaim any liability to You fo"
        + "r claims brought by any other entity based on infringement of intellectual prope"
        + "rty rights or otherwise. As a condition to exercising the rights and licenses gr"
        + "anted hereunder, You hereby assume sole responsibility to secure any other intel"
        + "lectual property rights needed, if any. For example, if a third party patent lic"
        + "ense is required to allow You to distribute the Covered Code, it is Your respons"
        + "ibility to acquire that license before distributing the Covered Code.\n"
        + "\n"
        + "3. Your Grants. In consideration of, and as a condition to, the licenses granted"
        + " to You under this License, You hereby grant to Sybase and all third parties a n"
        + "on-exclusive, royalty-free license, under Your Applicable Patent Rights and othe"
        + "r intellectual property rights (other than patent) owned or controlled by You, t"
        + "o use, reproduce, display, perform, modify, distribute and Deploy Your Modificat"
        + "ions of the same scope and extent as Sybase's licenses under Sections 2.1 and 2."
        + "2.\n"
        + "\n"
        + "4. Larger Works. You may create a Larger Work by combining Covered Code with oth"
        + "er code not governed by the terms of this License and distribute the Larger Work"
        + " as a single product. In each such instance, You must make sure the requirements"
        + " of this License are fulfilled for the Covered Code or any portion thereof.\n"
        + "\n"
        + "5. Limitations on Patent License. Except as expressly stated in Section 2, no ot"
        + "her patent rights, express or implied, are granted by Sybase herein. Modificatio"
        + "ns and/or Larger Works may require additional patent licenses from Sybase which "
        + "Sybase may grant in its sole discretion.\n"
        + "\n"
        + "6. Additional Terms. You may choose to offer, and to charge a fee for, warranty,"
        + " support, indemnity or liability obligations and/or other rights consistent with"
        + " this License (\"Additional Terms\") to one or more recipients of Covered Code. Ho"
        + "wever, You may do so only on Your own behalf and as Your sole responsibility, an"
        + "d not on behalf of Sybase or any Contributor. You must obtain the recipient's ag"
        + "reement that any such Additional Terms are offered by You alone, and You hereby "
        + "agree to indemnify, defend and hold Sybase and every Contributor harmless for an"
        + "y liability incurred by or claims asserted against Sybase or such Contributor by"
        + " reason of any such Additional Terms.\n"
        + "\n"
        + "7. Versions of the License. Sybase may publish revised and/or new versions of th"
        + "is License from time to time. Each version will be given a distinguishing versio"
        + "n number. Once Original Code has been published under a particular version of th"
        + "is License, You may continue to use it under the terms of that version. You may "
        + "also choose to use such Original Code under the terms of any subsequent version "
        + "of this License published by Sybase. No one other than Sybase has the right to m"
        + "odify the terms applicable to Covered Code created under this License.\n"
        + "\n"
        + "8. NO WARRANTY OR SUPPORT. The Covered Code may contain in whole or in part pre-"
        + "release, untested, or not fully tested works. The Covered Code may contain error"
        + "s that could cause failures or loss of data, and may be incomplete or contain in"
        + "accuracies. You expressly acknowledge and agree that use of the Covered Code, or"
        + " any portion thereof, is at Your sole and entire risk. THE COVERED CODE IS PROVI"
        + "DED \"AS IS\" AND WITHOUT WARRANTY, UPGRADES OR SUPPORT OF ANY KIND AND SYBASE AND"
        + " SYBASE'S LICENSOR(S) (COLLECTIVELY REFERRED TO AS \"SYBASE\" FOR THE PURPOSES OF "
        + "SECTIONS 8 AND 9) AND ALL CONTRIBUTORS EXPRESSLY DISCLAIM ALL WARRANTIES AND/OR "
        + "CONDITIONS, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRA"
        + "NTIES AND/OR CONDITIONS OF MERCHANTABILITY, OF SATISFACTORY QUALITY, OF FITNESS "
        + "FOR A PARTICULAR PURPOSE, OF ACCURACY, OF QUIET ENJOYMENT, AND NONINFRINGEMENT O"
        + "F THIRD PARTY RIGHTS. SYBASE AND EACH CONTRIBUTOR DOES NOT WARRANT AGAINST INTER"
        + "FERENCE WITH YOUR ENJOYMENT OF THE COVERED CODE, THAT THE FUNCTIONS CONTAINED IN"
        + " THE COVERED CODE WILL MEET YOUR REQUIREMENTS, THAT THE OPERATION OF THE COVERED"
        + " CODE WILL BE UNINTERRUPTED OR ERROR-FREE, OR THAT DEFECTS IN THE COVERED CODE W"
        + "ILL BE CORRECTED. NO ORAL OR WRITTEN INFORMATION OR ADVICE GIVEN BY SYBASE, A SY"
        + "BASE AUTHORIZED REPRESENTATIVE OR ANY CONTRIBUTOR SHALL CREATE A WARRANTY. You a"
        + "cknowledge that the Covered Code is not intended for use in the operation of nuc"
        + "lear facilities, aircraft navigation, communication systems, or air traffic cont"
        + "rol machines in which case the failure of the Covered Code could lead to death, "
        + "personal injury, or severe physical or environmental damage.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY. TO THE EXTENT NOT PROHIBITED BY LAW, IN NO EVENT SHA"
        + "LL SYBASE OR ANY CONTRIBUTOR BE LIABLE FOR ANY DIRECT, INCIDENTAL, SPECIAL, INDI"
        + "RECT, CONSEQUENTIAL OR OTHER DAMAGES OF ANY KIND ARISING OUT OF OR RELATING TO T"
        + "HIS LICENSE OR YOUR USE OR INABILITY TO USE THE COVERED CODE, OR ANY PORTION THE"
        + "REOF, WHETHER UNDER A THEORY OF CONTRACT, WARRANTY, TORT (INCLUDING NEGLIGENCE),"
        + " PRODUCTS LIABILITY OR OTHERWISE, EVEN IF SYBASE OR SUCH CONTRIBUTOR HAS BEEN AD"
        + "VISED OF THE POSSIBILITY OF SUCH DAMAGES, AND NOTWITHSTANDING THE FAILURE OF ESS"
        + "ENTIAL PURPOSE OF ANY REMEDY. SOME JURISDICTIONS DO NOT ALLOW THE LIMITATION OF "
        + "LIABILITY OF INCIDENTAL OR CONSEQUENTIAL OR OTHER DAMAGES OF ANY KIND, SO THIS L"
        + "IMITATION MAY NOT APPLY TO YOU. In no event shall Sybase's or any Contributor's "
        + "total liability to You for all damages (other than as may be required by applica"
        + "ble law) under this License exceed the amount of five hundred dollars ($500.00).\n"
        + "\n"
        + "10. Trademarks. This License does not grant any rights to use the trademarks or "
        + "trade names \"Sybase\" or any other trademarks or trade names belonging to Sybase "
        + "(collectively \"Sybase Marks\") or to any trademark or trade name belonging to any"
        + " Contributor(\"Contributor Marks\"). No Sybase Marks or Contributor Marks may be u"
        + "sed to endorse or promote products derived from the Original Code or Covered Cod"
        + "e other than with the prior written consent of Sybase or the Contributor, as app"
        + "licable.\n"
        + "\n"
        + "11. Ownership. Subject to the licenses granted under this License, each Contribu"
        + "tor retains all rights, title and interest in and to any Modifications made by s"
        + "uch Contributor. Sybase retains all rights, title and interest in and to the Ori"
        + "ginal Code and any Modifications made by or on behalf of Sybase (\"Sybase Modific"
        + "ations\"), and such Sybase Modifications will not be automatically subject to thi"
        + "s License. Sybase may, at its sole discretion, choose to license such Sybase Mod"
        + "ifications under this License, or on different terms from those contained in thi"
        + "s License or may choose not to license them at all.\n"
        + "\n"
        + "12. Termination.\n"
        + "\n"
        + "     12.1 Termination. This License and the rights granted hereunder will termin"
        + "ate:\n"
        + "\n"
        + "          (a) automatically without notice if You fail to comply with any term(s"
        + ") of this License and fail to cure such breach within 30 days of becoming aware "
        + "of such breach;\n"
        + "\n"
        + "          (b) immediately in the event of the circumstances described in Section"
        + " 13.5(b); or\n"
        + "\n"
        + "          (c) automatically without notice if You, at any time during the term o"
        + "f this License, commence an action for patent infringement (including as a cross"
        + " claim or counterclaim) against Sybase or any Contributor.\n"
        + "\n"
        + "     12.2 Effect of Termination. Upon termination, You agree to immediately stop"
        + " any further use, reproduction, modification, sublicensing and distribution of t"
        + "he Covered Code and to destroy all copies of the Covered Code that are in your p"
        + "ossession or control. All sublicenses to the Covered Code that have been properl"
        + "y granted prior to termination shall survive any termination of this License. Pr"
        + "ovisions which, by their nature, should remain in effect beyond the termination "
        + "of this License shall survive, including but not limited to Sections 3, 5, 8, 9,"
        + " 10, 11, 12.2 and 13. No party will be liable to any other for compensation, ind"
        + "emnity or damages of any sort solely as a result of terminating this License in "
        + "accordance with its terms, and termination of this License will be without preju"
        + "dice to any other right or remedy of any party.\n"
        + "\n"
        + "13. Miscellaneous.\n"
        + "\n"
        + "     13.1 Government End Users. The Covered Code is a \"commercial item\" as defin"
        + "ed in FAR 2.101. Government software and technical data rights in the Covered Co"
        + "de include only those rights customarily provided to the public as defined in th"
        + "is License. This customary commercial license in technical data and software is "
        + "provided in accordance with FAR 12.211 (Technical Data) and 12.212 (Computer Sof"
        + "tware) and, for Department of Defense purchases, DFAR 252.227-7015 (Technical Da"
        + "ta -- Commercial Items) and 227.7202-3 (Rights in Commercial Computer Software o"
        + "r Computer Software Documentation). Accordingly, all U.S. Government End Users a"
        + "cquire Covered Code with only those rights set forth herein.\n"
        + "\n"
        + "     13.2 Relationship of Parties. This License will not be construed as creatin"
        + "g an agency, partnership, joint venture or any other form of legal association b"
        + "etween or among you, Sybase or any Contributor, and You will not represent to th"
        + "e contrary, whether expressly, by implication, appearance or otherwise.\n"
        + "\n"
        + "     13.3 Independent Development. Nothing in this License will impair Sybase's "
        + "or any Contributor's right to acquire, license, develop, have others develop for"
        + " it, market and/or distribute technology or products that perform the same or si"
        + "milar functions as, or otherwise compete with, Modifications, Larger Works, tech"
        + "nology or products that You may develop, produce, market or distribute.\n"
        + "\n"
        + "     13.4 Waiver; Construction. Failure by Sybase or any Contributor to enforce "
        + "any provision of this License will not be deemed a waiver of future enforcement "
        + "of that or any other provision. Any law or regulation which provides that the la"
        + "nguage of a contract shall be construed against the drafter will not apply to th"
        + "is License.\n"
        + "\n"
        + "     13.5 Severability. (a) If for any reason a court of competent jurisdiction "
        + "finds any provision of this License, or portion thereof, to be unenforceable, th"
        + "at provision of the License will be enforced to the maximum extent permissible s"
        + "o as to effect the economic benefits and intent of the parties, and the remainde"
        + "r of this License will continue in full force and effect. (b) Notwithstanding th"
        + "e foregoing, if applicable law prohibits or restricts You from fully and/or spec"
        + "ifically complying with Sections 2 and/or 3 or prevents the enforceability of ei"
        + "ther of those Sections, this License will immediately terminate and You must imm"
        + "ediately discontinue any use of the Covered Code and destroy all copies of it th"
        + "at are in your possession or control.\n"
        + "\n"
        + "     13.6 Dispute Resolution. Any litigation or other dispute resolution between"
        + " You and Sybase relating to this License shall take place in the Northern Distri"
        + "ct of California, and You and Sybase hereby consent to the personal jurisdiction"
        + " of, and venue in, the state and federal courts within that District with respec"
        + "t to this License. The application of the United Nations Convention on Contracts"
        + " for the International Sale of Goods is expressly excluded.\n"
        + "\n"
        + "     13.7 Entire Agreement; Governing Law. This License constitutes the entire a"
        + "greement between the parties with respect to the subject matter hereof. This Lic"
        + "ense shall be governed by the laws of the United States and the State of Califor"
        + "nia, except that body of California law concerning conflicts of law.\n"
        + "Where You are located in the province of Quebec, Canada, the following clause ap"
        + "plies: The parties hereby confirm that they have requested that this License and"
        + " all related documents be drafted in English. Les parties ont exigè que le prèse"
        + "nt contrat et tous les documents connexes soient rèdiès en anglais.\n"
        + "\n"
        + "\n"
        + "EXHIBIT A. \n"
        + "\n"
        + "\"Portions Copyright (c) 1983-2002 Sybase, Inc. All Rights Reserved.\n"
        + "This file contains Original Code and/or Modifications of Original Code as define"
        + "d in and that are subject to the Sybase Open Watcom Public License version 1.0 ("
        + "the 'License'). You may not use this file except in compliance with the License."
        + " BY USING THIS FILE YOU AGREE TO ALL TERMS AND CONDITIONS OF THE LICENSE. A copy"
        + " of the License is provided with the Original Code and Modifications, and is als"
        + "o available at www.sybase.com/developer/opensource. \n"
        + "\n"
        + "The Original Code and all software distributed under the License are distributed"
        + " on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED, A"
        + "ND SYBASE AND ALL CONTRIBUTORS HEREBY DISCLAIM ALL SUCH WARRANTIES, INCLUDING WI"
        + "THOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PU"
        + "RPOSE, QUIET ENJOYMENT OR NON-INFRINGEMENT. Please see the License for the speci"
        + "fic language governing rights and limitations under the License.\"\n"
; // the license text
    }
 
    
}
