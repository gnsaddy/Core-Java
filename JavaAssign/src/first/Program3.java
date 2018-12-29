// 3rd program

package first;


import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks=0;
        float[] m=new float[4];
        int n=0;
        System.out.println("Enter Marks for Java, DataStructure, MATHS and Operating System :");
        while (n<4) {
            m[n]=sc.nextFloat();
            n++;
        }
        marks=(m[0]+m[1]+m[2]+m[3])/n;

        if(marks>=80){
            System.out.println("Honors");
            System.out.println("Marks:"+marks);
        }
        else if(marks>=60 && marks<80){
            System.out.println("First Division");
            System.out.println("Marks:"+marks);
        }
        else if(marks>=40 && marks<60){
            System.out.println("Second Division");
            System.out.println("Marks:"+marks);
        }
        else if(marks>=30 && marks<40){
            System.out.println("Third Division");
            System.out.println("Marks:"+marks);
        }
        else{
            System.out.println("Fail");
            System.out.println("Marks:"+marks);
        }
    }

}
