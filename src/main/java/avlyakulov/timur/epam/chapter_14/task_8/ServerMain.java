package avlyakulov.timur.epam.chapter_14.task_8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerMain {
    //прием файла по протоколу UDP
    public static void main(String[] args) {
        File fileReceive = new File("D://Загрузки/newFormer.mp4");
        System.out.println("Receiving data...");
        acceptFile(fileReceive, 8045, 1024);
        System.out.println("Data transfer was completed");
    }

    public static void acceptFile(File file, int port, int pacSize) {
        byte[] data = new byte[pacSize];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            DatagramSocket datagramSocket = new DatagramSocket(port);
            datagramSocket.setSoTimeout(60_000); /* setting the timeout: if within 60 seconds no packets were received, data reception ends */
            while (true) {
                datagramSocket.receive(packet);
                outputStream.write(data);
                outputStream.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}