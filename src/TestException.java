import java.util.*;
public class TestException {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        try {
            int a=sc.nextInt();
            if(a==23){
                throw new CustomException("Exception Triggered");
            }
            else{
                System.out.println("Number entered - "+a);
            }
        }catch(CustomException e){
            System.out.println(e);
        }
    }
}
