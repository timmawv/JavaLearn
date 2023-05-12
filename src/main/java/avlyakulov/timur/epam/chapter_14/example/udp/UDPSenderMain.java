package avlyakulov.timur.epam.chapter_14.example.udp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;

public class UDPSenderMain {
    //передача данных по протоколу UDP
    public static void main(String[] args) {
        String fileName = "D:/Загрузки/example.txt";
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] data = new byte[16384];
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramPacket packet;
            System.out.println("sending file...");
            while (inputStream.read(data) != -1) {
                packet = new DatagramPacket(data,data.length,inetAddress,8033);
                datagramSocket.send(packet);//data sending
            }
            System.out.println("file sent successfully");
        } catch (UnknownHostException e) {
            e.printStackTrace(); // invalid recipient address
        } catch (SocketException e) { // errors during data transfer
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
