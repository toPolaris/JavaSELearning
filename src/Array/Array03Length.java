package Array;

public class Array03Length {
    public static void main(String[] args) {
        //使用array.length即可获得数组长度
        // 一旦数组被new初始化，数组长度不可改变，但是能指向另一个new初始化的数组
        int[] array = new int[3];
        System.out.println(array);//10f87f48
        System.out.println(array.length);//3
        array = new int[5];
        System.out.println(array);//b4c966a
        System.out.println(array.length);//5
        /*
         * Stack:
         *   main:
         *       array --> 10f87f48
         *         (new int[5]) ⬇
         *       array --> b4c966a
         * Heap:
         *   new int[3](default：0)   Addr：0x10f87f48
         *       [0]     0
         *       [1]     0
         *       [2]     0
         *
         *   new int[3](default：0)   Addr：0xb4c966a
         *       [0]     0
         *       [1]     0
         *       [2]     0
         *       [3]     0
         *       [4]     0
         *
         * */
    }
}
