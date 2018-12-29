class Test1 {
  int a=10;
 void show(int a,Test1 z)
 {
	 System.out.println("Showing of class level var " +z.a);
	 System.out.println("Showing of method var " +a);
	 System.out.println(z);
	 System.out.println(z);
 }
 
 public static void main(String[] args)
 {
 Test1 t=new Test1();
 t.show(20,t);
 System.out.println(t);
 Test1 s=new Test1();
 s.show(30,s);
 System.out.println(s);
 }
 }
  