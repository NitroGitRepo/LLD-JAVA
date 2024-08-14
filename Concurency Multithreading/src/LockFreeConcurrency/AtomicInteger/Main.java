package LockFreeConcurrency.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();
        Thread th = new Thread(()->{
            for(int i=1; i<=50;i++){
                sharedResources.increment();
            }
            System.out.println(sharedResources.get());
        });

        Thread th1= new Thread(()->{
            for(int i=1; i<=50;i++){
                sharedResources.increment();
            }
            System.out.println(sharedResources.get());
        });

        th.start();
        th1.start();


    }
}
