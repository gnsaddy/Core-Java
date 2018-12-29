
public class TestUnknown {
        static int count;
        TestUnknown()
        {
            count++;
            System.out.println("objects"+count);
        }
    }
    class mn
    {
        public static void main(String s[])
        {
            TestUnknown a1 = new TestUnknown();
            TestUnknown a2 = new TestUnknown();
            TestUnknown a3= new TestUnknown();
        }
    }


