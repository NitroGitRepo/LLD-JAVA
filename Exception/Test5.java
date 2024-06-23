class Test5
{
    public static void main(String[] args){
	    
		int a = 100, b  = 10, c;
		try
		{
		    System.out.println("Try Block->");
			c = a/b;
		}
		catch(ArithmeticException e)
		{
		    e.printStackTrace();
			System.out.println("Catch Block -> Exception Handled");
		}
		finally
		{
		    System.out.println("Finally Block-> Finally Block Excuted");
		}
	
	}
}
//finally block execute automatically whether exception is handled or not
//case1: If exception occured -> try catch finally
//case2: If no exception occured -> try finally