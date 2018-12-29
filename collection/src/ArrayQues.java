import java.util.ArrayList;
import java.util.Iterator;

public class ArrayQues {
    public static void main(String[] args) throws Exception{
        ArrayList arrayList=new ArrayList();
        int x[]={-1,-2,-3,-4,-5,10,2,5,7};
        for(int i=0;i<x.length;i++){
            arrayList.add(x[i]);
        }
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){

            Integer z=(Integer)iterator.next();
            if(z.intValue()<0){
                iterator.remove();
            }
            System.out.println("Iterator remove elements through traversing "+arrayList);
            }
        System.out.println(arrayList);
    }
}
