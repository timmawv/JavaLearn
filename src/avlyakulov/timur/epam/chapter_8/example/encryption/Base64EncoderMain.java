package avlyakulov.timur.epam.chapter_8.example.encryption;

import java.math.BigInteger;
import java.util.Base64;

public class Base64EncoderMain {
    public static void main(String[] args) {
        String encrypted = "Pass_1";
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytesEncoded = encoder.encode(encrypted.getBytes());
        BigInteger bigInt = new BigInteger(1,bytesEncoded);
        String resHex = bigInt.toString(16);
        System.out.println(resHex);
    }
}