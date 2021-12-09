import java.net.*;
import java.io.*;
import java.util.Scanner;
class ArpClient {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",8080);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String msg="192.168.1.5";
            System.out.println("IP address: "+msg);
            dos.writeUTF(msg);
            String ip=(String)dis.readUTF();
            System.out.println(ip);
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}