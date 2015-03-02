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

package provenance;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import provenance.trigger.authorship.CopyrightDetector;
import provenance.trigger.licenses.Apache_v2;
import provenance.trigger.licenses.Artistic;
import provenance.trigger.licenses.EPL;
import provenance.trigger.licenses.EUPL;
import provenance.trigger.licenses.GNU;
import provenance.trigger.licenses.MPL;
import provenance.trigger.licenses.SPLv1;
import provenance.trigger.others.AutomatedCode;
import provenance.trigger.others.PublicDomain;
import provenance.trigger.licenses.BSD;
import provenance.trigger.licenses.MIT;

/**
 *
 * @author Nuno Brito, 14th of May 2014 in Darmstadt, Germany.
 */
public final class TriggerControl {
    
    private final ArrayList<Trigger> 
            listOriginal = new ArrayList();
    
    
    // do a byte copy of the array, avoid the references
    final ByteArrayOutputStream baos;
    ObjectOutputStream oos;
        
    
    public TriggerControl(){
        
        addTriggers();
        
        // do a physical byte copy (avoid JVM reference passing) to ensure
        // we always give a fresh copy of the initiated triggers
        baos = new ByteArrayOutputStream();
        try {
            // do a byte copy of the array, avoid the references
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
        
        listOriginal.add(new CopyrightDetector());
        listOriginal.add(new Apache_v2());
        listOriginal.add(new Artistic());
        listOriginal.add(new BSD());
        listOriginal.add(new EPL());
        listOriginal.add(new EUPL());
        listOriginal.add(new GNU());
        listOriginal.add(new MIT());
        listOriginal.add(new MPL());
        listOriginal.add(new SPLv1());
        listOriginal.add(new AutomatedCode());
        listOriginal.add(new PublicDomain());
        
//        File folderTriggers = new File(engine.getWorkFolder(), folder.triggers);
//        //log.write(is.INFO, "Adding triggers from %1", folderTriggers.getAbsolutePath());
//        final ArrayList<File> files = utils.files.findFilesFiltered(folderTriggers, ".java", 2);
//        for(File file : files){
//            //Trigger result = (Trigger) script.exec.runJava(file, is.trigger);
//            final Trigger result = (Trigger) utils.bytecode.getObject(file);
//            
//            if(result != null){
//                log.write(is.ADDING, "Trigger: " + result.getTriggerTitle());
//                listOriginal.add(result);
//            }
//        }
//        
//        // worry about the case when there is no folder nor triggers to include
//        if(listOriginal.isEmpty()){
//            log.write(is.WARNING, "No triggers were added, trigger detection "
//                    + "is disabled.");
//        }
    }

    /**
     * Gets a list of the currently active triggers
     * @return
     * @throws Exception 
     */
    public Iterable<Trigger> getList() throws Exception {
        // do a byte copy of the contents, avoid the JVM pointer references
        final ByteArrayInputStream bins = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream oins = new ObjectInputStream(bins);
        final ArrayList<Trigger> result = (ArrayList<Trigger>)oins.readObject();
        oins.close();
        return result;
    }

    /**
     * How many triggers to we have available?
     * @return the number of triggers 
     */
    public int size(){
        return listOriginal.size();
    }
    
    
}


