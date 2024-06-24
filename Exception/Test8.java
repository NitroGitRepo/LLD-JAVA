class Test8
{
   public static void main(String[] args)
   {
      int a = 100, b = 0, c;
	  Test7 t = new Test7();
	  System.out.println("1");
	  try{
	  t.divide();
	  }
	  catch(Exception e)
	  {
	      e.printStackTrace();
	  }
	  System.out.println("After Exception");
	  
   }
   public void divide(){
	    int a = 100, b = 0, c;
		c = a/b;
		System.out.println(c);
   }
}