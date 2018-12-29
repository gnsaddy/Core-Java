public class Emp{
		int id;
		String name;
		Address address;
		Emp(int id,String name,Address address)
		{
			this.id=id;
			this.name=name;
		    this.address=address;
		}
		void show()
		{
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
		}
		public static void main(String[] args)
		{
			Address address1=new Address("New Delhi","Delhi","India");
			
			
			Emp emp1=new Emp(101,"Aditya",address1);
			
		
			emp1.show();
		}
	}
		











	