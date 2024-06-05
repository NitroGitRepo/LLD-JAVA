class Case3
{
    Case3(){
		this(10);
		System.out.println("No Argument Constructor");
	}
	
	Case3(int a){
		//this();
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args)
	{
	
	    Case3 c = new Case3(10);
	
	}
}