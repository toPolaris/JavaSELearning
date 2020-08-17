package NetworkCommunication.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * learning.NetworkCommunication.UpLoad
 * Created on 2020/8/2 10:25
 *
 * @author Protein
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(23333);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("src\\NetworkCommunication\\UpLoad\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String name = "server" + System.currentTimeMillis() + new Random().nextInt(9999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + name);
                        int len;
                        byte[] buffer = new byte[1024];
                        while ((len = is.read(buffer)) != -1) {
                            fos.write(buffer, 0, len);
                        }
                        socket.getOutputStream().write("Upload Successfully!".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
