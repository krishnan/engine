package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:52Z
 * LicenseName: AGPL-3.0+
 * FileName: CC0_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CC0_1_0 extends License{
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
        return "CC0-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Creative Commons Zero v1.0 Universal"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Creative Commons CC0 1.0 Universal\n"
        + "\n"
        + "<<beginOptional;name=ccOptionalIntro>> CREATIVE COMMONS CORPORATION IS NOT A LAW"
        + " FIRM AND DOES NOT PROVIDE LEGAL SERVICES. DISTRIBUTION OF THIS DOCUMENT DOES NO"
        + "T CREATE AN ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS INFORMA"
        + "TION ON AN \"AS-IS\" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES REGARDING THE USE"
        + " OF THIS DOCUMENT OR THE INFORMATION OR WORKS PROVIDED HEREUNDER, AND DISCLAIMS "
        + "LIABILITY FOR DAMAGES RESULTING FROM THE USE OF THIS DOCUMENT OR THE INFORMATION"
        + " OR WORKS PROVIDED HEREUNDER.  <<endOptional>>\n"
        + "\n"
        + "Statement of Purpose\n"
        + "\n"
        + "The laws of most jurisdictions throughout the world automatically confer exclusi"
        + "ve Copyright and Related Rights (defined below) upon the creator and subsequent "
        + "owner(s) (each and all, an \"owner\") of an original work of authorship and/or a d"
        + "atabase (each, a \"Work\").\n"
        + "\n"
        + "Certain owners wish to permanently relinquish those rights to a Work for the pur"
        + "pose of contributing to a commons of creative, cultural and scientific works (\"C"
        + "ommons\") that the public can reliably and without fear of later claims of infrin"
        + "gement build upon, modify, incorporate in other works, reuse and redistribute as"
        + " freely as possible in any form whatsoever and for any purposes, including witho"
        + "ut limitation commercial purposes. These owners may contribute to the Commons to"
        + " promote the ideal of a free culture and the further production of creative, cul"
        + "tural and scientific works, or to gain reputation or greater distribution for th"
        + "eir Work in part through the use and efforts of others.\n"
        + "\n"
        + "For these and/or other purposes and motivations, and without any expectation of "
        + "additional consideration or compensation, the person associating CC0 with a Work"
        + " (the \"Affirmer\"), to the extent that he or she is an owner of Copyright and Rel"
        + "ated Rights in the Work, voluntarily elects to apply CC0 to the Work and publicl"
        + "y distribute the Work under its terms, with knowledge of his or her Copyright an"
        + "d Related Rights in the Work and the meaning and intended legal effect of CC0 on"
        + " those rights.\n"
        + "\n"
        + "1. Copyright and Related Rights. A Work made available under CC0 may be protecte"
        + "d by copyright and related or neighboring rights (\"Copyright and Related Rights\""
        + "). Copyright and Related Rights include, but are not limited to, the following:\n"
        + "\n"
        + "     i. the right to reproduce, adapt, distribute, perform, display, communicate"
        + ", and translate a Work;\n"
        + "\n"
        + "     ii. moral rights retained by the original author(s) and/or performer(s);\n"
        + "\n"
        + "     iii. publicity and privacy rights pertaining to a person's image or likenes"
        + "s depicted in a Work;\n"
        + "\n"
        + "     iv. rights protecting against unfair competition in regards to a Work, subj"
        + "ect to the limitations in paragraph 4(a), below;\n"
        + "\n"
        + "     v. rights protecting the extraction, dissemination, use and reuse of data i"
        + "n a Work;\n"
        + "\n"
        + "     vi. database rights (such as those arising under Directive 96/9/EC of the E"
        + "uropean Parliament and of the Council of 11 March 1996 on the legal protection o"
        + "f databases, and under any national implementation thereof, including any amende"
        + "d or successor version of such directive); and\n"
        + "\n"
        + "     vii. other similar, equivalent or corresponding rights throughout the world"
        + " based on applicable law or treaty, and any national implementations thereof.\n"
        + "\n"
        + "2. Waiver. To the greatest extent permitted by, but not in contravention of, app"
        + "licable law, Affirmer hereby overtly, fully, permanently, irrevocably and uncond"
        + "itionally waives, abandons, and surrenders all of Affirmer's Copyright and Relat"
        + "ed Rights and associated claims and causes of action, whether now known or unkno"
        + "wn (including existing as well as future claims and causes of action), in the Wo"
        + "rk (i) in all territories worldwide, (ii) for the maximum duration provided by a"
        + "pplicable law or treaty (including future time extensions), (iii) in any current"
        + " or future medium and for any number of copies, and (iv) for any purpose whatsoe"
        + "ver, including without limitation commercial, advertising or promotional purpose"
        + "s (the \"Waiver\"). Affirmer makes the Waiver for the benefit of each member of th"
        + "e public at large and to the detriment of Affirmer's heirs and successors, fully"
        + " intending that such Waiver shall not be subject to revocation, rescission, canc"
        + "ellation, termination, or any other legal or equitable action to disrupt the qui"
        + "et enjoyment of the Work by the public as contemplated by Affirmer's express Sta"
        + "tement of Purpose.\n"
        + "\n"
        + "3. Public License Fallback. Should any part of the Waiver for any reason be judg"
        + "ed legally invalid or ineffective under applicable law, then the Waiver shall be"
        + " preserved to the maximum extent permitted taking into account Affirmer's expres"
        + "s Statement of Purpose. In addition, to the extent the Waiver is so judged Affir"
        + "mer hereby grants to each affected person a royalty-free, non transferable, non "
        + "sublicensable, non exclusive, irrevocable and unconditional license to exercise "
        + "Affirmer's Copyright and Related Rights in the Work (i) in all territories world"
        + "wide, (ii) for the maximum duration provided by applicable law or treaty (includ"
        + "ing future time extensions), (iii) in any current or future medium and for any n"
        + "umber of copies, and (iv) for any purpose whatsoever, including without limitati"
        + "on commercial, advertising or promotional purposes (the \"License\"). The License "
        + "shall be deemed effective as of the date CC0 was applied by Affirmer to the Work"
        + ". Should any part of the License for any reason be judged legally invalid or ine"
        + "ffective under applicable law, such partial invalidity or ineffectiveness shall "
        + "not invalidate the remainder of the License, and in such case Affirmer hereby af"
        + "firms that he or she will not (i) exercise any of his or her remaining Copyright"
        + " and Related Rights in the Work or (ii) assert any associated claims and causes "
        + "of action with respect to the Work, in either case contrary to Affirmer's expres"
        + "s Statement of Purpose.\n"
        + "\n"
        + "4. Limitations and Disclaimers.\n"
        + "\n"
        + "     a. No trademark or patent rights held by Affirmer are waived, abandoned, su"
        + "rrendered, licensed or otherwise affected by this document.\n"
        + "\n"
        + "     b. Affirmer offers the Work as-is and makes no representations or warrantie"
        + "s of any kind concerning the Work, express, implied, statutory or otherwise, inc"
        + "luding without limitation warranties of title, merchantability, fitness for a pa"
        + "rticular purpose, non infringement, or the absence of latent or other defects, a"
        + "ccuracy, or the present or absence of errors, whether or not discoverable, all t"
        + "o the greatest extent permissible under applicable law.\n"
        + "\n"
        + "     c. Affirmer disclaims responsibility for clearing rights of other persons t"
        + "hat may apply to the Work or any use thereof, including without limitation any p"
        + "erson's Copyright and Related Rights in the Work. Further, Affirmer disclaims re"
        + "sponsibility for obtaining any necessary consents, permissions or other rights r"
        + "equired for any use of the Work.\n"
        + "\n"
        + "     d. Affirmer understands and acknowledges that Creative Commons is not a par"
        + "ty to this document and has no duty or obligation with respect to this CC0 or us"
        + "e of the Work. \n"
; // the license text
    }
 
    
}
