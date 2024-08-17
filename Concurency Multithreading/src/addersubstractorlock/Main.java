package addersubstractorlock;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws  Exception {

        ReentrantLock lock = new ReentrantLock();
        SharedResources sharedResources = new SharedResources(lock);


        Runnable adder = ()->{
            //lock.lock()
            sharedResources.increaseCount();
            //lock.unlock();
        };
        Runnable substractor = ()->{
           // lock.lock()
            sharedResources.decreaseCount();
            //lock.unlock();
        };

        Thread th = new Thread(adder);
        th.setName("Adder Thread");



        Thread th1 = new Thread(substractor);
        th1.setName("Substractor Thread");

        th.start();
        th1.start();




        th.join();
        th1.join();


        System.out.println(sharedResources.Count);
    }
}
