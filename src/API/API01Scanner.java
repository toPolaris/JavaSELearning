package API;

import java.util.Scanner;

/*
 * Scanner类能实现从键盘输入数据
 * 引用类型的一般使用步骤：
 *   1.导包：import 包路径.包名（同一类下省略不写），只有java.lang包下的内容不需要导包，其他都需要import语句
 *   2.创建：ClassName ObjectName = new ClassName()
 *   3.使用：对象名.成员方法名()
 * */
public class API01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.in表示从键盘输入
        int num = sc.nextInt();//获取键盘输入的数字
        String str = sc.next();//从键盘获取输入的自字符串
        System.out.println(num + str);
    }
}
