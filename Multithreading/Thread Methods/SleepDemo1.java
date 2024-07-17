class SleepDemo1 extends Thread
{
    public void run()
	{
	    for(int i=1;i<=5;i++)
		{
			try{
			Thread.sleep(1000);
		    System.out.println(i);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	 }
	 public static void main(String[] args)
	 {
	     SleepDemo1 sd = new SleepDemo1();
		 sd.start();
	  }
}