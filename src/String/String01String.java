package String;

/*
 * API文档：String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
 *       程序中所有双引号字符串都是String类对象，不需要new。
 * String特点：
 *   1.字符串的内容永不可变
 *   2.字符串不可改变，所以字符串可以共享使用
 *   3.字符串效果相当于char数组，但底层原理是byte字节数组
 * 字符串的创建：
 *   1.public String()：创建一个空白字符串，不含任何内容
 *   2.public String(char [] array)：根据字符数组创建对应字符串
 *   3.public String(byte [] array)：根据字节数组创建对应字符串
 *   4.String str = "xxx"：直接创建
 * 字符串常量池：直接写上的双引号字符串常量池中，通过new产生的不在。
 * ==：对于基本类型，“==”是进行数值的比较；对于引用类型，“==”是进行地址值的比较
 * */
public class String01String {
    public static void main(String[] args) {
        //创建字符串
        String str1 = "";
        char[] array1 = {'A', 'B', 'C'};
        String str2 = new String(array1);
        byte[] array2 = {97, 98, 99};
        String str3 = new String(array2);
        String str4 = "aaa";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        //字符串比较
        String str5 = "abc";
        String str6 = "abc";
        char[] array3 = {'a', 'b', 'c'};
        String str7 = new String(array3);
        System.out.println(str5 == str6);//true
        System.out.println(str5 == str7);//false
        System.out.println(str6 == str7);//false
        /*
         * Stack:
         *   String str5 --> addr1
         *   String str6 --> addr1
         *   char[] array3 --> addr2
         *   String str7 --> addr3(char[] array3 --> byte[])
         * Heap:
         *   String constant pool:
         *       (String object inside)
         *       addr1: "abc" --> byte[] {97, 98, 99}
         *   addr2: char[] array3 {'a', 'b', 'c'}
         *   addr3: (String object, not in pool) String str7 --> byte[] {97, 98, 99}(convert from char[] array3)
         * */
    }
}
