package provenance.trigger.authorship;


import provenance.TriggerType;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import provenance.Trigger;
import provenance.TriggerData;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-04-02T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: CopyrightDetector.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> A generic trigger to detect copyright text.</text> 
 */


/**
 *
 * @author Nuno Brito, 2nd of April 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public class CopyrightDetector implements Trigger {
    
    String copyrightText = "";
    int copyrightCounter = 0;
    
    private final TriggerData result = new TriggerData();
    
    
    final String[] blackList = {
        "interest",
        "law",
        "the software",
        "owner",
        "(c)",
        "disclaimer",
        "holder",
        "statement",
        "License",
        "license",
        "notice",
        "[yyyy]",
        "year",
        "date",
        "info",
        "footer",
        "[year] by [your name] <your email>",
        "many different people",
        "variable",
        "_copyright",
        "conditions",
        "copyright_years",
        "barrier",
        "http://fsf.org/" // No need to extract copyright from files with xGPL terms 
    };
    
    // the super-duper-mega expression to catch copyright statements
    final String 
            patternString = ""
                 + "(\\((C|c)\\) |)"    // detect (c) before the copyright text
                 + "(C|c)opyright"      // detect the copyright text
                 + "( \\((C|c)\\)|) "   // sometimes with a (c)
                 + "([0-9]|)"           // optionally with the year
                 + "+"                 
                 + "[^\\n\\t\\*]+\\.?",
            
            patternCleaner = "(\\((C|c)\\) |)(C|c)opyright( \\((C|c)\\) |)";
    
    final Pattern pattern = Pattern.compile(patternString);
        
    
    /**
     * Verifies if the provided text applies to the triggers that
     * included on this license.
     * @param text Text to be analysed
     * @return 
     */
    @Override
    public Boolean isApplicable(final String text, final String textLowerCase){
       
        // avoid terms that were black listed
        for(final String blackListedTerm : blackList){
            if(textLowerCase.contains(blackListedTerm)){
                return false;
            }
        }
        
        // proceed to normal copyright extracting
        Matcher matcher = pattern.matcher(text);
        
        String copyright = "";
        Boolean onlyOne = true;
        copyrightCounter = 0;
        // go through all the matches
        while(matcher.find()) {
            // get the copyright text
            final String temp = text.substring(matcher.start(), matcher.end()).replace("(\n|\r\n)", "");
            String clean = temp.replaceAll(patternCleaner, "");
            // don't accept false positives (when possible)
            if(isBlackListed(clean)){
                continue;
            }
            
            // add this copyright notice
            // if there is only one occurence, don't add a line break
            if(onlyOne){
                copyright = copyright.concat(temp);
                onlyOne = false;
                copyrightCounter++;
                // add this item to our results
                result.add(temp);
                
                // add a line break for everything after
            }else{
                // we need to check if this is a duplicate or not
                //String clean = temp.replaceAll(patternCleaner, "");
                // no need to add up this copyright if already repeated somewhere
                if(copyright.contains(clean)){
                    continue;
                }
                // add the next copyright on a second line
                copyright += 
                        "\n"
                        + 
                        temp;
                copyrightCounter++;
                // add a new copyright holder
                result.add(temp);
            }
        }
        
        // clean up some text that is not needed
        copyright = copyright.replaceAll("( |)</text>", "");
        
         // lock this value
        copyrightText = copyright;
   
        // do a debug result
//        if(copyrightText.isEmpty() == false){
//            System.out.println(copyright);
//        }
        
        return copyrightText.isEmpty()==false;
    }

    /**
     * A regular expression is useful to get content but still fails
     * to recognize some false positives. This method ensures that some
     * of these false copyright notices are accepted as valid.
     */
    private Boolean isBlackListed(String text){

        String temp = text.replace(" ", "");
        // no empty values accepted
        if(temp.isEmpty()){
            return true;
        }
        
        
        // don't accept copyright texts too long or too short
        // then is most likely a false positive
        if((text.length() > 200)
                ||(text.length()<10)){
            return true;
        }
        
        // iterate all our ids
        for(String id : blackList){
            if(text.contains(id)){
                System.out.println("-->" + id);
                return true;
            }
        }
        return false;
    }
    
    
    
    @Override
    public Boolean isApplicable(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getShortIdentifier() {
        return "Copyright detection";
    }

    @Override
    public Boolean supportsBinaries() {
        return false;
    }

    @Override
    public Boolean supportsTextFiles() {
        return true;
    }
 
    @Override
    public TriggerType getType(){
        return TriggerType.COPYRIGHT;
    }

    @Override
    public String getFullName() {
        return copyrightText;
    }

    @Override
    public TriggerData getResult(){
        return result;
    }
    
    @Override
    public String getResultSPDX() {
          
        // do some pretty adjustments when there is more than one entry
//        if(copyrightCounter > 1){
//            copyrightText = "\n" + copyrightText + "\n";
//        }
                
        if(copyrightCounter > 1){
            //System.out.println(copyrightCounter);
            copyrightText = 
                    "\n"+
                    copyrightText + "\n";
        }
        
        return "FileCopyrightText: <text>"
                + copyrightText
                + "</text>";
    }

    @Override
    public String getTriggerTitle() {
        return "Copyright finder";
    }
    
}