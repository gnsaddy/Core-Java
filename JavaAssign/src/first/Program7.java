package first;

import java.util.Scanner;


public class Program7
{
    public Program7( )
    {
        System.out.println("Weight of a bundle is 5 kg  ");
    }
    public Program7(int kilos, int grams)
    {
        int n = grams / 1000;
        if(n >= 1)
        {
            kilos = kilos + n;
            grams = grams - (n*1000);
        }
        System.out.println("Weight of bundle: " +kilos+ " kilos and " +grams+ " grams");
    }

    public static void main(String [ ] args)
    {
        Program7 con = new Program7();
        Scanner sc = new Scanner(System.in);
        int kilo, gram;
        System.out.println("Enter the weight of bundle in kilos and grams: ");
        System.out.println("Kilos = ");
        kilo = sc.nextInt();
        System.out.println("Grams = ");
        gram = sc.nextInt();
        Program7 con1 = new Program7(kilo, gram);
        sc.close();
    }
}

