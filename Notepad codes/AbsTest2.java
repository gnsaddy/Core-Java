abstract class AbsCheck1 {
	abstract void  m1();
}
class AbsCheck2 extends AbsCheck1 {
	void m1(){
		System.out.println("1st child method ");
	}
}

class AbsCheck3 extends AbsCheck2 {
	void m1(){
		System.out.println("2nd child method ");
	}
}

class AbsTest2{
	public static void main(String[] args)
	{
		AbsCheck2 obj1=new AbsCheck2();
		obj1.m1();
		AbsCheck3 obj2=new AbsCheck3();
		obj2.m1();
		
		
		}
}