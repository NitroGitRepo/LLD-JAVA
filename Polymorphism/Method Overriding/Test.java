class Test{
	 Test(){System.out.println("Test class");}
     void show(String a, int b){System.out.println("Show 1");}
}
class XYZ extends Test{

     void show(String a, int b){System.out.println("show 2");}
	 public static void main(String[] args){
	 
	     Test t = new Test();
		 t.show("Rajneesh", 12);
		 
         XYZ  t1 = new XYZ();
		 t1.show("Sumit", 10);
		 		 
	 }
}