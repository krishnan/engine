package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:46Z
 * LicenseName: AGPL-3.0+
 * FileName: MS_PL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MS_PL extends License{
   /**
     * Was this license approved by the OSI?
     * @return  True if the license is listed as approved   
     */
    @Override
    public Boolean approvedOSI(){
        return true; // was this license OSI approved or not?
    }
    
    /**
     * The SPDX identifier
     * @return  The unique identifier for this license
     */
    @Override
    public String getId(){
        return "MS-PL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Microsoft Public License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Microsoft Public License (Ms-PL)\n"
        + "\n"
        + "This license governs use of the accompanying software. If you use the software, "
        + "you accept this license. If you do not accept the license, do not use the softwa"
        + "re.\n"
        + " \n"
        + "1.  Definitions\n"
        + "The terms \"reproduce,\" \"reproduction,\" \"derivative works,\" and \"distribution\" ha"
        + "ve the same meaning here as under U.S. copyright law. A \"contribution\" is the or"
        + "iginal software, or any additions or changes to the software. A \"contributor\" is"
        + " any person that distributes its contribution under this license. \"Licensed pate"
        + "nts\" are a contributor's patent claims that read directly on its contribution.\n"
        + "\n"
        + "2.  Grant of Rights\n"
        + "     (A) Copyright Grant- Subject to the terms of this license, including the li"
        + "cense conditions and limitations in section 3, each contributor grants you a non"
        + "-exclusive, worldwide, royalty-free copyright license to reproduce its contribut"
        + "ion, prepare derivative works of its contribution, and distribute its contributi"
        + "on or any derivative works that you create.\n"
        + "\n"
        + "     (B) Patent Grant- Subject to the terms of this license, including the licen"
        + "se conditions and limitations in section 3, each contributor grants you a non-ex"
        + "clusive, worldwide, royalty-free license under its licensed patents to make, hav"
        + "e made, use, sell, offer for sale, import, and/or otherwise dispose of its contr"
        + "ibution in the software or derivative works of the contribution in the software.\n"
        + "\n"
        + "3.  Conditions and Limitations\n"
        + "     (A) No Trademark License- This license does not grant you rights to use any"
        + " contributors' name, logo, or trademarks. \n"
        + "\n"
        + "     (B) If you bring a patent claim against any contributor over patents that y"
        + "ou claim are infringed by the software, your patent license from such contributo"
        + "r to the software ends automatically. \n"
        + "\n"
        + "     (C) If you distribute any portion of the software, you must retain all copy"
        + "right, patent, trademark, and attribution notices that are present in the softwa"
        + "re. \n"
        + " \n"
        + "     (D) If you distribute any portion of the software in source code form, you "
        + "may do so only under this license by including a complete copy of this license w"
        + "ith your distribution. If you distribute any portion of the software in compiled"
        + " or object code form, you may only do so under a license that complies with this"
        + " license. \n"
        + "\n"
        + "     (E) The software is licensed \"as-is.\" You bear the risk of using it. The co"
        + "ntributors give no express warranties, guarantees, or conditions. You may have a"
        + "dditional consumer rights under your local laws which this license cannot change"
        + ". To the extent permitted under your local laws, the contributors exclude the im"
        + "plied warranties of merchantability, fitness for a particular purpose and non-in"
        + "fringement.\n"
; // the license text
    }
 
    
}
