package avlyakulov.timur.epam.chapter_14.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiveMessage {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 8082)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Message from another client is " + reader.readLine());
            System.out.println("Message was received");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}