class Case_1
{
    int i = 10;
}
class Case1 extends Case_1
{
    int i=20;
	void show(int i)
	{  
	   //System.out.println(i); //30
	   //System.out.println(this.i); //20
	   System.out.println(10);
	}
	public static void main(String[] args)
	{
	   Case1 c = new Case1();
	   c.show(30);
	}
}