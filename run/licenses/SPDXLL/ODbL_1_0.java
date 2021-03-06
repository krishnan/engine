package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:29:23Z
 * LicenseName: AGPL-3.0+
 * FileName: ODbL_1_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
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
        return "## ODC Open Database License (ODbL)\n"
        + "\n"
        + "### Preamble\n"
        + "\n"
        + "The Open Database License (ODbL) is a license agreement intended to\n"
        + "allow users to freely share, modify, and use this Database while\n"
        + "maintaining this same freedom for others. Many databases are covered by\n"
        + "copyright, and therefore this document licenses these rights. Some\n"
        + "jurisdictions, mainly in the European Union, have specific rights that\n"
        + "cover databases, and so the ODbL addresses these rights, too. Finally,\n"
        + "the ODbL is also an agreement in contract for users of this Database to\n"
        + "act in certain ways in return for accessing this Database.\n"
        + "\n"
        + "Databases can contain a wide variety of types of content (images,\n"
        + "audiovisual material, and sounds all in the same database, for example),\n"
        + "and so the ODbL only governs the rights over the Database, and not the\n"
        + "contents of the Database individually. Licensors should use the ODbL\n"
        + "together with another license for the contents, if the contents have a\n"
        + "single set of rights that uniformly covers all of the contents. If the\n"
        + "contents have multiple sets of different rights, Licensors should\n"
        + "describe what rights govern what contents together in the individual\n"
        + "record or in some other way that clarifies what rights apply. \n"
        + "\n"
        + "Sometimes the contents of a database, or the database itself, can be\n"
        + "covered by other rights not addressed here (such as private contracts,\n"
        + "trade mark over the name, or privacy rights / data protection rights\n"
        + "over information in the contents), and so you are advised that you may\n"
        + "have to consult other documents or clear other rights before doing\n"
        + "activities not covered by this License.\n"
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
        + "### 1.0 Definitions of Capitalised Words\n"
        + "\n"
        + "\"Collective Database\" – Means this Database in unmodified form as part\n"
        + "of a collection of independent databases in themselves that together are\n"
        + "assembled into a collective whole. A work that constitutes a Collective\n"
        + "Database will not be considered a Derivative Database.\n"
        + "\n"
        + "\"Convey\" – As a verb, means Using the Database, a Derivative Database,\n"
        + "or the Database as part of a Collective Database in any way that enables\n"
        + "a Person to make or receive copies of the Database or a Derivative\n"
        + "Database.  Conveying does not include interaction with a user through a\n"
        + "computer network, or creating and Using a Produced Work, where no\n"
        + "transfer of a copy of the Database or a Derivative Database occurs.\n"
        + "\"Contents\" – The contents of this Database, which includes the\n"
        + "information, independent works, or other material collected into the\n"
        + "Database. For example, the contents of the Database could be factual\n"
        + "data or works such as images, audiovisual material, text, or sounds.\n"
        + "\n"
        + "\"Database\" – A collection of material (the Contents) arranged in a\n"
        + "systematic or methodical way and individually accessible by electronic\n"
        + "or other means offered under the terms of this License.\n"
        + "\n"
        + "\"Database Directive\" – Means Directive 96/9/EC of the European\n"
        + "Parliament and of the Council of 11 March 1996 on the legal protection\n"
        + "of databases, as amended or succeeded.\n"
        + "\n"
        + "\"Database Right\" – Means rights resulting from the Chapter III (\"sui\n"
        + "generis\") rights in the Database Directive (as amended and as transposed\n"
        + "by member states), which includes the Extraction and Re-utilisation of\n"
        + "the whole or a Substantial part of the Contents, as well as any similar\n"
        + "rights available in the relevant jurisdiction under Section 10.4. \n"
        + "\n"
        + "\"Derivative Database\" – Means a database based upon the Database, and\n"
        + "includes any translation, adaptation, arrangement, modification, or any\n"
        + "other alteration of the Database or of a Substantial part of the\n"
        + "Contents. This includes, but is not limited to, Extracting or\n"
        + "Re-utilising the whole or a Substantial part of the Contents in a new\n"
        + "Database.\n"
        + "\n"
        + "\"Extraction\" – Means the permanent or temporary transfer of all or a\n"
        + "Substantial part of the Contents to another medium by any means or in\n"
        + "any form.\n"
        + "\n"
        + "\"License\" – Means this license agreement and is both a license of rights\n"
        + "such as copyright and Database Rights and an agreement in contract.\n"
        + "\n"
        + "\"Licensor\" – Means the Person that offers the Database under the terms\n"
        + "of this License. \n"
        + "\n"
        + "\"Person\" – Means a natural or legal person or a body of persons\n"
        + "corporate or incorporate.\n"
        + "\n"
        + "\"Produced Work\" –  a work (such as an image, audiovisual material, text,\n"
        + "or sounds) resulting from using the whole or a Substantial part of the\n"
        + "Contents (via a search or other query) from this Database, a Derivative\n"
        + "Database, or this Database as part of a Collective Database.  \n"
        + "\n"
        + "\"Publicly\" – means to Persons other than You or under Your control by\n"
        + "either more than 50% ownership or by the power to direct their\n"
        + "activities (such as contracting with an independent consultant). \n"
        + "\n"
        + "\"Re-utilisation\" – means any form of making available to the public all\n"
        + "or a Substantial part of the Contents by the distribution of copies, by\n"
        + "renting, by online or other forms of transmission.\n"
        + "\n"
        + "\"Substantial\" – Means substantial in terms of quantity or quality or a\n"
        + "combination of both. The repeated and systematic Extraction or\n"
        + "Re-utilisation of insubstantial parts of the Contents may amount to the\n"
        + "Extraction or Re-utilisation of a Substantial part of the Contents.\n"
        + "\n"
        + "\"Use\" – As a verb, means doing any act that is restricted by copyright\n"
        + "or Database Rights whether in the original medium or any other; and\n"
        + "includes without limitation distributing, copying, publicly performing,\n"
        + "publicly displaying, and preparing derivative works of the Database, as\n"
        + "well as modifying the Database as may be technically necessary to use it\n"
        + "in a different mode or format. \n"
        + "\n"
        + "\"You\" – Means a Person exercising rights under this License who has not\n"
        + "previously violated the terms of this License with respect to the\n"
        + "Database, or who has received express permission from the Licensor to\n"
        + "exercise rights under this License despite a previous violation.\n"
        + "\n"
        + "Words in the singular include the plural and vice versa.\n"
        + "\n"
        + "### 2.0 What this License covers\n"
        + "\n"
        + "2.1. Legal effect of this document. This License is:\n"
        + "\n"
        + "  a. A license of applicable copyright and neighbouring rights;\n"
        + "\n"
        + "  b. A license of the Database Right; and\n"
        + "\n"
        + "  c. An agreement in contract between You and the Licensor.\n"
        + "\n"
        + "2.2 Legal rights covered. This License covers the legal rights in the\n"
        + "Database, including:\n"
        + "\n"
        + "  a. Copyright. Any copyright or neighbouring rights in the Database.\n"
        + "  The copyright licensed includes any individual elements of the\n"
        + "  Database, but does not cover the copyright over the Contents\n"
        + "  independent of this Database. See Section 2.4 for details. Copyright\n"
        + "  law varies between jurisdictions, but is likely to cover: the Database\n"
        + "  model or schema, which is the structure, arrangement, and organisation\n"
        + "  of the Database, and can also include the Database tables and table\n"
        + "  indexes; the data entry and output sheets; and the Field names of\n"
        + "  Contents stored in the Database;\n"
        + "\n"
        + "  b. Database Rights. Database Rights only extend to the Extraction and\n"
        + "  Re-utilisation of the whole or a Substantial part of the Contents.\n"
        + "  Database Rights can apply even when there is no copyright over the\n"
        + "  Database. Database Rights can also apply when the Contents are removed\n"
        + "  from the Database and are selected and arranged in a way that would\n"
        + "  not infringe any applicable copyright; and\n"
        + "\n"
        + "  c. Contract. This is an agreement between You and the Licensor for\n"
        + "  access to the Database. In return you agree to certain conditions of\n"
        + "  use on this access as outlined in this License. \n"
        + "\n"
        + "2.3 Rights not covered. \n"
        + "\n"
        + "  a. This License does not apply to computer programs used in the making\n"
        + "  or operation of the Database; \n"
        + "\n"
        + "  b. This License does not cover any patents over the Contents or the\n"
        + "  Database; and\n"
        + "\n"
        + "  c. This License does not cover any trademarks associated with the\n"
        + "  Database. \n"
        + "\n"
        + "2.4 Relationship to Contents in the Database. The individual items of\n"
        + "the Contents contained in this Database may be covered by other rights,\n"
        + "including copyright, patent, data protection, privacy, or personality\n"
        + "rights, and this License does not cover any rights (other than Database\n"
        + "Rights or in contract) in individual Contents contained in the Database.\n"
        + "For example, if used on a Database of images (the Contents), this\n"
        + "License would not apply to copyright over individual images, which could\n"
        + "have their own separate licenses, or one single license covering all of\n"
        + "the rights over the images.  \n"
        + "\n"
        + "### 3.0 Rights granted\n"
        + "\n"
        + "3.1 Subject to the terms and conditions of this License, the Licensor\n"
        + "grants to You a worldwide, royalty-free, non-exclusive, terminable (but\n"
        + "only under Section 9) license to Use the Database for the duration of\n"
        + "any applicable copyright and Database Rights. These rights explicitly\n"
        + "include commercial use, and do not exclude any field of endeavour. To\n"
        + "the extent possible in the relevant jurisdiction, these rights may be\n"
        + "exercised in all media and formats whether now known or created in the\n"
        + "future. \n"
        + "\n"
        + "The rights granted cover, for example:\n"
        + "\n"
        + "  a. Extraction and Re-utilisation of the whole or a Substantial part of\n"
        + "  the Contents;\n"
        + "\n"
        + "  b. Creation of Derivative Databases;\n"
        + "\n"
        + "  c. Creation of Collective Databases;\n"
        + "\n"
        + "  d. Creation of temporary or permanent reproductions by any means and\n"
        + "  in any form, in whole or in part, including of any Derivative\n"
        + "  Databases or as a part of Collective Databases; and\n"
        + "\n"
        + "  e. Distribution, communication, display, lending, making available, or\n"
        + "  performance to the public by any means and in any form, in whole or in\n"
        + "  part, including of any Derivative Database or as a part of Collective\n"
        + "  Databases.\n"
        + "\n"
        + "3.2 Compulsory license schemes. For the avoidance of doubt:\n"
        + "\n"
        + "  a. Non-waivable compulsory license schemes. In those jurisdictions in\n"
        + "  which the right to collect royalties through any statutory or\n"
        + "  compulsory licensing scheme cannot be waived, the Licensor reserves\n"
        + "  the exclusive right to collect such royalties for any exercise by You\n"
        + "  of the rights granted under this License;\n"
        + "\n"
        + "  b. Waivable compulsory license schemes. In those jurisdictions in\n"
        + "  which the right to collect royalties through any statutory or\n"
        + "  compulsory licensing scheme can be waived, the Licensor waives the\n"
        + "  exclusive right to collect such royalties for any exercise by You of\n"
        + "  the rights granted under this License; and,\n"
        + "\n"
        + "  c. Voluntary license schemes. The Licensor waives the right to collect\n"
        + "  royalties, whether individually or, in the event that the Licensor is\n"
        + "  a member of a collecting society that administers voluntary licensing\n"
        + "  schemes, via that society, from any exercise by You of the rights\n"
        + "  granted under this License.\n"
        + "\n"
        + "3.3 The right to release the Database under different terms, or to stop\n"
        + "distributing or making available the Database, is reserved. Note that\n"
        + "this Database may be multiple-licensed, and so You may have the choice\n"
        + "of using alternative licenses for this Database. Subject to Section\n"
        + "10.4, all other rights not expressly granted by Licensor are reserved.\n"
        + "\n"
        + "### 4.0 Conditions of Use\n"
        + "\n"
        + "4.1 The rights granted in Section 3 above are expressly made subject to\n"
        + "Your complying with the following conditions of use. These are important\n"
        + "conditions of this License, and if You fail to follow them, You will be\n"
        + "in material breach of its terms.\n"
        + "\n"
        + "4.2 Notices. If You Publicly Convey this Database, any Derivative\n"
        + "Database, or the Database as part of a Collective Database, then You\n"
        + "must: \n"
        + "\n"
        + "  a. Do so only under the terms of this License or another license\n"
        + "  permitted under Section 4.4;\n"
        + "\n"
        + "  b. Include a copy of this License (or, as applicable, a license\n"
        + "  permitted under Section 4.4) or its Uniform Resource Identifier (URI)\n"
        + "  with the Database or Derivative Database, including both in the\n"
        + "  Database or Derivative Database and in any relevant documentation; and\n"
        + "\n"
        + "  c. Keep intact any copyright or Database Right notices and notices\n"
        + "  that refer to this License.\n"
        + "\n"
        + "  d. If it is not possible to put the required notices in a particular\n"
        + "  file due to its structure, then You must include the notices in a\n"
        + "  location (such as a relevant directory) where users would be likely to\n"
        + "  look for it.\n"
        + "\n"
        + "4.3 Notice for using output (Contents). Creating and Using a Produced\n"
        + "Work does not require the notice in Section 4.2. However, if you\n"
        + "Publicly Use a Produced Work, You must include a notice associated with\n"
        + "the Produced Work reasonably calculated to make any Person that uses,\n"
        + "views, accesses, interacts with, or is otherwise exposed to the Produced\n"
        + "Work aware that Content was obtained from the Database, Derivative\n"
        + "Database, or the Database as part of a Collective Database, and that it\n"
        + "is available under this License.\n"
        + "\n"
        + "  a. Example notice. The following text will satisfy notice under\n"
        + "  Section 4.3:\n"
        + "\n"
        + "        Contains information from DATABASE NAME, which is made available\n"
        + "        here under the Open Database License (ODbL).\n"
        + "\n"
        + "DATABASE NAME should be replaced with the name of the Database and a\n"
        + "hyperlink to the URI of the Database. \"Open Database License\" should\n"
        + "contain a hyperlink to the URI of the text of this License. If\n"
        + "hyperlinks are not possible, You should include the plain text of the\n"
        + "required URI's with the above notice.\n"
        + " \n"
        + "4.4 Share alike. \n"
        + "\n"
        + "  a. Any Derivative Database that You Publicly Use must be only under\n"
        + "  the terms of: \n"
        + "\n"
        + "    i. This License;\n"
        + "\n"
        + "    ii. A later version of this License similar in spirit to this\n"
        + "      License; or\n"
        + "\n"
        + "    iii. A compatible license. \n"
        + "\n"
        + "  If You license the Derivative Database under one of the licenses\n"
        + "  mentioned in (iii), You must comply with the terms of that license. \n"
        + "\n"
        + "  b. For the avoidance of doubt, Extraction or Re-utilisation of the\n"
        + "  whole or a Substantial part of the Contents into a new database is a\n"
        + "  Derivative Database and must comply with Section 4.4. \n"
        + "\n"
        + "  c. Derivative Databases and Produced Works.  A Derivative Database is\n"
        + "  Publicly Used and so must comply with Section 4.4. if a Produced Work\n"
        + "  created from the Derivative Database is Publicly Used.\n"
        + "\n"
        + "  d. Share Alike and additional Contents. For the avoidance of doubt,\n"
        + "  You must not add Contents to Derivative Databases under Section 4.4 a\n"
        + "  that are incompatible with the rights granted under this License. \n"
        + "\n"
        + "  e. Compatible licenses. Licensors may authorise a proxy to determine\n"
        + "  compatible licenses under Section 4.4 a iii. If they do so, the\n"
        + "  authorised proxy's public statement of acceptance of a compatible\n"
        + "  license grants You permission to use the compatible license.\n"
        + "\n"
        + "\n"
        + "4.5 Limits of Share Alike.  The requirements of Section 4.4 do not apply\n"
        + "in the following:\n"
        + "\n"
        + "  a. For the avoidance of doubt, You are not required to license\n"
        + "  Collective Databases under this License if You incorporate this\n"
        + "  Database or a Derivative Database in the collection, but this License\n"
        + "  still applies to this Database or a Derivative Database as a part of\n"
        + "  the Collective Database; \n"
        + "\n"
        + "  b. Using this Database, a Derivative Database, or this Database as\n"
        + "  part of a Collective Database to create a Produced Work does not\n"
        + "  create a Derivative Database for purposes of  Section 4.4; and\n"
        + "\n"
        + "  c. Use of a Derivative Database internally within an organisation is\n"
        + "  not to the public and therefore does not fall under the requirements\n"
        + "  of Section 4.4.\n"
        + "\n"
        + "4.6 Access to Derivative Databases. If You Publicly Use a Derivative\n"
        + "Database or a Produced Work from a Derivative Database, You must also\n"
        + "offer to recipients of the Derivative Database or Produced Work a copy\n"
        + "in a machine readable form of:\n"
        + "\n"
        + "  a. The entire Derivative Database; or\n"
        + "\n"
        + "  b. A file containing all of the alterations made to the Database or\n"
        + "  the method of making the alterations to the Database (such as an\n"
        + "  algorithm), including any additional Contents, that make up all the\n"
        + "  differences between the Database and the Derivative Database.\n"
        + "\n"
        + "The Derivative Database (under a.) or alteration file (under b.) must be\n"
        + "available at no more than a reasonable production cost for physical\n"
        + "distributions and free of charge if distributed over the internet.\n"
        + "\n"
        + "4.7 Technological measures and additional terms\n"
        + "\n"
        + "  a. This License does not allow You to impose (except subject to\n"
        + "  Section 4.7 b.)  any terms or any technological measures on the\n"
        + "  Database, a Derivative Database, or the whole or a Substantial part of\n"
        + "  the Contents that alter or restrict the terms of this License, or any\n"
        + "  rights granted under it, or have the effect or intent of restricting\n"
        + "  the ability of any person to exercise those rights.\n"
        + "\n"
        + "  b. Parallel distribution. You may impose terms or technological\n"
        + "  measures on the Database, a Derivative Database, or the whole or a\n"
        + "  Substantial part of the Contents (a \"Restricted Database\") in\n"
        + "  contravention of Section 4.74 a. only if You also make a copy of the\n"
        + "  Database or a Derivative Database available to the recipient of the\n"
        + "  Restricted Database:\n"
        + "\n"
        + "    i. That is available without additional fee;\n"
        + "\n"
        + "    ii. That is available in a medium that does not alter or restrict\n"
        + "    the terms of this License, or any rights granted under it, or have\n"
        + "    the effect or intent of restricting the ability of any person to\n"
        + "    exercise those rights (an \"Unrestricted Database\"); and\n"
        + "\n"
        + "    iii. The Unrestricted Database is at least as accessible to the\n"
        + "    recipient as a practical matter as the Restricted Database.\n"
        + "\n"
        + "  c. For the avoidance of doubt, You may place this Database or a\n"
        + "  Derivative Database in an authenticated environment, behind a\n"
        + "  password, or within a similar access control scheme provided that You\n"
        + "  do not alter or restrict the terms of this License or any rights\n"
        + "  granted under it or have the effect or intent of restricting the\n"
        + "  ability of any person to exercise those rights. \n"
        + "\n"
        + "4.8 Licensing of others. You may not sublicense the Database. Each time\n"
        + "You communicate the Database, the whole or Substantial part of the\n"
        + "Contents, or any Derivative Database to anyone else in any way, the\n"
        + "Licensor offers to the recipient a license to the Database on the same\n"
        + "terms and conditions as this License. You are not responsible for\n"
        + "enforcing compliance by third parties with this License, but You may\n"
        + "enforce any rights that You have over a Derivative Database. You are\n"
        + "solely responsible for any modifications of a Derivative Database made\n"
        + "by You or another Person at Your direction. You may not impose any\n"
        + "further restrictions on the exercise of the rights granted or affirmed\n"
        + "under this License.\n"
        + "\n"
        + "### 5.0 Moral rights\n"
        + "\n"
        + "5.1 Moral rights. This section covers moral rights, including any rights\n"
        + "to be identified as the author of the Database or to object to treatment\n"
        + "that would otherwise prejudice the author's honour and reputation, or\n"
        + "any other derogatory treatment:\n"
        + "\n"
        + "  a. For jurisdictions allowing waiver of moral rights, Licensor waives\n"
        + "  all moral rights that Licensor may have in the Database to the fullest\n"
        + "  extent possible by the law of the relevant jurisdiction under Section\n"
        + "  10.4; \n"
        + "\n"
        + "  b. If waiver of moral rights under Section 5.1 a in the relevant\n"
        + "  jurisdiction is not possible, Licensor agrees not to assert any moral\n"
        + "  rights over the Database and waives all claims in moral rights to the\n"
        + "  fullest extent possible by the law of the relevant jurisdiction under\n"
        + "  Section 10.4; and\n"
        + "\n"
        + "  c. For jurisdictions not allowing waiver or an agreement not to assert\n"
        + "  moral rights under Section 5.1 a and b, the author may retain their\n"
        + "  moral rights over certain aspects of the Database.\n"
        + "\n"
        + "Please note that some jurisdictions do not allow for the waiver of moral\n"
        + "rights, and so moral rights may still subsist over the Database in some\n"
        + "jurisdictions.\n"
        + "\n"
        + "### 6.0 Fair dealing, Database exceptions, and other rights not affected \n"
        + "\n"
        + "6.1 This License does not affect any rights that You or anyone else may\n"
        + "independently have under any applicable law to make any use of this\n"
        + "Database, including without limitation:\n"
        + "\n"
        + "  a. Exceptions to the Database Right including: Extraction of Contents\n"
        + "  from non-electronic Databases for private purposes, Extraction for\n"
        + "  purposes of illustration for teaching or scientific research, and\n"
        + "  Extraction or Re-utilisation for public security or an administrative\n"
        + "  or judicial procedure. \n"
        + "\n"
        + "  b. Fair dealing, fair use, or any other legally recognised limitation\n"
        + "  or exception to infringement of copyright or other applicable laws. \n"
        + "\n"
        + "6.2 This License does not affect any rights of lawful users to Extract\n"
        + "and Re-utilise insubstantial parts of the Contents, evaluated\n"
        + "quantitatively or qualitatively, for any purposes whatsoever, including\n"
        + "creating a Derivative Database (subject to other rights over the\n"
        + "Contents, see Section 2.4). The repeated and systematic Extraction or\n"
        + "Re-utilisation of insubstantial parts of the Contents may however amount\n"
        + "to the Extraction or Re-utilisation of a Substantial part of the\n"
        + "Contents.\n"
        + "\n"
        + "### 7.0 Warranties and Disclaimer\n"
        + "\n"
        + "7.1 The Database is licensed by the Licensor \"as is\" and without any\n"
        + "warranty of any kind, either express, implied, or arising by statute,\n"
        + "custom, course of dealing, or trade usage. Licensor specifically\n"
        + "disclaims any and all implied warranties or conditions of title,\n"
        + "non-infringement, accuracy or completeness, the presence or absence of\n"
        + "errors, fitness for a particular purpose, merchantability, or otherwise.\n"
        + "Some jurisdictions do not allow the exclusion of implied warranties, so\n"
        + "this exclusion may not apply to You.\n"
        + "\n"
        + "### 8.0 Limitation of liability\n"
        + "\n"
        + "8.1 Subject to any liability that may not be excluded or limited by law,\n"
        + "the Licensor is not liable for, and expressly excludes, all liability\n"
        + "for loss or damage however and whenever caused to anyone by any use\n"
        + "under this License, whether by You or by anyone else, and whether caused\n"
        + "by any fault on the part of the Licensor or not. This exclusion of\n"
        + "liability includes, but is not limited to, any special, incidental,\n"
        + "consequential, punitive, or exemplary damages such as loss of revenue,\n"
        + "data, anticipated profits, and lost business. This exclusion applies\n"
        + "even if the Licensor has been advised of the possibility of such\n"
        + "damages.\n"
        + "\n"
        + "8.2 If liability may not be excluded by law, it is limited to actual and\n"
        + "direct financial loss to the extent it is caused by proved negligence on\n"
        + "the part of the Licensor.\n"
        + "\n"
        + "### 9.0 Termination of Your rights under this License\n"
        + "\n"
        + "9.1 Any breach by You of the terms and conditions of this License\n"
        + "automatically terminates this License with immediate effect and without\n"
        + "notice to You. For the avoidance of doubt, Persons who have received the\n"
        + "Database, the whole or a Substantial part of the Contents, Derivative\n"
        + "Databases, or the Database as part of a Collective Database from You\n"
        + "under this License will not have their licenses terminated provided\n"
        + "their use is in full compliance with this License or a license granted\n"
        + "under Section 4.8 of this License.  Sections 1, 2, 7, 8, 9 and 10 will\n"
        + "survive any termination of this License.\n"
        + "\n"
        + "9.2 If You are not in breach of the terms of this License, the Licensor\n"
        + "will not terminate Your rights under it. \n"
        + "\n"
        + "9.3 Unless terminated under Section 9.1, this License is granted to You\n"
        + "for the duration of applicable rights in the Database. \n"
        + "\n"
        + "9.4 Reinstatement of rights. If you cease any breach of the terms and\n"
        + "conditions of this License, then your full rights under this License\n"
        + "will be reinstated:\n"
        + "\n"
        + "  a. Provisionally and subject to permanent termination until the 60th\n"
        + "  day after cessation of breach; \n"
        + "\n"
        + "  b. Permanently on the 60th day after cessation of breach unless\n"
        + "  otherwise reasonably notified by the Licensor; or\n"
        + "\n"
        + "  c.  Permanently if reasonably notified by the Licensor of the\n"
        + "  violation, this is the first time You have received notice of\n"
        + "  violation of this License from  the Licensor, and You cure the\n"
        + "  violation prior to 30 days after your receipt of the notice.\n"
        + "\n"
        + "Persons subject to permanent termination of rights are not eligible to\n"
        + "be a recipient and receive a license under Section 4.8.\n"
        + "\n"
        + "9.5 Notwithstanding the above, Licensor reserves the right to release\n"
        + "the Database under different license terms or to stop distributing or\n"
        + "making available the Database. Releasing the Database under different\n"
        + "license terms or stopping the distribution of the Database will not\n"
        + "withdraw this License (or any other license that has been, or is\n"
        + "required to be, granted under the terms of this License), and this\n"
        + "License will continue in full force and effect unless terminated as\n"
        + "stated above.\n"
        + "\n"
        + "### 10.0 General\n"
        + "\n"
        + "10.1 If any provision of this License is held to be invalid or\n"
        + "unenforceable, that must not affect the validity or enforceability of\n"
        + "the remainder of the terms and conditions of this License and each\n"
        + "remaining provision of this License shall be valid and enforced to the\n"
        + "fullest extent permitted by law. \n"
        + "\n"
        + "10.2 This License is the entire agreement between the parties with\n"
        + "respect to the rights granted here over the Database. It replaces any\n"
        + "earlier understandings, agreements or representations with respect to\n"
        + "the Database. \n"
        + "\n"
        + "10.3 If You are in breach of the terms of this License, You will not be\n"
        + "entitled to rely on the terms of this License or to complain of any\n"
        + "breach by the Licensor. \n"
        + "\n"
        + "10.4 Choice of law. This License takes effect in and will be governed by\n"
        + "the laws of the relevant jurisdiction in which the License terms are\n"
        + "sought to be enforced. If the standard suite of rights granted under\n"
        + "applicable copyright law and Database Rights in the relevant\n"
        + "jurisdiction includes additional rights not granted under this License,\n"
        + "these additional rights are granted in this License in order to meet the\n"
        + "terms of this License.\n"
; // the license text
    }
 
    
}
