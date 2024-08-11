import java.util.LinkedList;
import java.util.Queue;

public class SharedResources {
    Queue<Integer> buffer;
    int bufferSize;
    SharedResources(int size){
        buffer = new LinkedList<>();
        bufferSize = size;
    }

    public synchronized void producer(int item) throws Exception{
        System.out.println("Producer Method");
        while(buffer.size() == bufferSize) {
            System.out.println("Buffer is full");
            wait(); //first release lock & then sleep, and it will be wake up when other thread will call notify
        }
        buffer.add(item);  //0
        System.out.println("Producer Method -> Item Produced "+item);
        notify();
    }

    public synchronized void consumer() throws  Exception{
       System.out.println("Consumer Method");
       while(buffer.isEmpty()){
           System.out.println("Buffer is empty");
           wait(); //first release lock & then sleep
       }

       int item = buffer.poll(); //0
       System.out.println("Consumer Method -> Item Consumed "+item);
       notify();
    }
}
