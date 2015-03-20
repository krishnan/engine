/**
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (http://triplecheck.de)
 * Created: 2015-03-20T00:09:00Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright (c) 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Convert an SPDX line to an object that we can use. </text> 
 */

package spdxlib.specific;

import definitions.is;
import java.io.File;
import spdxlib.FileInfo;
import tokenizator.SourceCodeSnippet;
import tokenizator.SourceCodeSnippetMatched;

/**
 *
 * @author Nuno Brito, 20th of March 2015 in Darmstadt, Germany
 */
public class LineToMatchSnippet {

    
    public static String referenceLines(final String line){
        final String m1 = "->";
        final int t1 = line.indexOf(m1);
        return line.substring(0, t1);
    }
    
    /**
     * Convert the line of data extracted from a text document to an actionable
     * object.
     * @param data
     * @return 
     */
    public static SourceCodeSnippetMatched convert(final String data){
        // 26..249->44..266 99% github:leonhong-thrift-7534e71/lib/java/test/org/apache/thrift/test/TestServer.java
        final SourceCodeSnippetMatched snippet = new SourceCodeSnippetMatched();
        // the line breaks
        final String m1 = "->";
        final int t1 = data.indexOf(m1);
        //final String originLocation = data.substring(0, t1);
        final String s2 = data.substring(t1 + m1.length());
        final int t2 = s2.indexOf(" ");
        
        final String matchingLocation = s2.substring(0, t2);
        final String[] line = matchingLocation.split("\\.\\.");
        // define start and end of line
        snippet.setLineStart(Integer.parseInt(line[0]));
        snippet.setLineEnd(Integer.parseInt(line[1]));
        
        // get the percentage value
        final int t3 = s2.indexOf("% ");
        final String percentage = s2.substring(t2 + 1, t3);
        snippet.setSimilarityPercentage(Integer.parseInt(percentage));
        snippet.setReference(s2.substring(t3 + 2));
        return snippet;
    }

    public static SourceCodeSnippet createSnippet(FileInfo fileInfo, String referenceLines) {
        
        referenceLines = referenceLines.substring(is.tagFileMatchSnippet.length() + 1);
        
        // create the new snippet object
        SourceCodeSnippet snippet = new SourceCodeSnippet();
        final String[] data = referenceLines.split("\\.\\.");
        // define start and end of line
        snippet.setLineStart(Integer.parseInt(data[0]));
        snippet.setLineEnd(Integer.parseInt(data[1]));
        
        StringBuilder text = new StringBuilder();
        
        // we need to find this file on disk and read its source code
        File sourceFolder = fileInfo.getSPDX().getSourceFolder();
        
        if(sourceFolder == null || sourceFolder.exists() == false){
            // what is the path of this file?
            File file = new File(sourceFolder, fileInfo.getFileName());

            final String content = utils.files.readAsString(file);
            final String[] lines = content.split("\n");
            for(int i = snippet.getLineStart(); i <= snippet.getLineEnd(); i++){
                text.append(lines[i]).append("\n");
            }
        }else{
            text.append("Source example code was not available");
        }
        // set the snippet text
        snippet.setText(text.toString());
        
        return snippet;
    }
    
}
