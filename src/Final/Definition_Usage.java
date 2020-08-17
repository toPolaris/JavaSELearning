package Final;

/*
 * final代表不可改变的
 * 常见用法：
 * 1.修饰类
 *   格式：public final class ClassName {
 *           //...
 *       }
 *   含义：这个类不能有任何的子类，其中所有的方法无法被覆盖重写（无子类）
 * 2.修饰方法
 *   格式：修饰符 final 返回值类型 方法名称（参数列表）{
 *           //...
 *       }
 *   含义：当final修饰方法时，这个方法就是最终方法，不能被覆盖重写
 * 注：对于类、方法来说，abstract和final关键字不能同时使用，矛盾
 * 3.修饰局部变量
 *   一旦使用final修饰局部变量，那么这个变量值不可发生改变(可以分步赋值)
 *   不可变指：基本类型变量数据不可改变，引用类型变量地址值不可改变
 * 4.修饰成员变量
 *   注： a.成员变量具有默认值，所以用了final后必须进行手动赋值，不会再给出默认值
 *       b.对于final成员变量要么直接赋值要么构造方法赋值，二者选其一
 *       c.如果使用构造方法赋值，必须保证类当中所有重载的构造方法都最终会对成员变量进行赋值
 * */
public class Definition_Usage {
    public static void main(String[] args) {
        final int NUM = 10;
        final int NUM_;
        NUM_ = 20;
    }
}
