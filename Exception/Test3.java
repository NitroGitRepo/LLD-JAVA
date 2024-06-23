class Test3
{

    public static void main(String[] args){
	     int a  =100;
		 int b = 10;
		 int c;
		 
		 try{
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 c = a/b;
		 System.out.println(c);
		 System.out.println("4");
		 System.out.println("5");
		 }
		 catch(Exception e){
		  System.out.println(e); 
	     }
		 System.out.println("Exception Handled Manually");
	
	}
}