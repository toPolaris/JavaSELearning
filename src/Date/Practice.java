package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 练习：计算一个人出生多少天
 * */
public class Practice {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();//输入出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);//解析出生日期
        long time = date.getTime();//计算出生日期的毫秒数
        long current = new Date().getTime();//得到当前时间的毫秒数
        long days = (current - time) / (1000 * 60 * 60 * 24);//计算差值并转换为天数
        System.out.println(days);
    }
}
