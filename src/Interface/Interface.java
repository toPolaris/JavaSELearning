package Interface;

/*
 * 接口：多个类的公共规范，其是一种引用数据类型，最重要内容————抽象方法
 * 格式：
 *   public interface InterfaceName {
 *       //...
 *   }
 * 内容可以是：常量、抽象方法（Java 7）、默认方法、静态方法（Java 8）、私有方法（Java 9）
 *   任何版本的Java都能定义抽象方法，且接口中的抽象方法修饰符必须是public abstract（可以选择性忽略，省略一部分或都省略均可）
 * 接口使用步骤：
 *   1.接口不能直接使用，必须有一个“实现类”来实现接口（可以多个接口），格式如下：
 *       public class 实现类名称 implements 接口名称[,...] {
 *           //...
 *       }
 *   2.接口的实现类必须覆盖重写接口中所有的抽象方法（去掉abstract，加入方法体）
 *   3.创建实现类对象进行使用
 *   注：如果实现类并没有覆盖重写接口中的所有抽象类，那么这个实现类本身是抽象类
 * 默认方法（解决接口升级问题，可以被实现类继承）：
 *   格式：
 *       public default 返回值类型 方法名称（参数列表）{
 *           //...
 *       }
 *   默认方法可以通过接口实现类对象调用，而不能被接口直接调用，也可以被实现类覆盖重写（拥有新的方法体）
 * 静态方法：
 *   格式：
 *       public static 返回值类型 方法名称（参数列表）{
 *           //...
 *       }
 *   静态方法不能通过接口实现类对象直接调用，只能通过接口名称直接调用
 *
 * 私有方法：
 *   1.普通私有方法：解决多个默认方法之间重复代码问题
 *       格式：
 *           private 返回值类型 方法名称（参数列表）{
 *               ...//
 *           }
 *   2.静态私有方法：解决多个静态方法之间重复代码问题
 *       格式：
 *          private static 返回值类型 方法名称（参数列表）{
 *               ...//
 *           }
 * 常量：“成员变量”，必须使用public static final修饰，写法上可以省略，但修饰符仍是public static final
 *   格式：public static final DataType ConstName = ConstValue；
 *      一经赋值，不可改变，且必须进行赋值，命名时建议全大写使用"_"分割
 * 使用接口时注意：1.接口没有静态代码块和构造方法的
 *     2.一个类的直接父类是唯一的，但一个类却能实现多个接口
 *     3.如果实现类实现的多个接口中存在多个重复的抽象方法，只需要覆盖重写一次即可
 *     4.如果实现类没有覆盖重写所有接口中所有抽象方法，那么这个类必须是抽象类
 *     5.如果实现类实现的多个接口中存在多个重复的默认方法，那么实现类必须对冲突的默认方法必须进行覆盖重写
 *     6.如果实现类父类中的方法与接口的默认方法产生冲突，优先使用父类中的方法（特定情况下某些方法如冲突的默认方法不需要覆盖重写也不报错），继承优先于接口实现
 * 类和接口相关的几种关系：
 *     1.类与类之间是单继承的，直接父类只有一个
 *     2.类与接口之间是多实现的，一个类可以实现多个接口
 *     3.接口与接口之间是多继承的（public interface InterfaceName extends InterfaceName1[,...]）
 *      注：多个父接口中抽象方法重复无所谓，默认方法重复需要在子接口中进行覆盖重写（必须有default关键字）
 * */
public class Interface {
    public static void main(String[] args) {
        DemoImpl demo = new DemoImpl();
        demo.Method01();
        demo.Method02();
        demo.Method03();
        demo.Method04();

        demo.DefaultMethod();

        Demo.StaticMethod();


    }
}
