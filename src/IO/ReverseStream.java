package IO;

/**
 * learning.IO
 * Created on 2020/8/1 17:45
 *
 * @author Protein
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * InputStreamReader构造方法
 * InputStreamReader(InputStream in)：创建一个使用默认字符集的字符流。
 * InputStreamReader(InputStream in, String charsetName)：创建一个指定字符集的字符流。
 */
public class ReverseStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\IO\\test04.txt"));
        int l;
        //ʹ��GBK��ʽ����
        //encoding with GBK
        while ((l = isr.read()) != -1) {
            System.out.print((char) l);
        }
        isr.close();
        System.out.println("\n-------------------");
        isr = new InputStreamReader(new FileInputStream("src\\IO\\test04.txt"), "GBK");
        //使用GBK格式编码
        //encoding with GBK
        while ((l = isr.read()) != -1) {
            System.out.print((char) l);
        }
        isr.close();

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\IO\\test05.txt"), "GBK");
        osw.write("encoding with GBK");
        osw.write("你好，世界！");
        osw.flush();
        osw.close();
        reverse();
    }

    private static void reverse() throws IOException {
        String gbkTxt = "src\\IO\\On the Goddess of Luo River.txt";
        String utf8Txt = "src\\IO\\On the Goddess of Luo River reverse.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(gbkTxt), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(utf8Txt), StandardCharsets.UTF_8);
        char[] cbuf = new char[1024];
        int len;
        while ((len = isr.read(cbuf)) != -1) {
            osw.write(cbuf, 0, len);
        }
        isr.close();
        osw.close();
    }
}
