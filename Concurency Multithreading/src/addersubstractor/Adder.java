package addersubstractor;

public class Adder implements Runnable {
    Count count;

    Adder(Count count){
        this.count = count;
    }

    public  void run(){
        for(int i=0;i<=1000;i++){
            count.value = count.value +1 ;
        }
    }
}
