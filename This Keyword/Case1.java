class Case1
{
   int i;
   void setValue(int i)
   {
        this.i = i;
   }
   void show()
   {
      System.out.println(i);
    }
    public static void main(String[] args)
    {
      Case1 c = new Case1();
	  c.setValue(10);
	  c.show();
	}
}
	  
	