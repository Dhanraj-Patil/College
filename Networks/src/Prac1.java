import java.net.*;
public class Prac1 {
    public static void main(String [] args)throws UnknownHostException
    {
        InetAddress address=InetAddress.getLocalHost();
        String name=address.getHostName();
        System.out.println(name+"\n"+address);
    }
}
