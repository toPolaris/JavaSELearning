package NetworkCommunication.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * learning.NetworkCommunication.UpLoad
 * Created on 2020/8/2 10:24
 *
 * @author Protein
 */
public class Client {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\NetworkCommunication\\UpLoad\\client.jpg");
        Socket socket = new Socket("127.0.0.1", 23333);
        OutputStream os = socket.getOutputStream();
        int len;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len = is.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        fis.close();
        socket.close();
    }
}
