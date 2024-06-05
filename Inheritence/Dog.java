class Animal{
    void eat(){
  
      System.out.println("I am eating- Animal");
    }
}
class Dog extends Animal
{
    public static void main(String[] args){
	    Dog d = new Dog();
		d.eat();
    }
}
