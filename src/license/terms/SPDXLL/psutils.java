package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:16Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: psutils.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class psutils extends License{
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
        return "psutils"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "psutils License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "PS Utilities Package\n"
        + "\n"
        + "The constituent files of this package listed below are copyright (C) 1991-1995 A"
        + "ngus J. C. Duggan.\n"
        + "\n"
        + "LICENSE          Makefile.msc     Makefile.nt   Makefile.os2\n"
        + "Makefile.unix    README           config.h         descrip.mms\n"
        + "epsffit.c        epsffit.man  extractres.man   extractres.pl\n"
        + "fixdlsrps.man    fixdlsrps.pl     fixfmps.man   fixfmps.pl\n"
        + "fixmacps.man     fixmacps.pl  fixpsditps.man   fixpsditps.pl\n"
        + "fixpspps.man     fixpspps.pl  fixscribeps.man  fixscribeps.pl\n"
        + "fixtpps.man fixtpps.pl  fixwfwps.man     fixwfwps.pl\n"
        + "fixwpps.man fixwpps.pl  fixwwps.man   fixwwps.pl\n"
        + "getafm           getafm.man  includeres.man   includeres.pl\n"
        + "maketext         patchlev.h  psbook.c         psbook.man\n"
        + "pserror.c        pserror.h        psmerge.man   psmerge.pl\n"
        + "psnup.c          psnup.man        psresize.c   psresize.man\n"
        + "psselect.c psselect.man     psspec.c         psspec.h\n"
        + "pstops.c         pstops.man  psutil.c         psutil.h\n"
        + "showchar\n"
        + "\n"
        + "They may be copied and used for any purpose (including distribution as part of a"
        + " for-profit product), provided:\n"
        + "\n"
        + "1) The original attribution of the programs is clearly displayed in the product "
        + "and/or documentation, even if the programs are modified and/or renamed as part o"
        + "f the product.\n"
        + "\n"
        + "2) The original source code of the programs is provided free of charge (except f"
        + "or reasonable distribution costs). For a definition of reasonable distribution c"
        + "osts, see the Gnu General Public License or Larry Wall's Artistic License (provi"
        + "ded with the Perl 4 kit). The GPL and Artistic License in NO WAY affect this lic"
        + "ense; they are merely used as examples of the spirit in which it is intended.\n"
        + "\n"
        + "3) These programs are provided \"as-is\". No warranty or guarantee of their fitnes"
        + "s for any particular task is provided. Use of these programs is completely at yo"
        + "ur own risk.\n"
        + "\n"
        + "Basically, I don't mind how you use the programs so long as you acknowledge the "
        + "author, and give people the originals if they want them.\n"
; // the license text
    }
 
    
}
