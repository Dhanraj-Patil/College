import java.net.*;
import java.io.*;

class RarpClient {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",8080);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String msg="18-26-49-3F-F5-CA";
            System.out.println("MAC address: "+msg);
            dos.writeUTF(msg);
            String ip= dis.readUTF();
            System.out.println(ip);
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}