class Case_2
{
   void show1()
   {
	   System.out.println("Parent Class 🤖");
   }

}
class Case2 extends Case_2
{
	void show1(){
		System.out.println("Child Class");
	}
    void show2()
	{
		super.show1();
		show1();
	}
    public static void main(String[] args)
	{
	    Case2 c = new Case2();
		c.show2();
	}
}