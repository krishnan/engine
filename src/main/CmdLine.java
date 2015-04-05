/**
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (http://triplecheck.de)
 * Created: 2014-09-02T17:08:00Z
 * LicenseName: AGPL-3.0+
 * FileName: cmdLine.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Handle the command line parameters.  </text> 
 */

package main;

import definitions.is;
import java.io.File;
import static main.engine.warmUp;
import main.script.log;
import output.formats.HTML.OutputSPDXToHTML;
import provenance.Trigger;
import spdxlib.DocumentCreate;
import spdxlib.EvaluateLicensingQuality;
import spdxlib.SPDXfile;

/**
 *
 * @author Nuno Brito, 2nd of September 2014 in Darmstadt, Germany
 */
public class CmdLine {
    
    public static final String 
            spdx_expecting_more_parameters = "Expecting more parameters.",
            spdx_created_document = "Created a new SPDX document",
            html_failed_to_create_report = "HTML report: failed to create a report",
            html_created_report = "HTML report: success",
            html_failed_to_find_file = "HTML report: Failed to find SPDX document";
    // what is given as answer after processing a message
    private String answer = "";
    
    
    
        
    /**
     * Are we calling command line parameters? If so, start them up
     * @param args  The arguments provided on command line
     * @return      True if valid parameters were found, false otherwise.
     * @throws java.lang.Exception
     */
    public boolean isCommandLineUsed(final String[] args) throws Exception {
        // what is the outcome of our processing?
        Boolean result = false;
        String packageName = "";
        String packageURL = "";
        
        // no values? nothing to do.
        if(args == null){
            return false;
        }
        
        // no arguments? No need to continue
        if(args.length == 0){
            return result;
        }
       
        // open up the settings for this processing
        warmUp();
        
        // get the first argument
        final String cmdAction = args[0].toLowerCase();
         
         // do we want to evaluate the license quality from a given SPDX?
        if(cmdAction.equals("score")){
            commandEvaluateSPDX(args);
            return true;
        }
        
        if(cmdAction.equals("detect")){
            commandEvaluateLicenses(args);
            return true;
        }
        
        
        if(cmdAction.equals("suggestions")){
            commandSuggestionsSPDX(args);
            return true;
        }
        
        if(cmdAction.equals("originality")){
            commandEvaluateOriginality(args);
            return true;
        }
        
        if(cmdAction.equals("report")){
            commandReportSPDX(args);
            return true;
        }
        
        // are we being asked to create an SPDX document?
        if(cmdAction.equals("spdx")){
            // do we have the right amount of parameters?
            if(args.length < 3){
                answer = spdx_expecting_more_parameters;
                System.out.println(answer);
                return true;
            }
            
            log.write(is.INFO, "Processing an SPDX folder/file:");
            // do we have a parameter for the package name?
            if(args.length == 4){
                packageName = args[3];
            }
            else
            // do we want to define an URL?
            if(args.length == 5){
                packageURL = args[4];
            }
          
            // the output file from where we store/generate the SPDX information
            final File spdxFile = new File(args[1]);
            final File sourceTarget = new File(args[2]);
            // now create the document      
            createCmdLineSPDX(spdxFile, sourceTarget, packageName, packageURL, "");
           
            answer = spdx_created_document;
            System.out.println(answer);
            //result = true;
        }
        
        // all done
        return result;
    }

    /**
     * Creates a new SPDX document from the command line
     * @param spdxFile
     * @param sourceCodeFolderOrFile The source used as input (files and folders)
     * @param packageName           Is there a name assigned to this package?
     * @param packageURL            Is there an URL associated with it?
     * @param documentCreator       Who is authoring the document itself
     */
    public void createCmdLineSPDX(final File spdxFile, 
            final File sourceCodeFolderOrFile,
            final String packageName, final String packageURL, 
            final String documentCreator) {
        
        // the SPDX document that we are about to create    
        final DocumentCreate spdx = new DocumentCreate();
        
        // if this is a directory, we can't proceed
        if(spdxFile.isDirectory()){
            log.write(is.ERROR, "SPDX file is a folder: %1", 
                    spdxFile.getAbsolutePath());
            return;
        }
        // if this is a directory, we can't proceed
        if(sourceCodeFolderOrFile.isFile()){
            log.write(is.ERROR, "Target file not yet supported: %1", 
                    sourceCodeFolderOrFile.getAbsolutePath());
            return;
        }
        
        // delete any previous output file if it exists
        if(spdxFile.exists()){
            spdxFile.delete();
        }
        
        // add some settings
        if(packageName.isEmpty() == false){
            spdx.setPackageName(packageName);
        }
        if(packageURL.isEmpty() == false){
            spdx.setPackageURL(packageURL);
        }
        
        if(documentCreator.isEmpty() == false){
            spdx.setDocumentCreator(documentCreator);
        }
        
        
        // generate the SPDX document
        log.write(is.INFO, "SPDX: %2 -> %1"
                , spdxFile.getAbsolutePath(), sourceCodeFolderOrFile.getAbsolutePath());
        // create the SPDX
        spdx.create(sourceCodeFolderOrFile, spdxFile);
        System.out.println("Processed files: " + spdx.getFilesProcessed());
    }

    /**
     * Launch the code to evaluate the licensing quality of an SPDX document
     * @param args  The arguments from command line
     */
    private void commandEvaluateSPDX(final String[] args) {
        // do the initial checks to ensure things are ok
        if(args.length != 2){
            log.write(is.ERROR, "CL165 Error: Not enough parameters to score a document");
            return;
        }
        
        // transform the appointed string into a file on disk, check if real
        final String fileName = args[1];
        // do the file
        final File file = new File(fileName);
        // does our file really exist?
        if(file.exists() == false || file.isDirectory()){
            log.write(is.ERROR, "Evaluate SPDX: Invalid file");
            return;
        }
        // create the object to handle the quality tests
        EvaluateLicensingQuality qualityTest = new EvaluateLicensingQuality();
        qualityTest.process(file);
        answer =  qualityTest.getScore() + "";
    }

    public String getAnswer() {
        return answer;
    }

    private void commandSuggestionsSPDX(String[] args) {
        // do the initial checks to ensure things are ok
        if(args.length != 2){
            log.write(is.ERROR, "CL165 Error: Not enough parameters to score a document");
            return;
        }
        
        // transform the appointed string into a file on disk, check if real
        final String fileName = args[1];
        // do the file
        final File file = new File(fileName);
        // does our file really exist?
        if(file.exists() == false || file.isDirectory()){
            log.write(is.ERROR, "SPDX provided: Invalid file");
            return;
        }
        // create the object to handle the quality tests
        EvaluateLicensingQuality qualityTest = new EvaluateLicensingQuality();
        qualityTest.process(file);
        
        String output = "";
        final String endSection = "-----\n";
        
        if(qualityTest.getFixSuggestionLicense().isEmpty() == false){
            output += "license headers missing:\n"
                    + qualityTest.getFixSuggestionLicense()
                    + endSection;
        }
        if(qualityTest.getFixSuggestionCopyright().isEmpty() == false){
            output += "copyright headers missing:\n"
                    + qualityTest.getFixSuggestionCopyright()
                    + endSection;
        }
        if(qualityTest.getFixSuggestionDocumentation().isEmpty() == false){
            output += "documentation files missing:\n"
                    + qualityTest.getFixSuggestionDocumentation()
                    + endSection;
        }
        answer =  output;
    }
    
        
    /**
     * Launch the code to evaluate the licensing quality of an SPDX document
     * @param args  The arguments from command line
     */
    private void commandEvaluateOriginality(final String[] args) {
        // do the initial checks to ensure things are ok
        if(args.length != 3){
            log.write(is.ERROR, "CL249 Originality scan error: Not enough parameters");
            return;
        }
        
        // transform the appointed string into a file on disk, check if real
        final String fileName = args[1];
        // do the file
        final File file = new File(fileName);
        // does our file really exist?
        if(file.exists() == false || file.isDirectory()){
            log.write(is.ERROR, "Evaluate SPDX: Invalid file");
            return;
        }
        
        //final String changeDir = "../../triplechecker/run";
        //Process p = Runtime.getRuntime().exec("cd");
        
        System.out.println("Where are we?");
        //engine.settings.write("triplechecker_local_", "");
        
        answer =  "";
    }

    
    /**
     * Launch the code to evaluate the licensing quality of an SPDX document
     * @param args  The arguments from command line
     */
    private void commandEvaluateLicenses(final String[] args) throws Exception {
        // do the initial checks to ensure things are ok
        if(args.length != 2){
            log.write(is.ERROR, "CL96 Detection error: Not enough parameters");
            return;
        }
        
        // transform the appointed string into a file on disk, check if real
        final String fileName = args[1];
        // do the file
        final File file = new File(fileName);
        // does our file really exist?
        if(file.exists() == false || file.isDirectory()){
            log.write(is.ERROR, "Dectection: Invalid file");
            return;
        }
        
        // read the contents of this file, convert to lower case
        final String content = utils.files.readAsString(file);
        answer =  "";
        
        // iterate each trigger, see if it is applicable
        for(Trigger thisTrigger: engine.triggers.getList()){
            if(thisTrigger.isApplicable(content, content.toLowerCase())){
                answer += 
                        thisTrigger.getShortIdentifier()
                        + "\n";
            }
         }
        
        // did we found something? then remove the last break line
        if(answer.isEmpty() == false){
            answer = answer.substring(0, answer.length()-1);
        }
        
    }

    
    /**
     * Create a new HTML report based on a given SPDX document
     * @param args 
     */
    private void commandReportSPDX(String[] args) {
        // do the initial checks to ensure things are ok
        if(args.length != 3){
            log.write(is.ERROR, "CL165 Error: Not enough parameters to create a report");
            return;
        }
        
        // transform the appointed string into a file on disk, check if real
        final String fileName = args[1];
        // do the file
        final File file = new File(fileName);
        // does our file really exist?
        if(file.exists() == false || file.isDirectory()){
            answer = html_failed_to_find_file;
            log.write(is.ERROR, answer);
            return;
        }
        
        // prepare the location where the report files will be placed
        File folderOutput = new File(args[2]);
        // check if the folder exists or not
        if(folderOutput.exists() == false || folderOutput.isFile()){
            answer = html_failed_to_create_report;
            log.write(is.ERROR, answer);
            return;
        }
        
        
        // create the HTML report
        SPDXfile spdx = new SPDXfile(file);
        
        OutputSPDXToHTML outputHTML = new OutputSPDXToHTML(folderOutput, spdx);
        outputHTML.doOutput();
        
        answer =  html_created_report;
    }
    
}
