package Inheritance;

/* 父类 <-- 子类
 * ·继承主要解决的问题是共性抽取
 * ·继承关系的特点：
 *   1.子类（派生类）可以拥有父类（基类、超类）的“内容”
 *   2.子类还可以拥有自己专有的新内容
 * ·在继承的关系中，“子类就是一个父类”，即子类可以被当成父类看待
 * ·定义格式：
 *   public class parent{
 *       ...//父类
 *   }
 *   public class child extends parent{
 *       ...//子类
 *   }
 * ·如果父类、子类的继承关系中，如果成员变量重名，则有两种方式访问：
 *  --直接通过子类对象访问成员变量：等号左边是谁，则优先找谁，否则向上查找
 *  --间接通过成员方法访问成员变量：方法属于哪个类，则优先查找该类
 * ·区别子类方法中三种变量重名问题：
 *  --局部变量：直接写成员变量名
 *  --本类成员变量：this.成员变量名
 *  --父类成员变量：super.成员变量名
 * */
public class Class01Definition {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher();
        teacher.method();//继承了父类-员工类的method方法
        Assistant assistant = new Assistant();
        assistant.method();//继承了父类-员工类的method方法

        //teacher由Teacher teacher = new Teacher()创建，等号左边是Teacher类，优先访问
        System.out.println(teacher.str);
    }
}
