class SupParent {
	SupParent(int x)
	{
	System.out.println("Super Parent class called " +x);
	}
}
class Parent extends SupParent {
	Parent(int y)
	{
		super(70);
		System.out.println("Parent class called " +y);
	}
}
class Child extends Parent {
	Child(int z)
	{
		super(60);
		System.out.println("Child class called " +z);
	}
	public static void main(String[] args)
	{
		new Child(50);
	}
}