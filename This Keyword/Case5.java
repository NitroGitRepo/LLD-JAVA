class Case5
{
     Case5()
	 {
        System.out.println("Default Constructor");
	 }
	 
	  Case5(Case5 c)
	  {
	    System.out.println("Parameterized Constructor");
	  }

      public void doSomething()
	  {
	     Case5 c = new Case5(this);
	  }

	  public static void main(String[] args)
	  {
	     Case5 c = new Case5();
		 c.doSomething();
	  }
}