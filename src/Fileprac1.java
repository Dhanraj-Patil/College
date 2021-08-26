import java.io.*;
import java.util.*;
public class Fileprac1 {
    public static void main(String [] args) throws FileNotFoundException{
        File f=new File("Ls.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNext())
        {
            System.out.print(sc.next());
        }
    }
}
