//method implementation in interface by the us of default keyword. This feature can be introduce in the JDK 1.8
 interface It1 {
	default void m1() {
		System.out.println("m1 method");
	}
	void m2();
 }
		 

class IntTest2 implements It1 {
	public void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{
		IntTest2 obj=new IntTest2();
		obj.m1();
		obj.m2();
	}
}