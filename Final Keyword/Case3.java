final class Case_3
{
   final void show()
   {
      System.out.println("I am in parent class");
	}
   
}
class Case3 extends Case_3
{

    public static void main(String[] args)
	{
	   System.out.println("I am in child class");
	}
}