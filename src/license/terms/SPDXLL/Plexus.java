package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:14Z
 * LicenseName: AGPL-3.0+
 * FileName: Plexus.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Plexus extends License{
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
        return "Plexus"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Plexus Classworlds License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "$Id: LICENSE.txt 3117 2006-04-07 15:49:12Z jvanzyl $\n"
        + "\n"
        + "Copyright 2002 (C) The Codehaus. All Rights Reserved. \n"
        + "\n"
        + "Redistribution and use of this software and associated documentation (\"Software\""
        + "), with or without modification, are permitted provided that the following condi"
        + "tions are met:\n"
        + "\n"
        + "1. Redistributions of source code must retain copyright statements and notices. "
        + "Redistributions must also contain a copy of this document. \n"
        + "\n"
        + "2. Redistributions in binary form must reproduce the above copyright notice, thi"
        + "s list of conditions and the following disclaimer in the documentation and/or ot"
        + "her materials provided with the distribution. \n"
        + "\n"
        + "3. The name \"classworlds\" must not be used to endorse or promote products derive"
        + "d from this Software without prior written permission of The Codehaus. For writt"
        + "en permission, please contact bob@codehaus.org. \n"
        + "\n"
        + "4. Products derived from this Software may not be called \"classworlds\" nor may \""
        + "classworlds\" appear in their names without prior written permission of The Codeh"
        + "aus. \"classworlds\" is a registered trademark of The Codehaus. \n"
        + "\n"
        + "5. Due credit should be given to The Codehaus. (http://classworlds.codehaus.org/"
        + "). \n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE CODEHAUS AND CONTRIBUTORS ``AS IS'' AND ANY EXP"
        + "RESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANT"
        + "IES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN N"
        + "O EVENT SHALL THE CODEHAUS OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIREC"
        + "T, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT "
        + "LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR P"
        + "ROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,"
        + " WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWI"
        + "SE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE P"
        + "OSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
