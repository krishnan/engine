package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:09Z
 * LicenseName: AGPL-3.0+
 * FileName: OML.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class OML extends License{
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
        return "OML"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Open Market License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This FastCGI application library source and object code (the \"Software\") and its"
        + " documentation (the \"Documentation\") are copyrighted by Open Market, Inc (\"Open "
        + "Market\"). The following terms apply to all files associated with the Software an"
        + "d Documentation unless explicitly disclaimed in individual files.\n"
        + "\n"
        + "Open Market permits you to use, copy, modify, distribute, and license this Softw"
        + "are and the Documentation for any purpose, provided that existing copyright noti"
        + "ces are retained in all copies and that this notice is included verbatim in any "
        + "distributions. No written agreement, license, or royalty fee is required for any"
        + " of the authorized uses. Modifications to this Software and Documentation may be"
        + " copyrighted by their authors and need not follow the licensing terms described "
        + "here. If modifications to this Software and Documentation have new licensing ter"
        + "ms, the new terms must be clearly indicated on the first page of each file where"
        + " they apply.\n"
        + "\n"
        + "OPEN MARKET MAKES NO EXPRESS OR IMPLIED WARRANTY WITH RESPECT TO THE SOFTWARE OR"
        + " THE DOCUMENTATION, INCLUDING WITHOUT LIMITATION ANY WARRANTY OF MERCHANTABILITY"
        + " OR FITNESS FOR A PARTICULAR PURPOSE. IN NO EVENT SHALL OPEN MARKET BE LIABLE TO"
        + " YOU OR ANY THIRD PARTY FOR ANY DAMAGES ARISING FROM OR RELATING TO THIS SOFTWAR"
        + "E OR THE DOCUMENTATION, INCLUDING, WITHOUT LIMITATION, ANY INDIRECT, SPECIAL OR "
        + "CONSEQUENTIAL DAMAGES OR SIMILAR DAMAGES, INCLUDING LOST PROFITS OR LOST DATA, E"
        + "VEN IF OPEN MARKET HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. THE SOFT"
        + "WARE AND DOCUMENTATION ARE PROVIDED \"AS IS\". OPEN MARKET HAS NO LIABILITY IN CON"
        + "TRACT, TORT, NEGLIGENCE OR OTHERWISE ARISING OUT OF THIS SOFTWARE OR THE DOCUMEN"
        + "TATION.\n"
; // the license text
    }
 
    
}
