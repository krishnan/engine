package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:59Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: DSDP.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class DSDP extends License{
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
        return "DSDP"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "DSDP License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "COPYRIGHT NOTIFICATION\n"
        + "\n"
        + "(C) COPYRIGHT 2004 UNIVERSITY OF CHICAGO\n"
        + "\n"
        + "This program discloses material protectable under copyright laws of the United S"
        + "tates. Permission to copy and modify this software and its documentation is here"
        + "by granted, provided that this notice is retained thereon and on all copies or m"
        + "odifications. The University of Chicago makes no representations as to the suita"
        + "bility and operability of this software for any purpose. It is provided \"as is\";"
        + " without express or implied warranty. Permission is hereby granted to use, repro"
        + "duce, prepare derivative works, and to redistribute to others, so long as this o"
        + "riginal copyright notice is retained. Any publication resulting from research th"
        + "at made use of this software should cite this document.\n"
        + "\n"
        + "     This software was authored by:\n"
        + "\n"
        + "     Steven J. Benson Mathematics and Computer Science Division Argonne National"
        + " Laboratory Argonne IL 60439\n"
        + "\n"
        + "     Yinyu Ye Department of Management Science and Engineering Stanford Universi"
        + "ty Stanford, CA U.S.A\n"
        + "\n"
        + "     Any questions or comments on the software may be directed to benson@mcs.anl"
        + ".gov or yinyu-ye@stanford.edu \n"
        + "\n"
        + "Argonne National Laboratory with facilities in the states of Illinois and Idaho,"
        + " is owned by The United States Government, and operated by the University of Chi"
        + "cago under provision of a contract with the Department of Energy.\n"
        + "\n"
        + "DISCLAIMER \n"
        + "THIS PROGRAM WAS PREPARED AS AN ACCOUNT OF WORK SPONSORED BY AN AGENCY OF THE UN"
        + "ITED STATES GOVERNMENT. NEITHER THE UNITED STATES GOVERNMENT NOR ANY AGENCY THER"
        + "EOF, NOR THE UNIVERSITY OF CHICAGO, NOR ANY OF THEIR EMPLOYEES OR OFFICERS, MAKE"
        + "S ANY WARRANTY, EXPRESS OR IMPLIED, OR ASSUMES ANY LEGAL LIABILITY OR RESPONSIBI"
        + "LITY FOR THE ACCURACY, COMPLETENESS, OR USEFULNESS OF ANY INFORMATION, APPARATUS"
        + ", PRODUCT, OR PROCESS DISCLOSED, OR REPRESENTS THAT ITS USE WOULD NOT INFRINGE P"
        + "RIVATELY OWNED RIGHTS. REFERENCE HEREIN TO ANY SPECIFIC COMMERCIAL PRODUCT, PROC"
        + "ESS, OR SERVICE BY TRADE NAME, TRADEMARK, MANUFACTURER, OR OTHERWISE, DOES NOT N"
        + "ECESSARILY CONSTITUTE OR IMPLY ITS ENDORSEMENT, RECOMMENDATION, OR FAVORING BY T"
        + "HE UNITED STATES GOVERNMENT OR ANY AGENCY THEREOF. THE VIEW AND OPINIONS OF AUTH"
        + "ORS EXPRESSED HEREIN DO NOT NECESSARILY STATE OR REFLECT THOSE OF THE UNITED STA"
        + "TES GOVERNMENT OR ANY AGENCY THEREOF.\n"
; // the license text
    }
 
    
}
