class UnderAgeException1 extends Exception
{
      UnderAgeException1()
	  {
	      super("You are under age exception");
	  }
	  UnderAgeException1(String msg)
	  {
	     super(msg);
	  }
}
class Voting1
{
      public static void main(String[] args)
	  {
	     int age = 19;
		 try
		 {
			 if(age<18)
			 {
				  throw new UnderAgeException1();
			 }else{
				   System.out.println("You can vote now"); 
			 }
		 }
		 catch(Exception e){
		    System.out.println("Exception occured");
			 e.printStackTrace();
		 }
	   }
}