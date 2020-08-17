package IO;

/**
 * learning.IO
 * Created on 2020/8/1 20:02
 *
 * @author Protein
 */

import java.io.IOException;
import java.io.PrintStream;

/**
 * java.io.PrintStream：打印流
 * PrintStream为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
 * PrintStream特点：
 * 1.只负责数据的输出，不负责数据的读取
 * 2.与其他输出流不同，PrintStream永远不会抛出IOException
 * 特有方法：
 * void print(任意类型的值)
 * void println(任意类型的值并换行)
 * 构造方法：
 * PrintStream(File file)：输出的目的地是一个文件
 * PrintStream(OutputStream out)：输出的目的地是一个字节输出流
 * PrintStream(String fileName)：输出的目的地是一个文件路径
 * 使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 * static void setOut(PrintStream out)：重新分配“标准”输出流。
 */
public class PrintStreamClass {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("src\\IO\\test07.txt");
        ps.write(97);
        ps.write("\r\n".getBytes());
        ps.println("hello World!");
        System.out.println("Output in Console");
        System.setOut(ps);
        System.out.println("Output in PrintStream: test07.txt");
        ps.close();
    }
}
