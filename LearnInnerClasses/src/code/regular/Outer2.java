package code.regular;

//case2:-  Accessing inner class method from instance area(outer class method)

public class Outer2 {

    class Inner2 {
        public void m1() {
            System.out.println("inner class m1 method");
        }
    }
    public void m2() {
        Inner2 i = new Inner2();
        i.m1();
        System.out.println("m2 method");

    }
    public static void main(String[] args){

        Outer2 obj = new Outer2();
        obj.m2();
    }
}
