class Chain {
	
	Chain()
	{
		this(10);
		System.out.println("Default cons called ");
	}
	Chain(int x)
	{
		this(10,20);
		System.out.println("Value of x " +x);
	}
	Chain(int x,int y)
	{
		System.out.println("Sum of x and y = " +(x+y));
	}
	public static void main(String[] args)
	{
		new Chain();
	}
}