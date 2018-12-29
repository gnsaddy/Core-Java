package ObjectCheck;

import ObjectCheck.Emp;
import ObjectCheck.Student;

class ObjectClass {
    public static void main(String[] args)
    {
        Object[] obj = new Object[3];
        obj[0] = new Emp(111,"addy");
        obj[1] = new Student(1,"amit");
        obj[2] = new Integer(10);

        for (Object oo : obj) {
            if (oo  instanceof Emp) {
                Emp e = (Emp) oo;
                System.out.println(e.eid+ " --"+ e.ename);
            }
            if (oo instanceof Student){
                Student s = (Student)oo;
                System.out.println(s.sid+"---"+s.sname);
            }
            if (oo instanceof Integer)
                System.out.println(oo);


        }
    }
}
