class emps {
 int eid;
 String ename;
 emps(int eid,String ename)
 {
 this.eid=eid;
 this.ename=ename;
 }
 void show()
 {
 System.out.println(eid);
 System.out.println(ename);
 }
 
 public static void main(String[] args)
 {
 emps e1=new emps(1,"aditya");
 e1.show();
 emps e2=new emps(2,"amit");
 e2.show();
 }
 }
 
 