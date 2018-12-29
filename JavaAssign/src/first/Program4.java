// program 4

package first;

import java.util.Scanner;

/**
 * Created by gnsad on 08-11-2017.
 */
public class Program4 {
        public int n;
        public String s;
        public void method()
        {
            for(int i=0;i<=1;i++)
            {
                System.out.println("Rose is beautiful");
            }
        }
        public void method(String s)
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(s+" is beautiful");
            }
        }
        public void method(int s)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println("Marigold is beautiful");
            }
        }
        public static void main(String[] args) {
            Program4 l= new Program4();
            l.s="Sunflower";
            Scanner sc= new Scanner(System.in);
            System.out.print("how many times");
            l.n=sc.nextInt();
            l.method();
            System.out.print("\n");
            l.method(l.s);
            System.out.print("\n");
            l.method(l.n);
        }

    }

