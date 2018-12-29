
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        HashMap hashMap= new HashMap();
        System.out.println("----Fee details of Software institute---");
        hashMap.put("java","4000");
        hashMap.put("python","500");
        hashMap.put("kotlin","600");
        hashMap.put("Android","700");
        System.out.println(hashMap.get("java"));
        System.out.println(hashMap.get("python"));
        System.out.println(hashMap.get("kotlin"));
        System.out.println(hashMap.get("Android"));
        System.out.println( hashMap.containsKey(500));
        System.out.println(hashMap.containsValue("600"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());
        System.out.println("***********************************************");
        Set set = hashMap.entrySet();
        System.out.println(set);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            String key= (String) entry.getKey();
            String value=(String)entry.getValue();
            System.out.println(key+ "=" +value);
        }




    }
}
