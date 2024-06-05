class ThreeA
{
      void showA(){System.out.println("show Method - A"); }
}
class ThreeB extends ThreeA
{
      void showB(){ System.out.println("show Method - B"); }
}
class ThreeC extends ThreeA
{
      void showC() {System.out.println("show Method - C"); }
	  public static void main(String[] args){
	  A ob1 = new A();
	  ob1.showA();
	  
	  B ob2 = new B();
	  ob2.showA();
	  ob2.showB();
	  
	  C ob3 = new C();
	  ob3.showA();
	  ob3.showC();
	  }
}