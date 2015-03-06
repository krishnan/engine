package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:11Z
 * LicenseName: AGPL-3.0+
 * FileName: Borceux.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Borceux extends License{
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
        return "Borceux"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Borceux license"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright 1993 Francis Borceux\n"
        + "You may freely use, modify, and/or distribute each of the files in this package "
        + "without limitation.  The package consists of the following files:\n"
        + "\n"
        + "README\n"
        + "compatibility/OldDiagram\n"
        + "compatibility/OldMaxiDiagram\n"
        + "compatibility/OldMicroDiagram\n"
        + "compatibility/OldMiniDiagram\n"
        + "compatibility/OldMultipleArrows\n"
        + "diagram/Diagram\n"
        + "diagram/MaxiDiagram\n"
        + "diagram/MicroDiagram\n"
        + "diagram/MiniDiagram\n"
        + "diagram/MultipleArrows\n"
        + "user-guides/Diagram_Mode_d_Emploi\n"
        + "user-guides/Diagram_Read_Me\n"
        + "\n"
        + "Of course no support is guaranteed, but the author will attempt to assist with p"
        + "roblems.  Current email address:\n"
        + "francis dot borceux at uclouvain dot be.\n"
; // the license text
    }
 
    
}
