package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:28:32Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: GPL_1_0_plus.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class GPL_1_0_plus extends License{
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
        return "GPL-1.0+"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "GNU General Public License v1.0 or later"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "                    GNU GENERAL PUBLIC LICENSE\n"
        + "                     Version 1, February 1989\n"
        + "\n"
        + " Copyright (C) 1989 Free Software Foundation, Inc.\n"
        + "                    51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA\n"
        + " Everyone is permitted to copy and distribute verbatim copies\n"
        + " of this license document, but changing it is not allowed.\n"
        + "\n"
        + "                            Preamble\n"
        + "\n"
        + "  The license agreements of most software companies try to keep users\n"
        + "at the mercy of those companies.  By contrast, our General Public\n"
        + "License is intended to guarantee your freedom to share and change free\n"
        + "software--to make sure the software is free for all its users.  The\n"
        + "General Public License applies to the Free Software Foundation's\n"
        + "software and to any other program whose authors commit to using it.\n"
        + "You can use it for your programs, too.\n"
        + "\n"
        + "  When we speak of free software, we are referring to freedom, not\n"
        + "price.  Specifically, the General Public License is designed to make\n"
        + "sure that you have the freedom to give away or sell copies of free\n"
        + "software, that you receive source code or can get it if you want it,\n"
        + "that you can change the software or use pieces of it in new free\n"
        + "programs; and that you know you can do these things.\n"
        + "\n"
        + "  To protect your rights, we need to make restrictions that forbid\n"
        + "anyone to deny you these rights or to ask you to surrender the rights.\n"
        + "These restrictions translate to certain responsibilities for you if you\n"
        + "distribute copies of the software, or if you modify it.\n"
        + "\n"
        + "  For example, if you distribute copies of a such a program, whether\n"
        + "gratis or for a fee, you must give the recipients all the rights that\n"
        + "you have.  You must make sure that they, too, receive or can get the\n"
        + "source code.  And you must tell them their rights.\n"
        + "\n"
        + "  We protect your rights with two steps: (1) copyright the software, and\n"
        + "(2) offer you this license which gives you legal permission to copy,\n"
        + "distribute and/or modify the software.\n"
        + "\n"
        + "  Also, for each author's protection and ours, we want to make certain\n"
        + "that everyone understands that there is no warranty for this free\n"
        + "software.  If the software is modified by someone else and passed on, we\n"
        + "want its recipients to know that what they have is not the original, so\n"
        + "that any problems introduced by others will not reflect on the original\n"
        + "authors' reputations.\n"
        + "\n"
        + "  The precise terms and conditions for copying, distribution and\n"
        + "modification follow.\n"
        + "\n"
        + "                    GNU GENERAL PUBLIC LICENSE\n"
        + "   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION\n"
        + "\n"
        + "  0. This License Agreement applies to any program or other work which\n"
        + "contains a notice placed by the copyright holder saying it may be\n"
        + "distributed under the terms of this General Public License.  The\n"
        + "\"Program\", below, refers to any such program or work, and a \"work based\n"
        + "on the Program\" means either the Program or any work containing the\n"
        + "Program or a portion of it, either verbatim or with modifications.  Each\n"
        + "licensee is addressed as \"you\".\n"
        + "\n"
        + "  1. You may copy and distribute verbatim copies of the Program's source\n"
        + "code as you receive it, in any medium, provided that you conspicuously and\n"
        + "appropriately publish on each copy an appropriate copyright notice and\n"
        + "disclaimer of warranty; keep intact all the notices that refer to this\n"
        + "General Public License and to the absence of any warranty; and give any\n"
        + "other recipients of the Program a copy of this General Public License\n"
        + "along with the Program.  You may charge a fee for the physical act of\n"
        + "transferring a copy.\n"
        + "\n"
        + "  2. You may modify your copy or copies of the Program or any portion of\n"
        + "it, and copy and distribute such modifications under the terms of Paragraph\n"
        + "1 above, provided that you also do the following:\n"
        + "\n"
        + "    a) cause the modified files to carry prominent notices stating that\n"
        + "    you changed the files and the date of any change; and\n"
        + "\n"
        + "    b) cause the whole of any work that you distribute or publish, that\n"
        + "    in whole or in part contains the Program or any part thereof, either\n"
        + "    with or without modifications, to be licensed at no charge to all\n"
        + "    third parties under the terms of this General Public License (except\n"
        + "    that you may choose to grant warranty protection to some or all\n"
        + "    third parties, at your option).\n"
        + "\n"
        + "    c) If the modified program normally reads commands interactively when\n"
        + "    run, you must cause it, when started running for such interactive use\n"
        + "    in the simplest and most usual way, to print or display an\n"
        + "    announcement including an appropriate copyright notice and a notice\n"
        + "    that there is no warranty (or else, saying that you provide a\n"
        + "    warranty) and that users may redistribute the program under these\n"
        + "    conditions, and telling the user how to view a copy of this General\n"
        + "    Public License.\n"
        + "\n"
        + "    d) You may charge a fee for the physical act of transferring a\n"
        + "    copy, and you may at your option offer warranty protection in\n"
        + "    exchange for a fee.\n"
        + "\n"
        + "Mere aggregation of another independent work with the Program (or its\n"
        + "derivative) on a volume of a storage or distribution medium does not bring\n"
        + "the other work under the scope of these terms.\n"
        + "\n"
        + "  3. You may copy and distribute the Program (or a portion or derivative of\n"
        + "it, under Paragraph 2) in object code or executable form under the terms of\n"
        + "Paragraphs 1 and 2 above provided that you also do one of the following:\n"
        + "\n"
        + "    a) accompany it with the complete corresponding machine-readable\n"
        + "    source code, which must be distributed under the terms of\n"
        + "    Paragraphs 1 and 2 above; or,\n"
        + "\n"
        + "    b) accompany it with a written offer, valid for at least three\n"
        + "    years, to give any third party free (except for a nominal charge\n"
        + "    for the cost of distribution) a complete machine-readable copy of the\n"
        + "    corresponding source code, to be distributed under the terms of\n"
        + "    Paragraphs 1 and 2 above; or,\n"
        + "\n"
        + "    c) accompany it with the information you received as to where the\n"
        + "    corresponding source code may be obtained.  (This alternative is\n"
        + "    allowed only for noncommercial distribution and only if you\n"
        + "    received the program in object code or executable form alone.)\n"
        + "\n"
        + "Source code for a work means the preferred form of the work for making\n"
        + "modifications to it.  For an executable file, complete source code means\n"
        + "all the source code for all modules it contains; but, as a special\n"
        + "exception, it need not include source code for modules which are standard\n"
        + "libraries that accompany the operating system on which the executable\n"
        + "file runs, or for standard header files or definitions files that\n"
        + "accompany that operating system.\n"
        + "\n"
        + "  4. You may not copy, modify, sublicense, distribute or transfer the\n"
        + "Program except as expressly provided under this General Public License.\n"
        + "Any attempt otherwise to copy, modify, sublicense, distribute or transfer\n"
        + "the Program is void, and will automatically terminate your rights to use\n"
        + "the Program under this License.  However, parties who have received\n"
        + "copies, or rights to use copies, from you under this General Public\n"
        + "License will not have their licenses terminated so long as such parties\n"
        + "remain in full compliance.\n"
        + "\n"
        + "  5. By copying, distributing or modifying the Program (or any work based\n"
        + "on the Program) you indicate your acceptance of this license to do so,\n"
        + "and all its terms and conditions.\n"
        + "\n"
        + "  6. Each time you redistribute the Program (or any work based on the\n"
        + "Program), the recipient automatically receives a license from the original\n"
        + "licensor to copy, distribute or modify the Program subject to these\n"
        + "terms and conditions.  You may not impose any further restrictions on the\n"
        + "recipients' exercise of the rights granted herein.\n"
        + "\n"
        + "  7. The Free Software Foundation may publish revised and/or new versions\n"
        + "of the General Public License from time to time.  Such new versions will\n"
        + "be similar in spirit to the present version, but may differ in detail to\n"
        + "address new problems or concerns.\n"
        + "\n"
        + "Each version is given a distinguishing version number.  If the Program\n"
        + "specifies a version number of the license which applies to it and \"any\n"
        + "later version\", you have the option of following the terms and conditions\n"
        + "either of that version or of any later version published by the Free\n"
        + "Software Foundation.  If the Program does not specify a version number of\n"
        + "the license, you may choose any version ever published by the Free Software\n"
        + "Foundation.\n"
        + "\n"
        + "  8. If you wish to incorporate parts of the Program into other free\n"
        + "programs whose distribution conditions are different, write to the author\n"
        + "to ask for permission.  For software which is copyrighted by the Free\n"
        + "Software Foundation, write to the Free Software Foundation; we sometimes\n"
        + "make exceptions for this.  Our decision will be guided by the two goals\n"
        + "of preserving the free status of all derivatives of our free software and\n"
        + "of promoting the sharing and reuse of software generally.\n"
        + "\n"
        + "                            NO WARRANTY\n"
        + "\n"
        + "  9. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO WARRANTY\n"
        + "FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE LAW.  EXCEPT WHEN\n"
        + "OTHERWISE STATED IN WRITING THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES\n"
        + "PROVIDE THE PROGRAM \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED\n"
        + "OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF\n"
        + "MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.  THE ENTIRE RISK AS\n"
        + "TO THE QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU.  SHOULD THE\n"
        + "PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECESSARY SERVICING,\n"
        + "REPAIR OR CORRECTION.\n"
        + "\n"
        + "  10. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING\n"
        + "WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR\n"
        + "REDISTRIBUTE THE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES,\n"
        + "INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING\n"
        + "OUT OF THE USE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED\n"
        + "TO LOSS OF DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY\n"
        + "YOU OR THIRD PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER\n"
        + "PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE\n"
        + "POSSIBILITY OF SUCH DAMAGES.\n"
        + "\n"
        + "                     END OF TERMS AND CONDITIONS\n"
        + "\n"
        + "        Appendix: How to Apply These Terms to Your New Programs\n"
        + "\n"
        + "  If you develop a new program, and you want it to be of the greatest\n"
        + "possible use to humanity, the best way to achieve this is to make it\n"
        + "free software which everyone can redistribute and change under these\n"
        + "terms.\n"
        + "\n"
        + "  To do so, attach the following notices to the program.  It is safest to\n"
        + "attach them to the start of each source file to most effectively convey\n"
        + "the exclusion of warranty; and each file should have at least the\n"
        + "\"copyright\" line and a pointer to where the full notice is found.\n"
        + "\n"
        + "    <one line to give the program's name and a brief idea of what it does.>\n"
        + "    Copyright (C) 19yy  <name of author>\n"
        + "\n"
        + "    This program is free software; you can redistribute it and/or modify\n"
        + "    it under the terms of the GNU General Public License as published by\n"
        + "    the Free Software Foundation; either version 1, or (at your option)\n"
        + "    any later version.\n"
        + "\n"
        + "    This program is distributed in the hope that it will be useful,\n"
        + "    but WITHOUT ANY WARRANTY; without even the implied warranty of\n"
        + "    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n"
        + "    GNU General Public License for more details.\n"
        + "\n"
        + "    You should have received a copy of the GNU General Public License\n"
        + "    along with this program; if not, write to the Free Software\n"
        + "    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.\n"
        + "\n"
        + "Also add information on how to contact you by electronic and paper mail.\n"
        + "\n"
        + "If the program is interactive, make it output a short notice like this\n"
        + "when it starts in an interactive mode:\n"
        + "\n"
        + "    Gnomovision version 69, Copyright (C) 19xx name of author\n"
        + "    Gnomovision comes with ABSOLUTELY NO WARRANTY; for details type `show w'.\n"
        + "    This is free software, and you are welcome to redistribute it\n"
        + "    under certain conditions; type `show c' for details.\n"
        + "\n"
        + "The hypothetical commands `show w' and `show c' should show the\n"
        + "appropriate parts of the General Public License.  Of course, the\n"
        + "commands you use may be called something other than `show w' and `show\n"
        + "c'; they could even be mouse-clicks or menu items--whatever suits your\n"
        + "program.\n"
        + "\n"
        + "You should also get your employer (if you work as a programmer) or your\n"
        + "school, if any, to sign a \"copyright disclaimer\" for the program, if\n"
        + "necessary.  Here a sample; alter the names:\n"
        + "\n"
        + "  Yoyodyne, Inc., hereby disclaims all copyright interest in the\n"
        + "  program `Gnomovision' (a program to direct compilers to make passes\n"
        + "  at assemblers) written by James Hacker.\n"
        + "\n"
        + "  <signature of Ty Coon>, 1 April 1989\n"
        + "  Ty Coon, President of Vice\n"
        + "\n"
        + "That's all there is to it!\n"
; // the license text
    }
 
    
}
