package IO;

/**
 * learning.IO
 * Created on 2020/7/31 17:26
 *
 * @author Protein
 * <p>
 * java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。
 * void write(int c)：写入单个字符。
 * void write(char[] cbuf)：写入字符数组。
 * abstract void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
 * void write(String str)：写入字符串。
 * void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
 * void flush()：刷新该流的缓冲。
 * void close()：关闭此流，但要先刷新它。
 * <p>
 * java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。
 * void write(int c)：写入单个字符。
 * void write(char[] cbuf)：写入字符数组。
 * abstract void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
 * void write(String str)：写入字符串。
 * void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
 * void flush()：刷新该流的缓冲。
 * void close()：关闭此流，但要先刷新它。
 */

/**
 * java.io.Writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。
 *  void write(int c)：写入单个字符。
 *  void write(char[] cbuf)：写入字符数组。
 *  abstract void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
 *  void write(String str)：写入字符串。
 *  void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
 *  void flush()：刷新该流的缓冲。
 *  void close()：关闭此流，但要先刷新它。
 * */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * java.io.FileWriter类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
 * 构造方法
 *  FileWriter(File file)：创建一个新的FileWriter，给定要读取的File对象。
 *  FileWriter(String fileName)：创建一个新的FileWriter，给定要读取的文件的名称。
 * 使用步骤：
 *  1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
 *  2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
 *  3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
 *  4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
 * */
public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\IO\\test02.txt");
        FileReader fr = new FileReader("src\\IO\\test02.txt");
        fw.write(97);
        //-1，数据仍然在缓冲区中，未写入文件中
        System.out.println(fr.read());
        fw.flush();
        //a，数据被刷新到文件中
        System.out.println((char) fr.read());
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        fw.write(chars);
        fw.write(chars, 2, 2);
        fw.write("test");
        fw.write("test", 1, 2);
        fw.close();
        fr.close();
        //追加写和换行与之前一致
        fw = new FileWriter("src\\IO\\test02.txt", true);
        fw.write("\r\ncontinue");
        fw.close();
    }
}
