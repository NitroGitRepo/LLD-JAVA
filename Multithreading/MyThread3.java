class Thread3 extends Thread
{
    public void run()
	{
	     System.out.println("Task 1");
	}
}
class Thread31 extends Thread
{
	public void run()
	{
		  System.out.println("Task -2");
	}
}
public class MyThread3
{
     public static void main(String[] args)
	 {
	     Thread3 t1 = new Thread3();
		 t1.start();
		 
		 Thread31 t2 = new Thread31();
		 t2.start();
		 
		 
	 }
}   