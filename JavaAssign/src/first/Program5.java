package first;

/**
 * Created by gnsad on 08-11-2017.
 */
public class Program5 {
        Program5()
        {
            System.out.println("class constructor with no parameters");
        }
        Program5(int x)
        {
            System.out.println("class constructor with one integer  parameters");
        }
        Program5(int x,String s)
        {
            System.out.println("class constructor with one integer and one string parameters, first int,second string type parmeter");
        }
        Program5(String s,int x)
        {
            System.out.println("class constructor with one String and one integer  parameters ,first string,second int type parmeter");
        }
        public static void main(String[] args) {
            Program5 l= new Program5();
            Program5 m= new Program5(9);
            Program5 n= new Program5(9,"hello");
            Program5 o= new Program5("hello",9);
        }

    }

