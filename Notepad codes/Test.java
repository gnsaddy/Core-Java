class Test {
 int x=10,y=20;
 void disp()
 {
	 System.out.println(x);
	 System.out.println(y);
 }
 public static void main(String[] args)
 {
	 new Test().disp();  // this is ananomous object and calling of show method 
	 //System.out.println(new Test()); // showing of reference id
	 System.out.println(new Test().hashCode()); // showing of hashcode
 }
}