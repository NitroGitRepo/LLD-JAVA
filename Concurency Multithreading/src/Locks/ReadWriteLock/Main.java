package Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        Locks.ReadWriteLock.SharedResources sh = new SharedResources();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        Thread th1 = new Thread(()->{
            sh.produce(readWriteLock);
        });

        Thread th2 = new Thread(()->{
            sh.produce(readWriteLock);
        });

        Thread th3 = new Thread(()->{
            sh.consumer(readWriteLock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
