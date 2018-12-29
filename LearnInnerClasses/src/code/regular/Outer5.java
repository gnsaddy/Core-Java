package code.regular;

public class Outer5 {
    int x=10;              //outer class instance var
    class Inner5 {
        int x=100;          //inner class instance var
        public void m1(){
            int x=1000;            // inner class instance method instance var
            System.out.println("Method level var " +x);
            System.out.println("Inner class level var " + this.x);
            System.out.println("Inner class level var " +Inner5.this.x);
            System.out.println("Outer class level var " +Outer5.this.x);
        }
    }
    public static void main(String[] args)
    {
        new Outer5().new Inner5().m1();
    }
}
