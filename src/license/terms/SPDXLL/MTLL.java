package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:45Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: MTLL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MTLL extends License{
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
        return "MTLL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Matrix Template Library License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Software License for MTL\n"
        + "\n"
        + "Copyright (c) 2007 The Trustees of Indiana University. \n"
        + "     2008 Dresden University of Technology and the Trustees of Indiana Universit"
        + "y. \n"
        + "     2010 SimuNova UG (haftungsbeschränkt), www.simunova.com. \n"
        + "All rights reserved. \n"
        + "Authors: Peter Gottschling and Andrew Lumsdaine\n"
        + "\n"
        + "This file is part of the Matrix Template Library\n"
        + "\n"
        + "Dresden University of Technology -- short TUD -- and Indiana University -- short"
        + " IU -- have the exclusive rights to license this product under the following lic"
        + "ense.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:      \n"
        + "     1. All redistributions of source code must retain the above copyright notic"
        + "e, the list of authors in the original source code, this list of conditions and "
        + "the disclaimer listed in this license; \n"
        + "     2. All redistributions in binary form must reproduce the above copyright no"
        + "tice, this list of conditions and the disclaimer listed in this license in the d"
        + "ocumentation and/or other materials provided with the distribution; \n"
        + "     3. Any documentation included with all redistributions must include the fol"
        + "lowing acknowledgement: \n"
        + "     \"This product includes software developed at the University of Notre Dame, "
        + "the Pervasive Technology Labs at Indiana University, and Dresden University of T"
        + "echnology. For technical information contact Andrew Lumsdaine at the Pervasive T"
        + "echnology Labs at Indiana University. For administrative and license questions c"
        + "ontact the Advanced Research and Technology Institute at 1100 Waterway Blvd. Ind"
        + "ianapolis, Indiana 46202, phone 317-274-5905, fax 317-274-5902.\" \n"
        + "     Alternatively, this acknowledgement may appear in the software itself, and "
        + "wherever such third-party acknowledgments normally appear. \n"
        + "     4. The name \"MTL\" shall not be used to endorse or promote products derived "
        + "from this software without prior written permission from IU or TUD. For written "
        + "permission, please contact Indiana University Advanced Research & Technology Ins"
        + "titute. \n"
        + "     5. Products derived from this software may not be called \"MTL\", nor may \"MT"
        + "L\" appear in their name, without prior written permission of Indiana University "
        + "Advanced Research & Technology Institute.\n"
        + "\n"
        + "TUD and IU provide no reassurances that the source code provided does not infrin"
        + "ge the patent or any other intellectual property rights of any other entity. TUD"
        + " and IU disclaim any liability to any recipient for claims brought by any other "
        + "entity based on infringement of intellectual property rights or otherwise. \n"
        + "\n"
        + "LICENSEE UNDERSTANDS THAT SOFTWARE IS PROVIDED \"AS IS\" FOR WHICH NO WARRANTIES A"
        + "S TO CAPABILITIES OR ACCURACY ARE MADE. DRESDEN UNIVERSITY OF TECHNOLOGY AND IND"
        + "IANA UNIVERSITY GIVE NO WARRANTIES AND MAKE NO REPRESENTATION THAT SOFTWARE IS F"
        + "REE OF INFRINGEMENT OF THIRD PARTY PATENT, COPYRIGHT, OR OTHER PROPRIETARY RIGHT"
        + "S. DRESDEN UNIVERSITY OF TECHNOLOGY AND INDIANA UNIVERSITY MAKE NO WARRANTIES TH"
        + "AT SOFTWARE IS FREE FROM \"BUGS\", \"VIRUSES\", \"TROJAN HORSES\", \"TRAP DOORS\", \"WORM"
        + "S\", OR OTHER HARMFUL CODE. LICENSEE ASSUMES THE ENTIRE RISK AS TO THE PERFORMANC"
        + "E OF SOFTWARE AND/OR ASSOCIATED MATERIALS, AND TO THE PERFORMANCE AND VALIDITY O"
        + "F INFORMATION GENERATED USING SOFTWARE.\n"
; // the license text
    }
 
    
}
