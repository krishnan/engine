package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:15Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: BSD_Protection.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class BSD_Protection extends License{
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
        return "BSD-Protection"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "BSD Protection License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "BSD Protection License \n"
        + "February 2002\n"
        + "\n"
        + "Preamble \n"
        + "--------\n"
        + "\n"
        + "The Berkeley Software Distribution (\"BSD\") license has proven very effective ove"
        + "r the years at allowing for a wide spread of work throughout both commercial and"
        + " non-commercial products. For programmers whose primary intention is to improve "
        + "the general quality of available software, it is arguable that there is no bette"
        + "r license than the BSD license, as it permits improvements to be used wherever t"
        + "hey will help, without idealogical or metallic constraint.\n"
        + "\n"
        + "This is of particular value to those who produce reference implementations of pr"
        + "oposed standards: The case of TCP/IP clearly illustrates that freely and univers"
        + "ally available implementations leads the rapid acceptance of standards -- often "
        + "even being used instead of a de jure standard (eg, OSI network models).\n"
        + "\n"
        + "With the rapid proliferation of software licensed under the GNU General Public L"
        + "icense, however, the continued success of this role is called into question. Giv"
        + "en that the inclusion of a few lines of \"GPL-tainted\" work into a larger body of"
        + " work will result in restricted distribution -- and given that further work will"
        + " likely build upon the \"tainted\" portions, making them difficult to remove at a "
        + "future date -- there are inevitable circumstances where authors would, in order "
        + "to protect their goal of providing for the widespread usage of their work, wish "
        + "to guard against such \"GPL-taint\".\n"
        + "\n"
        + "In addition, one can imagine that companies which operate by producing and selli"
        + "ng (possibly closed-source) code would wish to protect themselves against the ri"
        + "se of a GPL-licensed competitor. While under existing licenses this would mean n"
        + "ot releasing their code under any form of open license, if a license existed und"
        + "er which they could incorporate any improvements back into their own (commercial"
        + ") products then they might be far more willing to provide for non-closed distrib"
        + "ution.\n"
        + "\n"
        + "For the above reasons, we put forth this \"BSD Protection License\": A license des"
        + "igned to retain the freedom granted by the BSD license to use licensed works in "
        + "a wide variety of settings, both non-commercial and commercial, while protecting"
        + " the work from having future contributors restrict that freedom.\n"
        + "\n"
        + "The precise terms and conditions for copying, distribution, and modification fol"
        + "low.\n"
        + "\n"
        + "BSD PROTECTION LICENSE TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION, AND MODIF"
        + "ICATION \n"
        + "----------------------------------------------------------------\n"
        + "\n"
        + "0. Definitions. \n"
        + "     a) \"Program\", below, refers to any program or work distributed under the te"
        + "rms of this license. \n"
        + "     b) A \"work based on the Program\", below, refers to either the Program or an"
        + "y derivative work under copyright law. \n"
        + "     c) \"Modification\", below, refers to the act of creating derivative works. \n"
        + "     d) \"You\", below, refers to each licensee.\n"
        + "\n"
        + "1. Scope. \n"
        + "This license governs the copying, distribution, and modification of the Program."
        + " Other activities are outside the scope of this license; The act of running the "
        + "Program is not restricted, and the output from the Program is covered only if it"
        + "s contents constitute a work based on the Program.\n"
        + "\n"
        + "2. Verbatim copies. \n"
        + "You may copy and distribute verbatim copies of the Program as you receive it, in"
        + " any medium, provided that you conspicuously and appropriately publish on each c"
        + "opy an appropriate copyright notice; keep intact all the notices that refer to t"
        + "his License and to the absence of any warranty; and give any other recipients of"
        + " the Program a copy of this License along with the Program.\n"
        + "\n"
        + "3. Modification and redistribution under closed license. \n"
        + "You may modify your copy or copies of the Program, and distribute the resulting "
        + "derivative works, provided that you meet the following conditions: \n"
        + "     a) The copyright notice and disclaimer on the Program must be reproduced an"
        + "d included in the source code, documentation, and/or other materials provided in"
        + " a manner in which such notices are normally distributed. \n"
        + "     b) The derivative work must be clearly identified as such, in order that it"
        + " may not be confused with the original work. \n"
        + "     c) The license under which the derivative work is distributed must expressl"
        + "y prohibit the distribution of further derivative works.\n"
        + "\n"
        + "4. Modification and redistribution under open license. \n"
        + "You may modify your copy or copies of the Program, and distribute the resulting "
        + "derivative works, provided that you meet the following conditions: \n"
        + "     a) The copyright notice and disclaimer on the Program must be reproduced an"
        + "d included in the source code, documentation, and/or other materials provided in"
        + " a manner in which such notices are normally distributed. \n"
        + "     b) You must clearly indicate the nature and date of any changes made to the"
        + " Program. The full details need not necessarily be included in the individual mo"
        + "dified files, provided that each modified file is clearly marked as such and ins"
        + "tructions are included on where the full details of the modifications may be fou"
        + "nd. \n"
        + "     c) You must cause any work that you distribute or publish, that in whole or"
        + " in part contains or is derived from the Program or any part thereof, to be lice"
        + "nsed as a whole at no charge to all third parties under the terms of this Licens"
        + "e.\n"
        + "\n"
        + "5. Implied acceptance. \n"
        + "You may not copy or distribute the Program or any derivative works except as exp"
        + "ressly provided under this license. Consequently, any such action will be taken "
        + "as implied acceptance of the terms of this license.\n"
        + "\n"
        + "6. NO WARRANTY. \n"
        + "THIS SOFTWARE IS PROVIDED \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDI"
        + "NG, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FO"
        + "R A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER, O"
        + "R ANY OTHER PARTY WHO MAY MODIFY AND/OR REDISTRIBUTE THE PROGRAM AS PERMITTED AB"
        + "OVE, BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONS"
        + "EQUENTIAL DAMAGES ARISING OUT OF THE USE OR INABILITY TO USE THE PROGRAM (INCLUD"
        + "ING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF US"
        + "E, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY "
        + "OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT, EVEN IF SUCH HOLDE"
        + "R OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.\n"
; // the license text
    }
 
    
}
