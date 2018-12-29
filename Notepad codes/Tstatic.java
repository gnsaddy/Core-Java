class Tstatic {
	int a=10;
	void show(int a)
	{
		System.out.println("value =" +this.a);
	}
	public static void main(String[] args)
	{
		Tstatic t=new Tstatic();
		t.show(20);
	}
}