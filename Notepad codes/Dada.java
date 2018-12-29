class Dada {
int x=10;
}
class Papa extends Dada {
	int x=20;
}
class Child extends Papa {
	int x=30;
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(((Dada)this).x);
	}
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.show();
	}
}