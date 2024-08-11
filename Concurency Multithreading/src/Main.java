import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        SharedResources sh = new SharedResources(3);
        Thread th1 = new Thread(()->{
            for (int i=0;i<=6;i++ ){
                try{
                    sh.producer(i);
                }catch (Exception e){
                    //code;
                }
            }
        });

        Thread th2 = new Thread(()->{
            for (int i=0;i<=6;i++ ){
                try{
                    sh.consumer();
                }catch (Exception e){
                    //code;
                }
            }
        });

        th1.start();
        th2.start();
        System.out.println("Hello world!");
    }
}

//case  1-> producer
//case 2 -> consumer