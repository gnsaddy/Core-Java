package pkg1;

class A{
    public int a=10;
}
class B extends A{
    void fun(){
        System.out.println(a);
    }
}

public class First {
    public static void main(String[] args)
    {
        B obj=new B();
        System.out.println(obj.a);
        obj.fun();

    }
}
