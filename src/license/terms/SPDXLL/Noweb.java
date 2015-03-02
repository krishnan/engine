package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:59Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Noweb.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Noweb extends License{
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
        return "Noweb"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Noweb License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Noweb is copyright 1989-2000 by Norman Ramsey. All rights reserved.\n"
        + "\n"
        + "Noweb is protected by copyright. It is not public-domain software or shareware, "
        + "and it is not protected by a ``copyleft'' agreement like the one used by the Fre"
        + "e Software Foundation.\n"
        + "\n"
        + "Noweb is available free for any use in any field of endeavor. You may redistribu"
        + "te noweb in whole or in part provided you acknowledge its source and include thi"
        + "s COPYRIGHT file. You may modify noweb and create derived works, provided you re"
        + "tain this copyright notice, but the result may not be called noweb without my wr"
        + "itten consent. \n"
        + "\n"
        + "You may sell noweb if you wish. For example, you may sell a CD-ROM including now"
        + "eb. \n"
        + "\n"
        + "You may sell a derived work, provided that all source code for your derived work"
        + " is available, at no additional charge, to anyone who buys your derived work in "
        + "any form. You must give permisson for said source code to be used and modified u"
        + "nder the terms of this license. You must state clearly that your work uses or is"
        + " based on noweb and that noweb is available free of change. You must also reques"
        + "t that bug reports on your work be reported to you.\n"
; // the license text
    }
 
    
}
