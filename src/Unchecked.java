public class Unchecked {
    public static void main(String [] args){
        try{
            int a=10,b=0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(e);;
        }
        try{
            int arr[]={1,3,4,5,6};
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);;
        }
        try{
            int arr[]={1,3,4,5,6};
            System.out.println(arr[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);;
        }
        try{
            int a=100,b=0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(e);;
        }
    }
}
