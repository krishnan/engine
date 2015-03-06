package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:12Z
 * LicenseName: AGPL-3.0+
 * FileName: Giftware.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Giftware extends License{
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
        return "Giftware"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Giftware License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Allegro 4 (the giftware license)\n"
        + "\n"
        + "Allegro is gift-ware. It was created by a number of people working in cooperatio"
        + "n, and is given to you freely as a gift. You may use, modify, redistribute, and "
        + "generally hack it about in any way you like, and you do not have to give us anyt"
        + "hing in return.\n"
        + "\n"
        + "However, if you like this product you are encouraged to thank us by making a ret"
        + "urn gift to the Allegro community. This could be by writing an add-on package, p"
        + "roviding a useful bug report, making an improvement to the library, or perhaps j"
        + "ust releasing the sources of your program so that other people can learn from th"
        + "em. If you redistribute parts of this code or make a game using it, it would be "
        + "nice if you mentioned Allegro somewhere in the credits, but you are not required"
        + " to do this. We trust you not to abuse our generosity.\n"
        + "\n"
        + "By Shawn Hargreaves, 18 October 1998.\n"
        + "\n"
        + "DISCLAIMER: THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPR"
        + "ESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, "
        + "FITNESS FOR A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. IN NO EVENT SHALL "
        + "THE COPYRIGHT HOLDERS OR ANYONE DISTRIBUTING THE SOFTWARE BE LIABLE FOR ANY DAMA"
        + "GES OR OTHER LIABILITY, WHETHER IN CONTRACT, TORT OR OTHERWISE, ARISING FROM, OU"
        + "T OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFT"
        + "WARE.\n"
; // the license text
    }
 
    
}
