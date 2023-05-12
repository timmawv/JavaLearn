package avlyakulov.timur.epam.chapter_14.example.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClientSocket {
    public static void main(String[] args) {
        //получение клиентом строки
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 2048)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            System.out.println("message received :" + message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
