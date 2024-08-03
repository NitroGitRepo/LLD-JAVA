package concurrency1;

public class HelloWorldPrinter implements Runnable {
    public void run(){
        //write a code you want to execute from a different thread
        System.out.println("HELLO WORLD : THREAD NAME "+Thread.currentThread().getName());
    }
}
