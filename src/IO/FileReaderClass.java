package IO;

/**
 * learning.IO
 * Created on 2020/7/31 17:08
 *
 * @author Protein
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * <p>
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 * public void close()：关闭此流并释放与此流相关联的任何系统资源。
 * public int read()： 从输入流读取一个字符。
 * public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 */

/**
 * java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 *  public void close()：关闭此流并释放与此流相关联的任何系统资源。
 *  public int read()： 从输入流读取一个字符。
 *  public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组cbuf中 。
 * */

import java.io.FileReader;
import java.io.IOException;

/**
 * java.io.FileReader类是读取字符文件的便利类，构造时使用系统默认的字符编码和默认字节缓冲区。
 *  字符编码：字节与字符的对应规则。Windows系统的中文编码默认是GBK编码表，idea中UTF-8
 * 构造方法
 *  FileReader(File file)：创建一个新的FileReader，给定要读取的File对象。
 *  FileReader(String fileName)：创建一个新的FileReader，给定要读取的文件的名称。
 * */
public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\IO\\test01.txt");
        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }
        fr.close();
        System.out.println("\n-----------");
        fr = new FileReader("src\\IO\\test01.txt");
        char[] cbuf = new char[4];
        int len;
        while ((len = fr.read(cbuf)) != -1) {
            System.out.print(new String(cbuf, 0, len));
        }
        fr.close();
    }
}
