import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideClass {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(999);  //server socket with port
        Socket socket=serverSocket.accept(); //client accept connection until the server side waits
        System.out.println("connection established "); //connection confirmation

        OutputStream outputStream=socket.getOutputStream();//attach the output stream to server socket
        PrintStream printStream=new PrintStream(outputStream);//attach the print stream to send the server side

        String str= " Hello client";
        printStream.println(str);
        printStream.println(" server send data to client");
        printStream.println(" bye");

        printStream.close();
        serverSocket.close();
        socket.close();

        }
}
