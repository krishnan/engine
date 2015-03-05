/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-09-01T00:00:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: engine.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> A static class used as Singleton to keep a single
 *  instance of specific services such as log messages working synchronized
 *  </text> 
 */

package main;

import FileExtension.ExtensionControl;
import comp.ComponentControl;
import definitions.folder;
import definitions.is;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import main.script.Script;
import license.LicenseControl;
import definitions.structure.ReportsControl;
import java.util.concurrent.ConcurrentHashMap;
import provenance.TriggerControl;
import utils.Settings;


public class engine {

    public static String version = "1.0.0";
    
    // basic configuration. Non-volatile, stored as XML on disk
    public static
            Settings settings = new Settings(
                    new File(engine.getWorkFolder(), "settings.xml"), "");
    
    // where we keep our shared objects
    public static ConcurrentHashMap
            temp = new ConcurrentHashMap<String, Object>();
    
    public static File thisFile;

    public static ExtensionControl
            extensions = new ExtensionControl();

    public static TriggerControl
            triggers = new TriggerControl();
   
    public static ReportsControl
            reports = new ReportsControl();
    
    // find the licenses available on disk
    public static LicenseControl
            licenses = new LicenseControl();
   
    public static 
            Script script;// = new Script();
    
    public static ComponentControl components; // = new ComponentControl();
    
    // where we define that we are working
    public static File workFolder;
    
     // define the icon used on the tree view
    public static final Icon
            // this might seem an overwhelming wall of text but it important
            // to cache up these icons to avoid re-reading them in the future
        iconTEXT = new ImageIcon(getIcon("document-list.png").getAbsolutePath()),
        iconSOURCE = new ImageIcon(getIcon("document-code.png").getAbsolutePath()),
        iconDOCUMENT = new ImageIcon(getIcon("document-word.png").getAbsolutePath()),
        iconINTERNET = new ImageIcon(getIcon("document-globe.png").getAbsolutePath()),
        iconSCRIPT = new ImageIcon(getIcon("script-code.png").getAbsolutePath()),
        iconSCHEMA = new ImageIcon(getIcon("document-xaml.png").getAbsolutePath()),
        iconCONFIG = new ImageIcon(getIcon("document--pencil.png").getAbsolutePath()),
        iconVERSIONING = new ImageIcon(getIcon("document-clock.png").getAbsolutePath()),
        iconEXECUTABLE = new ImageIcon(getIcon("compile.png").getAbsolutePath()),
        iconFONT = new ImageIcon(getIcon("document.png").getAbsolutePath()),
        iconARCHIVE = new ImageIcon(getIcon("box.png").getAbsolutePath()),
        iconBINARY = new ImageIcon(getIcon("document-binary.png").getAbsolutePath()),
        iconDATABASE = new ImageIcon(getIcon("database.png").getAbsolutePath()),
        iconIMAGE = new ImageIcon(getIcon("document-image.png").getAbsolutePath()),
        iconVIDEO = new ImageIcon(getIcon("document-film.png").getAbsolutePath()),
        iconSOUND = new ImageIcon(getIcon("document-music.png").getAbsolutePath()),
        iconMUSIC = new ImageIcon(getIcon("document-music.png").getAbsolutePath()),
        iconOTHER = new ImageIcon(getIcon("document-xaml.png").getAbsolutePath()),
        iconTEMP = new ImageIcon(getIcon("document-clock.png").getAbsolutePath()),
        iconUNKNOWN = new ImageIcon(getIcon("document.png").getAbsolutePath()),
        iconCOMPONENTS = new ImageIcon(getIcon("blue-document-node.png").getAbsolutePath()),
        iconEXPORT = new ImageIcon(getIcon("application-dock-270.png").getAbsolutePath()),
        iconFolderClosed = new ImageIcon(getIcon("folder-horizontal.png").getAbsolutePath()),
        iconFolderOpen = new ImageIcon(getIcon("folder-horizontal-open.png").getAbsolutePath()),
        iconFiles = new ImageIcon(getIcon("documents-stack.png").getAbsolutePath()),

        iconFingerprint = new ImageIcon(getIcon("fingerprint.png").getAbsolutePath());

    
    /**
     * Gets the folder where we are running
     * @return The folder from where the main application is running
     */
    public static File getWorkFolder(){
        // if it hasn't been defined before, set this value right now
        if(workFolder == null){
            defineWorkFolder();
        }

        // otherwise return the basic work folder that has been defined
        return workFolder;
    }
    
    /**
     * This method helps to switch between a development and deployment
     * environment in regards to the work folder location.
     */
    static void defineWorkFolder(){
           // we need to switch between base path in IDE mode and real-usage mode
        final File f = new File(engine.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        final String currentPath = f.getAbsolutePath().replaceAll("\\\\", "/");
        // are we running in IDE mode?
        if(currentPath.endsWith("/build/classes")){
            workFolder = new File(".").getAbsoluteFile().getParentFile();
        }else{
            // define it as the currently running folder
            workFolder = new File(engine.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath()).getParentFile();
         }
        
        // or else, are we running as library or as standalone?
        final String startupMode = System.getProperty(is.methodStartUp);
        if(startupMode != null && startupMode.equalsIgnoreCase(is.library)){
            workFolder = new File(".").getAbsoluteFile().getParentFile();
        }
    }
    
    /**
     * Gets the folder where misc settings are placed
     * @return The folder from where the main application is running
     */
    public static File getMiscFolder(){
        File result = new File(getWorkFolder(), "misc");
        // if the folder doesn't exist, create one
        if(result.exists() == false){
            utils.files.mkdirs(result);
        }
        return result;
    }
    
       /**
     * Gets the folder where misc settings are placed
     * @return The folder from where the main application is running
     */
    public static File getFolderExport(){
        File result = new File(getWorkFolder(), "export");
        // if the folder doesn't exist, create one
        if(result.exists() == false){
            utils.files.mkdirs(result);
        }
        return result;
    }

    
     /**
     * Where are all the github related files placed?
     * @return 
     */
    public File getGithubFolder(){
        File result = new File(engine.getMiscFolder(),"github");
        // if the folder doesn't exist, create one
        if(result.exists() == false){
            utils.files.mkdirs(result);
        }
        return result;
    }
    /**
     * Gets an Icon file from the icon archive
     * @param filename The icon name inside our archive
     * @return A file pointer to the icon
     */
    public static File getIcon(final String filename){
        File iconFolder = new File(getMiscFolder(), is.iconFolder);
            return new File(iconFolder, filename);
    }
    
    
    /**
     * where the plugins are located
     * @return 
     */
    public static File getPluginsFolder(){
        return new File(getWorkFolder(), "plugins");
    }
    
    public static File getLibraryFolder(){
        return new File(getWorkFolder(), "library");
    }
    
    public static File getComponentFolder(){
        return new File(getWorkFolder(), "components");
    }
    
    public static File getProductsFolder(){
        return new File(getWorkFolder(), folder.reports);
    }
    
    public static File getReportsFolder(){
        return new File(getWorkFolder(), folder.triggers);
    }
    
    public static File getLicensesFolder(){
        return new File(getWorkFolder(), folder.licenses);
    }
    
    public static File getExtensionsFolder(){
        return new File(getWorkFolder(), folder.extensions);
    }
    
    public static File getExtensionsUnknown(){
        return new File(getExtensionsFolder(), "unknown");
    }
    
    /**
     * Prepares the SPDX engine to be used. This involves initiating the
     * different components. This method is deprecated. Not needed for new code.
     */
    public static void warmUp(){
     // initialize the settings
        settings = new Settings(
                    new File(engine.getWorkFolder(), "settings.xml"), "");
        script = new Script();
        components = new ComponentControl();
    }
    
 
}
