package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.DataFormat
 * public String format(Date date)：将Date对象格式化为字符串。
 * public Date parse(String source)：将字符串解析为Date对象。
 * DateFormat是一个抽象类，无法直接创建对象使用，可以使用其子类：java.text.SimpleDateFormat extends DateFormat
 *   public SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
 *   模式：y-年 M-月 d-日 H-时 m-分 s-秒
 *       yyyy-MM-dd HH:mm:ss
 *   注：模式区分大小写，连接模式的符号可改
 * */
public class DataFormatClass {
    public static void main(String[] args) throws ParseException {
        //将日期格式化为文本
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//创建对象
        Date date = new Date();
        String str = sdf.format(date);//调用format方法
        System.out.println(date);
        System.out.println(str);

        //将文本解析为日期
        SimpleDateFormat sdf_ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//创建对象
        //注意此时如果直接调用parse会出现ParseException异常，此时throws或者try...catch处理这个异常
        //使用alt+enter随便选取一个处理方法即可
        Date date_ = sdf_.parse("2333-12-23 23:33:33");
        System.out.println(date_);
    }
}
