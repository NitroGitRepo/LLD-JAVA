package Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResources {

    public void produce(ReadWriteLock lock){

        lock.readLock().lock();
        //TH1->API CALL ->READING 1LKH
        //TH2->API CALL -> READ -> WRITE : 10SEC:-> 70K
        //THE3-> API CALL-> READ 1LAKH -> WRITE:
        System.out.println("Read Lock Acquired "+Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            //code
        }
        finally {
            System.out.println("Read Lock Release "+ Thread.currentThread().getName());
            lock.readLock().unlock();
        }
    }


    public void consumer(ReadWriteLock lock){
        lock.writeLock().lock();
        System.out.println("Write Lock Acquired "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            //code
        }
        finally {
            System.out.println("Write Lock Release "+ Thread.currentThread().getName());
            lock.writeLock().unlock();
        }
    }
}
