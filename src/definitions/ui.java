/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2013-09-18T00:00:00Z
 * LicenseName: AGPL-3.0+
 * FileCopyrightText: <text> Copyright 2013 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Helps to indicate the different types of user 
 * interfaces available. </text>
 */
package definitions;

/**
 *
 * @author Nuno Brito, 18th of April 2013 in Darmstadt, Germany
 */
public class ui {
    public final static int
            CLI = 0, // basic mode, always available
            GUI = 2, // graphical user interface   
            WEB = 4  // web user interface
            ;
}
