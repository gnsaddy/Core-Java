import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSideClass {
    public static void main(String[] args) throws Exception{

        Socket socket=new Socket("localhost",999); //client side socket with port no
        InputStream inputStream=socket.getInputStream(); // to read data from server,attach input stream to the socket
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

        String str; //receive string
        while ((str=bufferedReader.readLine())!=null)
        System.out.println("  from the server side" +str);
        bufferedReader.close();
        socket.close();

    }
}
