package System_StringBuilder;

/*
 * API中对String类的描述：字符串是常量，它们的值在创建后不能被更改。底层是被final修饰的数组，不能改变的常量
 * StringBuilder类（java.lang.StringBuilder）：字符串缓冲区可以提高字符串的操作效率（看成一个长度可以变化的字符串）
 *   底层也是一个数组，但是没有被final修饰，可以改变长度byte[] value = new byte [16]（默认长度为16）
 *   StringBuilder类在内存中始终是一个数组，占用空间少，效率高，容量超出会自动扩容
 * 构造方法：
 *   public StringBuilder()：构造一个空的StringBuilder容器。
 *   public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
 * 常用方法：
 *   public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 *   public String toString()：将当前StringBuilder对象转换为String对象。
 * String与StringBuilder可以相互转换，使用构造方法将String转换为StringBuilder，使用toString将StringBuilder转换为String
 * */
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder strB1 = new StringBuilder();
        StringBuilder strB2 = new StringBuilder("HelloWorld");//String -> StringBuilder
        System.out.println(strB1);
        System.out.println(strB2);

        //返回值就是对象本身，无需接受返回值
        strB1.append("abc");
        strB1.append(100);
        strB1.append(true);
        System.out.println(strB1);//abc100true
        //链式编程：方法的返回值是一个对象，可以使用对象继续调用方法
        strB2.append(1.1).append('人').append(false);
        System.out.println(strB2);//HelloWorld1.1人false

        String str = strB2.toString();//StringBuilder -> String
        System.out.println(str);//HelloWorld1.1人false
    }
}
