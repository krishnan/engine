package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:57Z
 * LicenseName: AGPL-3.0+
 * FileName: AGPL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class AGPL_1_0 extends License{
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
        return "AGPL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Affero General Public License v1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "AFFERO GENERAL PUBLIC LICENSE\n"
        + "Version 1, March 2002  Copyright © 2002 Affero Inc. 510 Third Street - Suite 225"
        + ", San Francisco, CA 94107, USA\n"
        + "\n"
        + "This license is a modified version of the GNU General Public License copyright ("
        + "C) 1989, 1991 Free Software Foundation, Inc. made with their permission. Section"
        + " 2(d) has been added to cover use of software over a computer network.\n"
        + "\n"
        + "Everyone is permitted to copy and distribute verbatim copies of this license doc"
        + "ument, but changing it is not allowed.\n"
        + "\n"
        + "Preamble\n"
        + "\n"
        + "The licenses for most software are designed to take away your freedom to share a"
        + "nd change it. By contrast, the Affero General Public License is intended to guar"
        + "antee your freedom to share and change free software--to make sure the software "
        + "is free for all its users. This Public License applies to most of Affero's softw"
        + "are and to any other program whose authors commit to using it. (Some other Affer"
        + "o software is covered by the GNU Library General Public License instead.) You ca"
        + "n apply it to your programs, too.\n"
        + "\n"
        + "When we speak of free software, we are referring to freedom, not price. This Gen"
        + "eral Public License is designed to make sure that you have the freedom to distri"
        + "bute copies of free software (and charge for this service if you wish), that you"
        + " receive source code or can get it if you want it, that you can change the softw"
        + "are or use pieces of it in new free programs; and that you know you can do these"
        + " things.\n"
        + "\n"
        + "To protect your rights, we need to make restrictions that forbid anyone to deny "
        + "you these rights or to ask you to surrender the rights. These restrictions trans"
        + "late to certain responsibilities for you if you distribute copies of the softwar"
        + "e, or if you modify it.\n"
        + "\n"
        + "For example, if you distribute copies of such a program, whether gratis or for a"
        + " fee, you must give the recipients all the rights that you have. You must make s"
        + "ure that they, too, receive or can get the source code. And you must show them t"
        + "hese terms so they know their rights.\n"
        + "\n"
        + "We protect your rights with two steps: (1) copyright the software, and (2) offer"
        + " you this license which gives you legal permission to copy, distribute and/or mo"
        + "dify the software.\n"
        + "\n"
        + "Also, for each author's protection and ours, we want to make certain that everyo"
        + "ne understands that there is no warranty for this free software. If the software"
        + " is modified by someone else and passed on, we want its recipients to know that "
        + "what they have is not the original, so that any problems introduced by others wi"
        + "ll not reflect on the original authors' reputations.\n"
        + "\n"
        + "Finally, any free program is threatened constantly by software patents. We wish "
        + "to avoid the danger that redistributors of a free program will individually obta"
        + "in patent licenses, in effect making the program proprietary. To prevent this, w"
        + "e have made it clear that any patent must be licensed for everyone's free use or"
        + " not licensed at all.\n"
        + "\n"
        + "The precise terms and conditions for copying, distribution and modification foll"
        + "ow.\n"
        + "\n"
        + "TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION\n"
        + "\n"
        + "0. This License applies to any program or other work which contains a notice pla"
        + "ced by the copyright holder saying it may be distributed under the terms of this"
        + " Affero General Public License. The \"Program\", below, refers to any such program"
        + " or work, and a \"work based on the Program\" means either the Program or any deri"
        + "vative work under copyright law: that is to say, a work containing the Program o"
        + "r a portion of it, either verbatim or with modifications and/or translated into "
        + "another language. (Hereinafter, translation is included without limitation in th"
        + "e term \"modification\".) Each licensee is addressed as \"you\".\n"
        + "\n"
        + "Activities other than copying, distribution and modification are not covered by "
        + "this License; they are outside its scope. The act of running the Program is not "
        + "restricted, and the output from the Program is covered only if its contents cons"
        + "titute a work based on the Program (independent of having been made by running t"
        + "he Program). Whether that is true depends on what the Program does.\n"
        + "\n"
        + "1. You may copy and distribute verbatim copies of the Program's source code as y"
        + "ou receive it, in any medium, provided that you conspicuously and appropriately "
        + "publish on each copy an appropriate copyright notice and disclaimer of warranty;"
        + " keep intact all the notices that refer to this License and to the absence of an"
        + "y warranty; and give any other recipients of the Program a copy of this License "
        + "along with the Program.\n"
        + "\n"
        + "You may charge a fee for the physical act of transferring a copy, and you may at"
        + " your option offer warranty protection in exchange for a fee.\n"
        + "\n"
        + "2. You may modify your copy or copies of the Program or any portion of it, thus "
        + "forming a work based on the Program, and copy and distribute such modifications "
        + "or work under the terms of Section 1 above, provided that you also meet all of t"
        + "hese conditions: \n"
        + "     a) You must cause the modified files to carry prominent notices stating tha"
        + "t you changed the files and the date of any change. \n"
        + "     b) You must cause any work that you distribute or publish, that in whole or"
        + " in part contains or is derived from the Program or any part thereof, to be lice"
        + "nsed as a whole at no charge to all third parties under the terms of this Licens"
        + "e. \n"
        + "     c) If the modified program normally reads commands interactively when run, "
        + "you must cause it, when started running for such interactive use in the most ord"
        + "inary way, to print or display an announcement including an appropriate copyrigh"
        + "t notice and a notice that there is no warranty (or else, saying that you provid"
        + "e a warranty) and that users may redistribute the program under these conditions"
        + ", and telling the user how to view a copy of this License. (Exception: if the Pr"
        + "ogram itself is interactive but does not normally print such an announcement, yo"
        + "ur work based on the Program is not required to print an announcement.) \n"
        + "     d) If the Program as you received it is intended to interact with users thr"
        + "ough a computer network and if, in the version you received, any user interactin"
        + "g with the Program was given the opportunity to request transmission to that use"
        + "r of the Program's complete source code, you must not remove that facility from "
        + "your modified version of the Program or work based on the Program, and must offe"
        + "r an equivalent opportunity for all users interacting with your Program through "
        + "a computer network to request immediate transmission by HTTP of the complete sou"
        + "rce code of your modified version or other derivative work.\n"
        + "\n"
        + "These requirements apply to the modified work as a whole. If identifiable sectio"
        + "ns of that work are not derived from the Program, and can be reasonably consider"
        + "ed independent and separate works in themselves, then this License, and its term"
        + "s, do not apply to those sections when you distribute them as separate works. Bu"
        + "t when you distribute the same sections as part of a whole which is a work based"
        + " on the Program, the distribution of the whole must be on the terms of this Lice"
        + "nse, whose permissions for other licensees extend to the entire whole, and thus "
        + "to each and every part regardless of who wrote it.\n"
        + "\n"
        + "Thus, it is not the intent of this section to claim rights or contest your right"
        + "s to work written entirely by you; rather, the intent is to exercise the right t"
        + "o control the distribution of derivative or collective works based on the Progra"
        + "m.\n"
        + "\n"
        + "In addition, mere aggregation of another work not based on the Program with the "
        + "Program (or with a work based on the Program) on a volume of a storage or distri"
        + "bution medium does not bring the other work under the scope of this License.\n"
        + "\n"
        + "3. You may copy and distribute the Program (or a work based on it, under Section"
        + " 2) in object code or executable form under the terms of Sections 1 and 2 above "
        + "provided that you also do one of the following: \n"
        + "     a) Accompany it with the complete corresponding machine-readable source cod"
        + "e, which must be distributed under the terms of Sections 1 and 2 above on a medi"
        + "um customarily used for software interchange; or, \n"
        + "     b) Accompany it with a written offer, valid for at least three years, to gi"
        + "ve any third party, for a charge no more than your cost of physically performing"
        + " source distribution, a complete machine-readable copy of the corresponding sour"
        + "ce code, to be distributed under the terms of Sections 1 and 2 above on a medium"
        + " customarily used for software interchange; or, \n"
        + "     c) Accompany it with the information you received as to the offer to distri"
        + "bute corresponding source code. (This alternative is allowed only for noncommerc"
        + "ial distribution and only if you received the program in object code or executab"
        + "le form with such an offer, in accord with Subsection b above.)\n"
        + "\n"
        + "The source code for a work means the preferred form of the work for making modif"
        + "ications to it. For an executable work, complete source code means all the sourc"
        + "e code for all modules it contains, plus any associated interface definition fil"
        + "es, plus the scripts used to control compilation and installation of the executa"
        + "ble. However, as a special exception, the source code distributed need not inclu"
        + "de anything that is normally distributed (in either source or binary form) with "
        + "the major components (compiler, kernel, and so on) of the operating system on wh"
        + "ich the executable runs, unless that component itself accompanies the executable"
        + ".\n"
        + "\n"
        + "If distribution of executable or object code is made by offering access to copy "
        + "from a designated place, then offering equivalent access to copy the source code"
        + " from the same place counts as distribution of the source code, even though thir"
        + "d parties are not compelled to copy the source along with the object code.\n"
        + "\n"
        + "4. You may not copy, modify, sublicense, or distribute the Program except as exp"
        + "ressly provided under this License. Any attempt otherwise to copy, modify, subli"
        + "cense or distribute the Program is void, and will automatically terminate your r"
        + "ights under this License. However, parties who have received copies, or rights, "
        + "from you under this License will not have their licenses terminated so long as s"
        + "uch parties remain in full compliance.\n"
        + "\n"
        + "5. You are not required to accept this License, since you have not signed it. Ho"
        + "wever, nothing else grants you permission to modify or distribute the Program or"
        + " its derivative works. These actions are prohibited by law if you do not accept "
        + "this License. Therefore, by modifying or distributing the Program (or any work b"
        + "ased on the Program), you indicate your acceptance of this License to do so, and"
        + " all its terms and conditions for copying, distributing or modifying the Program"
        + " or works based on it.\n"
        + "\n"
        + "6. Each time you redistribute the Program (or any work based on the Program), th"
        + "e recipient automatically receives a license from the original licensor to copy,"
        + " distribute or modify the Program subject to these terms and conditions. You may"
        + " not impose any further restrictions on the recipients' exercise of the rights g"
        + "ranted herein. You are not responsible for enforcing compliance by third parties"
        + " to this License.\n"
        + "\n"
        + "7. If, as a consequence of a court judgment or allegation of patent infringement"
        + " or for any other reason (not limited to patent issues), conditions are imposed "
        + "on you (whether by court order, agreement or otherwise) that contradict the cond"
        + "itions of this License, they do not excuse you from the conditions of this Licen"
        + "se. If you cannot distribute so as to satisfy simultaneously your obligations un"
        + "der this License and any other pertinent obligations, then as a consequence you "
        + "may not distribute the Program at all. For example, if a patent license would no"
        + "t permit royalty-free redistribution of the Program by all those who receive cop"
        + "ies directly or indirectly through you, then the only way you could satisfy both"
        + " it and this License would be to refrain entirely from distribution of the Progr"
        + "am.\n"
        + "\n"
        + "If any portion of this section is held invalid or unenforceable under any partic"
        + "ular circumstance, the balance of the section is intended to apply and the secti"
        + "on as a whole is intended to apply in other circumstances.\n"
        + "\n"
        + "It is not the purpose of this section to induce you to infringe any patents or o"
        + "ther property right claims or to contest validity of any such claims; this secti"
        + "on has the sole purpose of protecting the integrity of the free software distrib"
        + "ution system, which is implemented by public license practices. Many people have"
        + " made generous contributions to the wide range of software distributed through t"
        + "hat system in reliance on consistent application of that system; it is up to the"
        + " author/donor to decide if he or she is willing to distribute software through a"
        + "ny other system and a licensee cannot impose that choice.\n"
        + "\n"
        + "This section is intended to make thoroughly clear what is believed to be a conse"
        + "quence of the rest of this License.\n"
        + "\n"
        + "8. If the distribution and/or use of the Program is restricted in certain countr"
        + "ies either by patents or by copyrighted interfaces, the original copyright holde"
        + "r who places the Program under this License may add an explicit geographical dis"
        + "tribution limitation excluding those countries, so that distribution is permitte"
        + "d only in or among countries not thus excluded. In such case, this License incor"
        + "porates the limitation as if written in the body of this License.\n"
        + "\n"
        + "9. Affero Inc. may publish revised and/or new versions of the Affero General Pub"
        + "lic License from time to time. Such new versions will be similar in spirit to th"
        + "e present version, but may differ in detail to address new problems or concerns.\n"
        + "\n"
        + "Each version is given a distinguishing version number. If the Program specifies "
        + "a version number of this License which applies to it and \"any later version\", yo"
        + "u have the option of following the terms and conditions either of that version o"
        + "r of any later version published by Affero, Inc. If the Program does not specify"
        + " a version number of this License, you may choose any version ever published by "
        + "Affero, Inc.\n"
        + "\n"
        + "You may also choose to redistribute modified versions of this program under any "
        + "version of the Free Software Foundation's GNU General Public License version 3 o"
        + "r higher, so long as that version of the GNU GPL includes terms and conditions s"
        + "ubstantially equivalent to those of this license.\n"
        + "\n"
        + "10. If you wish to incorporate parts of the Program into other free programs who"
        + "se distribution conditions are different, write to the author to ask for permiss"
        + "ion. For software which is copyrighted by Affero, Inc., write to us; we sometime"
        + "s make exceptions for this. Our decision will be guided by the two goals of pres"
        + "erving the free status of all derivatives of our free software and of promoting "
        + "the sharing and reuse of software generally.\n"
        + "\n"
        + "NO WARRANTY\n"
        + "\n"
        + "11. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO WARRANTY FOR THE"
        + " PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE LAW. EXCEPT WHEN OTHERWISE STATE"
        + "D IN WRITING THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES PROVIDE THE PROGRAM \"AS "
        + "IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NO"
        + "T LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTIC"
        + "ULAR PURPOSE. THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE PROGRAM I"
        + "S WITH YOU. SHOULD THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECES"
        + "SARY SERVICING, REPAIR OR CORRECTION.\n"
        + "\n"
        + "12. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING WILL A"
        + "NY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR REDISTRIBUTE THE P"
        + "ROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES, INCLUDING ANY GENERAL, "
        + "SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR INABILITY"
        + " TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF DATA OR DATA BEING REN"
        + "DERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD PARTIES OR A FAILURE OF THE"
        + " PROGRAM TO OPERATE WITH ANY OTHER PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY"
        + " HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.\n"
; // the license text
    }
 
    
}
