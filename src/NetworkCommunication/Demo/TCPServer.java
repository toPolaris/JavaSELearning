package NetworkCommunication.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * learning.NetworkCommunication.Demo
 * Created on 2020/8/2 9:08
 *
 * @author Protein
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象，并请求系统分配指定的端口号
        ServerSocket serverSocket = new ServerSocket(23333);
        //使用ServerSocket对象中的方法accept获取到请求的客户端对象Socket
        Socket socket = serverSocket.accept();
        //使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流OutputStream对象中的方法write回写数据
        os.write("From Server: Hello Client!".getBytes());
        //释放资源（Socket,ServerSocket）
        socket.close();
        serverSocket.close();
    }
}
