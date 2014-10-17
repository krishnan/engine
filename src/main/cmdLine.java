/**
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (http://triplecheck.de)
 * Created: 2014-09-02T17:08:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: cmdLine.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright (c) 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Handle the command line parameters.  </text> 
 */

package main;

import definitions.is;
import java.io.File;
import script.log;
import spdxlib.DocumentCreate2;

/**
 *
 * @author Nuno Brito, 2nd of September 2014 in Darmstadt, Germany
 */
public class cmdLine {
    
   
    
        
    /**
     * Are we calling command line parameters? If so, start them up
     * @param args  The arguments provided on command line
     * @return      True if valid parameters were found, false otherwise.
     */
    public static boolean isCommandLineUsed(final String[] args) {
        // what is the outcome of our processing?
        Boolean result = false;
        String packageName = "";
        String packageURL = "";
        
        
        // no arguments? No need to continue
        if(args.length == 0){
            return result;
        }
        
        
        if(args[0].equalsIgnoreCase("downloadSPDX")){
            System.exit(0);
            return true;
        }
        
        
        // get the first argument
        final String cmdAction = args[0].toLowerCase();
        
        // are we being asked to create an SPDX document?
        if(cmdAction.equals("spdx")){
            // do we have the right amount of parameters?
            if(args.length < 3){
                System.out.println("Expecting more parameters.");
                return true;
            }
            
            
            log.write(is.INFO, "Processing an SPDX folder/file:");
//            if(args.length == 3){
//            }
//            else
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
           
            //result = true;
            System.exit(0);
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
    public static void createCmdLineSPDX(final File spdxFile, 
            final File sourceCodeFolderOrFile,
            final String packageName, final String packageURL, 
            final String documentCreator) {
        
        // the SPDX document that we are about to create    
        DocumentCreate2 spdx = new DocumentCreate2();
        
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
    
    
    
}