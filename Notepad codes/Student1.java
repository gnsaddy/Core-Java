class Student1 {
	int id;
	String name;
	static String college="IIT";
	
	void setdata(int i,String n)
	{
		id=i;
		name=n;
	}
	void getdata()
	{
		System.out.println("Id is " +id);
		System.out.println("Name is " +name);
		System.out.println("College is " +college);
	}
	
	static void cchange(String c)
	{
	college=c;
	}
	
	public static void main(String[] args)
	{
	
	    cchange("NASA");
		Student1 s1=new Student1();
		s1.setdata(1,"Aditya");
		s1.getdata();
		Student1 s2=new Student1();
		s2.setdata(2,"Amit");
		s2.getdata();
	}
}