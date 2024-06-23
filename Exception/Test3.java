class Test3
{

    public static void main(String[] args){
	     int a  =100;
		 int b = 0;
		 int c;
		 
		 try{
		 c = a/b;
		 System.out.println(c);
		 }
		 catch(Exception e){
		  System.out.println(e); 
	     }
		 System.out.println("Exception Handled Manually");
	
	}
}