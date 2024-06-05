class Case2
{
    void display()
	{ 
	    System.out.println("Hello");
	}
	void show()
	{
	    display(); //== this.display();
	}
	public static void main(String[] args)
	{
	      Case2 c = new Case2();
		  c.show();
	}
}