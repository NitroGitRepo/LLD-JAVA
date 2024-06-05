interface I1
{
   int a = 10;
   
   public abstract void show();
   default void display()
   {
	   System.out.println("concrete");
   }
   
   static void display1()
   {
	   System.out.println("static method");
   }
}
interface I2
{
	int b = 20;
	void show1();
}
class Test implements I1, I2
{
	public void show()
	{
		System.out.println("Overridden Method");
	}
	
	public void show1(){
		System.out.println("Overridden Method INTERFACE I2");
	}
	public static void main(String[] args)
	{
		//I1 i = new I1();
		Test t  = new Test();
		t.show(); 
		t.show1();
		System.out.println("Main Method");
	}
}