class Base {
	Base()
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
		obj.Child();
	}
}