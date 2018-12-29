// interface 100% abstraction and implicitily methods are public and abstract.
interface InterfaceCheck {
	
	void m1(int a);
	void m2(int b);
	void m3();
}
class InterfaceTest implements InterfaceCheck {
	public void m1(int a) {         // interface method is implicitily public so due to priority of modifiers we have to declare child methods as public
		System.out.println("m1 method with value "  +a);
	}
	public void m2(int b) {
		System.out.println("m2 method with value "  +b);
	}
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args)
	{
		InterfaceTest obj=new InterfaceTest();
		obj.m1(20);
		obj.m2(50);
		obj.m3();
		}
}	
