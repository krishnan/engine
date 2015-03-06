package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:36Z
 * LicenseName: AGPL-3.0+
 * FileName: TOSL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class TOSL extends License{
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
        return "TOSL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Trusster Open Source License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Trusster Open Source License version 1.0a (TRUST) copyright (c) 2006 Mike Mintz "
        + "and Robert Ekendahl. All rights reserved.\n"
        + "\n"
        + "Redistribution and use in source and binary forms, with or without modification,"
        + " are permitted provided that the following conditions are met:\n"
        + "\n"
        + "     * Redistributions of source code must retain the above copyright notice, th"
        + "is list of conditions and the following disclaimer. \n"
        + "     * Redistributions in binary form must reproduce the above copyright notice,"
        + " this list of conditions and the following disclaimer in the documentation and/o"
        + "r other materials provided with the distribution. \n"
        + "     * Redistributions in any form must be accompanied by information on how to "
        + "obtain complete source code for this software and any accompanying software that"
        + " uses this software. The source code must either be included in the distribution"
        + " or be available in a timely fashion for no more than the cost of distribution p"
        + "lus a nominal fee, and must be freely redistributable under reasonable and no mo"
        + "re restrictive conditions. For an executable file, complete source code means th"
        + "e source code for all modules it contains. It does not include source code for m"
        + "odules or files that typically accompany the major components of the operating s"
        + "ystem on which the executable file runs.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY MIKE MINTZ AND ROBERT EKENDAHL ``AS IS'' AND ANY EX"
        + "PRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTI"
        + "ES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT, AR"
        + "E DISCLAIMED. IN NO EVENT SHALL MIKE MINTZ AND ROBERT EKENDAHL OR ITS CONTRIBUTO"
        + "RS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQ"
        + "UENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS "
        + "OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CA"
        + "USED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR T"
        + "ORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THI"
        + "S SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
