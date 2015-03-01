/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2014-05-14T16:39:10Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: TriggerControl.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2014 Nuno Brito, TripleCheck </text>
 * FileComment: <text> The manager for triggers that detect licenses and 
    other details inside source code files.</text> 
 */

package structure;

import definitions.folder;
import definitions.is;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.engine;
import script.Trigger;
import script.log;

/**
 *
 * @author Nuno Brito, 14th of May 2014 in Darmstadt, Germany.
 */
public final class TriggerControl {
    
    private final ArrayList<Trigger> 
            listOriginal = new ArrayList();
    
    
    // do a byte copy of the array, avoid the references
    ByteArrayOutputStream baos;
    ObjectOutputStream oos;
        
    
    public TriggerControl(){
        
        addTriggers();
            
        try {
            
            // do a byte copy of the array, avoid the references
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            // write the array to memory
            oos.writeObject(listOriginal);
            oos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TriggerControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     /**
     * This method adds up all the triggers found on the triggers folder
     */
    private void addTriggers(){
        File folderTriggers = new File(engine.getWorkFolder(), folder.triggers);
        //log.write(is.INFO, "Adding triggers from %1", folderTriggers.getAbsolutePath());
        ArrayList<File> files = utils.files.findFilesFiltered(folderTriggers, ".java", 2);
        for(File file : files){
            //Trigger result = (Trigger) script.exec.runJava(file, is.trigger);
            Trigger result = (Trigger) utils.bytecode.getObject(file);
            
            if(result != null){
                log.write(is.ADDING, "Trigger: " + result.getTriggerTitle());
                listOriginal.add(result);
            }
        }
        
         // worry about the case when there is no folder nor triggers to include
        if(listOriginal.isEmpty()){
            log.write(is.WARNING, "No triggers were added, "
                    + "trigger detection is disabled.");
        }
        
    }

    /**
     * Gets a list of the currently active triggers
     * @return
     * @throws Exception 
     */
    public Iterable<Trigger> getList() throws Exception {
        ByteArrayInputStream bins = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream oins = new ObjectInputStream(bins);
        ArrayList<Trigger> ret =  (ArrayList<Trigger>)oins.readObject();
        oins.close();
        return ret;
    }

    /**
     * How many triggers to we have available?
     * @return the number of triggers 
     */
    public int size(){
        return listOriginal.size();
    }
    
    
}


