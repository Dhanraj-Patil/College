import java.net.*;
public class Assignment2_5 {
    public static void main(String[] args) throws Exception {
        URL url=new URL("https://www.vtop.vit.ac.in");
        System.out.println("Dhanraj Patil");
        System.out.println("URL is : "+url);
        System.out.println("host is : "+url.getHost());
        System.out.println("path is : "+url.getPath());
        System.out.println("port is : "+url.getPort());
        System.out.println("Default port : "+url.getDefaultPort());
    }
}
