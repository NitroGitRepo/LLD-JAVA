class Case1
{  int a = 10;
   void show()
   {
      System.out.println("Non Static Method");
   }
   static void display()
   {   //int a = this.a;
	   System.out.println("Static Method"+a);
   }
   public static void main(String[] args)
   {
      Case1 c = new Case1();
	  c.show();
	  Case1.display();
	  display();
   }
}