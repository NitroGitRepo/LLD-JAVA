class Case6{

    void show(int... a){
	    System.out.println("var args method");
	}
	
	public static void main(String[] args){
	Test t = new Test();
	t.show(10,20,30);
	}
} 