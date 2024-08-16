package Executor;

public class SharedResources extends Thread{
    int i;
    SharedResources(int i){
        this.i = i;
    }

    public void run(){
        System.out.println("Number "+i+ " "+ Thread.currentThread().getName() +  " " );
    }
}
