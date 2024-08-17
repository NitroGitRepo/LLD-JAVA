package Inheritence;

public class D extends C{

    int D_Variable;

    D(){
        super(10);
        System.out.println("D default constructor");
    }

    public static void main(String[] args) {
        D d = new D();
    }
}
