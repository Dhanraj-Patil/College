import java.util.*;
public class Number {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int d=Math.min(Math.max(a,b),c);
        int e=Math.min(Math.max(c,b),a);
        System.out.println(Math.max(d,e));
    }
}
