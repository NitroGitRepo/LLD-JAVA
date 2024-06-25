class Test10
{
    public void check()throws Exception{
	    int a = 100, b = 0, c = a/b;
	}
	public static void main(String[] args){
	    Test10 t = new Test10();
		try{
	    t.check();	
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("main method");
		}
	}

}
