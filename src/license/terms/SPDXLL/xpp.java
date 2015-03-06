package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:42Z
 * LicenseName: AGPL-3.0+
 * FileName: xpp.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class xpp extends License{
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
        return "xpp"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "XPP License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "LICENSE FOR THE Extreme! Lab PullParser \n"
        + "\n"
        + "Copyright (c) 2002 The Trustees of Indiana University. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "1) All redistributions of source code must retain the above copyright notice, th"
        + "e list of authors in the original source code, this list of conditions and the d"
        + "isclaimer listed in this license;\n"
        + "\n"
        + "2) All redistributions in binary form must reproduce the above copyright notice,"
        + " this list of conditions and the disclaimer listed in this license in the docume"
        + "ntation and/or other materials provided with the distribution;\n"
        + "\n"
        + "3) Any documentation included with all redistributions must include the followin"
        + "g acknowledgement:\n"
        + "\n"
        + "     \"This product includes software developed by the Indiana University Extreme"
        + "! Lab. For further information please visit http://www.extreme.indiana.edu/\"\n"
        + "\n"
        + "Alternatively, this acknowledgment may appear in the software itself, and wherev"
        + "er such third-party acknowledgments normally appear.\n"
        + "\n"
        + "4) The name \"Indiana Univeristy\" and \"Indiana Univeristy Extreme! Lab\" shall not"
        + " be used to endorse or promote products derived from this software without prior"
        + " written permission from Indiana University. For written permission, please cont"
        + "act http://www.extreme.indiana.edu/.\n"
        + "\n"
        + "5) Products derived from this software may not use \"Indiana Univeristy\" name nor"
        + " may \"Indiana Univeristy\" appear in their name, without prior written permission"
        + " of the Indiana University. Indiana University provides no reassurances that the"
        + " source code provided does not infringe the patent or any other intellectual pro"
        + "perty rights of any other entity. Indiana University disclaims any liability to "
        + "any recipient for claims brought by any other entity based on infringement of in"
        + "tellectual property rights or otherwise.\n"
        + "\n"
        + "LICENSEE UNDERSTANDS THAT SOFTWARE IS PROVIDED \"AS IS\" FOR WHICH NO WARRANTIES A"
        + "S TO CAPABILITIES OR ACCURACY ARE MADE. INDIANA UNIVERSITY GIVES NO WARRANTIES A"
        + "ND MAKES NO REPRESENTATION THAT SOFTWARE IS FREE OF INFRINGEMENT OF THIRD PARTY "
        + "PATENT, COPYRIGHT, OR OTHER PROPRIETARY RIGHTS. INDIANA UNIVERSITY MAKES NO WARR"
        + "ANTIES THAT SOFTWARE IS FREE FROM \"BUGS\", \"VIRUSES\", \"TROJAN HORSES\", \"TRAP DOOR"
        + "S\", \"WORMS\", OR OTHER HARMFUL CODE. LICENSEE ASSUMES THE ENTIRE RISK AS TO THE P"
        + "ERFORMANCE OF SOFTWARE AND/OR ASSOCIATED MATERIALS, AND TO THE PERFORMANCE AND V"
        + "ALIDITY OF INFORMATION GENERATED USING SOFTWARE.\n"
; // the license text
    }
 
    
}
