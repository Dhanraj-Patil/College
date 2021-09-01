import java.net.*;
public class Prac3 {
    public static void main(String [] args)throws UnknownHostException
    {
        InetAddress [] add=InetAddress.getAllByName("www.nba.com");
        for (int i=0;i<add.length;i++) {
            System.out.println(add[i]);
        }
    }
}
