class Init {
	int x;
	{
		this.x=10;
		System.out.println("Showing init " +x);
	}
	Init()
	{
		System.out.println("init block");
	}
	void show()
	{
		System.out.println("Showing normal function ");
	}
	public static void main(String[] args)
	{
		Init s=new Init();
		s.show();
	}
}
		