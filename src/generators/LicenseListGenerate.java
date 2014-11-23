/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-23T18:41:10Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: LicenseListGenerate.java  
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Find the license classes inside our licenses folder
    and then create a new class where they are defined.</text> 
 */

package generators;

import definitions.is;
import java.io.File;
import java.util.ArrayList;
import main.engine;
import script.log;
import spdxlib.License;

/**
 *
 * @author Nuno Brito, 23rd of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class LicenseListGenerate {

    // where we write the list of classes compiled
    String output = "";
    
    public LicenseListGenerate(){
        processList();
        generateNewClassList();
    } 
    
    /**
     * Add up all the extensions that we have available on disk
     */
    public void processList() {
        // clear up the list to avoid duplicates
        final File folder = engine.getLicensesFolder();
        ArrayList<File> files = utils.files.findFilesFiltered(folder, ".java", 5);
        log.write(is.INFO, "Adding files from %1", folder.getAbsolutePath());
        log.write(is.INFO, "Files to process: %1", files.size() + "");
        for(File file : files){   
            // ignore the extensions inside the "unknown" folder
            if(file.getName().contains("LicenseTemplate.java")){
                continue;
            }
            
            // avoid the empty template file that is found on this folder
            if(file.getName().equals("template.java")){
                continue;
            }
            
            // get the extension interpreted
            License temp = null;
            try{
                final Object obj = utils.bytecode.getObject(file);
                temp = (License) obj;
            } catch(Exception e){
                log.write(is.ERROR, "EC88 - Failed to load extension: %1", 
                        file.getAbsolutePath());
            }
            
            
            // no need for null values
            if(temp == null){
                continue;
            }
            
            // add it up to our lists
            processTarget(temp, folder, file);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LicenseListGenerate generate = new LicenseListGenerate();
    }

    /**
     * Process each extension
     * @param target 
     */
    private void processTarget(final License target, File folder,
            File file) {
        
        String path = file.getAbsolutePath().replace(folder.getAbsolutePath(), "");
        // convert paths to dots
        path = path.replace("/", ".");
        // do the same if we are running from Windows
        path = path.replace("\\", ".");
        // remove the .java extension from the class
        path = path.substring(1, path.length() - 5);
        

        // convert this tidybut to a java code snippet
        final String snippet = "\tlist.add(new " + path + "());\n";
        
        // add to the list
        output = output.concat(snippet);
        // output the result to provide visual feedback
        System.out.println(snippet);
        
    }

    /**
     * Read the template file and generate a new list
     */
    private void generateNewClassList() {
        String pathCurrent = engine.getWorkFolder().getAbsolutePath();
        String pathSourceFolder = "src/spdxlib/";
        String pathGeneratorFolder = "src/generators/";
        
        // where the source code template is located
        File sourceCodeTemplate = new File(pathCurrent + "/../", 
                pathGeneratorFolder + "LicenseListTemplate.java");
        
        // where the final source code file will be located
        File sourceCodeOutput = new File(pathCurrent + "/../", 
                pathSourceFolder + "LicenseList.java");
        
        // read the code
        String sourceCode = utils.files.readAsString(sourceCodeTemplate);
        
        // replace the template with the real content
        sourceCode = sourceCode.replace("//LicenseList", output);
        // replace the class denominations
        sourceCode = sourceCode.replaceAll(" LicenseListTemplate", " LicenseList");
        sourceCode = sourceCode.replaceAll("package generators;", "package spdxlib;");
        sourceCode = sourceCode.replaceAll("import spdxlib.License;", "");
        // add the time stamp
        sourceCode = sourceCode.replaceAll("Created: %templatetime%", "Created: " + utils.time.getDateSPDX());
        // mark as generated by machine
        sourceCode = sourceCode.replaceAll("FileOrigin: Authored", "FileOrigin: Auto" + "-Generated");
        
        // write it back to disk
        utils.files.SaveStringToFile(sourceCodeOutput, sourceCode);
        
    }
    
}
