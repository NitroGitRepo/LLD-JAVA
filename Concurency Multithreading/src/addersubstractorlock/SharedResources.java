package addersubstractorlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {

    int Count=0;

    public void increaseCount(int i,ReentrantLock lock){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + "Lock Acquired");
        Count = Count+i;
        System.out.println(Count + " " +Thread.currentThread().getName() + "Lock Release");
        lock.unlock();
    }

    public void decreaseCount(int i,ReentrantLock lock){
        //lock.lock();
        System.out.println(Thread.currentThread().getName() + "Lock Acquired");
        Count = Count-i;
        System.out.println(Count + " " +Thread.currentThread().getName() + "Lock Release");
        //lock.unlock();
    }




}
