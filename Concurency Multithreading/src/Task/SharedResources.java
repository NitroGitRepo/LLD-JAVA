package Task;

public class SharedResources extends Thread
{
    int number;

    SharedResources(int n){
        number = n;
    }

    public void run(){
        System.out.println("Number = "+number + " "+Thread.currentThread().getName());
    }
}
