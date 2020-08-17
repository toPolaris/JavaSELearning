package NetworkCommunication.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * learning.NetworkCommunication.Demo
 * Created on 2020/8/2 9:08
 *
 * @author Protein
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Socket，构造方法填入服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 23333);
        //使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流OutputStream对象中的方法write给服务器发送数据
        os.write("From Client: Hello Server!".getBytes());
        //使用getInputStream()获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //释放资源（Socket）
        socket.close();
    }
}
