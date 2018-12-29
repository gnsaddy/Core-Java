//generic are used to declare only same type of specified elements
/* In the integer generic collection we can only take integer type of variables. */

import java.util.*;
public class GenricCollection {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        for (int j=60;j<=150;j+=10){  //for extending the values upto 150
            al.add(j);
        }
        System.out.println("use of Iterator ");
        Iterator i = al.iterator();   //Iterator is an interface
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("use of foreach loop ");
        for (Integer obj:al) {
            System.out.println(obj);
        }

    }
}


