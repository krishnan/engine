package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:58Z
 * LicenseName: AGPL-3.0+
 * FileName: DOC.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class DOC extends License{
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
        return "DOC"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "DOC License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Copyright and Licensing Information for ACE(TM), TAO(TM), CIAO(TM), DAnCE(TM), a"
        + "nd CoSMIC(TM)\n"
        + "\n"
        + "ACE(TM), TAO(TM), CIAO(TM), DAnCE>(TM), and CoSMIC(TM) (henceforth referred to a"
        + "s \"DOC software\") are copyrighted by Douglas C. Schmidt and his research group a"
        + "t Washington University, University of California, Irvine, and Vanderbilt Univer"
        + "sity, Copyright (c) 1993-2009, all rights reserved. Since DOC software is open-s"
        + "ource, freely available software, you are free to use, modify, copy, and distrib"
        + "ute--perpetually and irrevocably--the DOC software source code and object code p"
        + "roduced from the source, as well as copy and distribute modified versions of thi"
        + "s software. You must, however, include this copyright statement along with any c"
        + "ode built using DOC software that you release. No copyright statement needs to b"
        + "e provided if you just ship binary executables of your software products.\n"
        + "\n"
        + "You can use DOC software in commercial and/or binary software releases and are u"
        + "nder no obligation to redistribute any of your source code that is built using D"
        + "OC software. Note, however, that you may not misappropriate the DOC software cod"
        + "e, such as copyrighting it yourself or claiming authorship of the DOC software c"
        + "ode, in a way that will prevent DOC software from being distributed freely using"
        + " an open-source development model. You needn't inform anyone that you're using D"
        + "OC software in your software, though we encourage you to let us know so we can p"
        + "romote your project in the DOC software success stories.\n"
        + "\n"
        + "The ACE, TAO, CIAO, DAnCE, and CoSMIC web sites are maintained by the DOC Group "
        + "at the Institute for Software Integrated Systems (ISIS) and the Center for Distr"
        + "ibuted Object Computing of Washington University, St. Louis for the development "
        + "of open-source software as part of the open-source software community. Submissio"
        + "ns are provided by the submitter ``as is'' with no warranties whatsoever, includ"
        + "ing any warranty of merchantability, noninfringement of third party intellectual"
        + " property, or fitness for any particular purpose. In no event shall the submitte"
        + "r be liable for any direct, indirect, special, exemplary, punitive, or consequen"
        + "tial damages, including without limitation, lost profits, even if advised of the"
        + " possibility of such damages. Likewise, DOC software is provided as is with no w"
        + "arranties of any kind, including the warranties of design, merchantability, and "
        + "fitness for a particular purpose, noninfringement, or arising from a course of d"
        + "ealing, usage or trade practice. Washington University, UC Irvine, Vanderbilt Un"
        + "iversity, their employees, and students shall have no liability with respect to "
        + "the infringement of copyrights, trade secrets or any patents by DOC software or "
        + "any part thereof. Moreover, in no event will Washington University, UC Irvine, o"
        + "r Vanderbilt University, their employees, or students be liable for any lost rev"
        + "enue or profits or other special, indirect and consequential damages.\n"
        + "\n"
        + "DOC software is provided with no support and without any obligation on the part "
        + "of Washington University, UC Irvine, Vanderbilt University, their employees, or "
        + "students to assist in its use, correction, modification, or enhancement. A numbe"
        + "r of companies around the world provide commercial support for DOC software, how"
        + "ever. DOC software is Y2K-compliant, as long as the underlying OS platform is Y2"
        + "K-compliant. Likewise, DOC software is compliant with the new US daylight saving"
        + "s rule passed by Congress as \"The Energy Policy Act of 2005,\" which established "
        + "new daylight savings times (DST) rules for the United States that expand DST as "
        + "of March 2007. Since DOC software obtains time/date and calendaring information "
        + "from operating systems users will not be affected by the new DST rules as long a"
        + "s they upgrade their operating systems accordingly.\n"
        + "\n"
        + "The names ACE(TM), TAO(TM), CIAO(TM), DAnCE(TM), CoSMIC(TM), Washington Universi"
        + "ty, UC Irvine, and Vanderbilt University, may not be used to endorse or promote "
        + "products or services derived from this source without express written permission"
        + " from Washington University, UC Irvine, or Vanderbilt University. This license g"
        + "rants no permission to call products or services derived from this source ACE(TM"
        + "), TAO(TM), CIAO(TM), DAnCE(TM), or CoSMIC(TM), nor does it grant permission for"
        + " the name Washington University, UC Irvine, or Vanderbilt University to appear i"
        + "n their names.\n"
        + "\n"
        + "If you have any suggestions, additions, comments, or questions, please let me kn"
        + "ow.\n"
        + "\n"
        + "Douglas C. Schmidt\n"
; // the license text
    }
 
    
}
