class ThreadPriorityDemo extends Thread
{
     public void run()
	 {
	     System.out.println("Child Thread");
		 System.out.println(Thread.currentThread().getPriority()); //10
	  }
	  public static void main(String[] args)
	  {
	      System.out.println(Thread.currentThread().getPriority());  //5
	      Thread.currentThread().setPriority(10);
		  
		  ThreadPriorityDemo t = new ThreadPriorityDemo();
		  System.out.println(Thread.currentThread().getPriority()); //10
		  t.setPriority(2);
		  t.start();
	  }
}