class Test7
{
   public static void main(String[] args)
   {
      int a = 100, b = 0, c;
	  Test7 t = new Test7();
	  System.out.println("1");
	  t.divide();
	  System.out.println("After Exception");
	  
   }
   public void divide(){
	    int a = 100, b = 0, c;
		try{
		System.out.println("2");
		c = a/b;
		System.out.println(c);
		System.out.println("3");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
   }
}