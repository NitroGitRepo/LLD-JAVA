package LockFreeConcurrency.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResources {

//    AtomicInteger counter = new AtomicInteger(0);
    int count =0;

    public  void increment(){
//        counter.incrementAndGet();
        count++;
    }

    public int get(){
//        return counter.get();
        return count;
    }
}
