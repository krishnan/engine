/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-01T14:51:01Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Discover references to licenses and copyrights
    inside a set of files on disk. </text> 
 */

package provenance;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import spdxlib.DocumentCreate;

/**
 *
 * @author Nuno Brito, 1st of March 2015 in Darmstadt, Germany
 */
public class ProvenanceFinder {

    // values that you can tweak around:
    final long maxFileSize = 15000000;
    
    
    // the queue for files to be processed
    private final BlockingQueue<FileToProcess> 
            queue;
    
    private final BlockingQueue<FileProvenance> 
            resultList;
        
    // how many files have been processed, how many are missing?
    private int
            filesProcessed,
            filesTotal;

    public ProvenanceFinder() {
        resultList = new LinkedBlockingQueue<FileProvenance>();
        queue = new LinkedBlockingQueue<FileToProcess>();
    }
        
    private String baseFolder = null;
    
    // records the tree structure of what was analysed
    private final FolderProvenance tree = new FolderProvenance(null, ".");
    
    /**
     * Find all files in a given folder and respective subfolders to
     * start indexing them.
     * @param where A file object of the start folder
     * @param maxDeep How deep is the crawl allowed to proceed
     * @throws java.io.IOException
     */
    private void processFindFiles(File where, int maxDeep, FolderProvenance folder) throws Exception{
        final File[] files = where.listFiles();
        if(files != null){
            for (final File file : files) {
                if (file.isFile()){
                    FileToProcess fileToProcess = new FileToProcess(file, folder);
                    queue.add(fileToProcess);
                    filesTotal++;
                }else
                    if ((file.isDirectory())
                            &&( maxDeep-1 > 0 )){
                        // ignore intentionally the repository folders
                        if(isRepositoryFolder(file)){
                            continue;
                        }
                        // create a new folder object
                        FolderProvenance thisFolder = 
                                new FolderProvenance(folder, file.getName());
                        // add the folder to our list
                        folder.addFolder(thisFolder);
                        // do the recursive crawling
                        processFindFiles(file, maxDeep-1, thisFolder);
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
     * Adds the files within a folder to be processed
     * @param folderSource
     * @throws Exception 
     */
    public void addFolder(final File folderSource) throws Exception {
        baseFolder = folderSource.getAbsolutePath();
        this.processFindFiles(folderSource, 25, tree);
    }

    /**
     * Processes the files on the queue of this finder to expose licenses
     * and copyrights included
     * @throws java.lang.Exception
     */
    public void process() throws Exception {
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
     * @param fileToProcess     A file on disk
     */
    private void processFile(final FileToProcess fileToProcess) throws Exception {
        // increase the counter
        filesProcessed++;
        
        // avoid over-weight files
        if(fileToProcess.file.length() > maxFileSize){
            return;
        }
        // create the new file provenance
        final FileProvenance thisFile = new FileProvenance(fileToProcess.file, baseFolder);
        // add the file to the folder structure
        fileToProcess.folder.addFile(thisFile);
        // add the file to our flat list
        resultList.add(thisFile);
    }

    public int getFilesProcessed() {
        return filesProcessed;
    }

    public int getFilesTotal() {
        return filesTotal;
    }

    public BlockingQueue<FileProvenance> getResult() {
        return resultList;
    }
    
    /**
     *
     * @param params
     * @throws java.lang.Exception
     */
    public static void main(String[] params) throws Exception{
        
        //File folderSource = new File("../../source/linux-kernel");
        File folderSource = new File("../../source/corefx-master-2014-11-15");
        
        System.out.println("Discovering licenses on: " + folderSource.getPath());
        ProvenanceFinder finder = new ProvenanceFinder();
        finder.addFolder(folderSource);
        finder.process();
        System.out.println("All done, processed "
                + finder.filesProcessed
                + " files");
        
        //ProvenanceToConsole console = new ProvenanceToConsole(finder);
        //console.getOutput();
        
        System.exit(0);
    }

    
}

class FileToProcess{
    
    final File file;
    final FolderProvenance folder;
    
    FileToProcess(File thisFile, FolderProvenance thisFolder){
        file = thisFile;
        folder = thisFolder;
    }

}