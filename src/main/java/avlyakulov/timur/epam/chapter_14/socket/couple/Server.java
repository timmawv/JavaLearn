package avlyakulov.timur.epam.chapter_14.socket.couple;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8085)) {
            while (true) {
                Socket socket = serverSocket.accept();
                Thread t = new Thread(new ClientHandler(socket));
                t.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ClientHandler implements Runnable {
    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner in = new Scanner(socket.getInputStream());
             PrintWriter out = new PrintWriter(socket.getOutputStream());
             Scanner send = new Scanner(System.in)) {
            while (in.hasNext()) {
                System.out.println("Data is come from client: ");
                System.out.println(in.nextLine());
                System.out.println("Write what you want send to client:");
                String s = send.nextLine();
                out.println(s);
                out.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}