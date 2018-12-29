import java.util.Scanner;

/**
 * Created by gnsad on 6/18/2018.
 */
public class CalculateDistance {
    Scanner sc= new Scanner(System.in);
    void showDistance(){

        System.out.println("enter velocity=");
        double  u=sc.nextInt();

        System.out.println("enter time=");
        double t=sc.nextInt();

        System.out.println("enter accleration=");
        double a=sc.nextInt();

        System.out.println("Given velocity,time and accleration is " +u +" "+ t+" "+a);

        double distance=(u*t+(a*t*t)/2);
        System.out.println("distance ="+distance+" meters");

    }
    void showCylindervolume(){

        System.out.println("Enter the radius:");
        double r=sc.nextDouble();
        System.out.println("Enter the height:");
        double h=sc.nextDouble();

        double  volume=((22*r*r*h)/7);

        System.out.println("volume of Cylinder is: " +volume);
    }
    public static void main(String[] args){
        CalculateDistance obj=new CalculateDistance();
        obj.showDistance();
        obj.showCylindervolume();

    }
}
