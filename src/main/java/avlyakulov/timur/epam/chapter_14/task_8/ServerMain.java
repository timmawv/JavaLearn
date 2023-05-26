package avlyakulov.timur.epam.chapter_14.task_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerMain {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            Socket clientMessage = serverSocket.accept();
            BufferedReader readerFromSocket = new BufferedReader(new InputStreamReader(clientMessage.getInputStream()));
            String message;
            while (true) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                while ((message = readerFromSocket.readLine()) != null)
                    System.out.println(dtf.format(LocalDateTime.now()) + "\n" + message);
                System.out.println("Enter the message for client that you want to answer");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}