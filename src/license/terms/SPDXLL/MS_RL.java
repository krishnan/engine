package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:46Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: MS_RL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MS_RL extends License{
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
        return "MS-RL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Microsoft Reciprocal License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Microsoft Reciprocal License (Ms-RL)\n"
        + " \n"
        + "This license governs use of the accompanying software. If you use the software, "
        + "you accept this license. If you do not accept the license, do not use the softwa"
        + "re.\n"
        + "\n"
        + "1.  Definitions\n"
        + "The terms \"reproduce,\" \"reproduction,\" \"derivative works,\" and \"distribution\" ha"
        + "ve the same meaning here as under U.S. copyright law.\n"
        + "\n"
        + "A \"contribution\" is the original software, or any additions or changes to the so"
        + "ftware. \n"
        + "\n"
        + "A \"contributor\" is any person that distributes its contribution under this licen"
        + "se. \n"
        + "\n"
        + "\"Licensed patents\" are a contributor's patent claims that read directly on its c"
        + "ontribution.\n"
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
        + "     (A) Reciprocal Grants- For any file you distribute that contains code from "
        + "the software (in source code or binary format), you must provide recipients the "
        + "source code to that file along with a copy of this license, which license will g"
        + "overn that file. You may license other files that are entirely your own work and"
        + " do not contain code from the software under any terms you choose. \n"
        + "\n"
        + "     (B) No Trademark License- This license does not grant you rights to use any"
        + " contributors' name, logo, or trademarks. \n"
        + "\n"
        + "     (C) If you bring a patent claim against any contributor over patents that y"
        + "ou claim are infringed by the software, your patent license from such contributo"
        + "r to the software ends automatically. \n"
        + "\n"
        + "     (D) If you distribute any portion of the software, you must retain all copy"
        + "right, patent, trademark, and attribution notices that are present in the softwa"
        + "re. \n"
        + "\n"
        + "     (E) If you distribute any portion of the software in source code form, you "
        + "may do so only under this license by including a complete copy of this license w"
        + "ith your distribution. If you distribute any portion of the software in compiled"
        + " or object code form, you may only do so under a license that complies with this"
        + " license. \n"
        + "\n"
        + "     (F) The software is licensed \"as-is.\" You bear the risk of using it. The co"
        + "ntributors give no express warranties, guarantees, or conditions. You may have a"
        + "dditional consumer rights under your local laws which this license cannot change"
        + ". To the extent permitted under your local laws, the contributors exclude the im"
        + "plied warranties of merchantability, fitness for a particular purpose and non-in"
        + "fringement.\n"
; // the license text
    }
 
    
}
