abstract class Plan {
	abstract void getRate(int unit);
}
class Commercial extends Plan {
	int unit; float rate;
	 void getRate(int unit)
	{
		rate=2.8f;
		System.out.println("commercial rate = " +(unit*rate));
	}
}
class Domestic extends Plan {
	int unit; float rate;
	 void getRate(int unit)
	{
		rate=4.6f;
		System.out.println("Domestic rate = " +(unit*rate));
	}
}
class Normal extends Plan {
	int unit; float rate;
	 void getRate(int unit)
	{
		rate=1.6f;
		System.out.println("Domestic rate = " +(unit*rate));
	}
}
	
	
	class AbsTest {
	   
	 public static void main(String[] args)
	{
		 System.out.println("Different rate :-- ");
		Commercial obj=new Commercial();
		obj.getRate(86);
		Domestic obj1 =new Domestic();
		obj1.getRate(96);
		Normal obj2= new Normal();
		obj2.getRate(48);
		
	}
}