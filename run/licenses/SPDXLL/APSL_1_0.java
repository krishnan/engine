package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:28Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: APSL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class APSL_1_0 extends License{
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
        return "APSL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Apple Public Source License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "APPLE PUBLIC SOURCE LICENSE\n"
        + "Version 1.0 - March 16, 1999\n"
        + "\n"
        + "Please read this License carefully before downloading this software. By download"
        + "ing and using this software, you are agreeing to be bound by the terms of this L"
        + "icense. If you do not or cannot agree to the terms of this License, please do no"
        + "t download or use the software.\n"
        + "\n"
        + "1. General; Definitions. This License applies to any program or other work which"
        + " Apple Computer, Inc. (\"Apple\") publicly announces as subject to this Apple Publ"
        + "ic Source License and which contains a notice placed by Apple identifying such p"
        + "rogram or work as \"Original Code\" and stating that it is subject to the terms of"
        + " this Apple Public Source License version 1.0 (or subsequent version thereof), a"
        + "s it may be revised from time to time by Apple (\"License\"). As used in this Lice"
        + "nse:\n"
        + "\n"
        + "1.1 \"Applicable Patents\" mean: (a) in the case where Apple is the grantor of rig"
        + "hts, (i) patents or patent applications that are now or hereafter acquired, owne"
        + "d by or assigned to Apple and (ii) whose claims cover subject matter contained i"
        + "n the Original Code, but only to the extent necessary to use, reproduce and/or d"
        + "istribute the Original Code without infringement; and (b) in the case where You "
        + "are the grantor of rights, (i) patents and patent applications that are now or h"
        + "ereafter acquired, owned by or assigned to You and (ii) whose claims cover subje"
        + "ct matter in Your Modifications, taken alone or in combination with Original Cod"
        + "e.\n"
        + "\n"
        + "1.2 \"Covered Code\" means the Original Code, Modifications, the combination of Or"
        + "iginal Code and any Modifications, and/or any respective portions thereof.\n"
        + "\n"
        + "1.3 \"Deploy\" means to use, sublicense or distribute Covered Code other than for "
        + "Your internal research and development (R&D), and includes without limitation, a"
        + "ny and all internal use or distribution of Covered Code within Your business or "
        + "organization except for R&D use, as well as direct or indirect sublicensing or d"
        + "istribution of Covered Code by You to any third party in any form or manner.\n"
        + "\n"
        + "1.4 \"Larger Work\" means a work which combines Covered Code or portions thereof w"
        + "ith code not governed by the terms of this License.\n"
        + "\n"
        + "1.5 \"Modifications\" mean any addition to, deletion from, and/or change to, the s"
        + "ubstance and/or structure of Covered Code. When code is released as a series of "
        + "files, a Modification is: (a) any addition to or deletion from the contents of a"
        + " file containing Covered Code; and/or (b) any new file or other representation o"
        + "f computer program statements that contains any part of Covered Code.\n"
        + "\n"
        + "1.6 \"Original Code\" means the Source Code of a program or other work as original"
        + "ly made available by Apple under this License, including the Source Code of any "
        + "updates or upgrades to such programs or works made available by Apple under this"
        + " License, and that has been expressly identified by Apple as such in the header "
        + "file(s) of such work.\n"
        + "\n"
        + "1.7 \"Source Code\" means the human readable form of a program or other work that "
        + "is suitable for making modifications to it, including all modules it contains, p"
        + "lus any associated interface definition files, scripts used to control compilati"
        + "on and installation of an executable (object code).\n"
        + "\n"
        + "1.8 \"You\" or \"Your\" means an individual or a legal entity exercising rights unde"
        + "r this License. For legal entities, \"You\" or \"Your\" includes any entity which co"
        + "ntrols, is controlled by, or is under common control with, You, where \"control\" "
        + "means (a) the power, direct or indirect, to cause the direction or management of"
        + " such entity, whether by contract or otherwise, or (b) ownership of fifty percen"
        + "t (50%) or more of the outstanding shares or beneficial ownership of such entity"
        + ".\n"
        + "\n"
        + "2. Permitted Uses; Conditions & Restrictions. Subject to the terms and condition"
        + "s of this License, Apple hereby grants You, effective on the date You accept thi"
        + "s License and download the Original Code, a world-wide, royalty-free, non-exclus"
        + "ive license, to the extent of Apple's Applicable Patents and copyrights covering"
        + " the Original Code, to do the following:\n"
        + "\n"
        + "2.1 You may use, copy, modify and distribute Original Code, with or without Modi"
        + "fications, solely for Your internal research and development, provided that You "
        + "must in each instance:\n"
        + "\n"
        + "(a) retain and reproduce in all copies of Original Code the copyright and other "
        + "proprietary notices and disclaimers of Apple as they appear in the Original Code"
        + ", and keep intact all notices in the Original Code that refer to this License;\n"
        + "\n"
        + "(b) include a copy of this License with every copy of Source Code of Covered Cod"
        + "e and documentation You distribute, and You may not offer or impose any terms on"
        + " such Source Code that alter or restrict this License or the recipients' rights "
        + "hereunder, except as permitted under Section 6; and\n"
        + "\n"
        + "(c) completely and accurately document all Modifications that you have made and "
        + "the date of each such Modification, designate the version of the Original Code y"
        + "ou used, prominently include a file carrying such information with the Modificat"
        + "ions, and duplicate the notice in Exhibit A in each file of the Source Code of a"
        + "ll such Modifications.\n"
        + "\n"
        + "2.2 You may Deploy Covered Code, provided that You must in each instance:\n"
        + "\n"
        + "(a) satisfy all the conditions of Section 2.1 with respect to the Source Code of"
        + " the Covered Code;\n"
        + "\n"
        + "(b) make all Your Deployed Modifications publicly available in Source Code form "
        + "via electronic distribution (e.g. download from a web site) under the terms of t"
        + "his License and subject to the license grants set forth in Section 3 below, and "
        + "any additional terms You may choose to offer under Section 6. You must continue "
        + "to make the Source Code of Your Deployed Modifications available for as long as "
        + "you Deploy the Covered Code or twelve (12) months from the date of initial Deplo"
        + "yment, whichever is longer;\n"
        + "\n"
        + "(c) must notify Apple and other third parties of how to obtain Your Deployed Mod"
        + "ifications by filling out and submitting the required information found at http:"
        + "//www.apple.com/publicsource/modifications.html; and\n"
        + "\n"
        + "(d) if you Deploy Covered Code in object code, executable form only, include a p"
        + "rominent notice, in the code itself as well as in related documentation, stating"
        + " that Source Code of the Covered Code is available under the terms of this Licen"
        + "se with information on how and where to obtain such Source Code.\n"
        + "\n"
        + "3. Your Grants. In consideration of, and as a condition to, the licenses granted"
        + " to You under this License:\n"
        + "\n"
        + "(a) You hereby grant to Apple and all third parties a non-exclusive, royalty-fre"
        + "e license, under Your Applicable Patents and other intellectual property rights "
        + "owned or controlled by You, to use, reproduce, modify, distribute and Deploy You"
        + "r Modifications of the same scope and extent as Apple's licenses under Sections "
        + "2.1 and 2.2; and\n"
        + "\n"
        + "(b) You hereby grant to Apple and its subsidiaries a non-exclusive, worldwide, r"
        + "oyalty-free, perpetual and irrevocable license, under Your Applicable Patents an"
        + "d other intellectual property rights owned or controlled by You, to use, reprodu"
        + "ce, execute, compile, display, perform, modify or have modified (for Apple and/o"
        + "r its subsidiaries), sublicense and distribute Your Modifications, in any form, "
        + "through multiple tiers of distribution.\n"
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
        + "our sole responsibility, and not on behalf of Apple. You must obtain the recipie"
        + "nt's agreement that any such Additional Terms are offered by You alone, and You "
        + "hereby agree to indemnify, defend and hold Apple harmless for any liability incu"
        + "rred by or claims asserted against Apple by reason of any such Additional Terms.\n"
        + "\n"
        + "7. Versions of the License. Apple may publish revised and/or new versions of thi"
        + "s License from time to time. Each version will be given a distinguishing version"
        + " number. Once Original Code has been published under a particular version of thi"
        + "s License, You may continue to use it under the terms of that version. You may a"
        + "lso choose to use such Original Code under the terms of any subsequent version o"
        + "f this License published by Apple. No one other than Apple has the right to modi"
        + "fy the terms applicable to Covered Code created under this License.\n"
        + "\n"
        + "8. NO WARRANTY OR SUPPORT. The Original Code may contain in whole or in part pre"
        + "-release, untested, or not fully tested works. The Original Code may contain err"
        + "ors that could cause failures or loss of data, and may be incomplete or contain "
        + "inaccuracies. You expressly acknowledge and agree that use of the Original Code,"
        + " or any portion thereof, is at Your sole and entire risk. THE ORIGINAL CODE IS P"
        + "ROVIDED \"AS IS\" AND WITHOUT WARRANTY, UPGRADES OR SUPPORT OF ANY KIND AND APPLE "
        + "AND APPLE'S LICENSOR(S) (FOR THE PURPOSES OF SECTIONS 8 AND 9, APPLE AND APPLE'S"
        + " LICENSOR(S) ARE COLLECTIVELY REFERRED TO AS \"APPLE\") EXPRESSLY DISCLAIM ALL WAR"
        + "RANTIES AND/OR CONDITIONS, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, TH"
        + "E\n"
        + "IMPLIED WARRANTIES AND/OR CONDITIONS OF MERCHANTABILITY OR SATISFACTORY QUALITY "
        + "AND FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF THIRD PARTY RIGHTS. "
        + "APPLE DOES NOT WARRANT THAT THE FUNCTIONS CONTAINED IN THE ORIGINAL CODE WILL ME"
        + "ET YOUR REQUIREMENTS, OR THAT THE OPERATION OF THE ORIGINAL CODE WILL BE UNINTER"
        + "RUPTED OR ERROR-FREE, OR THAT DEFECTS IN THE ORIGINAL CODE WILL BE CORRECTED. NO"
        + " ORAL OR WRITTEN INFORMATION OR ADVICE GIVEN BY APPLE OR AN APPLE AUTHORIZED REP"
        + "RESENTATIVE SHALL CREATE A WARRANTY OR IN ANY WAY INCREASE THE SCOPE OF THIS WAR"
        + "RANTY. You acknowledge that the Original Code is not intended for use in the ope"
        + "ration of nuclear facilities, aircraft navigation, communication systems, or air"
        + " traffic control machines in which case the failure of the Original Code could l"
        + "ead to death, personal injury, or severe physical or environmental damage.\n"
        + "\n"
        + "9. Liability.\n"
        + "\n"
        + "9.1 Infringement. If any of the Original Code becomes the subject ofa claim of i"
        + "nfringement (\"Affected Original Code\"), Apple may, at its sole discretion and op"
        + "tion: (a) attempt to procure the rights necessary for You to continue using the "
        + "Affected Original Code; (b) modify the Affected Original Code so that it is no l"
        + "onger infringing; or (c) terminate Your rights to use the Affected Original Code"
        + ", effective immediately upon Apple's posting of a notice to such effect on the A"
        + "pple web site that is used for implementation of this License.\n"
        + "\n"
        + "9.2 LIMITATION OF LIABILITY. UNDER NO CIRCUMSTANCES SHALL APPLE BE LIABLE FOR AN"
        + "Y INCIDENTAL, SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES ARISING OUT OF OR RELAT"
        + "ING TO THIS LICENSE OR YOUR USE OR INABILITY TO USE THE ORIGINAL CODE, OR ANY PO"
        + "RTION THEREOF, WHETHER UNDER A THEORY OF CONTRACT, WARRANTY, TORT (INCLUDING NEG"
        + "LIGENCE), PRODUCTS LIABILITY OR OTHERWISE, EVEN IF APPLE HAS BEEN ADVISED OF THE"
        + " POSSIBILITY OF SUCH DAMAGES AND NOTWITHSTANDING THE FAILURE OF ESSENTIAL PURPOS"
        + "E OF ANY REMEDY. In no event shall Apple's total liability to You for all damage"
        + "s under this License exceed the amount of fifty dollars ($50.00).\n"
        + "\n"
        + "10. Trademarks. This License does not grant any rights to use the trademarks or "
        + "trade names \"Apple\", \"Apple Computer\", \"Mac OS X\", \"Mac OS X Server\" or any othe"
        + "r trademarks or trade names belonging to Apple (collectively \"Apple Marks\") and "
        + "no Apple Marks may be used to endorse or promote products derived from the Origi"
        + "nal Code\n"
        + "other than as permitted by and in strict compliance at all times with Apple's th"
        + "ird party trademark usage guidelines which are posted at http://www.apple.com/le"
        + "gal/guidelinesfor3rdparties.html.\n"
        + "\n"
        + "11. Ownership. Apple retains all rights, title and interest in and to the Origin"
        + "al Code and any Modifications made by or on behalf of Apple (\"Apple Modification"
        + "s\"), and such Apple Modifications will not be automatically subject to this Lice"
        + "nse. Apple may, at its sole discretion, choose to license such Apple Modificatio"
        + "ns under this License, or on different terms from those contained in this Licens"
        + "e or may choose not to license them at all. Apple's development, use, reproducti"
        + "on, modification, sublicensing and distribution of Covered Code will not be subj"
        + "ect to this License.\n"
        + "\n"
        + "12. Termination.\n"
        + "\n"
        + "12.1 Termination. This License and the rights granted hereunder will terminate:\n"
        + "\n"
        + "(a) automatically without notice from Apple if You fail to comply with any term("
        + "s) of this License and fail to cure such breach within 30 days of becoming aware"
        + " of such breach; (b) immediately in the event of the circumstances described in "
        + "Sections 9.1 and/or 13.6(b); or (c) automatically without notice from Apple if Y"
        + "ou, at any time during the term of this License, commence an action for patent i"
        + "nfringement against Apple.\n"
        + "\n"
        + "12.2 Effect of Termination. Upon termination, You agree to immediately stop any "
        + "further use, reproduction, modification and distribution of the Covered Code, or"
        + " Affected Original Code in the case of termination under Section 9.1, and to des"
        + "troy all copies of the Covered Code or Affected Original Code (in the case of\n"
        + "termination under Section 9.1) that are in your possession or control. All subli"
        + "censes to the Covered Code which have been properly granted prior to termination"
        + " shall survive any termination of this License. Provisions which, by their natur"
        + "e, should remain in effect beyond the termination of this License shall survive,"
        + " including but not limited to Sections 3, 5, 8, 9, 10, 11, 12.2 and 13. Neither "
        + "party will be liable to the other for compensation, indemnity or damages of any "
        + "sort solely as a result of terminating this License in accordance with its terms"
        + ", and termination of this License will be without prejudice to any other right o"
        + "r remedy of either party.\n"
        + "\n"
        + "13. Miscellaneous.\n"
        + "\n"
        + "13.1 Export Law Assurances. You may not use or otherwise export or re-export the"
        + " Original Code except as authorized by United States law and the laws of the jur"
        + "isdiction in which the Original Code was obtained. In particular, but without li"
        + "mitation, the Original Code may not be exported or re-exported (a) into (or to a"
        + " national or resident of) any U.S. embargoed country or (b) to anyone on the U.S"
        + ". Treasury Department's list of Specially Designated Nationals or the U.S. Depar"
        + "tment of Commerce's Table of Denial Orders. By using the Original Code, You repr"
        + "esent and warrant that You are not located in, under control of, or a national o"
        + "r resident of any such country or on any such list.\n"
        + "\n"
        + "13.2 Government End Users. The Covered Code is a \"commercial item\" as defined in"
        + " FAR 2.101. Government software and technical data rights in the Covered Code in"
        + "clude only those rights customarily provided to the public as defined in this Li"
        + "cense. This customary commercial license in technical data and software is provi"
        + "ded in\n"
        + "accordance with FAR 12.211 (Technical Data) and 12.212 (Computer Software) and, "
        + "for Department of Defense purchases, DFAR 252.227-7015 (Technical Data -- Commer"
        + "cial Items) and 227.7202-3 (Rights in Commercial Computer Software or Computer S"
        + "oftware Documentation). Accordingly, all U.S. Government End Users acquire Cover"
        + "ed Code with only those rights set forth herein.\n"
        + "\n"
        + "13.3 Relationship of Parties. This License will not be construed as creating an "
        + "agency, partnership, joint venture or any other form of legal association betwee"
        + "n You and Apple, and You will not represent to the contrary, whether expressly, "
        + "by implication, appearance or otherwise.\n"
        + "\n"
        + "13.4 Independent Development. Nothing in this License will impair Apple's right "
        + "to acquire, license, develop, have others develop for it, market and/or distribu"
        + "te technology or products that perform the same or similar functions as, or othe"
        + "rwise compete with, Modifications, Larger Works, technology or products that You"
        + " may develop, produce, market or distribute.\n"
        + "\n"
        + "13.5 Waiver; Construction. Failure by Apple to enforce any provision of this Lic"
        + "ense will not be deemed a waiver of future enforcement of that or any other prov"
        + "ision. Any law or regulation which provides that the language of a contract shal"
        + "l be construed against the drafter will not apply to this License.\n"
        + "\n"
        + "13.6 Severability. (a) If for any reason a court of competent jurisdiction finds"
        + " any provision of this License, or portion thereof, to be unenforceable, that pr"
        + "ovision of the License will be enforced to the maximum extent permissible so as "
        + "to effect the economic benefits and intent of the parties, and the remainder of "
        + "this License will continue in full force and effect. (b) Notwithstanding the for"
        + "egoing, if applicable law prohibits or restricts You from fully and/or specifica"
        + "lly complying with\n"
        + "Sections 2 and/or 3 or prevents the enforceability of either of those Sections, "
        + "this License will immediately terminate and You must immediately discontinue any"
        + " use of the Covered Code and destroy all copies of it that are in your possessio"
        + "n or control.\n"
        + "\n"
        + "13.7 Dispute Resolution. Any litigation or other dispute resolution between You "
        + "and Apple relating to this License shall take place in the Northern District of "
        + "California, and You and Apple hereby consent to the personal jurisdiction of, an"
        + "d venue in, the state and federal courts within that District with respect to th"
        + "is\n"
        + "License. The application of the United Nations Convention on Contracts for the I"
        + "nternational Sale of Goods is expressly excluded.\n"
        + "\n"
        + "13.8 Entire Agreement; Governing Law. This License constitutes the entire agreem"
        + "ent between the parties with respect to the subject matter hereof. This License "
        + "shall be governed by the laws of the United States and the State of California, "
        + "except that body of California law concerning conflicts of law.\n"
        + "\n"
        + "Where You are located in the province of Quebec, Canada, the following clause ap"
        + "plies: The parties hereby confirm that they have requested that this License and"
        + " all related documents be drafted in English. Les parties ont exige que le prese"
        + "nt contrat et tous les documents connexes soient rediges en anglais.\n"
        + "\n"
        + "EXHIBIT A.\n"
        + "\n"
        + "\"Portions Copyright (c) 1999 Apple Computer, Inc. All Rights\n"
        + "Reserved. This file contains Original Code and/or Modifications of\n"
        + "Original Code as defined in and that are subject to the Apple Public\n"
        + "Source License Version 1.0 (the 'License'). You may not use this file\n"
        + "except in compliance with the License. Please obtain a copy of the\n"
        + "License at http://www.apple.com/publicsource and read it before using\n"
        + "this file.\n"
        + "\n"
        + "The Original Code and all software distributed under the License are\n"
        + "distributed on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER\n"
        + "EXPRESS OR IMPLIED, AND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES,\n"
        + "INCLUDING WITHOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY,\n"
        + "FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT. Please see the\n"
        + "License for the specific language governing rights and limitations\n"
        + "under the License.\"\n"
; // the license text
    }
 
    
}
