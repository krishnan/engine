/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T13:29:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Template to use as base for outputs </text> 
 */
package provenance.output;

import provenance.LicenseFinder;

/**
 *
 * @author Nuno Brito, 2nd of March 2015 in Darmstadt, Germany
 */
public abstract class TemplateOutput {
    
    final protected LicenseFinder licenseFinder;
    
    public TemplateOutput(LicenseFinder licenseFinder){
        this.licenseFinder = licenseFinder;
    }
    
    public abstract void getOutput();
}
