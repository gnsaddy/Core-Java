import java.util.ArrayList;

import static java.util.Collections.addAll;
public class CheckArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(1000);
        arrayList.add(100);
        arrayList.add(200);
        System.out.println(arrayList);
       // System.out.println(arrayList.contains(100));
        System.out.println(arrayList.size());
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(20);
        arrayList1.add(200);
        arrayList1.add(1000);
        arrayList1.add(2000);
        arrayList1.add(100);
        System.out.println(arrayList1);
      //  arrayList1.addAll(arrayList);
      //  System.out.println(arrayList1);
        arrayList1.retainAll(arrayList);
        System.out.println(arrayList1);
        arrayList1.removeAll(arrayList);
        System.out.println(arrayList1);
        arrayList.remove(2);
        System.out.println(arrayList);

        }
}
