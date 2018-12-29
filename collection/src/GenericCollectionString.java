import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gnsad on 12/9/2017.
 */

 /*In the string generic collection we can only take string type of variables. */
public class GenericCollectionString {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("java");
        al.add("python");
        al.add("android");
        al.add("pascal");
        Iterator i = al.iterator();   //Iterator is an interface
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
