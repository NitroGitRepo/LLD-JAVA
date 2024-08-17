package addersubstractorlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {

    ReentrantLock lock;

    SharedResources(ReentrantLock lock){
        this.lock = lock;
    }
    int Count=0;



    public void increaseCount(){
       try{
           //lock.lock();
           for(int i=1;i<=10;i++) {
               lock.lock();
               System.out.println(Thread.currentThread().getName() + "Lock Acquired");
               Count = Count + i;
               System.out.println(Count + " " + Thread.currentThread().getName() + "Lock Release");
               lock.unlock();
           }
           //lock.unlock();
       }catch(Exception e){
           //
       }
    }

    public void decreaseCount(){
        //lock.lock();
        for(int i=1;i<=10;i++) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "Lock Acquired");
            Count = Count - i;
            System.out.println(Count + " " + Thread.currentThread().getName() + "Lock Release");
            lock.unlock();
        }
        //lock.unlock();
    }




}
