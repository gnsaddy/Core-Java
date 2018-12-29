class A extends Thread {
    
    public void run(){
        for (int i=0; i<10;i++)
            System.out.println(i);
    }
}
class B extends Thread{
    public void run()
    { super.run();
         for (int j=0; j<10;j++)
            System.out.println(j);
    }
}
public class Test {
    public static void main(String[] args)
    {
//        A obj=new A();
//        obj.start();
        B obj1=new B();
        obj1.start();
    }
    
}
