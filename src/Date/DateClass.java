package Date;

public class DateClass {
    /*
     * public Date()：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
     * public Date(long date)：分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。
     * public long getTime()：把日期对象转换成对应的时间毫秒值
     * */
    public static void main(String[] args) {
        //输出当前时间
        System.out.println(new java.util.Date());
        //将当前毫秒值转换为日期对象
        System.out.println(new java.util.Date(0L));
        //Date类对toString方法进行了覆盖重写，所以输出为指定格式的字符串

        java.util.Date date = new java.util.Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
