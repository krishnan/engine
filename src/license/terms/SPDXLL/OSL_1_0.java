package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:10Z
 * LicenseName: AGPL-3.0+
 * FileName: OSL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OSL_1_0 extends License{
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
        return "OSL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open Software License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Open Software License v. 1.0\n"
        + "\n"
        + "This Open Software License (the \"License\") applies to any original work of autho"
        + "rship (the \"Original Work\") whose owner (the \"Licensor\") has placed the followin"
        + "g notice immediately following the copyright notice for the Original Work: \n"
        + "\n"
        + "     \"Licensed under the Open Software License version 1.0\"\n"
        + "\n"
        + "License Terms\n"
        + "\n"
        + "1) Grant of Copyright License. Licensor hereby grants You a world-wide, royalty-"
        + "free, non-exclusive, perpetual, non-sublicenseable license to do the following:\n"
        + "\n"
        + "     a) to reproduce the Original Work in copies;\n"
        + "\n"
        + "     b) to prepare derivative works (\"Derivative Works\") based upon the Original"
        + " Work;\n"
        + "\n"
        + "     c) to distribute copies of the Original Work and Derivative Works to the pu"
        + "blic, with the proviso that copies of Original Work or Derivative Works that You"
        + " distribute shall be licensed under the Open Software License;\n"
        + "\n"
        + "     d) to perform the Original Work publicly; and\n"
        + "\n"
        + "     e) to display the Original Work publicly.\n"
        + "\n"
        + "2) Grant of Patent License. Licensor hereby grants You a world-wide, royalty-fre"
        + "e, non-exclusive, perpetual, non-sublicenseable license, under patent claims own"
        + "ed or controlled by the Licensor that are embodied in the Original Work as furni"
        + "shed by the Licensor (\"Licensed Claims\") to make, use, sell and offer for sale t"
        + "he Original Work. Licensor hereby grants You a world-wide, royalty-free, non-exc"
        + "lusive, perpetual, non-sublicenseable license under the Licensed Claims to make,"
        + " use, sell and offer for sale Derivative Works.\n"
        + "\n"
        + "3) Grant of Source Code License. The term \"Source Code\" means the preferred form"
        + " of the Original Work for making modifications to it and all available documenta"
        + "tion describing how to access and modify the Original Work. Licensor hereby agre"
        + "es to provide a machine-readable copy of the Source Code of the Original Work al"
        + "ong with each copy of the Original Work that Licensor distributes. Licensor rese"
        + "rves the right to satisfy this obligation by placing a machine-readable copy of "
        + "the Source Code in an information repository reasonably calculated to permit ine"
        + "xpensive and convenient access by You for as long as Licensor continues to distr"
        + "ibute the Original Work, and by publishing the address of that information repos"
        + "itory in a notice immediately following the copyright notice that applies to the"
        + " Original Work.\n"
        + "\n"
        + "4) Exclusions From License Grant. Nothing in this License shall be deemed to gra"
        + "nt any rights to trademarks, copyrights, patents, trade secrets or any other int"
        + "ellectual property of Licensor except as expressly stated herein. No patent lice"
        + "nse is granted to make, use, sell or offer to sell embodiments of any patent cla"
        + "ims other than the Licensed Claims defined in Section 2. No right is granted to "
        + "the trademarks of Licensor even if such marks are included in the Original Work."
        + " Nothing in this License shall be interpreted to prohibit Licensor from licensin"
        + "g under different terms from this License any Original Work that Licensor otherw"
        + "ise would have a right to license.\n"
        + "\n"
        + "5) External Deployment. The term \"External Deployment\" means the use or distribu"
        + "tion of the Original Work or Derivative Works in any way such that the Original "
        + "Work or Derivative Works may be accessed or used by anyone other than You, wheth"
        + "er the Original Work or Derivative Works are distributed to those persons, made "
        + "available as an application intended for use over a computer network, or used to"
        + " provide services or otherwise deliver content to anyone other than You. As an e"
        + "xpress condition for the grants of license hereunder, You agree that any Externa"
        + "l Deployment by You shall be deemed a distribution and shall be licensed to all "
        + "under the terms of this License, as prescribed in section 1(c) herein.\n"
        + "\n"
        + "6) Warranty and Disclaimer of Warranty. LICENSOR WARRANTS THAT THE COPYRIGHT IN "
        + "AND TO THE ORIGINAL WORK IS OWNED BY THE LICENSOR OR THAT THE ORIGINAL WORK IS D"
        + "ISTRIBUTED BY LICENSOR UNDER A VALID CURRENT LICENSE FROM THE COPYRIGHT OWNER. E"
        + "XCEPT AS EXPRESSLY STATED IN THE IMMEDIATELY PRECEEDING SENTENCE, THE ORIGINAL W"
        + "ORK IS PROVIDED UNDER THIS LICENSE ON AN \"AS IS\" BASIS, WITHOUT WARRANTY, EITHER"
        + " EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, THE WARRANTY OF NON-INFRINGE"
        + "MENT AND WARRANTIES THAT THE ORIGINAL WORK IS MERCHANTABLE OR FIT FOR A PARTICUL"
        + "AR PURPOSE. THE ENTIRE RISK AS TO THE QUALITY OF THE ORIGINAL WORK IS WITH YOU. "
        + "THIS DISCLAIMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO LI"
        + "CENSE TO ORIGINAL WORK IS GRANTED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "7) Limitation of Liability. UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WH"
        + "ETHER TORT (INCLUDING NEGLIGENCE), CONTRACT, OR OTHERWISE, SHALL THE LICENSOR BE"
        + " LIABLE TO ANY PERSON FOR ANY DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUE"
        + "NTIAL DAMAGES OF ANY CHARACTER ARISING AS A RESULT OF THIS LICENSE OR THE USE OF"
        + " THE ORIGINAL WORK INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF GOODWILL, "
        + "WORK STOPPAGE, COMPUTER FAILURE OR MALFUNCTION, OR ANY AND ALL OTHER COMMERCIAL "
        + "DAMAGES OR LOSSES, EVEN IF SUCH PERSON SHALL HAVE BEEN INFORMED OF THE POSSIBILI"
        + "TY OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY SHALL NOT APPLY TO LIABILITY FO"
        + "R DEATH OR PERSONAL INJURY RESULTING FROM SUCH PARTY'S NEGLIGENCE TO THE EXTENT "
        + "APPLICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISDICTIONS DO NOT ALLOW THE EX"
        + "CLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THIS EXCLUSION "
        + "AND LIMITATION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "8) Acceptance and Termination. Nothing else but this License (or another written"
        + " agreement between Licensor and You) grants You permission to create Derivative "
        + "Works based upon the Original Work, and any attempt to do so except under the te"
        + "rms of this License (or another written agreement between Licensor and You) is e"
        + "xpressly prohibited by U.S. copyright law, the equivalent laws of other countrie"
        + "s, and by international treaty. Therefore, by exercising any of the rights grant"
        + "ed to You in Sections 1 and 2 herein, You indicate Your acceptance of this Licen"
        + "se and all of its terms and conditions. This license shall terminate immediately"
        + " and you may no longer exercise any of the rights granted to You by this License"
        + " upon Your failure to honor the proviso in Section 1(c) herein.\n"
        + "\n"
        + "9) Mutual Termination for Patent Action. This License shall terminate automatica"
        + "lly and You may no longer exercise any of the rights granted to You by this Lice"
        + "nse if You file a lawsuit in any court alleging that any OSI Certified open sour"
        + "ce software that is licensed under any license containing this \"Mutual Terminati"
        + "on for Patent Action\" clause infringes any patent claims that are essential to u"
        + "se that software.\n"
        + "\n"
        + "10) Jurisdiction, Venue and Governing Law. You agree that any lawsuit arising un"
        + "der or relating to this License shall be maintained in the courts of the jurisdi"
        + "ction wherein the Licensor resides or in which Licensor conducts its primary bus"
        + "iness, and under the laws of that jurisdiction excluding its conflict-of-law pro"
        + "visions. The application of the United Nations Convention on Contracts for the I"
        + "nternational Sale of Goods is expressly excluded. Any use of the Original Work o"
        + "utside the scope of this License or after its termination shall be subject to th"
        + "e requirements and penalties of the U.S. Copyright Act, 17 U.S.C. § 101 et seq.,"
        + " the equivalent laws of other countries, and international treaty. This section "
        + "shall survive the termination of this License.\n"
        + "\n"
        + "11) Attorneys Fees. In any action to enforce the terms of this License or seekin"
        + "g damages relating thereto, the prevailing party shall be entitled to recover it"
        + "s costs and expenses, including, without limitation, reasonable attorneys' fees "
        + "and costs incurred in connection with such action, including any appeal of such "
        + "action. This section shall survive the termination of this License.\n"
        + "\n"
        + "12) Miscellaneous. This License represents the complete agreement concerning the"
        + " subject matter hereof. If any provision of this License is held to be unenforce"
        + "able, such provision shall be reformed only to the extent necessary to make it e"
        + "nforceable.\n"
        + "\n"
        + "13) Definition of \"You\" in This License. \"You\" throughout this License, whether "
        + "in upper or lower case, means an individual or a legal entity exercising rights "
        + "under, and complying with all of the terms of, this License. For legal entities,"
        + " \"You\" includes any entity that controls, is controlled by, or is under common c"
        + "ontrol with you. For purposes of this definition, \"control\" means (i) the power,"
        + " direct or indirect, to cause the direction or management of such entity, whethe"
        + "r by contract or otherwise, or (ii) ownership of fifty percent (50%) or more of "
        + "the outstanding shares, or (iii) beneficial ownership of such entity.\n"
        + "\n"
        + "This license is Copyright (C) 2002 Lawrence E. Rosen. All rights reserved. Permi"
        + "ssion is hereby granted to copy and distribute this license without modification"
        + ". This license may not be modified without the express written permission of its"
        + " copyright owner.\n"
; // the license text
    }
 
    
}
