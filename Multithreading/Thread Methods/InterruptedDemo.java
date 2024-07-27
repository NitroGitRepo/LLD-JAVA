public class InterruptDemo extends Thread
{
   public void run(){
      try
	  {
	      for(int i=1;i<=5;i++)
          {
             System.out.println(i +"  : " +Thread.currentThread().getName());
          }			 
	  }
	  catch(Exception e)
	  {
	       System.out.println("Thread Interruption :- "+ e);
	  }
	  
   }
   public static void main(String[] args)
   {
        InterruptDemo id = new InterruptDemo();
		id.start();
   }
}