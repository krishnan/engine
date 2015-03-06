package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:17Z
 * LicenseName: AGPL-3.0+
 * FileName: Qhull.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Qhull extends License{
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
        return "Qhull"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Qhull License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Qhull, Copyright (c) 1993-2003\n"
        + "\n"
        + "The National Science and Technology Research Center for Computation and Visualiz"
        + "ation of Geometric Structures (The Geometry Center) University of Minnesota\n"
        + "\n"
        + "email: qhull@qhull.org\n"
        + "\n"
        + "This software includes Qhull from The Geometry Center. Qhull is copyrighted as n"
        + "oted above. Qhull is free software and may be obtained via http from www.qhull.o"
        + "rg. It may be freely copied, modified, and redistributed under the following con"
        + "ditions:\n"
        + "\n"
        + "1. All copyright notices must remain intact in all files.\n"
        + "\n"
        + "2. A copy of this text file must be distributed along with any copies of Qhull t"
        + "hat you redistribute; this includes copies that you have modified, or copies of "
        + "programs or other software products that include Qhull.\n"
        + "\n"
        + "3. If you modify Qhull, you must include a notice giving the name of the person "
        + "performing the modification, the date of modification, and the reason for such m"
        + "odification.\n"
        + "\n"
        + "4. When distributing modified versions of Qhull, or other software products that"
        + " include Qhull, you must provide notice that the original source code may be obt"
        + "ained as noted above.\n"
        + "\n"
        + "5. There is no warranty or other guarantee of fitness for Qhull, it is provided "
        + "solely \"as is\". Bug reports or fixes may be sent to qhull_bug@qhull.org; the aut"
        + "hors may or may not act on them as they desire.\n"
; // the license text
    }
 
    
}
