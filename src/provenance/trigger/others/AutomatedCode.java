package provenance.trigger.others;


import provenance.TriggerType;
import java.io.File;
import provenance.Trigger;
import provenance.TriggerData;
import spdxlib.FileOrigin;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-13T18:45:11Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: AutomatedCode.java  
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Try to identify source code that was automatically
    generated. To avoid false positives we focus on known-types of source
    codes with headers that we can identify.

    When adding a trigger, please add a web link to the auto-generated source
    code file so that we can see it in practice. Thanks. 
 * </text> 
 */


/**
 *
 * @author Nuno Brito, 13th of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class AutomatedCode implements Trigger {
   
    // C sharp code-style, found on Microsoft sources
    // example: https://github.com/dotnet/corefx/blob/master/src/System.Xml.XmlDocument/src/Resources/Strings.Designer.cs
    String csharp = "this code was generated by a tool";
    
    private final TriggerData result = new TriggerData();
    
    /**
     * Verifies if the provided text applies to the triggers that
     * included on this license.
     * @param text Text to be analysed
     * @return 
     */
    @Override
    public Boolean isApplicable(String text, String textLowerCase){
        // we don't need to compare against the whole text, should be in the header
        String snippetCSharp;
        if(textLowerCase.length() > 150){
            snippetCSharp = textLowerCase.substring(0, 150);
        }else{
            snippetCSharp = textLowerCase;
        }
        
        // so, is it here?
        if(snippetCSharp.contains(csharp)){
            return true;
        }
        // nothing found.
        return false;
    }

    @Override
    public Boolean isApplicable(File file) {
        return false;
    }

    @Override
    public String getShortIdentifier() {
        return "Auto-generated code";
    }

    @Override
    public Boolean supportsBinaries() {
        return false;
    }

    @Override
    public Boolean supportsTextFiles() {
        return true;
    }

    @Override
    public TriggerType getType(){
        return TriggerType.AUTO_GENERATED;
    }

    @Override
    public String getFullName() {
        return "Auto-generated code";
    }

    @Override
    public String getResultSPDX() {
        return FileOriginInFile + FileOrigin.AUTOGENERATED.toString();
    }
    
    @Override
    public String getTriggerTitle() {
        return "Auto-generated code";
    }
       
    @Override
    public TriggerData getResult(){
        return result;
    }
}