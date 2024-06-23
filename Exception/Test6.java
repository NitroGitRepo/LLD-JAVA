class Test6
{
    public static void main(String[] args){
	    
		int a = 100, b  = 0, c;
		try
		{
		    System.out.println("Try Block->");
			c = a/b;
		}
		finally
		{
		    System.out.println("Finally Block-> Finally Block Excuted");
		}
	
	}
}
//finally block execute automatically whether exception is handled or not
