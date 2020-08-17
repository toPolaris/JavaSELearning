package Math;

/*
 * java.util.Math类是数学相关的工具类，提供大量数学运算操作有关的静态方法
 *   public static double abs(double num)：取绝对值
 *   public static double ceil(double num)：向上取整
 *   public static double floor(double num)：向下取整
 *   public static long round(double num)：四舍五入
 * */

public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.round(3.14));
    }
}
