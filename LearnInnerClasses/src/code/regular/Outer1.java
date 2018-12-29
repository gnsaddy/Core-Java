package code.regular;

//case 1:- Accessing inner class code from static area(static main method ) of outer class

class Outer1 {

    class Inner1 {
     public void m1() {             //inner class method
         System.out.println("inner class m1 method");
     }
    }
    public static void main(String[] args)
    {


        Outer1 obj = new Outer1();  //creating object of outer class
        Outer1.Inner1 i =obj.new Inner1();
        i.m1();

        Outer1.Inner1 ii = new Outer1().new Inner1();
        ii.m1();
        System.out.println("outer class main method");
    }


}
