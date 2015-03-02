package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:59Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: NTP.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NTP extends License{
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
        return "NTP"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "NTP License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "NTP License (NTP)\n"
        + "\n"
        + "Copyright (c) <<var;name=copyright;original=(CopyrightHoldersName) (From 4-digit"
        + "-year)-(To 4-digit-year);match=.+>>\n"
        + "\n"
        + "Permission to use, copy, modify, and distribute this software and its documentat"
        + "ion for any purpose with or without fee is hereby granted, provided that the abo"
        + "ve copyright notice appears in all copies and that both the copyright notice and"
        + " this permission notice appear in supporting documentation, and that the name <<"
        + "var;name=TMname;original=(TrademarkedName);match=.+>> not be used in advertising"
        + " or publicity pertaining to distribution of the software without specific, writt"
        + "en prior permission. <<var;name=TMname;original=(TrademarkedName);match=.+>> mak"
        + "es no representations about the suitability this software for any purpose. It is"
        + " provided \"as is\" without express or implied warranty.\n"
; // the license text
    }
 
    
}
