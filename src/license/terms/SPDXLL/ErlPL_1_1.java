package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:07Z
 * LicenseName: AGPL-3.0+
 * FileName: ErlPL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ErlPL_1_1 extends License{
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
        return "ErlPL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Erlang Public License v1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "ERLANG PUBLIC LICENSE Version 1.1\n"
        + "\n"
        + "1. Definitions.\n"
        + "\n"
        + "1.1. ``Contributor'' means each entity that creates or contributes to the creati"
        + "on of Modifications.\n"
        + "\n"
        + "1.2. ``Contributor Version'' means the combination of the Original Code, prior M"
        + "odifications used by a Contributor, and the Modifications made by that particula"
        + "r Contributor.\n"
        + "\n"
        + "1.3. ``Covered Code'' means the Original Code or Modifications or the combinatio"
        + "n of the Original Code and Modifications, in each case including portions thereo"
        + "f.\n"
        + "\n"
        + "1.4. ``Electronic Distribution Mechanism'' means a mechanism generally accepted "
        + "in the software development community for the electronic transfer of data.\n"
        + "\n"
        + "1.5. ``Executable'' means Covered Code in any form other than Source Code.\n"
        + "\n"
        + "1.6. ``Initial Developer'' means the individual or entity identified as the Init"
        + "ial Developer in the Source Code notice required by Exhibit A.\n"
        + "\n"
        + "1.7. ``Larger Work'' means a work which combines Covered Code or portions thereo"
        + "f with code not governed by the terms of this License.\n"
        + "\n"
        + "1.8. ``License'' means this document.\n"
        + "\n"
        + "1.9. ``Modifications'' means any addition to or deletion from the substance or s"
        + "tructure of either the Original Code or any previous Modifications. When Covered"
        + " Code is released as a series of files, a Modification is:\n"
        + "\n"
        + "     A. Any addition to or deletion from the contents of a file containing Origi"
        + "nal Code or previous Modifications. \n"
        + "\n"
        + "     B. Any new file that contains any part of the Original Code or previous Mod"
        + "ifications. \n"
        + "\n"
        + "1.10. ``Original Code'' means Source Code of computer software code which is des"
        + "cribed in the Source Code notice required by Exhibit A as Original Code, and whi"
        + "ch, at the time of its release under this License is not already Covered Code go"
        + "verned by this License.\n"
        + "\n"
        + "1.11. ``Source Code'' means the preferred form of the Covered Code for making mo"
        + "difications to it, including all modules it contains, plus any associated interf"
        + "ace definition files, scripts used to control compilation and installation of an"
        + " Executable, or a list of source code differential comparisons against either th"
        + "e Original Code or another well known, available Covered Code of the Contributor"
        + "'s choice. The Source Code can be in a compressed or archival form, provided the"
        + " appropriate decompression or de-archiving software is widely available for no c"
        + "harge.\n"
        + "\n"
        + "1.12. ``You'' means an individual or a legal entity exercising rights under, and"
        + " complying with all of the terms of, this License. For legal entities,``You'' in"
        + "cludes any entity which controls, is controlled by, or is under common control w"
        + "ith You. For purposes of this definition, ``control'' means (a) the power, direc"
        + "t or indirect, to cause the direction or management of such entity, whether by c"
        + "ontract or otherwise, or (b) ownership of fifty percent (50%) or more of the out"
        + "standing shares or beneficial ownership of such entity.\n"
        + "\n"
        + "2. Source Code License.\n"
        + "\n"
        + "2.1. The Initial Developer Grant. The Initial Developer hereby grants You a worl"
        + "d-wide, royalty-free, non-exclusive license, subject to third party intellectual"
        + " property claims:\n"
        + "\n"
        + "     (a) to use, reproduce, modify, display, perform, sublicense and distribute "
        + "the Original Code (or portions thereof) with or without Modifications, or as par"
        + "t of a Larger Work; and \n"
        + "\n"
        + "     (b) under patents now or hereafter owned or controlled by Initial Developer"
        + ", to make, have made, use and sell (``Utilize'') the Original Code (or portions "
        + "thereof), but solely to the extent that any such patent is reasonably necessary "
        + "to enable You to Utilize the Original Code (or portions thereof) and not to any "
        + "greater extent that may be necessary to Utilize further Modifications or combina"
        + "tions. \n"
        + "\n"
        + "2.2. Contributor Grant. Each Contributor hereby grants You a world-wide, royalty"
        + "-free, non-exclusive license, subject to third party intellectual property claim"
        + "s:\n"
        + "\n"
        + "     (a) to use, reproduce, modify, display, perform, sublicense and distribute "
        + "the Modifications created by such Contributor (or portions thereof) either on an"
        + " unmodified basis, with other Modifications, as Covered Code or as part of a Lar"
        + "ger Work; and \n"
        + "\n"
        + "     (b) under patents now or hereafter owned or controlled by Contributor, to U"
        + "tilize the Contributor Version (or portions thereof), but solely to the extent t"
        + "hat any such patent is reasonably necessary to enable You to Utilize the Contrib"
        + "utor Version (or portions thereof), and not to any greater extent that may be ne"
        + "cessary to Utilize further Modifications or combinations. \n"
        + "\n"
        + "3. Distribution Obligations.\n"
        + "\n"
        + "3.1. Application of License. The Modifications which You contribute are governed"
        + " by the terms of this License, including without limitation Section 2.2. The Sou"
        + "rce Code version of Covered Code may be distributed only under the terms of this"
        + " License, and You must include a copy of this License with every copy of the Sou"
        + "rce Code You distribute. You may not offer or impose any terms on any Source Cod"
        + "e version that alters or restricts the applicable version of this License or the"
        + " recipients' rights hereunder. However, You may include an additional document o"
        + "ffering the additional rights described in Section 3.5. \n"
        + "\n"
        + "3.2. Availability of Source Code. Any Modification which You contribute must be "
        + "made available in Source Code form under the terms of this License either on the"
        + " same media as an Executable version or via an accepted Electronic Distribution "
        + "Mechanism to anyone to whom you made an Executable version available; and if mad"
        + "e available via Electronic Distribution Mechanism, must remain available for at "
        + "least twelve (12) months after the date it initially became available, or at lea"
        + "st six (6) months after a subsequent version of that particular Modification has"
        + " been made available to such recipients. You are responsible for ensuring that t"
        + "he Source Code version remains available even if the Electronic Distribution Mec"
        + "hanism is maintained by a third party.\n"
        + "\n"
        + "3.3. Description of Modifications. You must cause all Covered Code to which you "
        + "contribute to contain a file documenting the changes You made to create that Cov"
        + "ered Code and the date of any change. You must include a prominent statement tha"
        + "t the Modification is derived, directly or indirectly, from Original Code provid"
        + "ed by the Initial Developer and including the name of the Initial Developer in ("
        + "a) the Source Code, and (b) in any notice in an Executable version or related do"
        + "cumentation in which You describe the origin or ownership of the Covered Code.\n"
        + "\n"
        + "3.4. Intellectual Property Matters\n"
        + "\n"
        + "     (a) Third Party Claims. If You have knowledge that a party claims an intell"
        + "ectual property right in particular functionality or code (or its utilization un"
        + "der this License), you must include a text file with the source code distributio"
        + "n titled ``LEGAL'' which describes the claim and the party making the claim in s"
        + "ufficient detail that a recipient will know whom to contact. If you obtain such "
        + "knowledge after You make Your Modification available as described in Section 3.2"
        + ", You shall promptly modify the LEGAL file in all copies You make available ther"
        + "eafter and shall take other steps (such as notifying appropriate mailing lists o"
        + "r newsgroups) reasonably calculated to inform those who received the Covered Cod"
        + "e that new knowledge has been obtained. \n"
        + "\n"
        + "     (b) Contributor APIs. If Your Modification is an application programming in"
        + "terface and You own or control patents which are reasonably necessary to impleme"
        + "nt that API, you must also include this information in the LEGAL file. \n"
        + "\n"
        + "3.5. Required Notices. You must duplicate the notice in Exhibit A in each file o"
        + "f the Source Code, and this License in any documentation for the Source Code, wh"
        + "ere You describe recipients' rights relating to Covered Code. If You created one"
        + " or more Modification(s), You may add your name as a Contributor to the notice d"
        + "escribed in Exhibit A. If it is not possible to put such notice in a particular "
        + "Source Code file due to its structure, then you must include such notice in a lo"
        + "cation (such as a relevant directory file) where a user would be likely to look "
        + "for such a notice. You may choose to offer, and to charge a fee for, warranty, s"
        + "upport, indemnity or liability obligations to one or more recipients of Covered "
        + "Code. However, You may do so only on Your own behalf, and not on behalf of the I"
        + "nitial Developer or any Contributor. You must make it absolutely clear than any "
        + "such warranty, support, indemnity or liability obligation is offered by You alon"
        + "e, and You hereby agree to indemnify the Initial Developer and every Contributor"
        + " for any liability incurred by the Initial Developer or such Contributor as a re"
        + "sult of warranty, support, indemnity or liability terms You offer.\n"
        + "\n"
        + "3.6. Distribution of Executable Versions. You may distribute Covered Code in Exe"
        + "cutable form only if the requirements of Section 3.1-3.5 have been met for that "
        + "Covered Code, and if You include a notice stating that the Source Code version o"
        + "f the Covered Code is available under the terms of this License, including a des"
        + "cription of how and where You have fulfilled the obligations of Section 3.2. The"
        + " notice must be conspicuously included in any notice in an Executable version, r"
        + "elated documentation or collateral in which You describe recipients' rights rela"
        + "ting to the Covered Code. You may distribute the Executable version of Covered C"
        + "ode under a license of Your choice, which may contain terms different from this "
        + "License, provided that You are in compliance with the terms of this License and "
        + "that the license for the Executable version does not attempt to limit or alter t"
        + "he recipient's rights in the Source Code version from the rights set forth in th"
        + "is License. If You distribute the Executable version under a different license Y"
        + "ou must make it absolutely clear that any terms which differ from this License a"
        + "re offered by You alone, not by the Initial Developer or any Contributor. You he"
        + "reby agree to indemnify the Initial Developer and every Contributor for any liab"
        + "ility incurred by the Initial Developer or such Contributor as a result of any s"
        + "uch terms You offer.\n"
        + "\n"
        + "3.7. Larger Works. You may create a Larger Work by combining Covered Code with o"
        + "ther code not governed by the terms of this License and distribute the Larger Wo"
        + "rk as a single product. In such a case, You must make sure the requirements of t"
        + "his License are fulfilled for the Covered Code.\n"
        + "\n"
        + "4. Inability to Comply Due to Statute or Regulation. If it is impossible for You"
        + " to comply with any of the terms of this License with respect to some or all of "
        + "the Covered Code due to statute or regulation then You must: (a) comply with the"
        + " terms of this License to the maximum extent possible; and (b) describe the limi"
        + "tations and the code they affect. Such description must be included in the LEGAL"
        + " file described in Section 3.4 and must be included with all distributions of th"
        + "e Source Code. Except to the extent prohibited by statute or regulation, such de"
        + "scription must be sufficiently detailed for a recipient of ordinary skill to be "
        + "able to understand it.\n"
        + "\n"
        + "5. Application of this License. \n"
        + "This License applies to code to which the Initial Developer has attached the not"
        + "ice in Exhibit A, and to related Covered Code.\n"
        + "\n"
        + "6. CONNECTION TO MOZILLA PUBLIC LICENSE\n"
        + "This Erlang License is a derivative work of the Mozilla Public License, Version "
        + "1.0. It contains terms which differ from the Mozilla Public License, Version 1.0"
        + ".\n"
        + "\n"
        + "7. DISCLAIMER OF WARRANTY.\n"
        + "COVERED CODE IS PROVIDED UNDER THIS LICENSE ON AN ``AS IS'' BASIS, WITHOUT WARRA"
        + "NTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WAR"
        + "RANTIES THAT THE COVERED CODE IS FREE OF DEFECTS, MERCHANTABLE, FIT FOR A PARTIC"
        + "ULAR PURPOSE OR NON-INFRINGING. THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANC"
        + "E OF THE COVERED CODE IS WITH YOU. SHOULD ANY COVERED CODE PROVE DEFECTIVE IN AN"
        + "Y RESPECT, YOU (NOT THE INITIAL DEVELOPER OR ANY OTHER CONTRIBUTOR) ASSUME THE C"
        + "OST OF ANY NECESSARY SERVICING, REPAIR OR CORRECTION. THIS DISCLAIMER OF WARRANT"
        + "Y CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE. NO USE OF ANY COVERED CODE IS A"
        + "UTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.\n"
        + "\n"
        + "8. TERMINATION. \n"
        + "This License and the rights granted hereunder will terminate automatically if Yo"
        + "u fail to comply with terms herein and fail to cure such breach within 30 days o"
        + "f becoming aware of the breach. All sublicenses to the Covered Code which are pr"
        + "operly granted shall survive any termination of this License. Provisions which, "
        + "by their nature, must remain in effect beyond the termination of this License sh"
        + "all survive.\n"
        + "\n"
        + "9. DISCLAIMER OF LIABILITY \n"
        + "Any utilization of Covered Code shall not cause the Initial Developer or any Con"
        + "tributor to be liable for any damages (neither direct nor indirect).\n"
        + "\n"
        + "10. MISCELLANEOUS \n"
        + "This License represents the complete agreement concerning the subject matter her"
        + "eof. If any provision is held to be unenforceable, such provision shall be refor"
        + "med only to the extent necessary to make it enforceable. This License shall be c"
        + "onstrued by and in accordance with the substantive laws of Sweden. Any dispute, "
        + "controversy or claim arising out of or relating to this License, or the breach, "
        + "termination or invalidity thereof, shall be subject to the exclusive jurisdictio"
        + "n of Swedish courts, with the Stockholm City Court as the first instance. \n"
        + "\n"
        + "EXHIBIT A.\n"
        + "\n"
        + "``The contents of this file are subject to the Erlang Public License, Version 1."
        + "1, (the \"License\"); you may not use this file except in compliance with the Lice"
        + "nse. You should have received a copy of the Erlang Public License along with thi"
        + "s software. If not, it can be retrieved via the world wide web at http://www.erl"
        + "ang.org/.\n"
        + "\n"
        + "Software distributed under the License is distributed on an \"AS IS\" basis, WITHO"
        + "UT WARRANTY OF ANY KIND, either express or implied. See the License for the spec"
        + "ific language governing rights and limitations under the License.\n"
        + "\n"
        + "The Initial Developer of the Original Code is Ericsson Utvecklings AB. Portions "
        + "created by Ericsson are Copyright 1999, Ericsson Utvecklings AB. All Rights Rese"
        + "rved.''\n"
; // the license text
    }
 
    
}
