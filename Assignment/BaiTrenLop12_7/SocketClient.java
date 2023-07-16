package BaiTrenLop12_7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//
// Lập client để gửi bán kính cho server
//
public class SocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        double radius = 1.0;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;

        int count = 0;

        try{
            socket = new Socket("localhost", 9000);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            while(true){
                radius = Math.random()*10;
                // send to server
                outputStream.writeDouble(radius);
                //read from server
                double area = inputStream.readDouble();
                System.out.println((++count) + ": Radius = " + radius + " area = " + area);
                Thread.sleep(2000);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                socket.close();
                inputStream.close();
                outputStream.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
