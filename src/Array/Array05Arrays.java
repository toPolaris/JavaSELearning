package Array;

import java.util.Arrays;
import java.util.Random;

/*
 * java.util.Arrays是一个与数组相关的工具类，里面提供大量静态方法，用来实现数组常见操作
 *   public static String toString(Array)：将参数数组转换为默认格式字符串并返回（[element1,element2,...]）
 *   public static void sort(Array)：将参数数组升序排列
 *       注：1.如果是数值，sort默认升序排列
 *           2.如果是字符串，则按字符字母升序（先使用toCharArray变成数组）
 *           3.如果是自定义类型，则必须有Comparable或Comparator接口支持
 * */

public class Array05Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100);
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "  ");
        }
        String str = "HelloWorldHelloJava";
        char[] array2 = str.toCharArray();
        Arrays.sort(array2);
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + "  ");
        }
    }
}
