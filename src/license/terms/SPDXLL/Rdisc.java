package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:18Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Rdisc.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Rdisc extends License{
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
        return "Rdisc"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Rdisc License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Rdisc (this program) was developed by Sun Microsystems, Inc. and is  provided fo"
        + "r unrestricted use provided that this legend is included on  all tape media and "
        + "as a part of the software program in whole or part.  Users may copy or modify Rd"
        + "isc without charge, and they may freely  distribute it.   \n"
        + "\n"
        + "RDISC IS PROVIDED AS IS WITH NO WARRANTIES OF ANY KIND INCLUDING THE  WARRANTIES"
        + " OF DESIGN, MERCHANTIBILITY AND FITNESS FOR A PARTICULAR  PURPOSE, OR ARISING FR"
        + "OM A COURSE OF DEALING, USAGE OR TRADE PRACTICE.   \n"
        + "\n"
        + "Rdisc is provided with no support and without any obligation on the  part of Sun"
        + " Microsystems, Inc. to assist in its use, correction,  modification or enhanceme"
        + "nt.   \n"
        + "\n"
        + "SUN MICROSYSTEMS, INC. SHALL HAVE NO LIABILITY WITH RESPECT TO THE  INFRINGEMENT"
        + " OF COPYRIGHTS, TRADE SECRETS OR ANY PATENTS BY RDISC  OR ANY PART THEREOF.   \n"
        + "\n"
        + "In no event will Sun Microsystems, Inc. be liable for any lost revenue  or profi"
        + "ts or other special, indirect and consequential damages, even  if Sun has been a"
        + "dvised of the possibility of such damages.   \n"
        + "\n"
        + "Sun Microsystems, Inc.  \n"
        + "2550 Garcia Avenue  \n"
        + "Mountain View, California 94043\n"
; // the license text
    }
 
    
}
