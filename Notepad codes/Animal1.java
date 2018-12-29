 abstract class Animal1 {
	 abstract void fly();
	
	void nonfly()
	{
		System.out.println("NonFly Animals ");
	}
}

class Bird extends Animal1 {
	
	void show()
	{
		System.out.println("Bird class ");
	}
	
	void fly()
	{
		System.out.println("this section is for programmer ");
	}
}
class Bird1 extends Animal{
	
	void fly()
	{
		System.out.println("Bird1 fly method");
	}
	public static void main(String[] args)
	{
		Bird1 b=new Bird1();
		
		b.fly();
		b.nonfly();
		b.show();
	}
}