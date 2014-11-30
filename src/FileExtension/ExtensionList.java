/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-30T15:16:44Z
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
	list.add(new archive.gz());
	list.add(new archive.jar());
	list.add(new archive.tar());
	list.add(new archive.zip());
	list.add(new binary.a());
	list.add(new binary.bin());
	list.add(new binary.chm());
	list.add(new binary.dcr());
	list.add(new binary.dcu());
	list.add(new binary.dll());
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
	list.add(new config.prefs());
	list.add(new config.properties());
	list.add(new config.rc());
	list.add(new config.src());
	list.add(new config.yml());
	list.add(new database.csv());
	list.add(new database.json());
	list.add(new database.sql());
	list.add(new document.doc());
	list.add(new document.odt());
	list.add(new document.pdf());
	list.add(new document.rtf());
	list.add(new document.spdx());
	list.add(new document.tex());
	list.add(new executable.exe());
	list.add(new font.ttf());
	list.add(new font.woff());
	list.add(new image.ai());
	list.add(new image.bmp());
	list.add(new image.cur());
	list.add(new image.gif());
	list.add(new image.ico());
	list.add(new image.jpeg());
	list.add(new image.jpg());
	list.add(new image.png());
	list.add(new image.ps());
	list.add(new image.psd());
	list.add(new image.svg());
	list.add(new image.xcf());
	list.add(new image.xpm());
	list.add(new internet.css());
	list.add(new internet.htm());
	list.add(new internet.html());
	list.add(new media.avi());
	list.add(new media.mid());
	list.add(new media.swf());
	list.add(new media.wav());
	list.add(new other.apt());
	list.add(new other.bpk());
	list.add(new other.def());
	list.add(new other.der());
	list.add(new other.dfm());
	list.add(new other.dpk());
	list.add(new other.font());
	list.add(new other.hhc());
	list.add(new other.hhk());
	list.add(new other.hhp());
	list.add(new other.jj());
	list.add(new other.lfm());
	list.add(new other.lpi());
	list.add(new other.lpk());
	list.add(new other.lpr());
	list.add(new other.lrs());
	list.add(new other.manifest());
	list.add(new other.mf());
	list.add(new other.nsi());
	list.add(new other.pfx());
	list.add(new other.wxs());
	list.add(new other.xmp());
	list.add(new schema.classpath());
	list.add(new schema.dtd());
	list.add(new schema.project());
	list.add(new schema.rdf());
	list.add(new schema.xml());
	list.add(new schema.xsd());
	list.add(new schema.xsl());
	list.add(new schema.xul());
	list.add(new script.bat());
	list.add(new script.cmd());
	list.add(new script.js());
	list.add(new script.jsm());
	list.add(new script.pl());
	list.add(new script.sh());
	list.add(new script.vbs());
	list.add(new source.abap());
	list.add(new source.asm());
	list.add(new source.c());
	list.add(new source.coffee());
	list.add(new source.cpp.cc());
	list.add(new source.cpp.cppExt());
	list.add(new source.csharp.cd());
	list.add(new source.csharp.config());
	list.add(new source.csharp.cs());
	list.add(new source.csharp.csproj());
	list.add(new source.csharp.resx());
	list.add(new source.csharp.ruleset());
	list.add(new source.csharp.sln());
	list.add(new source.delphi.dof());
	list.add(new source.delphi.dpr());
	list.add(new source.delphi.form());
	list.add(new source.delphi.pas());
	list.add(new source.delphi.tilpas());
	list.add(new source.h());
	list.add(new source.java());
	list.add(new source.jsp());
	list.add(new source.php());
	list.add(new source.py());
	list.add(new source.rb());
	list.add(new text.log());
	list.add(new text.md());
	list.add(new text.txt());
	list.add(new versioning.cvsignore());
	list.add(new versioning.git());
	list.add(new versioning.gitattributes());
	list.add(new versioning.gitignore());
	list.add(new versioning.hgignore());
	list.add(new versioning.hgsub());
	list.add(new versioning.hgsubstate());
	list.add(new versioning.hgtags());
	list.add(new versioning.svnignore());

    }
    
    /**
     * Gives back the list with our list of extensions pre-processed.
     * @return An array with the accepted File Extension objects
     */
    public ArrayList<FileExtension> getList(){
        return list;
    }
    
}
