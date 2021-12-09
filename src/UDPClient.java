import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class UDPClient {
public static void main(String [] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    InetAddress add = InetAddress.getLocalHost();
    System.out.println("Dhanraj 20MIS0447 ");
    String chat = "hi";
    byte[] data = chat.getBytes(StandardCharsets.UTF_8);
    DatagramPacket packet = new DatagramPacket(data, data.length, add, 8080);
    ds.send(packet);
    byte[] message = new byte[10000];
    DatagramPacket dpReceive = new DatagramPacket(message, message.length);
    ds.receive(dpReceive);
    System.out.println("Today's date is :"+convert(message));
    }
    public static StringBuilder convert(byte[] a){
        if (a == null)
            return null;
        StringBuilder build = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            build.append((char) a[i]);
            i++;
        }
        return build;
    }
}
