package LockFreeConcurrency.AtomicInteger;

public class Main {
    public static void main(String[] args) throws Exception{
        SharedResources sharedResources = new SharedResources();
        Thread th = new Thread(()->{
            for(int i=1; i<=5000;i++){
                sharedResources.increment();
            }
//            System.out.println(sharedResources.get());
        });

        Thread th1= new Thread(()->{
            for(int i=1; i<=5000;i++){
                sharedResources.increment();
            }
//            System.out.println(sharedResources.get());
        });

        th.start();
        th1.start();
        th.join();
        th1.join();

        System.out.println(sharedResources.get());
    }
}
