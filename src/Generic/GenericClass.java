package Generic;

/*
 * 不确定参数类型时，使用泛型定义，泛型没有继承概念
 * */
public class GenericClass<E> {
    private E var;

    //定义一个含有泛型的静态方法
    public static <S> void method02(S s) {
        System.out.println("Static Method: " + s);
    }

    public E getVar() {
        return var;
    }

    public void setVar(E var) {
        this.var = var;
    }

    /*
     * 定义含有泛型的方法
     *    修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
     *       //...
     *    }
     * 在调用方法时确认泛型类型
     * */
    //定义一个含有泛型的方法
    public <M> void method01(M m) {
        System.out.println("Normal Method: " + m);
    }
}
