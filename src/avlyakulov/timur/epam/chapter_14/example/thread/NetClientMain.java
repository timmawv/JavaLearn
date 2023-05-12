package avlyakulov.timur.epam.chapter_14.example.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClientMain {
    //получение и передача сообщения клиентом в потоке
    final static int TIMEOUT_IN_MILLIS = 1_000;
    final static int MAX_PING = 10;
    final static String ORIGINAL_MESSAGE = "PING";

    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 8071);
             PrintStream printStream = new PrintStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            for (int i = 0; i < MAX_PING; ++i) {
                printStream.println(ORIGINAL_MESSAGE);
                System.out.println(reader.readLine());
                Thread.sleep(TIMEOUT_IN_MILLIS);
            }
        } catch (UnknownHostException e) {
            System.err.println("Connection refused:" + e); // not connect to the server
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}