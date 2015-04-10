/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-04-10T13:31:01Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Output a list of licenses in JSON format </text> 
 */

package provenance.javascript;

import license.License;
import license.terms.LicenseList;
import main.engine;

/**
 *
 * @author Nuno Brito, 10th of April 2015 in Pirna, Germany
 */
public class OutputLicenseList {
  
    public static void main(String[] args){
        
        String output = "[";
        
        for(License license : engine.licenses.getList()){
            output += "{\"name\": \""
                    + license.getTitle()
                    + "\", "
                    + "\"shortname\": \""
                    + license.getId()
                    + "\"},\n";
            
        }
        
        output += "]";
        
        System.out.println(output);
    }
    
}
