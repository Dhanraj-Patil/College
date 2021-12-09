import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class UDPServer {
    public static void main(String [] args)throws IOException{
        System.out.println("Server Running Dhanraj 20MIS0447");
        DatagramSocket ds = new DatagramSocket(8080);
        Date date=new Date();
        String d=date.toString();
        System.out.println(d);
        byte[] message = d.getBytes(StandardCharsets.UTF_8);
        byte[] msg=new byte[1000];
        DatagramPacket packet = new DatagramPacket(msg, msg.length);
        ds.receive(packet);
        DatagramPacket dpSend = new DatagramPacket(message,message.length, packet.getAddress(), packet.getPort());
        ds.send(dpSend);
    }
}
