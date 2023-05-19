package avlyakulov.timur.epam.chapter_14.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println("Hello world!");
        out.println("It is simple example");
        out.close();
        socket.close();
    }
}