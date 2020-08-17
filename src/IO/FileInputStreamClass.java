package IO;

/**
 * learning.IO
 * Created on 2020/7/31 16:38
 *
 * @author Protein
 * <p>
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。
 * public void close()：关闭此输入流并释放与此流相关联的任何系统资源。
 * public abstract int read()：从输入流读取数据的下一个字节返回值为字节值。
 * public int read(byte[] b)：从输入流中读取多个字节到字节数组b中，返回值为读取有效字节数，-1表示到文件末尾。
 * <p>
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。
 * public void close()：关闭此输入流并释放与此流相关联的任何系统资源。
 * public abstract int read()：从输入流读取数据的下一个字节返回值为字节值。
 * public int read(byte[] b)：从输入流中读取多个字节到字节数组b中，返回值为读取有效字节数，-1表示到文件末尾。
 * <p>
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。
 * public void close()：关闭此输入流并释放与此流相关联的任何系统资源。
 * public abstract int read()：从输入流读取数据的下一个字节返回值为字节值。
 * public int read(byte[] b)：从输入流中读取多个字节到字节数组b中，返回值为读取有效字节数，-1表示到文件末尾。
 * <p>
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。
 * public void close()：关闭此输入流并释放与此流相关联的任何系统资源。
 * public abstract int read()：从输入流读取数据的下一个字节返回值为字节值。
 * public int read(byte[] b)：从输入流中读取多个字节到字节数组b中，返回值为读取有效字节数，-1表示到文件末尾。
 */

/**
 * java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。
 * public void close()：关闭此输入流并释放与此流相关联的任何系统资源。
 * public abstract int read()：从输入流读取数据的下一个字节返回值为字节值。
 * public int read(byte[] b)：从输入流中读取多个字节到字节数组b中，返回值为读取有效字节数，-1表示到文件末尾。
 */

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream是文件输入流，从文件中读取字节。
 *  FileInputStream(File file)：通过打开与实际文件的连接来创建一个FileInputStream，该文件由文件系统中的File对象file命名。
 *  FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream，该文件由文件系统中的路径名name命名。
 * 使用方法：
 *  1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *  2.使用FileInputStream对象中的方法read,读取文件
 *  3.释放资源
 * */
public class FileInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\IO\\test01.txt");
        int c = fis.read();
        System.out.println(c + "-->" + (char) c);
        System.out.print((char) fis.read());
        System.out.print((char) fis.read());
        //起缓冲作用的数组，长度一般为1024（1kb），这里只取4
        byte[] bytes = new byte[4];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len) + len);
        }
        fis.close();
    }
}
