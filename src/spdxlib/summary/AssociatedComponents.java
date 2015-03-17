/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-17T14:39:14Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Lists the components associated to files.</text> 
 */

package spdxlib.summary;

import comp.Component;
import java.util.ArrayList;
import java.util.HashMap;
import main.engine;
import spdxlib.FileInfo;
import spdxlib.SPDXfile;


/**
 *
 * @author Nuno Brito, 17th of March 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class AssociatedComponents {

    private final SPDXfile spdx;
    final Component uncategorized;
    
    public AssociatedComponents(SPDXfile input){
        // get the input
        spdx = input;
        // create the default component
        uncategorized = new Component();
        uncategorized.setDescription("Files not associated to a component");
        uncategorized.setId("Uncategorized");
    }
    
    /**
     * Goes through all the file nodes on this document to output a list
     * of components and respective files
     * @return 
     */
    public ArrayList<Component> getComponents(){
        // the output
        HashMap<String, Component> list = new HashMap();
        // add the uncategorized group
        list.put("uncategorized", uncategorized);
        
        
        // iterate the available files
        for(FileInfo fileInfo : spdx.getFiles()){
            // get the associated component
            final String comp = fileInfo.getFileComponent();
            // when empty, add to uncategorized list
            if(comp == null){
                list.get("uncategorized").getAssociatedFiles().add(fileInfo);
                continue; 
            }else
            
            // was this component already added before?
            if(list.containsKey(comp)){
                // then just add this file and proceed to the next one
                list.get(comp).getAssociatedFiles().add(fileInfo);
                continue;
            }
            
            // first time component and is not an empty string
            Component component = engine.components.get(comp);
            // we have a component mentioned, but can't find its info
            if(component == null){
                // create a new component
                component = new Component();
                component.setId(comp);
            }
            
            // add the file
            component.getAssociatedFiles().add(fileInfo);
            // if reached this point, it means we can add this component on list
            list.put(comp, component);
            
        }
        
        
        ArrayList<Component> result = new ArrayList();
        result.addAll(list.values());
        // all done
        return result;
    }
    
    
    
    
}


