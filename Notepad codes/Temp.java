class Temp {
	static Demo d;
	static
	{
		d=new Demo();
	}
}
class Demo {
	void show(int x)
	{
		System.out.println(x);
	}
}
class Test {
	public static void main(String[] args)
	{
		Temp.d.Demo(20);
	}
}