package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:46Z
 * LicenseName: AGPL-3.0+
 * FileName: CDDL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class CDDL_1_0 extends License{
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
        return "CDDL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Common Development and Distribution License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL)\n"
        + "\n"
        + "Version 1.0\n"
        + "\n"
        + "1. Definitions.\n"
        + "\n"
        + "1.1. “Contributor” means each individual or entity that creates or contributes t"
        + "o the creation of Modifications.\n"
        + "\n"
        + "1.2. “Contributor Version” means the combination of the Original Software, prior"
        + " Modifications used by a Contributor (if any), and the Modifications made by tha"
        + "t particular Contributor.\n"
        + "\n"
        + "1.3. “Covered Software” means (a) the Original Software, or (b) Modifications, o"
        + "r (c) the combination of files containing Original Software with files containin"
        + "g Modifications, in each case including portions thereof.\n"
        + "\n"
        + "1.4. “Executable” means the Covered Software in any form other than Source Code.\n"
        + "\n"
        + "1.5. “Initial Developer” means the individual or entity that first makes Origina"
        + "l Software available under this License.\n"
        + "\n"
        + "1.6. “Larger Work” means a work which combines Covered Software or portions ther"
        + "eof with code not governed by the terms of this License.\n"
        + "\n"
        + "1.7. “License” means this document.\n"
        + "\n"
        + "1.8. “Licensable” means having the right to grant, to the maximum extent possibl"
        + "e, whether at the time of the initial grant or subsequently acquired, any and al"
        + "l of the rights conveyed herein.\n"
        + "\n"
        + "1.9. “Modifications” means the Source Code and Executable form of any of the fol"
        + "lowing:\n"
        + "\n"
        + "A. Any file that results from an addition to, deletion from or modification of t"
        + "he contents of a file containing Original Software or previous Modifications;\n"
        + "\n"
        + "B. Any new file that contains any part of the Original Software or previous Modi"
        + "fication; or\n"
        + "\n"
        + "C. Any new file that is contributed or otherwise made available under the terms "
        + "of this License.\n"
        + "\n"
        + "1.10. “Original Software” means the Source Code and Executable form of computer "
        + "software code that is originally released under this License.\n"
        + "\n"
        + "1.11. “Patent Claims” means any patent claim(s), now owned or hereafter acquired"
        + ", including without limitation, method, process, and apparatus claims, in any pa"
        + "tent Licensable by grantor.\n"
        + "\n"
        + "1.12. “Source Code” means (a) the common form of computer software code in which"
        + " modifications are made and (b) associated documentation included in or with suc"
        + "h code.\n"
        + "\n"
        + "1.13. “You” (or “Your”) means an individual or a legal entity exercising rights "
        + "under, and complying with all of the terms of, this License. For legal entities,"
        + " “You” includes any entity which controls, is controlled by, or is under common "
        + "control with You. For purposes of this definition, “control” means (a) the power"
        + ", direct or indirect, to cause the direction or management of such entity, wheth"
        + "er by contract or otherwise, or (b) ownership of more than fifty percent (50%) o"
        + "f the outstanding shares or beneficial ownership of such entity.\n"
        + "\n"
        + "2. License Grants.\n"
        + "\n"
        + "2.1. The Initial Developer Grant.\n"
        + "\n"
        + "Conditioned upon Your compliance with Section 3.1 below and subject to third par"
        + "ty intellectual property claims, the Initial Developer hereby grants You a world"
        + "-wide, royalty-free, non-exclusive license:\n"
        + "\n"
        + "(a) under intellectual property rights (other than patent or trademark) Licensab"
        + "le by Initial Developer, to use, reproduce, modify, display, perform, sublicense"
        + " and distribute the Original Software (or portions thereof), with or without Mod"
        + "ifications, and/or as part of a Larger Work; and\n"
        + "\n"
        + "(b) under Patent Claims infringed by the making, using or selling of Original So"
        + "ftware, to make, have made, use, practice, sell, and offer for sale, and/or othe"
        + "rwise dispose of the Original Software (or portions thereof).\n"
        + "\n"
        + "(c) The licenses granted in Sections 2.1(a) and (b) are effective on the date In"
        + "itial Developer first distributes or otherwise makes the Original Software avail"
        + "able to a third party under the terms of this License.\n"
        + "\n"
        + "(d) Notwithstanding Section 2.1(b) above, no patent license is granted: (1) for "
        + "code that You delete from the Original Software, or (2) for infringements caused"
        + " by: (i) the modification of the Original Software, or (ii) the combination of t"
        + "he Original Software with other software or devices.\n"
        + "\n"
        + "2.2. Contributor Grant.\n"
        + "\n"
        + "Conditioned upon Your compliance with Section 3.1 below and subject to third par"
        + "ty intellectual property claims, each Contributor hereby grants You a world-wide"
        + ", royalty-free, non-exclusive license:\n"
        + "\n"
        + "(a) under intellectual property rights (other than patent or trademark) Licensab"
        + "le by Contributor to use, reproduce, modify, display, perform, sublicense and di"
        + "stribute the Modifications created by such Contributor (or portions thereof), ei"
        + "ther on an unmodified basis, with other Modifications, as Covered Software and/o"
        + "r as part of a Larger Work; and\n"
        + "\n"
        + "(b) under Patent Claims infringed by the making, using, or selling of Modificati"
        + "ons made by that Contributor either alone and/or in combination with its Contrib"
        + "utor Version (or portions of such combination), to make, use, sell, offer for sa"
        + "le, have made, and/or otherwise dispose of: (1) Modifications made by that Contr"
        + "ibutor (or portions thereof); and (2) the combination of Modifications made by t"
        + "hat Contributor with its Contributor Version (or portions of such combination).\n"
        + "\n"
        + "(c) The licenses granted in Sections 2.2(a) and 2.2(b) are effective on the date"
        + " Contributor first distributes or otherwise makes the Modifications available to"
        + " a third party.\n"
        + "\n"
        + "(d) Notwithstanding Section 2.2(b) above, no patent license is granted: (1) for "
        + "any code that Contributor has deleted from the Contributor Version; (2) for infr"
        + "ingements caused by: (i) third party modifications of Contributor Version, or (i"
        + "i) the combination of Modifications made by that Contributor with other software"
        + " (except as part of the Contributor Version) or other devices; or (3) under Pate"
        + "nt Claims infringed by Covered Software in the absence of Modifications made by "
        + "that Contributor.\n"
        + "\n"
        + "3. Distribution Obligations.\n"
        + "\n"
        + "3.1. Availability of Source Code.\n"
        + "\n"
        + "Any Covered Software that You distribute or otherwise make available in Executab"
        + "le form must also be made available in Source Code form and that Source Code for"
        + "m must be distributed only under the terms of this License. You must include a c"
        + "opy of this License with every copy of the Source Code form of the Covered Softw"
        + "are You distribute or otherwise make available. You must inform recipients of an"
        + "y such Covered Software in Executable form as to how they can obtain such Covere"
        + "d Software in Source Code form in a reasonable manner on or through a medium cus"
        + "tomarily used for software exchange.\n"
        + "\n"
        + "3.2. Modifications.\n"
        + "\n"
        + "The Modifications that You create or to which You contribute are governed by the"
        + " terms of this License. You represent that You believe Your Modifications are Yo"
        + "ur original creation(s) and/or You have sufficient rights to grant the rights co"
        + "nveyed by this License.\n"
        + "\n"
        + "3.3. Required Notices.\n"
        + "\n"
        + "You must include a notice in each of Your Modifications that identifies You as t"
        + "he Contributor of the Modification. You may not remove or alter any copyright, p"
        + "atent or trademark notices contained within the Covered Software, or any notices"
        + " of licensing or any descriptive text giving attribution to any Contributor or t"
        + "he Initial Developer.\n"
        + "\n"
        + "3.4. Application of Additional Terms.\n"
        + "\n"
        + "You may not offer or impose any terms on any Covered Software in Source Code for"
        + "m that alters or restricts the applicable version of this License or the recipie"
        + "nts’ rights hereunder. You may choose to offer, and to charge a fee for, warrant"
        + "y, support, indemnity or liability obligations to one or more recipients of Cove"
        + "red Software. However, you may do so only on Your own behalf, and not on behalf "
        + "of the Initial Developer or any Contributor. You must make it absolutely clear t"
        + "hat any such warranty, support, indemnity or liability obligation is offered by "
        + "You alone, and You hereby agree to indemnify the Initial Developer and every Con"
        + "tributor for any liability incurred by the Initial Developer or such Contributor"
        + " as a result of warranty, support, indemnity or liability terms You offer.\n"
        + "\n"
        + "3.5. Distribution of Executable Versions.\n"
        + "\n"
        + "You may distribute the Executable form of the Covered Software under the terms o"
        + "f this License or under the terms of a license of Your choice, which may contain"
        + " terms different from this License, provided that You are in compliance with the"
        + " terms of this License and that the license for the Executable form does not att"
        + "empt to limit or alter the recipient’s rights in the Source Code form from the r"
        + "ights set forth in this License. If You distribute the Covered Software in Execu"
        + "table form under a different license, You must make it absolutely clear that any"
        + " terms which differ from this License are offered by You alone, not by the Initi"
        + "al Developer or Contributor. You hereby agree to indemnify the Initial Developer"
        + " and every Contributor for any liability incurred by the Initial Developer or su"
        + "ch Contributor as a result of any such terms You offer.\n"
        + "\n"
        + "3.6. Larger Works.\n"
        + "\n"
        + "You may create a Larger Work by combining Covered Software with other code not g"
        + "overned by the terms of this License and distribute the Larger Work as a single "
        + "product. In such a case, You must make sure the requirements of this License are"
        + " fulfilled for the Covered Software.\n"
        + "\n"
        + "4. Versions of the License.\n"
        + "\n"
        + "4.1. New Versions.\n"
        + "\n"
        + "Sun Microsystems, Inc. is the initial license steward and may publish revised an"
        + "d/or new versions of this License from time to time. Each version will be given "
        + "a distinguishing version number. Except as provided in Section 4.3, no one other"
        + " than the license steward has the right to modify this License.\n"
        + "\n"
        + "4.2. Effect of New Versions.\n"
        + "\n"
        + "You may always continue to use, distribute or otherwise make the Covered Softwar"
        + "e available under the terms of the version of the License under which You origin"
        + "ally received the Covered Software. If the Initial Developer includes a notice i"
        + "n the Original Software prohibiting it from being distributed or otherwise made "
        + "available under any subsequent version of the License, You must distribute and m"
        + "ake the Covered Software available under the terms of the version of the License"
        + " under which You originally received the Covered Software. Otherwise, You may al"
        + "so choose to use, distribute or otherwise make the Covered Software available un"
        + "der the terms of any subsequent version of the License published by the license "
        + "steward.\n"
        + "\n"
        + "4.3. Modified Versions.\n"
        + "\n"
        + "When You are an Initial Developer and You want to create a new license for Your "
        + "Original Software, You may create and use a modified version of this License if "
        + "You: (a) rename the license and remove any references to the name of the license"
        + " steward (except to note that the license differs from this License); and (b) ot"
        + "herwise make it clear that the license contains terms which differ from this Lic"
        + "ense.\n"
        + "\n"
        + "5. DISCLAIMER OF WARRANTY.\n"
        + "\n"
        + "COVERED SOFTWARE IS PROVIDED UNDER THIS LICENSE ON AN “AS IS” BASIS, WITHOUT WAR"
        + "RANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, W"
        + "ARRANTIES THAT THE COVERED SOFTWARE IS FREE OF DEFECTS, MERCHANTABLE, FIT FOR A "
        + "PARTICULAR PURPOSE OR NON-INFRINGING. THE ENTIRE RISK AS TO THE QUALITY AND PERF"
        + "ORMANCE OF THE COVERED SOFTWARE IS WITH YOU. SHOULD ANY COVERED SOFTWARE PROVE D"
        + "EFECTIVE IN ANY RESPECT, YOU (NOT THE INITIAL DEVELOPER OR ANY OTHER CONTRIBUTOR"
        + ") ASSUME THE COST OF ANY NECESSARY SERVICING, REPAIR OR CORRECTION. THIS DISCLAI"
        + "MER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY COV"
        + "ERED SOFTWARE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "6. TERMINATION.\n"
        + "\n"
        + "6.1. This License and the rights granted hereunder will terminate automatically "
        + "if You fail to comply with terms herein and fail to cure such breach within 30 d"
        + "ays of becoming aware of the breach. Provisions which, by their nature, must rem"
        + "ain in effect beyond the termination of this License shall survive.\n"
        + "\n"
        + "6.2. If You assert a patent infringement claim (excluding declaratory judgment a"
        + "ctions) against Initial Developer or a Contributor (the Initial Developer or Con"
        + "tributor against whom You assert such claim is referred to as “Participant”) all"
        + "eging that the Participant Software (meaning the Contributor Version where the P"
        + "articipant is a Contributor or the Original Software where the Participant is th"
        + "e Initial Developer) directly or indirectly infringes any patent, then any and a"
        + "ll rights granted directly or indirectly to You by such Participant, the Initial"
        + " Developer (if the Initial Developer is not the Participant) and all Contributor"
        + "s under Sections 2.1 and/or 2.2 of this License shall, upon 60 days notice from "
        + "Participant terminate prospectively and automatically at the expiration of such "
        + "60 day notice period, unless if within such 60 day period You withdraw Your clai"
        + "m with respect to the Participant Software against such Participant either unila"
        + "terally or pursuant to a written agreement with Participant.\n"
        + "\n"
        + "6.3. In the event of termination under Sections 6.1 or 6.2 above, all end user l"
        + "icenses that have been validly granted by You or any distributor hereunder prior"
        + " to termination (excluding licenses granted to You by any distributor) shall sur"
        + "vive termination.\n"
        + "\n"
        + "7. LIMITATION OF LIABILITY.\n"
        + "\n"
        + "UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER TORT (INCLUDING NEGLIG"
        + "ENCE), CONTRACT, OR OTHERWISE, SHALL YOU, THE INITIAL DEVELOPER, ANY OTHER CONTR"
        + "IBUTOR, OR ANY DISTRIBUTOR OF COVERED SOFTWARE, OR ANY SUPPLIER OF ANY OF SUCH P"
        + "ARTIES, BE LIABLE TO ANY PERSON FOR ANY INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQ"
        + "UENTIAL DAMAGES OF ANY CHARACTER INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOST"
        + " PROFITS, LOSS OF GOODWILL, WORK STOPPAGE, COMPUTER FAILURE OR MALFUNCTION, OR A"
        + "NY AND ALL OTHER COMMERCIAL DAMAGES OR LOSSES, EVEN IF SUCH PARTY SHALL HAVE BEE"
        + "N INFORMED OF THE POSSIBILITY OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY SHAL"
        + "L NOT APPLY TO LIABILITY FOR DEATH OR PERSONAL INJURY RESULTING FROM SUCH PARTY’"
        + "S NEGLIGENCE TO THE EXTENT APPLICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISD"
        + "ICTIONS DO NOT ALLOW THE EXCLUSION OR LIMITATION OF INCIDENTAL OR CONSEQUENTIAL "
        + "DAMAGES, SO THIS EXCLUSION AND LIMITATION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "8. U.S. GOVERNMENT END USERS.\n"
        + "\n"
        + "The Covered Software is a “commercial item,” as that term is defined in 48 C.F.R"
        + ". 2.101 (Oct. 1995), consisting of “commercial computer software” (as that term "
        + "is defined at 48 C.F.R. § 252.227-7014(a)(1)) and “commercial computer software "
        + "documentation” as such terms are used in 48 C.F.R. 12.212 (Sept. 1995). Consiste"
        + "nt with 48 C.F.R. 12.212 and 48 C.F.R. 227.7202-1 through 227.7202-4 (June 1995)"
        + ", all U.S. Government End Users acquire Covered Software with only those rights "
        + "set forth herein. This U.S. Government Rights clause is in lieu of, and supersed"
        + "es, any other FAR, DFAR, or other clause or provision that addresses Government "
        + "rights in computer software under this License.\n"
        + "\n"
        + "9. MISCELLANEOUS.\n"
        + "\n"
        + "This License represents the complete agreement concerning subject matter hereof."
        + " If any provision of this License is held to be unenforceable, such provision sh"
        + "all be reformed only to the extent necessary to make it enforceable. This Licens"
        + "e shall be governed by the law of the jurisdiction specified in a notice contain"
        + "ed within the Original Software (except to the extent applicable law, if any, pr"
        + "ovides otherwise), excluding such jurisdiction’s conflict-of-law provisions. Any"
        + " litigation relating to this License shall be subject to the jurisdiction of the"
        + " courts located in the jurisdiction and venue specified in a notice contained wi"
        + "thin the Original Software, with the losing party responsible for costs, includi"
        + "ng, without limitation, court costs and reasonable attorneys’ fees and expenses."
        + " The application of the United Nations Convention on Contracts for the Internati"
        + "onal Sale of Goods is expressly excluded. Any law or regulation which provides t"
        + "hat the language of a contract shall be construed against the drafter shall not "
        + "apply to this License. You agree that You alone are responsible for compliance w"
        + "ith the United States export administration regulations (and the export control "
        + "laws and regulation of any other countries) when You use, distribute or otherwis"
        + "e make available any Covered Software.\n"
        + "\n"
        + "10. RESPONSIBILITY FOR CLAIMS.\n"
        + "\n"
        + "As between Initial Developer and the Contributors, each party is responsible for"
        + " claims and damages arising, directly or indirectly, out of its utilization of r"
        + "ights under this License and You agree to work with Initial Developer and Contri"
        + "butors to distribute such responsibility on an equitable basis. Nothing herein i"
        + "s intended or shall be deemed to constitute any admission of liability.\n"
; // the license text
    }
 
    
}
