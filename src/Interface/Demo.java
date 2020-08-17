package Interface;

public interface Demo {
    //常量
    int NUM_CONST = 666;

    //静态方法
    static void StaticMethod() {
        PrivateMethod_();
        System.out.println("Static Method!");
    }

    static void StaticMethod_() {
        PrivateMethod_();
        System.out.println("Static Method_!");
    }

    private static void PrivateMethod_() {
        System.out.print("Learning: ");
    }

    //四种不同的定义方法
    void Method01();

    void Method02();

    void Method03();

    void Method04();

    //新添加方法
    default void DefaultMethod() {
        PrivateMethod();
        System.out.println("Default Method!");
    }

    default void DefaultMethod_() {
        PrivateMethod();
        System.out.println("Default Method_!");
    }

    //私有方法
    private void PrivateMethod() {
        System.out.print("Learning: ");
    }
}
