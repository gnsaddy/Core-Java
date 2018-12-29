class Base2 {
	Base2(int x)
	{
		System.out.println("Base called " +x);
	}
	Base2(int x,int y)
	{
		System.out.println("2nd base cons " +x + " and " +y);
	}
}
class Child extends Base2 {
	Child(int y)
	{
		super(30); //used to envoked the base class constructor of same parameter
		System.out.println("Child called " +y);
	} 
	Child(int m,int n)
	{
		super(50,60);
		System.out.println("2nd child cons " +m + " and " +n);
	}
		
	public static void main(String[] args)
	{
		new Child(20);
		Child obj=new Child(70,80);
	}
}
		