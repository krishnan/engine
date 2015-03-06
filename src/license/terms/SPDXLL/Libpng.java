package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:43Z
 * LicenseName: AGPL-3.0+
 * FileName: Libpng.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class Libpng extends License{
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
        return "Libpng"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "libpng License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "This copy of the libpng notices is provided for your convenience.  In case of an"
        + "y discrepancy between this copy and the notices in the file png.h that is includ"
        + "ed in the libpng distribution, the latter shall prevail.\n"
        + "\n"
        + "COPYRIGHT NOTICE, DISCLAIMER, and LICENSE:\n"
        + "\n"
        + "If you modify libpng you may insert additional notices immediately following thi"
        + "s sentence. \n"
        + "\n"
        + "This code is released under the libpng license.\n"
        + "\n"
        + "libpng versions 1.2.6, August 15, 2004, through 1.4.5, December 9, 2010, are Cop"
        + "yright (c) 2004, 2006-2010 Glenn Randers-Pehrson, and are distributed according "
        + "to the same disclaimer and license as libpng-1.2.5 with the following individual"
        + " added to the list of Contributing Authors\n"
        + "\n"
        + "     Cosmin Truta\n"
        + "\n"
        + "libpng versions 1.0.7, July 1, 2000, through 1.2.5 - October 3, 2002, are\n"
        + "Copyright (c) 2000-2002 Glenn Randers-Pehrson, and are distributed according to "
        + "the same disclaimer and license as libpng-1.0.6 with the following individuals a"
        + "dded to the list of Contributing Authors\n"
        + "\n"
        + "     Simon-Pierre Cadieux\n"
        + "     Eric S. Raymond\n"
        + "     Gilles Vollant\n"
        + "\n"
        + "and with the following additions to the disclaimer:\n"
        + "\n"
        + "     There is no warranty against interference with your enjoyment of the librar"
        + "y or against infringement.  There is no warranty that our efforts or the library"
        + " will fulfill any of your particular purposes or needs.  This library is provide"
        + "d with all faults, and the entire risk of satisfactory quality, performance, acc"
        + "uracy, and effort is with the user.\n"
        + "\n"
        + "libpng versions 0.97, January 1998, through 1.0.6, March 20, 2000, are\n"
        + "Copyright (c) 1998, 1999 Glenn Randers-Pehrson, and are distributed according to"
        + " the same disclaimer and license as libpng-0.96, with the following individuals "
        + "added to the list of Contributing Authors:\n"
        + "\n"
        + "     Tom Lane\n"
        + "     Glenn Randers-Pehrson\n"
        + "     Willem van Schaik\n"
        + "\n"
        + "libpng versions 0.89, June 1996, through 0.96, May 1997, are\n"
        + "Copyright (c) 1996, 1997 Andreas Digger\n"
        + "Distributed according to the same disclaimer and license as libpng-0.88, with th"
        + "e following individuals added to the list of Contributing Authors:\n"
        + "\n"
        + "     John Bowler\n"
        + "     Kevin Bracey\n"
        + "     Sam Bushell\n"
        + "     Magnus Holmgren\n"
        + "     Greg Roelofs\n"
        + "     Tom Tanner\n"
        + "\n"
        + "libpng versions 0.5, May 1995, through 0.88, January 1996, are\n"
        + "Copyright (c) 1995, 1996 Guy Eric Schalnat, Group 42, Inc.\n"
        + "\n"
        + "For the purposes of this copyright and license, \"Contributing Authors\" is define"
        + "d as the following set of individuals:\n"
        + "\n"
        + "     Andreas Dilger\n"
        + "     Dave Martindale\n"
        + "     Guy Eric Schalnat\n"
        + "     Paul Schmidt\n"
        + "     Tim Wegner\n"
        + "\n"
        + "The PNG Reference Library is supplied \"AS IS\".  The Contributing Authors and Gro"
        + "up 42, Inc. disclaim all warranties, expressed or implied, including, without li"
        + "mitation, the warranties of merchantability and of fitness for any purpose.  The"
        + " Contributing Authors and Group 42, Inc. assume no liability for direct, indirec"
        + "t, incidental, special, exemplary, or consequential damages, which may result fr"
        + "om the use of the PNG Reference Library, even if advised of the possibility of s"
        + "uch damage.\n"
        + "\n"
        + "Permission is hereby granted to use, copy, modify, and distribute this source co"
        + "de, or portions hereof, for any purpose, without fee, subject to the following r"
        + "estrictions:\n"
        + "\n"
        + "1. The origin of this source code must not be misrepresented.\n"
        + "\n"
        + "2. Altered versions must be plainly marked as such and must not be misrepresente"
        + "d as being the original source.\n"
        + "\n"
        + "3. This Copyright notice may not be removed or altered from any source or altere"
        + "d source distribution.\n"
        + "\n"
        + "The Contributing Authors and Group 42, Inc. specifically permit, without fee, an"
        + "d encourage the use of this source code as a component to supporting the PNG fil"
        + "e format in commercial products.  If you use this source code in a product, ackn"
        + "owledgment is not required but would be appreciated.\n"
        + "\n"
        + "\n"
        + "A \"png_get_copyright\" function is available, for convenient use in \"about\" boxes"
        + " and the like:\n"
        + "\n"
        + "     printf(\"%s\",png_get_copyright(NULL));\n"
        + "\n"
        + "Also, the PNG logo (in PNG format, of course) is supplied in the files \"pngbar.p"
        + "ng\" and \"pngbar.jpg (88x31) and \"pngnow.png\" (98x31).\n"
        + "\n"
        + "Libpng is OSI Certified Open Source Software.  OSI Certified Open Source is a ce"
        + "rtification mark of the Open Source Initiative.\n"
        + "\n"
        + "Glenn Randers-Pehrson\n"
        + "glennrp at users.sourceforge.net\n"
        + "December 9, 2010\n"
; // the license text
    }
 
    
}
