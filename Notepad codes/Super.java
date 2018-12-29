class Super {
	int x=10;
}
class Sub extends Super {
	int x=20;
	void show(){
		System.out.println(x);
		System.out.println(super.x);
	}
	public static void main(String[] args)
	{
		Sub obj=new Sub();
		obj.show();
	}
}