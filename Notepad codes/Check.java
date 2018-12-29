class Check {
int a=10;
void show(int a)
{
 //this.a=a;
 System.out.println(this.a);
 }
 public static void main(String[] args)
 {
 Check t=new Check();
 t.show(200);
 }
 }