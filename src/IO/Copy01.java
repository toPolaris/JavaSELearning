package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * learning.IO
 * Created on 2020/7/31 16:59
 *
 * @author Protein
 */
public class Copy01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\IO\\test.jpg");
        File file = new File("src\\IO\\copy01.jpg");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fos = new FileOutputStream("src\\IO\\copy01.jpg");
        long s = System.currentTimeMillis();
        byte[] bytes = new byte[1024];
        while ((fis.read(bytes)) != -1) {
            fos.write(bytes);
        }
        long e = System.currentTimeMillis();
        fis.close();
        fos.close();
        System.out.println("Time: " + (e - s) + "ms");
    }
}
