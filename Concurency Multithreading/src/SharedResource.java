package lecture31part3;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() throws  Exception{
        System.out.println("Lock Acquired");
        isAvailable = true;
        Thread.sleep(10000);
        System.out.println("Lock Release");
    }
}
