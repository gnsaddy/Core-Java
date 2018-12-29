import java.util.ArrayList;
import java.util.Iterator;
//iterator is an interface in java which is used to traverse the element.
// hasNext() method is used for traverse
// next() method is used to print the next element

public class Useofterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(1000);
        arrayList.add(100);
        arrayList.add(200);
        System.out.println(arrayList);

        System.out.println("Using of iterator");
        Iterator iterator= arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("using of foreach loop");
        for (Object i:arrayList) {
            System.out.println(i);

        }

    }
}
