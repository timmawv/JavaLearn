package avlyakulov.timur.epam.chapter_14.example.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSocket {
    public static void main(String[] args) {
        System.out.println("server starts");
        try (ServerSocket serverSocket = new ServerSocket(2048)) {
            Socket clientSocket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            printWriter.println("java guide!!!! Wow it is so amazing"); // put String into the buffer
            printWriter.flush();//send the contents of the buffer to the client
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("server is closed ");
    }
}