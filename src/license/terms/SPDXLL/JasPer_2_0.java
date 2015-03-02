package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:38Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: JasPer_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class JasPer_2_0 extends License{
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
        return "JasPer-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "JasPer License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "JasPer License Version 2.0\n"
        + "\n"
        + "Copyright (c) 2001-2006 Michael David Adams\n"
        + "Copyright (c) 1999-2000 Image Power, Inc.\n"
        + "Copyright (c) 1999-2000 The University of British Columbia\n"
        + "\n"
        + "All rights reserved.\n"
        + "\n"
        + "Permission is hereby granted, free of charge, to any person (the \"User\") obtaini"
        + "ng a copy of this software and associated documentation files (the \"Software\"), "
        + "to deal in the Software without restriction, including without limitation the ri"
        + "ghts to use, copy, modify, merge, publish, distribute, and/or sell copies of the"
        + " Software, and to permit persons to whom the Software is furnished to do so, sub"
        + "ject to the following conditions:\n"
        + "\n"
        + "1. The above copyright notices and this permission notice (which includes the di"
        + "sclaimer below) shall be included in all copies or substantial portions of the S"
        + "oftware.\n"
        + "\n"
        + "2. The name of a copyright holder shall not be used to endorse or promote produc"
        + "ts derived from the Software without specific prior written permission.\n"
        + "\n"
        + "THIS DISCLAIMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE.  NO U"
        + "SE OF THE SOFTWARE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.  THE SO"
        + "FTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS\n"
        + "\"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIM"
        + "ITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND "
        + "NONINFRINGEMENT OF THIRD PARTY RIGHTS.  IN NO\n"
        + "EVENT SHALL THE COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRE"
        + "CT OR CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF US"
        + "E, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIO"
        + "US ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS S"
        + "OFTWARE.  NO ASSURANCES ARE PROVIDED BY THE COPYRIGHT HOLDERS THAT THE SOFTWARE "
        + "DOES NOT INFRINGE THE PATENT OR OTHER INTELLECTUAL PROPERTY RIGHTS OF ANY OTHER "
        + "ENTITY. EACH COPYRIGHT HOLDER DISCLAIMS ANY LIABILITY TO THE USER FOR CLAIMS BRO"
        + "UGHT BY ANY OTHER ENTITY BASED ON INFRINGEMENT OF INTELLECTUAL PROPERTY RIGHTS O"
        + "R OTHERWISE.  AS A CONDITION TO EXERCISING THE RIGHTS GRANTED HEREUNDER, EACH US"
        + "ER HEREBY ASSUMES SOLE RESPONSIBILITY TO SECURE ANY OTHER INTELLECTUAL PROPERTY "
        + "RIGHTS NEEDED, IF ANY.  THE SOFTWARE IS NOT FAULT-TOLERANT AND IS NOT INTENDED F"
        + "OR USE IN MISSION-CRITICAL SYSTEMS, SUCH AS THOSE USED IN THE OPERATION OF NUCLE"
        + "AR FACILITIES, AIRCRAFT NAVIGATION OR COMMUNICATION SYSTEMS, AIR TRAFFIC CONTROL"
        + " SYSTEMS, DIRECT LIFE SUPPORT MACHINES, OR WEAPONS SYSTEMS, IN WHICH THE FAILURE"
        + " OF THE SOFTWARE OR SYSTEM COULD LEAD DIRECTLY TO DEATH, PERSONAL INJURY, OR SEV"
        + "ERE PHYSICAL OR ENVIRONMENTAL DAMAGE (\"HIGH RISK ACTIVITIES\").  THE COPYRIGHT HO"
        + "LDERS SPECIFICALLY DISCLAIM ANY EXPRESS OR IMPLIED WARRANTY OF FITNESS FOR HIGH "
        + "RISK ACTIVITIES.\n"
; // the license text
    }
 
    
}
