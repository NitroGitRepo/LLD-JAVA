package Locks.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResources {
    Semaphore lock = new Semaphore(2);

    public void producer() throws Exception{
        lock.acquire();
        System.out.println("Lock Acquired "+Thread.currentThread().getName());
        try{
        Thread.sleep(4000);
        }catch(Exception e) {
            //
        }finally {
            System.out.println("Lock Release "+Thread.currentThread().getName());
            lock.release();
        }
    }
}
