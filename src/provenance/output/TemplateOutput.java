/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T13:29:01Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileCopyrightText: <text> Template to use as base for outputs </text> 
 */
package provenance.output;

import provenance.ProvenanceFinder;

/**
 *
 * @author Nuno Brito, 2nd of March 2015 in Darmstadt, Germany
 */
public abstract class TemplateOutput {
    
    final protected ProvenanceFinder licenseFinder;
    
    public TemplateOutput(ProvenanceFinder licenseFinder){
        this.licenseFinder = licenseFinder;
    }
    
    public abstract void getOutput();
}
