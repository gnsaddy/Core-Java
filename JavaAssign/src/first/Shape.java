package first;

import java.util.Scanner;

abstract class Shape{
    abstract void Area(float x, float y);
}
class Rectangle extends Shape {
    @Override
    void Area(float x, float y)
    {
        System.out.println("Area of Rectangle is: "+(x*y));
    }
}


class Triangle extends Shape {
    @Override
    void Area(float x, float y)
    {
        System.out.println("Area of Triangle is: "+(x*y)/2);
    }
}

class Test {
    public static void main(String[] args) {
        float a,b;
        int s;
        String c;

        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose a Shape: \n1.Rectangle \t\t2.Triangle\t\t3.Exit ");
                    s=sc.nextInt();
            switch (s)
            {
                case 1:	System.out.println("Enter Length and Breadth of the Rectangle: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    Shape rectangle = new Rectangle();
                    rectangle.Area(a, b);
                    break;

                case 2:	System.out.println("Enter Height and Base of the Triangle: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    Shape trianlge = new Triangle();
                    trianlge.Area(a, b);
                    break;

                case 3:	System.exit(0);

                default:    System.out.println("Invalid Choice! Try Again...");
                    break;
            }
            System.out.println();
            System.out.println("Type 'Yes' to continue, 'No' to exit. ");
                    c=sc.next();

            if(c.equalsIgnoreCase("No"))
                break;
            else
                System.out.println();

        }

    }

}

