package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:42Z
 * LicenseName: AGPL-3.0+
 * FileName: CC_BY_NC_3_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CC_BY_NC_3_0 extends License{
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
        return "CC-BY-NC-3.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Creative Commons Attribution Non Commercial 3.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Creative Commons Attribution-NonCommercial 3.0 Unported\n"
        + "\n"
        + "<<beginOptional;name=ccOptionalIntro>> CREATIVE COMMONS CORPORATION IS NOT A LAW"
        + " FIRM AND DOES NOT PROVIDE LEGAL SERVICES. DISTRIBUTION OF THIS LICENSE DOES NOT"
        + " CREATE AN ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS INFORMAT"
        + "ION ON AN \"AS-IS\" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES REGARDING THE INFO"
        + "RMATION PROVIDED, AND DISCLAIMS LIABILITY FOR DAMAGES RESULTING FROM ITS USE. <<"
        + "endOptional>>\n"
        + "\n"
        + "License\n"
        + "\n"
        + "THE WORK (AS DEFINED BELOW) IS PROVIDED UNDER THE TERMS OF THIS CREATIVE COMMONS"
        + " PUBLIC LICENSE (\"CCPL\" OR \"LICENSE\"). THE WORK IS PROTECTED BY COPYRIGHT AND/OR"
        + " OTHER APPLICABLE LAW. ANY USE OF THE WORK OTHER THAN AS AUTHORIZED UNDER THIS L"
        + "ICENSE OR COPYRIGHT LAW IS PROHIBITED.\n"
        + "\n"
        + "BY EXERCISING ANY RIGHTS TO THE WORK PROVIDED HERE, YOU ACCEPT AND AGREE TO BE B"
        + "OUND BY THE TERMS OF THIS LICENSE. TO THE EXTENT THIS LICENSE MAY BE CONSIDERED "
        + "TO BE A CONTRACT, THE LICENSOR GRANTS YOU THE RIGHTS CONTAINED HERE IN CONSIDERA"
        + "TION OF YOUR ACCEPTANCE OF SUCH TERMS AND CONDITIONS.\n"
        + "\n"
        + "1. Definitions\n"
        + "\n"
        + "     a. \"Adaptation\" means a work based upon the Work, or upon the Work and othe"
        + "r pre-existing works, such as a translation, adaptation, derivative work, arrang"
        + "ement of music or other alterations of a literary or artistic work, or phonogram"
        + " or performance and includes cinematographic adaptations or any other form in wh"
        + "ich the Work may be recast, transformed, or adapted including in any form recogn"
        + "izably derived from the original, except that a work that constitutes a Collecti"
        + "on will not be considered an Adaptation for the purpose of this License. For the"
        + " avoidance of doubt, where the Work is a musical work, performance or phonogram,"
        + " the synchronization of the Work in timed-relation with a moving image (\"synchin"
        + "g\") will be considered an Adaptation for the purpose of this License.\n"
        + "\n"
        + "     b. \"Collection\" means a collection of literary or artistic works, such as e"
        + "ncyclopedias and anthologies, or performances, phonograms or broadcasts, or othe"
        + "r works or subject matter other than works listed in Section 1(f) below, which, "
        + "by reason of the selection and arrangement of their contents, constitute intelle"
        + "ctual creations, in which the Work is included in its entirety in unmodified for"
        + "m along with one or more other contributions, each constituting separate and ind"
        + "ependent works in themselves, which together are assembled into a collective who"
        + "le. A work that constitutes a Collection will not be considered an Adaptation (a"
        + "s defined above) for the purposes of this License.\n"
        + "\n"
        + "     c. \"Distribute\" means to make available to the public the original and copi"
        + "es of the Work or Adaptation, as appropriate, through sale or other transfer of "
        + "ownership.\n"
        + "\n"
        + "     d. \"Licensor\" means the individual, individuals, entity or entities that of"
        + "fer(s) the Work under the terms of this License.\n"
        + "\n"
        + "     e. \"Original Author\" means, in the case of a literary or artistic work, the"
        + " individual, individuals, entity or entities who created the Work or if no indiv"
        + "idual or entity can be identified, the publisher; and in addition (i) in the cas"
        + "e of a performance the actors, singers, musicians, dancers, and other persons wh"
        + "o act, sing, deliver, declaim, play in, interpret or otherwise perform literary "
        + "or artistic works or expressions of folklore; (ii) in the case of a phonogram th"
        + "e producer being the person or legal entity who first fixes the sounds of a perf"
        + "ormance or other sounds; and, (iii) in the case of broadcasts, the organization "
        + "that transmits the broadcast.\n"
        + "\n"
        + "     f. \"Work\" means the literary and/or artistic work offered under the terms o"
        + "f this License including without limitation any production in the literary, scie"
        + "ntific and artistic domain, whatever may be the mode or form of its expression i"
        + "ncluding digital form, such as a book, pamphlet and other writing; a lecture, ad"
        + "dress, sermon or other work of the same nature; a dramatic or dramatico-musical "
        + "work; a choreographic work or entertainment in dumb show; a musical composition "
        + "with or without words; a cinematographic work to which are assimilated works exp"
        + "ressed by a process analogous to cinematography; a work of drawing, painting, ar"
        + "chitecture, sculpture, engraving or lithography; a photographic work to which ar"
        + "e assimilated works expressed by a process analogous to photography; a work of a"
        + "pplied art; an illustration, map, plan, sketch or three-dimensional work relativ"
        + "e to geography, topography, architecture or science; a performance; a broadcast;"
        + " a phonogram; a compilation of data to the extent it is protected as a copyright"
        + "able work; or a work performed by a variety or circus performer to the extent it"
        + " is not otherwise considered a literary or artistic work.\n"
        + "\n"
        + "     g. \"You\" means an individual or entity exercising rights under this License"
        + " who has not previously violated the terms of this License with respect to the W"
        + "ork, or who has received express permission from the Licensor to exercise rights"
        + " under this License despite a previous violation.\n"
        + "\n"
        + "     h. \"Publicly Perform\" means to perform public recitations of the Work and t"
        + "o communicate to the public those public recitations, by any means or process, i"
        + "ncluding by wire or wireless means or public digital performances; to make avail"
        + "able to the public Works in such a way that members of the public may access the"
        + "se Works from a place and at a place individually chosen by them; to perform the"
        + " Work to the public by any means or process and the communication to the public "
        + "of the performances of the Work, including by public digital performance; to bro"
        + "adcast and rebroadcast the Work by any means including signs, sounds or images.\n"
        + "\n"
        + "     i. \"Reproduce\" means to make copies of the Work by any means including with"
        + "out limitation by sound or visual recordings and the right of fixation and repro"
        + "ducing fixations of the Work, including storage of a protected performance or ph"
        + "onogram in digital form or other electronic medium.\n"
        + "\n"
        + "2. Fair Dealing Rights. Nothing in this License is intended to reduce, limit, or"
        + " restrict any uses free from copyright or rights arising from limitations or exc"
        + "eptions that are provided for in connection with the copyright protection under "
        + "copyright law or other applicable laws.\n"
        + "\n"
        + "3. License Grant. Subject to the terms and conditions of this License, Licensor "
        + "hereby grants You a worldwide, royalty-free, non-exclusive, perpetual (for the d"
        + "uration of the applicable copyright) license to exercise the rights in the Work "
        + "as stated below:\n"
        + "\n"
        + "     a. to Reproduce the Work, to incorporate the Work into one or more Collecti"
        + "ons, and to Reproduce the Work as incorporated in the Collections;\n"
        + "\n"
        + "     b. to create and Reproduce Adaptations provided that any such Adaptation, i"
        + "ncluding any translation in any medium, takes reasonable steps to clearly label,"
        + " demarcate or otherwise identify that changes were made to the original Work. Fo"
        + "r example, a translation could be marked \"The original work was translated from "
        + "English to Spanish,\" or a modification could indicate \"The original work has bee"
        + "n modified.\";\n"
        + "\n"
        + "     c. to Distribute and Publicly Perform the Work including as incorporated in"
        + " Collections; and,\n"
        + "\n"
        + "     d. to Distribute and Publicly Perform Adaptations.\n"
        + "\n"
        + "The above rights may be exercised in all media and formats whether now known or "
        + "hereafter devised. The above rights include the right to make such modifications"
        + " as are technically necessary to exercise the rights in other media and formats."
        + " Subject to Section 8(f), all rights not expressly granted by Licensor are hereb"
        + "y reserved, including but not limited to the rights set forth in Section 4(d).\n"
        + "\n"
        + "4. Restrictions. The license granted in Section 3 above is expressly made subjec"
        + "t to and limited by the following restrictions:\n"
        + "\n"
        + "     a. You may Distribute or Publicly Perform the Work only under the terms of "
        + "this License. You must include a copy of, or the Uniform Resource Identifier (UR"
        + "I) for, this License with every copy of the Work You Distribute or Publicly Perf"
        + "orm. You may not offer or impose any terms on the Work that restrict the terms o"
        + "f this License or the ability of the recipient of the Work to exercise the right"
        + "s granted to that recipient under the terms of the License. You may not sublicen"
        + "se the Work. You must keep intact all notices that refer to this License and to "
        + "the disclaimer of warranties with every copy of the Work You Distribute or Publi"
        + "cly Perform. When You Distribute or Publicly Perform the Work, You may not impos"
        + "e any effective technological measures on the Work that restrict the ability of "
        + "a recipient of the Work from You to exercise the rights granted to that recipien"
        + "t under the terms of the License. This Section 4(a) applies to the Work as incor"
        + "porated in a Collection, but this does not require the Collection apart from the"
        + " Work itself to be made subject to the terms of this License. If You create a Co"
        + "llection, upon notice from any Licensor You must, to the extent practicable, rem"
        + "ove from the Collection any credit as required by Section 4(c), as requested. If"
        + " You create an Adaptation, upon notice from any Licensor You must, to the extent"
        + " practicable, remove from the Adaptation any credit as required by Section 4(c),"
        + " as requested.\n"
        + "\n"
        + "     b. You may not exercise any of the rights granted to You in Section 3 above"
        + " in any manner that is primarily intended for or directed toward commercial adva"
        + "ntage or private monetary compensation. The exchange of the Work for other copyr"
        + "ighted works by means of digital file-sharing or otherwise shall not be consider"
        + "ed to be intended for or directed toward commercial advantage or private monetar"
        + "y compensation, provided there is no payment of any monetary compensation in con"
        + "nection with the exchange of copyrighted works.\n"
        + "\n"
        + "     c. If You Distribute, or Publicly Perform the Work or any Adaptations or Co"
        + "llections, You must, unless a request has been made pursuant to Section 4(a), ke"
        + "ep intact all copyright notices for the Work and provide, reasonable to the medi"
        + "um or means You are utilizing: (i) the name of the Original Author (or pseudonym"
        + ", if applicable) if supplied, and/or if the Original Author and/or Licensor desi"
        + "gnate another party or parties (e.g., a sponsor institute, publishing entity, jo"
        + "urnal) for attribution (\"Attribution Parties\") in Licensor's copyright notice, t"
        + "erms of service or by other reasonable means, the name of such party or parties;"
        + " (ii) the title of the Work if supplied; (iii) to the extent reasonably practica"
        + "ble, the URI, if any, that Licensor specifies to be associated with the Work, un"
        + "less such URI does not refer to the copyright notice or licensing information fo"
        + "r the Work; and, (iv) consistent with Section 3(b), in the case of an Adaptation"
        + ", a credit identifying the use of the Work in the Adaptation (e.g., \"French tran"
        + "slation of the Work by Original Author,\" or \"Screenplay based on original Work b"
        + "y Original Author\"). The credit required by this Section 4(c) may be implemented"
        + " in any reasonable manner; provided, however, that in the case of a Adaptation o"
        + "r Collection, at a minimum such credit will appear, if a credit for all contribu"
        + "ting authors of the Adaptation or Collection appears, then as part of these cred"
        + "its and in a manner at least as prominent as the credits for the other contribut"
        + "ing authors. For the avoidance of doubt, You may only use the credit required by"
        + " this Section for the purpose of attribution in the manner set out above and, by"
        + " exercising Your rights under this License, You may not implicitly or explicitly"
        + " assert or imply any connection with, sponsorship or endorsement by the Original"
        + " Author, Licensor and/or Attribution Parties, as appropriate, of You or Your use"
        + " of the Work, without the separate, express prior written permission of the Orig"
        + "inal Author, Licensor and/or Attribution Parties.\n"
        + "\n"
        + "     d. For the avoidance of doubt:\n"
        + "\n"
        + "          i. Non-waivable Compulsory License Schemes. In those jurisdictions in "
        + "which the right to collect royalties through any statutory or compulsory licensi"
        + "ng scheme cannot be waived, the Licensor reserves the exclusive right to collect"
        + " such royalties for any exercise by You of the rights granted under this License"
        + ";\n"
        + "\n"
        + "          ii. Waivable Compulsory License Schemes. In those jurisdictions in whi"
        + "ch the right to collect royalties through any statutory or compulsory licensing "
        + "scheme can be waived, the Licensor reserves the exclusive right to collect such "
        + "royalties for any exercise by You of the rights granted under this License if Yo"
        + "ur exercise of such rights is for a purpose or use which is otherwise than nonco"
        + "mmercial as permitted under Section 4(b) and otherwise waives the right to colle"
        + "ct royalties through any statutory or compulsory licensing scheme; and,\n"
        + "\n"
        + "          iii. Voluntary License Schemes. The Licensor reserves the right to col"
        + "lect royalties, whether individually or, in the event that the Licensor is a mem"
        + "ber of a collecting society that administers voluntary licensing schemes, via th"
        + "at society, from any exercise by You of the rights granted under this License th"
        + "at is for a purpose or use which is otherwise than noncommercial as permitted un"
        + "der Section 4(c).\n"
        + "\n"
        + "     e. Except as otherwise agreed in writing by the Licensor or as may be other"
        + "wise permitted by applicable law, if You Reproduce, Distribute or Publicly Perfo"
        + "rm the Work either by itself or as part of any Adaptations or Collections, You m"
        + "ust not distort, mutilate, modify or take other derogatory action in relation to"
        + " the Work which would be prejudicial to the Original Author's honor or reputatio"
        + "n. Licensor agrees that in those jurisdictions (e.g. Japan), in which any exerci"
        + "se of the right granted in Section 3(b) of this License (the right to make Adapt"
        + "ations) would be deemed to be a distortion, mutilation, modification or other de"
        + "rogatory action prejudicial to the Original Author's honor and reputation, the L"
        + "icensor will waive or not assert, as appropriate, this Section, to the fullest e"
        + "xtent permitted by the applicable national law, to enable You to reasonably exer"
        + "cise Your right under Section 3(b) of this License (right to make Adaptations) b"
        + "ut not otherwise.\n"
        + "\n"
        + "5. Representations, Warranties and Disclaimer\n"
        + "\n"
        + "UNLESS OTHERWISE MUTUALLY AGREED TO BY THE PARTIES IN WRITING, LICENSOR OFFERS T"
        + "HE WORK AS-IS AND MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING "
        + "THE WORK, EXPRESS, IMPLIED, STATUTORY OR OTHERWISE, INCLUDING, WITHOUT LIMITATIO"
        + "N, WARRANTIES OF TITLE, MERCHANTIBILITY, FITNESS FOR A PARTICULAR PURPOSE, NONIN"
        + "FRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, ACCURACY, OR THE PRESENCE"
        + " OF ABSENCE OF ERRORS, WHETHER OR NOT DISCOVERABLE. SOME JURISDICTIONS DO NOT AL"
        + "LOW THE EXCLUSION OF IMPLIED WARRANTIES, SO SUCH EXCLUSION MAY NOT APPLY TO YOU.\n"
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
        + "who have received Adaptations or Collections from You under this License, howeve"
        + "r, will not have their licenses terminated provided such individuals or entities"
        + " remain in full compliance with those licenses. Sections 1, 2, 5, 6, 7, and 8 wi"
        + "ll survive any termination of this License.\n"
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
        + "     a. Each time You Distribute or Publicly Perform the Work or a Collection, t"
        + "he Licensor offers to the recipient a license to the Work on the same terms and "
        + "conditions as the license granted to You under this License.\n"
        + "\n"
        + "     b. Each time You Distribute or Publicly Perform an Adaptation, Licensor off"
        + "ers to the recipient a license to the original Work on the same terms and condit"
        + "ions as the license granted to You under this License.\n"
        + "\n"
        + "     c. If any provision of this License is invalid or unenforceable under appli"
        + "cable law, it shall not affect the validity or enforceability of the remainder o"
        + "f the terms of this License, and without further action by the parties to this a"
        + "greement, such provision shall be reformed to the minimum extent necessary to ma"
        + "ke such provision valid and enforceable.\n"
        + "\n"
        + "     d. No term or provision of this License shall be deemed waived and no breac"
        + "h consented to unless such waiver or consent shall be in writing and signed by t"
        + "he party to be charged with such waiver or consent.\n"
        + "\n"
        + "     e. This License constitutes the entire agreement between the parties with r"
        + "espect to the Work licensed here. There are no understandings, agreements or rep"
        + "resentations with respect to the Work not specified here. Licensor shall not be "
        + "bound by any additional provisions that may appear in any communication from You"
        + ". This License may not be modified without the mutual written agreement of the L"
        + "icensor and You.\n"
        + "\n"
        + "     f. The rights granted under, and the subject matter referenced, in this Lic"
        + "ense were drafted utilizing the terminology of the Berne Convention for the Prot"
        + "ection of Literary and Artistic Works (as amended on September 28, 1979), the Ro"
        + "me Convention of 1961, the WIPO Copyright Treaty of 1996, the WIPO Performances "
        + "and Phonograms Treaty of 1996 and the Universal Copyright Convention (as revised"
        + " on July 24, 1971). These rights and subject matter take effect in the relevant "
        + "jurisdiction in which the License terms are sought to be enforced according to t"
        + "he corresponding provisions of the implementation of those treaty provisions in "
        + "the applicable national law. If the standard suite of rights granted under appli"
        + "cable copyright law includes additional rights not granted under this License, s"
        + "uch additional rights are deemed to be included in the License; this License is "
        + "not intended to restrict the license of any rights under applicable law. \n"
        + "\n"
        + "Creative Commons Notice\n"
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
        + "nsed under the CCPL, Creative Commons does not authorize the use by either party"
        + " of the trademark \"Creative Commons\" or any related trademark or logo of Creativ"
        + "e Commons without the prior written consent of Creative Commons. Any permitted u"
        + "se will be in compliance with Creative Commons' then-current trademark usage gui"
        + "delines, as may be published on its website or otherwise made available upon req"
        + "uest from time to time. For the avoidance of doubt, this trademark restriction d"
        + "oes not form part of the License.\n"
        + "\n"
        + "Creative Commons may be contacted at http://creativecommons.org/. \n"
; // the license text
    }
 
    
}
