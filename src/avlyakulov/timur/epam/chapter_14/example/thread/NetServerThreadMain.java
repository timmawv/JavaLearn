package avlyakulov.timur.epam.chapter_14.example.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerThreadMain {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8071);
            System.out.println(serverSocket.getInetAddress() + " server started");
            while (true) {
                Socket socket = serverSocket.accept();//waiting for a new client
                System.out.println(socket.getInetAddress().getHostName() + " connected");
                // create a separate stream for data exchange with the connected client
                ServerThread thread = new ServerThread(socket);
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
