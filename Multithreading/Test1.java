class Test1 implements Runnable
{
       public void run()
       {
            System.out.println("Thread Using Runnable Interface"); 
       }
       public static void main(String[] args)
	   {
	         Test1 t = new Test1();
			 Thread th = new Thread(t);
			 th.start();
	   }
	   
}