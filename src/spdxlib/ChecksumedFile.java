/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-02-19T18:57:00Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito, TripleCheck </text>
 * FileComment: <text> Perform the checksum operations related to a file.</text> 
 */

package spdxlib;

import definitions.is;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import utils.hashing.TLSH;
import utils.hashing.ssdeep.ssdeep;

/**
 *
 * @author Nuno Brito, 19th of February 2015 in Tettnang, Germany
 */
public class ChecksumedFile {


    final String 
            TLSH,
            SHA1,
            SHA256,
            MD5;
        
    public ChecksumedFile(final File file) throws Exception{
        
        final MessageDigest 
                hashSHA1 = MessageDigest.getInstance("SHA-1"),
                hashMD5 = MessageDigest.getInstance("MD5"),
                hashSHA256 = MessageDigest.getInstance("SHA-256");

        final TLSH tlsh = new TLSH();
        
        byte[] buffer = new byte[16384];
        int len;
        InputStream inputStream = new FileInputStream(file);
        // main loop of byte copy
        while((len = inputStream.read(buffer)) >= 0){
            // update the hash for the signature hash (typically SHA1)
            hashSHA1.update(buffer, 0, len);
            hashMD5.update(buffer, 0, len);
            hashSHA256.update(buffer, 0, len);
            tlsh.update(buffer);
        }
        // compute the file signature
        byte[] 
                digestSHA1 = hashSHA1.digest(),
                digestMD5 = hashMD5.digest(),
                digestSHA256 = hashSHA256.digest();
        tlsh.finale();
        
        TLSH = is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumTLSH
                        .concat(" ".concat(
                                tlsh.hash()
                                .concat("\n")
                        )
                )));

        SHA1 = is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumSHA1
                        .concat(" ".concat(
                                utils.hashing.checksum.convertHash(digestSHA1)
                                .concat("\n"
                        ))
                )));
        
        SHA256 = is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumSHA256
                        .concat(" ".concat(
                                utils.hashing.checksum.convertHash(digestSHA256)
                                .concat("\n"
                        ))
                )));
        
        MD5 = is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumMD5
                        .concat(" ".concat(
                                utils.hashing.checksum.convertHash(digestMD5)
                                .concat("\n")
                        )
                )));
    }
    
     
    /**
     * Returns the TLSH checksum for a given file
     * @param file  A file on disk
     * @return      A string with the hash representation of the file
     */
    private String getSSDEEP(final File file){
    // compute our TLSH hashes
        ssdeep test = new ssdeep();
        try {
            return test.fuzzy_hash_file(file);
        } catch (IOException ex) {
            return "NOASSERTION";
        }
    }

    
    
}
