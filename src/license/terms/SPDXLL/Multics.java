package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:51Z
 * LicenseName: AGPL-3.0+
 * FileName: Multics.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Multics extends License{
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
        return "Multics"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Multics License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Multics License\n"
        + "\n"
        + "Historical Background\n"
        + "\n"
        + "This edition of the Multics software materials and documentation is provided and"
        + " donated to Massachusetts Institute of Technology by Group BULL including BULL H"
        + "N Information Systems Inc. as a contribution to computer science knowledge. This"
        + " donation is made also to give evidence of the common contributions of Massachus"
        + "etts Institute of Technology, Bell Laboratories, General Electric, Honeywell Inf"
        + "ormation Systems Inc., Honeywell BULL Inc., Groupe BULL and BULL HN Information "
        + "Systems Inc. to the development of this operating system. Multics development wa"
        + "s initiated by Massachusetts Institute of Technology Project MAC (1963-1970), re"
        + "named the MIT Laboratory for Computer Science and Artificial Intelligence in the"
        + " mid 1970s, under the leadership of Professor Fernando Jose Corbato. Users consi"
        + "der that Multics provided the best software architecture for managing computer h"
        + "ardware properly and for executing programs. Many subsequent operating systems i"
        + "ncorporated Multics principles. Multics was distributed in 1975 to 2000 by Group"
        + " Bull in Europe , and in the U.S. by Bull HN Information Systems Inc., as succes"
        + "sor in interest by change in name only to Honeywell Bull Inc. and Honeywell Info"
        + "rmation Systems Inc. .\n"
        + "\n"
        + "-----------------------------------------------------------\n"
        + "\n"
        + "Permission to use, copy, modify, and distribute these programs and their documen"
        + "tation for any purpose and without fee is hereby granted,provided that the below"
        + " copyright notice and historical background appear in all copies and that both t"
        + "he copyright notice and historical background and this permission notice appear "
        + "in supporting documentation, and that the names of MIT, HIS, BULL or BULL HN not"
        + " be used in advertising or publicity pertaining to distribution of the programs "
        + "without specific prior written permission. \n"
        + "\n"
        + "Copyright 1972 by Massachusetts Institute of Technology and Honeywell Informatio"
        + "n Systems Inc. \n"
        + "Copyright 2006 by BULL HN Information Systems Inc. \n"
        + "Copyright 2006 by Bull SAS All Rights Reserved\n"
; // the license text
    }
 
    
}
