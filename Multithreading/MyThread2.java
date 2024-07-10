class Thread2 extends Thread
{
    public  void run()
	{
	    System.out.println("Task -1");
	}
}
class MyThread2
{
   public static void main(String[] args)
   {
       Thread2 t1 = new Thread2();
	   t1.start();
	   
	   Thread2 t2 = new Thread2();
	   t2.start();
	
	   Thread2 t3 = new Thread2();
	   t3.start();
	   
   }
}