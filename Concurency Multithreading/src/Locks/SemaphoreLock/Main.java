package Locks.SemaphoreLock;



public class Main {
    public static void main(String[] args) throws Exception {

        SharedResources sharedResources  = new SharedResources();
        Thread th1 = new Thread(()->
        {
             try{
                 sharedResources.producer();
             }catch(Exception e){
                 //code
             }
        });

        Thread th2 = new Thread(()-> {
            try{
                sharedResources.producer();
            }catch(Exception e){
                //code
            }
        });

        Thread th3 = new Thread(()-> {
            try{
                sharedResources.producer();
            }catch(Exception e){
                //code
            }
        });

        Thread th4 = new Thread(()-> {
            try{
                sharedResources.producer();
            }catch(Exception e){
                //code
            }
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
