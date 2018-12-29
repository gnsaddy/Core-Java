// inheritance of interfaces, interfaces can extends multiple interface
interface It1 {
void m1();
}
interface It2 {
	void m2();
	
}
interface It3 extends It1,It2 {
	//void m3();
}
class IntTest1 implements It3 {
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
	}
	public void m2() {
		System.out.println("m3 method");
	}
	public static void main(String[] args)
	{
		IntTest1 obj=new IntTest1();
		obj.m1();
		obj.m2();
		//obj.m3();
	}
}
	
	