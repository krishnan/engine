package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:50Z
 * LicenseName: AGPL-3.0+
 * FileName: CC_BY_2_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class CC_BY_2_0 extends License{
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
        return "CC-BY-2.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Creative Commons Attribution 2.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Creative Commons Attribution 2.0\n"
        + "\n"
        + "CREATIVE COMMONS CORPORATION IS NOT A LAW FIRM AND DOES NOT PROVIDE\n"
        + "LEGAL SERVICES. DISTRIBUTION OF THIS LICENSE DOES NOT CREATE AN\n"
        + "ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS INFORMATION\n"
        + "ON AN \"AS-IS\" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES REGARDING THE\n"
        + "INFORMATION PROVIDED, AND DISCLAIMS LIABILITY FOR DAMAGES RESULTING FROM\n"
        + "ITS USE.\n"
        + "\n"
        + "License\n"
        + "\n"
        + "THE WORK (AS DEFINED BELOW) IS PROVIDED UNDER THE TERMS OF THIS CREATIVE\n"
        + "COMMONS PUBLIC LICENSE (\"CCPL\" OR \"LICENSE\"). THE WORK IS PROTECTED BY\n"
        + "COPYRIGHT AND/OR OTHER APPLICABLE LAW. ANY USE OF THE WORK OTHER THAN AS\n"
        + "AUTHORIZED UNDER THIS LICENSE OR COPYRIGHT LAW IS PROHIBITED.\n"
        + "\n"
        + "BY EXERCISING ANY RIGHTS TO THE WORK PROVIDED HERE, YOU ACCEPT AND AGREE\n"
        + "TO BE BOUND BY THE TERMS OF THIS LICENSE. THE LICENSOR GRANTS YOU THE\n"
        + "RIGHTS CONTAINED HERE IN CONSIDERATION OF YOUR ACCEPTANCE OF SUCH TERMS\n"
        + "AND CONDITIONS.\n"
        + "\n"
        + "1. Definitions\n"
        + "\n"
        + "a. \"Collective Work\" means a work, such as a periodical issue, anthology\n"
        + "or encyclopedia, in which the Work in its entirety in unmodified form,\n"
        + "along with a number of other contributions, constituting separate and\n"
        + "independent works in themselves, are assembled into a collective whole.\n"
        + "A work that constitutes a Collective Work will not be considered a\n"
        + "Derivative Work (as defined below) for the purposes of this License.\n"
        + "\n"
        + "b. \"Derivative Work\" means a work based upon the Work or upon the Work\n"
        + "and other pre-existing works, such as a translation, musical\n"
        + "arrangement, dramatization, fictionalization, motion picture version,\n"
        + "sound recording, art reproduction, abridgment, condensation, or any\n"
        + "other form in which the Work may be recast, transformed, or adapted,\n"
        + "except that a work that constitutes a Collective Work will not be\n"
        + "considered a Derivative Work for the purpose of this License. For the\n"
        + "avoidance of doubt, where the Work is a musical composition or sound\n"
        + "recording, the synchronization of the Work in timed-relation with a\n"
        + "moving image (\"synching\") will be considered a Derivative Work for the\n"
        + "purpose of this License.\n"
        + "\n"
        + "c. \"Licensor\" means the individual or entity that offers the Work under\n"
        + "the terms of this License.\n"
        + "\n"
        + "d. \"Original Author\" means the individual or entity who created the\n"
        + "Work.\n"
        + "\n"
        + "e. \"Work\" means the copyrightable work of authorship offered under the\n"
        + "terms of this License.\n"
        + "\n"
        + "f. \"You\" means an individual or entity exercising rights under this\n"
        + "License who has not previously violated the terms of this License with\n"
        + "respect to the Work, or who has received express permission from the\n"
        + "Licensor to exercise rights under this License despite a previous\n"
        + "violation.\n"
        + "\n"
        + "2. Fair Use Rights. Nothing in this license is intended to reduce,\n"
        + "limit, or restrict any rights arising from fair use, first sale or other\n"
        + "limitations on the exclusive rights of the copyright owner under\n"
        + "copyright law or other applicable laws.\n"
        + "\n"
        + "3. License Grant. Subject to the terms and conditions of this License,\n"
        + "Licensor hereby grants You a worldwide, royalty-free, non-exclusive,\n"
        + "perpetual (for the duration of the applicable copyright) license to\n"
        + "exercise the rights in the Work as stated below:\n"
        + "\n"
        + "a. to reproduce the Work, to incorporate the Work into one or more\n"
        + "Collective Works, and to reproduce the Work as incorporated in the\n"
        + "Collective Works;\n"
        + "\n"
        + "b. to create and reproduce Derivative Works;\n"
        + "\n"
        + "c. to distribute copies or phonorecords of, display publicly, perform\n"
        + "publicly, and perform publicly by means of a digital audio transmission\n"
        + "the Work including as incorporated in Collective Works;\n"
        + "\n"
        + "d. to distribute copies or phonorecords of, display publicly, perform\n"
        + "publicly, and perform publicly by means of a digital audio transmission\n"
        + "Derivative Works.\n"
        + "\n"
        + "e. For the avoidance of doubt, where the work is a musical composition:\n"
        + "\n"
        + "i. Performance Royalties Under Blanket Licenses. Licensor waives the\n"
        + "exclusive right to collect, whether individually or via a performance\n"
        + "rights society (e.g. ASCAP, BMI, SESAC), royalties for the public\n"
        + "performance or public digital performance (e.g. webcast) of the Work.\n"
        + "\n"
        + "ii. Mechanical Rights and Statutory Royalties. Licensor waives the\n"
        + "exclusive right to collect, whether individually or via a music rights\n"
        + "agency or designated agent (e.g. Harry Fox Agency), royalties for any\n"
        + "phonorecord You create from the Work (\"cover version\") and distribute,\n"
        + "subject to the compulsory license created by 17 USC Section 115 of the\n"
        + "US Copyright Act (or the equivalent in other jurisdictions).\n"
        + "\n"
        + "f. Webcasting Rights and Statutory Royalties. For the avoidance of\n"
        + "doubt, where the Work is a sound recording, Licensor waives the\n"
        + "exclusive right to collect, whether individually or via a\n"
        + "performance-rights society (e.g. SoundExchange), royalties for the\n"
        + "public digital performance (e.g. webcast) of the Work, subject to the\n"
        + "compulsory license created by 17 USC Section 114 of the US Copyright Act\n"
        + "(or the equivalent in other jurisdictions).\n"
        + "\n"
        + "\n"
        + "The above rights may be exercised in all media and formats whether now\n"
        + "known or hereafter devised. The above rights include the right to make\n"
        + "such modifications as are technically necessary to exercise the rights\n"
        + "in other media and formats. All rights not expressly granted by Licensor\n"
        + "are hereby reserved.\n"
        + "\n"
        + "4. Restrictions. The license granted in Section 3 above is expressly\n"
        + "made subject to and limited by the following restrictions:\n"
        + "\n"
        + "a. You may distribute, publicly display, publicly perform, or publicly\n"
        + "digitally perform the Work only under the terms of this License, and You\n"
        + "must include a copy of, or the Uniform Resource Identifier for, this\n"
        + "License with every copy or phonorecord of the Work You distribute,\n"
        + "publicly display, publicly perform, or publicly digitally perform. You\n"
        + "may not offer or impose any terms on the Work that alter or restrict the\n"
        + "terms of this License or the recipients' exercise of the rights granted\n"
        + "hereunder. You may not sublicense the Work. You must keep intact all\n"
        + "notices that refer to this License and to the disclaimer of warranties.\n"
        + "You may not distribute, publicly display, publicly perform, or publicly\n"
        + "digitally perform the Work with any technological measures that control\n"
        + "access or use of the Work in a manner inconsistent with the terms of\n"
        + "this License Agreement. The above applies to the Work as incorporated in\n"
        + "a Collective Work, but this does not require the Collective Work apart\n"
        + "from the Work itself to be made subject to the terms of this License. If\n"
        + "You create a Collective Work, upon notice from any Licensor You must, to\n"
        + "the extent practicable, remove from the Collective Work any reference to\n"
        + "such Licensor or the Original Author, as requested. If You create a\n"
        + "Derivative Work, upon notice from any Licensor You must, to the extent\n"
        + "practicable, remove from the Derivative Work any reference to such\n"
        + "Licensor or the Original Author, as requested.\n"
        + "\n"
        + "b. If you distribute, publicly display, publicly perform, or publicly\n"
        + "digitally perform the Work or any Derivative Works or Collective Works,\n"
        + "You must keep intact all copyright notices for the Work and give the\n"
        + "Original Author credit reasonable to the medium or means You are\n"
        + "utilizing by conveying the name (or pseudonym if applicable) of the\n"
        + "Original Author if supplied; the title of the Work if supplied; to the\n"
        + "extent reasonably practicable, the Uniform Resource Identifier, if any,\n"
        + "that Licensor specifies to be associated with the Work, unless such URI\n"
        + "does not refer to the copyright notice or licensing information for the\n"
        + "Work; and in the case of a Derivative Work, a credit identifying the use\n"
        + "of the Work in the Derivative Work (e.g., \"French translation of the\n"
        + "Work by Original Author,\" or \"Screenplay based on original Work by\n"
        + "Original Author\"). Such credit may be implemented in any reasonable\n"
        + "manner; provided, however, that in the case of a Derivative Work or\n"
        + "Collective Work, at a minimum such credit will appear where any other\n"
        + "comparable authorship credit appears and in a manner at least as\n"
        + "prominent as such other comparable authorship credit.\n"
        + "\n"
        + "5. Representations, Warranties and Disclaimer\n"
        + "\n"
        + "UNLESS OTHERWISE MUTUALLY AGREED TO BY THE PARTIES IN WRITING, LICENSOR\n"
        + "OFFERS THE WORK AS-IS AND MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY\n"
        + "KIND CONCERNING THE WORK, EXPRESS, IMPLIED, STATUTORY OR OTHERWISE,\n"
        + "INCLUDING, WITHOUT LIMITATION, WARRANTIES OF TITLE, MERCHANTIBILITY,\n"
        + "FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF\n"
        + "LATENT OR OTHER DEFECTS, ACCURACY, OR THE PRESENCE OF ABSENCE OF ERRORS,\n"
        + "WHETHER OR NOT DISCOVERABLE. SOME JURISDICTIONS DO NOT ALLOW THE\n"
        + "EXCLUSION OF IMPLIED WARRANTIES, SO SUCH EXCLUSION MAY NOT APPLY TO YOU.\n"
        + "\n"
        + "6. Limitation on Liability. EXCEPT TO THE EXTENT REQUIRED BY APPLICABLE\n"
        + "LAW, IN NO EVENT WILL LICENSOR BE LIABLE TO YOU ON ANY LEGAL THEORY FOR\n"
        + "ANY SPECIAL, INCIDENTAL, CONSEQUENTIAL, PUNITIVE OR EXEMPLARY DAMAGES\n"
        + "ARISING OUT OF THIS LICENSE OR THE USE OF THE WORK, EVEN IF LICENSOR HAS\n"
        + "BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.\n"
        + "\n"
        + "7. Termination\n"
        + "\n"
        + "a. This License and the rights granted hereunder will terminate\n"
        + "automatically upon any breach by You of the terms of this License.\n"
        + "Individuals or entities who have received Derivative Works or Collective\n"
        + "Works from You under this License, however, will not have their licenses\n"
        + "terminated provided such individuals or entities remain in full\n"
        + "compliance with those licenses. Sections 1, 2, 5, 6, 7, and 8 will\n"
        + "survive any termination of this License.\n"
        + "\n"
        + "b. Subject to the above terms and conditions, the license granted here\n"
        + "is perpetual (for the duration of the applicable copyright in the Work).\n"
        + "Notwithstanding the above, Licensor reserves the right to release the\n"
        + "Work under different license terms or to stop distributing the Work at\n"
        + "any time; provided, however that any such election will not serve to\n"
        + "withdraw this License (or any other license that has been, or is\n"
        + "required to be, granted under the terms of this License), and this\n"
        + "License will continue in full force and effect unless terminated as\n"
        + "stated above.\n"
        + "\n"
        + "8. Miscellaneous\n"
        + "\n"
        + "a. Each time You distribute or publicly digitally perform the Work or a\n"
        + "Collective Work, the Licensor offers to the recipient a license to the\n"
        + "Work on the same terms and conditions as the license granted to You\n"
        + "under this License.\n"
        + "\n"
        + "b. Each time You distribute or publicly digitally perform a Derivative\n"
        + "Work, Licensor offers to the recipient a license to the original Work on\n"
        + "the same terms and conditions as the license granted to You under this\n"
        + "License.\n"
        + "\n"
        + "c. If any provision of this License is invalid or unenforceable under\n"
        + "applicable law, it shall not affect the validity or enforceability of\n"
        + "the remainder of the terms of this License, and without further action\n"
        + "by the parties to this agreement, such provision shall be reformed to\n"
        + "the minimum extent necessary to make such provision valid and\n"
        + "enforceable.\n"
        + "\n"
        + "d. No term or provision of this License shall be deemed waived and no\n"
        + "breach consented to unless such waiver or consent shall be in writing\n"
        + "and signed by the party to be charged with such waiver or consent.\n"
        + "\n"
        + "e. This License constitutes the entire agreement between the parties\n"
        + "with respect to the Work licensed here. There are no understandings,\n"
        + "agreements or representations with respect to the Work not specified\n"
        + "here. Licensor shall not be bound by any additional provisions that may\n"
        + "appear in any communication from You. This License may not be modified\n"
        + "without the mutual written agreement of the Licensor and You.\n"
        + "\n"
        + "\n"
        + "Creative Commons is not a party to this License, and makes no warranty\n"
        + "whatsoever in connection with the Work. Creative Commons will not be\n"
        + "liable to You or any party on any legal theory for any damages\n"
        + "whatsoever, including without limitation any general, special,\n"
        + "incidental or consequential damages arising in connection to this\n"
        + "license. Notwithstanding the foregoing two (2) sentences, if Creative\n"
        + "Commons has expressly identified itself as the Licensor hereunder, it\n"
        + "shall have all rights and obligations of Licensor.\n"
        + "\n"
        + "Except for the limited purpose of indicating to the public that the Work\n"
        + "is licensed under the CCPL, neither party will use the trademark\n"
        + "\"Creative Commons\" or any related trademark or logo of Creative Commons\n"
        + "without the prior written consent of Creative Commons. Any permitted use\n"
        + "will be in compliance with Creative Commons' then-current trademark\n"
        + "usage guidelines, as may be published on its website or otherwise made\n"
        + "available upon request from time to time.\n"
        + "\n"
        + "Creative Commons may be contacted at http://creativecommons.org/.\n"
; // the license text
    }
 
    
}
