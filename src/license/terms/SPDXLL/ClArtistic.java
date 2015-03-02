package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:23Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: ClArtistic.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ClArtistic extends License{
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
        return "ClArtistic"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Clarified Artistic License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Clarified Artistic License\n"
        + "\n"
        + "Preamble\n"
        + "\n"
        + "The intent of this document is to state the conditions under which a Package may"
        + " be copied, such that the Copyright Holder maintains some semblance of artistic "
        + "control over the development of the package, while giving the users of the packa"
        + "ge the right to use and distribute the Package in a more-or-less customary fashi"
        + "on, plus the right to make reasonable modifications.\n"
        + "\n"
        + "Definitions:\n"
        + "\n"
        + " \"Package\" refers to the collection of files distributed by the Copyright Holder"
        + ", and derivatives of that collection of files created through textual modificati"
        + "on.\n"
        + "\n"
        + " \"Standard Version\" refers to such a Package if it has not been modified, or has"
        + " been modified in accordance with the wishes of the Copyright Holder as specifie"
        + "d below.\n"
        + "\n"
        + " \"Copyright Holder\" is whoever is named in the copyright or copyrights for the p"
        + "ackage.\n"
        + "\n"
        + " \"You\" is you, if you're thinking about copying or distributing this Package.\n"
        + "\n"
        + " \"Distribution fee\" is a fee you charge for providing a copy of this Package to "
        + "another party.\n"
        + "\n"
        + " \"Freely Available\" means that no fee is charged for the right to use the item, "
        + "though there may be fees involved in handling the item. It also means that recip"
        + "ients of the item may redistribute it under the same conditions they received it"
        + ".\n"
        + "\n"
        + "1. You may make and give away verbatim copies of the source form of the Standard"
        + " Version of this Package without restriction, provided that you duplicate all of"
        + " the original copyright notices and associated disclaimers.\n"
        + "\n"
        + "2. You may apply bug fixes, portability fixes and other modifications derived fr"
        + "om the Public Domain, or those made Freely Available, or from the Copyright Hold"
        + "er. A Package modified in such a way shall still be considered the Standard Vers"
        + "ion.\n"
        + "\n"
        + "3. You may otherwise modify your copy of this Package in any way, provided that "
        + "you insert a prominent notice in each changed file stating how and when you chan"
        + "ged that file, and provided that you do at least ONE of the following:\n"
        + "\n"
        + "     a) place your modifications in the Public Domain or otherwise make them Fre"
        + "ely Available, such as by posting said modifications to Usenet or an equivalent "
        + "medium, or placing the modifications on a major network archive site allowing un"
        + "restricted access to them, or by allowing the Copyright Holder to include your m"
        + "odifications in the Standard Version of the Package.\n"
        + "\n"
        + "     b) use the modified Package only within your corporation or organization.\n"
        + "\n"
        + "     c) rename any non-standard executables so the names do not conflict with st"
        + "andard executables, which must also be provided, and provide a separate manual p"
        + "age for each non-standard executable that clearly documents how it differs from "
        + "the Standard Version.\n"
        + "\n"
        + "     d) make other distribution arrangements with the Copyright Holder.\n"
        + "\n"
        + "     e) permit and encourge anyone who receives a copy of the modified Package p"
        + "ermission to make your modifications Freely Available in some specific way. \n"
        + "\n"
        + "4. You may distribute the programs of this Package in object code or executable "
        + "form, provided that you do at least ONE of the following:\n"
        + "\n"
        + "     a) distribute a Standard Version of the executables and library files, toge"
        + "ther with instructions (in the manual page or equivalent) on where to get the St"
        + "andard Version.\n"
        + "\n"
        + "     b) accompany the distribution with the machine-readable source of the Packa"
        + "ge with your modifications.\n"
        + "\n"
        + "     c) give non-standard executables non-standard names, and clearly document t"
        + "he differences in manual pages (or equivalent), together with instructions on wh"
        + "ere to get the Standard Version.\n"
        + "\n"
        + "     d) make other distribution arrangements with the Copyright Holder.\n"
        + "\n"
        + "     e) offer the machine-readable source of the Package, with your modification"
        + "s, by mail order.\n"
        + "\n"
        + "5. You may charge a distribution fee for any distribution of this Package. If yo"
        + "u offer support for this Package, you may charge any fee you choose for that sup"
        + "port. You may not charge a license fee for the right to use this Package itself."
        + " You may distribute this Package in aggregate with other (possibly commercial an"
        + "d possibly nonfree) programs as part of a larger (possibly commercial and possib"
        + "ly nonfree) software distribution, and charge license fees for other parts of th"
        + "at software distribution, provided that you do not advertise this Package as a p"
        + "roduct of your own. If the Package includes an interpreter, You may embed this P"
        + "ackage's interpreter within an executable of yours (by linking); this shall be c"
        + "onstrued as a mere form of aggregation, provided that the complete Standard Vers"
        + "ion of the interpreter is so embedded.\n"
        + "\n"
        + "6. The scripts and library files supplied as input to or produced as output from"
        + " the programs of this Package do not automatically fall under the copyright of t"
        + "his Package, but belong to whoever generated them, and may be sold commercially,"
        + " and may be aggregated with this Package. If such scripts or library files are a"
        + "ggregated with this Package via the so-called \"undump\" or \"unexec\" methods of pr"
        + "oducing a binary executable image, then distribution of such an image shall neit"
        + "her be construed as a distribution of this Package nor shall it fall under the r"
        + "estrictions of Paragraphs 3 and 4, provided that you do not represent such an ex"
        + "ecutable image as a Standard Version of this Package.\n"
        + "\n"
        + "7. C subroutines (or comparably compiled subroutines in other languages) supplie"
        + "d by you and linked into this Package in order to emulate subroutines and variab"
        + "les of the language defined by this Package shall not be considered part of this"
        + " Package, but are the equivalent of input as in Paragraph 6, provided these subr"
        + "outines do not change the language in any way that would cause it to fail the re"
        + "gression tests for the language.\n"
        + "\n"
        + "8. Aggregation of the Standard Version of the Package with a commercial distribu"
        + "tion is always permitted provided that the use of this Package is embedded; that"
        + " is, when no overt attempt is made to make this Package's interfaces visible to "
        + "the end user of the commercial distribution. Such use shall not be construed as "
        + "a distribution of this Package.\n"
        + "\n"
        + "9. The name of the Copyright Holder may not be used to endorse or promote produc"
        + "ts derived from this software without specific prior written permission.\n"
        + "\n"
        + "10. THIS PACKAGE IS PROVIDED \"AS IS\" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTI"
        + "ES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND"
        + " FITNESS FOR A PARTICULAR PURPOSE.\n"
        + "\n"
        + "The End\n"
; // the license text
    }
 
    
}
