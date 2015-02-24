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
import java.io.InputStream;
import java.security.MessageDigest;
import tokenizator.BinaryFile;
import utils.hashing.TLSH;

/**
 *
 * @author Nuno Brito, 19th of February 2015 in Tettnang, Germany
 */
public class ChecksumFile extends BinaryFile {

    public final String 
            TLSH,
            SHA1,
            SHA256,
            MD5;
    
    private final String
            fileExtension;
        
    public ChecksumFile(final File file) throws Exception{
        // assign the file
        this.file = file;
        
        final MessageDigest 
                hashSHA1 = MessageDigest.getInstance("SHA-1"),
                hashMD5 = MessageDigest.getInstance("MD5"),
                hashSHA256 = MessageDigest.getInstance("SHA-256");

        final TLSH tlsh = new TLSH();
        
        final byte[] buffer = new byte[16384];
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
        
        TLSH = tlsh.hash();
        SHA1 = utils.hashing.checksum.convertHash(digestSHA1);
        SHA256 = utils.hashing.checksum.convertHash(digestSHA256);
        MD5 = utils.hashing.checksum.convertHash(digestMD5);
        
        // set the identifier hash 
        this.identifierHash = SHA1;
        
        // define the file extension
        final int lastDot = file.getAbsolutePath().lastIndexOf(".");
        fileExtension = file.getAbsolutePath().substring(lastDot+1).toLowerCase();
        
        // no need to keep this stream open
        inputStream.close();
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public String getTLSH() {
        return is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumTLSH
                        .concat(" ".concat(
                                TLSH
                                .concat("\n")
                        )
                )));
    }

    public String getSHA1() {
        return is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumSHA1
                        .concat(" ".concat(
                                SHA1
                                .concat("\n"
                        ))
                )));
    }

    public String getSHA256() {
        return is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumSHA256
                        .concat(" ".concat(
                                SHA256
                                .concat("\n"
                        ))
                )));
    }

    public String getMD5() {
        return is.tagFileChecksum
                .concat(" ".concat(is.tagFileChecksumMD5
                        .concat(" ".concat(
                                MD5
                                .concat("\n")
                        )
                )));
    }
    
    
    
}
