class YieldDemo extends Thread
{
     public void run()
	 {   
	      for(int i=0;i<=5;i++)
		  {
		     System.out.println(Thread.currentThread().getName()+ " : " +i);
		   }
	 }
	 public static void main(String[] args)
	 {
	     YieldDemo s = new YieldDemo();
		 s.setPriority(10);
		 System.out.println("My Priority " +s.getPriority());
		 s.start();
		 
		 
		   Thread.yield();
		  System.out.println("Main "+Thread.currentThread().getPriority());
		  for(int i=0;i<=5;i++)
		  {
		     System.out.println(Thread.currentThread().getName()+ " : " +i);
		  }
	 } 
}