package addersubstractor;

class Counter{
    int count;
}
class Adder1 extends Thread{
    Counter c;
    Adder1(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<=1000;i++){
            c.count = c.count+1;
        }
    }
}

//class Substracter1 extends Thread{
//    public void run(){
//        for(int i=0;i<=1000;i++){
//
//        }
//    }
//}
public class Checking {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Adder1 th1 = new Adder1(c);
        th1.start();

        th1.join();
        System.out.println(c.count);
    }
}
