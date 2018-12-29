// first program
public class CheckFibonacci {
        public static void main(String[] args) {
            int first= 0, second = 1, next;
            int num=10;

            System.out.print("First " + num + " terms: ");

            for (int i = 1; i <= num; ++i) {
                System.out.print(first + " + ");

                next = first + second;
                first = second;
                second = next;
            }
        }
    }


