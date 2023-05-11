package avlyakulov.timur.epam.chapter_14.example.URL;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionFull {
    public static void main(String[] args) {
        //информация об интернет-ресурсе
        String urlName = "https://www.google.com";
        int timeout = 10_000_000;
        try {
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(timeout);//set timeout for connection
            connection.connect();
            System.out.println(urlName + "::    content type   " + connection.getContentType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
