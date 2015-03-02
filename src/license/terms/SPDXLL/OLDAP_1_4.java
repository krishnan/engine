package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:04Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: OLDAP_1_4.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OLDAP_1_4 extends License{
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
        return "OLDAP-1.4"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open LDAP Public License v1.4"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The OpenLDAP Public License\n"
        + "Version 1.4, 18 January 1999 \n"
        + "\n"
        + "Copyright 1998-1999, The OpenLDAP Foundation. All Rights Reserved.\n"
        + "\n"
        + "Note: This license is derived from the \"Artistic License\" as distributed with th"
        + "e Perl Programming Language. As significant differences exist, the complete lice"
        + "nse should be read.\n"
        + "\n"
        + "PREAMBLE\n"
        + "\n"
        + "The intent of this document is to state the conditions under which a Package may"
        + " be copied, such that the Copyright Holder maintains some semblance of artistic "
        + "control over the development of the package, while giving the users of the packa"
        + "ge the right to use and distribute the Package in a more-or-less customary fashi"
        + "on, plus the right to make reasonable modifications.\n"
        + "\n"
        + "Definitions:\n"
        + "\n"
        + "     \"Package\" refers to the collection of files distributed by the Copyright Ho"
        + "lder, and derivatives of that collection of files created through textual modifi"
        + "cation.\n"
        + "\n"
        + "     \"Standard Version\" refers to such a Package if it has not been modified, or"
        + " has been modified in accordance with the wishes of the Copyright Holder.\n"
        + "\n"
        + "     \"Copyright Holder\" is whoever is named in the copyright or copyrights for t"
        + "he package.\n"
        + "\n"
        + "     \"You\" is you, if you're thinking about copying or distributing this Package"
        + ".\n"
        + "\n"
        + "     \"Reasonable copying fee\" is whatever you can justify on the basis of media "
        + "cost, duplication charges, time of people involved, and so on. (You will not be "
        + "required to justify it to the Copyright Holder, but only to the computing commun"
        + "ity at large as a market that must bear the fee.)\n"
        + "\n"
        + "     \"Freely Available\" means that no fee is charged for the item itself, though"
        + " there may be fees involved in handling the item. It also means that recipients "
        + "of the item may redistribute it under the same conditions they received it.\n"
        + "\n"
        + "1. You may make and give away verbatim copies of the source form of the Standard"
        + " Version of this Package without restriction, provided that you duplicate all of"
        + " the original copyright notices and associated disclaimers.\n"
        + "\n"
        + "2. You may apply bug fixes, portability fixes and other modifications derived fr"
        + "om the Public Domain or from the Copyright Holder. A Package modified in such a "
        + "way shall still be considered the Standard Version.\n"
        + "\n"
        + "3. You may otherwise modify your copy of this Package in any way, provided that "
        + "you insert a prominent notice in each changed file stating how and when you chan"
        + "ged that file, and provided that you do at least ONE of the following:\n"
        + "\n"
        + "     a) place your modifications in the Public Domain or otherwise make them Fre"
        + "ely Available, such as by posting said modifications to Usenet or an equivalent "
        + "medium, or placing the modifications on a major archive site such as uunet.uu.ne"
        + "t, or by allowing the Copyright Holder to include your modifications in the Stan"
        + "dard Version of the Package.\n"
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
        + "     c) accompany any non-standard executables with their corresponding Standard"
        + " Version executables, giving the non-standard executables non-standard names, an"
        + "d clearly documenting the differences in manual pages (or equivalent), together "
        + "with instructions on where to get the Standard Version.\n"
        + "\n"
        + "     d) make other distribution arrangements with the Copyright Holder.\n"
        + "\n"
        + "5. You may charge a reasonable copying fee for any distribution of this Package."
        + " You may charge any fee you choose for support of this Package. You may not char"
        + "ge a fee for this Package itself. However, you may distribute this Package in ag"
        + "gregate with other (possibly commercial) programs as part of a larger (possibly "
        + "commercial) software distribution provided that you do not advertise this Packag"
        + "e as a product of your own.\n"
        + "\n"
        + "6. The scripts and library files supplied as input to or produced as output from"
        + " the programs of this Package do not automatically fall under the copyright of t"
        + "his Package, but belong to whomever generated them, and may be sold commercially"
        + ", and may be aggregated with this Package.\n"
        + "\n"
        + "7. C subroutines supplied by you and linked into this Package in order to emulat"
        + "e subroutines and variables defined by this Package shall not be considered part"
        + " of this Package, but are the equivalent of input as in Paragraph 6, provided th"
        + "ese subroutines do not change the behavior of the Package in any way that would "
        + "cause it to fail the regression tests for the Package.\n"
        + "\n"
        + "8. Software supplied by you and linked with this Package in order to use subrout"
        + "ines and variables defined by this Package shall not be considered part of this "
        + "Package and do not automatically fall under the copyright of this Package. Execu"
        + "tables produced by linking your software with this Package may be used and redis"
        + "tributed without restriction and may be sold commercially so long as the primary"
        + " function of your software is different than the package itself.\n"
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