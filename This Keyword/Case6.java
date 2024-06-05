class Case6
{
     Case6 m1()
	 {
        return this;
     }
     public static void main(String[] args)
	 {
	    Case6 c = new Case6();
		System.out.println(c.m1());
		
	 }
}