import java.net.*;
import java.util.Arrays;

public class Assignment2_3 {
    public static void main(String[] args)throws UnknownHostException
    {
        InetAddress i=InetAddress.getByName("vtop.vit.ac.in");
        String hostAddress=i.getHostAddress();
        String address=Arrays.toString((i.getAddress()));
        System.out.println("Dhanraj Patil");
        System.out.println(address);
        System.out.println(hostAddress);

    }
}
