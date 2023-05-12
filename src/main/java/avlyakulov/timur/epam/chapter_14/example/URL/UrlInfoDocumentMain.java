package avlyakulov.timur.epam.chapter_14.example.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfoDocumentMain {
    public static void main(String[] args) {
        String urlName = "https://logging.apache.org/log4j/2.x/download.html";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(urlName).openStream()))) {
            URL url = new URL(urlName);
            System.out.println("protocol - " + url.getProtocol());
            System.out.println("host - " + url.getHost());
            System.out.println("port - " + url.getPort());
            System.out.println("file - " + url.getFile());
            reader.lines().forEach(System.out::println); // reading content
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
