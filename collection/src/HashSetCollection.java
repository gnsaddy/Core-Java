import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by gnsad on 12/10/2017.
 */
public class HashSetCollection {
    public static void main(String[] args){
        HashSet s= new HashSet();
        System.out.println(s.size());
        s.add("abc");  //96354
        s.add("qwe");    //112383
        s.add("xyz");      //119193
       s.add("rty");        //113271
        s.add("efg");  //100326
        s.add("abc");  //duplicate element
        System.out.println("data is as "+ s );

        for(Object k : s) {
                System.out.println(k);


        }

    }
}
