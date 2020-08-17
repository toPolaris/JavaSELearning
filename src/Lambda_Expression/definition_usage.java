package Lambda_Expression;

import java.util.Arrays;

/**
 * learning.Lambda_Expression
 * Created by Protein on 2020/7/29 16:38
 * Description: what's the main idea of functional programming? how apply functional programming to code
 */
public class definition_usage {
    public static void main(String[] args) {
        /*
         * 受限于面向对象编程思想的限制，一行简单的代码编写起来却极为复杂
         * 因此JDK8引入了Lambda表达式这一新特性
         * Lambda表达式格式：（参数类型 参数名称） -> { 代码语句 }
         *   小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔
         * 注意：
         *   1. 使用Lambda必须具有接口，接口中只有一个抽象方法。
         *   2. 使用Lambda必须具有上下文推断。也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
         * 省略写法：
         *   1. 小括号内参数的类型可以省略；
         *   2. 如果小括号内有且仅有一个参数，则小括号可以省略；
         *   3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号（要省都省）。
         * */
        Runnable t = new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread");
            }
        };
        new Thread(t).start();

        //Lambda简略写法
        new Thread(() -> System.out.println("new thread by Lambda")).start();

        //案例：构建一个Person数组，使用Lambda表达式按年龄升序排列
        Person[] people = {
                new Person("Susan", 18),
                new Person("Jack", 23),
                new Person("Tom", 16),
                new Person("Rose", 17)
        };

        Arrays.sort(people, (Person a, Person b) -> a.getAge() - b.getAge());

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
