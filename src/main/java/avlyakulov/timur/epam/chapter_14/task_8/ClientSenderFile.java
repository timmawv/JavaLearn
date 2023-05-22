package avlyakulov.timur.epam.chapter_14.task_8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//Клиент выбирает изображение из списка и пересылает его другому клиенту через сервер.
public class ClientSenderFile {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8082);
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
             BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter message for client that you want to send");
            String message = readerFromConsole.readLine();
            printWriter.println(message);
            printWriter.flush();
            System.out.println("The message for client was sent");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}