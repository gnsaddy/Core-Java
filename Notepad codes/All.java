class All {
   static int x=10;
   int y=20;
   
   static
   {
	   System.out.println("Inside the static block " +x);
   }
   
   {
	   System.out.println("Inside the init block "  +y);
   }
   
   
   
   All()
   {
	   System.out.println("Cons called");
   }
   
     void show()
   {
	   System.out.println("Normal function called");
   }
   
   public static void main(String[] args)
   {
	   All a=new All();
	   a.show();
	   System.out.println(All.x);
   }
}