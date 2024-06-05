abstract class Vechile{

    abstract void start();
	
}

 class Car extends Vechile
{
	void start()
	{
		System.out.println("car start with key");
	}
}
class Scooter extends Vechile
{
	void start()
	{
		System.out.println("scooter starts with kick");
	}
	public static void main(String[] args)
	{
		//Vechile v = new Vechile();
		Car c = new Car();
		c.start();
		
		Scooter sc = new Scooter();
		sc.start();
	}
}