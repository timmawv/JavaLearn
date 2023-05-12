package avlyakulov.timur.epam.chapter_14.example.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
    private PrintStream printStream;//send
    private BufferedReader reader;//receive
    private InetAddress clientAddress;//client address

    public ServerThread(Socket socket) {
        try {
            printStream = new PrintStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        clientAddress = socket.getInetAddress();
    }

    public void run() {
        int counter = 0;
        String message;
        try {
            while ((message = reader.readLine()) != null) {
                if ("PING".equals(message))
                    printStream.println("PONG #" + ++counter);
                System.out.println("PING-PONG #" + counter + " from" + clientAddress.getHostName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            disconnect();
        }
    }

    private void disconnect() {
        if (printStream != null) {
            printStream.close();
        }
        try {
            if (reader != null) {
                reader.close();
            }
            System.out.println(clientAddress.getHostName() + ": disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}