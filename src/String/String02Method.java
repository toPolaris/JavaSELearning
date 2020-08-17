package String;

/*
 * 1.字符串比较
 *   “==”是进行地址值比较，如果需要进行字符串比较，可以使用两个方法：
 *   public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串且内容相同才返回true
 *       注： a).任何对象都能使用equals方法；
 *           b).equals具有对称性，a.equals(b)与b.equals(a)等效
 *           c).如果比较双方一个常量一个变量，推荐将常量写在前面（"constant".equals(str)），否则可能出现空指针异常，
 *   public boolean equalsIgnoreCase(String str)：忽略大小写进行字符串比较
 * 2.字符串中获取相关方法
 *   public int length()：获取字符串长度
 *   public String concat(String str)：将当前字符串与参数字符串str拼接，返回拼接后的字符串
 *   public char charAt(int index)：返回索引处的单个字符
 *   public int indexOf(String str)：返回参数字符串在当前字符串中首次出现的索引位置，没有则返回-1
 * 3.字符串截取方法：
 *   public String substring(int index)：截取从index开始到结束的字符串
 *   public String substring(int begin, int end)：截取[begin,end)的字符串，左闭右开
 * 4.字符串转换方法：
 *   public char[] toCharArray()：将字符串拆分为字符数组并返回
 *   public byte[] getBytes()：获取字符串对应的底层字节数组
 *   public String replace(CharSequence oldString, CharSequence newString)：将字符串中的老字符串替换为新字符串并返回
 *       CharSequence表示可以接受字符串类型
 * 5.字符串分割
 *   public String[] split(String regex)：按参数的规则将字符串分割成若干部分
 *       参数其实是正则表达式，如果是按"."分割，则参数为"\\."。
 * */
public class String02Method {
    public static void main(String[] args) {
        String str1 = "abc";
        char[] array1 = {'a', 'b', 'c'};
        String str2 = new String(array1);
        String str3 = "ABC";
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        String str4 = str1.concat(str3);//str1,str2均未发生改变
        System.out.println(str4);//abcABC
        System.out.println(str4.length());//6
        System.out.println(str4.charAt(2));//c
        System.out.println(str4.indexOf(str3));//3
        String str5 = str4.substring(3);
        String str6 = str4.substring(2, 5);
        System.out.println(str5);//ABC
        System.out.println(str6);//cAB
        char[] array2 = str4.toCharArray();
        byte[] array3 = str4.getBytes();
        for (int i = 0; i < array2.length; i++) {
            //a b c A B C
            //97 98 99 65 66 67
            System.out.println(i + ": " + array2[i] + " - " + array3[i]);
        }
        str4 = str4.concat(str4);
        str4 = str4.replace(str1, str3);
        System.out.println(str4);//ABCABCABCABC
        String[] array4 = str4.split("C");
        for (int i = 0; i < array4.length; i++) {
            //AB AB AB AB
            System.out.println(array4[i]);
        }
    }
}
