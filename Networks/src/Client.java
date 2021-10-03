import java.io.*;
import java.util.*;
import java.net.*;
public class Client {
    public static void main(String [] args){
        try{
            Scanner sc=new Scanner(System.in);
            Socket s=new Socket("localhost",8080);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream din=new DataInputStream(s.getInputStream());
            System.out.println("Enter a String");
            String a=sc.next();
            dout.writeUTF(a);
            dout.flush();
            String b=(String)din.readUTF();
            System.out.println(b);
            dout.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
