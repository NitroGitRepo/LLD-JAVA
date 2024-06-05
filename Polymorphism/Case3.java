class Case3{

    void show(int a){System.out.println("Int Method");}
	
	void show(String a){System.out.println("String Method");}
	
	public static void main(String[] args)
	{
	    System.out.println("Main Method");
		Case3 c = new Case3();
		c.show(10);
		c.show("Rajneesh");
		c.show('a');
		
	}
}