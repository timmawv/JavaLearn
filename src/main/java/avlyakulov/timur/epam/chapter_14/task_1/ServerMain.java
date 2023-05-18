package avlyakulov.timur.epam.chapter_14.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    //Клиент посылает через сервер сообщение другому клиенту, выбранному из списка.
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            Socket clientSocket = serverSocket.accept();//установка соеденения
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            System.out.println("Message you received " + message);
            System.out.println("Now we are waiting for another client on socket");
            Socket sendClientSocket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(sendClientSocket.getOutputStream());
            printWriter.println(message);
            printWriter.flush();
            System.out.println("Message was sent");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
