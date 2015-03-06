package provenance.trigger.licenses;


import provenance.TriggerType;
import java.io.File;
import provenance.Trigger;
import provenance.TriggerData;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-10-16T19:44:00Z
 * LicenseName: AGPL-3.0+
 * FileName: Artistic.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Tries to identify licenses based on their SPDX-id's
 *   </text> 
 */


/**
 *
 * @author Nuno Brito, 16th of October 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class Artistic implements Trigger {
    
    // the list of id's that we can use to identify a license
    String[] list = {
        "Artistic 2.0",
        "Artistic-2.0"
    };
    
    private final TriggerData result = new TriggerData();
    
    /**
     * Verifies if the provided text applies to the triggers that
     * included on this license.
     * @param text Text to be analysed
     * @return 
     */
    @Override
    public Boolean isApplicable(final String text, final String textLowerCase){
        // iterate all our ids
        for(String id : list){
            if(text.contains(id)){
                result.add(getShortIdentifier());
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean isApplicable(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getShortIdentifier() {
        return "Artistic-2.0";
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
        return TriggerType.LICENSE;
    }

    @Override
    public String getFullName() {
        return "Artistic-2.0";
    }

    @Override
    public String getResultSPDX() {
        return LicenseInfoInFile + getShortIdentifier();
    }
    
    @Override
    public String getTriggerTitle() {
        return "Artistic-2.0";
    }
    
    @Override
    public TriggerData getResult(){
        return result;
    }
}