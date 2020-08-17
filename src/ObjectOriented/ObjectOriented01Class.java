package ObjectOriented;

/*
 * 1.导包：import 包名称.类名称（同一个package下可省略）
 * 2.创建：类名称 对象名 = new 类名称()
 * 3.使用：使用成员变量-->对象名.成员变量名；使用成员方法-->对象名.成员方法名（参数）
 * */
public class ObjectOriented01Class {
    public static void main(String[] args) {
        Student stu = new Student();
        //使用默认值
        System.out.println("Name: " + stu.name + "  Age: " + stu.age);//Name: null  Age: 0
        stu.name = "Susan";
        stu.age = 18;
        System.out.println("Name: " + stu.name + "  Age: " + stu.age);//Name: Susan  Age: 18
        stu.sleep();//Sleeping!
        stu.study();//Learning!
    }
}
