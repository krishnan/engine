package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:24Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: SCEA.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class SCEA extends License{
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
        return "SCEA"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "SCEA Shared Source License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "SCEA Shared Source License 1.0\n"
        + "\n"
        + "Terms and Conditions:\n"
        + "\n"
        + "1. Definitions:\n"
        + "\n"
        + "\"Software\" shall mean the software and related documentation, whether in Source "
        + "or Object Form, made available under this SCEA Shared Source license (\"License\")"
        + ", that is indicated by a copyright notice file included in the source files or a"
        + "ttached or accompanying the source files.\n"
        + "\n"
        + "\"Licensor\" shall mean Sony Computer Entertainment America, Inc. (herein \"SCEA\")\n"
        + "\n"
        + "\"Object Code\" or \"Object Form\" shall mean any form that results from translation"
        + " or transformation of Source Code, including but not limited to compiled object "
        + "code or conversions to other forms intended for machine execution.\n"
        + "\"Source Code\" or \"Source Form\" shall have the plain meaning generally accepted i"
        + "n the software industry, including but not limited to software source code, docu"
        + "mentation source, header and configuration files.\n"
        + "\n"
        + "\"You\" or \"Your\" shall mean you as an individual or as a company, or whichever fo"
        + "rm under which you are exercising rights under this License.\n"
        + "\n"
        + "2. License Grant.\n"
        + "\n"
        + "Licensor hereby grants to You, free of charge subject to the terms and condition"
        + "s of this License, an irrevocable, non-exclusive, worldwide, perpetual, and roya"
        + "lty-free license to use, modify, reproduce, distribute, publicly perform or disp"
        + "lay the Software in Object or Source Form .\n"
        + "\n"
        + "3. No Right to File for Patent.\n"
        + "In exchange for the rights that are granted to You free of charge under this Lic"
        + "ense, You agree that You will not file for any patent application, seek copyrigh"
        + "t protection or take any other action that might otherwise impair the ownership "
        + "rights in and to the Software that may belong to SCEA or any of the other contri"
        + "butors/authors of the Software.\n"
        + "\n"
        + "4. Contributions.\n"
        + "\n"
        + "SCEA welcomes contributions in form of modifications, optimizations, tools or do"
        + "cumentation designed to improve or expand the performance and scope of the Softw"
        + "are (collectively \"Contributions\"). Per the terms of this License You are free t"
        + "o modify the Software and those modifications would belong to You. You may howev"
        + "er wish to donate Your Contributions to SCEA for consideration for inclusion int"
        + "o the Software. For the avoidance of doubt, if You elect to send Your Contributi"
        + "ons to SCEA, You are doing so voluntarily and are giving the Contributions to SC"
        + "EA and its parent company Sony Computer Entertainment, Inc., free of charge, to "
        + "use, modify or distribute in any form or in any manner. SCEA acknowledges that i"
        + "f You make a donation of Your Contributions to SCEA, such Contributions shall no"
        + "t exclusively belong to SCEA or its parent company and such donation shall not b"
        + "e to Your exclusion. SCEA, in its sole discretion, shall determine whether or no"
        + "t to include Your donated Contributions into the Software, in whole, in part, or"
        + " as modified by SCEA. Should SCEA elect to include any such Contributions into t"
        + "he Software, it shall do so at its own risk and may elect to give credit or spec"
        + "ial thanks to any such contributors in the attached copyright notice. However, i"
        + "f any of Your contributions are included into the Software, they will become par"
        + "t of the Software and will be distributed under the terms and conditions of this"
        + " License. Further, if Your donated Contributions are integrated into the Softwar"
        + "e then Sony Computer Entertainment, Inc. shall become the copyright owner of the"
        + " Software now containing Your contributions and SCEA would be the Licensor.\n"
        + "\n"
        + "5. Redistribution in Source Form\n"
        + "\n"
        + "You may redistribute copies of the Software, modifications or derivatives thereo"
        + "f in Source Code Form, provided that You:\n"
        + "\n"
        + "     a. Include a copy of this License and any copyright notices with source\n"
        + "     \n"
        + "     b. Identify modifications if any were made to the Software\n"
        + "\n"
        + "     c. Include a copy of all documentation accompanying the Software and modifi"
        + "cations made by You\n"
        + "\n"
        + "6. Redistribution in Object Form\n"
        + "\n"
        + "If You redistribute copies of the Software, modifications or derivatives thereof"
        + " in Object Form only (as incorporated into finished goods, i.e. end user applica"
        + "tions) then You will not have a duty to include any copies of the code, this Lic"
        + "ense, copyright notices, other attributions or documentation.\n"
        + "\n"
        + "7. No Warranty\n"
        + "\n"
        + "THE SOFTWARE IS PROVIDED ON AN \"AS IS\" BASIS, WITHOUT ANY REPRESENTATIONS OR WAR"
        + "RANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, A"
        + "NY WARRANTIES OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY, OR FITNESS FOR A PART"
        + "ICULAR PURPOSE. YOU ARE SOLELY RESPONSIBLE FOR DETERMINING THE APPROPRIATENESS O"
        + "F USING, MODIFYING OR REDISTRIBUTING THE SOFTWARE AND ASSUME ANY RISKS ASSOCIATE"
        + "D WITH YOUR EXERCISE OF PERMISSIONS UNDER THIS LICENSE.\n"
        + "\n"
        + "8. Limitation of Liability\n"
        + "\n"
        + "UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY WILL EITHER PARTY BE LIABLE TO "
        + "THE OTHER PARTY OR ANY THIRD PARTY FOR ANY DIRECT, INDIRECT, CONSEQUENTIAL, SPEC"
        + "IAL, INCIDENTAL, OR EXEMPLARY DAMAGES WITH RESPECT TO ANY INJURY, LOSS, OR DAMAG"
        + "E, ARISING UNDER OR IN CONNECTION WITH THIS LETTER AGREEMENT, WHETHER FORESEEABL"
        + "E OR UNFORESEEABLE, EVEN IF SUCH PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SU"
        + "CH INJURY, LOSS, OR DAMAGE. THE LIMITATIONS OF LIABILITY SET FORTH IN THIS SECTI"
        + "ON SHALL APPLY TO THE FULLEST EXTENT PERMISSIBLE AT LAW OR ANY GOVERMENTAL REGUL"
        + "ATIONS.\n"
        + "\n"
        + "9. Governing Law and Consent to Jurisdiction\n"
        + "\n"
        + "This Agreement shall be governed by and interpreted in accordance with the laws "
        + "of the State of California, excluding that body of law related to choice of laws"
        + ", and of the United States of America. Any action or proceeding brought to enfor"
        + "ce the terms of this Agreement or to adjudicate any dispute arising hereunder sh"
        + "all be brought in the Superior Court of the County of San Mateo, State of Califo"
        + "rnia or the United States District Court for the Northern District of California"
        + ". Each of the parties hereby submits itself to the exclusive jurisdiction and ve"
        + "nue of such courts for purposes of any such action. In addition, each party here"
        + "by waives the right to a jury trial in any action or proceeding related to this "
        + "Agreement.\n"
        + "\n"
        + "10. Copyright Notice for Redistribution of Source Code\n"
        + "\n"
        + "Copyright 2005 Sony Computer Entertainment Inc.\n"
        + "\n"
        + "Licensed under the SCEA Shared Source License, Version 1.0 (the \"License\"); you "
        + "may not use this file except in compliance with the License. You may obtain a co"
        + "py of the License at:\n"
        + "http://research.scea.com/scea_shared_source_license.html\n"
        + "\n"
        + "Unless required by applicable law or agreed to in writing, software distributed "
        + "under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR COND"
        + "ITIONS OF ANY KIND, either express or implied. See the License for the specific "
        + "language governing permissions and limitations under the License.\n"
; // the license text
    }
 
    
}
