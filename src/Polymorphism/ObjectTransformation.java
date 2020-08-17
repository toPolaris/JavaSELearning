package Polymorphism;

/*
 * 对象的转型
 * 对象的向上转型（就是多态写法）
 *   格式：父类名称 对象名 = new 子类名称（）；
 *   含义：右侧创建一个子类对象，将其视为父类来看待使用
 *   注：向上转型一定是安全的，从小范围转向大范围，一旦向上转型为父类，那么无法使用子类特有方法
 * 对象的向下转型（其实是还原动作）
 *   格式：子类名称 对象名 = （子类名称） 父类对象
 *   含义：将父类对象“还原”成原来的子类对象
 *   注：1.必须保证对象本来创建的时候就是该子类，才能向下转型为该子类
 *       2.如果对象本来不是某子类而是另一子类，却被强行转换成该子类，那么会运行出错（java.lang.ClassCastException）
 * instanceof：
 *   格式：对象 instanceof 类名称，使用后得到Boolean值，判断能否转型
 *
 *
 * */
public class ObjectTransformation {
    public static void main(String[] args) {
        Father obj = new Child();
        obj.Method();
        if (obj instanceof Child) {
            Child obj_ = (Child) obj;
            obj_.MethodChild();
        }
        obj.Method();
    }

}
