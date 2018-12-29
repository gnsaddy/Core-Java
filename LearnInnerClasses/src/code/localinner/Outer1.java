package code.localinner;

 class Outer1 {
     int x = 10;
     static int y = 20;
     private int z = 30;

     public void m1() {
         class Inner1 {
             public void show() {
                 System.out.println(x);
                 System.out.println(y);
                 System.out.println(z);
             }
         }
         Inner1 ii = new Inner1();
         ii.show();
     }

     public static void main(String[] args) {
         Outer1 obj = new Outer1();
         obj.m1();
     }
 }
