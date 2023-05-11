package avlyakulov.timur.epam.chapter_14.example.URL;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UnCheckedHostMain {
    public static void main(String[] args) {
        //setting IP address as an array
        byte[] ip = {(byte) 216, (byte) 58, (byte) 215, (byte) 68};
        try {
            InetAddress address = InetAddress.getByAddress(ip);
            System.out.println(address.getHostName() + "-> connection: " + address.isReachable(1_000));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
