package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:52Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Crossword.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Crossword extends License{
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
        return "Crossword"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Crossword License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (C) 1995-2009 Gerd Neugebauer\n"
        + "  \n"
        + "cwpuzzle.dtx is distributed in the hope that it will be useful, but WITHOUT ANY "
        + "WARRANTY. No author or distributor  accepts responsibility to anyone for the con"
        + "sequences of using it or for whether it serves any particular purpose  or works "
        + "at all, unless he says so in writing.\n"
        + "  .\n"
        + "Everyone is granted permission to copy, modify and redistribute cwpuzzle.dtx, pr"
        + "ovided this copyright notice is preserved and any modifications are indicated.\n"
; // the license text
    }
 
    
}
