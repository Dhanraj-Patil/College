import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
public class RARPUDPclient {
    public static void main(String [] args) throws IOException{
        DatagramSocket ds=new DatagramSocket();
        InetAddress add=InetAddress.getLocalHost();
        String MAC="18-26-49-3F-F5-CA";
        System.out.println("Mac address: "+MAC);
        byte [] mac=MAC.getBytes(StandardCharsets.UTF_8);
        DatagramPacket dsend=new DatagramPacket(mac,mac.length,add,8080);
        ds.send(dsend);
        byte[] message=new byte[1000];
        DatagramPacket dreceive=new DatagramPacket(message,message.length);
        ds.receive(dreceive);
        System.out.println("IP address: "+convert(message));
    }
    public static StringBuilder convert(byte []a){
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
