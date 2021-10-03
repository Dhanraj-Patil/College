import java.net.*;
public class CAT {
    public static void main(String [] args)throws UnknownHostException
    {
        InetAddress a=InetAddress.getByName("www.facebook.com");
        String address=a.getHostAddress();
        System.out.println("Dhanraj Patil");
        System.out.println("Address for www.facebook.com is: "+address);
    }
}
