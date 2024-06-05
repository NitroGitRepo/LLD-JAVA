class A{
   void show(){System.out.println("Show Method -A");}
  }
class B{
    void show(){System.out.println("Show Method - B");}
}
class C extends A,B{
    public static void main(String[] args){
          C c = new C();
          c.show();	  
	}
}