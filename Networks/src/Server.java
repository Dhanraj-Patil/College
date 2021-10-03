import java.util.*;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String [] args)
    {
        try{
            ServerSocket ss=new ServerSocket(8080);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            String a=(String) din.readUTF();
            System.out.println(a);
            dout.writeUTF(a);
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
