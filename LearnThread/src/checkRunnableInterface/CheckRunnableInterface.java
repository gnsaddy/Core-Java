package checkRunnableInterface;

public class CheckRunnableInterface implements Runnable {
    public void run(){
        for (int i=1;1<=5;i++){
            System.out.println("Thread 1 go--" +i);
    }
}
}
//public class CheckRun2{
//    public void run(){
//        for (int i=1;1<=5;i++)
//            System.out.println("Thread 2 go--" +i);
//    }
//}
  class Test3{
    public static void main(String[] args){
        CheckRunnableInterface obj= new CheckRunnableInterface();
        Thread thread=new Thread(obj);
        thread.start();

//        CheckRun2 obj1=new CheckRun2();
//        Thread thread1= new Thread(obj1);
//        thread1.start();
    }
}
