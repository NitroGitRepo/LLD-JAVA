interface i1{
	default void display1();
}
abstract class Test3{

    abstract void display();
}
class Case4 implements i1
{
	default void display1(){System.out.println("display1");};
    public static void main(String[] args){
	    System .out.println("1");
	}
}