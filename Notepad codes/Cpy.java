class Cpy {
	int x,y;
	Cpy(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Cpy(Cpy z)  //acheving copy through parametrized cons
	{
		this.x=z.x; //passing value of x to z(x)
		this.y=z.y; //passingvalue of y to z(y)
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args)
	{
		Cpy t1=new Cpy(20,40);
		t1.show();
		Cpy t2=new Cpy(t1); //passing reference id of 1st that is t1
		t2.show();
	}
}
