package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:51Z
 * LicenseName: AGPL-3.0+
 * FileName: Glide.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Glide extends License{
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
        return "Glide"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "3dfx Glide License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "3DFX GLIDE Source Code General Public License \n"
        + "\n"
        + "1. PREAMBLE\n"
        + "\n"
        + "This license is for software that provides a 3D graphics application program int"
        + "erface (API).The license is intended to offer terms similar to some standard Gen"
        + "eral Public Licenses designed to foster open standards and unrestricted accessib"
        + "ility to source code. Some of these licenses require that, as a condition of the"
        + " license of the software, any derivative works (that is, new software which is a"
        + " work containing the original program or a portion of it) must be available for "
        + "general use, without restriction other than for a minor transfer fee, and that t"
        + "he source code for such derivative works must likewise be made available. The on"
        + "ly restriction is that such derivative works must be subject to the same General"
        + " Public License terms as the original work. \n"
        + "\n"
        + "This 3dfx GLIDE Source Code General Public License differs from the standard lic"
        + "enses of this type in that it does not require the entire derivative work to be "
        + "made available under the terms of this license nor is the recipient required to "
        + "make available the source code for the entire derivative work. Rather, the licen"
        + "se is limited to only the identifiable portion of the derivative work that is de"
        + "rived from the licensed software. The precise terms and conditions for copying, "
        + "distribution and modification follow. \n"
        + "\n"
        + "2. DEFINITIONS\n"
        + "\n"
        + "     2.1 This License applies to any program (or other \"work\") which contains a "
        + "notice placed by the copyright holder saying it may be distributed under the ter"
        + "ms of this 3dfx GLIDE Source Code General Public License. \n"
        + "\n"
        + "     2.2 The term \"Program\" as used in this Agreement refers to 3DFX's GLIDE sou"
        + "rce code and object code and any Derivative Work.\n"
        + "\n"
        + "     2.3 \"Derivative Work\" means, for the purpose of the License, that portion o"
        + "f any work that contains the Program or the identifiable portion of a work that "
        + "is derived from the Program, either verbatim or with modifications and/or transl"
        + "ated into another language, and that performs 3D graphics API operations. It doe"
        + "s not include any other portions of a work.\n"
        + "\n"
        + "     2.4 \"Modifications of the Program\" means any work, which includes a Derivat"
        + "ive Work, and includes the whole of such work.\n"
        + "\n"
        + "     2.5 \"License\" means this 3dfx GLIDE Source Code General Public License.\n"
        + "\n"
        + "     2.6 The \"Source Code\" for a work means the preferred form of the work for m"
        + "aking modifications to it. For an executable work, complete source code means al"
        + "l the source code for all modules it contains, any associated interface definiti"
        + "on files, and the scripts used to control compilation and installation of the ex"
        + "ecutable work.\n"
        + "\n"
        + "     2.7 \"3dfx\" means 3dfx Interactive, Inc. \n"
        + "\n"
        + "3. LICENSED ACTIVITIES\n"
        + "\n"
        + "     3.1 COPYING - You may copy and distribute verbatim copies of the Program's "
        + "Source Code as you receive it, in any medium, subject to the provision of sectio"
        + "n 3.3 and provided also that:\n"
        + "\n"
        + "          (a) you conspicuously and appropriately publish on each copy an approp"
        + "riate copyright notice (3dfx Interactive, Inc. 1999), a notice that recipients w"
        + "ho wish to copy, distribute or modify the Program can only do so subject to this"
        + " License, and a disclaimer of warranty as set forth in section 5;\n"
        + "\n"
        + "          (b) keep intact all the notices that refer to this License and to the "
        + "absence of any warranty; and \n"
        + "\n"
        + "          (c) do not make any use of the GLIDE trademark without the prior writt"
        + "en permission of 3dfx, and \n"
        + "\n"
        + "          (d) give all recipients of the Program a copy of this License along wi"
        + "th the Program or instructions on how to easily receive a copy of this License. \n"
        + "\n"
        + "     3.2 MODIFICATION OF THE PROGRAM/DERIVATIVE WORKS - You may modify your copy"
        + " or copies of the Program or any portion of it, and copy and distribute such mod"
        + "ifications subject to the provisions of section 3.3 and provided that you also m"
        + "eet all of the following conditions: \n"
        + "\n"
        + "          (a) you conspicuously and appropriately publish on each copy of a Deri"
        + "vative Work an appropriate copyright notice, a notice that recipients who wish t"
        + "o copy, distribute or modify the Derivative Work can only do so subject to this "
        + "License, and a disclaimer of warranty as set forth in section 5;\n"
        + "\n"
        + "          (b) keep intact all the notices that refer to this License and to the "
        + "absence of any warranty; and (c) give all recipients of the Derivative Work a co"
        + "py of this License along with the Derivative Work or instructions on how to easi"
        + "ly receive a copy of this License.\n"
        + "\n"
        + "          (d) You must cause the modified files of the Derivative Work to carry "
        + "prominent notices stating that you changed the files and the date of any change."
        + " \n"
        + "\n"
        + "          (e) You must cause any Derivative Work that you distribute or publish "
        + "to be licensed at no charge to all third parties under the terms of this License"
        + ". \n"
        + "\n"
        + "          (f) You do not make any use of the GLIDE trademark without the prior w"
        + "ritten permission of 3dfx. \n"
        + "\n"
        + "          (g) If the Derivative Work normally reads commands interactively when "
        + "run, you must cause it, when started running for such interactive use, to print "
        + "or display an announcement as follows:\n"
        + "\n"
        + "          \"COPYRIGHT 3DFX INTERACTIVE, INC. 1999, ALL RIGHTS RESERVED THIS SOFTW"
        + "ARE IS FREE AND PROVIDED \"AS IS,\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED"
        + " OR IMPLIED. THERE IS NO RIGHT TO USE THE GLIDE TRADEMARK WITHOUT PRIOR WRITTEN "
        + "PERMISSION OF 3DFX INTERACTIVE, INC. SEE THE 3DFX GLIDE GENERAL PUBLIC LICENSE F"
        + "OR A FULL TEXT OF THE DISTRIBUTION AND NON-WARRANTY PROVISIONS (REQUEST COPY FRO"
        + "M INFO@3DFX.COM).\"\n"
        + "\n"
        + "          (h) The requirements of this section 3.2 do not apply to the modified "
        + "work as a whole but only to the Derivative Work. It is not the intent of this Li"
        + "cense to claim rights or contest your rights to work written entirely by you; ra"
        + "ther, the intent is to exercise the right to control the distribution of Derivat"
        + "ive Works. \n"
        + "\n"
        + "     3.3 DISTRIBUTION \n"
        + "\n"
        + "          (a) All copies of the Program or Derivative Works which are distribute"
        + "d must include in the file headers the following language verbatim:\n"
        + "\n"
        + "          \"THIS SOFTWARE IS SUBJECT TO COPYRIGHT PROTECTION AND IS OFFERED ONLY "
        + "PURSUANT TO THE 3DFX GLIDE GENERAL PUBLIC LICENSE. THERE IS NO RIGHT TO USE THE "
        + "GLIDE TRADEMARK WITHOUT PRIOR WRITTEN PERMISSION OF 3DFX INTERACTIVE, INC. A COP"
        + "Y OF THIS LICENSE MAY BE OBTAINED FROM THE DISTRIBUTOR OR BY CONTACTING 3DFX INT"
        + "ERACTIVE INC (info@3dfx.com). THIS PROGRAM. IS PROVIDED \"AS IS\" WITHOUT WARRANTY"
        + " OF ANY KIND, EITHER EXPRESSED OR IMPLIED. SEE THE 3DFX GLIDE GENERAL PUBLIC LIC"
        + "ENSE FOR A FULL TEXT OF THE NON-WARRANTY PROVISIONS.\n"
        + "\n"
        + "         USE, DUPLICATION OR DISCLOSURE BY THE GOVERNMENT IS SUBJECT TO RESTRICT"
        + "IONS AS SET FORTH IN SUBDIVISION (C)(1)(II) OF THE RIGHTS IN TECHNICAL DATA AND "
        + "COMPUTER SOFTWARE CLAUSE AT DFARS 252.227-7013, AND/OR IN SIMILAR OR SUCCESSOR C"
        + "LAUSES IN THE FAR, DOD OR NASA FAR SUPPLEMENT. UNPUBLISHED RIGHTS RESERVED UNDER"
        + " THE COPYRIGHT LAWS OF THE UNITED STATES.\n"
        + "\n"
        + "          COPYRIGHT 3DFX INTERACTIVE, INC. 1999, ALL RIGHTS RESERVED\"\n"
        + "\n"
        + "          (b) You may distribute the Program or a Derivative Work in object code"
        + " or executable form under the terms of Sections 3.1 and 3.2 provided that you al"
        + "so do one of the following: \n"
        + "\n"
        + "               (1) Accompany it with the complete corresponding machine-readable"
        + " source code, which must be distributed under the terms of Sections 3.1 and 3.2;"
        + " or, \n"
        + "               \n"
        + "               (2) Accompany it with a written offer, valid for at least three y"
        + "ears, to give any third party, for a charge no more than your cost of physically"
        + " performing source distribution, a complete machine-readable copy of the corresp"
        + "onding source code, to be distributed under the terms of Sections 3.1 and 3.2 on"
        + " a medium customarily used for software interchange; or, \n"
        + "\n"
        + "               (3) Accompany it with the information you received as to the offe"
        + "r to distribute corresponding source code. (This alternative is allowed only for"
        + " noncommercial distribution and only if you received the program in object code "
        + "or executable form with such an offer, in accord with Subsection 3.3(b)(2) above"
        + ".) \n"
        + "\n"
        + "          (c) The source code distributed need not include anything that is norm"
        + "ally distributed (in either source or binary form) with the major components (co"
        + "mpiler, kernel, and so on) of the operating system on which the executable runs,"
        + " unless that component itself accompanies the executable code. \n"
        + "\n"
        + "          (d) If distribution of executable code or object code is made by offer"
        + "ing access to copy from a designated place, then offering equivalent access to c"
        + "opy the source code from the same place counts as distribution of the source cod"
        + "e, even though third parties are not compelled to copy the source along with the"
        + " object code. \n"
        + "\n"
        + "          (e) Each time you redistribute the Program or any Derivative Work, the"
        + " recipient automatically receives a license from 3dfx and successor licensors to"
        + " copy, distribute or modify the Program and Derivative Works subject to the term"
        + "s and conditions of the License. You may not impose any further restrictions on "
        + "the recipients' exercise of the rights granted herein. You are not responsible f"
        + "or enforcing compliance by third parties to this License. \n"
        + "\n"
        + "          (f) You may not make any use of the GLIDE trademark without the prior "
        + "written permission of 3dfx.\n"
        + "\n"
        + "          (g) You may not copy, modify, sublicense, or distribute the Program or"
        + " any Derivative Works except as expressly provided under this License. Any attem"
        + "pt otherwise to copy, modify, sublicense or distribute the Program or any Deriva"
        + "tive Works is void, and will automatically terminate your rights under this Lice"
        + "nse. However, parties who have received copies, or rights, from you under this L"
        + "icense will not have their licenses terminated so long as such parties remain in"
        + " full compliance.\n"
        + "\n"
        + "4. MISCELLANEOUS\n"
        + "\n"
        + "     4.1 Acceptance of this License is voluntary. By using, modifying or distrib"
        + "uting the Program or any Derivative Work, you indicate your acceptance of this L"
        + "icense to do so, and all its terms and conditions for copying, distributing or m"
        + "odifying the Program or works based on it. Nothing else grants you permission to"
        + " modify or distribute the Program or Derivative Works and doing so without accep"
        + "tance of this License is in violation of the U.S. and international copyright la"
        + "ws.\n"
        + "\n"
        + "     4.2 If the distribution and/or use of the Program or Derivative Works is re"
        + "stricted in certain countries either by patents or by copyrighted interfaces, th"
        + "e original copyright holder who places the Program under this License may add an"
        + " explicit geographical distribution limitation excluding those countries, so tha"
        + "t distribution is permitted only in or among countries not thus excluded. In suc"
        + "h case, this License incorporates the limitation as if written in the body of th"
        + "is License.\n"
        + "\n"
        + "     4.3 This License is to be construed according to the laws of the State of C"
        + "alifornia and you consent to personal jurisdiction in the State of California in"
        + " the event it is necessary to enforce the provisions of this License. \n"
        + "\n"
        + "5. NO WARRANTIES\n"
        + "\n"
        + "     5.1 TO THE EXTENT PERMITTED BY APPLICABLE LAW, THERE IS NO WARRANTY FOR THE"
        + " PROGRAM. OR DERIVATIVE WORKS THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES PROVIDE"
        + " THE PROGRAM AND ANY DERIVATIVE WORKS\"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHE"
        + "R EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF"
        + " MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE ENTIRE RISK AS TO THE"
        + " QUALITY AND PERFORMANCE OF THE PROGRAM AND ANY DERIVATIVE WORK IS WITH YOU. SHO"
        + "ULD THE PROGRAM OR ANY DERIVATIVE WORK PROVE DEFECTIVE, YOU ASSUME THE COST OF A"
        + "LL NECESSARY SERVICING, REPAIR OR CORRECTION.\n"
        + "\n"
        + "     5.2 IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW WILL 3DFX INTERACTIVE, IN"
        + "C., OR ANY OTHER COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR REDI"
        + "STRIBUTE THE PROGRAM OR DERIVATIVE WORKS AS PERMITTED ABOVE, BE LIABLE TO YOU FO"
        + "R DAMAGES, INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES A"
        + "RISING OUT OF THE USE OR INABILITY TO USE THE PROGRAM OR DERIVATIVE WORKS (INCLU"
        + "DING BUT NOT LIMITED TO LOSS OF DATA OR DATA BEING RENDERED INACCURATE OR LOSSES"
        + " SUSTAINED BY YOU OR THIRD PARTIES OR A FAILURE OF THE PROGRAM OR DERIVATIVE WOR"
        + "KS TO OPERATE WITH ANY OTHER PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS B"
        + "EEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. \n"
; // the license text
    }
 
    
}
