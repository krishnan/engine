package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:45Z
 * LicenseName: AGPL-3.0+
 * FileName: MakeIndex.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MakeIndex extends License{
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
        return "MakeIndex"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "MakeIndex License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "MakeIndex Distribution Notice\n"
        + "\n"
        + "11/11/1989\n"
        + "\n"
        + "Copyright (C) 1989 by Chen & Harrison International Systems, Inc.\n"
        + "Copyright (C) 1988 by Olivetti Research Center\n"
        + "Copyright (C) 1987 by Regents of the University of California\n"
        + "\n"
        + "Author:\n"
        + "     Pehong Chen (phc@renoir.berkeley.edu)\n"
        + "     Chen & Harrison International Systems, Inc.\n"
        + "     Palo Alto, California\n"
        + "     USA\n"
        + "\n"
        + "Permission is hereby granted to make and distribute original copies of this prog"
        + "ram provided that the copyright notice and this permission notice are preserved "
        + "and provided that the recipient is not asked to waive or limit his right to redi"
        + "stribute copies as allowed by this permission notice and provided that anyone wh"
        + "o receives an executable form of this program is granted access to a machine-rea"
        + "dable form of the source code for this program at a cost not greater than reason"
        + "able reproduction, shipping, and handling costs.  Executable forms of this progr"
        + "am distributed without the source code must be accompanied by a conspicuous copy"
        + " of this permission notice and a statement that tells the recipient how to obtai"
        + "n the source code.\n"
        + "\n"
        + "Permission is granted to distribute modified versions of all or part of this pro"
        + "gram under the conditions above with the additional requirement that the entire "
        + "modified work must be covered by a permission notice identical to this permissio"
        + "n notice. Anything distributed with and usable only in conjunction with somethin"
        + "g derived from this program, whose useful purpose is to extend or adapt or add c"
        + "apabilities to this program, is to be considered a modified version of this prog"
        + "ram under the requirement above.  Ports of this program to other systems not sup"
        + "ported in the distribution are also considered modified versions.  All modified "
        + "versions should be reported back to the author.\n"
        + "\n"
        + "This program is distributed with no warranty of any sort.  No contributor accept"
        + "s responsibility for the consequences of using this program or for whether it se"
        + "rves any particular purpose.\n"
; // the license text
    }
 
    
}
