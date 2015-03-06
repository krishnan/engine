/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T00:19:01Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileCopyrightText: <text> The place holder for results from trigger detection.</text> 
 */

package provenance;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nuno Brito, 1st of March 2015 in Darmstadt, Germany
 */
public class TriggerData implements Serializable{
    
    private final ArrayList<String> content = new ArrayList();
    
    public void add(final String text){
        content.add(text);
    }

    public ArrayList<String> getData() {
        return content;
    }
    
    
    
}
