/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-09-17T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileName: NodeType.java  
 * FileType: SOURCE
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Helps to define which types of tree nodes we use </text> 
 */
package definitions.structure;


public enum NodeType {

    none, // nothing, just empty data
    root, // the first node on top of the tree
    sectionCreator, // section with SPDX creation details
    sectionPackage,
    sectionFile,
    sectionExport,
    sectionSettings,
    sectionComponents,
    dependency,
    reportsHome,
    person, // this node holds data about a person
    file, // this node represents a file from the SPDX document
    home, // represents the home directory
    other, // something else not explained here
    folder,  // a simple folder on disk
    SPDX, // represents an SPDX document 
    
}
