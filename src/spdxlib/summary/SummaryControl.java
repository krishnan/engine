/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-06-07T22:53:02Z
 * LicenseName: AGPL-3.0+
 * FileName: SummaryControl.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> The class that controls the othe SPDX related summaries
 * </text> 
 */

package spdxlib.summary;

import spdxlib.SPDXfile;


/**
 *
 * @author Nuno Brito, 7th of June 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class SummaryControl {
        
    private SPDXfile spdx;
    private CompSummary components;

    
    public SummaryControl(SPDXfile spdx){
        this.spdx = spdx;
        components = new CompSummary(spdx);
    }
    
    /**
     * Return the summary of the componentsHTML for a given SPDX
     * @return  An HTML string ready to be displayed to the end-user
     */
    public String componentsHTML(){
        return components.getComponentSummary();
    }
    
    
}
