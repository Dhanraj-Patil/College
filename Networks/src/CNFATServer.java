import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class CNFATServer {
    public static void main(String [] args) throws IOException{
//        System.out.println("Name: Dhanraj Patil\nRegistration No.: 20MIS0447");
        System.out.println("Server running on Port 8080");
        DatagramSocket ds=new DatagramSocket(8080);
        byte [] number=new byte[1000];
        DatagramPacket drecieve=new DatagramPacket(number,number.length);
        ds.receive(drecieve);
        System.out.println(convert(number));
        String ans=answer(convert(number));
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
        int n=Integer.parseInt(String.valueOf(y));
        int m=n;
        int d=0;
        int sum=0;
        while(n>0){
            d=n%10;
            sum=(int)(sum+Math.pow(d,3));
            n=n/10;
        }
        System.out.println(sum);
        if(sum==m){
            return "Yes";
        }else{
            return "No";
        }
    }
}
