package chatserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args)throws Exception
    {
        //create server socket
        ServerSocket serverSocket=new ServerSocket(9999);
        //connect it to client socket
        Socket socket=serverSocket.accept();
        System.out.println("connection established......");

        PrintStream printStream=new PrintStream(socket.getOutputStream());
        //to read data from the client
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //to read data from the keyboard
        BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));

        while(true)//server executes continuously
        {
            String str,str1;
            //
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);//send to client
                str1=keyboard.readLine();
                printStream.println(str1);
            }

            printStream.close();
            bufferedReader.close();
            keyboard.close();
            serverSocket.close();
            socket.close();
            System.exit(0);
        }
        }
}
