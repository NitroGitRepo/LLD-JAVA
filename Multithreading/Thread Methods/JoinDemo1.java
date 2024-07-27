class JoinDemo1 extends Thread
{
	static Thread mainThread;
    public void run()
	{
	     try{
			     mainThread.join();
		         for(int i=0;i<=5;i++)
				 {
				     System.out.println("Child Thread   : "+i);
					 Thread.sleep(1000);
				  }
			}
		catch(Exception e)
		{
		    System.out.println(e);
		 }
	}
	public static void main(String[] args) throws InterruptedException
	{
		mainThread = Thread.currentThread();
		
	    JoinDemo1 j = new JoinDemo1();
		j.start();
		
		
		try{
		      for(int i=0;i<=5;i++)
			  {
			     System.out.println("Main Thread : " +i);
				 Thread.sleep(1000);
			  }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}