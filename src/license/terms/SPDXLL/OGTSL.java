package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:02Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: OGTSL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OGTSL extends License{
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
        return "OGTSL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open Group Test Suite License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The Open Group Test Suite License\n"
        + "\n"
        + "Preamble\n"
        + "\n"
        + "The intent of this document is to state the conditions under which a Package may"
        + " be copied, such that the Copyright Holder maintains some semblance of artistic "
        + "control over the development of the package, while giving the users of the packa"
        + "ge the right to use and distribute the Package in a more-or-less customary fashi"
        + "on, plus the right to make reasonable modifications.\n"
        + "\n"
        + "Testing is essential for proper development and maintenance of standards-based p"
        + "roducts.\n"
        + "\n"
        + "For buyers: adequate conformance testing leads to reduced integration costs and "
        + "protection of investments in applications, software and people.\n"
        + "\n"
        + "For software developers: conformance testing of platforms and middleware greatly"
        + " reduces the cost of developing and maintaining multi-platform application softw"
        + "are.\n"
        + "\n"
        + "For suppliers: In-depth testing increases customer satisfaction and keeps develo"
        + "pment and support costs in check. API conformance is highly measurable and suppl"
        + "iers who claim it must be able to substantiate that claim.\n"
        + "\n"
        + "As such, since these are benchmark measures of conformance, we feel the integrit"
        + "y of test tools is of importance. In order to preserve the integrity of the exis"
        + "ting conformance modes of this test package and to permit recipients of modified"
        + " versions of this package to run the original test modes, this license requires "
        + "that the original test modes be preserved.\n"
        + "\n"
        + "If you find a bug in one of the standards mode test cases, please let us know so"
        + " we can feed this back into the original, and also raise any specification issue"
        + "s with the appropriate bodies (for example the POSIX committees).\n"
        + "\n"
        + "Definitions: \n"
        + "\n"
        + "     \"Package\" refers to the collection of files distributed by the Copyright Ho"
        + "lder, and derivatives of that collection of files created through textual modifi"
        + "cation. \n"
        + "\n"
        + "     \"Standard Version\" refers to such a Package if it has not been modified, or"
        + " has been modified in accordance with the wishes of the Copyright Holder. \n"
        + "\n"
        + "     \"Copyright Holder\" is whoever is named in the copyright or copyrights for t"
        + "he package. \n"
        + "\n"
        + "     \"You\" is you, if you're thinking about copying or distributing this Package"
        + ". \n"
        + "\n"
        + "     \"Reasonable copying fee\" is whatever you can justify on the basis of media "
        + "cost, duplication charges, time of people involved, and so on. (You will not be "
        + "required to justify it to the Copyright Holder, but only to the computing commun"
        + "ity at large as a market that must bear the fee.) \n"
        + "\n"
        + "     \"Freely Available\" means that no fee is charged for the item itself, though"
        + " there may be fees involved in handling the item. It also means that recipients "
        + "of the item may redistribute it under the same conditions they received it. \n"
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
        + "ged that file, and provided that you do at least the following:\n"
        + "\n"
        + "     rename any non-standard executables and testcases so the names do not confl"
        + "ict with standard executables and testcases, which must also be provided, and pr"
        + "ovide a separate manual page for each non-standard executable and testcase that "
        + "clearly documents how it differs from the Standard Version.\n"
        + "\n"
        + "4. You may distribute the programs of this Package in object code or executable "
        + "form, provided that you do at least the following: \n"
        + "\n"
        + "     accompany any non-standard executables and testcases with their correspondi"
        + "ng Standard Version executables and testcases, giving the non-standard executabl"
        + "es and testcases non-standard names, and clearly documenting the differences in "
        + "manual pages (or equivalent), together with instructions on where to get the Sta"
        + "ndard Version.\n"
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
        + "7.Subroutines supplied by you and linked into this Package shall not be consider"
        + "ed part of this Package. \n"
        + "\n"
        + "8. The name of the Copyright Holder may not be used to endorse or promote produc"
        + "ts derived from this software without specific prior written permission.\n"
        + "\n"
        + "9. THIS PACKAGE IS PROVIDED \"AS IS\" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIE"
        + "S, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND "
        + "FITNESS FOR A PARTICULAR PURPOSE.\n"
        + "\n"
        + "The End\n"
; // the license text
    }
 
    
}
