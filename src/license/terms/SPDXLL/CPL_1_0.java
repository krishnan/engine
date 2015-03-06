package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:33Z
 * LicenseName: AGPL-3.0+
 * FileName: CPL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CPL_1_0 extends License{
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
        return "CPL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Common Public License 1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Common Public License Version 1.0\n"
        + "\n"
        + "THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS COMMON PUBLIC LICEN"
        + "SE (\"AGREEMENT\"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUT"
        + "ES RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.\n"
        + "\n"
        + "1. DEFINITIONS\n"
        + "\n"
        + "\"Contribution\" means:\n"
        + "\n"
        + "     a) in the case of the initial Contributor, the initial code and documentati"
        + "on distributed under this Agreement, and\n"
        + "\n"
        + "     b) in the case of each subsequent Contributor:\n"
        + "\n"
        + "          i) changes to the Program, and\n"
        + "\n"
        + "          ii) additions to the Program;\n"
        + "\n"
        + "where such changes and/or additions to the Program originate from and are distri"
        + "buted by that particular Contributor. A Contribution 'originates' from a Contrib"
        + "utor if it was added to the Program by such Contributor itself or anyone acting "
        + "on such Contributor's behalf. Contributions do not include additions to the Prog"
        + "ram which: (i) are separate modules of software distributed in conjunction with "
        + "the Program under their own license agreement, and (ii) are not derivative works"
        + " of the Program.\n"
        + "\n"
        + "\"Contributor\" means any person or entity that distributes the Program.\n"
        + "\n"
        + "\"Licensed Patents \" mean patent claims licensable by a Contributor which are nec"
        + "essarily infringed by the use or sale of its Contribution alone or when combined"
        + " with the Program.\n"
        + "\n"
        + "\"Program\" means the Contributions distributed in accordance with this Agreement.\n"
        + "\n"
        + "\"Recipient\" means anyone who receives the Program under this Agreement, includin"
        + "g all Contributors.\n"
        + "\n"
        + "2. GRANT OF RIGHTS\n"
        + "\n"
        + "     a) Subject to the terms of this Agreement, each Contributor hereby grants R"
        + "ecipient a non-exclusive, worldwide, royalty-free copyright license to reproduce"
        + ", prepare derivative works of, publicly display, publicly perform, distribute an"
        + "d sublicense the Contribution of such Contributor, if any, and such derivative w"
        + "orks, in source code and object code form.\n"
        + "\n"
        + "     b) Subject to the terms of this Agreement, each Contributor hereby grants R"
        + "ecipient a non-exclusive, worldwide, royalty-free patent license under Licensed "
        + "Patents to make, use, sell, offer to sell, import and otherwise transfer the Con"
        + "tribution of such Contributor, if any, in source code and object code form. This"
        + " patent license shall apply to the combination of the Contribution and the Progr"
        + "am if, at the time the Contribution is added by the Contributor, such addition o"
        + "f the Contribution causes such combination to be covered by the Licensed Patents"
        + ". The patent license shall not apply to any other combinations which include the"
        + " Contribution. No hardware per se is licensed hereunder.\n"
        + "\n"
        + "     c) Recipient understands that although each Contributor grants the licenses"
        + " to its Contributions set forth herein, no assurances are provided by any Contri"
        + "butor that the Program does not infringe the patent or other intellectual proper"
        + "ty rights of any other entity. Each Contributor disclaims any liability to Recip"
        + "ient for claims brought by any other entity based on infringement of intellectua"
        + "l property rights or otherwise. As a condition to exercising the rights and lice"
        + "nses granted hereunder, each Recipient hereby assumes sole responsibility to sec"
        + "ure any other intellectual property rights needed, if any. For example, if a thi"
        + "rd party patent license is required to allow Recipient to distribute the Program"
        + ", it is Recipient's responsibility to acquire that license before distributing t"
        + "he Program.\n"
        + "\n"
        + "     d) Each Contributor represents that to its knowledge it has sufficient copy"
        + "right rights in its Contribution, if any, to grant the copyright license set for"
        + "th in this Agreement.\n"
        + "\n"
        + "3. REQUIREMENTS\n"
        + "\n"
        + "A Contributor may choose to distribute the Program in object code form under its"
        + " own license agreement, provided that:\n"
        + "\n"
        + "     a) it complies with the terms and conditions of this Agreement; and\n"
        + "\n"
        + "     b) its license agreement:\n"
        + "\n"
        + "          i) effectively disclaims on behalf of all Contributors all warranties "
        + "and conditions, express and implied, including warranties or conditions of title"
        + " and non-infringement, and implied warranties or conditions of merchantability a"
        + "nd fitness for a particular purpose;\n"
        + "\n"
        + "          ii) effectively excludes on behalf of all Contributors all liability f"
        + "or damages, including direct, indirect, special, incidental and consequential da"
        + "mages, such as lost profits;\n"
        + "\n"
        + "          iii) states that any provisions which differ from this Agreement are o"
        + "ffered by that Contributor alone and not by any other party; and\n"
        + "\n"
        + "          iv) states that source code for the Program is available from such Con"
        + "tributor, and informs licensees how to obtain it in a reasonable manner on or th"
        + "rough a medium customarily used for software exchange.\n"
        + "\n"
        + "When the Program is made available in source code form:\n"
        + "\n"
        + "     a) it must be made available under this Agreement; and\n"
        + "\n"
        + "     b) a copy of this Agreement must be included with each copy of the Program.\n"
        + "\n"
        + "Contributors may not remove or alter any copyright notices contained within the "
        + "Program.\n"
        + "\n"
        + "Each Contributor must identify itself as the originator of its Contribution, if "
        + "any, in a manner that reasonably allows subsequent Recipients to identify the or"
        + "iginator of the Contribution.\n"
        + "\n"
        + "4. COMMERCIAL DISTRIBUTION\n"
        + "\n"
        + "Commercial distributors of software may accept certain responsibilities with res"
        + "pect to end users, business partners and the like. While this license is intende"
        + "d to facilitate the commercial use of the Program, the Contributor who includes "
        + "the Program in a commercial product offering should do so in a manner which does"
        + " not create potential liability for other Contributors. Therefore, if a Contribu"
        + "tor includes the Program in a commercial product offering, such Contributor (\"Co"
        + "mmercial Contributor\") hereby agrees to defend and indemnify every other Contrib"
        + "utor (\"Indemnified Contributor\") against any losses, damages and costs (collecti"
        + "vely \"Losses\") arising from claims, lawsuits and other legal actions brought by "
        + "a third party against the Indemnified Contributor to the extent caused by the ac"
        + "ts or omissions of such Commercial Contributor in connection with its distributi"
        + "on of the Program in a commercial product offering. The obligations in this sect"
        + "ion do not apply to any claims or Losses relating to any actual or alleged intel"
        + "lectual property infringement. In order to qualify, an Indemnified Contributor m"
        + "ust: a) promptly notify the Commercial Contributor in writing of such claim, and"
        + " b) allow the Commercial Contributor to control, and cooperate with the Commerci"
        + "al Contributor in, the defense and any related settlement negotiations. The Inde"
        + "mnified Contributor may participate in any such claim at its own expense.\n"
        + "\n"
        + "For example, a Contributor might include the Program in a commercial product off"
        + "ering, Product X. That Contributor is then a Commercial Contributor. If that Com"
        + "mercial Contributor then makes performance claims, or offers warranties related "
        + "to Product X, those performance claims and warranties are such Commercial Contri"
        + "butor's responsibility alone. Under this section, the Commercial Contributor wou"
        + "ld have to defend claims against the other Contributors related to those perform"
        + "ance claims and warranties, and if a court requires any other Contributor to pay"
        + " any damages as a result, the Commercial Contributor must pay those damages.\n"
        + "\n"
        + "5. NO WARRANTY\n"
        + "\n"
        + "EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED ON AN \""
        + "AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER EXPRESS OR IM"
        + "PLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR CONDITIONS OF TITLE, NON-"
        + "INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Each Recipien"
        + "t is solely responsible for determining the appropriateness of using and distrib"
        + "uting the Program and assumes all risks associated with its exercise of rights u"
        + "nder this Agreement, including but not limited to the risks and costs of program"
        + " errors, compliance with applicable laws, damage to or loss of data, programs or"
        + " equipment, and unavailability or interruption of operations.\n"
        + "\n"
        + "6. DISCLAIMER OF LIABILITY\n"
        + "\n"
        + "EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY CONTR"
        + "IBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, "
        + "EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION LOST PROFITS),"
        + " HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIAB"
        + "ILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE"
        + " USE OR DISTRIBUTION OF THE PROGRAM OR THE EXERCISE OF ANY RIGHTS GRANTED HEREUN"
        + "DER, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.\n"
        + "\n"
        + "7. GENERAL\n"
        + "\n"
        + "If any provision of this Agreement is invalid or unenforceable under applicable "
        + "law, it shall not affect the validity or enforceability of the remainder of the "
        + "terms of this Agreement, and without further action by the parties hereto, such "
        + "provision shall be reformed to the minimum extent necessary to make such provisi"
        + "on valid and enforceable.\n"
        + "\n"
        + "If Recipient institutes patent litigation against a Contributor with respect to "
        + "a patent applicable to software (including a cross-claim or counterclaim in a la"
        + "wsuit), then any patent licenses granted by that Contributor to such Recipient u"
        + "nder this Agreement shall terminate as of the date such litigation is filed. In "
        + "addition, if Recipient institutes patent litigation against any entity (includin"
        + "g a cross-claim or counterclaim in a lawsuit) alleging that the Program itself ("
        + "excluding combinations of the Program with other software or hardware) infringes"
        + " such Recipient's patent(s), then such Recipient's rights granted under Section "
        + "2(b) shall terminate as of the date such litigation is filed.\n"
        + "\n"
        + "All Recipient's rights under this Agreement shall terminate if it fails to compl"
        + "y with any of the material terms or conditions of this Agreement and does not cu"
        + "re such failure in a reasonable period of time after becoming aware of such nonc"
        + "ompliance. If all Recipient's rights under this Agreement terminate, Recipient a"
        + "grees to cease use and distribution of the Program as soon as reasonably practic"
        + "able. However, Recipient's obligations under this Agreement and any licenses gra"
        + "nted by Recipient relating to the Program shall continue and survive.\n"
        + "\n"
        + "Everyone is permitted to copy and distribute copies of this Agreement, but in or"
        + "der to avoid inconsistency the Agreement is copyrighted and may only be modified"
        + " in the following manner. The Agreement Steward reserves the right to publish ne"
        + "w versions (including revisions) of this Agreement from time to time. No one oth"
        + "er than the Agreement Steward has the right to modify this Agreement. IBM is the"
        + " initial Agreement Steward. IBM may assign the responsibility to serve as the Ag"
        + "reement Steward to a suitable separate entity. Each new version of the Agreement"
        + " will be given a distinguishing version number. The Program (including Contribut"
        + "ions) may always be distributed subject to the version of the Agreement under wh"
        + "ich it was received. In addition, after a new version of the Agreement is publis"
        + "hed, Contributor may elect to distribute the Program (including its Contribution"
        + "s) under the new version. Except as expressly stated in Sections 2(a) and 2(b) a"
        + "bove, Recipient receives no rights or licenses to the intellectual property of a"
        + "ny Contributor under this Agreement, whether expressly, by implication, estoppel"
        + " or otherwise. All rights in the Program not expressly granted under this Agreem"
        + "ent are reserved.\n"
        + "\n"
        + "This Agreement is governed by the laws of the State of New York and the intellec"
        + "tual property laws of the United States of America. No party to this Agreement w"
        + "ill bring a legal action under this Agreement more than one year after the cause"
        + " of action arose. Each party waives its rights to a jury trial in any resulting "
        + "litigation.\n"
; // the license text
    }
 
    
}
