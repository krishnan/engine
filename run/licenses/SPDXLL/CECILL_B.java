package SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2014-06-01T13:27:42Z
 * LicenseName: AGPL-3.0+
 * FileName: CECILL_B.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014, nuno </text>
 */


public class CECILL_B extends License{
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
        return "CECILL-B"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "CeCILL-B Free Software License Agreement"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "CONTRAT DE LICENCE DE LOGICIEL LIBRE CeCILL-B\n"
        + "\n"
        + "Avertissement\n"
        + "\n"
        + "Ce contrat est une licence de logiciel libre issue d'une concertation entre ses "
        + "auteurs afin que le respect de deux grands principes préside à sa rédaction:\n"
        + "\n"
        + "d'une part, le respect des principes de diffusion des logiciels libres: accès au"
        + " code source, droits étendus conférés aux utilisateurs,\n"
        + "d'autre part, la désignation d'un droit applicable, le droit français, auquel el"
        + "le est conforme, tant au regard du droit de la responsabilité civile que du droi"
        + "t de la propriété intellectuelle et de la protection qu'il offre aux auteurs et "
        + "titulaires des droits patrimoniaux sur un logiciel.\n"
        + "Les auteurs de la licence CeCILL-B1 sont:\n"
        + "\n"
        + "Commissariat à l'Energie Atomique - CEA, établissement public de recherche à car"
        + "actère scientifique, technique et industriel, dont le siège est situé 25 rue Leb"
        + "lanc, immeuble Le Ponant D, 75015 Paris.\n"
        + "\n"
        + "Centre National de la Recherche Scientifique - CNRS, établissement public à cara"
        + "ctère scientifique et technologique, dont le siège est situé 3 rue Michel-Ange, "
        + "75794 Paris cedex 16.\n"
        + "\n"
        + "Institut National de Recherche en Informatique et en Automatique - INRIA, établi"
        + "ssement public à caractère scientifique et technologique, dont le siège est situ"
        + "é Domaine de Voluceau, Rocquencourt, BP 105, 78153 Le Chesnay cedex.\n"
        + "\n"
        + "Préambule\n"
        + "\n"
        + "Ce contrat est une licence de logiciel libre dont l'objectif est de conférer aux"
        + " utilisateurs une très large liberté de modification et de redistribution du log"
        + "iciel régi par cette licence.\n"
        + "\n"
        + "L'exercice de cette liberté est assorti d'une obligation forte de citation à la "
        + "charge de ceux qui distribueraient un logiciel incorporant un logiciel régi par "
        + "la présente licence afin d'assurer que les contributions de tous soient correcte"
        + "ment identifiées et reconnues.\n"
        + "\n"
        + "L'accessibilité au code source et les droits de copie, de modification et de red"
        + "istribution qui découlent de ce contrat ont pour contrepartie de n'offrir aux ut"
        + "ilisateurs qu'une garantie limitée et de ne faire peser sur l'auteur du logiciel"
        + ", le titulaire des droits patrimoniaux et les concédants successifs qu'une respo"
        + "nsabilité restreinte.\n"
        + "\n"
        + "A cet égard l'attention de l'utilisateur est attirée sur les risques associés au"
        + " chargement, à l'utilisation, à la modification et/ou au développement et à la r"
        + "eproduction du logiciel par l'utilisateur étant donné sa spécificité de logiciel"
        + " libre, qui peut le rendre complexe à manipuler et qui le réserve donc à des dév"
        + "eloppeurs ou des professionnels avertis possédant des connaissances informatique"
        + "s approfondies. Les utilisateurs sont donc invités à charger et tester l'adéquat"
        + "ion du logiciel à leurs besoins dans des conditions permettant d'assurer la sécu"
        + "rité de leurs systèmes et/ou de leurs données et, plus généralement, à l'utilise"
        + "r et l'exploiter dans les mêmes conditions de sécurité. Ce contrat peut être rep"
        + "roduit et diffusé librement, sous réserve de le conserver en l'état, sans ajout "
        + "ni suppression de clauses.\n"
        + "\n"
        + "Ce contrat est susceptible de s'appliquer à tout logiciel dont le titulaire des "
        + "droits patrimoniaux décide de soumettre l'exploitation aux dispositions qu'il co"
        + "ntient.\n"
        + "\n"
        + "Article 1 - DEFINITIONS\n"
        + "\n"
        + "Dans ce contrat, les termes suivants, lorsqu'ils seront écrits avec une lettre c"
        + "apitale, auront la signification suivante:\n"
        + "\n"
        + "Contrat: désigne le présent contrat de licence, ses éventuelles versions postéri"
        + "eures et annexes.\n"
        + "\n"
        + "Logiciel: désigne le logiciel sous sa forme de Code Objet et/ou de Code Source e"
        + "t le cas échéant sa documentation, dans leur état au moment de l'acceptation du "
        + "Contrat par le Licencié.\n"
        + "\n"
        + "Logiciel Initial: désigne le Logiciel sous sa forme de Code Source et éventuelle"
        + "ment de Code Objet et le cas échéant sa documentation, dans leur état au moment "
        + "de leur première diffusion sous les termes du Contrat.\n"
        + "\n"
        + "Logiciel Modifié: désigne le Logiciel modifié par au moins une Contribution.\n"
        + "\n"
        + "Code Source: désigne l'ensemble des instructions et des lignes de programme du L"
        + "ogiciel et auquel l'accès est nécessaire en vue de modifier le Logiciel.\n"
        + "\n"
        + "Code Objet: désigne les fichiers binaires issus de la compilation du Code Source"
        + ".\n"
        + "\n"
        + "Titulaire: désigne le ou les détenteurs des droits patrimoniaux d'auteur sur le "
        + "Logiciel Initial.\n"
        + "\n"
        + "Licencié: désigne le ou les utilisateurs du Logiciel ayant accepté le Contrat.\n"
        + "\n"
        + "Contributeur: désigne le Licencié auteur d'au moins une Contribution.\n"
        + "\n"
        + "Concédant: désigne le Titulaire ou toute personne physique ou morale distribuant"
        + " le Logiciel sous le Contrat.\n"
        + "\n"
        + "Contribution: désigne l'ensemble des modifications, corrections, traductions, ad"
        + "aptations et/ou nouvelles fonctionnalités intégrées dans le Logiciel par tout Co"
        + "ntributeur, ainsi que tout Module Interne.\n"
        + "\n"
        + "Module: désigne un ensemble de fichiers sources y compris leur documentation qui"
        + " permet de réaliser des fonctionnalités ou services supplémentaires à ceux fourn"
        + "is par le Logiciel.\n"
        + "\n"
        + "Module Externe: désigne tout Module, non dérivé du Logiciel, tel que ce Module e"
        + "t le Logiciel s'exécutent dans des espaces d'adressage différents, l'un appelant"
        + " l'autre au moment de leur exécution.\n"
        + "\n"
        + "Module Interne: désigne tout Module lié au Logiciel de telle sorte qu'ils s'exéc"
        + "utent dans le même espace d'adressage.\n"
        + "\n"
        + "Parties: désigne collectivement le Licencié et le Concédant.\n"
        + "\n"
        + "Ces termes s'entendent au singulier comme au pluriel.\n"
        + "\n"
        + "Article 2 - OBJET\n"
        + "\n"
        + "Le Contrat a pour objet la concession par le Concédant au Licencié d'une licence"
        + " non exclusive, cessible et mondiale du Logiciel telle que définie ci-après à l'"
        + "article 5 pour toute la durée de protection des droits portant sur ce Logiciel.\n"
        + "\n"
        + "Article 3 - ACCEPTATION\n"
        + "\n"
        + "3.1 L'acceptation par le Licencié des termes du Contrat est réputée acquise du f"
        + "ait du premier des faits suivants:\n"
        + "\n"
        + "(i) le chargement du Logiciel par tout moyen notamment par téléchargement à part"
        + "ir d'un serveur distant ou par chargement à partir d'un support physique;\n"
        + "(ii) le premier exercice par le Licencié de l'un quelconque des droits concédés "
        + "par le Contrat.\n"
        + "3.2 Un exemplaire du Contrat, contenant notamment un avertissement relatif aux s"
        + "pécificités du Logiciel, à la restriction de garantie et à la limitation à un us"
        + "age par des utilisateurs expérimentés a été mis à disposition du Licencié préala"
        + "blement à son acceptation telle que définie à l'article 3.1 ci dessus et le Lice"
        + "ncié reconnaît en avoir pris connaissance.\n"
        + "\n"
        + "Article 4 - ENTREE EN VIGUEUR ET DUREE\n"
        + "\n"
        + "4.1 ENTREE EN VIGUEUR\n"
        + "\n"
        + "Le Contrat entre en vigueur à la date de son acceptation par le Licencié telle q"
        + "ue définie en 3.1.\n"
        + "\n"
        + "4.2 DUREE\n"
        + "\n"
        + "Le Contrat produira ses effets pendant toute la durée légale de protection des d"
        + "roits patrimoniaux portant sur le Logiciel.\n"
        + "\n"
        + "Article 5 - ETENDUE DES DROITS CONCEDES\n"
        + "\n"
        + "Le Concédant concède au Licencié, qui accepte, les droits suivants sur le Logici"
        + "el pour toutes destinations et pour la durée du Contrat dans les conditions ci-a"
        + "près détaillées.\n"
        + "\n"
        + "Par ailleurs, si le Concédant détient ou venait à détenir un ou plusieurs brevet"
        + "s d'invention protégeant tout ou partie des fonctionnalités du Logiciel ou de se"
        + "s composants, il s'engage à ne pas opposer les éventuels droits conférés par ces"
        + " brevets aux Licenciés successifs qui utiliseraient, exploiteraient ou modifiera"
        + "ient le Logiciel. En cas de cession de ces brevets, le Concédant s'engage à fair"
        + "e reprendre les obligations du présent alinéa aux cessionnaires.\n"
        + "\n"
        + "5.1 DROIT D'UTILISATION\n"
        + "\n"
        + "Le Licencié est autorisé à utiliser le Logiciel, sans restriction quant aux doma"
        + "ines d'application, étant ci-après précisé que cela comporte:\n"
        + "\n"
        + "la reproduction permanente ou provisoire du Logiciel en tout ou partie par tout "
        + "moyen et sous toute forme.\n"
        + "\n"
        + "le chargement, l'affichage, l'exécution, ou le stockage du Logiciel sur tout sup"
        + "port.\n"
        + "\n"
        + "la possibilité d'en observer, d'en étudier, ou d'en tester le fonctionnement afi"
        + "n de déterminer les idées et principes qui sont à la base de n'importe quel élém"
        + "ent de ce Logiciel; et ceci, lorsque le Licencié effectue toute opération de cha"
        + "rgement, d'affichage, d'exécution, de transmission ou de stockage du Logiciel qu"
        + "'il est en droit d'effectuer en vertu du Contrat.\n"
        + "\n"
        + "5.2 DROIT D'APPORTER DES CONTRIBUTIONS\n"
        + "\n"
        + "Le droit d'apporter des Contributions comporte le droit de traduire, d'adapter, "
        + "d'arranger ou d'apporter toute autre modification au Logiciel et le droit de rep"
        + "roduire le logiciel en résultant.\n"
        + "\n"
        + "Le Licencié est autorisé à apporter toute Contribution au Logiciel sous réserve "
        + "de mentionner, de façon explicite, son nom en tant qu'auteur de cette Contributi"
        + "on et la date de création de celle-ci.\n"
        + "\n"
        + "5.3 DROIT DE DISTRIBUTION\n"
        + "\n"
        + "Le droit de distribution comporte notamment le droit de diffuser, de transmettre"
        + " et de communiquer le Logiciel au public sur tout support et par tout moyen ains"
        + "i que le droit de mettre sur le marché à titre onéreux ou gratuit, un ou des exe"
        + "mplaires du Logiciel par tout procédé.\n"
        + "\n"
        + "Le Licencié est autorisé à distribuer des copies du Logiciel, modifié ou non, à "
        + "des tiers dans les conditions ci-après détaillées.\n"
        + "\n"
        + "5.3.1 DISTRIBUTION DU LOGICIEL SANS MODIFICATION\n"
        + "\n"
        + "Le Licencié est autorisé à distribuer des copies conformes du Logiciel, sous for"
        + "me de Code Source ou de Code Objet, à condition que cette distribution respecte "
        + "les dispositions du Contrat dans leur totalité et soit accompagnée:\n"
        + "\n"
        + "d'un exemplaire du Contrat,\n"
        + "\n"
        + "d'un avertissement relatif à la restriction de garantie et de responsabilité du "
        + "Concédant telle que prévue aux articles 8 et 9,\n"
        + "\n"
        + "et que, dans le cas où seul le Code Objet du Logiciel est redistribué, le Licenc"
        + "ié permette un accès effectif au Code Source complet du Logiciel pendant au moin"
        + "s toute la durée de sa distribution du Logiciel, étant entendu que le coût addit"
        + "ionnel d'acquisition du Code Source ne devra pas excéder le simple coût de trans"
        + "fert des données.\n"
        + "\n"
        + "5.3.2 DISTRIBUTION DU LOGICIEL MODIFIE\n"
        + "\n"
        + "Lorsque le Licencié apporte une Contribution au Logiciel, le Logiciel Modifié pe"
        + "ut être distribué sous un contrat de licence autre que le présent Contrat sous r"
        + "éserve du respect des dispositions de l'article 5.3.4.\n"
        + "\n"
        + "5.3.3 DISTRIBUTION DES MODULES EXTERNES\n"
        + "\n"
        + "Lorsque le Licencié a développé un Module Externe les conditions du Contrat ne s"
        + "'appliquent pas à ce Module Externe, qui peut être distribué sous un contrat de "
        + "licence différent.\n"
        + "\n"
        + "5.3.4 CITATIONS\n"
        + "\n"
        + "Le Licencié qui distribue un Logiciel Modifié s'engage expressément:\n"
        + "\n"
        + "à indiquer dans sa documentation qu'il a été réalisé à partir du Logiciel régi p"
        + "ar le Contrat, en reproduisant les mentions de propriété intellectuelle du Logic"
        + "iel,\n"
        + "\n"
        + "à faire en sorte que l'utilisation du Logiciel, ses mentions de propriété intell"
        + "ectuelle et le fait qu'il est régi par le Contrat soient indiqués dans un texte "
        + "facilement accessible depuis l'interface du Logiciel Modifié,\n"
        + "\n"
        + "à mentionner, sur un site Web librement accessible décrivant le Logiciel Modifié"
        + ", et pendant au moins toute la durée de sa distribution, qu'il a été réalisé à p"
        + "artir du Logiciel régi par le Contrat, en reproduisant les mentions de propriété"
        + " intellectuelle du Logiciel,\n"
        + "\n"
        + "lorsqu'il le distribue à un tiers susceptible de distribuer lui-même un Logiciel"
        + " Modifié, sans avoir à en distribuer le code source, à faire ses meilleurs effor"
        + "ts pour que les obligations du présent article 5.3.4 soient reprises par le dit "
        + "tiers.\n"
        + "\n"
        + "Lorsque le Logiciel modifié ou non est distribué avec un Module Externe qui a ét"
        + "é conçu pour l'utiliser, le Licencié doit soumettre le dit Module Externe aux ob"
        + "ligations précédentes.\n"
        + "\n"
        + "5.3.5 COMPATIBILITE AVEC LES LICENCES CeCILL et CeCILL-C\n"
        + "\n"
        + "Lorsqu'un Logiciel Modifié contient une Contribution soumise au contrat de licen"
        + "ce CeCILL, les stipulations prévues à l'article 5.3.4 sont facultatives.\n"
        + "\n"
        + "Un Logiciel Modifié peut être distribué sous le contrat de licence CeCILL-C. Les"
        + " stipulations prévues à l'article 5.3.4 sont alors facultatives.\n"
        + "\n"
        + "Article 6 - PROPRIETE INTELLECTUELLE\n"
        + "\n"
        + "6.1 SUR LE LOGICIEL INITIAL\n"
        + "\n"
        + "Le Titulaire est détenteur des droits patrimoniaux sur le Logiciel Initial. Tout"
        + "e utilisation du Logiciel Initial est soumise au respect des conditions dans les"
        + "quelles le Titulaire a choisi de diffuser son oeuvre et nul autre n'a la faculté"
        + " de modifier les conditions de diffusion de ce Logiciel Initial.\n"
        + "\n"
        + "Le Titulaire s'engage à ce que le Logiciel Initial reste au moins régi par le Co"
        + "ntrat et ce, pour la durée visée à l'article 4.2.\n"
        + "\n"
        + "6.2 SUR LES CONTRIBUTIONS\n"
        + "\n"
        + "Le Licencié qui a développé une Contribution est titulaire sur celle-ci des droi"
        + "ts de propriété intellectuelle dans les conditions définies par la législation a"
        + "pplicable.\n"
        + "\n"
        + "6.3 SUR LES MODULES EXTERNES\n"
        + "\n"
        + "Le Licencié qui a développé un Module Externe est titulaire sur celui-ci des dro"
        + "its de propriété intellectuelle dans les conditions définies par la législation "
        + "applicable et reste libre du choix du contrat régissant sa diffusion.\n"
        + "\n"
        + "6.4 DISPOSITIONS COMMUNES\n"
        + "\n"
        + "Le Licencié s'engage expressément:\n"
        + "\n"
        + "à ne pas supprimer ou modifier de quelque manière que ce soit les mentions de pr"
        + "opriété intellectuelle apposées sur le Logiciel;\n"
        + "\n"
        + "à reproduire à l'identique lesdites mentions de propriété intellectuelle sur les"
        + " copies du Logiciel modifié ou non.\n"
        + "\n"
        + "Le Licencié s'engage à ne pas porter atteinte, directement ou indirectement, aux"
        + " droits de propriété intellectuelle du Titulaire et/ou des Contributeurs sur le "
        + "Logiciel et à prendre, le cas échéant, à l'égard de son personnel toutes les mes"
        + "ures nécessaires pour assurer le respect des dits droits de propriété intellectu"
        + "elle du Titulaire et/ou des Contributeurs.\n"
        + "\n"
        + "Article 7 - SERVICES ASSOCIES\n"
        + "\n"
        + "7.1 Le Contrat n'oblige en aucun cas le Concédant à la réalisation de prestation"
        + "s d'assistance technique ou de maintenance du Logiciel.\n"
        + "\n"
        + "Cependant le Concédant reste libre de proposer ce type de services. Les termes e"
        + "t conditions d'une telle assistance technique et/ou d'une telle maintenance sero"
        + "nt alors déterminés dans un acte séparé. Ces actes de maintenance et/ou assistan"
        + "ce technique n'engageront que la seule responsabilité du Concédant qui les propo"
        + "se.\n"
        + "\n"
        + "7.2 De même, tout Concédant est libre de proposer, sous sa seule responsabilité,"
        + " à ses licenciés une garantie, qui n'engagera que lui, lors de la redistribution"
        + " du Logiciel et/ou du Logiciel Modifié et ce, dans les conditions qu'il souhaite"
        + ". Cette garantie et les modalités financières de son application feront l'objet "
        + "d'un acte séparé entre le Concédant et le Licencié.\n"
        + "\n"
        + "Article 8 - RESPONSABILITE\n"
        + "\n"
        + "8.1 Sous réserve des dispositions de l'article 8.2, le Licencié a la faculté, so"
        + "us réserve de prouver la faute du Concédant concerné, de solliciter la réparatio"
        + "n du préjudice direct qu'il subirait du fait du Logiciel et dont il apportera la"
        + " preuve.\n"
        + "\n"
        + "8.2 La responsabilité du Concédant est limitée aux engagements pris en applicati"
        + "on du Contrat et ne saurait être engagée en raison notamment: (i) des dommages d"
        + "us à l'inexécution, totale ou partielle, de ses obligations par le Licencié, (ii"
        + ") des dommages directs ou indirects découlant de l'utilisation ou des performanc"
        + "es du Logiciel subis par le Licencié et (iii) plus généralement d'un quelconque "
        + "dommage indirect. En particulier, les Parties conviennent expressément que tout "
        + "préjudice financier ou commercial (par exemple perte de données, perte de bénéfi"
        + "ces, perte d'exploitation, perte de clientèle ou de commandes, manque à gagner, "
        + "trouble commercial quelconque) ou toute action dirigée contre le Licencié par un"
        + " tiers, constitue un dommage indirect et n'ouvre pas droit à réparation par le C"
        + "oncédant.\n"
        + "\n"
        + "Article 9 - GARANTIE\n"
        + "\n"
        + "9.1 Le Licencié reconnaît que l'état actuel des connaissances scientifiques et t"
        + "echniques au moment de la mise en circulation du Logiciel ne permet pas d'en tes"
        + "ter et d'en vérifier toutes les utilisations ni de détecter l'existence d'éventu"
        + "els défauts. L'attention du Licencié a été attirée sur ce point sur les risques "
        + "associés au chargement, à l'utilisation, la modification et/ou au développement "
        + "et à la reproduction du Logiciel qui sont réservés à des utilisateurs avertis.\n"
        + "\n"
        + "Il relève de la responsabilité du Licencié de contrôler, par tous moyens, l'adéq"
        + "uation du produit à ses besoins, son bon fonctionnement et de s'assurer qu'il ne"
        + " causera pas de dommages aux personnes et aux biens.\n"
        + "\n"
        + "9.2 Le Concédant déclare de bonne foi être en droit de concéder l'ensemble des d"
        + "roits attachés au Logiciel (comprenant notamment les droits visés à l'article 5)"
        + ".\n"
        + "\n"
        + "9.3 Le Licencié reconnaît que le Logiciel est fourni \"en l'état\" par le Concédan"
        + "t sans autre garantie, expresse ou tacite, que celle prévue à l'article 9.2 et n"
        + "otamment sans aucune garantie sur sa valeur commerciale, son caractère sécurisé,"
        + " innovant ou pertinent.\n"
        + "\n"
        + "En particulier, le Concédant ne garantit pas que le Logiciel est exempt d'erreur"
        + ", qu'il fonctionnera sans interruption, qu'il sera compatible avec l'équipement "
        + "du Licencié et sa configuration logicielle ni qu'il remplira les besoins du Lice"
        + "ncié.\n"
        + "\n"
        + "9.4 Le Concédant ne garantit pas, de manière expresse ou tacite, que le Logiciel"
        + " ne porte pas atteinte à un quelconque droit de propriété intellectuelle d'un ti"
        + "ers portant sur un brevet, un logiciel ou sur tout autre droit de propriété. Ain"
        + "si, le Concédant exclut toute garantie au profit du Licencié contre les actions "
        + "en contrefaçon qui pourraient être diligentées au titre de l'utilisation, de la "
        + "modification, et de la redistribution du Logiciel. Néanmoins, si de telles actio"
        + "ns sont exercées contre le Licencié, le Concédant lui apportera son aide techniq"
        + "ue et juridique pour sa défense. Cette aide technique et juridique est déterminé"
        + "e au cas par cas entre le Concédant concerné et le Licencié dans le cadre d'un p"
        + "rotocole d'accord. Le Concédant dégage toute responsabilité quant à l'utilisatio"
        + "n de la dénomination du Logiciel par le Licencié. Aucune garantie n'est apportée"
        + " quant à l'existence de droits antérieurs sur le nom du Logiciel et sur l'existe"
        + "nce d'une marque.\n"
        + "\n"
        + "Article 10 - RESILIATION\n"
        + "\n"
        + "10.1 En cas de manquement par le Licencié aux obligations mises à sa charge par "
        + "le Contrat, le Concédant pourra résilier de plein droit le Contrat trente (30) j"
        + "ours après notification adressée au Licencié et restée sans effet.\n"
        + "\n"
        + "10.2 Le Licencié dont le Contrat est résilié n'est plus autorisé à utiliser, mod"
        + "ifier ou distribuer le Logiciel. Cependant, toutes les licences qu'il aura concé"
        + "dées antérieurement à la résiliation du Contrat resteront valides sous réserve q"
        + "u'elles aient été effectuées en conformité avec le Contrat.\n"
        + "\n"
        + "Article 11 - DISPOSITIONS DIVERSES\n"
        + "\n"
        + "11.1 CAUSE EXTERIEURE\n"
        + "\n"
        + "Aucune des Parties ne sera responsable d'un retard ou d'une défaillance d'exécut"
        + "ion du Contrat qui serait dû à un cas de force majeure, un cas fortuit ou une ca"
        + "use extérieure, telle que, notamment, le mauvais fonctionnement ou les interrupt"
        + "ions du réseau électrique ou de télécommunication, la paralysie du réseau liée à"
        + " une attaque informatique, l'intervention des autorités gouvernementales, les ca"
        + "tastrophes naturelles, les dégâts des eaux, les tremblements de terre, le feu, l"
        + "es explosions, les grèves et les conflits sociaux, l'état de guerre...\n"
        + "\n"
        + "11.2 Le fait, par l'une ou l'autre des Parties, d'omettre en une ou plusieurs oc"
        + "casions de se prévaloir d'une ou plusieurs dispositions du Contrat, ne pourra en"
        + " aucun cas impliquer renonciation par la Partie intéressée à s'en prévaloir ulté"
        + "rieurement.\n"
        + "\n"
        + "11.3 Le Contrat annule et remplace toute convention antérieure, écrite ou orale,"
        + " entre les Parties sur le même objet et constitue l'accord entier entre les Part"
        + "ies sur cet objet. Aucune addition ou modification aux termes du Contrat n'aura "
        + "d'effet à l'égard des Parties à moins d'être faite par écrit et signée par leurs"
        + " représentants dûment habilités.\n"
        + "\n"
        + "11.4 Dans l'hypothèse où une ou plusieurs des dispositions du Contrat s'avèrerai"
        + "t contraire à une loi ou à un texte applicable, existants ou futurs, cette loi o"
        + "u ce texte prévaudrait, et les Parties feraient les amendements nécessaires pour"
        + " se conformer à cette loi ou à ce texte. Toutes les autres dispositions resteron"
        + "t en vigueur. De même, la nullité, pour quelque raison que ce soit, d'une des di"
        + "spositions du Contrat ne saurait entraîner la nullité de l'ensemble du Contrat.\n"
        + "\n"
        + "11.5 LANGUE\n"
        + "\n"
        + "Le Contrat est rédigé en langue française et en langue anglaise, ces deux versio"
        + "ns faisant également foi.\n"
        + "\n"
        + "Article 12 - NOUVELLES VERSIONS DU CONTRAT\n"
        + "\n"
        + "12.1 Toute personne est autorisée à copier et distribuer des copies de ce Contra"
        + "t.\n"
        + "\n"
        + "12.2 Afin d'en préserver la cohérence, le texte du Contrat est protégé et ne peu"
        + "t être modifié que par les auteurs de la licence, lesquels se réservent le droit"
        + " de publier périodiquement des mises à jour ou de nouvelles versions du Contrat,"
        + " qui posséderont chacune un numéro distinct. Ces versions ultérieures seront sus"
        + "ceptibles de prendre en compte de nouvelles problématiques rencontrées par les l"
        + "ogiciels libres.\n"
        + "\n"
        + "12.3 Tout Logiciel diffusé sous une version donnée du Contrat ne pourra faire l'"
        + "objet d'une diffusion ultérieure que sous la même version du Contrat ou une vers"
        + "ion postérieure.\n"
        + "\n"
        + "Article 13 - LOI APPLICABLE ET COMPETENCE TERRITORIALE\n"
        + "\n"
        + "13.1 Le Contrat est régi par la loi française. Les Parties conviennent de tenter"
        + " de régler à l'amiable les différends ou litiges qui viendraient à se produire p"
        + "ar suite ou à l'occasion du Contrat.\n"
        + "\n"
        + "13.2 A défaut d'accord amiable dans un délai de deux (2) mois à compter de leur "
        + "survenance et sauf situation relevant d'une procédure d'urgence, les différends "
        + "ou litiges seront portés par la Partie la plus diligente devant les Tribunaux co"
        + "mpétents de Paris.\n"
        + "\n"
        + "1 CeCILL est pour Ce(a) C(nrs) I(nria) L(ogiciel) L(ibre)\n"
        + "\n"
        + "Version 1.0 du 2006-09-05.\n"
; // the license text
    }
 
    
}
