class Test extends Thread
{
    public void run(){
	  for(int i=0;i<=5;i++)
	  { 
            try{
				Thread.sleep(1000);
		  System.out.println(i + " : " +Thread.currentThread().getName());  
			}catch(Exception e){
			   System.out.println("c");	
			}
	  }
	}
	public static void main(String[] args)
	{
	    Test t = new Test();
		t.run();
		
		Test t1 = new Test();
		t1.run();
	}
}