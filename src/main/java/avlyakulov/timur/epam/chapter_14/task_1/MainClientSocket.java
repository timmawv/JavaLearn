package avlyakulov.timur.epam.chapter_14.task_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClientSocket {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 8082)) {
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            printWriter.println("Hello it is simple message for another client");
            printWriter.flush();
            System.out.println("Message was sent to server");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}