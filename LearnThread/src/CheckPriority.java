//Thread priority
//normal priority set b OS in thread is 5
/* getPriority() method is used to set the priority of thread*/

 class CheckPriority extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("user defined thread1");
    }
}
class CheckPriority2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("user defined thread-2 ");
        }
    }
}
class Test2{
    public static void main(String[] args)
    {
        CheckPriority obj=new CheckPriority();
        obj.start();
        System.out.println("priority thread 1 --" + obj.getPriority());
        CheckPriority2 obj1=new CheckPriority2();
        obj1.start();
        System.out.println("priority thread 2 --" + obj1.getPriority());
        obj.setPriority(3);
        System.out.println("priority thread 1 --" + obj.getPriority());

    }
}
