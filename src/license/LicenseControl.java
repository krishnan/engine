/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-04-26T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: LicenseControl.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Allows to handle the registered licenses </text> 
 */

package license;

import license.terms.LicenseList;
import java.util.ArrayList;
import utils.www.html;


/**
 *
 * @author Nuno Brito, 26th of April 2014 in Darmstadt, Germany.
 *  nuno.brito@triplecheck.de | http://nunobrito.eu
 */
public final class LicenseControl {

    /**
     * Public constructor
     */
    public LicenseControl(){
        find();
    }
    
        
    private static final ArrayList<License> list = new ArrayList();
    
    private boolean hasNotProcessed = true;
    
    public void add(License license) {
        list.add(license);
    }

    
    /**
     * Gets the list of licenses available
     * @return 
     */
    public ArrayList<License> getList() {
        // only provide back a list after the licensing processing was made
        if(list.isEmpty() || hasNotProcessed){
            find();
        }
        return list;
    }
    
    /**
     * Provides a nice summary of the licenses available to end-users
     * through an HTML formatted text
     * @param chooseTitle
     * @param link
     * @return 
     */
    public String getListHTML(final String chooseTitle, final String link){
        String result = "";
        for(License license : getList()){
             String thisLink = link + license.getId();
             result += license.getPrettyText(chooseTitle, thisLink);
        }
        return result;
    }
    
    
    
     /**
     * Add up all the extensions that we have available on disk
     */
    public void find() {
        if(hasNotProcessed == false){
            return;
        }
        
        LicenseList licenseList = new LicenseList();
        
        list.addAll(licenseList.getList());
        
//        // clear up the list to avoid duplicates
//        File folder = engine.getLicensesFolder();
//        ArrayList<File> files = utils.files.findFilesFiltered(folder, ".java", 2);
//        log.write(is.INSTALLING, "Processing %1 licenses", "" + files.size());
//        for(File file : files){
//            //core.script.runJava(file, null, is.license);
//            License license = (License) exec.runJava(file, is.license);
//                //utils.bytecode.getObject(file);
//            if(license != null && license.getId().isEmpty() == false){
//                list.add(license);
//            }
//        }
        // output some statistics about the number of extensions registered
        //log.write(is.COMPLETED, "Licenses recognized: %1", "" + list.size());
        //System.err.println("LC85 - Found licenses: " + files.size() + "");
        //TODO we are still listing the template class as a file type.
        hasNotProcessed = false;
    }

    /**
     * Returns a given license object in our list. If it does not exist,
     * the result will be null
     * @param licenseId     Typically the SPDX identifier
     * @return              A License object
     */
    public License get(String licenseId) {
        for(License license : list){
            if(utils.text.equals(licenseId, license.getId())){
                return license;
            }
        }
        return null;
    }
    
        
    /**
     * Looks on the titles and tries to find an exact match
     * @param licenseTitle
     * @return 
     */
    public License getAsTitle(final String licenseTitle) {
        for(License license : list){
            if(utils.text.equals(licenseTitle, license.getTitle())){
                return license;
            }
        }
        return null;
    }

    /**
     * When given a search term, looks inside our archived licenses and provides
     * a list with possible results
     * @param searchTerm    Portion of text to be found
     * @param title
     * @param link          The URL link that permits selecting a license
     * @return              HTML code ready to display to the user
     */
    public String search(String searchTerm, final String title, 
            final String link) {
        
        String result, // the end result
                rankFirst = "", // results to be listed on top
                rankSecond = ""; // the secondary results

        // place the term in second position
        searchTerm = searchTerm.toLowerCase();
        
        // go through each found license
        for(License license : list){
//            boolean hasRankedFirst = false;
            
            // look on the ids
            if(license.getId().toLowerCase().contains(searchTerm)){
                rankFirst += license.getPrettyText(title, link + license.getId());
                continue;
            }
            
            // look inside the text
            if(license.getTerms().toLowerCase().contains(searchTerm)){
                // no need to repeat the result if already ranked
//                if(hasRankedFirst){
//                    continue;
//                }
                rankSecond += license.getPrettyText(title, link + license.getId());
                //continue;
           }
        }
        
        // add the titles where needed
        if(rankFirst.length() > 0){
            rankFirst = html.h3("Text matching the license title")
                    + rankFirst;
        }
        // add the titles where needed
        if(rankSecond.length() > 0){
            rankSecond = html.h3("Text inside the license terms")
                    + rankSecond;
        }
        // add up the results
        result = html.div() 
                + rankFirst 
                + rankSecond
                + html._div;
        // all done
        return result;
    }

    /**
     * Have we already tried to look for licenses at least once?
     * @return 
     */
    public boolean hasNotProcessed() {
        return hasNotProcessed;
    }

    
}