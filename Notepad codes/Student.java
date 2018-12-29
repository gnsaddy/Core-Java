class Student {
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
	
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setdata(1,"Aditya");
		s1.getdata();
		Student s2=new Student();
		s2.setdata(2,"Amit");
		s2.getdata();
	}
}