class YoungerAgeException extends RuntimeException
{

   YoungerAgeException(String msg)
   {
       super(msg);
    }
}
class Test9
{
    public static void main(String[] args)
	{
	   int age  = 18;
	   System.out.println("Execution Started----");
	   try{
               if(age>17){ throw new YoungerAgeException("you are not eligible");}
			   else{ System.out.println("eligible for voting");};
       }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   System.out.println("Abnormal Terminate----");
     }
}
