package Array;

public class Array04Parameter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array_ = pcArray(array);
        System.out.println("address:" + array_);
    }

    //任何数据类型都能作为方法的参数和返回值
    //方法的参数为基本类型时，传递的是数据值；方法的参数为引用类型时，传递的是地址值。
    //数组作为参数和返回值时，传递和返回的实际上是地址
    public static int[] pcArray(int[] arr) {
        int[] arr_ = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr_[i] = arr[i] + 1;
        }
        return arr_;
    }
}
