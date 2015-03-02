package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:34Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: TCL.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class TCL extends License{
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
        return "TCL"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "TCL/TK License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This software is copyrighted by the Regents of the University of California, Sun"
        + " Microsystems, Inc., Scriptics Corporation, ActiveState Corporation and other pa"
        + "rties. The following terms apply to all files associated with the software unles"
        + "s explicitly disclaimed in individual files.\n"
        + "\n"
        + "The authors hereby grant permission to use, copy, modify, distribute, and licens"
        + "e this software and its documentation for any purpose, provided that existing co"
        + "pyright notices are retained in all copies and that this notice is included verb"
        + "atim in any distributions. No written agreement, license, or royalty fee is requ"
        + "ired for any of the authorized uses. Modifications to this software may be copyr"
        + "ighted by their authors and need not follow the licensing terms described here, "
        + "provided that the new terms are clearly indicated on the first page of each file"
        + " where they apply.\n"
        + "\n"
        + "IN NO EVENT SHALL THE AUTHORS OR DISTRIBUTORS BE LIABLE TO ANY PARTY FOR DIRECT,"
        + " INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE "
        + "OF THIS SOFTWARE, ITS DOCUMENTATION, OR ANY DERIVATIVES THEREOF, EVEN IF THE AUT"
        + "HORS HAVE BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n"
        + "\n"
        + "THE AUTHORS AND DISTRIBUTORS SPECIFICALLY DISCLAIM ANY WARRANTIES, INCLUDING, BU"
        + "T NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTI"
        + "CULAR PURPOSE, AND NON-INFRINGEMENT. THIS SOFTWARE IS PROVIDED ON AN \"AS IS\" BAS"
        + "IS, AND THE AUTHORS AND DISTRIBUTORS HAVE NO OBLIGATION TO PROVIDE MAINTENANCE, "
        + "SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.\n"
        + "\n"
        + "GOVERNMENT USE: If you are acquiring this software on behalf of the U.S. governm"
        + "ent, the Government shall have only \"Restricted Rights\" in the software and rela"
        + "ted documentation as defined in the Federal Acquisition Regulations (FARs) in Cl"
        + "ause 52.227.19 (c) (2). If you are acquiring the software on behalf of the Depar"
        + "tment of Defense, the software shall be classified as \"Commercial Computer Softw"
        + "are\" and the Government shall have only \"Restricted Rights\" as defined in Clause"
        + " 252.227-7013 (c) (1) of DFARs. Notwithstanding the foregoing, the authors grant"
        + " the U.S. Government and others acting in its behalf permission to use and distr"
        + "ibute the software in accordance with the terms specified in this license. \n"
; // the license text
    }
 
    
}
