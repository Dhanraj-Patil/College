import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class RARPUDPserver {
    public static void main(String [] args) throws IOException{
        DatagramSocket ds=new DatagramSocket(8080);
        byte[] message=new byte[1000];
        DatagramPacket dreceive=new DatagramPacket(message,message.length);
        ds.receive(dreceive);
        String IP="192.168.1.5";
        byte [] ip=IP.getBytes(StandardCharsets.UTF_8);
        String mac="18-26-49-3F-F5-CA";
        if(convert(message).equals(mac)){
            DatagramPacket dsend=new DatagramPacket(ip,ip.length,dreceive.getAddress(),dreceive.getPort());
        }
    }
    public static StringBuilder convert(byte[]a){
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
