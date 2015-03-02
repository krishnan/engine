package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:19Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: CECILL_1_1.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CECILL_1_1 extends License{
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
        return "CECILL-1.1"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "CeCILL Free Software License Agreement v1.1"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return " FREE SOFTWARE LICENSING AGREEMENT CeCILL \n"
        + "\n"
        + "Notice\n"
        + "\n"
        + "This Agreement is a free software license that is the result of discussions betw"
        + "een its authors in order to ensure compliance with the two main principles guidi"
        + "ng its drafting: \n"
        + " - firstly, its conformity with French law, both as regards the law of torts and"
        + " intellectual property law, and the protection that it offers to authors and the"
        + " holders of economic rights over software. \n"
        + " - secondly, compliance with the principles for the distribution of free softwar"
        + "e: access to source codes, extended user-rights.\n"
        + "\n"
        + "The following bodies are the authors of this license CeCILL (Ce : CEA, C : CNRS,"
        + " I : INRIA, LL : Logiciel Libre):\n"
        + "\n"
        + "Commissariat à l'Energie Atomique - CEA, a public scientific, technical and indu"
        + "strial establishment, having its principal place of business at 31-33 rue de la "
        + "Fédération, 75752 PARIS cedex 15, France.\n"
        + "\n"
        + "Centre National de la Recherche Scientifique - CNRS, a public scientific and tec"
        + "hnological establishment, having its principal place of business at 3 rue Michel"
        + "-Ange 75794 Paris cedex 16, France.\n"
        + "\n"
        + "Institut National de Recherche en Informatique et en Automatique - INRIA, a publ"
        + "ic scientific and technological establishment, having its principal place of bus"
        + "iness at Domaine de Voluceau, Rocquencourt, BP 105, 78153 Le Chesnay cedex. \n"
        + "\n"
        + "PREAMBLE\n"
        + "\n"
        + "The purpose of this Free Software Licensing Agreement is to grant users the righ"
        + "t to modify and redistribute the software governed by this license within the fr"
        + "amework of an \"open source\" distribution model.\n"
        + "\n"
        + "The exercising of these rights is conditional upon certain obligations for users"
        + " so as to ensure that this status is retained for subsequent redistribution oper"
        + "ations.\n"
        + "\n"
        + "As a counterpart to the access to the source code and rights to copy, modify and"
        + " redistribute granted by the license, users are provided only with a limited war"
        + "ranty and the software's author, the holder of the economic rights, and the succ"
        + "essive licensors only have limited liability.\n"
        + "\n"
        + "In this respect, it is brought to the user's attention that the risks associated"
        + " with loading, using, modifying and/or developing or reproducing the software by"
        + " the user given its nature of Free Software, that may mean that it is complicate"
        + "d to manipulate, and that also therefore means that it is reserved for developer"
        + "s and experienced professionals having in-depth computer knowledge. Users are th"
        + "erefore encouraged to load and test the Software's suitability as regards their "
        + "requirements in conditions enabling the security of their systems and/or data to"
        + " be ensured and, more generally, to use and operate it in the same conditions of"
        + " security. This Agreement may be freely reproduced and published, provided it is"
        + " not altered, and that no Articles are either added or removed herefrom. \n"
        + "\n"
        + "This Agreement may apply to any or all software for which the holder of the econ"
        + "omic rights decides to submit the operation thereof to its provisions. \n"
        + "\n"
        + "Article 1 - DEFINITIONS \n"
        + "\n"
        + "For the purposes of this Agreement, when the following expressions commence with"
        + " a capital letter, they shall have the following meaning:\n"
        + "\n"
        + "Agreement: means this Licensing Agreement, and any or all of its subsequent vers"
        + "ions.\n"
        + "\n"
        + "Software: means the software in its Object Code and/or Source Code form and, whe"
        + "re applicable, its documentation, \"as is\" at the time when the Licensee accepts "
        + "the Agreement.\n"
        + "\n"
        + "Initial Software: means the Software in its Source Code and/or Object Code form "
        + "and, where applicable, its documentation, \"as is\" at the time when it is distrib"
        + "uted for the first time under the terms and conditions of the Agreement.\n"
        + "\n"
        + "Modified Software: means the Software modified by at least one Contribution.\n"
        + "\n"
        + "Source Code: means all the Software's instructions and program lines to which ac"
        + "cess is required so as to modify the Software.\n"
        + "\n"
        + "Object Code: means the binary files originating from the compilation of the Sour"
        + "ce Code.\n"
        + "\n"
        + "Holder: means the holder of the economic rights over the Initial Software.\n"
        + "\n"
        + "Licensee(s): mean(s) the Software user(s) having accepted the Agreement.\n"
        + "\n"
        + "Contributor: means a Licensee having made at least one Contribution.\n"
        + "\n"
        + "Licensor: means the Holder, or any or all other individual or legal entity, that"
        + " distributes the Software under the Agreement.\n"
        + "\n"
        + "Contributions: mean any or all modifications, corrections, translations, adaptat"
        + "ions and/or new functionalities integrated into the Software by any or all Contr"
        + "ibutor, and the Static Modules.\n"
        + "\n"
        + "Module: means a set of sources files including their documentation that, once co"
        + "mpiled in executable form, enables supplementary functionalities or services to "
        + "be developed in addition to those offered by the Software.\n"
        + "\n"
        + "Dynamic Module: means any or all module, created by the Contributor, that is ind"
        + "ependent of the Software, so that this module and the Software are in two differ"
        + "ent executable forms that are run in separate address spaces, with one calling t"
        + "he other when they are run.\n"
        + "\n"
        + "Static Module: means any or all module, created by the Contributor and connected"
        + " to the Software by a static link that makes their object codes interdependent. "
        + "This module and the Software to which it is connected, are combined in a single "
        + "executable.\n"
        + "\n"
        + "Parties: mean both the Licensee and the Licensor.\n"
        + "\n"
        + "These expressions may be used both in singular and plural form. \n"
        + "\n"
        + "Article 2 - PURPOSE  \n"
        + "\n"
        + "The purpose of the Agreement is to enable the Licensor to grant the Licensee a f"
        + "ree, non-exclusive, transferable and worldwide License for the Software as set f"
        + "orth in Article 5 hereinafter for the whole term of protection of the rights ove"
        + "r said Software. \n"
        + "\n"
        + "Article 3 - ACCEPTANCE  \n"
        + "\n"
        + "3.1. The Licensee shall be deemed as having accepted the terms and conditions of"
        + " this Agreement by the occurrence of the first of the following events: \n"
        + "     (i) loading the Software by any or all means, notably, by downloading from "
        + "a remote server, or by loading from a physical medium; \n"
        + "     (ii) the first time the Licensee exercises any of the rights granted hereun"
        + "der.\n"
        + "\n"
        + "3.2. One copy of the Agreement, containing a notice relating to the specific nat"
        + "ure of the Software, to the limited warranty, and to the limitation to use by ex"
        + "perienced users has been provided to the Licensee prior to its acceptance as set"
        + " forth in Article 3.1 hereinabove, and the Licensee hereby acknowledges that it "
        + "is aware thereof. \n"
        + "\n"
        + "Article 4 - EFFECTIVE DATE AND TERM   \n"
        + "\n"
        + "4.1. EFFECTIVE DATE\n"
        + "\n"
        + "The Agreement shall become effective on the date when it is accepted by the Lice"
        + "nsee as set forth in Article 3.1.\n"
        + "\n"
        + "4.2. TERM\n"
        + "\n"
        + "The Agreement shall remain in force during the whole legal term of protection of"
        + " the economic rights over the Software. \n"
        + "\n"
        + "Article 5 - SCOPE OF THE RIGHTS GRANTED --------------------------------------- \n"
        + "\n"
        + "The Licensor hereby grants to the Licensee, that accepts such, the following rig"
        + "hts as regards the Software for any or all use, and for the term of the Agreemen"
        + "t, on the basis of the terms and conditions set forth hereinafter.\n"
        + "\n"
        + "Otherwise, the Licensor grants to the Licensee free of charge exploitation right"
        + "s on the patents he holds on whole or part of the inventions implemented in the "
        + "Software.\n"
        + "\n"
        + "5.1. RIGHTS OF USE\n"
        + "\n"
        + "The Licensee is authorized to use the Software, unrestrictedly, as regards the f"
        + "ields of application, with it being hereinafter specified that this relates to: \n"
        + "     1. permanent or temporary reproduction of all or part of the Software by an"
        + "y or all means and in any or all form. \n"
        + "     2. loading, displaying, running, or storing the Software on any or all medi"
        + "um. \n"
        + "     3. entitlement to observe, study or test the operation thereof so as to est"
        + "ablish the ideas and principles that form the basis for any or all constituent e"
        + "lements of said Software. This shall apply when the Licensee carries out any or "
        + "all loading, displaying, running, transmission or storage operation as regards t"
        + "he Software, that it is entitled to carry out hereunder.\n"
        + "\n"
        + "5.2. entitlement to make CONTRIBUTIONS\n"
        + "\n"
        + "The right to make Contributions includes the right to translate, adapt, arrange,"
        + " or make any or all modification to the Software, and the right to reproduce the"
        + " resulting Software.\n"
        + "\n"
        + "The Licensee is authorized to make any or all Contribution to the Software provi"
        + "ded that it explicitly mentions its name as the author of said Contribution and "
        + "the date of the development thereof.\n"
        + "\n"
        + "5.3. DISTRIBUTION AND PUBLICATION RIGHTS\n"
        + "\n"
        + "In particular, the right of distribution and publication includes the right to t"
        + "ransmit and communicate the Software to the general public on any or all medium,"
        + " and by any or all means, and the right to market, either in consideration of a "
        + "fee, or free of charge, a copy or copies of the Software by means of any or all "
        + "process. The Licensee is further authorized to redistribute copies of the modifi"
        + "ed or unmodified Software to third parties according to the terms and conditions"
        + " set forth hereinafter.\n"
        + "\n"
        + "5.3.1. REDISTRIBUTION OF SOFTWARE WITHOUT MODIFICATION\n"
        + "\n"
        + "The Licensee is authorized to redistribute true copies of the Software in Source"
        + " Code or Object Code form, provided that said redistribution complies with all t"
        + "he provisions of the Agreement and is accompanied by: \n"
        + "\n"
        + "     1. a copy of the Agreement, \n"
        + "     2. a notice relating to the limitation of both the Licensor's warranty and "
        + "liability as set forth in Articles 8 and 9, \n"
        + "\n"
        + "and that, in the event that only the Software's Object Code is redistributed, th"
        + "e Licensee allows future Licensees unhindered access to the Software's full Sour"
        + "ce Code by providing them with the terms and conditions for access thereto, it b"
        + "eing understood that the additional cost of acquiring the Source Code shall not "
        + "exceed the cost of transferring the data.\n"
        + "\n"
        + "5.3.2. REDISTRIBUTION OF MODIFIED SOFTWARE\n"
        + "\n"
        + "When the Licensee makes a Contribution to the Software, the terms and conditions"
        + " for the redistribution of the Modified Software shall then be subject to all th"
        + "e provisions hereof.\n"
        + "\n"
        + "The Licensee is authorized to redistribute the Modified Software, in Source Code"
        + " or Object Code form, provided that said redistribution complies with all the pr"
        + "ovisions of the Agreement and is accompanied by: \n"
        + "\n"
        + "     1. a copy of the Agreement, \n"
        + "     2. a notice relating to the limitation of both the Licensor's warranty and "
        + "liability as set forth in Articles 8 and 9, \n"
        + "\n"
        + "and that, in the event that only the Modified Software's Object Code is redistri"
        + "buted, the Licensee allows future Licensees unhindered access to the Modified So"
        + "ftware's full Source Code by providing them with the terms and conditions for ac"
        + "cess thereto, it being understood that the additional cost of acquiring the Sour"
        + "ce Code shall not exceed the cost of transferring the data. \n"
        + "\n"
        + "5.3.3. redistribution OF DYNAMIC MODULES\n"
        + "\n"
        + "When the Licensee has developed a Dynamic Module, the terms and conditions hereo"
        + "f do not apply to said Dynamic Module, that may be distributed under a separate "
        + "Licensing Agreement.\n"
        + "\n"
        + "5.3.4. COMPATIBILITY WITH THE GPL LICENSE\n"
        + "\n"
        + "In the event that the Modified or unmodified Software is included in a code that"
        + " is subject to the provisions of the GPL License, the Licensee is authorized to "
        + "redistribute the whole under the GPL License.\n"
        + "\n"
        + "In the event that the Modified Software includes a code that is subject to the p"
        + "rovisions of the GPL License, the Licensee is authorized to redistribute the Mod"
        + "ified Software under the GPL License. \n"
        + "\n"
        + "Article 6 - INTELLECTUAL PROPERTY  \n"
        + "\n"
        + "6.1. OVER THE INITIAL SOFTWARE\n"
        + "\n"
        + "The Holder owns the economic rights over the Initial Software. Any or all use of"
        + " the Initial Software is subject to compliance with the terms and conditions und"
        + "er which the Holder has elected to distribute its work and no one shall be entit"
        + "led to and it shall have sole entitlement to modify the terms and conditions for"
        + " the distribution of said Initial Software.\n"
        + "\n"
        + "The Holder undertakes to maintain the distribution of the Initial Software under"
        + " the conditions of the Agreement, for the duration set forth in article 4.2..\n"
        + "\n"
        + "6.2. OVER THE CONTRIBUTIONS\n"
        + "\n"
        + "The intellectual property rights over the Contributions belong to the holder of "
        + "the economic rights as designated by effective legislation.\n"
        + "\n"
        + "6.3. OVER THE DYNAMIC MODULES\n"
        + "\n"
        + "The Licensee having developed a Dynamic Module is the holder of the intellectual"
        + " property rights over said Dynamic Module and is free to choose the agreement th"
        + "at shall govern its distribution.\n"
        + "\n"
        + "6.4. JOINT PROVISIONS\n"
        + "\n"
        + "6.4.1. The Licensee expressly undertakes: \n"
        + "\n"
        + "     1. not to remove, or modify, in any or all manner, the intellectual propert"
        + "y notices affixed to the Software; \n"
        + "     2. to reproduce said notices, in an identical manner, in the copies of the "
        + "Software.\n"
        + "\n"
        + "6.4.2. The Licensee undertakes not to directly or indirectly infringe the intell"
        + "ectual property rights of the Holder and/or Contributors and to take, where appl"
        + "icable, vis-à-vis its staff, any or all measures required to ensure respect for "
        + "said intellectual property rights of the Holder and/or Contributors. \n"
        + "\n"
        + "Article 7 - RELATED SERVICES  \n"
        + "\n"
        + "7.1. Under no circumstances shall the Agreement oblige the Licensor to provide t"
        + "echnical assistance or maintenance services for the Software.\n"
        + "\n"
        + "However, the Licensor is entitled to offer this type of service. The terms and c"
        + "onditions of such technical assistance, and/or such maintenance, shall then be s"
        + "et forth in a separate instrument. Only the Licensor offering said maintenance a"
        + "nd/or technical assistance services shall incur liability therefor.\n"
        + "\n"
        + "7.2. Similarly, any or all Licensor shall be entitled to offer to its Licensees,"
        + " under its own responsibility, a warranty, that shall only be binding upon itsel"
        + "f, for the redistribution of the Software and/or the Modified Software, under te"
        + "rms and conditions that it shall decide upon itself. Said warranty, and the fina"
        + "ncial terms and conditions of its application, shall be subject to a separate in"
        + "strument executed between the Licensor and the Licensee. \n"
        + "\n"
        + "Article 8 - LIABILITY \n"
        + "\n"
        + "8.1. Subject to the provisions of Article 8.2, should the Licensor fail to fulfi"
        + "ll all or part of its obligations hereunder, the Licensee shall be entitled to c"
        + "laim compensation for the direct loss suffered as a result of a fault on the par"
        + "t of the Licensor, subject to providing evidence of it. \n"
        + "\n"
        + "8.2. The Licensor's liability is limited to the commitments made under this Lice"
        + "nsing Agreement and shall not be incurred as a result , in particular: (i) of lo"
        + "ss due the Licensee's total or partial failure to fulfill its obligations, (ii) "
        + "direct or consequential loss due to the Software's use or performance that is su"
        + "ffered by the Licensee, when the latter is a professional using said Software fo"
        + "r professional purposes and (iii) consequential loss due to the Software's use o"
        + "r performance. The Parties expressly agree that any or all pecuniary or business"
        + " loss (i.e. loss of data, loss of profits, operating loss, loss of customers or "
        + "orders, opportunity cost, any disturbance to business activities) or any or all "
        + "legal proceedings instituted against the Licensee by a third party, shall consti"
        + "tute consequential loss and shall not provide entitlement to any or all compensa"
        + "tion from the Licensor. \n"
        + "\n"
        + "Article 9 - WARRANTY  \n"
        + "\n"
        + "9.1. The Licensee acknowledges that the current situation as regards scientific "
        + "and technical know-how at the time when the Software was distributed did not ena"
        + "ble all possible uses to be tested and verified, nor for the presence of any or "
        + "all faults to be detected. In this respect, the Licensee's attention has been dr"
        + "awn to the risks associated with loading, using, modifying and/or developing and"
        + " reproducing the Software that are reserved for experienced users.\n"
        + "\n"
        + "The Licensee shall be responsible for verifying, by any or all means, the produc"
        + "t's suitability for its requirements, its due and proper functioning, and for en"
        + "suring that it shall not cause damage to either persons or property.\n"
        + "\n"
        + "9.2. The Licensor hereby represents, in good faith, that it is entitled to grant"
        + " all the rights on the Software (including in particular the rights set forth in"
        + " Article 5 hereof over the Software).\n"
        + "\n"
        + "9.3. The Licensee acknowledges that the Software is supplied \"as is\" by the Lice"
        + "nsor without any or all other express or tacit warranty, other than that provide"
        + "d for in Article 9.2 and, in particular, without any or all warranty as to its m"
        + "arket value, its secured, innovative or relevant nature.\n"
        + "\n"
        + "Specifically, the Licensor does not warrant that the Software is free from any o"
        + "r all error, that it shall operate continuously, that it shall be compatible wit"
        + "h the Licensee's own equipment and its software configuration, nor that it shall"
        + " meet the Licensee's requirements.\n"
        + "\n"
        + "9.4. The Licensor does not either expressly or tacitly warrant that the Software"
        + " does not infringe any or all third party intellectual right relating to a paten"
        + "t, software or to any or all other property right. Moreover, the Licensor shall "
        + "not hold the Licensee harmless against any or all proceedings for infringement t"
        + "hat may be instituted in respect of the use, modification and redistribution of "
        + "the Software. Nevertheless, should such proceedings be instituted against the Li"
        + "censee, the Licensor shall provide it with technical and legal assistance for it"
        + "s defense. Such technical and legal assistance shall be decided upon on a case-b"
        + "y-case basis between the relevant Licensor and the Licensee pursuant to a memora"
        + "ndum of understanding. The Licensor disclaims any or all liability as regards th"
        + "e Licensee's use of the Software's name. No warranty shall be provided as regard"
        + "s the existence of prior rights over the name of the Software and as regards the"
        + " existence of a trademark. \n"
        + "\n"
        + "Article 10 - TERMINATION  \n"
        + "\n"
        + "10.1. In the event of a breach by the Licensee of its obligations hereunder, the"
        + " Licensor may automatically terminate this Agreement thirty (30) days after noti"
        + "ce has been sent to the Licensee and has remained ineffective.\n"
        + "\n"
        + "10.2. The Licensee whose Agreement is terminated shall no longer be authorized t"
        + "o use, modify or distribute the Software. However, any or all licenses that it m"
        + "ay have granted prior to termination of the Agreement shall remain valid subject"
        + " to their having been granted in compliance with the terms and conditions hereof"
        + ". \n"
        + "\n"
        + "Article 11 - MISCELLANEOUS PROVISIONS  \n"
        + "\n"
        + "11.1. EXCUSABLE EVENTS\n"
        + "\n"
        + "Neither Party shall be liable for any or all delay, or failure to perform the Ag"
        + "reement, that may be attributable to an event of force majeure, an act of God or"
        + " an outside cause, such as, notably, defective functioning, or interruptions aff"
        + "ecting the electricity or telecommunications networks, blocking of the network f"
        + "ollowing a virus attack, the intervention of the government authorities, natural"
        + " disasters, water damage, earthquakes, fire, explosions, strikes and labor unres"
        + "t, war, etc.\n"
        + "\n"
        + "11.2. The fact that either Party may fail, on one or several occasions, to invok"
        + "e one or several of the provisions hereof, shall under no circumstances be inter"
        + "preted as being a waiver by the interested Party of its entitlement to invoke sa"
        + "id provision(s) subsequently.\n"
        + "\n"
        + "11.3. The Agreement cancels and replaces any or all previous agreement, whether "
        + "written or oral, between the Parties and having the same purpose, and constitute"
        + "s the entirety of the agreement between said Parties concerning said purpose. No"
        + " supplement or modification to the terms and conditions hereof shall be effectiv"
        + "e as regards the Parties unless it is made in writing and signed by their duly a"
        + "uthorized representatives.\n"
        + "\n"
        + "11.4. In the event that one or several of the provisions hereof were to conflict"
        + " with a current or future applicable act or legislative text, said act or legisl"
        + "ative text shall take precedence, and the Parties shall make the necessary amend"
        + "ments so as to be in compliance with said act or legislative text. All the other"
        + " provisions shall remain effective. Similarly, the fact that a provision of the "
        + "Agreement may be null and void, for any reason whatsoever, shall not cause the A"
        + "greement as a whole to be null and void.\n"
        + "\n"
        + "11.5. LANGUAGE\n"
        + "\n"
        + "The Agreement is drafted in both French and English. In the event of a conflict "
        + "as regards construction, the French version shall be deemed authentic. \n"
        + "\n"
        + "Article 12 - NEW VERSIONS OF THE AGREEMENT \n"
        + "\n"
        + "12.1. Any or all person is authorized to duplicate and distribute copies of this"
        + " Agreement.\n"
        + "\n"
        + "12.2. So as to ensure coherence, the wording of this Agreement is protected and "
        + "may only be modified by the authors of the License, that reserve the right to pe"
        + "riodically publish updates or new versions of the Agreement, each with a separat"
        + "e number. These subsequent versions may address new issues encountered by Free S"
        + "oftware.\n"
        + "\n"
        + "12.3. Any or all Software distributed under a given version of the Agreement may"
        + " only be subsequently distributed under the same version of the Agreement, or a "
        + "subsequent version, subject to the provisions of article 5.3.4. \n"
        + "\n"
        + "Article 13 - GOVERNING LAW AND JURISDICTION  \n"
        + "\n"
        + "13.1. The Agreement is governed by French law. The Parties agree to endeavor to "
        + "settle the disagreements or disputes that may arise during the performance of th"
        + "e Agreement out-of-court.\n"
        + "\n"
        + "13.2. In the absence of an out-of-court settlement within two (2) months as from"
        + " their occurrence, and unless emergency proceedings are necessary, the disagreem"
        + "ents or disputes shall be referred to the Paris Courts having jurisdiction, by t"
        + "he first Party to take action. \n"
        + "\n"
        + " Version 1.1 of 10/26/2004 \n"
; // the license text
    }
 
    
}