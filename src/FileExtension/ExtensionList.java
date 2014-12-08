/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-12-08T18:21:15Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: ExtensionList.java
 * FileOrigin: Auto-Generated
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> This list is used as template by the class file
    GenerateExtensionList.java to generate a compilable list of extensions</text> 
 */

package FileExtension;

import java.util.ArrayList;

/**
 *
 * @author Nuno Brito, 23rd of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class ExtensionList {
    
    // complete list with the recognized extensions
    private final ArrayList<FileExtension> list = new ArrayList();
    
    
    public ExtensionList(){
	list.add(new archive.bz2());
	list.add(new archive.cab());
	list.add(new archive.deb());
	list.add(new archive.dmg());
	list.add(new archive.gz());
	list.add(new archive.nsi());
	list.add(new archive.rar());
	list.add(new archive.tar());
	list.add(new archive.tgz());
	list.add(new archive.xpi());
	list.add(new archive.zargo());
	list.add(new archive.zip());
	list.add(new binary.a());
	list.add(new binary.bin());
	list.add(new binary.obj());
	list.add(new binary.patch());
	list.add(new binary.res());
	list.add(new config.cfg());
	list.add(new config.conf());
	list.add(new config.cproject());
	list.add(new config.dsp());
	list.add(new config.dsw());
	list.add(new config.gcc());
	list.add(new config.gradle());
	list.add(new config.host());
	list.add(new config.inc());
	list.add(new config.inf());
	list.add(new config.ini());
	list.add(new config.launch());
	list.add(new config.mak());
	list.add(new config.mk());
	list.add(new config.npmignore());
	list.add(new config.plist());
	list.add(new config.prefs());
	list.add(new config.properties());
	list.add(new config.rc());
	list.add(new config.src());
	list.add(new config.yml());
	list.add(new database.csv());
	list.add(new database.json());
	list.add(new database.mdb());
	list.add(new database.sql());
	list.add(new database.tsv());
	list.add(new document.dia());
	list.add(new document.edoc());
	list.add(new document.epub());
	list.add(new document.markdown());
	list.add(new document.odt());
	list.add(new document.pdf());
	list.add(new document.rdoc());
	list.add(new document.rtf());
	list.add(new document.spdx());
	list.add(new document.tex());
	list.add(new executable.dll());
	list.add(new executable.exe());
	list.add(new executable.ocx());
	list.add(new executable.sys());
	list.add(new font.fea());
	list.add(new font.font());
	list.add(new font.glif());
	list.add(new font.ttf());
	list.add(new font.woff());
	list.add(new image.ai());
	list.add(new image.bmp());
	list.add(new image.cur());
	list.add(new image.gif());
	list.add(new image.icns());
	list.add(new image.ico());
	list.add(new image.jpeg());
	list.add(new image.jpg());
	list.add(new image.png());
	list.add(new image.ps());
	list.add(new image.psd());
	list.add(new image.svg());
	list.add(new image.tiff());
	list.add(new image.xcf());
	list.add(new image.xpm());
	list.add(new internet.css());
	list.add(new internet.htm());
	list.add(new internet.html());
	list.add(new legal.ext_author());
	list.add(new legal.ext_authors());
	list.add(new legal.ext_contributors());
	list.add(new legal.ext_copying());
	list.add(new legal.ext_copyright());
	list.add(new legal.ext_legal());
	list.add(new legal.ext_licence());
	list.add(new legal.ext_license());
	list.add(new legal.ext_mit_license());
	list.add(new legal.ext_notice());
	list.add(new media.avi());
	list.add(new media.divx());
	list.add(new media.mid());
	list.add(new media.mov());
	list.add(new media.mp3());
	list.add(new media.mp4());
	list.add(new media.mpeg());
	list.add(new media.mpg());
	list.add(new media.ogg());
	list.add(new media.ogv());
	list.add(new media.swf());
	list.add(new media.wav());
	list.add(new microsoft.chm());
	list.add(new microsoft.doc());
	list.add(new microsoft.docx());
	list.add(new microsoft.hhc());
	list.add(new microsoft.hhk());
	list.add(new microsoft.hhp());
	list.add(new microsoft.pot());
	list.add(new microsoft.ppt());
	list.add(new microsoft.pptx());
	list.add(new microsoft.vsd());
	list.add(new microsoft.xls());
	list.add(new microsoft.xlsx());
	list.add(new other.der());
	list.add(new other.manifest());
	list.add(new other.mf());
	list.add(new schema.dtd());
	list.add(new schema.project());
	list.add(new schema.rdf());
	list.add(new schema.rng());
	list.add(new schema.wsdl());
	list.add(new schema.xml());
	list.add(new schema.xsd());
	list.add(new schema.xsl());
	list.add(new schema.xul());
	list.add(new script.bat());
	list.add(new script.cmd());
	list.add(new script.coffee());
	list.add(new script.emacs.el());
	list.add(new script.emacs.elc());
	list.add(new script.erl());
	list.add(new script.es());
	list.add(new script.js());
	list.add(new script.jsm());
	list.add(new script.less());
	list.add(new script.pl());
	list.add(new script.sh());
	list.add(new script.vbs());
	list.add(new source.abap());
	list.add(new source.asm());
	list.add(new source.basic.bas());
	list.add(new source.basic.vb());
	list.add(new source.coffee());
	list.add(new source.cpp_lang.cc());
	list.add(new source.cpp_lang.cpp());
	list.add(new source.cpp_lang.ext_pch());
	list.add(new source.csharp.cd());
	list.add(new source.csharp.config());
	list.add(new source.csharp.cs());
	list.add(new source.csharp.csproj());
	list.add(new source.csharp.resx());
	list.add(new source.csharp.ruleset());
	list.add(new source.csharp.sln());
	list.add(new source.csharp.userprefs());
	list.add(new source.c_lang.c());
	list.add(new source.c_lang.def());
	list.add(new source.c_lang.h());
	list.add(new source.c_lang.ino());
	list.add(new source.c_lang.makefile());
	list.add(new source.d());
	list.add(new source.delphi.bpk());
	list.add(new source.delphi.dcr());
	list.add(new source.delphi.dcu());
	list.add(new source.delphi.dfm());
	list.add(new source.delphi.dof());
	list.add(new source.delphi.dpk());
	list.add(new source.delphi.dpr());
	list.add(new source.delphi.form());
	list.add(new source.delphi.lfm());
	list.add(new source.delphi.lpi());
	list.add(new source.delphi.lpk());
	list.add(new source.delphi.lpr());
	list.add(new source.delphi.lrs());
	list.add(new source.delphi.pas());
	list.add(new source.delphi.tilpas());
	list.add(new source.go());
	list.add(new source.groovy());
	list.add(new source.hx());
	list.add(new source.java.classpath());
	list.add(new source.java.jar());
	list.add(new source.java.java());
	list.add(new source.java.jsp());
	list.add(new source.lua());
	list.add(new source.matlab.m());
	list.add(new source.matlab.mat());
	list.add(new source.php());
	list.add(new source.py());
	list.add(new source.r());
	list.add(new source.ruby.ext_erb());
	list.add(new source.ruby.ext_gem());
	list.add(new source.ruby.ext_gemfile());
	list.add(new source.ruby.ext_gemspec());
	list.add(new source.ruby.ext_rake());
	list.add(new source.ruby.ext_rakefile());
	list.add(new source.ruby.rb());
	list.add(new source.scale());
	list.add(new specific.ext_about());
	list.add(new specific.ext_announce());
	list.add(new specific.ext_changelog());
	list.add(new specific.ext_changes());
	list.add(new specific.ext_credits());
	list.add(new specific.ext_ds_store());
	list.add(new specific.ext_faq());
	list.add(new specific.ext_hacking());
	list.add(new specific.ext_htaccess());
	list.add(new specific.ext_latest());
	list.add(new specific.ext_lisezmoi());
	list.add(new specific.ext_news());
	list.add(new specific.ext_readme());
	list.add(new specific.ext_release());
	list.add(new specific.ext_release_changes());
	list.add(new specific.ext_release_notes());
	list.add(new specific.ext_release_process());
	list.add(new specific.ext_releasing());
	list.add(new specific.ext_todo());
	list.add(new specific.ext_usage());
	list.add(new text.log());
	list.add(new text.md());
	list.add(new text.txt());
	list.add(new versioning.cvsignore());
	list.add(new versioning.ext_lock());
	list.add(new versioning.git());
	list.add(new versioning.gitattributes());
	list.add(new versioning.gitignore());
	list.add(new versioning.hgignore());
	list.add(new versioning.hgsub());
	list.add(new versioning.hgsubstate());
	list.add(new versioning.hgtags());
	list.add(new versioning.svnignore());
	list.add(new versioning.svn_base());

    }
    
    /**
     * Gives back the list with our list of extensions pre-processed.
     * @return An array with the accepted File Extension objects
     */
    public ArrayList<FileExtension> getList(){
        return list;
    }
    
}
