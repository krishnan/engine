package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:18:01Z
 * LicenseName: AGPL-3.0+
 * FileName: ODbL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class ODbL_1_0 extends License{
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
        return "ODbL-1.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "ODC Open Database License v1.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "ODC Open Database License (ODbL)\n"
        + "\n"
        + "Preamble\n"
        + "\n"
        + "The Open Database License (ODbL) is a license agreement intended to allow users "
        + "to freely share, modify, and use this Database while maintaining this same freed"
        + "om for others. Many databases are covered by copyright, and therefore this docum"
        + "ent licenses these rights. Some jurisdictions, mainly in the European Union, hav"
        + "e specific rights that cover databases, and so the ODbL addresses these rights, "
        + "too. Finally, the ODbL is also an agreement in contract for users of this Databa"
        + "se to act in certain ways in return for accessing this Database.\n"
        + "\n"
        + "Databases can contain a wide variety of types of content (images, audiovisual ma"
        + "terial, and sounds all in the same database, for example), and so the ODbL only "
        + "governs the rights over the Database, and not the contents of the Database indiv"
        + "idually. Licensors should use the ODbL together with another license for the con"
        + "tents, if the contents have a single set of rights that uniformly covers all of "
        + "the contents. If the contents have multiple sets of different rights, Licensors "
        + "should describe what rights govern what contents together in the individual reco"
        + "rd or in some other way that clarifies what rights apply. \n"
        + "\n"
        + "Sometimes the contents of a database, or the database itself, can be covered by "
        + "other rights not addressed here (such as private contracts, trade mark over the "
        + "name, or privacy rights / data protection rights over information in the content"
        + "s), and so you are advised that you may have to consult other documents or clear"
        + " other rights before doing activities not covered by this License.\n"
        + "\n"
        + "------\n"
        + "\n"
        + "The Licensor (as defined below) \n"
        + "\n"
        + "and \n"
        + "\n"
        + "You (as defined below) \n"
        + "\n"
        + "agree as follows: \n"
        + "\n"
        + "1.0 Definitions of Capitalised Words\n"
        + "\n"
        + "\"Collective Database\" – Means this Database in unmodified form as part of a coll"
        + "ection of independent databases in themselves that together are assembled into a"
        + " collective whole. A work that constitutes a Collective Database will not be con"
        + "sidered a Derivative Database.\n"
        + "\n"
        + "\"Convey\" – As a verb, means Using the Database, a Derivative Database, or the Da"
        + "tabase as part of a Collective Database in any way that enables a Person to make"
        + " or receive copies of the Database or a Derivative Database. Conveying does not "
        + "include interaction with a user through a computer network, or creating and Usin"
        + "g a Produced Work, where no transfer of a copy of the Database or a Derivative D"
        + "atabase occurs. \"Contents\" – The contents of this Database, which includes the i"
        + "nformation, independent works, or other material collected into the Database. Fo"
        + "r example, the contents of the Database could be factual data or works such as i"
        + "mages, audiovisual material, text, or sounds.\n"
        + "\n"
        + "\"Database\" – A collection of material (the Contents) arranged in a systematic or"
        + " methodical way and individually accessible by electronic or other means offered"
        + " under the terms of this License.\n"
        + "\n"
        + "\"Database Directive\" – Means Directive 96/9/EC of the European Parliament and of"
        + " the Council of 11 March 1996 on the legal protection of databases, as amended o"
        + "r succeeded.\n"
        + "\n"
        + "\"Database Right\" – Means rights resulting from the Chapter III (\"sui generis\") r"
        + "ights in the Database Directive (as amended and as transposed by member states),"
        + " which includes the Extraction and Re-utilisation of the whole or a Substantial "
        + "part of the Contents, as well as any similar rights available in the relevant ju"
        + "risdiction under Section 10.4. \n"
        + "\n"
        + "\"Derivative Database\" – Means a database based upon the Database, and includes a"
        + "ny translation, adaptation, arrangement, modification, or any other alteration o"
        + "f the Database or of a Substantial part of the Contents. This includes, but is n"
        + "ot limited to, Extracting or Re-utilising the whole or a Substantial part of the"
        + " Contents in a new Database.\n"
        + "\n"
        + "\"Extraction\" – Means the permanent or temporary transfer of all or a Substantial"
        + " part of the Contents to another medium by any means or in any form.\n"
        + "\n"
        + "\"License\" – Means this license agreement and is both a license of rights such as"
        + " copyright and Database Rights and an agreement in contract.\n"
        + "\n"
        + "\"Licensor\" – Means the Person that offers the Database under the terms of this L"
        + "icense. \n"
        + "\n"
        + "\"Person\" – Means a natural or legal person or a body of persons corporate or inc"
        + "orporate.\n"
        + "\n"
        + "\"Produced Work\" – a work (such as an image, audiovisual material, text, or sound"
        + "s) resulting from using the whole or a Substantial part of the Contents (via a s"
        + "earch or other query) from this Database, a Derivative Database, or this Databas"
        + "e as part of a Collective Database. \n"
        + "\n"
        + "\"Publicly\" – means to Persons other than You or under Your control by either mor"
        + "e than 50% ownership or by the power to direct their activities (such as contrac"
        + "ting with an independent consultant). \n"
        + "\n"
        + "\"Re-utilisation\" – means any form of making available to the public all or a Sub"
        + "stantial part of the Contents by the distribution of copies, by renting, by onli"
        + "ne or other forms of transmission.\n"
        + "\n"
        + "\"Substantial\" – Means substantial in terms of quantity or quality or a combinati"
        + "on of both. The repeated and systematic Extraction or Re-utilisation of insubsta"
        + "ntial parts of the Contents may amount to the Extraction or Re-utilisation of a "
        + "Substantial part of the Contents.\n"
        + "\n"
        + "\"Use\" – As a verb, means doing any act that is restricted by copyright or Databa"
        + "se Rights whether in the original medium or any other; and includes without limi"
        + "tation distributing, copying, publicly performing, publicly displaying, and prep"
        + "aring derivative works of the Database, as well as modifying the Database as may"
        + " be technically necessary to use it in a different mode or format. \n"
        + "\n"
        + "\"You\" – Means a Person exercising rights under this License who has not previous"
        + "ly violated the terms of this License with respect to the Database, or who has r"
        + "eceived express permission from the Licensor to exercise rights under this Licen"
        + "se despite a previous violation.\n"
        + "\n"
        + "Words in the singular include the plural and vice versa.\n"
        + "\n"
        + "2.0 What this License covers\n"
        + "\n"
        + "2.1. Legal effect of this document. This License is:\n"
        + "\n"
        + "     a. A license of applicable copyright and neighbouring rights;\n"
        + "\n"
        + "     b. A license of the Database Right; and\n"
        + "\n"
        + "     c. An agreement in contract between You and the Licensor.\n"
        + "\n"
        + "2.2 Legal rights covered. This License covers the legal rights in the Database, "
        + "including:\n"
        + "\n"
        + "     a. Copyright. Any copyright or neighbouring rights in the Database. The cop"
        + "yright licensed includes any individual elements of the Database, but does not c"
        + "over the copyright over the Contents independent of this Database. See Section 2"
        + ".4 for details. Copyright law varies between jurisdictions, but is likely to cov"
        + "er: the Database model or schema, which is the structure, arrangement, and organ"
        + "isation of the Database, and can also include the Database tables and table inde"
        + "xes; the data entry and output sheets; and the Field names of Contents stored in"
        + " the Database;\n"
        + "\n"
        + "     b. Database Rights. Database Rights only extend to the Extraction and Re-ut"
        + "ilisation of the whole or a Substantial part of the Contents. Database Rights ca"
        + "n apply even when there is no copyright over the Database. Database Rights can a"
        + "lso apply when the Contents are removed from the Database and are selected and a"
        + "rranged in a way that would not infringe any applicable copyright; and\n"
        + "\n"
        + "     c. Contract. This is an agreement between You and the Licensor for access t"
        + "o the Database. In return you agree to certain conditions of use on this access "
        + "as outlined in this License. \n"
        + "\n"
        + "2.3 Rights not covered. \n"
        + "\n"
        + "     a. This License does not apply to computer programs used in the making or o"
        + "peration of the Database; \n"
        + "\n"
        + "     b. This License does not cover any patents over the Contents or the Databas"
        + "e; and\n"
        + "\n"
        + "     c. This License does not cover any trademarks associated with the Database."
        + " \n"
        + "\n"
        + "2.4 Relationship to Contents in the Database. The individual items of the Conten"
        + "ts contained in this Database may be covered by other rights, including copyrigh"
        + "t, patent, data protection, privacy, or personality rights, and this License doe"
        + "s not cover any rights (other than Database Rights or in contract) in individual"
        + " Contents contained in the Database. For example, if used on a Database of image"
        + "s (the Contents), this License would not apply to copyright over individual imag"
        + "es, which could have their own separate licenses, or one single license covering"
        + " all of the rights over the images. \n"
        + "\n"
        + "3.0 Rights granted\n"
        + "\n"
        + "3.1 Subject to the terms and conditions of this License, the Licensor grants to "
        + "You a worldwide, royalty-free, non-exclusive, terminable (but only under Section"
        + " 9) license to Use the Database for the duration of any applicable copyright and"
        + " Database Rights. These rights explicitly include commercial use, and do not exc"
        + "lude any field of endeavour. To the extent possible in the relevant jurisdiction"
        + ", these rights may be exercised in all media and formats whether now known or cr"
        + "eated in the future. \n"
        + "\n"
        + "The rights granted cover, for example:\n"
        + "\n"
        + "     a. Extraction and Re-utilisation of the whole or a Substantial part of the "
        + "Contents;\n"
        + "\n"
        + "     b. Creation of Derivative Databases;\n"
        + "\n"
        + "     c. Creation of Collective Databases;\n"
        + "\n"
        + "     d. Creation of temporary or permanent reproductions by any means and in any"
        + " form, in whole or in part, including of any Derivative Databases or as a part o"
        + "f Collective Databases; and\n"
        + "\n"
        + "     e. Distribution, communication, display, lending, making available, or perf"
        + "ormance to the public by any means and in any form, in whole or in part, includi"
        + "ng of any Derivative Database or as a part of Collective Databases.\n"
        + "\n"
        + "3.2 Compulsory license schemes. For the avoidance of doubt:\n"
        + "\n"
        + "     a. Non-waivable compulsory license schemes. In those jurisdictions in which"
        + " the right to collect royalties through any statutory or compulsory licensing sc"
        + "heme cannot be waived, the Licensor reserves the exclusive right to collect such"
        + " royalties for any exercise by You of the rights granted under this License;\n"
        + "\n"
        + "     b. Waivable compulsory license schemes. In those jurisdictions in which the"
        + " right to collect royalties through any statutory or compulsory licensing scheme"
        + " can be waived, the Licensor waives the exclusive right to collect such royaltie"
        + "s for any exercise by You of the rights granted under this License; and,\n"
        + "\n"
        + "     c. Voluntary license schemes. The Licensor waives the right to collect roya"
        + "lties, whether individually or, in the event that the Licensor is a member of a "
        + "collecting society that administers voluntary licensing schemes, via that societ"
        + "y, from any exercise by You of the rights granted under this License.\n"
        + "\n"
        + "3.3 The right to release the Database under different terms, or to stop distribu"
        + "ting or making available the Database, is reserved. Note that this Database may "
        + "be multiple-licensed, and so You may have the choice of using alternative licens"
        + "es for this Database. Subject to Section 10.4, all other rights not expressly gr"
        + "anted by Licensor are reserved.\n"
        + "\n"
        + "4.0 Conditions of Use\n"
        + "\n"
        + "4.1 The rights granted in Section 3 above are expressly made subject to Your com"
        + "plying with the following conditions of use. These are important conditions of t"
        + "his License, and if You fail to follow them, You will be in material breach of i"
        + "ts terms.\n"
        + "\n"
        + "4.2 Notices. If You Publicly Convey this Database, any Derivative Database, or t"
        + "he Database as part of a Collective Database, then You must: \n"
        + "\n"
        + "     a. Do so only under the terms of this License or another license permitted "
        + "under Section 4.4;\n"
        + "\n"
        + "     b. Include a copy of this License (or, as applicable, a license permitted u"
        + "nder Section 4.4) or its Uniform Resource Identifier (URI) with the Database or "
        + "Derivative Database, including both in the Database or Derivative Database and i"
        + "n any relevant documentation; and\n"
        + "\n"
        + "     c. Keep intact any copyright or Database Right notices and notices that ref"
        + "er to this License.\n"
        + "\n"
        + "     d. If it is not possible to put the required notices in a particular file d"
        + "ue to its structure, then You must include the notices in a location (such as a "
        + "relevant directory) where users would be likely to look for it.\n"
        + "\n"
        + "4.3 Notice for using output (Contents). Creating and Using a Produced Work does "
        + "not require the notice in Section 4.2. However, if you Publicly Use a Produced W"
        + "ork, You must include a notice associated with the Produced Work reasonably calc"
        + "ulated to make any Person that uses, views, accesses, interacts with, or is othe"
        + "rwise exposed to the Produced Work aware that Content was obtained from the Data"
        + "base, Derivative Database, or the Database as part of a Collective Database, and"
        + " that it is available under this License.\n"
        + "\n"
        + "     a. Example notice. The following text will satisfy notice under Section 4.3"
        + ":\n"
        + "\n"
        + "          Contains information from DATABASE NAME, which is made available here "
        + "under the Open Database License (ODbL).\n"
        + "\n"
        + "DATABASE NAME should be replaced with the name of the Database and a hyperlink t"
        + "o the URI of the Database. \"Open Database License\" should contain a hyperlink to"
        + " the URI of the text of this License. If hyperlinks are not possible, You should"
        + " include the plain text of the required URI's with the above notice. 4.4 Share a"
        + "like. \n"
        + "\n"
        + "     a. Any Derivative Database that You Publicly Use must be only under the ter"
        + "ms of: \n"
        + "\n"
        + "          i. This License;\n"
        + "\n"
        + "          ii. A later version of this License similar in spirit to this License;"
        + " or\n"
        + "\n"
        + "          iii. A compatible license. \n"
        + "\n"
        + "     If You license the Derivative Database under one of the licenses mentioned "
        + "in (iii), You must comply with the terms of that license. \n"
        + "\n"
        + "     b. For the avoidance of doubt, Extraction or Re-utilisation of the whole or"
        + " a Substantial part of the Contents into a new database is a Derivative Database"
        + " and must comply with Section 4.4. \n"
        + "\n"
        + "     c. Derivative Databases and Produced Works. A Derivative Database is Public"
        + "ly Used and so must comply with Section 4.4. if a Produced Work created from the"
        + " Derivative Database is Publicly Used.\n"
        + "\n"
        + "     d. Share Alike and additional Contents. For the avoidance of doubt, You mus"
        + "t not add Contents to Derivative Databases under Section 4.4 a that are incompat"
        + "ible with the rights granted under this License. \n"
        + "\n"
        + "     e. Compatible licenses. Licensors may authorise a proxy to determine compat"
        + "ible licenses under Section 4.4 a iii. If they do so, the authorised proxy's pub"
        + "lic statement of acceptance of a compatible license grants You permission to use"
        + " the compatible license. \n"
        + "\n"
        + "4.5 Limits of Share Alike. The requirements of Section 4.4 do not apply in the f"
        + "ollowing:\n"
        + "\n"
        + "     a. For the avoidance of doubt, You are not required to license Collective D"
        + "atabases under this License if You incorporate this Database or a Derivative Dat"
        + "abase in the collection, but this License still applies to this Database or a De"
        + "rivative Database as a part of the Collective Database; \n"
        + "\n"
        + "     b. Using this Database, a Derivative Database, or this Database as part of "
        + "a Collective Database to create a Produced Work does not create a Derivative Dat"
        + "abase for purposes of Section 4.4; and\n"
        + "\n"
        + "     c. Use of a Derivative Database internally within an organisation is not to"
        + " the public and therefore does not fall under the requirements of Section 4.4.\n"
        + "\n"
        + "4.6 Access to Derivative Databases. If You Publicly Use a Derivative Database or"
        + " a Produced Work from a Derivative Database, You must also offer to recipients o"
        + "f the Derivative Database or Produced Work a copy in a machine readable form of:\n"
        + "\n"
        + "     a. The entire Derivative Database; or\n"
        + "\n"
        + "     b. A file containing all of the alterations made to the Database or the met"
        + "hod of making the alterations to the Database (such as an algorithm), including "
        + "any additional Contents, that make up all the differences between the Database a"
        + "nd the Derivative Database.\n"
        + "\n"
        + "The Derivative Database (under a.) or alteration file (under b.) must be availab"
        + "le at no more than a reasonable production cost for physical distributions and f"
        + "ree of charge if distributed over the internet.\n"
        + "\n"
        + "4.7 Technological measures and additional terms\n"
        + "\n"
        + "     a. This License does not allow You to impose (except subject to Section 4.7"
        + " b.) any terms or any technological measures on the Database, a Derivative Datab"
        + "ase, or the whole or a Substantial part of the Contents that alter or restrict t"
        + "he terms of this License, or any rights granted under it, or have the effect or "
        + "intent of restricting the ability of any person to exercise those rights.\n"
        + "\n"
        + "     b. Parallel distribution. You may impose terms or technological measures on"
        + " the Database, a Derivative Database, or the whole or a Substantial part of the "
        + "Contents (a \"Restricted Database\") in contravention of Section 4.74 a. only if Y"
        + "ou also make a copy of the Database or a Derivative Database available to the re"
        + "cipient of the Restricted Database:\n"
        + "\n"
        + "          i. That is available without additional fee;\n"
        + "\n"
        + "          ii. That is available in a medium that does not alter or restrict the "
        + "terms of this License, or any rights granted under it, or have the effect or int"
        + "ent of restricting the ability of any person to exercise those rights (an \"Unres"
        + "tricted Database\"); and\n"
        + "\n"
        + "          iii. The Unrestricted Database is at least as accessible to the recipi"
        + "ent as a practical matter as the Restricted Database.\n"
        + "\n"
        + "     c. For the avoidance of doubt, You may place this Database or a Derivative "
        + "Database in an authenticated environment, behind a password, or within a similar"
        + " access control scheme provided that You do not alter or restrict the terms of t"
        + "his License or any rights granted under it or have the effect or intent of restr"
        + "icting the ability of any person to exercise those rights. \n"
        + "\n"
        + "4.8 Licensing of others. You may not sublicense the Database. Each time You comm"
        + "unicate the Database, the whole or Substantial part of the Contents, or any Deri"
        + "vative Database to anyone else in any way, the Licensor offers to the recipient "
        + "a license to the Database on the same terms and conditions as this License. You "
        + "are not responsible for enforcing compliance by third parties with this License,"
        + " but You may enforce any rights that You have over a Derivative Database. You ar"
        + "e solely responsible for any modifications of a Derivative Database made by You "
        + "or another Person at Your direction. You may not impose any further restrictions"
        + " on the exercise of the rights granted or affirmed under this License.\n"
        + "\n"
        + "5.0 Moral rights\n"
        + "\n"
        + "5.1 Moral rights. This section covers moral rights, including any rights to be i"
        + "dentified as the author of the Database or to object to treatment that would oth"
        + "erwise prejudice the author's honour and reputation, or any other derogatory tre"
        + "atment:\n"
        + "\n"
        + "     a. For jurisdictions allowing waiver of moral rights, Licensor waives all m"
        + "oral rights that Licensor may have in the Database to the fullest extent possibl"
        + "e by the law of the relevant jurisdiction under Section 10.4; \n"
        + "\n"
        + "     b. If waiver of moral rights under Section 5.1 a in the relevant jurisdicti"
        + "on is not possible, Licensor agrees not to assert any moral rights over the Data"
        + "base and waives all claims in moral rights to the fullest extent possible by the"
        + " law of the relevant jurisdiction under Section 10.4; and\n"
        + "\n"
        + "     c. For jurisdictions not allowing waiver or an agreement not to assert mora"
        + "l rights under Section 5.1 a and b, the author may retain their moral rights ove"
        + "r certain aspects of the Database.\n"
        + "\n"
        + "Please note that some jurisdictions do not allow for the waiver of moral rights,"
        + " and so moral rights may still subsist over the Database in some jurisdictions.\n"
        + "\n"
        + "6.0 Fair dealing, Database exceptions, and other rights not affected \n"
        + "\n"
        + "6.1 This License does not affect any rights that You or anyone else may independ"
        + "ently have under any applicable law to make any use of this Database, including "
        + "without limitation:\n"
        + "\n"
        + "     a. Exceptions to the Database Right including: Extraction of Contents from "
        + "non-electronic Databases for private purposes, Extraction for purposes of illust"
        + "ration for teaching or scientific research, and Extraction or Re-utilisation for"
        + " public security or an administrative or judicial procedure. \n"
        + "\n"
        + "     b. Fair dealing, fair use, or any other legally recognised limitation or ex"
        + "ception to infringement of copyright or other applicable laws. \n"
        + "\n"
        + "6.2 This License does not affect any rights of lawful users to Extract and Re-ut"
        + "ilise insubstantial parts of the Contents, evaluated quantitatively or qualitati"
        + "vely, for any purposes whatsoever, including creating a Derivative Database (sub"
        + "ject to other rights over the Contents, see Section 2.4). The repeated and syste"
        + "matic Extraction or Re-utilisation of insubstantial parts of the Contents may ho"
        + "wever amount to the Extraction or Re-utilisation of a Substantial part of the Co"
        + "ntents.\n"
        + "\n"
        + "7.0 Warranties and Disclaimer\n"
        + "\n"
        + "7.1 The Database is licensed by the Licensor \"as is\" and without any warranty of"
        + " any kind, either express, implied, or arising by statute, custom, course of dea"
        + "ling, or trade usage. Licensor specifically disclaims any and all implied warran"
        + "ties or conditions of title, non-infringement, accuracy or completeness, the pre"
        + "sence or absence of errors, fitness for a particular purpose, merchantability, o"
        + "r otherwise. Some jurisdictions do not allow the exclusion of implied warranties"
        + ", so this exclusion may not apply to You.\n"
        + "\n"
        + "8.0 Limitation of liability\n"
        + "\n"
        + "8.1 Subject to any liability that may not be excluded or limited by law, the Lic"
        + "ensor is not liable for, and expressly excludes, all liability for loss or damag"
        + "e however and whenever caused to anyone by any use under this License, whether b"
        + "y You or by anyone else, and whether caused by any fault on the part of the Lice"
        + "nsor or not. This exclusion of liability includes, but is not limited to, any sp"
        + "ecial, incidental, consequential, punitive, or exemplary damages such as loss of"
        + " revenue, data, anticipated profits, and lost business. This exclusion applies e"
        + "ven if the Licensor has been advised of the possibility of such damages.\n"
        + "\n"
        + "8.2 If liability may not be excluded by law, it is limited to actual and direct "
        + "financial loss to the extent it is caused by proved negligence on the part of th"
        + "e Licensor.\n"
        + "\n"
        + "9.0 Termination of Your rights under this License\n"
        + "\n"
        + "9.1 Any breach by You of the terms and conditions of this License automatically "
        + "terminates this License with immediate effect and without notice to You. For the"
        + " avoidance of doubt, Persons who have received the Database, the whole or a Subs"
        + "tantial part of the Contents, Derivative Databases, or the Database as part of a"
        + " Collective Database from You under this License will not have their licenses te"
        + "rminated provided their use is in full compliance with this License or a license"
        + " granted under Section 4.8 of this License. Sections 1, 2, 7, 8, 9 and 10 will s"
        + "urvive any termination of this License.\n"
        + "\n"
        + "9.2 If You are not in breach of the terms of this License, the Licensor will not"
        + " terminate Your rights under it. \n"
        + "\n"
        + "9.3 Unless terminated under Section 9.1, this License is granted to You for the "
        + "duration of applicable rights in the Database. \n"
        + "\n"
        + "9.4 Reinstatement of rights. If you cease any breach of the terms and conditions"
        + " of this License, then your full rights under this License will be reinstated:\n"
        + "\n"
        + "     a. Provisionally and subject to permanent termination until the 60th day af"
        + "ter cessation of breach; \n"
        + "\n"
        + "     b. Permanently on the 60th day after cessation of breach unless otherwise r"
        + "easonably notified by the Licensor; or\n"
        + "\n"
        + "     c. Permanently if reasonably notified by the Licensor of the violation, thi"
        + "s is the first time You have received notice of violation of this License from t"
        + "he Licensor, and You cure the violation prior to 30 days after your receipt of t"
        + "he notice.\n"
        + "\n"
        + "Persons subject to permanent termination of rights are not eligible to be a reci"
        + "pient and receive a license under Section 4.8.\n"
        + "\n"
        + "9.5 Notwithstanding the above, Licensor reserves the right to release the Databa"
        + "se under different license terms or to stop distributing or making available the"
        + " Database. Releasing the Database under different license terms or stopping the "
        + "distribution of the Database will not withdraw this License (or any other licens"
        + "e that has been, or is required to be, granted under the terms of this License),"
        + " and this License will continue in full force and effect unless terminated as st"
        + "ated above.\n"
        + "\n"
        + "10.0 General\n"
        + "\n"
        + "10.1 If any provision of this License is held to be invalid or unenforceable, th"
        + "at must not affect the validity or enforceability of the remainder of the terms "
        + "and conditions of this License and each remaining provision of this License shal"
        + "l be valid and enforced to the fullest extent permitted by law. \n"
        + "\n"
        + "10.2 This License is the entire agreement between the parties with respect to th"
        + "e rights granted here over the Database. It replaces any earlier understandings,"
        + " agreements or representations with respect to the Database. \n"
        + "\n"
        + "10.3 If You are in breach of the terms of this License, You will not be entitled"
        + " to rely on the terms of this License or to complain of any breach by the Licens"
        + "or. \n"
        + "\n"
        + "10.4 Choice of law. This License takes effect in and will be governed by the law"
        + "s of the relevant jurisdiction in which the License terms are sought to be enfor"
        + "ced. If the standard suite of rights granted under applicable copyright law and "
        + "Database Rights in the relevant jurisdiction includes additional rights not gran"
        + "ted under this License, these additional rights are granted in this License in o"
        + "rder to meet the terms of this License.\n"
; // the license text
    }
 
    
}
