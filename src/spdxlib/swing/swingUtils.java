/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-09-01T00:00:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileName: swingUtils.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Fast access to common GUI swingUtils </text> 
 */
package spdxlib.swing;

import definitions.is;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import main.engine;
import script.log;
import spdxlib.FileInfo2;
import spdxlib.SPDXfile2;
import utils.www.html;


public class swingUtils {

    
    /**
     * Shows the dialog to allow selecting a folder
     * @param startInFolder
     * @param key Which key will this value be written at?
     * @return 
     */
    public static File chooseFolder(File startInFolder, String key){
        JFileChooser fc = new JFileChooser();
            fc.setMultiSelectionEnabled(false);
            // only show directories
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            // check if the last used folder still exists
            if((startInFolder!=null)&&(startInFolder.exists())){
                // start from the previous folder if possible
                fc.setCurrentDirectory(startInFolder);
            }

        fc.setDialogTitle("Open directory");
        // open up the dialog
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return null;
        }
        
        // write the key
        if(key.isEmpty() == false){
            engine.settings.write(key, fc.getSelectedFile().getAbsolutePath());
        }
            
        log.write(is.ACCEPTED, "Folder chosen: %1"
                ,fc.getSelectedFile().getAbsolutePath());
        
        // grab the file
        return fc.getSelectedFile();
    }
    
   
    
    /**
     * Get the currently selected node from a given tree
     * @param tree The tree box on the left side of the default UI
     * @return The currently selected node or null if nothing selected
     */
    public static TreeNodeSPDX getSelectedNode(JTree tree){
        // preflight checks
        TreeNodeSPDX result;
        try{
            result =  
                (TreeNodeSPDX) tree.getSelectionPath().getLastPathComponent();
        }catch (Exception e){
            //e.printStackTrace();
            return null;
        }
    return result;
    }
    
    /**
     * Get the currently selected node from a given tree
     * @param tree The tree box on the left side of the default UI
     * @return The currently selected node or null if nothing selected
     */
    public static ArrayList<TreeNodeSPDX> getSelectedNodes(JTree tree){
        // preflight checks
        ArrayList<TreeNodeSPDX> result = new ArrayList();
        
        //TreeNodeSPDX pathw = (TreeNodeSPDX) tree.getSelectionPath().getLastPathComponent();
        
        try{
            for(TreePath path : tree.getSelectionPaths()){
                TreeNodeSPDX node = (TreeNodeSPDX) path.getLastPathComponent();
                //if(filter != null && node.nodeType == filter)
                result.add(node);
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    return result;
    }
    
    
  
    
    /**
     * Method to ease the creation of new nodes on the tree list
     * @param title the title of this node that is present to the public
     * @param root the parent of the new node to be created
     * @return the new node
     */
    static public TreeNodeSPDX createNodeChild(String title, TreeNodeSPDX root){
        TreeNodeSPDX node =
            new TreeNodeSPDX(title);
        root.add(node); 
        return node;
    }
    
    /**
      * Adds the output when the given tag is not null
     * @param title the title of this entry
     * @param text
     * @return a printable string using the format "key: value"
      */
    static public String addIfNotEmpty(String title, String text){
        // preflight checks
        if(text.isEmpty()){
            return "";
        }
        if(title.isEmpty()){
            return "";
        }
        String result = ""
                + "<b>" 
                + title 
                + "</b>"
                + ": "
                //+ "<PLAINTEXT>" 
                //+ "<pre>" 
                + text
                //+ "</pre>"
                //+ "</PLAINTEXT>"
                //+ "<br>"
                //+ "<br>"
                + html.br;
        return result;
    }
    
    /**
     * Creates a new node on our tree list
     * @param title the readable title of this node
     * @param nodeType category of this node
     * @param root the node where all other nodes will created as child
     * @return a node fully configured
     */
    public static TreeNodeSPDX nodeCreate(String title, NodeType nodeType,
            TreeNodeSPDX root){
            TreeNodeSPDX node = swingUtils.createNodeChild(title,root);
            node.nodeType = nodeType;
            node.id = title;
            return node;
    }
    
    
    
    /**
     * Add the basic root node to a treeview
     * @param tree The treeview that we want to target
     */
    public static void nodeAddRoot(JTree tree){
     // tree hook
        tree.setCellRenderer(new TreeRenderer()); 
        //Create the nodes.
        TreeNodeSPDX nodeRoot =
            new TreeNodeSPDX("root");
        nodeRoot.id = "Root";
        DefaultTreeModel treeModel = new DefaultTreeModel(nodeRoot);
        tree.setModel(treeModel);
    }
    
    
    
    
    /**
     * Adds the details of the creation info
     */
    static void doNodeCreationInfo(TreeNodeSPDX root, SPDXfile2 spdx){
        
        TreeNodeSPDX node = swingUtils.createNodeChild("",root);
        node.nodeType = NodeType.sectionCreator;
        node.id = "Creator";
//        node.setUserObject(spdx.creatorSection);
//        
//        // now, create a node for each author
//        for(Person person : spdx.creatorSection.people){
//            swingUtils.addNodePerson(node, person);
//        }
    }
    
    /**
     * Add the node of files if there are any available
     */
    static void doNodeFileInfo(TreeNodeSPDX root, SPDXfile2 spdx){
        
        int fileCount = spdx.getFiles().size();
        String counter = (fileCount > 0) ? " (" + fileCount + ")" : "";        
        
        TreeNodeSPDX node = swingUtils.createNodeChild("Files" + counter,root);
        node.nodeType = NodeType.sectionFile;
        node.id = "Files";
        
        for(FileInfo2 file : spdx.getFiles()){
            TreeNodeSPDX fileNode 
                    = swingUtils.createNodeChild(
                    "" // name is inherited from toString() of the file object
                    , node);
            // define this node as a normal file
            fileNode.nodeType = NodeType.file;
            fileNode.id = file.getFileName();
            fileNode.setUserObject(file);
        }
        
    }  
    
    
//    /**
//     * Add nodes with the dependencies required for the SPDX package
//     */
//    static void doNodeDependencies(TreeNodeSPDX root, SPDXfile2 spdx){
//        TreeNodeSPDX node = swingUtils.createNodeChild(
//                "Dependencies ("
//                + spdx.packageSection.dependencies.size()
//                + ")"
//                ,root);
//        node.id = "Dependencies";
//        
//        for(TagValue dep : spdx.packageSection.dependencies){
//            //System.err.println("FG09 - Added a dependency");
//            TreeNodeSPDX depNode 
//                    = swingUtils.createNodeChild(
//                    dep.toString() // name is inherited from toString() of the file object
//                    , node);
//            // define this node as a normal file
//            depNode.nodeType = NodeType.dependency;
//            depNode.id = dep.toString();
//            depNode.setIcon("box.png");
//            depNode.setUserObject(dep);
//        }
//    }
   
    
  
    
     /**
      * Using the node currently selected on tree view, iterate
      * each node one level below until a package node is found
     * @param tree Where all the items are located on our UI
     * @return The SPDXfile node object
      */
     public static TreeNodeSPDX getNodePackage(JTree tree){
         TreeNodeSPDX node = swingUtils.getSelectedNode(tree);
         // preflight check
         if(node == null){
             return null;
         }
         
        // get the root package node
        while((node.getParent() != null)
                &&(node.nodeType != NodeType.sectionPackage)){
            node = (TreeNodeSPDX) node.getParent();
        }
        // extra safety check
        if(node.nodeType != NodeType.sectionPackage){
            return null;
        } 
        
        return node;
     }
     
   
     
    

    
    
    
//    // find all components inside our common library
//        File baseFolder = new File(".");
////        engine.components = actions.findSPDX(new File(baseFolder, 
////                is.library));
//        // now find our reports
//        engine.reports = actions.findSPDX(new File(baseFolder, 
//                is.reports));
//        
//        // get the current UID of the selected node
//        if(UID.isEmpty()){
//            TreeNodeSPDX currentNode = swingUtils.getSelectedNode();
//            if(currentNode != null){
//                // the ID of currently selected node 
//                UID = currentNode.getUID();
//            }
//        }
//        // write our results on the tree
//        populateTree(tree);
//        
//        // get the list of RunPlugins going
//        RunPlugins.listPlugins();
//        log.write(is.INFO, Messages.ReadyToUse);
//        
//        // get back to the previoulsy selected node
//        swingUtils.setSelectedNode(UID);
//        // refresh things up
//        tree.repaint();
//        swingUtils.refreshTextBox();
  
    
    
   

   
 
    

    
      /**
     * SSDEEP is an object that needs to be handled separately since it includes
     * chars that confuse the interpreter
     * @param title Title to be used on the text
     * @param file The FileInfo object that contains SSDEEP information
     * @return 
     */
    public static String addSSDEEP(String title, FileInfo2 file) {
        // get the contents of this tag
        String text = file.getTagFileChecksumSSDEEP();
        return swingUtils.addIfNotEmpty(title, text);
    } 
    
    
     
    
   
    /**
     * Returns the node that is the root of a given treeview 
     * @param tree JTree object where all nodes are placed
     * @return the root node or null if it does not exist
     */
    public static TreeNodeSPDX getRootNode(JTree tree){
   // avoid empty null objects when there is nothing on the tree
        if(tree.getModel().getRoot()==null){
            return null;
        }
        TreeNodeSPDX nodeRoot = (TreeNodeSPDX) tree.getModel().getRoot();
    return nodeRoot;
    }
    
   
    
    
}
