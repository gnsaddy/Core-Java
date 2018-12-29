package first;

/**
 * Created by gnsad on 12-11-2017.
 */
public class Patterns {
    public static void main(String[] args) {
        int count=1;
        int i=0,j=0;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
        for(i=0;i<5;i++){
            count=1;
            for(j=0;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        for(i=0;i<5;i++){
            for(j=4;j>i;j--){
                System.out.print(" ");
            }
            count=1;
            for(j=0;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}

