package Task1to100;

public class SharedResources {

    public void printNumber(int i){
        System.out.println("Number "+i+ " "+ Thread.currentThread().getName());
    }
}
