package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:23Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Ruby.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Ruby extends License{
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
        return "Ruby"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Ruby License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "1. You may make and give away verbatim copies of the source form of the software"
        + " without restriction, provided that you duplicate all of the original copyright "
        + "notices and associated disclaimers.\n"
        + "\n"
        + "2. You may modify your copy of the software in any way, provided that you do at "
        + "least ONE of the following:\n"
        + "\n"
        + "     a) place your modifications in the Public Domain or otherwise make them Fre"
        + "ely Available, such as by posting said modifications to Usenet or an equivalent "
        + "medium, or by allowing the author to include your modifications in the software.\n"
        + "\n"
        + "     b) use the modified software only within your corporation or organization.\n"
        + "\n"
        + "     c) give non-standard binaries non-standard names, with instructions on wher"
        + "e to get the original software distribution.\n"
        + "\n"
        + "     d) make other distribution arrangements with the author.\n"
        + "\n"
        + "3. You may distribute the software in object code or binary form, provided that "
        + "you do at least ONE of the following:\n"
        + "\n"
        + "     a) distribute the binaries and library files of the software, together with"
        + " instructions (in the manual page or equivalent) on where to get the original di"
        + "stribution.\n"
        + "\n"
        + "     b) accompany the distribution with the machine-readable source of the softw"
        + "are.\n"
        + "\n"
        + "     c) give non-standard binaries non-standard names, with instructions on wher"
        + "e to get the original software distribution.\n"
        + "\n"
        + "     d) make other distribution arrangements with the author.\n"
        + "\n"
        + "4. You may modify and include the part of the software into any other software ("
        + "possibly commercial). But some files in the distribution are not written by the "
        + "author, so that they are not under these terms.\n"
        + "\n"
        + "For the list of those files and their copying conditions, see the file LEGAL.\n"
        + "\n"
        + "5. The scripts and library files supplied as input to or produced as output from"
        + " the software do not automatically fall under the copyright of the software, but"
        + " belong to whomever generated them, and may be sold commercially, and may be agg"
        + "regated with this software.\n"
        + "\n"
        + "6. THIS SOFTWARE IS PROVIDED \"AS IS\" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTI"
        + "ES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND"
        + " FITNESS FOR A PARTICULAR PURPOSE.\n"
; // the license text
    }
 
    
}
