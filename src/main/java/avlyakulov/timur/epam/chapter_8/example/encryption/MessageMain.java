package avlyakulov.timur.epam.chapter_8.example.encryption;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageMain {
    public static void main(String[] args) {
        //шифрование с SHA-1
        String encrypted = "Pass_1";
        MessageDigest messageDigest = null;
        byte[] bytesEncoded = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");// only once !
            messageDigest.update(encrypted.getBytes(StandardCharsets.UTF_8));
            bytesEncoded = messageDigest.digest();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BigInteger bigInt = new BigInteger(1,bytesEncoded);// 1 (sing+) or -1 (sign-)
        String resHex = bigInt.toString(16);
        System.out.println(resHex);
    }
}