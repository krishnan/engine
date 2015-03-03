/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-03T11:12:04Z
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
	list.add(new extensions.archive.bz2());
	list.add(new extensions.archive.cab());
	list.add(new extensions.archive.deb());
	list.add(new extensions.archive.dmg());
	list.add(new extensions.archive.gz());
	list.add(new extensions.archive.nsi());
	list.add(new extensions.archive.rar());
	list.add(new extensions.archive.tar());
	list.add(new extensions.archive.tgz());
	list.add(new extensions.archive.xpi());
	list.add(new extensions.archive.zargo());
	list.add(new extensions.archive.zip());
	list.add(new extensions.binary.a());
	list.add(new extensions.binary.bin());
	list.add(new extensions.binary.obj());
	list.add(new extensions.binary.patch());
	list.add(new extensions.binary.res());
	list.add(new extensions.config.cfg());
	list.add(new extensions.config.conf());
	list.add(new extensions.config.cproject());
	list.add(new extensions.config.dsp());
	list.add(new extensions.config.dsw());
	list.add(new extensions.config.gcc());
	list.add(new extensions.config.gradle());
	list.add(new extensions.config.host());
	list.add(new extensions.config.inc());
	list.add(new extensions.config.inf());
	list.add(new extensions.config.ini());
	list.add(new extensions.config.launch());
	list.add(new extensions.config.mak());
	list.add(new extensions.config.mk());
	list.add(new extensions.config.npmignore());
	list.add(new extensions.config.plist());
	list.add(new extensions.config.prefs());
	list.add(new extensions.config.properties());
	list.add(new extensions.config.rc());
	list.add(new extensions.config.src());
	list.add(new extensions.config.yml());
	list.add(new extensions.database.csv());
	list.add(new extensions.database.json());
	list.add(new extensions.database.mdb());
	list.add(new extensions.database.sql());
	list.add(new extensions.database.tsv());
	list.add(new extensions.document.dia());
	list.add(new extensions.document.edoc());
	list.add(new extensions.document.epub());
	list.add(new extensions.document.markdown());
	list.add(new extensions.document.odt());
	list.add(new extensions.document.pdf());
	list.add(new extensions.document.rdoc());
	list.add(new extensions.document.rtf());
	list.add(new extensions.document.spdx());
	list.add(new extensions.document.tex());
	list.add(new extensions.executable.dll());
	list.add(new extensions.executable.exe());
	list.add(new extensions.executable.ocx());
	list.add(new extensions.executable.sys());
	list.add(new extensions.font.fea());
	list.add(new extensions.font.font());
	list.add(new extensions.font.glif());
	list.add(new extensions.font.ttf());
	list.add(new extensions.font.woff());
	list.add(new extensions.image.ai());
	list.add(new extensions.image.bmp());
	list.add(new extensions.image.cur());
	list.add(new extensions.image.gif());
	list.add(new extensions.image.icns());
	list.add(new extensions.image.ico());
	list.add(new extensions.image.jpeg());
	list.add(new extensions.image.jpg());
	list.add(new extensions.image.png());
	list.add(new extensions.image.ps());
	list.add(new extensions.image.psd());
	list.add(new extensions.image.svg());
	list.add(new extensions.image.tiff());
	list.add(new extensions.image.xcf());
	list.add(new extensions.image.xpm());
	list.add(new extensions.internet.css());
	list.add(new extensions.internet.htm());
	list.add(new extensions.internet.html());
	list.add(new extensions.legal.ext_author());
	list.add(new extensions.legal.ext_authors());
	list.add(new extensions.legal.ext_contributors());
	list.add(new extensions.legal.ext_copying());
	list.add(new extensions.legal.ext_copyright());
	list.add(new extensions.legal.ext_legal());
	list.add(new extensions.legal.ext_licence());
	list.add(new extensions.legal.ext_license());
	list.add(new extensions.legal.ext_mit_license());
	list.add(new extensions.legal.ext_notice());
	list.add(new extensions.media.avi());
	list.add(new extensions.media.divx());
	list.add(new extensions.media.mid());
	list.add(new extensions.media.mov());
	list.add(new extensions.media.mp3());
	list.add(new extensions.media.mp4());
	list.add(new extensions.media.mpeg());
	list.add(new extensions.media.mpg());
	list.add(new extensions.media.ogg());
	list.add(new extensions.media.ogv());
	list.add(new extensions.media.swf());
	list.add(new extensions.media.wav());
	list.add(new extensions.microsoft.chm());
	list.add(new extensions.microsoft.doc());
	list.add(new extensions.microsoft.docx());
	list.add(new extensions.microsoft.hhc());
	list.add(new extensions.microsoft.hhk());
	list.add(new extensions.microsoft.hhp());
	list.add(new extensions.microsoft.pot());
	list.add(new extensions.microsoft.ppt());
	list.add(new extensions.microsoft.pptx());
	list.add(new extensions.microsoft.vsd());
	list.add(new extensions.microsoft.xls());
	list.add(new extensions.microsoft.xlsx());
	list.add(new extensions.other.der());
	list.add(new extensions.other.manifest());
	list.add(new extensions.other.mf());
	list.add(new extensions.schema.dtd());
	list.add(new extensions.schema.project());
	list.add(new extensions.schema.rdf());
	list.add(new extensions.schema.rng());
	list.add(new extensions.schema.wsdl());
	list.add(new extensions.schema.xml());
	list.add(new extensions.schema.xsd());
	list.add(new extensions.schema.xsl());
	list.add(new extensions.schema.xul());
	list.add(new extensions.script.bat());
	list.add(new extensions.script.cmd());
	list.add(new extensions.script.coffee());
	list.add(new extensions.script.emacs.el());
	list.add(new extensions.script.emacs.elc());
	list.add(new extensions.script.erl());
	list.add(new extensions.script.es());
	list.add(new extensions.script.js());
	list.add(new extensions.script.jsm());
	list.add(new extensions.script.less());
	list.add(new extensions.script.pl());
	list.add(new extensions.script.sh());
	list.add(new extensions.script.vbs());
	list.add(new extensions.source.abap());
	list.add(new extensions.source.asm());
	list.add(new extensions.source.basic.bas());
	list.add(new extensions.source.basic.vb());
	list.add(new extensions.source.clojure());
	list.add(new extensions.source.coffee());
	list.add(new extensions.source.cpp_lang.cc());
	list.add(new extensions.source.cpp_lang.cpp());
	list.add(new extensions.source.cpp_lang.ext_pch());
	list.add(new extensions.source.cpp_lang.hpp());
	list.add(new extensions.source.csharp.cd());
	list.add(new extensions.source.csharp.config());
	list.add(new extensions.source.csharp.cs());
	list.add(new extensions.source.csharp.csproj());
	list.add(new extensions.source.csharp.resx());
	list.add(new extensions.source.csharp.ruleset());
	list.add(new extensions.source.csharp.sln());
	list.add(new extensions.source.csharp.userprefs());
	list.add(new extensions.source.c_lang.c());
	list.add(new extensions.source.c_lang.def());
	list.add(new extensions.source.c_lang.h());
	list.add(new extensions.source.c_lang.ino());
	list.add(new extensions.source.c_lang.makefile());
	list.add(new extensions.source.d());
	list.add(new extensions.source.delphi.bpk());
	list.add(new extensions.source.delphi.dcr());
	list.add(new extensions.source.delphi.dcu());
	list.add(new extensions.source.delphi.dfm());
	list.add(new extensions.source.delphi.dof());
	list.add(new extensions.source.delphi.dpk());
	list.add(new extensions.source.delphi.dpr());
	list.add(new extensions.source.delphi.form());
	list.add(new extensions.source.delphi.lfm());
	list.add(new extensions.source.delphi.lpi());
	list.add(new extensions.source.delphi.lpk());
	list.add(new extensions.source.delphi.lpr());
	list.add(new extensions.source.delphi.lrs());
	list.add(new extensions.source.delphi.pas());
	list.add(new extensions.source.delphi.tilpas());
	list.add(new extensions.source.go());
	list.add(new extensions.source.groovy());
	list.add(new extensions.source.hx());
	list.add(new extensions.source.java.classpath());
	list.add(new extensions.source.java.jar());
	list.add(new extensions.source.java.java());
	list.add(new extensions.source.java.jsp());
	list.add(new extensions.source.lua());
	list.add(new extensions.source.matlab.m());
	list.add(new extensions.source.matlab.mat());
	list.add(new extensions.source.php());
	list.add(new extensions.source.py());
	list.add(new extensions.source.r());
	list.add(new extensions.source.ruby.ext_erb());
	list.add(new extensions.source.ruby.ext_gem());
	list.add(new extensions.source.ruby.ext_gemfile());
	list.add(new extensions.source.ruby.ext_gemspec());
	list.add(new extensions.source.ruby.ext_rake());
	list.add(new extensions.source.ruby.ext_rakefile());
	list.add(new extensions.source.ruby.rb());
	list.add(new extensions.source.scala());
	list.add(new extensions.specific.ext_about());
	list.add(new extensions.specific.ext_announce());
	list.add(new extensions.specific.ext_changelog());
	list.add(new extensions.specific.ext_changes());
	list.add(new extensions.specific.ext_credits());
	list.add(new extensions.specific.ext_ds_store());
	list.add(new extensions.specific.ext_faq());
	list.add(new extensions.specific.ext_hacking());
	list.add(new extensions.specific.ext_htaccess());
	list.add(new extensions.specific.ext_latest());
	list.add(new extensions.specific.ext_lisezmoi());
	list.add(new extensions.specific.ext_news());
	list.add(new extensions.specific.ext_readme());
	list.add(new extensions.specific.ext_release());
	list.add(new extensions.specific.ext_release_changes());
	list.add(new extensions.specific.ext_release_notes());
	list.add(new extensions.specific.ext_release_process());
	list.add(new extensions.specific.ext_releasing());
	list.add(new extensions.specific.ext_todo());
	list.add(new extensions.specific.ext_usage());
	list.add(new extensions.text.log());
	list.add(new extensions.text.md());
	list.add(new extensions.text.txt());
	list.add(new extensions.versioning.cvsignore());
	list.add(new extensions.versioning.ext_lock());
	list.add(new extensions.versioning.git());
	list.add(new extensions.versioning.gitattributes());
	list.add(new extensions.versioning.gitignore());
	list.add(new extensions.versioning.hgignore());
	list.add(new extensions.versioning.hgsub());
	list.add(new extensions.versioning.hgsubstate());
	list.add(new extensions.versioning.hgtags());
	list.add(new extensions.versioning.svnignore());
	list.add(new extensions.versioning.svn_base());

    }
    
    /**
     * Gives back the list with our list of extensions pre-processed.
     * @return An array with the accepted File Extension objects
     */
    public ArrayList<FileExtension> getList(){
        return list;
    }
    
}
