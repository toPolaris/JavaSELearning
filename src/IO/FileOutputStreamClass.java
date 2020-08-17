package IO;

/**
 * learning.IO
 * Created on 2020/7/31 16:03
 *
 * @author Protein
 * <p>
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 * <p>
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 * <p>
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 * <p>
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 * <p>
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 * <p>
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 * <p>
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 * <p>
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 * <p>
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 * <p>
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 */

/**
 * 最高超类：
 * 输入流：InputStream（字节输入流）、Reader（字符输入流）
 * 输出流：OutputStream（字节输出流）、Writer（字符输出流）
 */
/**
 * java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。
 * 共性方法：
 * public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 * public abstract void write(int b)：将指定的字节输出流。
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * java.io.FileOutputStream类是文件输出流，是OutputStream的一个简单子类，用于将数据写出到文件。
 * 构造方法：
 *  public FileOutputStream(File file)：创建文件输出流以写入由指定的File对象表示的文件。
 *  public FileOutputStream(String name)：创建文件输出流以指定的名称写入文件。
 * 使用步骤
 *  1.创建一个FileOutputStream对象，参数传入文件地址
 *  2.调用FileOutputStream对象中的方法write将数据写入到文件中
 *  3.释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
 * */
public class FileOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\IO\\test01.txt");
        fos.write(97);
        String str = "test";
        byte[] bytes = str.getBytes();
        /**
         * 如果传入的是字节数组，第一个字节如果是正数（0-127），显示时会查询ASCII码
         * 如果是负数，那么会将第一个与第二个字节组成一个GBK格式的中文字符，从而显示出来
         * */
        //写入换行符号：windows --> \r\n  linux --> /n  mac --> /r
        fos.write("\r\n".getBytes());
        fos.write(bytes);
        fos.write("\r\n".getBytes());
        fos.write(bytes, 1, 2);
        fos.write("\r\n".getBytes());
        byte[] chineseBytes = "你好".getBytes();
        //[-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(chineseBytes));
        fos.write(chineseBytes);
        fos.close();
        /**
         * public FileOutputStream(File file, boolean append)：创建文件输出流以写入由指定的 File对象表示的文件。
         * public FileOutputStream(String name, boolean append)：创建文件输出流以指定的名称写入文件。
         * */
        FileOutputStream fosContinue = new FileOutputStream("src\\IO\\test01.txt", true);
        fosContinue.write("\n\rcontinue".getBytes());
        fosContinue.close();
    }
}
