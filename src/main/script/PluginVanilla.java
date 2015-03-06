/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-11-01T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: Plugin.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Used as the skeleton for beanshell/java hybrid
 * plugins. This part is what beanshell is actually running, albeit in the 
 * NetBeans IDE and code of each script we are declaring each plugin 
 * to implement Plugin.java
 * 
 * This trick was necessary to overcome some differences between Java and 
 * the Beanshell scripting" </text> 
 */

package main.script;

import java.io.File;
import spdxlib.swing.TreeNodeSPDX;
import utils.Settings;

   
/**
 *
 * @author Nuno Brito, 8th of November 2013 in Darmstadt, Germany.
 */
public class PluginVanilla {

    // where we will store and retrieve the settings for this page
    private final String settingsFileName = "settings.xml";
    protected File settingsFile;
    protected Settings settings; 
   
    
     public File 
             thisFile = null, // pointer to this beanshell file being executed
             thisFolder = null; // pointer to the beanshell directory on disk

     public PluginVanilla(){
          settingsFile = new File(thisFolder, settingsFileName);
          settings = new Settings(settingsFile, "Settings for this folder");
     }
     
     public TreeNodeSPDX
             thisNode = null; // our pointer for the treeview node (if used)
     
     
     public void startup(){
     }
     
    
}
