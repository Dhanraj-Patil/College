import java.io.*;
import java.net.*;
import java.util.*;
public class ChatClient {
    public static void main(String [] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        try {
            Socket s = new Socket("localhost", 8080);
            System.out.println("Enter something to send to server\n");
            String a=sc.nextLine();
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF(a);
        }catch (UnknownHostException e){
            System.out.println(e);
        }
    }
}
