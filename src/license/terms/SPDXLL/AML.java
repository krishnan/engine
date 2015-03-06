package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:01Z
 * LicenseName: AGPL-3.0+
 * FileName: AML.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class AML extends License{
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
        return "AML"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Apple MIT License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright: Copyright (c) 2006 by Apple Computer, Inc., All Rights Reserved.\n"
        + "\n"
        + "IMPORTANT: This Apple software is supplied to you by Apple Computer, Inc. (\"Appl"
        + "e\") in consideration of your agreement to the following terms, and your use, ins"
        + "tallation, modification or redistribution of this Apple software constitutes acc"
        + "eptance of these terms. If you do not agree with these terms, please do not use,"
        + " install, modify or redistribute this Apple software.\n"
        + "\n"
        + "In consideration of your agreement to abide by the following terms, and subject "
        + "to these terms, Apple grants you a personal, non-exclusive license, under Apple'"
        + "s copyrights in this original Apple software (the \"Apple Software\"), to use, rep"
        + "roduce, modify and redistribute the Apple Software, with or without modification"
        + "s, in source and/or binary forms; provided that if you redistribute the Apple So"
        + "ftware in its entirety and without modifications, you must retain this notice an"
        + "d the following text and disclaimers in all such redistributions of the Apple So"
        + "ftware. Neither the name, trademarks, service marks or logos of Apple Computer, "
        + "Inc. may be used to endorse or promote products derived from the Apple Software "
        + "without specific prior written permission from Apple. Except as expressly stated"
        + " in this notice, no other rights or licenses, express or implied, are granted by"
        + " Apple herein, including but not limited to any patent rights that may be infrin"
        + "ged by your derivative works or by other works in which the Apple Software may b"
        + "e incorporated.\n"
        + "\n"
        + "The Apple Software is provided by Apple on an \"AS IS\" basis. APPLE MAKES NO WARR"
        + "ANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE IMPLIED WARRANTIES "
        + "OF NON-INFRINGEMENT, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, REGAR"
        + "DING THE APPLE SOFTWARE OR ITS USE AND OPERATION ALONE OR IN COMBINATION WITH YO"
        + "UR PRODUCTS.\n"
        + "\n"
        + "IN NO EVENT SHALL APPLE BE LIABLE FOR ANY SPECIAL, INDIRECT, INCIDENTAL OR CONSE"
        + "QUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS"
        + " OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) ARISING I"
        + "N ANY WAY OUT OF THE USE, REPRODUCTION, MODIFICATION AND/OR DISTRIBUTION OF THE "
        + "APPLE SOFTWARE, HOWEVER CAUSED AND WHETHER UNDER THEORY OF CONTRACT, TORT (INCLU"
        + "DING NEGLIGENCE), STRICT LIABILITY OR OTHERWISE, EVEN IF APPLE HAS BEEN ADVISED "
        + "OF THE POSSIBILITY OF SUCH DAMAGE.\n"
; // the license text
    }
 
    
}
