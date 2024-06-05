class Test{
   int i;
   Test(){
	   System.out.println("No Argument Constructor-USER DEFINE");
   }
   
   Test(int a){
	   System.out.println("Parameterized constructor");
	   this.i = a;
   }
   public static void main(String[] args){
        Test t = new Test(); 
		System.out.println(t.i);
		
		Test t1 = new Test(10);
		System.out.println(t1.i);
   }
 }