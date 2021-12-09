import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class CNFATServer {
    public static void main(String [] args) throws IOException{
        System.out.println("Name: Dhanraj Patil\nRegistration No.: 20MIS0447");
        System.out.println("Server running on Port 8080");
        DatagramSocket ds=new DatagramSocket(8080);
        byte [] year=new byte[1000];
        DatagramPacket drecieve=new DatagramPacket(year,year.length);
        ds.receive(drecieve);
        System.out.println(convert(year));
        String ans=answer(convert(year));
        byte [] responce=ans.getBytes(StandardCharsets.UTF_8);
        DatagramPacket dsend=new DatagramPacket(responce,responce.length,drecieve.getAddress(),drecieve.getPort());
        ds.send(dsend);
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
    public static String answer(StringBuilder y){
        int year=Integer.parseInt(String.valueOf(y));
        if(year%4==0){
            return "Yes";
        }else{
            return "No";
        }
    }
}
