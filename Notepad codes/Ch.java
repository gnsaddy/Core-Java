
import java.util.Scanner;
class Ch {
  int a,b,c;
 /* Ch(int a,int b) {
	  this.a=a;
	  this.b=b;
  }*/
  Ch() {
	   Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers:-");
      a=s.nextInt();
      b=s.nextInt();
   c=a+b;}
  void show() {
	  
	  System.out.println("Addition = " + c);
  }
  
  
  public static void main(String[] args)
  {
	  Ch s=new Ch();
	
	  s.show();
  }
}