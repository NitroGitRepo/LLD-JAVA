package addersubstractor;

public class Substractor implements Runnable{
    Count count;

    Substractor(Count c){
        this.count = c;
    }

    public  void run(){
        for (int i=0;i<=1000;i++){
            count.value = count.value-1;
        }
    }
}
