package avlyakulov.timur.epam.chapter_14.task_8;


import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Клиент выбирает изображение из списка и пересылает его другому клиенту через сервер.
public class ClientSenderFile {
    public static void main(String[] args) {
        File fileSend = new File("D://Загрузки/former1.mp4");
        try (FileInputStream inputStream = new FileInputStream(fileSend)) {
            byte[] data = new byte[1024];
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramPacket datagramPacket;
            System.out.println("Sending file...");
            while (inputStream.read(data) != -1) {
                datagramPacket = new DatagramPacket(data, data.length, inetAddress, 8045);
                datagramSocket.send(datagramPacket);
            }
            System.out.println("File was sent successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}