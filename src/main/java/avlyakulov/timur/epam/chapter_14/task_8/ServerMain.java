package avlyakulov.timur.epam.chapter_14.task_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            Socket clientMessage = serverSocket.accept();
            BufferedReader readerFromSocket = new BufferedReader(new InputStreamReader(clientMessage.getInputStream()));
            while (readerFromSocket.ready())
                System.out.println(readerFromSocket.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}