package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:15Z
 * LicenseName: AGPL-3.0+
 * FileName: GFDL_1_2.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class GFDL_1_2 extends License{
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
        return "GFDL-1.2"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "GNU Free Documentation License v1.2"; // full text title
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
        + "Version 1.2, November 2002 \n"
        + "\n"
        + "Copyright (C) 2000,2001,2002 Free Software Foundation, Inc. 51 Franklin St, Fift"
        + "h Floor, Boston, MA 02110-1301 USA \n"
        + "\n"
        + "Everyone is permitted to copy and distribute verbatim copies of this license doc"
        + "ument, but changing it is not allowed. \n"
        + "\n"
        + "0. PREAMBLE\n"
        + "\n"
        + "The purpose of this License is to make a manual, textbook, or other functional a"
        + "nd useful document \"free\" in the sense of freedom: to assure everyone the effect"
        + "ive freedom to copy and redistribute it, with or without modifying it, either co"
        + "mmercially or noncommercially. Secondarily, this License preserves for the autho"
        + "r and publisher a way to get credit for their work, while not being considered r"
        + "esponsible for modifications made by others.\n"
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
        + "This License applies to any manual or other work, in any medium, that contains a"
        + " notice placed by the copyright holder saying it can be distributed under the te"
        + "rms of this License. Such a notice grants a world-wide, royalty-free license, un"
        + "limited in duration, to use that work under the conditions stated herein. The \"D"
        + "ocument\", below, refers to any such manual or work. Any member of the public is "
        + "a licensee, and is addressed as \"you\". You accept the license if you copy, modif"
        + "y or distribute the work in a way requiring permission under copyright law.\n"
        + "\n"
        + "A \"Modified Version\" of the Document means any work containing the Document or a"
        + " portion of it, either copied verbatim, or with modifications and/or translated "
        + "into another language.\n"
        + "\n"
        + "A \"Secondary Section\" is a named appendix or a front-matter section of the Docum"
        + "ent that deals exclusively with the relationship of the publishers or authors of"
        + " the Document to the Document's overall subject (or to related matters) and cont"
        + "ains nothing that could fall directly within that overall subject. (Thus, if the"
        + " Document is in part a textbook of mathematics, a Secondary Section may not expl"
        + "ain any mathematics.) The relationship could be a matter of historical connectio"
        + "n with the subject or with related matters, or of legal, commercial, philosophic"
        + "al, ethical or political position regarding them.\n"
        + "\n"
        + "The \"Invariant Sections\" are certain Secondary Sections whose titles are designa"
        + "ted, as being those of Invariant Sections, in the notice that says that the Docu"
        + "ment is released under this License. If a section does not fit the above definit"
        + "ion of Secondary then it is not allowed to be designated as Invariant. The Docum"
        + "ent may contain zero Invariant Sections. If the Document does not identify any I"
        + "nvariant Sections then there are none.\n"
        + "\n"
        + "The \"Cover Texts\" are certain short passages of text that are listed, as Front-C"
        + "over Texts or Back-Cover Texts, in the notice that says that the Document is rel"
        + "eased under this License. A Front-Cover Text may be at most 5 words, and a Back-"
        + "Cover Text may be at most 25 words.\n"
        + "\n"
        + "A \"Transparent\" copy of the Document means a machine-readable copy, represented "
        + "in a format whose specification is available to the general public, that is suit"
        + "able for revising the document straightforwardly with generic text editors or (f"
        + "or images composed of pixels) generic paint programs or (for drawings) some wide"
        + "ly available drawing editor, and that is suitable for input to text formatters o"
        + "r for automatic translation to a variety of formats suitable for input to text f"
        + "ormatters. A copy made in an otherwise Transparent file format whose markup, or "
        + "absence of markup, has been arranged to thwart or discourage subsequent modifica"
        + "tion by readers is not Transparent. An image format is not Transparent if used f"
        + "or any substantial amount of text. A copy that is not \"Transparent\" is called \"O"
        + "paque\".\n"
        + "\n"
        + "Examples of suitable formats for Transparent copies include plain ASCII without "
        + "markup, Texinfo input format, LaTeX input format, SGML or XML using a publicly a"
        + "vailable DTD, and standard-conforming simple HTML, PostScript or PDF designed fo"
        + "r human modification. Examples of transparent image formats include PNG, XCF and"
        + " JPG. Opaque formats include proprietary formats that can be read and edited onl"
        + "y by proprietary word processors, SGML or XML for which the DTD and/or processin"
        + "g tools are not generally available, and the machine-generated HTML, PostScript "
        + "or PDF produced by some word processors for output purposes only.\n"
        + "\n"
        + "The \"Title Page\" means, for a printed book, the title page itself, plus such fol"
        + "lowing pages as are needed to hold, legibly, the material this License requires "
        + "to appear in the title page. For works in formats which do not have any title pa"
        + "ge as such, \"Title Page\" means the text near the most prominent appearance of th"
        + "e work's title, preceding the beginning of the body of the text.\n"
        + "\n"
        + "A section \"Entitled XYZ\" means a named subunit of the Document whose title eithe"
        + "r is precisely XYZ or contains XYZ in parentheses following text that translates"
        + " XYZ in another language. (Here XYZ stands for a specific section name mentioned"
        + " below, such as \"Acknowledgements\", \"Dedications\", \"Endorsements\", or \"History\"."
        + ") To \"Preserve the Title\" of such a section when you modify the Document means t"
        + "hat it remains a section \"Entitled XYZ\" according to this definition.\n"
        + "\n"
        + "The Document may include Warranty Disclaimers next to the notice which states th"
        + "at this License applies to the Document. These Warranty Disclaimers are consider"
        + "ed to be included by reference in this License, but only as regards disclaiming "
        + "warranties: any other implication that these Warranty Disclaimers may have is vo"
        + "id and has no effect on the meaning of this License. \n"
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
        + "If you publish printed copies (or copies in media that commonly have printed cov"
        + "ers) of the Document, numbering more than 100, and the Document's license notice"
        + " requires Cover Texts, you must enclose the copies in covers that carry, clearly"
        + " and legibly, all these Cover Texts: Front-Cover Texts on the front cover, and B"
        + "ack-Cover Texts on the back cover. Both covers must also clearly and legibly ide"
        + "ntify you as the publisher of these copies. The front cover must present the ful"
        + "l title with all words of the title equally prominent and visible. You may add o"
        + "ther material on the covers in addition. Copying with changes limited to the cov"
        + "ers, as long as they preserve the title of the Document and satisfy these condit"
        + "ions, can be treated as verbatim copying in other respects.\n"
        + "\n"
        + "If the required texts for either cover are too voluminous to fit legibly, you sh"
        + "ould put the first ones listed (as many as fit reasonably) on the actual cover, "
        + "and continue the rest onto adjacent pages.\n"
        + "\n"
        + "If you publish or distribute Opaque copies of the Document numbering more than 1"
        + "00, you must either include a machine-readable Transparent copy along with each "
        + "Opaque copy, or state in or with each Opaque copy a computer-network location fr"
        + "om which the general network-using public has access to download using public-st"
        + "andard network protocols a complete Transparent copy of the Document, free of ad"
        + "ded material. If you use the latter option, you must take reasonably prudent ste"
        + "ps, when you begin distribution of Opaque copies in quantity, to ensure that thi"
        + "s Transparent copy will remain thus accessible at the stated location until at l"
        + "east one year after the last time you distribute an Opaque copy (directly or thr"
        + "ough your agents or retailers) of that edition to the public.\n"
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
        + "authors, if it has fewer than five), unless they release you from this requireme"
        + "nt. \n"
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
        + "     I. Preserve the section Entitled \"History\", Preserve its Title, and add to "
        + "it an item stating at least the title, year, new authors, and publisher of the M"
        + "odified Version as given on the Title Page. If there is no section Entitled \"His"
        + "tory\" in the Document, create one stating the title, year, authors, and publishe"
        + "r of the Document as given on its Title Page, then add an item describing the Mo"
        + "dified Version as stated in the previous sentence. \n"
        + "     J. Preserve the network location, if any, given in the Document for public "
        + "access to a Transparent copy of the Document, and likewise the network locations"
        + " given in the Document for previous versions it was based on. These may be place"
        + "d in the \"History\" section. You may omit a network location for a work that was "
        + "published at least four years before the Document itself, or if the original pub"
        + "lisher of the version it refers to gives permission. \n"
        + "     K. For any section Entitled \"Acknowledgements\" or \"Dedications\", Preserve t"
        + "he Title of the section, and preserve in the section all the substance and tone "
        + "of each of the contributor acknowledgements and/or dedications given therein. \n"
        + "     L. Preserve all the Invariant Sections of the Document, unaltered in their "
        + "text and in their titles. Section numbers or the equivalent are not considered p"
        + "art of the section titles. \n"
        + "     M. Delete any section Entitled \"Endorsements\". Such a section may not be in"
        + "cluded in the Modified Version. \n"
        + "     N. Do not retitle any existing section to be Entitled \"Endorsements\" or to "
        + "conflict in title with any Invariant Section. \n"
        + "     O. Preserve any Warranty Disclaimers.\n"
        + "\n"
        + "If the Modified Version includes new front-matter sections or appendices that qu"
        + "alify as Secondary Sections and contain no material copied from the Document, yo"
        + "u may at your option designate some or all of these sections as invariant. To do"
        + " this, add their titles to the list of Invariant Sections in the Modified Versio"
        + "n's license notice. These titles must be distinct from any other section titles.\n"
        + "\n"
        + "You may add a section Entitled \"Endorsements\", provided it contains nothing but "
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
        + "ed work in its license notice, and that you preserve all their Warranty Disclaim"
        + "ers.\n"
        + "\n"
        + "The combined work need only contain one copy of this License, and multiple ident"
        + "ical Invariant Sections may be replaced with a single copy. If there are multipl"
        + "e Invariant Sections with the same name but different contents, make the title o"
        + "f each such section unique by adding at the end of it, in parentheses, the name "
        + "of the original author or publisher of that section if known, or else a unique n"
        + "umber. Make the same adjustment to the section titles in the list of Invariant S"
        + "ections in the license notice of the combined work.\n"
        + "\n"
        + "In the combination, you must combine any sections Entitled \"History\" in the vari"
        + "ous original documents, forming one section Entitled \"History\"; likewise combine"
        + " any sections Entitled \"Acknowledgements\", and any sections Entitled \"Dedication"
        + "s\". You must delete all sections Entitled \"Endorsements\". \n"
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
        + "is called an \"aggregate\" if the copyright resulting from the compilation is not "
        + "used to limit the legal rights of the compilation's users beyond what the indivi"
        + "dual works permit. When the Document is included in an aggregate, this License d"
        + "oes not apply to the other works in the aggregate which are not themselves deriv"
        + "ative works of the Document.\n"
        + "\n"
        + "If the Cover Text requirement of section 3 is applicable to these copies of the "
        + "Document, then if the Document is less than one half of the entire aggregate, th"
        + "e Document's Cover Texts may be placed on covers that bracket the Document withi"
        + "n the aggregate, or the electronic equivalent of covers if the Document is in el"
        + "ectronic form. Otherwise they must appear on printed covers that bracket the who"
        + "le aggregate. \n"
        + "\n"
        + "8. TRANSLATION\n"
        + "\n"
        + "Translation is considered a kind of modification, so you may distribute translat"
        + "ions of the Document under the terms of section 4. Replacing Invariant Sections "
        + "with translations requires special permission from their copyright holders, but "
        + "you may include translations of some or all Invariant Sections in addition to th"
        + "e original versions of these Invariant Sections. You may include a translation o"
        + "f this License, and all the license notices in the Document, and any Warranty Di"
        + "sclaimers, provided that you also include the original English version of this L"
        + "icense and the original versions of those notices and disclaimers. In case of a "
        + "disagreement between the translation and the original version of this License or"
        + " a notice or disclaimer, the original version will prevail.\n"
        + "\n"
        + "If a section in the Document is Entitled \"Acknowledgements\", \"Dedications\", or \""
        + "History\", the requirement (section 4) to Preserve its Title (section 1) will typ"
        + "ically require changing the actual title. \n"
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
        + "ion 1.2 or any later version published by the Free Software Foundation; with no "
        + "Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts. A copy of the"
        + " license is included in the section entitled \"GNU Free Documentation License\".\n"
        + "\n"
        + "If you have Invariant Sections, Front-Cover Texts and Back-Cover Texts, replace "
        + "the \"with...Texts.\" line with this:\n"
        + "\n"
        + " with the Invariant Sections being LIST THEIR TITLES, with the Front-Cover Texts"
        + " being LIST, and with the Back-Cover Texts being LIST.\n"
        + "\n"
        + "If you have Invariant Sections without Cover Texts, or some other combination of"
        + " the three, merge those two alternatives to suit the situation.\n"
        + "\n"
        + "If your document contains nontrivial examples of program code, we recommend rele"
        + "asing these examples in parallel under your choice of free software license, suc"
        + "h as the GNU General Public License, to permit their use in free software.\n"
; // the license text
    }
 
    
}
