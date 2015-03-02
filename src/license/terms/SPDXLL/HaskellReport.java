package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:32Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: HaskellReport.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class HaskellReport extends License{
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
        return "HaskellReport"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Haskell Language Report License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Code derived from the document \"Report on the Programming Language\n"
        + "Haskell 2010\", is distributed under the following license:\n"
        + "\n"
        + "Copyright (c) 2010 Simon Marlow\n"
        + "\n"
        + "The authors intend this Report to belong to the entire Haskell community, and so"
        + " we grant permission to copy and distribute it for any purpose, provided that it"
        + " is reproduced in its entirety, including this Notice.  Modified versions of thi"
        + "s Report may also be copied and distributed for any purpose, provided that the m"
        + "odified version is clearly presented as such, and that it does not claim to be a"
        + " definition of the Haskell 2010 Language.\n"
; // the license text
    }
 
    
}
