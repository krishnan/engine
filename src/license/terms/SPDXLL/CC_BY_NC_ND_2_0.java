package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:44Z
 * LicenseName: AGPL-3.0+
 * FileName: CC_BY_NC_ND_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CC_BY_NC_ND_2_0 extends License{
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
        return "CC-BY-NC-ND-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Creative Commons Attribution Non Commercial No Derivatives 2.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Creative Commons Attribution-NonCommercial-NoDerivs 2.0\n"
        + "\n"
        + "<<beginOptional;name=ccOptionalIntro>>  CREATIVE COMMONS CORPORATION IS NOT A LA"
        + "W FIRM AND DOES NOT PROVIDE LEGAL SERVICES. DISTRIBUTION OF THIS LICENSE DOES NO"
        + "T CREATE AN ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS INFORMA"
        + "TION ON AN \"AS-IS\" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES REGARDING THE INF"
        + "ORMATION PROVIDED, AND DISCLAIMS LIABILITY FOR DAMAGES RESULTING FROM ITS USE. <"
        + "<endOptional>>\n"
        + "\n"
        + "License\n"
        + "\n"
        + "THE WORK (AS DEFINED BELOW) IS PROVIDED UNDER THE TERMS OF THIS CREATIVE COMMONS"
        + " PUBLIC LICENSE (\"CCPL\" OR \"LICENSE\"). THE WORK IS PROTECTED BY COPYRIGHT AND/OR"
        + " OTHER APPLICABLE LAW. ANY USE OF THE WORK OTHER THAN AS AUTHORIZED UNDER THIS L"
        + "ICENSE OR COPYRIGHT LAW IS PROHIBITED.\n"
        + "\n"
        + "BY EXERCISING ANY RIGHTS TO THE WORK PROVIDED HERE, YOU ACCEPT AND AGREE TO BE B"
        + "OUND BY THE TERMS OF THIS LICENSE. THE LICENSOR GRANTS YOU THE RIGHTS CONTAINED "
        + "HERE IN CONSIDERATION OF YOUR ACCEPTANCE OF SUCH TERMS AND CONDITIONS.\n"
        + "\n"
        + "1. Definitions\n"
        + "\n"
        + "     a. \"Collective Work\" means a work, such as a periodical issue, anthology or"
        + " encyclopedia, in which the Work in its entirety in unmodified form, along with "
        + "a number of other contributions, constituting separate and independent works in "
        + "themselves, are assembled into a collective whole. A work that constitutes a Col"
        + "lective Work will not be considered a Derivative Work (as defined below) for the"
        + " purposes of this License.\n"
        + "\n"
        + "     b. \"Derivative Work\" means a work based upon the Work or upon the Work and "
        + "other pre-existing works, such as a translation, musical arrangement, dramatizat"
        + "ion, fictionalization, motion picture version, sound recording, art reproduction"
        + ", abridgment, condensation, or any other form in which the Work may be recast, t"
        + "ransformed, or adapted, except that a work that constitutes a Collective Work wi"
        + "ll not be considered a Derivative Work for the purpose of this License. For the "
        + "avoidance of doubt, where the Work is a musical composition or sound recording, "
        + "the synchronization of the Work in timed-relation with a moving image (\"synching"
        + "\") will be considered a Derivative Work for the purpose of this License.\n"
        + "\n"
        + "     c. \"Licensor\" means the individual or entity that offers the Work under the"
        + " terms of this License.\n"
        + "\n"
        + "     d. \"Original Author\" means the individual or entity who created the Work.\n"
        + "\n"
        + "     e. \"Work\" means the copyrightable work of authorship offered under the term"
        + "s of this License.\n"
        + "\n"
        + "     f. \"You\" means an individual or entity exercising rights under this License"
        + " who has not previously violated the terms of this License with respect to the W"
        + "ork, or who has received express permission from the Licensor to exercise rights"
        + " under this License despite a previous violation.\n"
        + "\n"
        + "2. Fair Use Rights. Nothing in this license is intended to reduce, limit, or res"
        + "trict any rights arising from fair use, first sale or other limitations on the e"
        + "xclusive rights of the copyright owner under copyright law or other applicable l"
        + "aws.\n"
        + "\n"
        + "3. License Grant. Subject to the terms and conditions of this License, Licensor "
        + "hereby grants You a worldwide, royalty-free, non-exclusive, perpetual (for the d"
        + "uration of the applicable copyright) license to exercise the rights in the Work "
        + "as stated below:\n"
        + "\n"
        + "     a. to reproduce the Work, to incorporate the Work into one or more Collecti"
        + "ve Works, and to reproduce the Work as incorporated in the Collective Works;\n"
        + "\n"
        + "     b. to distribute copies or phonorecords of, display publicly, perform publi"
        + "cly, and perform publicly by means of a digital audio transmission the Work incl"
        + "uding as incorporated in Collective Works;\n"
        + "\n"
        + "The above rights may be exercised in all media and formats whether now known or "
        + "hereafter devised. The above rights include the right to make such modifications"
        + " as are technically necessary to exercise the rights in other media and formats,"
        + " but otherwise you have no rights to make Derivative Works. All rights not expre"
        + "ssly granted by Licensor are hereby reserved, including but not limited to the r"
        + "ights set forth in Sections 4(d) and 4(e).\n"
        + "\n"
        + "4. Restrictions.The license granted in Section 3 above is expressly made subject"
        + " to and limited by the following restrictions:\n"
        + "\n"
        + "     a. You may distribute, publicly display, publicly perform, or publicly digi"
        + "tally perform the Work only under the terms of this License, and You must includ"
        + "e a copy of, or the Uniform Resource Identifier for, this License with every cop"
        + "y or phonorecord of the Work You distribute, publicly display, publicly perform,"
        + " or publicly digitally perform. You may not offer or impose any terms on the Wor"
        + "k that alter or restrict the terms of this License or the recipients' exercise o"
        + "f the rights granted hereunder. You may not sublicense the Work. You must keep i"
        + "ntact all notices that refer to this License and to the disclaimer of warranties"
        + ". You may not distribute, publicly display, publicly perform, or publicly digita"
        + "lly perform the Work with any technological measures that control access or use "
        + "of the Work in a manner inconsistent with the terms of this License Agreement. T"
        + "he above applies to the Work as incorporated in a Collective Work, but this does"
        + " not require the Collective Work apart from the Work itself to be made subject t"
        + "o the terms of this License. If You create a Collective Work, upon notice from a"
        + "ny Licensor You must, to the extent practicable, remove from the Collective Work"
        + " any reference to such Licensor or the Original Author, as requested.\n"
        + "\n"
        + "     b. You may not exercise any of the rights granted to You in Section 3 above"
        + " in any manner that is primarily intended for or directed toward commercial adva"
        + "ntage or private monetary compensation. The exchange of the Work for other copyr"
        + "ighted works by means of digital file-sharing or otherwise shall not be consider"
        + "ed to be intended for or directed toward commercial advantage or private monetar"
        + "y compensation, provided there is no payment of any monetary compensation in con"
        + "nection with the exchange of copyrighted works.\n"
        + "\n"
        + "     c. If you distribute, publicly display, publicly perform, or publicly digit"
        + "ally perform the Work, You must keep intact all copyright notices for the Work a"
        + "nd give the Original Author credit reasonable to the medium or means You are uti"
        + "lizing by conveying the name (or pseudonym if applicable) of the Original Author"
        + " if supplied; the title of the Work if supplied; and to the extent reasonably pr"
        + "acticable, the Uniform Resource Identifier, if any, that Licensor specifies to b"
        + "e associated with the Work, unless such URI does not refer to the copyright noti"
        + "ce or licensing information for the Work. Such credit may be implemented in any "
        + "reasonable manner; provided, however, that in the case of a Collective Work, at "
        + "a minimum such credit will appear where any other comparable authorship credit a"
        + "ppears and in a manner at least as prominent as such other comparable authorship"
        + " credit.\n"
        + "\n"
        + "     d. For the avoidance of doubt, where the Work is a musical composition:\n"
        + "\n"
        + "          i. Performancf Royalties Under Blanket Licenses. Licensor reserves the"
        + " exclusive right to collect, whether individually or via a performance rights so"
        + "ciety (e.g. ASCAP, BMI, SESAC), royalties for the public performance or public d"
        + "igital performance (e.g. webcast) of the Work if that performance is primarily i"
        + "ntended for or directed toward commercial advantage or private monetary compensa"
        + "tion.\n"
        + "\n"
        + "          ii. Mechanical Rights and Statutory Royalties. Licensor reserves the e"
        + "xclusive right to collect, whether individually or via a music rights agency or "
        + "designated agent (e.g. Harry Fox Agency), royalties for any phonorecord You crea"
        + "te from the Work (\"cover version\") and distribute, subject to the compulsory lic"
        + "ense created by 17 USC Section 115 of the US Copyright Act (or the equivalent in"
        + " other jurisdictions), if Your distribution of such cover version is primarily i"
        + "ntended for or directed toward commercial advantage or private monetary compensa"
        + "tion.\n"
        + "\n"
        + "     e. Webcasting Rights and Statutory Royalties. For the avoidance of doubt, w"
        + "here the Work is a sound recording, Licensor reserves the exclusive right to col"
        + "lect, whether individually or via a performance-rights society (e.g. SoundExchan"
        + "ge), royalties for the public digital performance (e.g. webcast) of the Work, su"
        + "bject to the compulsory license created by 17 USC Section 114 of the US Copyrigh"
        + "t Act (or the equivalent in other jurisdictions), if Your public digital perform"
        + "ance is primarily intended for or directed toward commercial advantage or privat"
        + "e monetary compensation.\n"
        + "\n"
        + "5. Representations, Warranties and Disclaimer\n"
        + "\n"
        + "UNLESS OTHERWISE MUTUALLY AGREED BY THE PARTIES IN WRITING, LICENSOR OFFERS THE "
        + "WORK AS-IS AND MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE"
        + " WORK, EXPRESS, IMPLIED, STATUTORY OR OTHERWISE, INCLUDING, WITHOUT LIMITATION, "
        + "WARRANTIES OF TITLE, MERCHANTIBILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRI"
        + "NGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, ACCURACY, OR THE PRESENCE OF"
        + " ABSENCE OF ERRORS, WHETHER OR NOT DISCOVERABLE. SOME JURISDICTIONS DO NOT ALLOW"
        + " THE EXCLUSION OF IMPLIED WARRANTIES, SO SUCH EXCLUSION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "6. Limitation on Liability. EXCEPT TO THE EXTENT REQUIRED BY APPLICABLE LAW, IN "
        + "NO EVENT WILL LICENSOR BE LIABLE TO YOU ON ANY LEGAL THEORY FOR ANY SPECIAL, INC"
        + "IDENTAL, CONSEQUENTIAL, PUNITIVE OR EXEMPLARY DAMAGES ARISING OUT OF THIS LICENS"
        + "E OR THE USE OF THE WORK, EVEN IF LICENSOR HAS BEEN ADVISED OF THE POSSIBILITY O"
        + "F SUCH DAMAGES.\n"
        + "\n"
        + "7. Termination\n"
        + "\n"
        + "     a. This License and the rights granted hereunder will terminate automatical"
        + "ly upon any breach by You of the terms of this License. Individuals or entities "
        + "who have received Collective Works from You under this License, however, will no"
        + "t have their licenses terminated provided such individuals or entities remain in"
        + " full compliance with those licenses. Sections 1, 2, 5, 6, 7, and 8 will survive"
        + " any termination of this License.\n"
        + "\n"
        + "     b. Subject to the above terms and conditions, the license granted here is p"
        + "erpetual (for the duration of the applicable copyright in the Work). Notwithstan"
        + "ding the above, Licensor reserves the right to release the Work under different "
        + "license terms or to stop distributing the Work at any time; provided, however th"
        + "at any such election will not serve to withdraw this License (or any other licen"
        + "se that has been, or is required to be, granted under the terms of this License)"
        + ", and this License will continue in full force and effect unless terminated as s"
        + "tated above.\n"
        + "\n"
        + "8. Miscellaneous\n"
        + "\n"
        + "     a. Each time You distribute or publicly digitally perform the Work or a Col"
        + "lective Work, the Licensor offers to the recipient a license to the Work on the "
        + "same terms and conditions as the license granted to You under this License.\n"
        + "\n"
        + "     b. If any provision of this License is invalid or unenforceable under appli"
        + "cable law, it shall not affect the validity or enforceability of the remainder o"
        + "f the terms of this License, and without further action by the parties to this a"
        + "greement, such provision shall be reformed to the minimum extent necessary to ma"
        + "ke such provision valid and enforceable.\n"
        + "\n"
        + "     c. No term or provision of this License shall be deemed waived and no breac"
        + "h consented to unless such waiver or consent shall be in writing and signed by t"
        + "he party to be charged with such waiver or consent.\n"
        + "\n"
        + "     d. This License constitutes the entire agreement between the parties with r"
        + "espect to the Work licensed here. There are no understandings, agreements or rep"
        + "resentations with respect to the Work not specified here. Licensor shall not be "
        + "bound by any additional provisions that may appear in any communication from You"
        + ". This License may not be modified without the mutual written agreement of the L"
        + "icensor and You. \n"
        + "\n"
        + "Creative Commons is not a party to this License, and makes no warranty whatsoeve"
        + "r in connection with the Work. Creative Commons will not be liable to You or any"
        + " party on any legal theory for any damages whatsoever, including without limitat"
        + "ion any general, special, incidental or consequential damages arising in connect"
        + "ion to this license. Notwithstanding the foregoing two (2) sentences, if Creativ"
        + "e Commons has expressly identified itself as the Licensor hereunder, it shall ha"
        + "ve all rights and obligations of Licensor.\n"
        + "\n"
        + "Except for the limited purpose of indicating to the public that the Work is lice"
        + "nsed under the CCPL, neither party will use the trademark \"Creative Commons\" or "
        + "any related trademark or logo of Creative Commons without the prior written cons"
        + "ent of Creative Commons. Any permitted use will be in compliance with Creative C"
        + "ommons' then-current trademark usage guidelines, as may be published on its webs"
        + "ite or otherwise made available upon request from time to time.\n"
        + "\n"
        + "Creative Commons may be contacted at http://creativecommons.org/. \n"
; // the license text
    }
 
    
}
