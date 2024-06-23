class Test4
{
    public static void main(String[] args){
	      int a = 100, b = 0, c;
	      try
		  {
		      c  = a/b;
			  System.out.println(c);
		  
		  }
		  catch(ArithmeticException  e){
		      e.printStackTrace(); // print -> exception name, description, stack trace
			  System.out.println(e); //print -> exception name, description
			  System.out.println(e.getMessage()); //print -> description
		  }
	}
}