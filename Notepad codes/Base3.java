class Base3 {
	void show()
	{
		System.out.println("Parent show method ");
	}
	void disp()
	{
		System.out.println("Parent disp method ");
	}
}
class Child extends Base3 {
	void disp()
	{
		super.disp();
		System.out.println("Child disp method ");
	}
	public static void main(String[] args)
	{
		Base3 obj=new Child();
		//obj.show();
		//obj.disp();
		Child c=(Child)obj; 
		c.disp();
		c.show();
	}
}
		