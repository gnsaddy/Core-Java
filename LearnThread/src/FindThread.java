class FindThread{
    public static void main(String[] args){
        Thread thread=Thread.currentThread();
        System.out.println(thread.getClass().getName());
        System.out.println(thread.getClass());
        System.out.println(thread.getName());

    }
}
