class Cons {
int x,y;
String z="Aditya";

	/*Cons()
	{
	x=10;
	y=20;
	z="Aditya";
}
*/ 
Cons(Cons x,Cons y)
 { 
   this.x=x;
   this.y=y;
 }
	 
	 
	void show()
	{
System.out.println(x);
System.out.println(y);
System.out.println("sum =" + (x+y));
System.out.println(z);
}
public static void main(String[] args)
{
 Cons c=new Cons(10,20);
 c.show();
 }
 }