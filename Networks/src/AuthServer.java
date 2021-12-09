import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class AuthServer {
    static String Usr="Dhanraj",Pass="Dhanraj123";
    public static void main(String [] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            System.out.println("Server Online");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            String usr = dis.readUTF();
            String pass = dis.readUTF();
            System.out.println("Client Username: " + usr);
            System.out.println("Client Password: " + pass);
            if (Usr.equals(usr) && Pass.equals(pass)) {
                System.out.println("Credentials matched\nAuthentication passed");
                dos.write(1);
            } else {
                System.out.println("Invalid Credentials\nAuthentication failed");
                dos.write(0);
            }
            ss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
