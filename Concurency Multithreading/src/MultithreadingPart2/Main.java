package MultithreadingPart2;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(()->{
             try{
                 Thread.sleep(1000);
             }catch (Exception e){
                 //Exception Handling Code
             }
              sharedResource.addItem();
        });

        Thread consumerThread = new Thread(()->{
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumerThread.start();

    }
}
