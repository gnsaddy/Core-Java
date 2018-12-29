package middle;

import java.util.Scanner;

/**
 * Created by gnsad on 12-11-2017.
 */
public class Program22 {

        public void d2b()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a decimal number:");
            int n=sc.nextInt();
            int  bin[]=new int[100];

            int i = 0;
            while(n > 0)
            {
                bin[i++] = n%2;
                n = n/2;
            }
            System.out.print("Binary number is : ");
            for(int j = i-1;j >= 0;j--)
            {
                System.out.print(bin[j]);
            }
            System.out.println("");
        }

        public void b2d()
        {
            Scanner input = new Scanner( System.in );
            System.out.print("Enter a binary number: ");
            String binaryString =input.nextLine();
            System.out.println("Output: "
                    +Integer.parseInt(binaryString,2));
        }
        public static void main(String[] args)
        {
            Program22 obj= new Program22();

            obj.b2d();
            obj.d2b();
        }
    }



