/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T13:28:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Outputs to the text console the result
    of an analysis </text> 
 */

package provenance.output;

import provenance.FileProvenance;
import provenance.LicenseFinder;

/**
 *
 * @author Nuno Brito, 2nd of March 2015 in Darmstadt, Germany
 */
public class ProvenanceToConsole extends TemplateOutput{

    public ProvenanceToConsole(LicenseFinder licenseFinder) {
        super(licenseFinder);
    }

    @Override
    public void getOutput() {
        // iterate all entries that were processed
        for(FileProvenance fileProvenance : licenseFinder.getResult()){
            // print the file name
            System.out.println(fileProvenance.filename);
            // were any licenses found?
            if(fileProvenance.getLicenses().size() > 0){
                // print the license that was found
                for(String license : fileProvenance.getLicenses()){
                    System.out.println("\t" + license);
                }
            }
        }
    }

}
