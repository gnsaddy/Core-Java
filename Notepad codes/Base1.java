//default constructor in a case of inheritance.In this the constructorof parent class envoked in the 1st line of the constructorof child class

class Base1 {
	Base1()
	{
		System.out.println("Base class constructor ");
	}
}
class Child extends Base {
	Child()
	{
		System.out.println("Child class constructor ");
	}
	public static void main(String[] args)
	{
		Child obj=new Child();
		//new Child(); 
		
	
	}
}