package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:41Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: xinetd.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class xinetd extends License{
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
        return "xinetd"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "xinetd License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "ORIGINAL LICENSE: This software is\n"
        + "\n"
        + "(c) Copyright 1992 by Panagiotis Tsirigotis\n"
        + "\n"
        + "The author (Panagiotis Tsirigotis) grants permission to use, copy, and distribut"
        + "e this software and its documentation for any purpose and without fee, provided "
        + "that the above copyright notice extant in files in this distribution is not remo"
        + "ved from files included in any redistribution and that this copyright notice is "
        + "also included in any redistribution.\n"
        + "\n"
        + "Modifications to this software may be distributed, either by distributing the mo"
        + "dified software or by distributing patches to the original software, under the f"
        + "ollowing additional terms:\n"
        + "\n"
        + "1. The version number will be modified as follows: \n"
        + "     a. The first 3 components of the version number (i.e <number>.<number>.<num"
        + "ber>) will remain unchanged. \n"
        + "     b. A new component will be appended to the version number to indicate the m"
        + "odification level. The form of this component is up to the author of the modific"
        + "ations.\n"
        + "\n"
        + "2. The author of the modifications will include his/her name by appending it alo"
        + "ng with the new version number to this file and will be responsible for any wron"
        + "g behavior of the modified software.\n"
        + "\n"
        + "The author makes no representations about the suitability of this software for a"
        + "ny purpose. It is provided \"as is\" without any express or implied warranty. \n"
        + "\n"
        + "Modifications: Version: 2.1.8.7-current Copyright 1998-2001 by Rob Braun\n"
        + "\n"
        + "Sensor Addition Version: 2.1.8.9pre14a Copyright 2001 by Steve Grubb\n"
        + "\n"
        + "This is an exerpt from an email I recieved from the original author, allowing xi"
        + "netd as maintained by me (Rob Braun), to use the higher version numbers:\n"
        + "\n"
        + "I appreciate your maintaining the version string guidelines as specified in the "
        + "copyright. But I did not mean them to last as long as they did.\n"
        + "\n"
        + "So, if you want, you may use any 2.N.* (N >= 3) version string for future xinetd"
        + " versions that you release. Note that I am excluding the 2.2.* line; using that "
        + "would only create confusion. Naming the next release 2.3.0 would put to rest the"
        + " confusion about 2.2.1 and 2.1.8.*.\n"
; // the license text
    }
 
    
}
