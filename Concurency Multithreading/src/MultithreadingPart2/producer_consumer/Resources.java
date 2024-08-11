package MultithreadingPart2.producer_consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Resources {

     Queue<Integer> items = new LinkedList<>();
    public synchronized void addItem(){
        System.out.println("Add Item Method");
        for(int i=0;i<=5;i++){
            items.add(i);
        }
        System.out.println("Add Item Method-> Notify All");

        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consume Item Method");

        while(items.isEmpty()){
            try{
                wait();
            }catch (Exception e){
                //Exception Handling
            }
        }

        while(!items.isEmpty()){
            items.poll();
        }

        System.out.println("ConsumeD All Products");

    }
}
