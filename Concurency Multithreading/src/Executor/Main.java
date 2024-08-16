package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){
            if(i==50){
                System.out.println("Hello");
            }
            SharedResources sh  = new SharedResources(i);
            executorService.submit(sh);
        }

        executorService.shutdown();
    }
}
