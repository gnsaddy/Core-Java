package basic;

public class Emp1 {
    int eid;
    String ename;

    Emp1(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public static void main(String[] args) {
        Emp1 e1 = new Emp1(111, "aditya");
        Emp1 e2 = new Emp1(222, "amit");
        Emp1 e3 = new Emp1(333, "alok");

        Emp1[] e = new Emp1[3];
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;

        for (Emp1 ee : e) {
            System.out.println(ee.eid + "---" + ee.ename);

        }
    }
}
