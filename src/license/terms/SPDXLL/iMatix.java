package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:35Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: iMatix.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class iMatix extends License{
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
        return "iMatix"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "iMatix Standard Function Library Agreement"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "The SFL License Agreement\n"
        + "\n"
        + "This license agreement covers your use of the iMatix STANDARD FUNCTION LIBRARY ("
        + "SFL), its source code, documentation, and executable files, hereinafter referred"
        + " to as \"the Product\".\n"
        + "\n"
        + "The Product is Copyright (c) 1991-2000 iMatix Corporation. You may use it and di"
        + "stribute it according to this following License Agreement. If you do not agree w"
        + "ith these terms, please remove the Product from your system. By incorporating th"
        + "e Product in your work or distributing the Product to others you implicitly agre"
        + "e to these license terms.\n"
        + "\n"
        + "Statement Of Copyright\n"
        + "\n"
        + "The Product is, and remains, Copyright © 1991-2000 iMatix Corporation, with exce"
        + "ption of specific copyrights as noted in the individual source files.\n"
        + "\n"
        + "Conditions Of Use\n"
        + "\n"
        + "You do not need to provide the source code for the Product as part of your produ"
        + "ct. However, you must do one of these things to comply with the Product License "
        + "Agreement:\n"
        + "\n"
        + "     1.Provide the source code for Product modules that you use, or\n"
        + "     2.Make your product freely available according to a license similar to the"
        + " GNU General Public License, or the Perl Artistic License, or\n"
        + "     3.Add this phrase to the documentation for your product: \"This product use"
        + "s parts of the iMatix SFL, Copyright © 1991-2000 iMatix Corporation <http://www."
        + "imatix.com>\".\n"
        + "\n"
        + "Rights Of Usage\n"
        + "\n"
        + "You may freely and at no cost use the Product in any project, commercial, academ"
        + "ic, military, or private, so long as you respect the License Agreement. The Lice"
        + "nse Agreement does not affect any software except the Product. In particular, an"
        + "y application that uses the Product does not itself fall under the License Agree"
        + "ment.\n"
        + "\n"
        + "You may modify any part of the Product, including sources and documentation, exc"
        + "ept this License Agreement, which you may not modify.\n"
        + "\n"
        + "You must clearly indicate any modifications at the start of each source file. Th"
        + "e user of any modified Product code must know that the source file is not origin"
        + "al.\n"
        + "\n"
        + "At your discretion, you may rewrite or reuse any part of the Product so that you"
        + "r derived code is not obviously part of the Product. This derived code does not "
        + "fall under the Product License Agreement directly, but you must include a credit"
        + " at the start of each source file indicating the original authorship and source "
        + "of the code, and a statement of copyright as follows: \"Parts copyright (c) 1991-"
        + "2000 iMatix Corporation.\"\n"
        + "\n"
        + "Rights Of Distribution\n"
        + "\n"
        + "You may freely distribute the Product, or any subset of the Product, by any mean"
        + "s. The License, in the form of the file called \"LICENSE.TXT\" must accompany any "
        + "such distribution.\n"
        + "\n"
        + "You may charge a fee for distributing the Product, for providing a warranty on t"
        + "he Product, for making modifications to the Product, or for any other service pr"
        + "ovided in relation to the Product. You are not required to ask our permission fo"
        + "r any of these activities.\n"
        + "\n"
        + "At no time will iMatix associate itself with any distribution of the Product exc"
        + "ept that supplied from the Internet site http://www.imatix.com.\n"
        + "\n"
        + "Disclaimer Of Warranty\n"
        + "\n"
        + "The Product is provided as free software, in the hope that it will be useful. It"
        + " is provided \"as-is\", without warranty of any kind, either expressed or implied,"
        + " including, but not limited to, the implied warranties of merchantability and fi"
        + "tness for a particular purpose. The entire risk as to the quality and performanc"
        + "e of the Product is with you. Should the Product prove defective, the full cost "
        + "of repair, servicing, or correction lies with you.\n"
; // the license text
    }
 
    
}
