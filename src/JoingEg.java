public class JoingEg implements Runnable{
    public void run(){
        System.out.println("Child thread is running..");
        for(int i=1;i<=4;i++){
            System.out.println("I:"+i);
        }
        System.out.println("Child thread is ending");
    }
    public static void main(String [] args){
        JoingEg x=new JoingEg();
        Thread t=new Thread(x);
        t.start();
        try{
            t.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main thread is ending");
    }
}
