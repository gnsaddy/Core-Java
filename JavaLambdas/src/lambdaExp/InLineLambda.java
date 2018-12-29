package lambdaExp;



interface Checklbd {
    public void test();
}

public class InLineLambda {
   public static void main(String[] args){

        Checklbd c1= () -> System.out.println("hello world");
        c1.test();
        Checklbd c2= () -> System.out.println("Lambda expression");
        c2.test();
        Checklbd c3 = () -> System.out.println("InLine Lambda Expression");
        c3.test();

   }
}
