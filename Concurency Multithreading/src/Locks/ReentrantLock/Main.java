package Locks.ReentrantLock;

import MultithreadingPart2.SharedResource;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        SharedResources sharedResource1 = new SharedResources();
        Thread thread1 = new Thread(()->{
            sharedResource1.produce(lock);
        });

        SharedResources sharedResources2 = new SharedResources();
        Thread thread2 = new Thread(()->{
            sharedResources2.produce(lock);
        });

        thread1.start();
        thread2.start();
    }
}
