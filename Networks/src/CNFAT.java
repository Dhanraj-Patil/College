import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.IOException;
public class CNFAT {
    public static void main(String[] args) throws IOException{
//        System.out.println("Name: Dhanraj Patil\nRegistration No.: 20MIS0447");
        Scanner sc=new Scanner(System.in);
        InetAddress address=InetAddress.getLocalHost();
        DatagramSocket ds=new DatagramSocket();
        System.out.print("Enter a number: ");
        String n=sc.nextLine();
        byte [] number=n.getBytes(StandardCharsets.UTF_8);
        DatagramPacket dsend=new DatagramPacket(number,number.length,address,8080);
        ds.send(dsend);
        byte [] responce=new byte[1000];
        DatagramPacket drecieve=new DatagramPacket(responce,responce.length);
        ds.receive(drecieve);
        System.out.println("Armstrong number: "+convert(responce));
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
