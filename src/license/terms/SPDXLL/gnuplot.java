package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:31Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: gnuplot.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class gnuplot extends License{
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
        return "gnuplot"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "gnuplot License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright 1986 - 1993, 1998, 2004 Thomas Williams, Colin Kelley\n"
        + "\n"
        + "Permission to use, copy, and distribute this software and its documentation for "
        + "any purpose with or without fee is hereby granted, provided that the above copyr"
        + "ight notice appear in all copies and that both that copyright notice and this pe"
        + "rmission notice appear in supporting documentation.\n"
        + "\n"
        + "Permission to modify the software is granted, but not the right to distribute th"
        + "e complete modified source code. Modifications are to be distributed as patches "
        + "to the released version. Permission to distribute binaries produced by compiling"
        + " modified sources is granted, provided you \n"
        + "\n"
        + "     1. distribute the corresponding source modifications from the released vers"
        + "ion in the form of a patch file along with the binaries, \n"
        + "     2. add special version identification to distinguish your version in additi"
        + "on to the base release version number, \n"
        + "     3. provide your name and address as the primary contact for the support of "
        + "your modified version, and \n"
        + "     4. retain our contact information in regard to use of the base software. \n"
        + "\n"
        + "Permission to distribute the released version of the source code along with corr"
        + "esponding source modifications in the form of a patch file is granted with same "
        + "provisions 2 through 4 for binary distributions.\n"
        + "\n"
        + "This software is provided \"as is\" without express or implied warranty to the ext"
        + "ent permitted by applicable law.\n"
; // the license text
    }
 
    
}
