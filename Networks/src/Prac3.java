import java.net.*;
public class Prac3 {
    public static void main(String [] args)throws UnknownHostException
    {
        InetAddress [] add=InetAddress.getAllByName("www.microsoft.com");
        for (InetAddress inetAddress : add) {
            System.out.println(inetAddress);
        }
    }
}
