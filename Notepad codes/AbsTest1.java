// constructor in abstract class and dynamic binding or late binding.

abstract class AbsBase {
	AbsBase(int a){
		System.out.println("Abstract class constructor " +a);
	}
	abstract void m1();
}

	

class AbsTest1 extends AbsBase {
	
	AbsTest1(int a){
		super(30);
		System.out.println("Child class constructor " +a);
	}
	void m1() {
		System.out.println("M1 method ");
	}
	
	public static void main(String[] args)
	{
		AbsBase obj=new AbsTest1(50);  // base class reference id holds the child class object.
		//obj.m1();
		
		AbsTest1 ab=(AbsTest1)obj;  //downcasting 
		ab.m1();
	}
}