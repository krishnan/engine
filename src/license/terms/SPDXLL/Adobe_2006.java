package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:56Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: Adobe_2006.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Adobe_2006 extends License{
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
        return "Adobe-2006"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Adobe Systems Incorporated Source Code License Agreement"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Adobe Systems Incorporated(r) Source Code License Agreement \n"
        + "Copyright(c) 2006 Adobe Systems Incorporated. All rights reserved.\n"
        + "\n"
        + "Please read this Source Code License Agreement carefully before using the source"
        + " code.\n"
        + "\n"
        + "Adobe Systems Incorporated grants to you a perpetual, worldwide, non-exclusive, "
        + "no-charge, royalty-free, irrevocable copyright license, to reproduce, prepare de"
        + "rivative works of, publicly display, publicly perform, and distribute this sourc"
        + "e code and such derivative works in source or object code form without any attri"
        + "bution requirements.\n"
        + "\n"
        + "The name \"Adobe Systems Incorporated\" must not be used to endorse or promote pro"
        + "ducts derived from the source code without prior written permission.\n"
        + "\n"
        + "You agree to indemnify, hold harmless and defend Adobe Systems Incorporated from"
        + " and against any loss, damage, claims or lawsuits, including attorney's fees tha"
        + "t arise or result from your use or distribution of the source code.\n"
        + "\n"
        + "THIS SOURCE CODE IS PROVIDED \"AS IS\" AND \"WITH ALL FAULTS\", WITHOUT ANY TECHNICA"
        + "L SUPPORT OR ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,"
        + " THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE "
        + "ARE DISCLAIMED. ALSO, THERE IS NO WARRANTY OF NON-INFRINGEMENT, TITLE OR QUIET E"
        + "NJOYMENT. IN NO EVENT SHALL MACROMEDIA OR ITS SUPPLIERS BE LIABLE FOR ANY DIRECT"
        + ", INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,"
        + " BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, D"
        + "ATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF L"
        + "IABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE O"
        + "R OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOURCE CODE, EVEN IF ADVI"
        + "SED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
