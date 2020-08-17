package Array;

public class Array01 {
    public static void main(String[] args) {
        //Create an array
        int[] a = new int[5];//动态初始化
        String[] b = new String[]{"Hello", "World"};//静态初始化
        int[] c;
        c = new int[]{1, 2, 3};//静态初始化的拆分格式
        int[] d;
        d = new int[5];//动态初始化的拆分格式
        String[] e = {"Hello", "Java"};//静态初始化省略格式，不可拆分
        System.out.println(d);//[I@10f87f48直接打印数组名称显示内存地址的哈希值，‘[’表示是数组
        System.out.println(d[1]);//使用动态初始化默认值：int->0, double/float->0.0, char->'\u0000', boolean->false, 引用类型->null
        //静态初始化也有默认值的过程，不过立刻被替换成具体值
    }
}
