class UnderAgeException extends Exception
{
      UnderAgeException()
	  {
	      super("You are under age exception");
	  }
	  UnderAgeException(String msg)
	  {
	     super(msg);
	  }
}
class Voting
{
      public static void main(String[] args) throws UnderAgeException
	  {
	     int age = 17;
		 if(age<18)
		 {
		     System.out.println("handled");
		 }
	  }
}