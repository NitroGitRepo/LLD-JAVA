package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {
    public void produce(ReentrantLock lock){
        lock.lock();
//        lock.tryLock();
        System.out.println("Lock Acquired " +Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            //handling code
        }
        finally {
            System.out.println("Lock Release "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
