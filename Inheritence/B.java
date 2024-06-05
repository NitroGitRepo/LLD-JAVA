class A{
  void showA(){System.out.println("A class Method");}
}
class B extends A{
  void showB(){System.out.println("B class Method");}
}
class C extends B{
    void showC(){System.out.println("C class Mwthod");}
	public static void main(String[] args){
      A ob1 = new A();
	  ob1.showA();
	  System.out.println("---------------");
	  
	  B ob2 = new B();
	  ob2.showA();
	  ob2.showB();
	  System.out.println("---------------");
	  
	  C ob3 = new C();
	  ob3.showA();
	  ob3.showB();
	  ob3.showC();
  }
}  