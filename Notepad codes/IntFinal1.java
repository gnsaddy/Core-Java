class IntFinal1 {
	final int x=10;
	void show() {
		x=20;
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		IntFinal1 obj=new IntFinal1();
		obj.show();
	}
}