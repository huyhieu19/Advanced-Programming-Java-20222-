package BaiTrenLop12_7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


//
// Summary: Create server to listen request form client
// tính diện tích
//
public class SocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataOutputStream outputStream = null;
        DataInputStream inputStream = null;
        try{
            // create server socket
            serverSocket = new ServerSocket(9000);
            // accept request
            socket = serverSocket.accept();
            // read input from client
            inputStream = new DataInputStream(socket.getInputStream());
            // send area to client
            outputStream = new DataOutputStream(socket.getOutputStream());
            while(true) {
                new Thread(new ClientHandler(socket)).start();
                double radius = inputStream.readDouble();
                double area = Math.PI * radius * radius;
                outputStream.writeDouble(area);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                socket.close();
                serverSocket.close();
                inputStream.close();
                outputStream.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
