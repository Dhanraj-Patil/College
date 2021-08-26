import java.net.*;
public class Prac2 {
    public static void main(String [] args)throws Exception
    {
        URL url=new URL("https://www.youtube.com/watch?v=x4hsV_q_YQc");
        System.out.println("URL is : "+url);
        System.out.println("host is : "+url.getHost());
        System.out.println("path is : "+url.getPath());
        System.out.println("port is : "+url.getPort());
        System.out.println("Default port : "+url.getDefaultPort());
    }
}
