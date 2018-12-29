class Static {
	 static int x=10;
	 static
	{
		//this.x=x;
		System.out.println("Inside the static block " +x);
		}
}
    class Demo {
		
		public static void main(String[] args)
		{
			System.out.println(Static.x);
		}
}