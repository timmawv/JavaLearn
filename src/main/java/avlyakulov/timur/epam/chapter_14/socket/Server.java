package avlyakulov.timur.epam.chapter_14.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();
        Scanner in = new Scanner(input.getInputStream());
        while(in.hasNext())
            System.out.println(in.nextLine());
        in.close();
        input.close();
        serverSocket.close();
    }
}