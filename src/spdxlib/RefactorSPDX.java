/**
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (http://triplecheck.de)
 * Created: 2015-03-05T20:11:01Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright (c) 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Refactor an existing SPDX to add new information in bulk.
 * One drawback of the current approach is that any data not indexed by the
 * SPDX document will not be written on the new file.</text> 
 */

package spdxlib;

import java.io.File;
import license.License;
import main.engine;
import utils.ReadWrite.FileWriteLines;

/**
 *
 * @author Nuno Brito, 5th of March 2015 in Darmstadt, Germany
 */
public class RefactorSPDX {

    private final SPDXfile spdx;
        // define the name for the SPDX document
    private String
            documentCreator = "",
            packageURL = "";
    
    public RefactorSPDX(SPDXfile spdx){
        this.spdx = spdx;
        // use the name assigned on this system
        documentCreator = System.getProperty("user.name");
        packageURL = "";
    }
    
    /**
     * Outputs the contents of the SPDX object into a new text file that
     * is defined on the file output parameter. If the file already exists,
     * it is first deleted.
     * @param fileOutput 
     */
    public void output(final File fileOutput){
        // preflight check, avoid the file from existing
        if(fileOutput.exists()){
            fileOutput.delete();
        }
        // open the new file for writing
        FileWriteLines fileWriter = new FileWriteLines(fileOutput);
        // we assume the file to be empty, so write the header
        fileWriter.write(getHeader());
        // second step is iterating all files on the SPDX document, write them
        for(FileInfo fileInfo : spdx.getFiles()){
            writeFile(fileInfo, fileWriter);
        }
        // close the file
        fileWriter.close();
    }
    /**
     * Writes a given file into the new SPDX document
     * @param fileInfo
     * @param fileWriter 
     */
    private void writeFile(FileInfo fileInfo, FileWriteLines fileWriter) {
        final String text = fileInfo.toSPDX();
        // write the result
        fileWriter.write(text);
    }
    
    /**
     * Prepare the header that is written on top of the file
     * @return 
     */
    private String getHeader(){
        License license = spdx.getPackageLicenseDeclared();
        String licenseDeclared;
        if(license == null){
            licenseDeclared = "NOASSERTION";
        }else{
            licenseDeclared = license.getId();
        }
        
        // prepare the header
        final String header =  
                  addParagraph("SPDX Document Information")
                + addText("SPDXVersion: ", "SPDX-1.2")
                + addText("DataLicense: ", "CC-BY-4.0")
                + "\n"
                
                + addParagraph("Creation Information")
                + addText("Creator: ", documentCreator)
                + addText("Creator: Tool: ", "TripleCheck " + engine.version)
                + addText("Created: ", utils.time.getDateSPDX())
                + "\n"
                
                + addParagraph("Package Information")
                + addText("PackageName: ",  spdx.getPackageName())
                + addText("PackageLicenseDeclared: ",  licenseDeclared)
                + addText("PackageDownloadLocation: ", packageURL)
                
                + "\n"
                + addParagraph("File Information")
                ;
        return header;
    }
     
    /**
     * Provides an ASCII paragraph
     * @param title the header text of the title
     * @return the ASCII text to be included on the final output
     */
    private String addParagraph(String title){
        return    "##-------------------------\n"
                + "## " + title + "\n"
                + "##-------------------------\n"
                ;
    }
    
    /**
     * Adds a simple line of text with a carriage return at the end
     * @param text the text to be included
     * @return a formatted string ready to be written at an ASCII file
     */
    private String addText(final String key, final String text){
        if(text == null || text.isEmpty()){
            return "";
        }
        return key + text + "\n";
    }

}
