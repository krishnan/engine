package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:42Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: BSD_3_Clause_LBNL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class BSD_3_Clause_LBNL extends License{
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
        return "BSD-3-Clause-LBNL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Lawrence Berkeley National Labs BSD variant license"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 2003, The Regents of the University of California, through Lawrenc"
        + "e Berkeley National Laboratory (subject to receipt of any required approvals fro"
        + "m the U.S. Dept. of Energy). All rights reserved. Redistribution and use in sour"
        + "ce and binary forms, with or without modification, are permitted provided that t"
        + "he following conditions are met:\n"
        + "\n"
        + "(1) Redistributions of source code must retain the above copyright notice, this "
        + "list of conditions and the following disclaimer.\n"
        + "\n"
        + "(2) Redistributions in binary form must reproduce the above copyright notice, th"
        + "is list of conditions and the following disclaimer in the documentation and/or o"
        + "ther materials provided with the distribution.\n"
        + "\n"
        + "(3) Neither the name of the University of California, Lawrence Berkeley National"
        + " Laboratory, U.S. Dept. of Energy nor the names of its contributors may be used "
        + "to endorse or promote products derived from this software without specific prior"
        + " written permission.\n"
        + "\n"
        + "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND "
        + "ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WA"
        + "RRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED."
        + " IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,"
        + " INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, "
        + "BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DA"
        + "TA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LI"
        + "ABILITY, WHETHER IN CONTRACT, STRICT\n"
        + "LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF"
        + " THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "You are under no obligation whatsoever to provide any bug fixes, patches, or upg"
        + "rades to the features, functionality or performance of the source code (\"Enhance"
        + "ments\") to anyone; however, if you choose to make your Enhancements available ei"
        + "ther publicly, or directly to Lawrence Berkeley National Laboratory, without imp"
        + "osing a separate written license agreement for such Enhancements, then you hereb"
        + "y grant the following license: a non-exclusive, royalty-free perpetual license t"
        + "o install, use, modify, prepare derivative works, incorporate into other compute"
        + "r software, distribute, and sublicense such Enhancements or derivative works the"
        + "reof, in binary and source code form.\n"
; // the license text
    }
 
    
}
