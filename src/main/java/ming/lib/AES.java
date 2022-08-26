package main.java.ming.lib;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 

public class AES {

    protected static SecretKeySpec secretKey;
    protected static byte[] key;

    public AES() {

    }

    public String toHexString() {
        BigInteger number = new BigInteger(1, key);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }

    public void GenerateKey(String mypass) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            key = md.digest(mypass.getBytes(StandardCharsets.UTF_8));
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
