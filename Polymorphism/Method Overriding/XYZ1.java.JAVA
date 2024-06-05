class Test1{
    void show(){System.out.println("1");}
}
class XYZ1{

    void show(){System.out.println("2");}
	
	public static void main(String[] args){
	
	Test1 t = new Test1();
	t.show();
	
	XYZ1 x = new XYZ1();
	x.show();
	
	}
}