class DemonThread extends Thread
{
    public void run(){
        System.out.println("Demon Thread ");
    }

    public static void main(String[] args){
        System.out.println("Current Thread "+Thread.currentThread().getName());
        System.out.println("Main Method");

        //Thread.currentThread().setDaemon(true); //IllegalThreadStateException

        DemonThread d = new DemonThread();
        d.setDaemon(true);
        d.start();
    }
}

//o/p
// Current Thread main
// Main Method
// Demon Thread