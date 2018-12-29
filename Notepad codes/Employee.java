class Employee {
	int eid;
	String ename;
	void set(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	void show()
	{
		System.out.println("Emp id is " +eid);
		System.out.println("Emp name is " +ename);
	}
}

class Pay extends Employee {
	int payid;
	String payname;
	void setpay(int payid,String payname)
	{
		this.payid=payid;
		this.payname=payname;
	}
	void getpay()
	{
		System.out.println("Pay id is " +payid);
		System.out.println("Pay name is " +payname);
	}
	public static void main(String[] args)
	{
		Pay p=new Pay();
		p.set(123,"Aditya");
		p.setpay(123456,"SBI");
		p.show();
		p.getpay();
	}
}
	
	