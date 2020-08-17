package IO;

/**
 * learning.IO
 * Created on 2020/8/1 16:57
 *
 * @author Protein
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * <p>
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流：BufferedInputStream，BufferedOutputStream
 * 字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 */

/**
 * 缓冲流，也叫高效流，是对4个基本的FileXxx流的增强，所以也是4个流，按照数据类型分类：
 *  字节缓冲流：BufferedInputStream，BufferedOutputStream
 *  字符缓冲流：BufferedReader，BufferedWriter
 * 缓冲流的基本原理是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写减少系统IO次数，提高读写的效率。
 * */

import java.io.*;

/**
 * 字节缓冲流：
 *  public BufferedInputStream(InputStream in)：创建一个新的缓冲输入流。
 *  public BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流。
 *  public BufferedReader(Reader in)：创建一个新的缓冲输入流。
 *      public String readLine()：读一行文字。
 *  public BufferedWriter(Writer out)：创建一个新的缓冲输出流。
 *      public void newLine()：写一行行分隔符，由系统属性定义符号。
 * */
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\IO\\test01.txt"));
        bos.write("Written by BufferedOutputStream".getBytes());
        bos.flush();
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\IO\\test02.txt"));
        int len;
        while ((len = bis.read()) != -1) {
            System.out.print((char) len);
        }
        bis.close();

        System.out.println("\n-------------------");
        FileOutputStream fos = new FileOutputStream("src\\IO\\copy02.jpg");
        BufferedOutputStream out = new BufferedOutputStream(fos);
        FileInputStream fis = new FileInputStream("src\\IO\\test.jpg");
        BufferedInputStream in = new BufferedInputStream(fis);
        int l;
        //传统方式
        long deltaTime = System.currentTimeMillis();
        while ((l = fis.read()) != -1) {
            fos.write(l);
        }
        //550
        deltaTime = System.currentTimeMillis() - deltaTime;
        System.out.println("Time: " + deltaTime);
        //缓冲流方式
        deltaTime = System.currentTimeMillis();
        while ((l = in.read()) != -1) {
            out.write(l);
        }
        //0
        deltaTime = System.currentTimeMillis() - deltaTime;
        System.out.println("Time: " + deltaTime);

        fis.close();
        fos.close();
        in.close();
        out.close();

        System.out.println("\n-------------------");
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\IO\\test03.txt"));
        bw.write(97);
        bw.newLine();
        String str = "hello world 你好，世界";
        bw.write(str, 0, 12);
        bw.write(str.toCharArray(), 12, 5);
        bw.newLine();
        char[] chars = "toPolaris".toCharArray();
        bw.write(chars);
        bw.flush();
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("src\\IO\\test03.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
