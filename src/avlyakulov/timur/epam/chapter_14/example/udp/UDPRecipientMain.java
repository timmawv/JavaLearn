package avlyakulov.timur.epam.chapter_14.example.udp;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;

public class UDPRecipientMain {
    final static int WAIT_TIMEOUT = 20_000;

    //прием файла по протоколу UDP
    public static void main(String[] args) {
        File file = new File("D:/Загрузки/exampleGet.txt");
        System.out.println("receiving data ...");
        acceptFile(file, 8033, 16384);
        System.out.println("data reception completed");
    }

    private static void acceptFile(File file, int port, int pacSize) {
        byte[] data = new byte[pacSize];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            DatagramSocket datagramSocket = new DatagramSocket(port);
            datagramSocket.setSoTimeout(WAIT_TIMEOUT);/* setting the timeout: if within 60 seconds no packets were received, data reception ends */
            while (true) {
                datagramSocket.receive(packet);
                outputStream.write(data);
                outputStream.flush();//sending file
                //flush записывает то, что ты уже передал с помощью метода write.
                // Просто фактическая запись в файл не обязательно будет происходить сразу после вызова write, данные для записи могут попадать в буфер.
                // А при вызове flush они будут из этого буфера записываться в сам файл.
            }
        } catch (SocketTimeoutException e) {
            System.err.println("Timed out, data reception is finished:" + e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}