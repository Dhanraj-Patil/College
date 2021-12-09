import java.io.*;

public class Checked {
    public static void main(String [] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a no. ");
            int a=Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
        try{
            Class uk=Class.forName("Unknown");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
