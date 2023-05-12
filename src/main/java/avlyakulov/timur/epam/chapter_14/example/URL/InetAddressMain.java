package avlyakulov.timur.epam.chapter_14.example.URL;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

    public static void main(String[] args) {
        InetAddress currentIp;
        InetAddress google;
        try {
            currentIp = InetAddress.getLocalHost();
            System.out.println("currentIp => " + currentIp.getHostAddress());
            google = InetAddress.getByName("www.google.com");
            System.out.println("google => " + google.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
