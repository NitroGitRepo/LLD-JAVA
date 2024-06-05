class Case4
{  
   void m1(Case4 c)
   {
       System.out.println("I am in M1 method");       
   }
   void m3()
   {
	   System.out.println("I am in m2 method");
   }
   void m2()
   {
      m1(this);
   }
   public static void main(String[] args)
   {
	   Case4 c = new Case4();  
       c.m2();	   
   }
}