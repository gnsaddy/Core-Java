package chatserver;

import com.sun.corba.se.spi.activation.Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChat {
    public static void main(String[] args)throws Exception
    {
        Socket socket=new Socket("localhost",9999);
       // InputStream inputStream=socket.getInputStream(); // to read data from server,attach input stream to the socket
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());//to send data to the server

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(d));//to read data coming from the server

        BufferedReader keyboard1=new BufferedReader(new InputStreamReader(System.in));

        String str,str1;
        while(!(str=keyboard1.readLine()).equals("exit"));
        {
            dataOutputStream.writeBytes(str +"\n");
            str1=bufferedReader.readLine();
            System.out.println(str1);
        }
        dataOutputStream.close();
        bufferedReader.close();
        keyboard1.close();
        socket.close();

    }


}
