import java.io.*;
import java.net.*;
import java.util.*;
public class ChatServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss=new ServerSocket(8080);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());
    }
}
