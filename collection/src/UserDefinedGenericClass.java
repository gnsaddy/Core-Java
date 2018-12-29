import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gnsad on 12/9/2017.
 */
public class UserDefinedGenericClass {

    int id;
    String name;

    UserDefinedGenericClass(int id, String name) {
        this.id = id;
        this.name = name;
       // System.out.println(id + " " + name);
    }
    public String toString() {
        return (id + " " + name);
    }
    public boolean equals(Object ob) {
        UserDefinedGenericClass ue = (UserDefinedGenericClass)ob;
        return (id == ue.id && name.equals(ue.name));
    }
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();
        a.add(new UserDefinedGenericClass(124,"alok"));
        a.add(new UserDefinedGenericClass(125,"amit"));
        a.add(new UserDefinedGenericClass(126,"tanya"));
        a.add(new UserDefinedGenericClass(123,"aditya"));
        a.add(new UserDefinedGenericClass(127,"syed"));

        System.out.println("Size of arraylist is "+ a.size() );
        Iterator itr=a.iterator();
        while(itr.hasNext()) {
            UserDefinedGenericClass ue = (UserDefinedGenericClass) itr.next();
            System.out.println(" " + ue.id + " " + ue.name);
        }
        System.out.println("contains 124 alok " +a.contains(new UserDefinedGenericClass(124,"alok")));
        System.out.println("remove 124 alok " +a.remove(new UserDefinedGenericClass(124,"alok")));
        System.out.println("contains 124 alok " +a.contains(new UserDefinedGenericClass(124,"alok")));
        System.out.print(a);
        System.out.println("Size of arraylist is "+ a.size() );

    }
}
