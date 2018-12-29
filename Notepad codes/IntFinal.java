//final class cannot be inheriated , final method cannot be override
 final class IntCheck {
	 void show() {
		System.out.println("show method");
	}
}
class IntFinal extends IntCheck {
	void show() {
		System.out.println("display method");
	}
	public static void main(String[] args)
	{
		IntFinal obj=new IntFinal();
		obj.show();
		//obj.disp();
	}
}

	