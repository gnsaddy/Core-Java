//  13th program

package middle;

class ClassA extends Thread {
    public void run() {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

class ClassB extends Thread {
    public void run() {
        String message = "This is the sample text!!";
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}

class ClassC extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(i);
            }

        }
    }
}

 class Main {

    public static void main(String[] args) {

        ClassA threadA = new ClassA();
        threadA.start();


        ClassB threadB = new ClassB();
        threadB.start();


        ClassC threadC = new ClassC();
        threadC.start();


    }
}
