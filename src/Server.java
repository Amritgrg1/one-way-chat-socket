import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
//            printWriter.println("Hello");
            System.out.println("Connection successfully");
            Scanner sc = new Scanner(System.in);
            while (true){
                String wow = sc.nextLine();

                printWriter.println(wow);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}