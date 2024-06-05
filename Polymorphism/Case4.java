class Case4{

    void show(Object a){
		System.out.println("Parent Class");
	}
    void show(StringBuffer a){System.out.println("String Buffer Method Case4");}
	
	void show(String a){System.out.println("String Method In Case4");}
	
	public static void main(String[] args)
	{
	    System.out.println("Main Method");
		Case3 c = new Case3();
		c.show("Rajneesh Yadav");
		c.show(new StringBuffer("sumit"));
		
	}
}