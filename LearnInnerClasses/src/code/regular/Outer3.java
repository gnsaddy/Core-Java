package code.regular;

//case4:- Accessing innere class code from outside of outer class

public class Outer3 {
    class Inner3{
        public void m1() {             //inner class method
            System.out.println("inner class m1 method");
        }
    }
    }
    class Test {
        public static void main(String[] args)
        {


            Outer3 obj = new Outer3();  //creating object of outer class
            Outer3.Inner3 i =obj.new Inner3();

            Outer3.Inner3 ii = new Outer3().new Inner3();
            ii.m1();
            System.out.println("Test class main method");
        }

}
