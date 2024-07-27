class JoinDemo extends Thread
{
    public void run()
	{
	     try{
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
	    JoinDemo j = new JoinDemo();
		j.start();
		
		j.join();
		
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