// single class more than one interface
/* java doesnot support multiple inheritance in case of interface also because we cannot creat object of interface so there is no
physical existence of that interface class */

interface InterfaceCheck1 {
	void m1();
}
interface InterfaceCheck2 {
	void m2();
}

class InterfaceTest1 implements InterfaceCheck1,InterfaceCheck2 {
	public void m1(){
		System.out.println("m1 method of interface1");
	}
	public void m2(){
		System.out.println("m2 method of interface2");
	}
	
	
	public static void main(String[] args)
	{
		InterfaceCheck1 obj=new InterfaceTest1();
		obj.m1();
		InterfaceCheck2 obj1=new InterfaceTest1();
		obj1.m2();
		
		
	}
}