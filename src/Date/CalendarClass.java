package Date;

import java.util.Calendar;
import java.util.Date;

/*
 * java.util.Calendar是日历类，在Date后出现，替换掉了许多Date的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的。
 * Calendar为抽象类，在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象
 *   public static Calendar getInstance()：使用默认时区和语言环境获得一个日历
 * 根据Calendar类的API文档，常用方法有：
 *   public int get(int field)：返回给定日历字段的值。
 *   public void set(int field, int value)：将给定的日历字段设置为给定值。
 *   public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 *   public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 *   成员方法参数：
 *       int field：Calendar类的字段，可以使用Calendar类的静态成员变量获取
 *           public static final int YEAR = 1;年
 *           public static final int MONTH = 2;月
 *           public static final int DATE = 5;月中的某一天
 *           public static final int DAY_OF_MONTH = 5;月中的某一天
 *           public static final int HOUR = 10;时
 *           public static final int MINUTE = 12;分
 *           public static final int SECOND = 13;秒
 * */
public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);//2020
        System.out.println(calendar.get(1));//2020，返回年份
        System.out.println(calendar.get(Calendar.MONTH));//6（实际为7月份），返回月份，系统返回0~11月对应实际生活中的1~12月，field可直接使用“对象.参数”
        System.out.println(calendar.get(5));//16，返回天数

        calendar.set(Calendar.YEAR, 9999);//设定为9999年
        System.out.println(calendar.get(1));//9999
        calendar.set(Calendar.MONTH, 9);//设定为10（9+1）月份
        System.out.println(calendar.get(2));
        calendar.set(2020, 6, 16);//恢复，可以使用三个参数同时设置
        System.out.println(calendar);

        calendar.add(Calendar.YEAR, 2);//加2年
        System.out.println(calendar.get(1));//2022
        calendar.add(Calendar.MONTH, -2);//减2月
        System.out.println(calendar.get(2));//4

        Date date = calendar.getTime();//返回Date对象
        System.out.println(date);//Mon May 16 17:00:45 CST 2022
    }
}
