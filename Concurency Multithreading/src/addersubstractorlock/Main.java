package addersubstractorlock;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws  Exception {
        SharedResources sharedResources = new SharedResources();
        ReentrantLock lock = new ReentrantLock();
        Runnable adder = ()->{
            //ock.lock();
            for(int i=1;i<=10;i++){
                sharedResources.increaseCount(i, lock);
            }
            //lock.unlock();
        };
        Runnable substractor = ()->{
           // lock.lock();
            for(int i=1;i<=10;i++){
                sharedResources.decreaseCount(i, lock);
            }
            //lock.unlock();
        };

        Thread th = new Thread(adder);
        th.setName("Adder Thread");


        Thread th1 = new Thread(substractor);
        th1.setName("Substractor Thread");

        th.start();
        th1.start();


        System.out.println(sharedResources.Count);
    }
}
