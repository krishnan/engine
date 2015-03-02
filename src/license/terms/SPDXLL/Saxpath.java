package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:24Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Saxpath.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Saxpath extends License{
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
        return "Saxpath"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Saxpath License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (C) 2000-2002 werken digital.  \n"
        + "All rights reserved.   \n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without  modification"
        + ", are permitted provided that the following conditions  are met:   \n"
        + "\n"
        + "     1. Redistributions of source code must retain the above copyright  notice, "
        + "this list of conditions, and the following disclaimer.   \n"
        + "\n"
        + "     2. Redistributions in binary form must reproduce the above copyright  notic"
        + "e, this list of conditions, and the disclaimer that follows  these conditions in"
        + " the documentation and/or other materials  provided with the distribution.   \n"
        + "\n"
        + "     3. The name \"SAXPath\" must not be used to endorse or promote products  deri"
        + "ved from this software without prior written permission. For  written permission"
        + ", please contact license@saxpath.org.   \n"
        + "\n"
        + "     4. Products derived from this software may not be called \"SAXPath\", nor  ma"
        + "y \"SAXPath\" appear in their name, without prior written permission  from the SAX"
        + "Path Project Management (pm@saxpath.org).   \n"
        + "\n"
        + "In addition, we request (but do not require) that you include in the  end-user d"
        + "ocumentation provided with the redistribution and/or in the  software itself an "
        + "acknowledgement equivalent to the following:  \n"
        + "     \"This product includes software developed by the  SAXPath Project (http://w"
        + "ww.saxpath.org/).\"  \n"
        + "\n"
        + "Alternatively, the acknowledgment may be graphical using the logos  available at"
        + " http://www.saxpath.org/   \n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED  WARRANTIES, IN"
        + "CLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES  OF MERCHANTABILITY AND FITN"
        + "ESS FOR A PARTICULAR PURPOSE ARE  DISCLAIMED. IN NO EVENT SHALL THE SAXPath AUTH"
        + "ORS OR THE PROJECT  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,"
        + "  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT  LIMITED TO, "
        + "PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR "
        + "BUSINESS INTERRUPTION) HOWEVER CAUSED AND  ON ANY THEORY OF LIABILITY, WHETHER I"
        + "N CONTRACT, STRICT LIABILITY,  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISI"
        + "NG IN ANY WAY OUT  OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILI"
        + "TY OF  SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
