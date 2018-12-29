import java.util.ArrayList;

public class GenericString {
    public static void main(String[] args){
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("aditya raj");
        stringArrayList.add("bhaskar uday");
        stringArrayList.add("alok");
        stringArrayList.add("amit");
        for (String obj:stringArrayList) {
            System.out.println("showing name" + obj);
        }
    }
}
