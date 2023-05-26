package avlyakulov.timur.epam.chapter_14.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerRespond {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader readerFromSocket = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writerServer = new PrintWriter(clientSocket.getOutputStream());
            while (true) {
                System.out.println("Message from client");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                System.out.println(dtf.format(LocalDateTime.now()) + "\n" + readerFromSocket.readLine());
                System.out.println("Enter the message for client that you want to answer");
                String messageClient = readerConsole.readLine();
                writerServer.println(messageClient);
                writerServer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}