
public class ThreadNameDemo extends Thread
{
     public void run()
	 {
		    System.out.println("Thread Task "+ Thread.currentThread().getName());
	 }
     public static void main(String[] args)
	 {
		 ThreadNameDemo t = new ThreadNameDemo();
		 t.start();
		 t.setName("my thread 1");
		 
		 ThreadNameDemo t1 = new ThreadNameDemo();
		 t1.start();
 		 t1.setName("my thread 2");
		 
	     System.out.println(Thread.currentThread().getName()); //main
		 
		 Thread.currentThread().setName("rajneesh");
		 System.out.println(Thread.currentThread().getName()); //rajneesh
		 
		 System.out.println(Thread.currentThread().isAlive());
		 System.out.println(t.isAlive());
		 System.out.println(t1.isAlive());
	  }
}