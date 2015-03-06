package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:10Z
 * LicenseName: AGPL-3.0+
 * FileName: OSL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OSL_1_1 extends License{
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
        return "OSL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open Software License 1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Open Software License v. 1.1\n"
        + "\n"
        + "This Open Software License (the \"License\") applies to any original work of autho"
        + "rship (the \"Original Work\") whose owner (the \"Licensor\") has placed the followin"
        + "g notice immediately following the copyright notice for the Original Work:\n"
        + "\n"
        + "     Licensed under the Open Software License version 1.1 \n"
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
        + "tion describing how to modify the Original Work. Licensor hereby agrees to provi"
        + "de a machine-readable copy of the Source Code of the Original Work along with ea"
        + "ch copy of the Original Work that Licensor distributes. Licensor reserves the ri"
        + "ght to satisfy this obligation by placing a machine-readable copy of the Source "
        + "Code in an information repository reasonably calculated to permit inexpensive an"
        + "d convenient access by You for as long as Licensor continues to distribute the O"
        + "riginal Work, and by publishing the address of that information repository in a "
        + "notice immediately following the copyright notice that applies to the Original W"
        + "ork. \n"
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
        + "Work or Derivative Works may be used by anyone other than You, whether the Origi"
        + "nal Work or Derivative Works are distributed to those persons or made available "
        + "as an application intended for use over a computer network. As an express condit"
        + "ion for the grants of license hereunder, You agree that any External Deployment "
        + "by You of a Derivative Work shall be deemed a distribution and shall be licensed"
        + " to all under the terms of this License, as prescribed in section 1(c) herein.\n"
        + "\n"
        + "6) Attribution Rights. You must retain, in the Source Code of any Derivative Wor"
        + "ks that You create, all copyright, patent or trademark notices from the Source C"
        + "ode of the Original Work, as well as any notices of licensing and any descriptiv"
        + "e text identified therein as an \"Attribution Notice.\" You must cause the Source "
        + "Code for any Derivative Works that You create to carry a prominent Attribution N"
        + "otice reasonably calculated to inform recipients that You have modified the Orig"
        + "inal Work.\n"
        + "\n"
        + "7) Warranty and Disclaimer of Warranty. Licensor warrants that the copyright in "
        + "and to the Original Work is owned by the Licensor or that the Original Work is d"
        + "istributed by Licensor under a valid current license from the copyright owner. E"
        + "xcept as expressly stated in the immediately proceeding sentence, the Original W"
        + "ork is provided under this License on an \"AS IS\" BASIS and WITHOUT WARRANTY, eit"
        + "her express or implied, including, without limitation, the warranties of NON-INF"
        + "RINGEMENT, MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. THE ENTIRE RISK "
        + "AS TO THE QUALITY OF THE ORIGINAL WORK IS WITH YOU. This DISCLAIMER OF WARRANTY "
        + "constitutes an essential part of this License. No license to Original Work is gr"
        + "anted hereunder except under this disclaimer.\n"
        + "\n"
        + "8) Limitation of Liability. Under no circumstances and under no legal theory, wh"
        + "ether in tort (including negligence), contract, or otherwise, shall the Licensor"
        + " be liable to any person for any direct, indirect, special, incidental, or conse"
        + "quential damages of any character arising as a result of this License or the use"
        + " of the Original Work including, without limitation, damages for loss of goodwil"
        + "l, work stoppage, computer failure or malfunction, or any and all other commerci"
        + "al damages or losses. This limitation of liability shall not apply to liability "
        + "for death or personal injury resulting from Licensor's negligence to the extent "
        + "applicable law prohibits such limitation. Some jurisdictions do not allow the ex"
        + "clusion or limitation of incidental or consequential damages, so this exclusion "
        + "and limitation may not apply to You. \n"
        + "\n"
        + "9) Acceptance and Termination. If You distribute copies of the Original Work or "
        + "a Derivative Work, You must make a reasonable effort under the circumstances to "
        + "obtain the express and volitional assent of recipients to the terms of this Lice"
        + "nse. Nothing else but this License (or another written agreement between Licenso"
        + "r and You) grants You permission to create Derivative Works based upon the Origi"
        + "nal Work or to exercise any of the rights granted in Sections 1 herein, and any "
        + "attempt to do so except under the terms of this License (or another written agre"
        + "ement between Licensor and You) is expressly prohibited by U.S. copyright law, t"
        + "he equivalent laws of other countries, and by international treaty. Therefore, b"
        + "y exercising any of the rights granted to You in Sections 1 herein, You indicate"
        + " Your acceptance of this License and all of its terms and conditions. This Licen"
        + "se shall terminate immediately and you may no longer exercise any of the rights "
        + "granted to You by this License upon Your failure to honor the proviso in Section"
        + " 1(c) herein.\n"
        + "\n"
        + "10) Mutual Termination for Patent Action. This License shall terminate automatic"
        + "ally and You may no longer exercise any of the rights granted to You by this Lic"
        + "ense if You file a lawsuit in any court alleging that any OSI Certified open sou"
        + "rce software that is licensed under any license containing this \"Mutual Terminat"
        + "ion for Patent Action\" clause infringes any patent claims that are essential to "
        + "use that software.\n"
        + "\n"
        + "11) Jurisdiction, Venue and Governing Law. Any action or suit relating to this L"
        + "icense may be brought only in the courts of a jurisdiction wherein the Licensor "
        + "resides or in which Licensor conducts its primary business, and under the laws o"
        + "f that jurisdiction excluding its conflict-of-law provisions. The application of"
        + " the United Nations Convention on Contracts for the International Sale of Goods "
        + "is expressly excluded. Any use of the Original Work outside the scope of this Li"
        + "cense or after its termination shall be subject to the requirements and penaltie"
        + "s of the U.S. Copyright Act, 17 U.S.C. å¤ 101 et seq., the equivalent laws of ot"
        + "her countries, and international treaty. This section shall survive the terminat"
        + "ion of this License.\n"
        + "\n"
        + "12) Attorneys Fees. In any action to enforce the terms of this License or seekin"
        + "g damages relating thereto, the prevailing party shall be entitled to recover it"
        + "s costs and expenses, including, without limitation, reasonable attorneys' fees "
        + "and costs incurred in connection with such action, including any appeal of such "
        + "action. This section shall survive the termination of this License.\n"
        + "\n"
        + "13) Miscellaneous. This License represents the complete agreement concerning the"
        + " subject matter hereof. If any provision of this License is held to be unenforce"
        + "able, such provision shall be reformed only to the extent necessary to make it e"
        + "nforceable.\n"
        + "\n"
        + "14) Definition of \"You\" in This License. \"You\" throughout this License, whether "
        + "in upper or lower case, means an individual or a legal entity exercising rights "
        + "under, and complying with all of the terms of, this License. For legal entities,"
        + " \"You\" includes any entity that controls, is controlled by, or is under common c"
        + "ontrol with you. For purposes of this definition, \"control\" means (i) the power,"
        + " direct or indirect, to cause the direction or management of such entity, whethe"
        + "r by contract or otherwise, or (ii) ownership of fifty percent (50%) or more of "
        + "the outstanding shares, or (iii) beneficial ownership of such entity.\n"
        + "\n"
        + "15) Right to Use. You may use the Original Work in all ways not otherwise restri"
        + "cted or conditioned by this License or by law, and Licensor promises not to inte"
        + "rfere with or be responsible for such uses by You.\n"
        + "\n"
        + "This license is Copyright (C) 2002 Lawrence E. Rosen. All rights reserved. Permi"
        + "ssion is hereby granted to copy and distribute this license without modification"
        + ". This license may not be modified without the express written permission of its"
        + " copyright owner.\n"
; // the license text
    }
 
    
}
