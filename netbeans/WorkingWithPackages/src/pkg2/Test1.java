
package pkg2;
import pkg1.First;

class Second extends First{

    
    void show(){
    System.out.println(a);
    }
}
public class Test1 {
    public static void main(String[] args)
    {
        Second obj=new Second();
        obj.show();
        
    }
}
        
    
    

