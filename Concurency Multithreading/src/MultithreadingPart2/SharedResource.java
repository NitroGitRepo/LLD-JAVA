package MultithreadingPart2;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("Inside Add Item Method -> Producer Thread");
        System.out.println("Producer Thread Calling The Notify Method");
        notifyAll();
    }

    public synchronized void consumeItem(){

        System.out.println("Inside Consume Item Method-> Consumer Thread-> Start");

        while(!isItemPresent){
            try{
                System.out.println("Consumer Thread Is Waiting");
                wait();
            }catch (Exception e){
                //exception handling
            }
        }

        System.out.println("Inside Consume Item Method-> Consumer Thread-> End");
        isItemPresent = false;
    }
}
