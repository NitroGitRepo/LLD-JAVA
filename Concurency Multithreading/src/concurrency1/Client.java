package concurrency1;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Current Thread = "+Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread th = new Thread(helloWorldPrinter);
        th.start();

        Thread th1 = new Thread(helloWorldPrinter);
        th1.start();

        System.out.println("Current Thread ="+Thread.currentThread().getName());
    }
}


