class Test5
{
    synchronized void show()
    { System.out.println("1"); }
}
class Case5 extends Test5{
    void show()
	{
		//super.show();
	   System.out.println("2");
	}
	public static void main(String[] args){
	    System.out.println("main");
		Case5 c = new Case5();
		c.show();
	}
}
	