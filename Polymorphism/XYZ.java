class Test
{
    int i;
	void setValue(int x)
	{
	    i = x;
	}
	void show()
	{
	   System.out.println(i);
	}
}
class XYZ
{
    public static void main(String[] args)
	{
	   Test t = new Test();
	   t.setValue(10);
	   t.show();
	}
}