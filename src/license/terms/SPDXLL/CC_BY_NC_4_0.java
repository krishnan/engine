package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:16:43Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: CC_BY_NC_4_0.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class CC_BY_NC_4_0 extends License{
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
        return "CC-BY-NC-4.0"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "Creative Commons Attribution Non Commercial 4.0"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "Creative Commons Attribution-NonCommercial 4.0 International\n"
        + "\n"
        + "<<beginOptional;name=ccOptionalIntro>> Creative Commons Corporation (“Creative C"
        + "ommons”) is not a law firm and does not provide legal services or legal advice. "
        + "Distribution of Creative Commons public licenses does not create a lawyer-client"
        + " or other relationship. Creative Commons makes its licenses and related informat"
        + "ion available on an “as-is” basis. Creative Commons gives no warranties regardin"
        + "g its licenses, any material licensed under their terms and conditions, or any r"
        + "elated information. Creative Commons disclaims all liability for damages resulti"
        + "ng from their use to the fullest extent possible.\n"
        + "\n"
        + "Using Creative Commons Public Licenses\n"
        + " \n"
        + "Creative Commons public licenses provide a standard set of terms and conditions "
        + "that creators and other rights holders may use to share original works of author"
        + "ship and other material subject to copyright and certain other rights specified "
        + "in the public license below. The following considerations are for informational "
        + "purposes only, are not exhaustive, and do not form part of our licenses.\n"
        + "\n"
        + "Considerations for licensors: Our public licenses are intended for use by those "
        + "authorized to give the public permission to use material in ways otherwise restr"
        + "icted by copyright and certain other rights. Our licenses are irrevocable. Licen"
        + "sors should read and understand the terms and conditions of the license they cho"
        + "ose before applying it. Licensors should also secure all rights necessary before"
        + " applying our licenses so that the public can reuse the material as expected. Li"
        + "censors should clearly mark any material not subject to the license. This includ"
        + "es other CC-licensed material, or material used under an exception or limitation"
        + " to copyright. More considerations for licensors.\n"
        + "\n"
        + "Considerations for the public: By using one of our public licenses, a licensor g"
        + "rants the public permission to use the licensed material under specified terms a"
        + "nd conditions. If the licensor’s permission is not necessary for any reason–for "
        + "example, because of any applicable exception or limitation to copyright–then tha"
        + "t use is not regulated by the license. Our licenses grant only permissions under"
        + " copyright and certain other rights that a licensor has authority to grant. Use "
        + "of the licensed material may still be restricted for other reasons, including be"
        + "cause others have copyright or other rights in the material. A licensor may make"
        + " special requests, such as asking that all changes be marked or described. Altho"
        + "ugh not required by our licenses, you are encouraged to respect those requests w"
        + "here reasonable. More considerations for the public. <<endOptional>>\n"
        + "\n"
        + "Creative Commons Attribution-NonCommercial 4.0 International Public License\n"
        + "\n"
        + "By exercising the Licensed Rights (defined below), You accept and agree to be bo"
        + "und by the terms and conditions of this Creative Commons Attribution-NonCommerci"
        + "al 4.0 International Public License (\"Public License\"). To the extent this Publi"
        + "c License may be interpreted as a contract, You are granted the Licensed Rights "
        + "in consideration of Your acceptance of these terms and conditions, and the Licen"
        + "sor grants You such rights in consideration of benefits the Licensor receives fr"
        + "om making the Licensed Material available under these terms and conditions.\n"
        + "\n"
        + "Section 1 – Definitions.\n"
        + "\n"
        + "     a.Adapted Material means material subject to Copyright and Similar Rights "
        + "that is derived from or based upon the Licensed Material and in which the Licens"
        + "ed Material is translated, altered, arranged, transformed, or otherwise modified"
        + " in a manner requiring permission under the Copyright and Similar Rights held by"
        + " the Licensor. For purposes of this Public License, where the Licensed Material "
        + "is a musical work, performance, or sound recording, Adapted Material is always p"
        + "roduced where the Licensed Material is synched in timed relation with a moving i"
        + "mage.\n"
        + "\n"
        + "     b.Adapter's License means the license You apply to Your Copyright and Simi"
        + "lar Rights in Your contributions to Adapted Material in accordance with the term"
        + "s and conditions of this Public License.\n"
        + "\n"
        + "     c.Copyright and Similar Rights means copyright and/or similar rights close"
        + "ly related to copyright including, without limitation, performance, broadcast, s"
        + "ound recording, and Sui Generis Database Rights, without regard to how the right"
        + "s are labeled or categorized. For purposes of this Public License, the rights sp"
        + "ecified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.\n"
        + "\n"
        + "     d.Effective Technological Measures means those measures that, in the absen"
        + "ce of proper authority, may not be circumvented under laws fulfilling obligation"
        + "s under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, an"
        + "d/or similar international agreements.\n"
        + "\n"
        + "     e.Exceptions and Limitations means fair use, fair dealing, and/or any othe"
        + "r exception or limitation to Copyright and Similar Rights that applies to Your u"
        + "se of the Licensed Material.\n"
        + "\n"
        + "     f.Licensed Material means the artistic or literary work, database, or othe"
        + "r material to which the Licensor applied this Public License.\n"
        + "\n"
        + "     g.Licensed Rights means the rights granted to You subject to the terms and"
        + " conditions of this Public License, which are limited to all Copyright and Simil"
        + "ar Rights that apply to Your use of the Licensed Material and that the Licensor "
        + "has authority to license.\n"
        + "\n"
        + "     h.Licensor means the individual(s) or entity(ies) granting rights under th"
        + "is Public License.\n"
        + "\n"
        + "     i.NonCommercial means not primarily intended for or directed towards comme"
        + "rcial advantage or monetary compensation. For purposes of this Public License, t"
        + "he exchange of the Licensed Material for other material subject to Copyright and"
        + " Similar Rights by digital file-sharing or similar means is NonCommercial provid"
        + "ed there is no payment of monetary compensation in connection with the exchange.\n"
        + "\n"
        + "     j.Share means to provide material to the public by any means or process th"
        + "at requires permission under the Licensed Rights, such as reproduction, public d"
        + "isplay, public performance, distribution, dissemination, communication, or impor"
        + "tation, and to make material available to the public including in ways that memb"
        + "ers of the public may access the material from a place and at a time individuall"
        + "y chosen by them.\n"
        + "\n"
        + "     k.Sui Generis Database Rights means rights other than copyright resulting "
        + "from Directive 96/9/EC of the European Parliament and of the Council of 11 March"
        + " 1996 on the legal protection of databases, as amended and/or succeeded, as well"
        + " as other essentially equivalent rights anywhere in the world.\n"
        + "\n"
        + "     l.You means the individual or entity exercising the Licensed Rights under "
        + "this Public License. Your has a corresponding meaning.\n"
        + "\n"
        + "Section 2 – Scope.\n"
        + "\n"
        + "     a.License grant.\n"
        + "\n"
        + "          1. Subject to the terms and conditions of this Public License, the Lic"
        + "ensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclus"
        + "ive, irrevocable license to exercise the Licensed Rights in the Licensed Materia"
        + "l to:\n"
        + "\n"
        + "               A. reproduce and Share the Licensed Material, in whole or in part"
        + ", for NonCommercial purposes only; and\n"
        + "\n"
        + "               B. produce, reproduce, and Share Adapted Material for NonCommerci"
        + "al purposes only.\n"
        + "\n"
        + "          2. Exceptions and Limitations. For the avoidance of doubt, where Excep"
        + "tions and Limitations apply to Your use, this Public License does not apply, and"
        + " You do not need to comply with its terms and conditions.\n"
        + "\n"
        + "          3. Term. The term of this Public License is specified in Section 6(a).\n"
        + "\n"
        + "          4. Media and formats; technical modifications allowed. The Licensor au"
        + "thorizes You to exercise the Licensed Rights in all media and formats whether no"
        + "w known or hereafter created, and to make technical modifications necessary to d"
        + "o so. The Licensor waives and/or agrees not to assert any right or authority to "
        + "forbid You from making technical modifications necessary to exercise the License"
        + "d Rights, including technical modifications necessary to circumvent Effective Te"
        + "chnological Measures. For purposes of this Public License, simply making modific"
        + "ations authorized by this Section 2(a)(4) never produces Adapted Material.\n"
        + "\n"
        + "          5. Downstream recipients.\n"
        + "\n"
        + "               A. Offer from the Licensor – Licensed Material. Every recipient o"
        + "f the Licensed Material automatically receives an offer from the Licensor to exe"
        + "rcise the Licensed Rights under the terms and conditions of this Public License.\n"
        + "\n"
        + "               B. No downstream restrictions. You may not offer or impose any ad"
        + "ditional or different terms or conditions on, or apply any Effective Technologic"
        + "al Measures to, the Licensed Material if doing so restricts exercise of the Lice"
        + "nsed Rights by any recipient of the Licensed Material.\n"
        + "\n"
        + "          6. No endorsement. Nothing in this Public License constitutes or may b"
        + "e construed as permission to assert or imply that You are, or that Your use of t"
        + "he Licensed Material is, connected with, or sponsored, endorsed, or granted offi"
        + "cial status by, the Licensor or others designated to receive attribution as prov"
        + "ided in Section 3(a)(1)(A)(i).\n"
        + "\n"
        + "     b.Other rights.\n"
        + "\n"
        + "          1. Moral rights, such as the right of integrity, are not licensed unde"
        + "r this Public License, nor are publicity, privacy, and/or other similar personal"
        + "ity rights; however, to the extent possible, the Licensor waives and/or agrees n"
        + "ot to assert any such rights held by the Licensor to the limited extent necessar"
        + "y to allow You to exercise the Licensed Rights, but not otherwise.\n"
        + "\n"
        + "          2. Patent and trademark rights are not licensed under this Public Lice"
        + "nse.\n"
        + "\n"
        + "          3. To the extent possible, the Licensor waives any right to collect ro"
        + "yalties from You for the exercise of the Licensed Rights, whether directly or th"
        + "rough a collecting society under any voluntary or waivable statutory or compulso"
        + "ry licensing scheme. In all other cases the Licensor expressly reserves any righ"
        + "t to collect such royalties, including when the Licensed Material is used other "
        + "than for NonCommercial purposes.\n"
        + "\n"
        + "Section 3 – License Conditions.\n"
        + "\n"
        + "Your exercise of the Licensed Rights is expressly made subject to the following "
        + "conditions.\n"
        + "\n"
        + "     a.Attribution.\n"
        + "\n"
        + "          1. If You Share the Licensed Material (including in modified form), Yo"
        + "u must:\n"
        + "\n"
        + "               A. retain the following if it is supplied by the Licensor with th"
        + "e Licensed Material:\n"
        + "\n"
        + "                    i.identification of the creator(s) of the Licensed Material"
        + " and any others designated to receive attribution, in any reasonable manner requ"
        + "ested by the Licensor (including by pseudonym if designated);\n"
        + "\n"
        + "                    ii.a copyright notice;\n"
        + "\n"
        + "                    iii. a notice that refers to this Public License;\n"
        + "\n"
        + "                    iv.a notice that refers to the disclaimer of warranties;\n"
        + "\n"
        + "                    v.a URI or hyperlink to the Licensed Material to the extent"
        + " reasonably practicable;\n"
        + "\n"
        + "               B. indicate if You modified the Licensed Material and retain an i"
        + "ndication of any previous modifications; and\n"
        + "\n"
        + "               C. indicate the Licensed Material is licensed under this Public L"
        + "icense, and include the text of, or the URI or hyperlink to, this Public License"
        + ".\n"
        + "\n"
        + "          2. You may satisfy the conditions in Section 3(a)(1) in any reasonable"
        + " manner based on the medium, means, and context in which You Share the Licensed "
        + "Material. For example, it may be reasonable to satisfy the conditions by providi"
        + "ng a URI or hyperlink to a resource that includes the required information.\n"
        + "\n"
        + "          3. If requested by the Licensor, You must remove any of the informatio"
        + "n required by Section 3(a)(1)(A) to the extent reasonably practicable.\n"
        + "\n"
        + "          4. If You Share Adapted Material You produce, the Adapter's License Yo"
        + "u apply must not prevent recipients of the Adapted Material from complying with "
        + "this Public License.\n"
        + "\n"
        + "Section 4 – Sui Generis Database Rights.\n"
        + "\n"
        + "Where the Licensed Rights include Sui Generis Database Rights that apply to Your"
        + " use of the Licensed Material:\n"
        + "\n"
        + "     a.for the avoidance of doubt, Section 2(a)(1) grants You the right to extr"
        + "act, reuse, reproduce, and Share all or a substantial portion of the contents of"
        + " the database for NonCommercial purposes only;\n"
        + "\n"
        + "     b.if You include all or a substantial portion of the database contents in "
        + "a database in which You have Sui Generis Database Rights, then the database in w"
        + "hich You have Sui Generis Database Rights (but not its individual contents) is A"
        + "dapted Material; and\n"
        + "\n"
        + "     c.You must comply with the conditions in Section 3(a) if You Share all or "
        + "a substantial portion of the contents of the database.\n"
        + "For the avoidance of doubt, this Section 4 supplements and does not replace Your"
        + " obligations under this Public License where the Licensed Rights include other C"
        + "opyright and Similar Rights.\n"
        + "\n"
        + "Section 5 – Disclaimer of Warranties and Limitation of Liability.\n"
        + "\n"
        + "     a.Unless otherwise separately undertaken by the Licensor, to the extent po"
        + "ssible, the Licensor offers the Licensed Material as-is and as-available, and ma"
        + "kes no representations or warranties of any kind concerning the Licensed Materia"
        + "l, whether express, implied, statutory, or other. This includes, without limitat"
        + "ion, warranties of title, merchantability, fitness for a particular purpose, non"
        + "-infringement, absence of latent or other defects, accuracy, or the presence or "
        + "absence of errors, whether or not known or discoverable. Where disclaimers of wa"
        + "rranties are not allowed in full or in part, this disclaimer may not apply to Yo"
        + "u.\n"
        + "\n"
        + "     b.To the extent possible, in no event will the Licensor be liable to You o"
        + "n any legal theory (including, without limitation, negligence) or otherwise for "
        + "any direct, special, indirect, incidental, consequential, punitive, exemplary, o"
        + "r other losses, costs, expenses, or damages arising out of this Public License o"
        + "r use of the Licensed Material, even if the Licensor has been advised of the pos"
        + "sibility of such losses, costs, expenses, or damages. Where a limitation of liab"
        + "ility is not allowed in full or in part, this limitation may not apply to You.\n"
        + "\n"
        + "     c.The disclaimer of warranties and limitation of liability provided above "
        + "shall be interpreted in a manner that, to the extent possible, most closely appr"
        + "oximates an absolute disclaimer and waiver of all liability.\n"
        + "\n"
        + "Section 6 – Term and Termination.\n"
        + "\n"
        + "     a.This Public License applies for the term of the Copyright and Similar Ri"
        + "ghts licensed here. However, if You fail to comply with this Public License, the"
        + "n Your rights under this Public License terminate automatically.\n"
        + "\n"
        + "     b.Where Your right to use the Licensed Material has terminated under Secti"
        + "on 6(a), it reinstates:\n"
        + "\n"
        + "          1. automatically as of the date the violation is cured, provided it is"
        + " cured within 30 days of Your discovery of the violation; or\n"
        + "\n"
        + "          2. upon express reinstatement by the Licensor.\n"
        + "\n"
        + "     c.For the avoidance of doubt, this Section 6(b) does not affect any right "
        + "the Licensor may have to seek remedies for Your violations of this Public Licens"
        + "e.\n"
        + "\n"
        + "     d.For the avoidance of doubt, the Licensor may also offer the Licensed Mat"
        + "erial under separate terms or conditions or stop distributing the Licensed Mater"
        + "ial at any time; however, doing so will not terminate this Public License.\n"
        + "\n"
        + "     e.Sections 1, 5, 6, 7, and 8 survive termination of this Public License.\n"
        + "\n"
        + "Section 7 – Other Terms and Conditions.\n"
        + "\n"
        + "     a.The Licensor shall not be bound by any additional or different terms or "
        + "conditions communicated by You unless expressly agreed.\n"
        + "\n"
        + "     b.Any arrangements, understandings, or agreements regarding the Licensed M"
        + "aterial not stated herein are separate from and independent of the terms and con"
        + "ditions of this Public License.\n"
        + "\n"
        + "Section 8 – Interpretation.\n"
        + "\n"
        + "     a.For the avoidance of doubt, this Public License does not, and shall not "
        + "be interpreted to, reduce, limit, restrict, or impose conditions on any use of t"
        + "he Licensed Material that could lawfully be made without permission under this P"
        + "ublic License.\n"
        + "\n"
        + "     b.To the extent possible, if any provision of this Public License is deeme"
        + "d unenforceable, it shall be automatically reformed to the minimum extent necess"
        + "ary to make it enforceable. If the provision cannot be reformed, it shall be sev"
        + "ered from this Public License without affecting the enforceability of the remain"
        + "ing terms and conditions.\n"
        + "\n"
        + "     c.No term or condition of this Public License will be waived and no failur"
        + "e to comply consented to unless expressly agreed to by the Licensor.\n"
        + "\n"
        + "     d.Nothing in this Public License constitutes or may be interpreted as a li"
        + "mitation upon, or waiver of, any privileges and immunities that apply to the Lic"
        + "ensor or You, including from the legal processes of any jurisdiction or authorit"
        + "y.\n"
        + "\n"
        + "Creative Commons is not a party to its public licenses. Notwithstanding, Creativ"
        + "e Commons may elect to apply one of its public licenses to material it publishes"
        + " and in those instances will be considered the “Licensor.” Except for the limite"
        + "d purpose of indicating that material is shared under a Creative Commons public "
        + "license or as otherwise permitted by the Creative Commons policies published at "
        + "creativecommons.org/policies, Creative Commons does not authorize the use of the"
        + " trademark “Creative Commons” or any other trademark or logo of Creative Commons"
        + " without its prior written consent including, without limitation, in connection "
        + "with any unauthorized modifications to any of its public licenses or any other a"
        + "rrangements, understandings, or agreements concerning use of licensed material. "
        + "For the avoidance of doubt, this paragraph does not form part of the public lice"
        + "nses.  Creative Commons may be contacted at creativecommons.org.\n"
; // the license text
    }
 
    
}
