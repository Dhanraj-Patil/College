import java.net.*;
public class Assignment2_2 {
    public static void main(String [] args)throws UnknownHostException
    {
        InetAddress i=InetAddress.getByName("www.google.com");
        InetAddress[] I=InetAddress.getAllByName("www.microsoft.com");
        System.out.println("Dhanraj Patil\n"+i);
        for(int j=0;j<I.length;j++)
        {
            System.out.println(I[j]);
        }
    }
}
