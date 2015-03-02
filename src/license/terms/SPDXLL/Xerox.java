package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:41Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Xerox.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Xerox extends License{
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
        return "Xerox"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Xerox License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 1995, 1996 Xerox Corporation. All Rights Reserved.\n"
        + "\n"
        + "Use and copying of this software and preparation of derivative works based upon "
        + "this software are permitted. Any copy of this software or of any derivative work"
        + " must include the above copyright notice of Xerox Corporation, this paragraph an"
        + "d the one after it. Any distribution of this software or derivative works must c"
        + "omply with all applicable United States export control laws.\n"
        + "\n"
        + "This software is made available AS IS, and XEROX CORPORATION DISCLAIMS ALL WARRA"
        + "NTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE IMPLIED WARRANTIES O"
        + "F MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, AND NOTWITHSTANDING ANY "
        + "OTHER PROVISION CONTAINED HEREIN, ANY LIABILITY FOR DAMAGES RESULTING FROM THE S"
        + "OFTWARE OR ITS USE IS EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (I"
        + "NCLUDING NEGLIGENCE) OR STRICT LIABILITY, EVEN IF XEROX CORPORATION IS ADVISED O"
        + "F THE POSSIBILITY OF SUCH DAMAGES.\n"
; // the license text
    }
 
    
}
