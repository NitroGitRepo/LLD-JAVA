package Task1to100;

public class Main {
    public static void main(String[] args) {
        SharedResources sh = new SharedResources();
        for(int i=0;i<=100;i++){
            int num = i;
           Thread th = new Thread(()->{
               sh.printNumber(num);
           }) ;
           th.start();
        }
    }
}
