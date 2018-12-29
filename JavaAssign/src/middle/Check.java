package middle;

/**
 * Created by gnsad on 12-11-2017.
 */
import java.io.*;
import java.net.*;

 class Server
{
    public static void main(String[] args)
    {
        try{
            ServerSocket ss = new ServerSocket(5555);
            Socket sk = ss.accept();
            DataInputStream din = new
                    DataInputStream(sk.getInputStream());

            int num;
            num = (int)din.read();
            System.out.println("Factorial of the Number is: " +
                    factorial(num));
            System.out.println("Fibonacci series upto "+num+ "term(s):");
            fibonacci(num);
            din.close();
            ss.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static long factorial(int num)
    {
        long fact = 1;
        while(num>=2)
        {
            fact =fact* num;
            num--;
        }
        return fact;
    }

    private static void fibonacci(int num)
    {
        int a = 0, b = 1, i, temp;
        for(i=0; i<num; i++)
        {
            if(i<=1)
                temp = i;
            else
            {
                temp = a + b;
                a = b;
                b= temp;
            }
            System.out.print(temp+"\t");
        }

    }

}


