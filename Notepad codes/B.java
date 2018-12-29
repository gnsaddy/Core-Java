class A {
	int a,b;
	void set (int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class B extends A {
	int c;
	void add()
	{
		System.out.println(c=a+b);
	}
	public static void main(String[] args)
	{
		B s=new B();
		s.set(10,20);
		s.show();
		s.add();
	}
}