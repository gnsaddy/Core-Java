package code.regular;

public class A {
    class B {
        class  C {
            public void m1() {
                System.out.println("most Inner M1 method");
            }
        }
    }
}
class Test1 {
    public static void main(String[] args) {

        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.m1();


    }
}
