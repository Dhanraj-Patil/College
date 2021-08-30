import java.util.*;
public class StringFrequency {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        for(int i=0;i<n;i++)
        {
            char ch='n';
            int c=0;
            for(int j=1;j<n;j++)
            {
                if((a.charAt(i)==a.charAt(j)) && a.charAt(i)!='*' && i!=j){
                    ++c;
                }
            }
            if(c>0)
            {
                ch=a.charAt(i);
                a=a.replace(a.charAt(i),'*');
            }
            if(a.charAt(i)!='*') {
                System.out.println(a.charAt(i) + " = " + (c+1));
            }
            if(a.charAt(i)=='*' && c>0)
            {
                System.out.println(ch+" = "+(c+1));
            }
        }
    }
}
