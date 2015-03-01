/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-01T14:51:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Discover references to licenses and copyrights
    inside a set of files on disk.</text> 
 */

package provenance;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.engine;
import script.Trigger;
import spdxlib.DocumentCreate;

/**
 *
 * @author Nuno Brito, 1st of March 2015 in Darmstadt, Germany
 */
public class LicenseFinder {

    // values that you can tweak around:
    final long maxFileSize = 15000000;
    
    
    // the queue for files to be processed
    private final BlockingQueue<File> 
            queue = new LinkedBlockingQueue<File>();
 
        
    // how many files have been processed, how many are missing?
    private int
            filesProcessed,
            filesTotal;
        
    /**
     * Find all files in a given folder and respective subfolders to
     * start indexing them.
     * @param where A file object of the start folder
     * @param maxDeep How deep is the crawl allowed to proceed
     * @throws java.io.IOException
     */
    private void processFindFiles(File where, int maxDeep) throws Exception{
        final File[] files = where.listFiles();
        if(files != null){
            for (final File file : files) {
                if (file.isFile()){
                    queue.add(file);
                    filesTotal++;
                }else
                    if ((file.isDirectory())
                            &&( maxDeep-1 > 0 )){
                        // ignore intentionally the repository folders
                        if(isRepositoryFolder(file)){
                            continue;
                        }
                        // do the recursive crawling
                        processFindFiles(file, maxDeep-1);
                    }
            }
        }
    }

 /**
  * Avoid the indexing of folders that belong to popular versioning systems
  * @param folder   The folder on disk to evaluate
  * @return True is this is a repository folder, false otherwise
  */
    boolean isRepositoryFolder(final File folder){
         final String folderName = folder.getName();
         if(utils.text.equals(folderName, ".git")){
             return true;
         }else
             if(utils.text.equals(folderName, ".svn")){
                 return true;
         }else
             if(utils.text.equals(folderName, ".hg")){
                 return true;
             }
         // not one of those folders. All good to go.
         return false;
    }
 
    /**
     *
     * @param params
     * @throws java.lang.Exception
     */
    public static void main(String[] params) throws Exception{
        
        File folderSource = new File("../../source/linux-kernel");
        
        engine.warmUp();
        
        System.out.println("Discovering licenses on: " + folderSource.getAbsolutePath());
        LicenseFinder finder = new LicenseFinder();
        finder.addFolder(folderSource);
        finder.process();
        System.out.println("All done, processed "
                + finder.filesProcessed
                + " files");
        System.exit(0);
    }

    /**
     * Adds the files within a folder to be processed
     * @param folderSource
     * @throws Exception 
     */
    public void addFolder(final File folderSource) throws Exception {
        this.processFindFiles(folderSource, 25);
    }

    /**
     * Processes the files on the queue of this finder to expose licenses
     * and copyrights included
     */
    private void process() throws Exception {
        processQueueThreaded();
    }
    
    /**
     * Launches a number of parallel threads to tackle the processing of files.
     * The number of threads depends directly on the number of available CPUs.
     * @throws Exception 
     */
    private void processQueueThreaded() throws Exception{
        for(int i = 0; i < utils.hardware.numberCPU(); i++){
                Thread thread = new Thread(){
                    @Override
                    public void run(){
                        try {
                            // process a given queue
                            processQueue();

                        } catch (Exception ex) {
                            Logger.getLogger(DocumentCreate.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                thread.start();
            }
        // keep waiting until the queue was processed
        while(queue.size() > 0){
            utils.time.wait(1);
        }
    }    
    
    /**
     * The code that will go through the queue and process files
     * @throws Exception 
     */
    private void processQueue() throws Exception{
        while(queue.size() > 0){
            processFile(queue.take());
        }
    }
    
    /**
     * Process a given file to extract the information relevant to SPDX
     * @param file     A file on disk
     */
    private void processFile(final File file) throws Exception {
        // increase the counter
        filesProcessed++;
        
        // avoid over-weight files
        if(file.length() > maxFileSize){
            return;
        }
        // get the extension data
        final String extension = utils.files.getExtension(file).toLowerCase();
        //FileExtension extensionType = engine.extensions.get(extension);
        // read this file from disk onto local memory
        final String contentNormalCase = utils.files.readAsString(file);
        final String contentLowerCase = contentNormalCase.toLowerCase();
        // proceed to trigger detection
        for(Trigger thisTrigger: engine.triggers.getList()){
            // does our text contains an applicable trigger?
            if(thisTrigger.isApplicable(contentNormalCase, contentLowerCase)){
               //result = result.concat(thisTrigger.getResult()).concat("\n");
            }
        }
    }

    public int getFilesProcessed() {
        return filesProcessed;
    }

    public int getFilesTotal() {
        return filesTotal;
    }
    
    
    
}
