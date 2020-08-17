package System_StringBuilder;

/*
 * public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 *   参数：src-源数组
 *        srcPos-源数组索引起始位置
 *        dest-目标数组
 *        destPos-目标数组索引起始位置
 *        length-复制元素个数
 * */

import java.util.Arrays;

public class SystemClass {
    public static void main(String[] args) {
        //public static long currentTimeMillis()常用来评估程序执行效率，可以在程序执行前后分别获取一次毫秒值
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Time Usage: " + (t2 - t1) + "ms");

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = {1, 2, 3, 4, 5};
        System.out.println("before: " + Arrays.toString(destination));//[1, 2, 3, 4, 5]
        System.arraycopy(source, 0, destination, 2, 3);
        System.out.println("after: " + Arrays.toString(destination));//[1, 2, 1, 2, 3]
    }
}
