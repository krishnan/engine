package license.terms.SPDXLL;

import license.License;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: nuno
 * Created: 2015-03-02T19:15:59Z
 * LicenseName: AGPL-3.0+
 * FileName: AMDPLPA.java 
 * FileCategory: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2015, nuno </text>
 */


public class AMDPLPA extends License{
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
        return "AMDPLPA"; // short and unique id
    }
    
    /**
     * What is the full title for this license?
     * @return  The official full title of the license
     */
    @Override
    public String getTitle(){
        return "AMD's plpa_map.c License"; // full text title
    }
    
    /**
     * In most cases, the license will have generic terms that only present
     * minor changes such as copyright attributions. This method provides
     * an idea of the contents of the license.
     * @return  Normal text (no markup) version of the license terms
     */
    @Override
    public String getTerms(){
        return "All rights reserved.\n"
        + "\n"
        + "Redistribution and use in any form of this material and any product thereof incl"
        + "uding software in source or binary forms, along with any related documentation, "
        + "with or without modification (\"this material\"), is permitted provided that the f"
        + "ollowing conditions are met:\n"
        + "\n"
        + "     Redistributions of source code of any software must retain the above copyri"
        + "ght notice and all terms of this license as part of the code.\n"
        + "\n"
        + "     Redistributions in binary form of any software must reproduce the above cop"
        + "yright notice and all terms of this license in any related documentation and/or "
        + "other materials.\n"
        + "\n"
        + "     Neither the names nor trademarks of Advanced Micro Devices, Inc. or any cop"
        + "yright holders or contributors may be used to endorse or promote products derive"
        + "d from this material without specific prior written permission.\n"
        + "\n"
        + "     Notice about U.S. Government restricted rights: This material is provided w"
        + "ith \"RESTRICTED RIGHTS.\" Use, duplication or disclosure by the U.S. Government i"
        + "s subject to the full extent of restrictions set forth in FAR52.227 and DFARS252"
        + ".227 et seq., or any successor or applicable regulations. Use of this material b"
        + "y the U.S. Government constitutes acknowledgment of the proprietary rights of Ad"
        + "vanced Micro Devices, Inc. and any copyright holders and contributors.\n"
        + "\n"
        + "     ANY BREACH OF ANY TERM OF THIS LICENSE SHALL RESULT IN THE IMMEDIATE REVOCA"
        + "TION OF ALL RIGHTS TO REDISTRIBUTE, ACCESS OR USE THIS MATERIAL.\n"
        + "\n"
        + "THIS MATERIAL IS PROVIDED BY ADVANCED MICRO DEVICES, INC. AND ANY COPYRIGHT HOLD"
        + "ERS AND CONTRIBUTORS \"AS IS\" IN ITS CURRENT CONDITION AND WITHOUT ANY REPRESENTA"
        + "TIONS, GUARANTEE, OR WARRANTY OF ANY KIND OR IN ANY WAY RELATED TO SUPPORT, INDE"
        + "MNITY, ERROR FREE OR UNINTERRUPTED OPERATION, OR THAT IT IS FREE FROM DEFECTS OR"
        + " VIRUSES. ALL OBLIGATIONS ARE HEREBY DISCLAIMED - WHETHER EXPRESS, IMPLIED, OR S"
        + "TATUTORY - INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OF TITLE, MERCH"
        + "ANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, ACCURACY, COMPLETENESS, OPERABILIT"
        + "Y, QUALITY OF SERVICE, OR NON-INFRINGEMENT. IN NO EVENT SHALL ADVANCED MICRO DEV"
        + "ICES, INC. OR ANY COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, IN"
        + "DIRECT, INCIDENTAL, SPECIAL, PUNITIVE, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCL"
        + "UDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF "
        + "USE, REVENUE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED OR BASE"
        + "D ON ANY THEORY OF LIABILITY ARISING IN ANY WAY RELATED TO THIS MATERIAL, EVEN I"
        + "F ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THE ENTIRE AND AGGREGATE LIABILITY "
        + "OF ADVANCED MICRO DEVICES, INC. AND ANY COPYRIGHT HOLDERS AND CONTRIBUTORS SHALL"
        + " NOT EXCEED TEN DOLLARS (US $10.00). ANYONE REDISTRIBUTING OR ACCESSING OR USING"
        + " THIS MATERIAL ACCEPTS THIS ALLOCATION OF RISK AND AGREES TO RELEASE ADVANCED MI"
        + "CRO DEVICES, INC. AND ANY COPYRIGHT HOLDERS AND CONTRIBUTORS FROM ANY AND ALL LI"
        + "ABILITIES, OBLIGATIONS, CLAIMS, OR DEMANDS IN EXCESS OF TEN DOLLARS (US $10.00)."
        + " THE FOREGOING ARE ESSENTIAL TERMS OF THIS LICENSE AND, IF ANY OF THESE TERMS AR"
        + "E CONSTRUED AS UNENFORCEABLE, FAIL IN ESSENTIAL PURPOSE, OR BECOME VOID OR DETRI"
        + "MENTAL TO ADVANCED MICRO DEVICES, INC. OR ANY COPYRIGHT HOLDERS OR CONTRIBUTORS "
        + "FOR ANY REASON, THEN ALL RIGHTS TO REDISTRIBUTE, ACCESS OR USE THIS MATERIAL SHA"
        + "LL TERMINATE IMMEDIATELY. MOREOVER, THE FOREGOING SHALL SURVIVE ANY EXPIRATION O"
        + "R TERMINATION OF THIS LICENSE OR ANY AGREEMENT OR ACCESS OR USE RELATED TO THIS "
        + "MATERIAL.\n"
        + "\n"
        + "NOTICE IS HEREBY PROVIDED, AND BY REDISTRIBUTING OR ACCESSING OR USING THIS MATE"
        + "RIAL SUCH NOTICE IS ACKNOWLEDGED, THAT THIS MATERIAL MAY BE SUBJECT TO RESTRICTI"
        + "ONS UNDER THE LAWS AND REGULATIONS OF THE UNITED STATES OR OTHER COUNTRIES, WHIC"
        + "H INCLUDE BUT ARE NOT LIMITED TO, U.S. EXPORT CONTROL LAWS SUCH AS THE EXPORT AD"
        + "MINISTRATION REGULATIONS AND NATIONAL SECURITY CONTROLS AS DEFINED THEREUNDER, A"
        + "S WELL AS STATE DEPARTMENT CONTROLS UNDER THE U.S. MUNITIONS LIST. THIS MATERIAL"
        + " MAY NOT BE USED, RELEASED, TRANSFERRED, IMPORTED, EXPORTED AND/OR RE- EXPORTED "
        + "IN ANY MANNER PROHIBITED UNDER ANY APPLICABLE LAWS, INCLUDING U.S. EXPORT CONTRO"
        + "L LAWS REGARDING SPECIFICALLY DESIGNATED PERSONS, COUNTRIES AND NATIONALS OF COU"
        + "NTRIES SUBJECT TO NATIONAL SECURITY CONTROLS. MOREOVER, THE FOREGOING SHALL SURV"
        + "IVE ANY EXPIRATION OR TERMINATION OF ANY LICENSE OR AGREEMENT OR ACCESS OR USE R"
        + "ELATED TO THIS MATERIAL.\n"
        + "\n"
        + "This license forms the entire agreement regarding the subject matter hereof and "
        + "supersedes all proposals and prior discussions and writings between the parties "
        + "with respect thereto. This license does not affect any ownership, rights, title,"
        + " or interest in, or relating to, this material. No terms of this license can be "
        + "modified or waived, and no breach of this license can be excused, unless done so"
        + " in a writing signed by all affected parties. Each term of this license is separ"
        + "ately enforceable. If any term of this license is determined to be or becomes un"
        + "enforceable or illegal, such term shall be reformed to the minimum extent necess"
        + "ary in order for this license to remain in effect in accordance with its terms a"
        + "s modified by such reformation. This license shall be governed by and construed "
        + "in accordance with the laws of the State of Texas without regard to rules on con"
        + "flicts of law of any state or jurisdiction or the United Nations Convention on t"
        + "he International Sale of Goods. All disputes arising out of this license shall b"
        + "e subject to the jurisdiction of the federal and state courts in Austin, Texas, "
        + "and all defenses are hereby waived concerning personal jurisdiction and venue of"
        + " these courts.\n"
; // the license text
    }
 
    
}
