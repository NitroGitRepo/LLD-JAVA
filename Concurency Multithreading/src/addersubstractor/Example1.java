package addersubstractor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Example1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i=0;i<=100;i++){
            int c = i;
            Runnable task = ()->{
                System.out.println(c+ " "+ Thread.currentThread().getName());
            };
            Thread th = new Thread(task);
            th.start();
        }
    }
}
