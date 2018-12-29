package first;

import java.util.Scanner;

/**
 * Created by gnsad on 08-11-2017.
 */
public class Program6 {


    public static void main(String[] args) {
        NumberPlay p= new NumberPlay();
        int choice=0;
        while(choice!=6)
        {
            System.out.print("\nYou WANT TO\n1:DISPLAY\t 2:SUM\t3:AVERAGE\t4:MAX\t 5:MIN\t 6:EXIT\n");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: p.disply();
                    break;
                case 2: p.sum();
                    break;
                case 3: p.avg();
                    break;
                case 4: p.max();
                    break;
                case 5: p.min();
                    break;
                case 6: choice=6;
            }
        }
    }

}
class Numeral
{
    public int[] array=new int[10];


    Numeral()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter 10 no's");
        for(int i=0;i<10;i++)
        {
            System.out.print("enter  no "+ (i+1) +" :");
            array[i]=sc.nextInt();
        }
    }

}
class NumberPlay extends Numeral
{
    public int sum,max,min;
    public void disply()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println((i+1) +" number " +array[i]);
        }
    }
    public void sum()
    {
        sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println("Sum:"+sum);

    }
    public void avg()
    {
        System.out.print("average: "+(sum/10));
    }
    public void max()
    {
        max=-1235;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }

        }
        System.out.print("\nMax value: "+max);
    }
    public void min()
    {
        min= 1235;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }

        }
        System.out.print("\nMin value: "+min);
    }


}

