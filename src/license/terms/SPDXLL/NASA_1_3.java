package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:17:52Z
 * LicenseName: AGPL-3.0+
 * FileName: NASA_1_3.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class NASA_1_3 extends License{
   /**
     * Was this license approved by the OSI?
     * @return  True if the license is listed as approved   
     */
    @Override
    public Boolean approvedOSI(){
        return true; // was this license OSI approved or not?
    }
    
    /**
     * The SPDX identifier
     * @return  The unique identifier for this license
     */
    @Override
    public String getId(){
        return "NASA-1.3"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "NASA Open Source Agreement 1.3"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "NASA OPEN SOURCE AGREEMENT VERSION 1.3\n"
        + "\n"
        + "THIS OPEN SOURCE AGREEMENT (\"AGREEMENT\") DEFINES THE RIGHTS OF USE, REPRODUCTION"
        + ", DISTRIBUTION, MODIFICATION AND REDISTRIBUTION OF CERTAIN COMPUTER SOFTWARE ORI"
        + "GINALLY RELEASED BY THE UNITED STATES GOVERNMENT AS REPRESENTED BY THE GOVERNMEN"
        + "T AGENCY LISTED BELOW (\"GOVERNMENT AGENCY\"). THE UNITED STATES GOVERNMENT, AS RE"
        + "PRESENTED BY GOVERNMENT AGENCY, IS AN INTENDED THIRD-PARTY BENEFICIARY OF ALL SU"
        + "BSEQUENT DISTRIBUTIONS OR REDISTRIBUTIONS OF THE SUBJECT SOFTWARE. ANYONE WHO US"
        + "ES, REPRODUCES, DISTRIBUTES, MODIFIES OR REDISTRIBUTES THE SUBJECT SOFTWARE, AS "
        + "DEFINED HEREIN, OR ANY PART THEREOF, IS, BY THAT ACTION, ACCEPTING IN FULL THE R"
        + "ESPONSIBILITIES AND OBLIGATIONS CONTAINED IN THIS AGREEMENT.\n"
        + "\n"
        + "Government Agency: _____ Government Agency Original Software Designation: __ Gov"
        + "ernment Agency Original Software Title: _____ User Registration Requested. Pleas"
        + "e Visit http://___ Government Agency Point of Contact for Original Software: ___"
        + "__\n"
        + "\n"
        + "DEFINITIONS\n"
        + "\n"
        + "A. \"Contributor\" means Government Agency, as the developer of the Original Softw"
        + "are, and any entity that makes a Modification. B. \"Covered Patents\" mean patent "
        + "claims licensable by a Contributor that are necessarily infringed by the use or "
        + "sale of its Modification alone or when combined with the Subject Software. C. \"D"
        + "isplay\" means the showing of a copy of the Subject Software, either directly or "
        + "by means of an image, or any other device. D. \"Distribution\" means conveyance or"
        + " transfer of the Subject Software, regardless of means, to another. E. \"Larger W"
        + "ork\" means computer software that combines Subject Software, or portions thereof"
        + ", with software separate from the Subject Software that is not governed by the t"
        + "erms of this Agreement. F. \"Modification\" means any alteration of, including add"
        + "ition to or deletion from, the substance or structure of either the Original Sof"
        + "tware or Subject Software, and includes derivative works, as that term is define"
        + "d in the Copyright Statute, 17 USC 101. However, the act of including Subject So"
        + "ftware as part of a Larger Work does not in and of itself constitute a Modificat"
        + "ion. G. \"Original Software\" means the computer software first released under thi"
        + "s Agreement by Government Agency with Government Agency designation __ and entit"
        + "led _________, including source code, object code and accompanying documentation"
        + ", if any. H. \"Recipient\" means anyone who acquires the Subject Software under th"
        + "is Agreement, including all Contributors. I. \"Redistribution\" means Distribution"
        + " of the Subject Software after a Modification has been made. J. \"Reproduction\" m"
        + "eans the making of a counterpart, image or copy of the Subject Software. K. \"Sal"
        + "e\" means the exchange of the Subject Software for money or equivalent value. L. "
        + "\"Subject Software\" means the Original Software, Modifications, or any respective"
        + " parts thereof. M. \"Use\" means the application or employment of the Subject Soft"
        + "ware for any purpose.\n"
        + "\n"
        + "GRANT OF RIGHTS\n"
        + "\n"
        + "A. Under Non-Patent Rights: Subject to the terms and conditions of this Agreemen"
        + "t, each Contributor, with respect to its own contribution to the Subject Softwar"
        + "e, hereby grants to each Recipient a non-exclusive, world-wide, royalty-free lic"
        + "ense to engage in the following activities pertaining to the Subject Software:\n"
        + "\n"
        + "     1. Use\n"
        + "     2. Distribution\n"
        + "     3. Reproduction\n"
        + "     4. Modification\n"
        + "     5. Redistribution\n"
        + "     6. Display\n"
        + "\n"
        + "B. Under Patent Rights: Subject to the terms and conditions of this Agreement, e"
        + "ach Contributor, with respect to its own contribution to the Subject Software, h"
        + "ereby grants to each Recipient under Covered Patents a non-exclusive, world-wide"
        + ", royalty-free license to engage in the following activities pertaining to the S"
        + "ubject Software:\n"
        + "\n"
        + "     1. Use\n"
        + "     2. Distribution\n"
        + "     3. Reproduction\n"
        + "     4. Sale\n"
        + "     5. Offer for Sale\n"
        + "\n"
        + "C. The rights granted under Paragraph B. also apply to the combination of a Cont"
        + "ributor's Modification and the Subject Software if, at the time the Modification"
        + " is added by the Contributor, the addition of such Modification causes the combi"
        + "nation to be covered by the Covered Patents. It does not apply to any other comb"
        + "inations that include a Modification.\n"
        + "\n"
        + "D. The rights granted in Paragraphs A. and B. allow the Recipient to sublicense "
        + "those same rights. Such sublicense must be under the same terms and conditions o"
        + "f this Agreement.\n"
        + "\n"
        + "OBLIGATIONS OF RECIPIENT\n"
        + "\n"
        + "A. Distribution or Redistribution of the Subject Software must be made under thi"
        + "s Agreement except for additions covered under paragraph 3H.\n"
        + "\n"
        + "     1. Whenever a Recipient distributes or redistributes the Subject Software, "
        + "a copy of this Agreement must be included with each copy of the Subject Software"
        + "; and\n"
        + "     2. If Recipient distributes or redistributes the Subject Software in any fo"
        + "rm other than source code, Recipient must also make the source code freely avail"
        + "able, and must provide with each copy of the Subject Software information on how"
        + " to obtain the source code in a reasonable manner on or through a medium customa"
        + "rily used for software exchange.\n"
        + "\n"
        + "B. Each Recipient must ensure that the following copyright notice appears promin"
        + "ently in the Subject Software:\n"
        + "\n"
        + "[Government Agency will insert the applicable copyright notice in each agreement"
        + " accompanying the initial distribution of original software and remove this brac"
        + "keted language.]\n"
        + "\n"
        + "[The following copyright notice will be used if created by a contractor pursuant"
        + " to Government Agency contract and rights obtained from creator by assignment. G"
        + "overnment Agency will insert the year and its Agency designation and remove the "
        + "bracketed language.] Copyright (c) {YEAR} United States Government as represente"
        + "d by ___ ____. All Rights Reserved.\n"
        + "\n"
        + "[The following copyright notice will be used if created by civil servants only. "
        + "Government Agency will insert the year and its Agency designation and remove the"
        + " bracketed language.] Copyright (c) {YEAR} United States Government as represent"
        + "ed by ____ ____. No copyright is claimed in the United States under Title 17, U."
        + "S.Code. All Other Rights Reserved.\n"
        + "\n"
        + "C. Each Contributor must characterize its alteration of the Subject Software as "
        + "a Modification and must identify itself as the originator of its Modification in"
        + " a manner that reasonably allows subsequent Recipients to identify the originato"
        + "r of the Modification. In fulfillment of these requirements, Contributor must in"
        + "clude a file (e.g., a change log file) that describes the alterations made and t"
        + "he date of the alterations, identifies Contributor as originator of the alterati"
        + "ons, and consents to characterization of the alterations as a Modification, for "
        + "example, by including a statement that the Modification is derived, directly or "
        + "indirectly, from Original Software provided by Government Agency. Once consent i"
        + "s granted, it may not thereafter be revoked.\n"
        + "\n"
        + "D. A Contributor may add its own copyright notice to the Subject Software. Once "
        + "a copyright notice has been added to the Subject Software, a Recipient may not r"
        + "emove it without the express permission of the Contributor who added the notice.\n"
        + "\n"
        + "E. A Recipient may not make any representation in the Subject Software or in any"
        + " promotional, advertising or other material that may be construed as an endorsem"
        + "ent by Government Agency or by any prior Recipient of any product or service pro"
        + "vided by Recipient, or that may seek to obtain commercial advantage by the fact "
        + "of Government Agency's or a prior Recipient's participation in this Agreement.\n"
        + "\n"
        + "F. In an effort to track usage and maintain accurate records of the Subject Soft"
        + "ware, each Recipient, upon receipt of the Subject Software, is requested to regi"
        + "ster with Government Agency by visiting the following website: ______. Recipient"
        + "'s name and personal information shall be used for statistical purposes only. On"
        + "ce a Recipient makes a Modification available, it is requested that the Recipien"
        + "t inform Government Agency at the web site provided above how to access the Modi"
        + "fication.\n"
        + "\n"
        + "[Alternative paragraph for use when a web site for release and monitoring of sub"
        + "ject software will not be supported by releasing Government Agency] In an effort"
        + " to track usage and maintain accurate records of the Subject Software, each Reci"
        + "pient, upon receipt of the Subject Software, is requested to provide Government "
        + "Agency, by e-mail to the Government Agency Point of Contact listed in clause 5.F"
        + "., the following information: ______. Recipient's name and personal information "
        + "shall be used for statistical purposes only. Once a Recipient makes a Modificati"
        + "on available, it is requested that the Recipient inform Government Agency, by e-"
        + "mail to the Government Agency Point of Contact listed in clause 5.F., how to acc"
        + "ess the Modification.\n"
        + "\n"
        + "G. Each Contributor represents that that its Modification is believed to be Cont"
        + "ributor's original creation and does not violate any existing agreements, regula"
        + "tions, statutes or rules, and further that Contributor has sufficient rights to "
        + "grant the rights conveyed by this Agreement.\n"
        + "\n"
        + "H. A Recipient may choose to offer, and to charge a fee for, warranty, support, "
        + "indemnity and/or liability obligations to one or more other Recipients of the Su"
        + "bject Software. A Recipient may do so, however, only on its own behalf and not o"
        + "n behalf of Government Agency or any other Recipient. Such a Recipient must make"
        + " it absolutely clear that any such warranty, support, indemnity and/or liability"
        + " obligation is offered by that Recipient alone. Further, such Recipient agrees t"
        + "o indemnify Government Agency and every other Recipient for any liability incurr"
        + "ed by them as a result of warranty, support, indemnity and/or liability offered "
        + "by such Recipient.\n"
        + "\n"
        + "I. A Recipient may create a Larger Work by combining Subject Software with separ"
        + "ate software not governed by the terms of this agreement and distribute the Larg"
        + "er Work as a single product. In such case, the Recipient must make sure Subject "
        + "Software, or portions thereof, included in the Larger Work is subject to this Ag"
        + "reement.\n"
        + "\n"
        + "J. Notwithstanding any provisions contained herein, Recipient is hereby put on n"
        + "otice that export of any goods or technical data from the United States may requ"
        + "ire some form of export license from the U.S. Government. Failure to obtain nece"
        + "ssary export licenses may result in criminal liability under U.S. laws. Governme"
        + "nt Agency neither represents that a license shall not be required nor that, if r"
        + "equired, it shall be issued. Nothing granted herein provides any such export lic"
        + "ense.\n"
        + "\n"
        + "DISCLAIMER OF WARRANTIES AND LIABILITIES; WAIVER AND INDEMNIFICATION\n"
        + "\n"
        + "A. No Warranty: THE SUBJECT SOFTWARE IS PROVIDED \"AS IS\" WITHOUT ANY WARRANTY OF"
        + " ANY KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT LIMITED T"
        + "O, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO SPECIFICATIONS, ANY IM"
        + "PLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR FREEDO"
        + "M FROM INFRINGEMENT, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL BE ERROR FREE, "
        + "OR ANY WARRANTY THAT DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOF"
        + "TWARE. THIS AGREEMENT DOES NOT, IN ANY MANNER, CONSTITUTE AN ENDORSEMENT BY GOVE"
        + "RNMENT AGENCY OR ANY PRIOR RECIPIENT OF ANY RESULTS, RESULTING DESIGNS, HARDWARE"
        + ", SOFTWARE PRODUCTS OR ANY OTHER APPLICATIONS RESULTING FROM USE OF THE SUBJECT "
        + "SOFTWARE. FURTHER, GOVERNMENT AGENCY DISCLAIMS ALL WARRANTIES AND LIABILITIES RE"
        + "GARDING THIRD-PARTY SOFTWARE, IF PRESENT IN THE ORIGINAL SOFTWARE, AND DISTRIBUT"
        + "ES IT \"AS IS.\"\n"
        + "\n"
        + "B. Waiver and Indemnity: RECIPIENT AGREES TO WAIVE ANY AND ALL CLAIMS AGAINST TH"
        + "E UNITED STATES GOVERNMENT, ITS CONTRACTORS AND SUBCONTRACTORS, AS WELL AS ANY P"
        + "RIOR RECIPIENT. IF RECIPIENT'S USE OF THE SUBJECT SOFTWARE RESULTS IN ANY LIABIL"
        + "ITIES, DEMANDS, DAMAGES, EXPENSES OR LOSSES ARISING FROM SUCH USE, INCLUDING ANY"
        + " DAMAGES FROM PRODUCTS BASED ON, OR RESULTING FROM, RECIPIENT'S USE OF THE SUBJE"
        + "CT SOFTWARE, RECIPIENT SHALL INDEMNIFY AND HOLD HARMLESS THE UNITED STATES GOVER"
        + "NMENT, ITS CONTRACTORS AND SUBCONTRACTORS, AS WELL AS ANY PRIOR RECIPIENT, TO TH"
        + "E EXTENT PERMITTED BY LAW. RECIPIENT'S SOLE REMEDY FOR ANY SUCH MATTER SHALL BE "
        + "THE IMMEDIATE, UNILATERAL TERMINATION OF THIS AGREEMENT.\n"
        + "\n"
        + "GENERAL TERMS\n"
        + "\n"
        + "A. Termination: This Agreement and the rights granted hereunder will terminate a"
        + "utomatically if a Recipient fails to comply with these terms and conditions, and"
        + " fails to cure such noncompliance within thirty (30) days of becoming aware of s"
        + "uch noncompliance. Upon termination, a Recipient agrees to immediately cease use"
        + " and distribution of the Subject Software. All sublicenses to the Subject Softwa"
        + "re properly granted by the breaching Recipient shall survive any such terminatio"
        + "n of this Agreement.\n"
        + "\n"
        + "B. Severability: If any provision of this Agreement is invalid or unenforceable "
        + "under applicable law, it shall not affect the validity or enforceability of the "
        + "remainder of the terms of this Agreement.\n"
        + "\n"
        + "C. Applicable Law: This Agreement shall be subject to United States federal law "
        + "only for all purposes, including, but not limited to, determining the validity o"
        + "f this Agreement, the meaning of its provisions and the rights, obligations and "
        + "remedies of the parties.\n"
        + "\n"
        + "D. Entire Understanding: This Agreement constitutes the entire understanding and"
        + " agreement of the parties relating to release of the Subject Software and may no"
        + "t be superseded, modified or amended except by further written agreement duly ex"
        + "ecuted by the parties.\n"
        + "\n"
        + "E. Binding Authority: By accepting and using the Subject Software under this Agr"
        + "eement, a Recipient affirms its authority to bind the Recipient to all terms and"
        + " conditions of this Agreement and that that Recipient hereby agrees to all terms"
        + " and conditions herein.\n"
        + "\n"
        + "F. Point of Contact: Any Recipient contact with Government Agency is to be direc"
        + "ted to the designated representative as follows: ___________.\n"
; // the license text
    }
 
    
}
