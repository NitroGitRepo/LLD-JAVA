class Test3
{
   public void show(){System.out.println("1");}
}

class Case1 extends Test3
{ 
   private void show(){System.out.println("2");}
   public static void main(String[] args){
       Test3 t = new Test3();
	   
	   Case1 c = new Case1();
	   c.show();
	   
	   
	}
}