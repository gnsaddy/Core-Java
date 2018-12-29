package code.regular;

public class Outer4 {
    int x=10;
    static int y =20;
    public int z=30;
    private int a=40;
    protected int b=50;
    class Inner4 {
        public void m1() {
            System.out.println("instance var " + x);
            System.out.println("static var " + y);
            System.out.println("public var " + z);
            System.out.println("private var " + a);
            System.out.println("procted var " + b);
        }
    }
    public static void main(String[] args)
    {
        new Outer4().new Inner4().m1();
    }
}
