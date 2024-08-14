package lecture31part3;

public class Main {
    public static void main(String[] args) throws Exception{
        SharedResource resources= new SharedResource();
        Thread th = new Thread(()->{
            System.out.println("Thread 1 calling produce method");
            try{
                resources.produce();
            }catch(Exception e){
                //
            }
        });

        Thread th1 = new Thread(()->{
            System.out.println("Thread 2 calling produce method");
            try{
                Thread.sleep(1000);
                resources.produce();
            }catch(Exception e){
                //
            }
        });
        System.out.println("Main thread started");
        th.start();
        th1.start();

        Thread.sleep(3000);

        System.out.println("Thread 1 is suspended");
        th1.suspend();
        th1.resume();
        System.out.println("Main Thread is finishing his work");
    }
}
