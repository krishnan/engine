/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-11-23T18:41:10Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: ExtensionListGenerate.java  
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Find the file extensions inside our extension folder
    and then create a new class where they are defined.</text> 
 */

package FileExtension.generators;

import definitions.is;
import java.io.File;
import java.util.ArrayList;
import FileExtension.FileExtension;
import main.script.log;

/**
 *
 * @author Nuno Brito, 23rd of November 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class ExtensionListGenerate {

    final File 
            folderExtensions = new File("../src/extensions"),
            folderOutput = new File("../src/FileExtension"),
            folderTemplate = new File(folderOutput, "generators");
    
    // where we write the list of classes compiled
    String output = "";
    
    public ExtensionListGenerate(){
        processExtensions();
        generateNewExtensionList();
    } 
    
    /**
     * Add up all the extensions that we have available on disk
     */
    public void processExtensions() {
        // clear up the list to avoid duplicates
        ArrayList<File> files = utils.files.findFilesFiltered(folderExtensions, ".java", 5);
        log.write(is.INFO, "Adding extensions from %1", folderExtensions.getAbsolutePath());
        log.write(is.INFO, "Extensions to process: %1", files.size() + "");
        for(File file : files){   
            // ignore the extensions inside the "unknown" folder
            if(file.getParentFile().getName().contains("unknown")){
                continue;
            }
            
            // avoid the empty template file that is found on this folder
            if(file.getName().equals("template.java")){
                continue;
            }
            
            // get the extension interpreted
            FileExtension temp = null;
            try{
                final Object obj = utils.bytecode.getObject(file);
                temp = (FileExtension) obj;
            } catch(Exception e){
                log.write(is.ERROR, "EC88 - Failed to load extension: %1", 
                        file.getAbsolutePath());
            }
            
            
            // no need for null values
            if(temp == null){
                continue;
            }
            
            // add it up to our lists
            processExtension(temp, folderExtensions, file);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtensionListGenerate generate = new ExtensionListGenerate();
    }

    /**
     * Process each extension
     * @param extension 
     */
    private void processExtension(final FileExtension extension, File folder,
            File file) {
        
        String path = file.getAbsolutePath().replace(folder.getAbsolutePath(), "");
        // convert paths to dots
        path = path.replace("/", ".");
        // do the same if we are running from Windows
        path = path.replace("\\", ".");
        // remove the .java extension from the class
        path = path.substring(1, path.length() - 5);
        

        // convert this tidybut to a java code snippet
        final String snippet = "\tlist.add(new " + ""
                + "extensions."
                + path + "());\n";
        
        // add to the list
        output = output.concat(snippet);
        // output the result to provide visual feedback
        //System.out.println(snippet);
        
    }

    /**
     * Read the template file and generate a new list
     */
    private void generateNewExtensionList() {
        // where the source code template is located
        File sourceCodeTemplate = new File(folderTemplate, "ExtensionListTemplate.java");
        
        // where the final source code file will be located
        File sourceCodeOutput = new File(folderOutput, "ExtensionList.java");
        
        // read the code
        String sourceCode = utils.files.readAsString(sourceCodeTemplate);
        
        // replace the template with the real content
        sourceCode = sourceCode.replace("//extensionList", output);
        // replace the class denominations
        sourceCode = sourceCode.replaceAll(" ExtensionListTemplate", " ExtensionList");
        
        // package statement
        sourceCode = sourceCode.replaceAll("package FileExtension.generators;", "package FileExtension;");
        sourceCode = sourceCode.replaceAll("import FileExtension.FileExtension;", "");
        // add the time stamp
        sourceCode = sourceCode.replaceAll("Created: %templatetime%", "Created: " + utils.time.getDateSPDX());
        // mark as generated by machine
        sourceCode = sourceCode.replaceAll("FileOrigin: Authored", "FileOrigin: Auto" + "-Generated");
        
        // write it back to disk
        utils.files.SaveStringToFile(sourceCodeOutput, sourceCode);
        
    }
    
}
