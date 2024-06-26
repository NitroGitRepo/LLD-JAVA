class UnderAgeException2 extends RuntimeException
{
   UnderAgeException2()
   {
      super("you are under age");
   }
   UnderAgeException2(String msg)
   {
      super(msg);
   }
}
class Voting2
{
     public static void main(String[] args)
	 {
	     int age = 17;
		 try
		 {
			     if(age<18)
		         {
					  throw new UnderAgeException2("Exception occured");
				 }
				 else{
					 System.out.println("you are voting");
				 }
		 } catch(Exception e)
		 {
			   System.out.println("Exception occured but handled");
			   e.printStackTrace();
		 }
	  }
}