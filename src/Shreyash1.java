import java.util.*;
public class Shreyash1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a);
    }

    public static void sort(int[] a)
    {
        int c=0;
        int x=a.length,y=0;
        int i, j, temp;
        int n = a.length;
        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;

            while(j>=0 && temp <= a[j])
            {
                a[j+1] = a[j];
                j = j-1;
                if (j+1<x){
                    x=(j+1)+1;
                }
                if(j+1>y){
                    y=(j+2)+1;
                }
            }
            a[j+1] = temp;
        }
        if(x==n && y==0){
            System.out.println("-1 -1");
        }else{
            System.out.println(x+"\n"+y);
        }
    }
}
