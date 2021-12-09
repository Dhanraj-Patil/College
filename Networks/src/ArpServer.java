import java.net.*;
import java.io.*;

class ArpServer {
    public static void main(String[] args) {
        try{
            ServerSocket s=new ServerSocket(8080);
            Socket ss=s.accept();
            DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
            DataInputStream din=new DataInputStream(ss.getInputStream());
            String msg=(String)din.readUTF();
            String ip[]={"192.168.1.5"};
            String mac[]={"18-26-49-3F-F5-CA"};
            for(int i=0;i<ip.length;i++){
                if(msg.equals(ip[i])){
                    String ans=mac[i];
                    dos.writeUTF(ans);
                }else{
                    System.out.println("Notd");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}