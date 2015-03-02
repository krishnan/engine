/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T21:51:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Add data related to provenance. </text> 
 */

package provenance;

import java.util.ArrayList;

/**
 *
 * @author Nuno Brito, 2nd of March 2015 in Darmstadt, Germany
 */
public class FolderProvenance {

    private final ArrayList<FolderProvenance> 
            subfolders = new ArrayList();
    
    private final ArrayList<FileProvenance> 
            files = new ArrayList();

    private final FolderProvenance parentFolder;
    
    private final String name;
    
    /**
     * Constructor, define who is the parent for this folder. Use null if
     * this is the root node.
     * @param parent The parent folder
     * @param name The name used for this folder
     */
    public FolderProvenance(FolderProvenance parent, final String name){
        parentFolder = parent;
        this.name = name;
    }
    
    /**
     * A list with the sub-folders
     * @return 
     */
    public ArrayList<FolderProvenance> getSubFolders() {
        return subfolders;
    }
    
    /**
     * Adds a new sub-folder inside the current folder
     * @param folder 
     */
    public void addFolder(FolderProvenance folder){
        subfolders.add(folder);
    }
        
    /**
     * A list with the sub-folders
     * @return 
     */
    public ArrayList<FileProvenance> getFiles() {
        return files;
    }
    
    /**
     * Adds a new sub-folder inside the current folder
     * @param file 
     */
    public void addFile(FileProvenance file){
        files.add(file);
    }
    
}
