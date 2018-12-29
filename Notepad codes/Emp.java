class Emp {
	int eid;
	String ename;
	void getemp(int e,String en)
	{
		eid=e;
		ename=en;
	}
	void disp()
	{
		System.out.println("Emp id is " + eid);
		System.out.println("Emp name is " + ename);
	}
	public static void main(String[] args)
	{
		Emp s=new Emp();
		Emp s1=new Emp();
		s.getemp(1234,"Aditya");
		s.disp();
		s1.getemp(123456,"Aditya Raj");
		s1.disp();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
}