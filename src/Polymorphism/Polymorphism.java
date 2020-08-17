package Polymorphism;

/*
 * extends继承或implements实现是多态性的前提，代码中体现多态性其实就是父类引用指向子类对象
 * 格式：父类名称 对象名 = new 子类名称（）；
 *   或 接口名称 对象名 = new 实现类名称（）
 * 访问特点：
 *   成员变量的访问特点：编译看左边，运行仍然看左边
 *       1.直接通过对象名称访问：等号左边是谁则优先用谁
 *       2.间接通过成员方法访问：该方法属于谁优先使用谁
 *   成员方法的访问特点：new的是谁则优先使用谁，编译看左边，运行看右边
 * 多态优点：无论右边new的是谁，等号左边调用方法都不会发生改变
 * */
public class Polymorphism {
    public static void main(String[] args) {
        //多态的写法，左侧父类的引用指向右侧子类的对象
        Father obj = new Child();
        obj.Method();//“new的是谁，运行谁”
        System.out.println(obj.str);
    }
}
