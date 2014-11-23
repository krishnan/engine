/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: %templatetime%
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LicenseListTemplate.java
 * FileOrigin: Authored
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> This list is used as template by the class file
    GenerateLicenseList.java to generate a compilable list of licenses</text> 
 */

package generators;

import java.util.ArrayList;
import spdxlib.License;
/**
 *
 * @author Nuno Brito, 23rd of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class LicenseListTemplate {
    
    // complete list with the recognized extensions
    private final ArrayList<License> list = new ArrayList();
    
    
    public LicenseListTemplate(){
//LicenseList
    }
    
    /**
     * Gives back the list with our list of extensions pre-processed.
     * @return An array with the accepted File Extension objects
     */
    public ArrayList<License> getList(){
        return list;
    }
    
}
