package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:13Z
 * LicenseName: AGPL-3.0+
 * FileName: GL2PS.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class GL2PS extends License{
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
        return "GL2PS"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "GL2PS License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "GL2PS LICENSE Version 2, November 2003\n"
        + "\n"
        + "Copyright (C) 2003, Christophe Geuzaine\n"
        + "\n"
        + "Permission to use, copy, and distribute this software and its documentation for "
        + "any purpose with or without fee is hereby granted, provided that the copyright n"
        + "otice appear in all copies and that both that copyright notice and this permissi"
        + "on notice appear in supporting documentation.\n"
        + "\n"
        + "Permission to modify and distribute modified versions of this software is grante"
        + "d, provided that:\n"
        + "\n"
        + "1) the modifications are licensed under the same terms as this software;\n"
        + "\n"
        + "2) you make available the source code of any modifications that you distribute, "
        + "either on the same media as you distribute any executable or other form of this "
        + "software, or via a mechanism generally accepted in the software development comm"
        + "unity for the electronic transfer of data.\n"
        + "\n"
        + "This software is provided \"as is\" without express or implied warranty.\n"
; // the license text
    }
 
    
}
