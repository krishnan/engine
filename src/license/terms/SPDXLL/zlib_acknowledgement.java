package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:45Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: zlib_acknowledgement.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class zlib_acknowledgement extends License{
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
        return "zlib-acknowledgement"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "zlib/libpng License with Acknowledgement"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright (c) 2002-2007 Charlie Poole\n"
        + "Copyright (c) 2002-2004 James W. Newkirk, Michael C. Two, Alexei A. Vorontsov\n"
        + "Copyright (c) 2000-2002 Philip A. Craig\n"
        + "\n"
        + "This software is provided 'as-is', without any express or implied warranty. In n"
        + "o event will the authors be held liable for any damages arising from the use of "
        + "this software.\n"
        + "\n"
        + "Permission is granted to anyone to use this software for any purpose, including "
        + "commercial applications, and to alter it and redistribute it freely, subject to "
        + "the following restrictions:\n"
        + "\n"
        + "1. The origin of this software must not be misrepresented; you must not claim th"
        + "at you wrote the original software. If you use this software in a product, an ac"
        + "knowledgment (see the following) in the product documentation is required.\n"
        + "\n"
        + "     Portions Copyright (c) 2002-2007 Charlie Poole or Copyright (c) 2002-2004 J"
        + "ames W. Newkirk, Michael C. Two, Alexei A. Vorontsov or Copyright (c) 2000-2002 "
        + "Philip A. Craig\n"
        + "\n"
        + "2. Altered source versions must be plainly marked as such, and must not be misre"
        + "presented as being the original software.\n"
        + "\n"
        + "3. This notice may not be removed or altered from any source distribution.\n"
; // the license text
    }
 
    
}
