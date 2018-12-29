import java.io.*;

public class Test1 {

    public static  void main(String[] args) throws IOException
    {
        File file = new File("E:\\MyWorkPlace\\JavaPrograms\\JavaInputOutput\\src");
        FileInputStream fileInputStream = new FileInputStream("E:\\MyWorkPlace\\JavaPrograms\\JavaInputOutput\\src\\abc.txt");  //read operation
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\MyWorkPlace\\JavaPrograms\\JavaInputOutput\\src\\xyz.txt");  //write operation
        int c;

        while((c=fileInputStream.read())!=-1);{
            System.out.println((char)c);

            fileOutputStream.write(c);
    }

       // System.out.print((char)c);
        fileInputStream.close();
            fileOutputStream.close();
    }
}
