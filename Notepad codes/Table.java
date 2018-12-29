import java.util.Scanner;
class Table {
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 int i,table,n;
      n=s.nextInt();	 
	 
	 
	 for(i=1;i<=10;i++)
	 {
	   table=n*i;
	   //System.out.println(n + "X" +i "=" + table);
	   System.out.println("table" + table);
	 }
 }
}