/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-06-07T22:51:14Z
 * LicenseName: AGPL-3.0+
 * FileName: CompSummary.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Provides a summary about the components that are used
 * inside an SPDX document.</text> 
 */

package spdxlib.summary;

import comp.Component;
import java.util.HashMap;
import java.util.Map;
import main.engine;
import spdxlib.FileInfo;
import spdxlib.FileOrigin;
import spdxlib.SPDXfile;
import utils.www.html;


/**
 *
 * @author Nuno Brito, 7th of June 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class CompSummary {

    private final SPDXfile spdx;
    private final int max = 10;
    
    public CompSummary(SPDXfile input){
        spdx = input;
    }
    
    /**
     * Goes throught all the file nodes on this document and output a list
     * of components and respective files
     * @return  An HTML report ready for end-users
     */
    public String getComponentSummary() {
        String result = "";
        HashMap<String, Integer> components = new HashMap();
        int counterNull = 0;
        // iterate all files
        for(FileInfo fileInfo : spdx.getFiles()){
            // get the component name
            String component = fileInfo.getFileComponent();
            // avoid the files without a component specified
            if(component == null){
                // increase the counter to later use this value
                counterNull++;
                continue;
            }
            // process all the rest, have we already indexed this component?
            if(components.containsKey(component)){
                // then just increase its value
                int value = components.get(component);
                value++;
                components.put(component, value);
            }else{
            // first time doing this, add a new one
                components.put(component, 1);
            }
        }
        
        // now do the output messages
        if(counterNull == spdx.getFiles().size()){
        // no components were found
            result = html.div()
                    + result
                    + html.textGreyAligned("No files associated to any components (yet)")
                    + html._div;
            return result;
        }
        
        // sort these groups according to their size 
        Map<String, Integer> map = utils.thirdparty.MiscMethods.sortByComparator(components);
        
        // now iterate each group
        for(String componentID : map.keySet()){
            
            int count = map.get(componentID);
            // get the details for this component from our database
            Component component = engine.components.get(componentID);
            
            // what happens if the component was not found?
            if(component == null){
                System.err.println("SP1055 - Null component: " + componentID);
                continue;
            }
            
            // initialize the file tracking
            String fileList = "";
            int thisCounter = 0;
            
            // iterate through all files in our spdx
            for(FileInfo fileInfo : spdx.getFiles()){
                // if it belongs to our component
                if(utils.text.equals(fileInfo.getFileComponent(), componentID)){
                    thisCounter++;
                    if(thisCounter < max){
                        
                        String origin = fileInfo.getFileOrigin().getLowercase();
                        if(fileInfo.getFileOrigin() == FileOrigin.UNKNOWN){
                            origin = "unknown origin";
                        }
                        
                        // add it to our list
                        fileList = fileList.concat(
                                "<i>" 
                                + fileInfo.getFileName()
                                + html.textGrey(
                                    " ("
                                    + origin
                                    + ")")
                                + "</i>"
                                + html.br);
                    }
                }
            }
            // were more than 10 files found?
            if(thisCounter >= max){
                fileList = fileList.concat(
                                "<i> ..more " 
                                + utils.text.pluralize(thisCounter - max, "file")
                                + " on this list.."
                                + "</i>"
                                + html.br);
            } 
            
            if(count==1){
                fileList = "File: " + fileList;
            }else
                if(count > 1){
                     fileList = "Files: " + html.br + fileList;
                }
            
            
            // all good
            result += ""
                    + html.h2(component.getTitle() 
                        + " (" 
                        + utils.text.pluralize(count, "file")
                        + ")")
                    //+ addIfNotEmpty("Description", component.getDescription(), true)
                    + addIfNotEmpty("description", component.getDescription())
                    + addIfNotEmpty("declaredlicense", component.getLic())
                    + addIfNotEmpty("mainauthor", component.getAuthors())
                    + addLinkIfNotEmpty("referenceURL", component.getReferenceURL())
                    + addLinkIfNotEmpty("downloadURL", component.getDownloadURL())
                    + fileList
                    + html.br
                    + html.line
                    ;
        }
        
        
        // give a short report about non-assigned files
        if(counterNull > 0){
            result += getListNonAssignedFiles();
        }
        
        // add the spacing
//        result = html.div()
//                + result
//                + html._div;
        
        
        return result;
    }
  
    /**
     * Provides an HTML list of the files that are NOT associated to a component
     * @return An HTML portion of text ready for display to end-user
     */
    private String getListNonAssignedFiles(){
        int counterNull= 0;
        String fileList = "";
            
        // iterate all files to find the ones without a component assigned
        for(FileInfo fileInfo : spdx.getFiles()){
            // get the component name
            String component = fileInfo.getFileComponent();
            // avoid the files without a component specified
            if(component == null){
                // increase the counter to later use this value
                counterNull++;
                // add new names while the list is short
                if(counterNull < max){
                        // add it to our list
                        fileList = fileList.concat(
                                "<i>" 
                                + fileInfo.getFileName()
                                + "</i>"
                                + html.br);
                    }
                // all done, move to the next
            }
        }
    
        // were more than 10 files found?
            if(counterNull >= max){
                fileList = fileList.concat(
                                "<i> ..more " 
                                + utils.text.pluralize(counterNull - max, "file")
                                + " on this list.."
                                + "</i>"
                                + html.br);
            } 
            
            // now do the pretty output
            if(counterNull==1){
                fileList = "File: " + fileList;
            }else
                if(counterNull > 1){
                     fileList = "Files: " + html.br + fileList;
                }
        
            
         String result =  html.h2("Uncategorized files: " + counterNull);
            
        // all done
        return result + fileList
                + html.br
                + html.br;
    }
    
    
    /**
     * Add the key/value text when the value is not empty (or null)
     * @param key       The title
     * @param value     The value
     */
    private String addIfNotEmpty(final String key, final String value){
        if(value == null || value.isEmpty()){
            return "";
        }else{
            String result = value;
            return "<" + key + ">" + result + "</" + key + ">" + html.br;
        }
    }

    /**
     * Add the key/value text when the value is not empty (or null)
     * @param key       The title
     * @param value     The value
     */
    private String addLinkIfNotEmpty(final String key, final String value){
        if(value == null || value.isEmpty()){
            return "";
        }else{
            return "<" + key + ">" + html.link(value, value) + "</" + key + ">" + html.br;
        }
    }

    
}
