public class InterruptedDemo1 extends Thread
{
     public void run()
	 {
	     try
		 {    //System.out.println(Thread.interrupted()); // true -> false -> no interruption will occur
		      //System.out.println(Thread.currentThread().isInterrupted()); // true => Interruption will occur
		      for(int i=1;i<=5;i++)
			  {
			     System.out.println(i + "  " + Thread.currentThread().getName());
				 Thread.sleep(1000);
			  } 
          }			  
			  catch(Exception e)
			  {
			     System.out.println(e);
			  }
     }	 
	 
     public static void main(String[] args)
	 {
	     InterruptedDemo1 id = new InterruptedDemo1();
		 id.start();
		 id.interrupt();
	  }
		 
}