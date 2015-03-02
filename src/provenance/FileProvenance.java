/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Nuno Brito (nuno.brito@triplecheck.de)
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-03-02T07:07:01Z
 * LicenseName: EUPL-1.1-without-appendix
 * FileCopyrightText: <text> Add data related to provenance. </text> 
 */

package provenance;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import main.engine;
import utils.hashing.TLSH;

/**
 *
 * @author Nuno Brito, 1st of March 2015 in Darmstadt, Germany
 */
public class FileProvenance {
  
    public final String 
            TLSH,
            SHA1,
            SHA256,
            MD5,
            
            filename;
    
    private final int
            // the minimum size that we need for computing a TLSH checksum
            minSizeTLSH = 16384;
    
    private final long 
            size,
            LOC;
    
    private final String
            fileExtension;
    
    private final ArrayList<String>
            licenses = new ArrayList(),
            copyright = new ArrayList();
    
    public FileProvenance(final File file, final String baseFolder) throws Exception{

        this.size = file.length();
        
        final MessageDigest 
                hashSHA1 = MessageDigest.getInstance("SHA-1"),
                hashMD5 = MessageDigest.getInstance("MD5"),
                hashSHA256 = MessageDigest.getInstance("SHA-256");

        final TLSH tlsh = new TLSH();
        final StringBuilder content = new StringBuilder();
        
        final byte[] buffer = new byte[16384];
        int len;
        int countLOC = 0;
        final InputStream inputStream = new FileInputStream(file);
        // main loop of byte copy, calculate all checksums together
        while((len = inputStream.read(buffer)) >= 0){
            // update the hash for the signature hash (typically SHA1)
            hashSHA1.update(buffer, 0, len);
            hashMD5.update(buffer, 0, len);
            hashSHA256.update(buffer, 0, len);
            tlsh.update(buffer);
            content.append(new String(buffer, 0, len));
            // count the lines of code
            for(byte b : buffer){
                if(b == '\n'){
                   countLOC++; 
                }
            }
        }
        
        LOC = countLOC;
        
        // no need to keep this stream open
        inputStream.close();
        
        // compute the file signature
        final byte[] 
            digestSHA1 = hashSHA1.digest(),
            digestMD5 = hashMD5.digest(),
            digestSHA256 = hashSHA256.digest();
        
        tlsh.finale();
        
        TLSH = tlsh.hash();
        SHA1 = utils.hashing.checksum.convertHash(digestSHA1);
        SHA256 = utils.hashing.checksum.convertHash(digestSHA256);
        MD5 = utils.hashing.checksum.convertHash(digestMD5);
        
        // try to assign only a relative path, not the full path
        if(baseFolder == null || baseFolder.isEmpty()){
            this.filename = file.getName();
        }else{
            this.filename = file.getAbsolutePath().replace(baseFolder, ".");
        }
        
        // define the file extension
        fileExtension = utils.files.getExtension(file).toLowerCase();
        //FileExtension extensionType = engine.extensions.get(extension);
        
        // avoid small files
        if(content.length() < 100){
            return;
        }
        
        // read this file from disk onto local memory
        final String contentLowerCase = content.toString().toLowerCase();
        
        // proceed to trigger detection
        for(Trigger thisTrigger: engine.triggers.getList()){
            processTriggers(thisTrigger, TLSH, contentLowerCase);
        }
        
    }

    /**
     * Where we process each of the different trigger types
     * @param thisTrigger
     * @param content
     * @param contentLowerCase 
     */
    private void processTriggers(final Trigger thisTrigger,
            final String content, final String contentLowerCase){
        // does our text contains an applicable trigger?
        if(thisTrigger.isApplicable(content, contentLowerCase)==false){
            return;
        }
        // handle each type of trigger that we can find
        switch(thisTrigger.getType()){
            case LICENSE:
                licenses.addAll(thisTrigger.getResult().getData());
                break;
            case COPYRIGHT:
                copyright.addAll(thisTrigger.getResult().getData());
                break;
        }
    }
    
    public String getFileExtension() {
        return fileExtension;
    }

    public String getTLSH() {
        if(size < minSizeTLSH){
            return "";
        }
        return TLSH;
    }

    public String getSHA1() {
        return SHA1;
    }

    public String getSHA256() {
        return SHA256;
    }

    public String getMD5() {
        return MD5;
    }

    public String getFilename() {
        return filename;
    }

    public long getSize() {
        return size;
    }

    public ArrayList<String> getLicenses() {
        return licenses;
    }

    public ArrayList<String> getCopyright() {
        return copyright;
    }

    
}
