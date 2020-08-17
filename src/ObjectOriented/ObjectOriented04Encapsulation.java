package ObjectOriented;

/*
 * 面向对象的特征：封装、继承、多态
 * 封装性在Java中的体现：
 *   1.方法是一种封装
 *   2.关键字private是一种封装
 *
 * */
public class ObjectOriented04Encapsulation {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "Susan";
        per.setAge(18);
    }
}
