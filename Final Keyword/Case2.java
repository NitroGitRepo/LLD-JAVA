class Case_2
{
   final void m1()
   {
      System.out.println("Parent Class");
	}
}
class Case2 extends Case_2
{
   public void m1()
   {
      System.out.println("Final Method");
   }
   public static void main(String[] args)
   {
      Case2 c = new Case2();
	  c.m1();
	}
}
