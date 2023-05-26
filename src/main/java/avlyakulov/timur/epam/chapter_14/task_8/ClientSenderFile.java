package avlyakulov.timur.epam.chapter_14.task_8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Клиент выбирает изображение из списка и пересылает его другому клиенту через сервер.
public class ClientSenderFile {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8082);
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
             BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Enter message for server that you want to send");
                String message = readerFromConsole.readLine();
                printWriter.println(message);
                printWriter.flush();
                System.out.println("The message for client was sent");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                BufferedReader readerFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("The message from server ");
                System.out.println(dtf.format(LocalDateTime.now()) + "\n" + readerFromServer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}