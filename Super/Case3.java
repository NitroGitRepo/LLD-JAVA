class Case_3
{
      Case_3()
	  {
	      System.out.println("Parent class constructor");
	  }
	  Case_3(int a){
		  System.out.println(a + " Parent");
	  }

}
class Case3 extends Case_3
{
     Case3()
	 {   super(10);
	     System.out.println("Child Class Constructor");
	 }

     public static void main(String[] args)
	 {
	    Case3 c = new Case3();
	 }
}