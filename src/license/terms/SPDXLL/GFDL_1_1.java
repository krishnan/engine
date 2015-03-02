package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:15Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: GFDL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class GFDL_1_1 extends License{
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
        return "GFDL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "GNU Free Documentation License v1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "GNU Free Documentation License \n"
        + "Version 1.1, March 2000\n"
        + "\n"
        + "Copyright (C) 2000 Free Software Foundation, Inc. 51 Franklin St, Fifth Floor, B"
        + "oston, MA 02110-1301 USA \n"
        + "\n"
        + "Everyone is permitted to copy and distribute verbatim copies of this license doc"
        + "ument, but changing it is not allowed. \n"
        + "\n"
        + "0. PREAMBLE\n"
        + "\n"
        + "The purpose of this License is to make a manual, textbook, or other written docu"
        + "ment \"free\" in the sense of freedom: to assure everyone the effective freedom to"
        + " copy and redistribute it, with or without modifying it, either commercially or "
        + "noncommercially. Secondarily, this License preserves for the author and publishe"
        + "r a way to get credit for their work, while not being considered responsible for"
        + " modifications made by others.\n"
        + "\n"
        + "This License is a kind of \"copyleft\", which means that derivative works of the d"
        + "ocument must themselves be free in the same sense. It complements the GNU Genera"
        + "l Public License, which is a copyleft license designed for free software.\n"
        + "\n"
        + "We have designed this License in order to use it for manuals for free software, "
        + "because free software needs free documentation: a free program should come with "
        + "manuals providing the same freedoms that the software does. But this License is "
        + "not limited to software manuals; it can be used for any textual work, regardless"
        + " of subject matter or whether it is published as a printed book. We recommend th"
        + "is License principally for works whose purpose is instruction or reference. \n"
        + "\n"
        + "1. APPLICABILITY AND DEFINITIONS\n"
        + "\n"
        + "This License applies to any manual or other work that contains a notice placed b"
        + "y the copyright holder saying it can be distributed under the terms of this Lice"
        + "nse. The \"Document\", below, refers to any such manual or work. Any member of the"
        + " public is a licensee, and is addressed as \"you\".\n"
        + "\n"
        + "A \"Modified Version\" of the Document means any work containing the Document or a"
        + " portion of it, either copied verbatim, or with modifications and/or translated "
        + "into another language.\n"
        + "\n"
        + "A \"Secondary Section\" is a named appendix or a front-matter section of the Docum"
        + "ent that deals exclusively with the relationship of the publishers or authors of"
        + " the Document to the Document's overall subject (or to related matters) and cont"
        + "ains nothing that could fall directly within that overall subject. (For example,"
        + " if the Document is in part a textbook of mathematics, a Secondary Section may n"
        + "ot explain any mathematics.) The relationship could be a matter of historical co"
        + "nnection with the subject or with related matters, or of legal, commercial, phil"
        + "osophical, ethical or political position regarding them.\n"
        + "\n"
        + "The \"Invariant Sections\" are certain Secondary Sections whose titles are designa"
        + "ted, as being those of Invariant Sections, in the notice that says that the Docu"
        + "ment is released under this License.\n"
        + "\n"
        + "The \"Cover Texts\" are certain short passages of text that are listed, as Front-C"
        + "over Texts or Back-Cover Texts, in the notice that says that the Document is rel"
        + "eased under this License.\n"
        + "\n"
        + "A \"Transparent\" copy of the Document means a machine-readable copy, represented "
        + "in a format whose specification is available to the general public, whose conten"
        + "ts can be viewed and edited directly and straightforwardly with generic text edi"
        + "tors or (for images composed of pixels) generic paint programs or (for drawings)"
        + " some widely available drawing editor, and that is suitable for input to text fo"
        + "rmatters or for automatic translation to a variety of formats suitable for input"
        + " to text formatters. A copy made in an otherwise Transparent file format whose m"
        + "arkup has been designed to thwart or discourage subsequent modification by reade"
        + "rs is not Transparent. A copy that is not \"Transparent\" is called \"Opaque\".\n"
        + "\n"
        + "Examples of suitable formats for Transparent copies include plain ASCII without "
        + "markup, Texinfo input format, LaTeX input format, SGML or XML using a publicly a"
        + "vailable DTD, and standard-conforming simple HTML designed for human modificatio"
        + "n. Opaque formats include PostScript, PDF, proprietary formats that can be read "
        + "and edited only by proprietary word processors, SGML or XML for which the DTD an"
        + "d/or processing tools are not generally available, and the machine-generated HTM"
        + "L produced by some word processors for output purposes only.\n"
        + "\n"
        + "The \"Title Page\" means, for a printed book, the title page itself, plus such fol"
        + "lowing pages as are needed to hold, legibly, the material this License requires "
        + "to appear in the title page. For works in formats which do not have any title pa"
        + "ge as such, \"Title Page\" means the text near the most prominent appearance of th"
        + "e work's title, preceding the beginning of the body of the text. \n"
        + "\n"
        + "2. VERBATIM COPYING\n"
        + "\n"
        + "You may copy and distribute the Document in any medium, either commercially or n"
        + "oncommercially, provided that this License, the copyright notices, and the licen"
        + "se notice saying this License applies to the Document are reproduced in all copi"
        + "es, and that you add no other conditions whatsoever to those of this License. Yo"
        + "u may not use technical measures to obstruct or control the reading or further c"
        + "opying of the copies you make or distribute. However, you may accept compensatio"
        + "n in exchange for copies. If you distribute a large enough number of copies you "
        + "must also follow the conditions in section 3.\n"
        + "\n"
        + "You may also lend copies, under the same conditions stated above, and you may pu"
        + "blicly display copies. \n"
        + "\n"
        + "3. COPYING IN QUANTITY\n"
        + "\n"
        + "If you publish printed copies of the Document numbering more than 100, and the D"
        + "ocument's license notice requires Cover Texts, you must enclose the copies in co"
        + "vers that carry, clearly and legibly, all these Cover Texts: Front-Cover Texts o"
        + "n the front cover, and Back-Cover Texts on the back cover. Both covers must also"
        + " clearly and legibly identify you as the publisher of these copies. The front co"
        + "ver must present the full title with all words of the title equally prominent an"
        + "d visible. You may add other material on the covers in addition. Copying with ch"
        + "anges limited to the covers, as long as they preserve the title of the Document "
        + "and satisfy these conditions, can be treated as verbatim copying in other respec"
        + "ts.\n"
        + "\n"
        + "If the required texts for either cover are too voluminous to fit legibly, you sh"
        + "ould put the first ones listed (as many as fit reasonably) on the actual cover, "
        + "and continue the rest onto adjacent pages.\n"
        + "\n"
        + "If you publish or distribute Opaque copies of the Document numbering more than 1"
        + "00, you must either include a machine-readable Transparent copy along with each "
        + "Opaque copy, or state in or with each Opaque copy a publicly-accessible computer"
        + "-network location containing a complete Transparent copy of the Document, free o"
        + "f added material, which the general network-using public has access to download "
        + "anonymously at no charge using public-standard network protocols. If you use the"
        + " latter option, you must take reasonably prudent steps, when you begin distribut"
        + "ion of Opaque copies in quantity, to ensure that this Transparent copy will rema"
        + "in thus accessible at the stated location until at least one year after the last"
        + " time you distribute an Opaque copy (directly or through your agents or retailer"
        + "s) of that edition to the public.\n"
        + "\n"
        + "It is requested, but not required, that you contact the authors of the Document "
        + "well before redistributing any large number of copies, to give them a chance to "
        + "provide you with an updated version of the Document. \n"
        + "\n"
        + "4. MODIFICATIONS\n"
        + "\n"
        + "You may copy and distribute a Modified Version of the Document under the conditi"
        + "ons of sections 2 and 3 above, provided that you release the Modified Version un"
        + "der precisely this License, with the Modified Version filling the role of the Do"
        + "cument, thus licensing distribution and modification of the Modified Version to "
        + "whoever possesses a copy of it. In addition, you must do these things in the Mod"
        + "ified Version:\n"
        + "\n"
        + "     A. Use in the Title Page (and on the covers, if any) a title distinct from "
        + "that of the Document, and from those of previous versions (which should, if ther"
        + "e were any, be listed in the History section of the Document). You may use the s"
        + "ame title as a previous version if the original publisher of that version gives "
        + "permission. \n"
        + "     B. List on the Title Page, as authors, one or more persons or entities resp"
        + "onsible for authorship of the modifications in the Modified Version, together wi"
        + "th at least five of the principal authors of the Document (all of its principal "
        + "authors, if it has less than five). \n"
        + "     C. State on the Title page the name of the publisher of the Modified Versio"
        + "n, as the publisher. \n"
        + "     D. Preserve all the copyright notices of the Document. \n"
        + "     E. Add an appropriate copyright notice for your modifications adjacent to t"
        + "he other copyright notices. \n"
        + "     F. Include, immediately after the copyright notices, a license notice givin"
        + "g the public permission to use the Modified Version under the terms of this Lice"
        + "nse, in the form shown in the Addendum below. \n"
        + "     G. Preserve in that license notice the full lists of Invariant Sections and"
        + " required Cover Texts given in the Document's license notice. \n"
        + "     H. Include an unaltered copy of this License. \n"
        + "     I. Preserve the section entitled \"History\", and its title, and add to it an"
        + " item stating at least the title, year, new authors, and publisher of the Modifi"
        + "ed Version as given on the Title Page. If there is no section entitled \"History\""
        + " in the Document, create one stating the title, year, authors, and publisher of "
        + "the Document as given on its Title Page, then add an item describing the Modifie"
        + "d Version as stated in the previous sentence. \n"
        + "     J. Preserve the network location, if any, given in the Document for public "
        + "access to a Transparent copy of the Document, and likewise the network locations"
        + " given in the Document for previous versions it was based on. These may be place"
        + "d in the \"History\" section. You may omit a network location for a work that was "
        + "published at least four years before the Document itself, or if the original pub"
        + "lisher of the version it refers to gives permission. \n"
        + "     K. In any section entitled \"Acknowledgements\" or \"Dedications\", preserve th"
        + "e section's title, and preserve in the section all the substance and tone of eac"
        + "h of the contributor acknowledgements and/or dedications given therein. \n"
        + "     L. Preserve all the Invariant Sections of the Document, unaltered in their "
        + "text and in their titles. Section numbers or the equivalent are not considered p"
        + "art of the section titles. \n"
        + "     M. Delete any section entitled \"Endorsements\". Such a section may not be in"
        + "cluded in the Modified Version. \n"
        + "     N. Do not retitle any existing section as \"Endorsements\" or to conflict in "
        + "title with any Invariant Section.\n"
        + "\n"
        + "If the Modified Version includes new front-matter sections or appendices that qu"
        + "alify as Secondary Sections and contain no material copied from the Document, yo"
        + "u may at your option designate some or all of these sections as invariant. To do"
        + " this, add their titles to the list of Invariant Sections in the Modified Versio"
        + "n's license notice. These titles must be distinct from any other section titles.\n"
        + "\n"
        + "You may add a section entitled \"Endorsements\", provided it contains nothing but "
        + "endorsements of your Modified Version by various parties--for example, statement"
        + "s of peer review or that the text has been approved by an organization as the au"
        + "thoritative definition of a standard.\n"
        + "\n"
        + "You may add a passage of up to five words as a Front-Cover Text, and a passage o"
        + "f up to 25 words as a Back-Cover Text, to the end of the list of Cover Texts in "
        + "the Modified Version. Only one passage of Front-Cover Text and one of Back-Cover"
        + " Text may be added by (or through arrangements made by) any one entity. If the D"
        + "ocument already includes a cover text for the same cover, previously added by yo"
        + "u or by arrangement made by the same entity you are acting on behalf of, you may"
        + " not add another; but you may replace the old one, on explicit permission from t"
        + "he previous publisher that added the old one.\n"
        + "\n"
        + "The author(s) and publisher(s) of the Document do not by this License give permi"
        + "ssion to use their names for publicity for or to assert or imply endorsement of "
        + "any Modified Version. \n"
        + "\n"
        + "5. COMBINING DOCUMENTS\n"
        + "\n"
        + "You may combine the Document with other documents released under this License, u"
        + "nder the terms defined in section 4 above for modified versions, provided that y"
        + "ou include in the combination all of the Invariant Sections of all of the origin"
        + "al documents, unmodified, and list them all as Invariant Sections of your combin"
        + "ed work in its license notice.\n"
        + "\n"
        + "The combined work need only contain one copy of this License, and multiple ident"
        + "ical Invariant Sections may be replaced with a single copy. If there are multipl"
        + "e Invariant Sections with the same name but different contents, make the title o"
        + "f each such section unique by adding at the end of it, in parentheses, the name "
        + "of the original author or publisher of that section if known, or else a unique n"
        + "umber. Make the same adjustment to the section titles in the list of Invariant S"
        + "ections in the license notice of the combined work.\n"
        + "\n"
        + "In the combination, you must combine any sections entitled \"History\" in the vari"
        + "ous original documents, forming one section entitled \"History\"; likewise combine"
        + " any sections entitled \"Acknowledgements\", and any sections entitled \"Dedication"
        + "s\". You must delete all sections entitled \"Endorsements.\" \n"
        + "\n"
        + "6. COLLECTIONS OF DOCUMENTS\n"
        + "\n"
        + "You may make a collection consisting of the Document and other documents release"
        + "d under this License, and replace the individual copies of this License in the v"
        + "arious documents with a single copy that is included in the collection, provided"
        + " that you follow the rules of this License for verbatim copying of each of the d"
        + "ocuments in all other respects.\n"
        + "\n"
        + "You may extract a single document from such a collection, and distribute it indi"
        + "vidually under this License, provided you insert a copy of this License into the"
        + " extracted document, and follow this License in all other respects regarding ver"
        + "batim copying of that document. \n"
        + "\n"
        + "7. AGGREGATION WITH INDEPENDENT WORKS\n"
        + "\n"
        + "A compilation of the Document or its derivatives with other separate and indepen"
        + "dent documents or works, in or on a volume of a storage or distribution medium, "
        + "does not as a whole count as a Modified Version of the Document, provided no com"
        + "pilation copyright is claimed for the compilation. Such a compilation is called "
        + "an \"aggregate\", and this License does not apply to the other self-contained work"
        + "s thus compiled with the Document, on account of their being thus compiled, if t"
        + "hey are not themselves derivative works of the Document.\n"
        + "\n"
        + "If the Cover Text requirement of section 3 is applicable to these copies of the "
        + "Document, then if the Document is less than one quarter of the entire aggregate,"
        + " the Document's Cover Texts may be placed on covers that surround only the Docum"
        + "ent within the aggregate. Otherwise they must appear on covers around the whole "
        + "aggregate. \n"
        + "\n"
        + "8. TRANSLATION\n"
        + "\n"
        + "Translation is considered a kind of modification, so you may distribute translat"
        + "ions of the Document under the terms of section 4. Replacing Invariant Sections "
        + "with translations requires special permission from their copyright holders, but "
        + "you may include translations of some or all Invariant Sections in addition to th"
        + "e original versions of these Invariant Sections. You may include a translation o"
        + "f this License provided that you also include the original English version of th"
        + "is License. In case of a disagreement between the translation and the original E"
        + "nglish version of this License, the original English version will prevail. \n"
        + "\n"
        + "9. TERMINATION\n"
        + "\n"
        + "You may not copy, modify, sublicense, or distribute the Document except as expre"
        + "ssly provided for under this License. Any other attempt to copy, modify, sublice"
        + "nse or distribute the Document is void, and will automatically terminate your ri"
        + "ghts under this License. However, parties who have received copies, or rights, f"
        + "rom you under this License will not have their licenses terminated so long as su"
        + "ch parties remain in full compliance. \n"
        + "\n"
        + "10. FUTURE REVISIONS OF THIS LICENSE\n"
        + "\n"
        + "The Free Software Foundation may publish new, revised versions of the GNU Free D"
        + "ocumentation License from time to time. Such new versions will be similar in spi"
        + "rit to the present version, but may differ in detail to address new problems or "
        + "concerns. See http://www.gnu.org/copyleft/.\n"
        + "\n"
        + "Each version of the License is given a distinguishing version number. If the Doc"
        + "ument specifies that a particular numbered version of this License \"or any later"
        + " version\" applies to it, you have the option of following the terms and conditio"
        + "ns either of that specified version or of any later version that has been publis"
        + "hed (not as a draft) by the Free Software Foundation. If the Document does not s"
        + "pecify a version number of this License, you may choose any version ever publish"
        + "ed (not as a draft) by the Free Software Foundation. \n"
        + "\n"
        + "ADDENDUM: How to use this License for your documents\n"
        + "\n"
        + "To use this License in a document you have written, include a copy of the Licens"
        + "e in the document and put the following copyright and license notices just after"
        + " the title page:\n"
        + "\n"
        + " Copyright (c) YEAR YOUR NAME. Permission is granted to copy, distribute and/or "
        + "modify this document under the terms of the GNU Free Documentation License, Vers"
        + "ion 1.1 or any later version published by the Free Software Foundation; with the"
        + " Invariant Sections being LIST THEIR TITLES, with the Front-Cover Texts being LI"
        + "ST, and with the Back-Cover Texts being LIST. A copy of the license is included "
        + "in the section entitled \"GNU Free Documentation License\".\n"
        + "\n"
        + "If you have no Invariant Sections, write \"with no Invariant Sections\" instead of"
        + " saying which ones are invariant. If you have no Front-Cover Texts, write \"no Fr"
        + "ont-Cover Texts\" instead of \"Front-Cover Texts being LIST\"; likewise for Back-Co"
        + "ver Texts.\n"
        + "\n"
        + "If your document contains nontrivial examples of program code, we recommend rele"
        + "asing these examples in parallel under your choice of free software license, suc"
        + "h as the GNU General Public License, to permit their use in free software.\n"
; // the license text
    }
 
    
}
