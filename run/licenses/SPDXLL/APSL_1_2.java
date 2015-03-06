package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:29Z
 * LicenseName: AGPL-3.0+
 * FileName: APSL_1_2.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class APSL_1_2 extends License{
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
        return "APSL-1.2"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Apple Public Source License 1.2"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Apple Public Source License Ver. 1.2\n"
        + "\n"
        + "1. General; Definitions. This License applies to any program or other work which"
        + " Apple Computer, Inc. (\"Apple\") makes publicly available and which contains a no"
        + "tice placed by Apple identifying such program or work as \"Original Code\" and sta"
        + "ting that it is subject to the terms of this Apple Public Source License version"
        + " 1.2 (or subsequent version thereof) (\"License\"). As used in this License:\n"
        + "\n"
        + "1.1 \"Applicable Patent Rights\" mean: (a) in the case where Apple is the grantor "
        + "of rights, (i) claims of patents that are now or hereafter acquired, owned by or"
        + " assigned to Apple and (ii) that cover subject matter contained in the Original "
        + "Code, but only to the extent necessary to use, reproduce and/or distribute the O"
        + "riginal Code without infringement; and (b) in the case where You are the grantor"
        + " of rights, (i) claims of patents that are now or hereafter acquired, owned by o"
        + "r assigned to You and (ii) that cover subject matter in Your Modifications, take"
        + "n alone or in combination with Original Code.\n"
        + "\n"
        + "1.2 \"Contributor\" means any person or entity that creates or contributes to the "
        + "creation of Modifications.\n"
        + "\n"
        + "1.3 \"Covered Code\" means the Original Code, Modifications, the combination of Or"
        + "iginal Code and any Modifications, and/or any respective portions thereof.\n"
        + "\n"
        + "1.4 \"Deploy\" means to use, sublicense or distribute Covered Code other than for "
        + "Your internal research and development (R&D) and/or Personal Use, and includes w"
        + "ithout limitation, any and all internal use or distribution of Covered Code with"
        + "in Your business or organization except for R&D use and/or Personal Use, as well"
        + " as direct or indirect sublicensing or distribution of Covered Code by You to an"
        + "y third party in any form or manner.\n"
        + "\n"
        + "1.5 \"Larger Work\" means a work which combines Covered Code or portions thereof w"
        + "ith code not governed by the terms of this License.\n"
        + "\n"
        + "1.6 \"Modifications\" mean any addition to, deletion from, and/or change to, the s"
        + "ubstance and/or structure of the Original Code, any previous Modifications, the "
        + "combination of Original Code and any previous Modifications, and/or any respecti"
        + "ve portions thereof. When code is released as a series of files, a Modification "
        + "is: (a) any addition to or deletion from the contents of a file containing Cover"
        + "ed Code; and/or (b) any new file or other representation of computer program sta"
        + "tements that contains any part of Covered Code.\n"
        + "\n"
        + "1.7 \"Original Code\" means (a) the Source Code of a program or other work as orig"
        + "inally made available by Apple under this License, including the Source Code of "
        + "any updates or upgrades to such programs or works made available by Apple under "
        + "this License, and that has been expressly identified by Apple as such in the hea"
        + "der file(s) of such work; and (b) the object code compiled from such Source Code"
        + " and originally made available by Apple under this License.\n"
        + "\n"
        + "1.8 \"Personal Use\" means use of Covered Code by an individual solely for his or "
        + "her personal, private and non-commercial purposes. An individual's use of Covere"
        + "d Code in his or her capacity as an officer, employee, member, independent contr"
        + "actor or agent of a corporation, business or organization (commercial or non-com"
        + "mercial) does not qualify as Personal Use.\n"
        + "\n"
        + "1.9 \"Source Code\" means the human readable form of a program or other work that "
        + "is suitable for making modifications to it, including all modules it contains, p"
        + "lus any associated interface definition files, scripts used to control compilati"
        + "on and installation of an executable (object code).\n"
        + "\n"
        + "1.10 \"You\" or \"Your\" means an individual or a legal entity exercising rights und"
        + "er this License. For legal entities, \"You\" or \"Your\" includes any entity which c"
        + "ontrols, is controlled by, or is under common control with, You, where \"control\""
        + " means (a) the power, direct or indirect, to cause the direction or management o"
        + "f such entity, whether by contract or otherwise, or (b) ownership of fifty perce"
        + "nt (50%) or more of the outstanding shares or beneficial ownership of such entit"
        + "y.\n"
        + "\n"
        + "2. Permitted Uses; Conditions & Restrictions.Subject to the terms and conditions"
        + " of this License, Apple hereby grants You, effective on the date You accept this"
        + " License and download the Original Code, a world-wide, royalty-free, non-exclusi"
        + "ve license, to the extent of Apple's Applicable Patent Rights and copyrights cov"
        + "ering the Original Code, to do the following:\n"
        + "\n"
        + "2.1 You may use, reproduce, display, perform, modify and distribute Original Cod"
        + "e, with or without Modifications, solely for Your internal research and developm"
        + "ent and/or Personal Use, provided that in each instance:\n"
        + "\n"
        + "(a) You must retain and reproduce in all copies of Original Code the copyright a"
        + "nd other proprietary notices and disclaimers of Apple as they appear in the Orig"
        + "inal Code, and keep intact all notices in the Original Code that refer to this L"
        + "icense; and\n"
        + "\n"
        + "(b) You must include a copy of this License with every copy of Source Code of Co"
        + "vered Code and documentation You distribute, and You may not offer or impose any"
        + " terms on such Source Code that alter or restrict this License or the recipients"
        + "' rights hereunder, except as permitted under Section 6.\n"
        + "\n"
        + "2.2 You may use, reproduce, display, perform, modify and Deploy Covered Code, pr"
        + "ovided that in each instance:\n"
        + "\n"
        + "(a) You must satisfy all the conditions of Section 2.1 with respect to the Sourc"
        + "e Code of the Covered Code;\n"
        + "\n"
        + "(b) You must duplicate, to the extent it does not already exist, the notice in E"
        + "xhibit A in each file of the Source Code of all Your Modifications, and cause th"
        + "e modified files to carry prominent notices stating that You changed the files a"
        + "nd the date of any change;\n"
        + "\n"
        + "(c) You must make Source Code of all Your Deployed Modifications publicly availa"
        + "ble under the terms of this License, including the license grants set forth in S"
        + "ection 3 below, for as long as you Deploy the Covered Code or twelve (12) months"
        + " from the date of initial Deployment, whichever is longer. You should preferably"
        + " distribute the Source Code of Your Deployed Modifications electronically (e.g. "
        + "download from a web site); and\n"
        + "\n"
        + "(d) if You Deploy Covered Code in object code, executable form only, You must in"
        + "clude a prominent notice, in the code itself as well as in related documentation"
        + ", stating that Source Code of the Covered Code is available under the terms of t"
        + "his License with information on how and where to obtain such Source Code.\n"
        + "\n"
        + "2.3 You expressly acknowledge and agree that although Apple and each Contributor"
        + " grants the licenses to their respective portions of the Covered Code set forth "
        + "herein, no assurances are provided by Apple or any Contributor that the Covered "
        + "Code does not infringe the patent or other intellectual property rights of any o"
        + "ther entity. Apple and each Contributor disclaim any liability to You for claims"
        + " brought by any other entity based on infringement of intellectual property righ"
        + "ts or otherwise. As a condition to exercising the rights and licenses granted he"
        + "reunder, You hereby assume sole responsibility to secure any other intellectual "
        + "property rights needed, if any. For example, if a third party patent license is "
        + "required to allow You to distribute the Covered Code, it is Your responsibility "
        + "to acquire that license before distributing the Covered Code.\n"
        + "\n"
        + "3. Your Grants. In consideration of, and as a condition to, the licenses granted"
        + " to You under this License:\n"
        + "\n"
        + "(a) You hereby grant to Apple and all third parties a non-exclusive, royalty-fre"
        + "e license, under Your Applicable Patent Rights and other intellectual property r"
        + "ights (other than patent) owned or controlled by You, to use, reproduce, display"
        + ", perform, modify, distribute and Deploy Your Modifications of the same scope an"
        + "d extent as Apple's licenses under Sections 2.1 and 2.2; and\n"
        + "\n"
        + "(b) You hereby grant to Apple and its subsidiaries a non-exclusive, worldwide, r"
        + "oyalty-free, perpetual and irrevocable license, under Your Applicable Patent Rig"
        + "hts and other intellectual property rights (other than patent) owned or controll"
        + "ed by You, to use, reproduce, display, perform, modify or have modified (for App"
        + "le and/or its subsidiaries), sublicense and distribute Your Modifications, in an"
        + "y form, through multiple tiers of distribution.\n"
        + "\n"
        + "4. Larger Works. You may create a Larger Work by combining Covered Code with oth"
        + "er code not governed by the terms of this License and distribute the Larger Work"
        + " as a single product. In each such instance, You must make sure the requirements"
        + " of this License are fulfilled for the Covered Code or any portion thereof.\n"
        + "\n"
        + "5. Limitations on Patent License. Except as expressly stated in Section 2, no ot"
        + "her patent rights, express or implied, are granted by Apple herein. Modification"
        + "s and/or Larger Works may require additional patent licenses from Apple which Ap"
        + "ple may grant in its sole discretion.\n"
        + "\n"
        + "6. Additional Terms. You may choose to offer, and to charge a fee for, warranty,"
        + " support, indemnity or liability obligations and/or other rights consistent with"
        + " the scope of the license granted herein (\"Additional Terms\") to one or more rec"
        + "ipients of Covered Code. However, You may do so only on Your own behalf and as Y"
        + "our sole responsibility, and not on behalf of Apple or any Contributor. You must"
        + " obtain the recipient's agreement that any such Additional Terms are offered by "
        + "You alone, and You hereby agree to indemnify, defend and hold Apple and every Co"
        + "ntributor harmless for any liability incurred by or claims asserted against Appl"
        + "e or such Contributor by reason of any such Additional Terms.\n"
        + "\n"
        + "7. Versions of the License. Apple may publish revised and/or new versions of thi"
        + "s License from time to time. Each version will be given a distinguishing version"
        + " number. Once Original Code has been published under a particular version of thi"
        + "s License, You may continue to use it under the terms of that version. You may a"
        + "lso choose to use such Original Code under the terms of any subsequent version o"
        + "f this License published by Apple. No one other than Apple has the right to modi"
        + "fy the terms applicable to Covered Code created under this License.\n"
        + "\n"
        + "8. NO WARRANTY OR SUPPORT. The Covered Code may contain in whole or in part pre-"
        + "release, untested, or not fully tested works. The Covered Code may contain error"
        + "s that could cause failures or loss of data, and may be incomplete or contain in"
        + "accuracies. You expressly acknowledge and agree that use of the Covered Code, or"
        + " any portion thereof, is at Your sole and entire risk. THE COVERED CODE IS PROVI"
        + "DED \"AS IS\" AND WITHOUT WARRANTY, UPGRADES OR SUPPORT OF ANY KIND AND APPLE AND "
        + "APPLE'S LICENSOR(S) (COLLECTIVELY REFERRED TO AS \"APPLE\" FOR THE PURPOSES OF SEC"
        + "TIONS 8 AND 9) AND ALL CONTRIBUTORS EXPRESSLY DISCLAIM ALL WARRANTIES AND/OR CON"
        + "DITIONS, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTI"
        + "ES AND/OR CONDITIONS OF MERCHANTABILITY, OF SATISFACTORY QUALITY, OF FITNESS FOR"
        + " A PARTICULAR PURPOSE, OF ACCURACY, OF QUIET ENJOYMENT, AND NONINFRINGEMENT OF T"
        + "HIRD PARTY RIGHTS. APPLE AND EACH CONTRIBUTOR DOES NOT WARRANT AGAINST INTERFERE"
        + "NCE WITH YOUR ENJOYMENT OF THE COVERED CODE, THAT THE FUNCTIONS CONTAINED IN THE"
        + " COVERED CODE WILL MEET YOUR REQUIREMENTS, THAT THE OPERATION OF THE COVERED COD"
        + "E WILL BE UNINTERRUPTED OR ERROR-FREE, OR THAT DEFECTS IN THE COVERED CODE WILL "
        + "BE CORRECTED. NO ORAL OR WRITTEN INFORMATION OR ADVICE GIVEN BY APPLE, AN APPLE "
        + "AUTHORIZED REPRESENTATIVE OR ANY CONTRIBUTOR SHALL CREATE A WARRANTY. You acknow"
        + "ledge that the Covered Code is not intended for use in the operation of nuclear "
        + "facilities, aircraft navigation, communication systems, or air traffic control m"
        + "achines in which case the failure of the Covered Code could lead to death, perso"
        + "nal injury, or severe physical or environmental damage.\n"
        + "\n"
        + "9. LIMITATION OF LIABILITY. TO THE EXTENT NOT PROHIBITED BY LAW, IN NO EVENT SHA"
        + "LL APPLE OR ANY CONTRIBUTOR BE LIABLE FOR ANY INCIDENTAL, SPECIAL, INDIRECT OR C"
        + "ONSEQUENTIAL DAMAGES ARISING OUT OF OR RELATING TO THIS LICENSE OR YOUR USE OR I"
        + "NABILITY TO USE THE COVERED CODE, OR ANY PORTION THEREOF, WHETHER UNDER A THEORY"
        + " OF CONTRACT, WARRANTY, TORT (INCLUDING NEGLIGENCE), PRODUCTS LIABILITY OR OTHER"
        + "WISE, EVEN IF APPLE OR SUCH CONTRIBUTOR HAS BEEN ADVISED OF THE POSSIBILITY OF S"
        + "UCH DAMAGES AND NOTWITHSTANDING THE FAILURE OF ESSENTIAL PURPOSE OF ANY REMEDY. "
        + "SOME JURISDICTIONS DO NOT ALLOW THE LIMITATION OF LIABILITY OF INCIDENTAL OR CON"
        + "SEQUENTIAL DAMAGES, SO THIS LIMITATION MAY NOT APPLY TO YOU. In no event shall A"
        + "pple's total liability to You for all damages (other than as may be required by "
        + "applicable law) under this License exceed the amount of fifty dollars ($50.00).\n"
        + "\n"
        + "10. Trademarks. This License does not grant any rights to use the trademarks or "
        + "trade names \"Apple\", \"Apple Computer\", \"Mac OS X\", \"Mac OS X Server\", \"QuickTime"
        + "\", \"QuickTime Streaming Server\" or any other trademarks or trade names belonging"
        + " to Apple (collectively \"Apple Marks\") or to any trademark or trade name belongi"
        + "ng to any Contributor. No Apple Marks may be used to endorse or promote products"
        + " derived from the Original Code other than as permitted by and in strict complia"
        + "nce at all times with Apple's third party trademark usage guidelines which are p"
        + "osted at http://www.apple.com/legal/guidelinesfor3rdparties.html.\n"
        + "\n"
        + "11. Ownership. Subject to the licenses granted under this License, each Contribu"
        + "tor retains all rights, title and interest in and to any Modifications made by s"
        + "uch Contributor. Apple retains all rights, title and interest in and to the Orig"
        + "inal Code and any Modifications made by or on behalf of Apple (\"Apple Modificati"
        + "ons\"), and such Apple Modifications will not be automatically subject to this Li"
        + "cense. Apple may, at its sole discretion, choose to license such Apple Modificat"
        + "ions under this License, or on different terms from those contained in this Lice"
        + "nse or may choose not to license them at all.\n"
        + "\n"
        + "12. Termination.\n"
        + "\n"
        + "12.1 Termination. This License and the rights granted hereunder will terminate:\n"
        + "\n"
        + "(a) automatically without notice from Apple if You fail to comply with any term("
        + "s) of this License and fail to cure such breach within 30 days of becoming aware"
        + " of such breach;\n"
        + "\n"
        + "(b) immediately in the event of the circumstances described in Section 13.5(b); "
        + "or\n"
        + "\n"
        + "(c) automatically without notice from Apple if You, at any time during the term "
        + "of this License, commence an action for patent infringement against Apple.\n"
        + "\n"
        + "12.2 Effect of Termination. Upon termination, You agree to immediately stop any "
        + "further use, reproduction, modification, sublicensing and distribution of the Co"
        + "vered Code and to destroy all copies of the Covered Code that are in your posses"
        + "sion or control. All sublicenses to the Covered Code which have been properly gr"
        + "anted prior to termination shall survive any termination of this License. Provis"
        + "ions which, by their nature, should remain in effect beyond the termination of t"
        + "his License shall survive, including but not limited to Sections 3, 5, 8, 9, 10,"
        + " 11, 12.2 and 13. No party will be liable to any other for compensation, indemni"
        + "ty or damages of any sort solely as a result of terminating this License in acco"
        + "rdance with its terms, and termination of this License will be without prejudice"
        + " to any other right or remedy of any party.\n"
        + "\n"
        + "13. Miscellaneous.\n"
        + "\n"
        + "13.1 Government End Users. The Covered Code is a \"commercial item\" as defined in"
        + " FAR 2.101. Government software and technical data rights in the Covered Code in"
        + "clude only those rights customarily provided to the public as defined in this Li"
        + "cense. This customary commercial license in technical data and software is provi"
        + "ded in accordance with FAR 12.211 (Technical Data) and 12.212 (Computer Software"
        + ") and, for Department of Defense purchases, DFAR 252.227-7015 (Technical Data --"
        + " Commercial Items) and 227.7202-3 (Rights in Commercial Computer Software or Com"
        + "puter Software Documentation). Accordingly, all U.S. Government End Users acquir"
        + "e Covered Code with only those rights set forth herein.\n"
        + "\n"
        + "13.2 Relationship of Parties. This License will not be construed as creating an "
        + "agency, partnership, joint venture or any other form of legal association betwee"
        + "n or amongYou, Apple or any Contributor, and You will not represent to the contr"
        + "ary, whether expressly, by implication, appearance or otherwise.\n"
        + "\n"
        + "13.3 Independent Development. Nothing in this License will impair Apple's right "
        + "to acquire, license, develop, have others develop for it, market and/or distribu"
        + "te technology or products that perform the same or similar functions as, or othe"
        + "rwise compete with, Modifications, Larger Works, technology or products that You"
        + " may develop, produce, market or distribute.\n"
        + "\n"
        + "13.4 Waiver; Construction. Failure by Apple or any Contributor to enforce any pr"
        + "ovision of this License will not be deemed a waiver of future enforcement of tha"
        + "t or any other provision. Any law or regulation which provides that the language"
        + " of a contract shall be construed against the drafter will not apply to this Lic"
        + "ense.\n"
        + "\n"
        + "13.5 Severability. (a) If for any reason a court of competent jurisdiction finds"
        + " any provision of this License, or portion thereof, to be unenforceable, that pr"
        + "ovision of the License will be enforced to the maximum extent permissible so as "
        + "to effect the economic benefits and intent of the parties, and the remainder of "
        + "this License will continue in full force and effect. (b) Notwithstanding the for"
        + "egoing, if applicable law prohibits or restricts You from fully and/or specifica"
        + "lly complying with Sections 2 and/or 3 or prevents the enforceability of either "
        + "of those Sections, this License will immediately terminate and You must immediat"
        + "ely discontinue any use of the Covered Code and destroy all copies of it that ar"
        + "e in your possession or control.\n"
        + "\n"
        + "13.6 Dispute Resolution. Any litigation or other dispute resolution between You "
        + "and Apple relating to this License shall take place in the Northern District of "
        + "California, and You and Apple hereby consent to the personal jurisdiction of, an"
        + "d venue in, the state and federal courts within that District with respect to th"
        + "is License. The application of the United Nations Convention on Contracts for th"
        + "e International Sale of Goods is expressly excluded.\n"
        + "\n"
        + "13.7 Entire Agreement; Governing Law. This License constitutes the entire agreem"
        + "ent between the parties with respect to the subject matter hereof. This License "
        + "shall be governed by the laws of the United States and the State of California, "
        + "except that body of California law concerning conflicts of law.\n"
        + "\n"
        + "Where You are located in the province of Quebec, Canada, the following clause ap"
        + "plies: The parties hereby confirm that they have requested that this License and"
        + " all related documents be drafted in English. Les parties ont exigé que le prése"
        + "nt contrat et tous les documents connexes soient rédigés en anglais.\n"
        + "\n"
        + "EXHIBIT A.\n"
        + "\n"
        + "\"Portions Copyright (c) 1999-2001 Apple Computer, Inc. All Rights Reserved.\n"
        + "\n"
        + "This file contains Original Code and/or Modifications of Original Code as define"
        + "d in and that are subject to the Apple Public Source License Version 1.2 (the 'L"
        + "icense'). You may not use this file except in compliance with the License. Pleas"
        + "e obtain a copy of the License at http://www.apple.com/publicsource and read it "
        + "before using this file.\n"
        + "\n"
        + "The Original Code and all software distributed under the License are distributed"
        + " on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS OR IMPLIED, A"
        + "ND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES, INCLUDING WITHOUT LIMITATION, ANY"
        + " WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, QUIET ENJOYMEN"
        + "T OR NON-INFRINGEMENT. Please see the License for the specific language governin"
        + "g rights and limitations under the License.\"\n"
; // the license text
    }
 
    
}
