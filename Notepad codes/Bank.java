class Bank{
	void show(){
		System.out.println("Interest rate of different bank is ");
}
}
class Sbi extends Bank {
	void show(){
		System.out.println("Interest rate of different SBI is " +8);
}
}
class Axis extends Bank {
	
	void show(){
		System.out.println("Interest rate of different Axis bank is " +9);
}
}
class Idfc extends Bank {
	void show(){
		System.out.println("Interest rate of different IDFC bank is " +10);
		
}
public static void main(String[] args)
{
	Idfc obj1=new Idfc();
	Axis obj2=new Axis();
	Sbi obj3=new Sbi();
	Bank obj4=new Bank();
	obj1.show();
	obj2.show();
	obj3.show();
	obj4.show();
}
}
	
	