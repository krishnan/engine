package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:53Z
 * LicenseName: AGPL-3.0+
 * FileName: NetCDF.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NetCDF extends License{
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
        return "NetCDF"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "NetCDF license"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright 1993-2014 University Corporation for Atmospheric Research/Unidata\n"
        + "\n"
        + "Portions of this software were developed by the Unidata Program at the Universit"
        + "y Corporation for Atmospheric Research.\n"
        + "\n"
        + "Access and use of this software shall impose the following obligations and under"
        + "standings on the user. The user is granted the right, without any fee or cost, t"
        + "o use, copy, modify, alter, enhance and distribute this software, and any deriva"
        + "tive works thereof, and its supporting documentation for any purpose whatsoever,"
        + " provided that this entire notice appears in all copies of the software, derivat"
        + "ive works and supporting documentation. Further, UCAR requests that the user cre"
        + "dit UCAR/Unidata in any publications that result from the use of this software o"
        + "r in any product that includes this software, although this is not an obligation"
        + ". The names UCAR and/or Unidata, however, may not be used in any advertising or "
        + "publicity to endorse or promote any products or commercial entity unless specifi"
        + "c written permission is obtained from UCAR/Unidata. The user also understands th"
        + "at UCAR/Unidata is not obligated to provide the user with any support, consultin"
        + "g, training or assistance of any kind with regard to the use, operation and perf"
        + "ormance of this software nor to provide the user with any updates, revisions, ne"
        + "w versions or \"bug fixes.\"\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY UCAR/UNIDATA \"AS IS\" AND ANY EXPRESS OR IMPLIED WAR"
        + "RANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILIT"
        + "Y AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL UCAR/UN"
        + "IDATA BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGE"
        + "S WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION O"
        + "F CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION"
        + " WITH THE ACCESS, USE OR PERFORMANCE OF THIS SOFTWARE.\n"
; // the license text
    }
 
    
}
