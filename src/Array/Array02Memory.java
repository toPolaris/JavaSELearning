package Array;

/*
 * 1.Stack（栈）：存放的是方法中的局部变量，存在作用域，方法的运行一定在栈中
 * 2.Heap（堆）：通过new产生的变量开辟的内存区
 *   默认值：int->0, double/float->0.0, char->'\u0000', boolean->false, 引用类型->null
 * 3.Method Area（方法区）：存储.class相关信息，包含方法的信息
 * 4.Native Method Stack（本地方法栈）：与操作系统相关
 * 5.pc Register（寄存器）：与CPU相关
 * */
public class Array02Memory {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);//[I@10f87f48
        array[0] = 10;
        System.out.println(array[0]);//10
        /*
         * Method Area：
         *   public static void main(String[] args)
         *   ...
         * Stack：
         *   main(String[] args)
         *       int[] array      -->   0x10f87f48   *  Heap：0x10f87f48
         *       System.out.println(array)           *  ⬆(打印array地址值)
         *       array[0] = 10  0 --> 10             *  修改Heap区array[0]的内容
         *       System.out.println(array[0])        *  打印Heap区array[0]的内容
         *   ...
         * Heap：
         *   new int[3](default：0)   Addr：0x10f87f48
         *       [0]     0 --> 10 (after changing)
         *       [1]     0
         *       [2]     0
         *   ...
         * */
        int[] array_copy = array;//赋值，array_copy与array有相同的地址，指向相同的数组
        System.out.println(array_copy);//0x10f87f48

        //System.out.println(array[3]);//数组索引越界

        /*
        空指针异常，没有new初始化
        且：如果只是int[] arr = null也是空指针异常
        int[] arr;
        System.out.println(arr[0]);
        */
    }
}
