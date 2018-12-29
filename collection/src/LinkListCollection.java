import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkListCollection {
    public static void main(String[] args) throws IOException
       {
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("patna");
        ll.add("arrah");
        ll.add("delhi");
        ll.add("mumbai");
        System.out.println("List = "  +ll);
           BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                   String element;
           int position,choice=0;
           while(choice<4){
               System.out.println("LinkedList  operation  " );
               System.out.println("1 add an element ");
               System.out.println("2 remove element ");
               System.out.println("3 change element ");
               System.out.println("4 exit" );
               System.out.println("Enter choice ");
               choice = Integer.parseInt(b.readLine());
               switch(choice){
                   case 1: System.out.println("enter the element ");  //case 1
                   element=b.readLine();
                   System.out.println("enter position ");
                   position=Integer.parseInt(b.readLine());
                   ll.add(position-1,element);
                   break;

                   case 2: System.out.println("enter position ");   //case 2
                   position = Integer.parseInt(b.readLine());
                   ll.remove(position-1);
                   break;

                   case 3:    System.out.println("enter the position ");  //case 3
                   position=Integer.parseInt(b.readLine());
                   System.out.println("enter the element ");
                   element=b.readLine();
                   ll.add(position-1,element);
                   break;
                   default: return;
               }

               System.out.println("list = " +ll);
               for (Object ob:ll) {
                   System.out.println(ob);

               }
//               Iterator it= ll.iterator();
//               while(it.hasNext()){
//                   System.out.println(it.next()+ " ");
//               }
           }

    }
}
