class A
{
   int i = 10;
}
class B extends A
{
  int i = 20;
  void show(int i)
  {
     //System.out.println(this.i); //20
	 System.out.println(super.i);
  }
  public static void main(String[] args)
  {
      B b = new B();
	  b.show(40);
	  System.out.println(b.i);
  }
}