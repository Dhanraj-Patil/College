import java.net.*;
import java.util.*;
import java.util.Scanner;

public class Assignment2_4 {
    public static void main(String[] args)throws UnknownHostException
    {
        Scanner sc=new Scanner(System.in);
        byte[] a={-120, -23, 9, 22};
        InetAddress i=InetAddress.getByAddress(a);
        System.out.println("Dhanraj Patil");
        System.out.println(i.getHostName());
    }
}
