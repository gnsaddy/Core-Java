class MyThread1 extends Thread {
    public void run(){
        for (int i=0;i<10;i++)
            System.out.println("user defined threa-1 ");
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("user defined thread-2 ");

        }

    }
}
public class Test1 {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        obj.start();
        MyThread2 obj1 = new MyThread2();
        obj1.start();
        for (int i=0;i<10;i++)
            System.out.println("Main thread  ");


    }
}
