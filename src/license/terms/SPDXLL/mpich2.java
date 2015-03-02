package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:51Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: mpich2.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class mpich2 extends License{
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
        return "mpich2"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "mpich2 License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "COPYRIGHT\n"
        + "\n"
        + "The following is a notice of limited availability of the code, and disclaimer wh"
        + "ich must be included in the prologue of the code and in all source listings of t"
        + "he code.\n"
        + "\n"
        + "Copyright Notice \n"
        + "+ 2002 University of Chicago\n"
        + "\n"
        + "Permission is hereby granted to use, reproduce, prepare derivative works, and to"
        + " redistribute to others. This software was authored by:\n"
        + "\n"
        + "Argonne National Laboratory Group W. Gropp: (630) 252-4318; FAX: (630) 252-5986;"
        + " e-mail: gropp@mcs.anl.gov E. Lusk: (630) 252-7852; FAX: (630) 252-5986; e-mail:"
        + " lusk@mcs.anl.gov Mathematics and Computer Science Division Argonne National Lab"
        + "oratory, Argonne IL 60439 \n"
        + "\n"
        + "GOVERNMENT LICENSE\n"
        + "\n"
        + "Portions of this material resulted from work developed under a U.S. Government C"
        + "ontract and are subject to the following license: the Government is granted for "
        + "itself and others acting on its behalf a paid-up, nonexclusive, irrevocable worl"
        + "dwide license in this computer software to reproduce, prepare derivative works, "
        + "and perform publicly and display publicly.\n"
        + "\n"
        + "DISCLAIMER\n"
        + "\n"
        + "This computer code material was prepared, in part, as an account of work sponsor"
        + "ed by an agency of the United States Government. Neither the United States, nor "
        + "the University of Chicago, nor any of their employees, makes any warranty expres"
        + "s or implied, or assumes any legal liability or responsibility for the accuracy,"
        + " completeness, or usefulness of any information, apparatus, product, or process "
        + "disclosed, or represents that its use would not infringe privately owned rights.\n"
; // the license text
    }
 
    
}
