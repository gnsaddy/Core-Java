// defining same name of multiple methods in an interface 

interface InterfaceCheck1 {
	void m1();
}
interface InterfaceCheck2 {
	void m1();
}
class IntTest implements InterfaceCheck1,InterfaceCheck2 {
	public void m1(){
		System.out.println("Virtual show");
	}
	public static void main(String[] args)
	{
		InterfaceCheck1 obj=new IntTest();
		obj.m1();
		InterfaceCheck2 obj1=new IntTest();
		obj1.m1();
	}
}
