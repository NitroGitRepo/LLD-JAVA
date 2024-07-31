class TotalEarning extends Thread
{
   int total = 0;
   public void run()
   {
        synchronized(this)
		{
			 for(int i=0;i<=10;i++)
			 { total = total + 100;}
		     this.notify();
		}
    }
}
public class MovieBookApp
{
    public static void main(String[] args) throws Exception
	{
	    TotalEarning t1 = new TotalEarning();
		t1.start();
		
		//System.out.println("Total Earning : "+ t1.total + "/- ®️");
		synchronized(t1)
		{
			t1.wait(1000);
			System.out.println("Total Earning : "+ t1.total + "/- ®️");
		}
			
     }
}	 