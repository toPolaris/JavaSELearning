package API;

import java.util.Scanner;

/*
 * 标准创建：ClassName ObjectName = new ClassName()
 * 匿名对象只有右边new ClassName()部分，没有赋值符号及左边的部分
 * 注：匿名对象只能使用唯一一次，下次使用再用还需再创建；当确定只有一个对象时，可以使用匿名对象
 * */
public class API02Anonymous {
    public static void main(String[] args) {
        //创建匿名对象
        new Person().setName("susan");
        new Person().setAge(18);

        //使用匿名对象获取键盘输入
        int num = new Scanner(System.in).nextInt();
        System.out.println(num);

        //使用匿名对象传参
        methodParam(new Scanner(System.in));

        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        int num_ = sc.nextInt();
        System.out.println(num_);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
