package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:23Z
 * LicenseName: AGPL-3.0+
 * FileName: MIT_CMU.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class MIT_CMU extends License{
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
        return "MIT-CMU"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "CMU License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright 1989, 1991, 1992 by Carnegie Mellon University\n"
        + "\n"
        + "Derivative Work - 1996, 1998-2000 Copyright 1996, 1998-2000 The Regents of the U"
        + "niversity of California\n"
        + "\n"
        + "All Rights Reserved\n"
        + "\n"
        + "Permission to use, copy, modify and distribute this software and its documentati"
        + "on for any purpose and without fee is hereby granted, provided that the above co"
        + "pyright notice appears in all copies and that both that copyright notice and thi"
        + "s permission notice appear in supporting documentation, and that the name of CMU"
        + " and The Regents of the University of California not be used in advertising or p"
        + "ublicity pertaining to distribution of the software without specific written per"
        + "mission.\n"
        + "\n"
        + "CMU AND THE REGENTS OF THE UNIVERSITY OF CALIFORNIA DISCLAIM ALL WARRANTIES WITH"
        + " REGARD TO THIS SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AN"
        + "D FITNESS. IN NO EVENT SHALL CMU OR THE REGENTS OF THE UNIVERSITY OF CALIFORNIA "
        + "BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHAT"
        + "SOEVER RESULTING FROM THE LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF "
        + "CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION W"
        + "ITH THE USE OR PERFORMANCE OF THIS SOFTWARE.\n"
; // the license text
    }
 
    
}
