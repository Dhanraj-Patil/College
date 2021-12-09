import java.io.*;
import java.util.*;
import java.net.*;
public class AuthClientServer {
    public static void main(String [] args)throws IOException{
        Socket s=new Socket("localhost",8080);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        String usr=sc.nextLine();
        dos.writeUTF(usr);
        System.out.println("Enter Password");
        String pass=sc.nextLine();
        dos.writeUTF(pass);
        int a= dis.read();
        if(a==1){
            System.out.println("Welcome "+usr);
        }else{
            System.out.println("Invalid Credentials");
        }
    }
}
