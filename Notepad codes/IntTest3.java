
interface It1 {
 int x=10;
 final void m1();
}
interface It2 {
	int x=20;
}


class IntTest3 implements It1,It2{
	 public void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args)
	{
		IntTest3 obj=new IntTest3();
		obj.m1();
		System.out.println(It1.x);
		System.out.println(It2.x);
	}
}