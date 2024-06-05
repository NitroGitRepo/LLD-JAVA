class Test1{
    Object show(){System.out.println("1");
	return null;}
}
class XYZ1{

    String show(){System.out.println("2");
	return "abc";}
	
	public static void main(String[] args){
	
	Test1 t = new Test1();
	t.show();
	
	XYZ1 x = new XYZ1();
	x.show();
	
	}
}