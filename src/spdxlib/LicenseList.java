/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-23T19:44:48Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LicenseList.java
 * FileOrigin: Auto-Generated
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> This list is used as template by the class file
    GenerateLicenseList.java to generate a compilable list of licenses</text> 
 */

package spdxlib;

import java.util.ArrayList;

/**
 *
 * @author Nuno Brito, 23rd of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class LicenseList {
    
    // complete list with the recognized extensions
    private final ArrayList<License> list = new ArrayList();
    
    
    public LicenseList(){
	list.add(new custom.LGPL());
	list.add(new custom.Proprietary());
	list.add(new custom.PublicDomain());
	list.add(new SPDXLL.AAL());
	list.add(new SPDXLL.AFL_1_1());
	list.add(new SPDXLL.AFL_1_2());
	list.add(new SPDXLL.AFL_2_0());
	list.add(new SPDXLL.AFL_2_1());
	list.add(new SPDXLL.AFL_3_0());
	list.add(new SPDXLL.AGPL_1_0());
	list.add(new SPDXLL.AGPL_3_0());
	list.add(new SPDXLL.Aladdin());
	list.add(new SPDXLL.ANTLR_PD());
	list.add(new SPDXLL.Apache_1_0());
	list.add(new SPDXLL.Apache_1_1());
	list.add(new SPDXLL.Apache_2_0());
	list.add(new SPDXLL.APL_1_0());
	list.add(new SPDXLL.APSL_1_0());
	list.add(new SPDXLL.APSL_1_1());
	list.add(new SPDXLL.APSL_1_2());
	list.add(new SPDXLL.Artistic_1_0());
	list.add(new SPDXLL.Artistic_1_0_cl8());
	list.add(new SPDXLL.Artistic_1_0_Perl());
	list.add(new SPDXLL.Artistic_2_0());
	list.add(new SPDXLL.BitTorrent_1_0());
	list.add(new SPDXLL.BitTorrent_1_1());
	list.add(new SPDXLL.BSD_2_Clause());
	list.add(new SPDXLL.BSD_2_Clause_FreeBSD());
	list.add(new SPDXLL.BSD_2_Clause_NetBSD());
	list.add(new SPDXLL.BSD_3_Clause());
	list.add(new SPDXLL.BSD_3_Clause_Clear());
	list.add(new SPDXLL.BSD_4_Clause());
	list.add(new SPDXLL.BSD_4_Clause_UC());
	list.add(new SPDXLL.BSL_1_0());
	list.add(new SPDXLL.CATOSL_1_1());
	list.add(new SPDXLL.CC0_1_0());
	list.add(new SPDXLL.CC_BY_2_0());
	list.add(new SPDXLL.CC_BY_2_5());
	list.add(new SPDXLL.CC_BY_3_0());
	list.add(new SPDXLL.CC_BY_NC_1_0());
	list.add(new SPDXLL.CC_BY_NC_2_0());
	list.add(new SPDXLL.CC_BY_NC_2_5());
	list.add(new SPDXLL.CC_BY_NC_3_0());
	list.add(new SPDXLL.CC_BY_NC_ND_1_0());
	list.add(new SPDXLL.CC_BY_NC_ND_2_0());
	list.add(new SPDXLL.CC_BY_NC_ND_2_5());
	list.add(new SPDXLL.CC_BY_NC_ND_3_0());
	list.add(new SPDXLL.CC_BY_NC_SA_1_0());
	list.add(new SPDXLL.CC_BY_NC_SA_2_0());
	list.add(new SPDXLL.CC_BY_NC_SA_2_5());
	list.add(new SPDXLL.CC_BY_NC_SA_3_0());
	list.add(new SPDXLL.CC_BY_ND_1_0());
	list.add(new SPDXLL.CC_BY_ND_2_5());
	list.add(new SPDXLL.CC_BY_ND_3_0());
	list.add(new SPDXLL.CC_BY_SA_1_0());
	list.add(new SPDXLL.CC_BY_SA_2_0());
	list.add(new SPDXLL.CC_BY_SA_2_5());
	list.add(new SPDXLL.CC_BY_SA_3_0());
	list.add(new SPDXLL.CDDL_1_0());
	list.add(new SPDXLL.CDDL_1_1());
	list.add(new SPDXLL.CECILL_1_0());
	list.add(new SPDXLL.CECILL_1_1());
	list.add(new SPDXLL.CECILL_2_0());
	list.add(new SPDXLL.CECILL_B());
	list.add(new SPDXLL.CECILL_C());
	list.add(new SPDXLL.ClArtistic());
	list.add(new SPDXLL.CNRI_Python());
	list.add(new SPDXLL.CNRI_Python_GPL_Compatible());
	list.add(new SPDXLL.Condor_1_1());
	list.add(new SPDXLL.APSL_2_0());
	list.add(new SPDXLL.CC_BY_1_0());
	list.add(new SPDXLL.CC_BY_ND_2_0());
	list.add(new SPDXLL.CPAL_1_0());
	list.add(new SPDXLL.FTL());
	list.add(new SPDXLL.HPND());
	list.add(new SPDXLL.LPPL_1_1());
	list.add(new SPDXLL.Nokia());
	list.add(new SPDXLL.OLDAP_2_2());
	list.add(new SPDXLL.Python_2_0());
	list.add(new SPDXLL.CPL_1_0());
	list.add(new SPDXLL.CPOL_1_02());
	list.add(new SPDXLL.CUA_OPL_1_0());
	list.add(new SPDXLL.D_FSL_1_0());
	list.add(new SPDXLL.ECL_1_0());
	list.add(new SPDXLL.ECL_2_0());
	list.add(new SPDXLL.eCos_2_0());
	list.add(new SPDXLL.EFL_1_0());
	list.add(new SPDXLL.EFL_2_0());
	list.add(new SPDXLL.Entessa());
	list.add(new SPDXLL.EPL_1_0());
	list.add(new SPDXLL.ErlPL_1_1());
	list.add(new SPDXLL.EUDatagrid());
	list.add(new SPDXLL.EUPL_1_0());
	list.add(new SPDXLL.EUPL_1_1());
	list.add(new SPDXLL.Fair());
	list.add(new SPDXLL.Frameworx_1_0());
	list.add(new SPDXLL.GFDL_1_1());
	list.add(new SPDXLL.GFDL_1_2());
	list.add(new SPDXLL.GFDL_1_3());
	list.add(new SPDXLL.GPL_1_0());
	list.add(new SPDXLL.GPL_1_0_plus());
	list.add(new SPDXLL.GPL_2_0());
	list.add(new SPDXLL.GPL_2_0_plus());
	list.add(new SPDXLL.GPL_2_0_with_autoconf_exception());
	list.add(new SPDXLL.GPL_2_0_with_bison_exception());
	list.add(new SPDXLL.GPL_2_0_with_classpath_exception());
	list.add(new SPDXLL.GPL_2_0_with_font_exception());
	list.add(new SPDXLL.GPL_2_0_with_GCC_exception());
	list.add(new SPDXLL.GPL_3_0());
	list.add(new SPDXLL.GPL_3_0_plus());
	list.add(new SPDXLL.GPL_3_0_with_autoconf_exception());
	list.add(new SPDXLL.GPL_3_0_with_GCC_exception());
	list.add(new SPDXLL.gSOAP_1_3b());
	list.add(new SPDXLL.IBM_pibs());
	list.add(new SPDXLL.IJG());
	list.add(new SPDXLL.Imlib2());
	list.add(new SPDXLL.Intel());
	list.add(new SPDXLL.IPA());
	list.add(new SPDXLL.IPL_1_0());
	list.add(new SPDXLL.ISC());
	list.add(new SPDXLL.JSON());
	list.add(new SPDXLL.LGPL_2_0());
	list.add(new SPDXLL.LGPL_2_0_plus());
	list.add(new SPDXLL.LGPL_2_1());
	list.add(new SPDXLL.LGPL_2_1_plus());
	list.add(new SPDXLL.LGPL_3_0());
	list.add(new SPDXLL.LGPL_3_0_plus());
	list.add(new SPDXLL.Libpng());
	list.add(new SPDXLL.LPL_1_0());
	list.add(new SPDXLL.LPL_1_02());
	list.add(new SPDXLL.LPPL_1_0());
	list.add(new SPDXLL.LPPL_1_2());
	list.add(new SPDXLL.LPPL_1_3a());
	list.add(new SPDXLL.LPPL_1_3c());
	list.add(new SPDXLL.MirOS());
	list.add(new SPDXLL.MIT());
	list.add(new SPDXLL.Motosoto());
	list.add(new SPDXLL.MPL_1_0());
	list.add(new SPDXLL.MPL_1_1());
	list.add(new SPDXLL.MPL_2_0());
	list.add(new SPDXLL.MPL_2_0_no_copyleft_exception());
	list.add(new SPDXLL.MS_PL());
	list.add(new SPDXLL.MS_RL());
	list.add(new SPDXLL.Multics());
	list.add(new SPDXLL.NASA_1_3());
	list.add(new SPDXLL.Naumen());
	list.add(new SPDXLL.NBPL_1_0());
	list.add(new SPDXLL.NCSA());
	list.add(new SPDXLL.NGPL());
	list.add(new SPDXLL.NOSL());
	list.add(new SPDXLL.NPL_1_0());
	list.add(new SPDXLL.NPL_1_1());
	list.add(new SPDXLL.NPOSL_3_0());
	list.add(new SPDXLL.NTP());
	list.add(new SPDXLL.OCLC_2_0());
	list.add(new SPDXLL.ODbL_1_0());
	list.add(new SPDXLL.OFL_1_0());
	list.add(new SPDXLL.OFL_1_1());
	list.add(new SPDXLL.OGTSL());
	list.add(new SPDXLL.OLDAP_1_1());
	list.add(new SPDXLL.OLDAP_1_2());
	list.add(new SPDXLL.OLDAP_1_3());
	list.add(new SPDXLL.OLDAP_1_4());
	list.add(new SPDXLL.OLDAP_2_0());
	list.add(new SPDXLL.OLDAP_2_0_1());
	list.add(new SPDXLL.OLDAP_2_1());
	list.add(new SPDXLL.OLDAP_2_2_1());
	list.add(new SPDXLL.OLDAP_2_2_2());
	list.add(new SPDXLL.OLDAP_2_3());
	list.add(new SPDXLL.OLDAP_2_4());
	list.add(new SPDXLL.OLDAP_2_5());
	list.add(new SPDXLL.OLDAP_2_6());
	list.add(new SPDXLL.OLDAP_2_7());
	list.add(new SPDXLL.OLDAP_2_8());
	list.add(new SPDXLL.OpenSSL());
	list.add(new SPDXLL.OPL_1_0());
	list.add(new SPDXLL.OSL_1_0());
	list.add(new SPDXLL.OSL_2_0());
	list.add(new SPDXLL.OSL_2_1());
	list.add(new SPDXLL.OSL_3_0());
	list.add(new SPDXLL.PDDL_1_0());
	list.add(new SPDXLL.PHP_3_0());
	list.add(new SPDXLL.PHP_3_01());
	list.add(new SPDXLL.PostgreSQL());
	list.add(new SPDXLL.QPL_1_0());
	list.add(new SPDXLL.RHeCos_1_1());
	list.add(new SPDXLL.RPL_1_1());
	list.add(new SPDXLL.RPL_1_5());
	list.add(new SPDXLL.RPSL_1_0());
	list.add(new SPDXLL.RSCPL());
	list.add(new SPDXLL.Ruby());
	list.add(new SPDXLL.SAX_PD());
	list.add(new SPDXLL.SGI_B_1_0());
	list.add(new SPDXLL.SGI_B_1_1());
	list.add(new SPDXLL.SGI_B_2_0());
	list.add(new SPDXLL.SimPL_2_0());
	list.add(new SPDXLL.SISSL());
	list.add(new SPDXLL.SISSL_1_2());
	list.add(new SPDXLL.Sleepycat());
	list.add(new SPDXLL.SMLNJ());
	list.add(new SPDXLL.SPL_1_0());
	list.add(new SPDXLL.SugarCRM_1_1_3());
	list.add(new SPDXLL.Unlicense());
	list.add(new SPDXLL.VSL_1_0());
	list.add(new SPDXLL.W3C());
	list.add(new SPDXLL.Watcom_1_0());
	list.add(new SPDXLL.WTFPL());
	list.add(new SPDXLL.WXwindows());
	list.add(new SPDXLL.X11());
	list.add(new SPDXLL.XFree86_1_1());
	list.add(new SPDXLL.Xnet());
	list.add(new SPDXLL.YPL_1_0());
	list.add(new SPDXLL.YPL_1_1());
	list.add(new SPDXLL.Zimbra_1_3());
	list.add(new SPDXLL.Zlib());
	list.add(new SPDXLL.ZPL_1_1());
	list.add(new SPDXLL.ZPL_2_0());
	list.add(new SPDXLL.ZPL_2_1());

    }
    
    /**
     * Gives back the list with our list of extensions pre-processed.
     * @return An array with the accepted File Extension objects
     */
    public ArrayList<License> getList(){
        return list;
    }
    
}
