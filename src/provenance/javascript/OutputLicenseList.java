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

import java.io.File;
import license.License;
import main.engine;

/**
 *
 * @author Nuno Brito, 10th of April 2015 in Pirna, Germany
 */
public class OutputLicenseList {
  
    public static void main(String[] args){
        
        String output = ""
                + "// Based on the license list from http://spdx.org/licenses/\n"
                + "// Generated on "
                + utils.time.getDateTimeISO()
                + " with " + engine.licenses.getList().size() + " licenses"
                + "\n"
                + "// You can ask for updates at http://github.com/triplecheck\n"
                + "\n"
                + "var licenseList =[\n";
        
        for(License license : engine.licenses.getList()){
            
            final String title = license.getTitle().replace("\"", "\\\"");
            
            output += "\t{\"name\": \""
                    + title
                    + "\", "
                    + "\"shortname\": \""
                    + license.getId()
                    + "\"},\n";
            
        }
        
        // remove the last comma
        output = output.substring(0, output.length()-2);
        
        output += "];";
        
        // output the result to console
        System.out.println(output);
        
        // save the file to disk
        utils.files.SaveStringToFile(new File("licenseList.js"), output);
    }
    
}
