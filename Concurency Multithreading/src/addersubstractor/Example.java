package addersubstractor;

public class Example {
    int count = 0;
    public static void main(String[] args) throws Exception{

        Example e1 = new Example();

        Runnable Adder1 = ()->{
            for(int i=0;i<=100;i++){
                e1.add(i);
            }
        };

        Thread th1 = new Thread(Adder1);
        th1.start();

        th1.join();
        System.out.println(e1.count);
    }

    public void add(int i){
        count = count+i;
    }
}
