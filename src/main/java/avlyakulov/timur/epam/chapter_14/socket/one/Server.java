package avlyakulov.timur.epam.chapter_14.socket.one;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8083);
        Socket input = serverSocket.accept();
        Scanner in = new Scanner(input.getInputStream());
        PrintWriter clientAnswer = new PrintWriter(input.getOutputStream());
        while(in.hasNext())
            System.out.println(in.nextLine());
        clientAnswer.close();
        in.close();
        input.close();
        serverSocket.close();
    }
}