package provenance.trigger.licenses;


import provenance.TriggerType;
import java.io.File;
import provenance.Trigger;
import provenance.TriggerData;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-04-06T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: MIT.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Given a text file, try to identify portions of text
 *  that allows us to distinguish if the file is covered under a specific 
 *  license and which version is applicable when possible.</text> 
 */


/**
 *
 * @author Nuno Brito, 6th of April 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class MIT implements Trigger {
    
    // the list of id's that we can use to identify a license
    final String[] list = {
        "MIT license",
        "Permission is hereby granted, free of charge, to any person obtaining",
        "and associated documentation files",
        " MIT-",
        "Licensed MIT ",
        "License: MIT",
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
        return "MIT";
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
        return "MIT detection";
    }

    @Override
    public String getResultSPDX() {
        return LicenseInfoInFile + getShortIdentifier();
    }
    
    @Override
    public String getTriggerTitle() {
        return "MIT";
    }
      
    @Override
    public TriggerData getResult(){
        return result;
    }
}