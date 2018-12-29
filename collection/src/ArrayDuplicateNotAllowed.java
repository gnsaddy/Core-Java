import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
public class ArrayDuplicateNotAllowed {
    public static void main(String[] args){
        ArrayList a= new ArrayList();
        a.add(10);
        a.add(100);
        a.add(200);
        a.add(200);
        a.add(300);
        a.add(100);
        a.add(10);
        a.add(300);
       for (Object i:a) {
            System.out.println(i);
        }
        System.out.println("No duplicate allowed ");

        HashSet hashSet=new HashSet(a);
        for (Object k : hashSet) {
            System.out.println(k);
        }
        System.out.println("No duplicate allowed ");
        LinkedList l= new LinkedList(a);
        for (Object o:a) {
            System.out.println(o);

        }

    }


}
