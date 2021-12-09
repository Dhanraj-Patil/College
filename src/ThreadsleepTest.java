public class ThreadsleepTest implements Runnable {
    public void run(){
        System.out.println("Inside child thread");
        for(int i=1;i<=4;i++){
            System.out.println("I:"+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Exiting child thread");
    }
    public static void main(String[] args){
        ThreadsleepTest x=new ThreadsleepTest();
        Thread t=new Thread(x);
        t.start();
        try{
            t.join(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
