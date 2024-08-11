package MultithreadingPart2.producer_consumer;

public class MainThread {
    public static void main(String[] args) {
        Resources rs = new Resources();

        Thread producer = new Thread(()->{rs.addItem();});

        Thread consumer = new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                //handling
            }
            rs.consumeItem();});

        producer.start();
        consumer.start();
    }
}
