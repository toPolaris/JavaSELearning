package Generic;

/*
 * 含有泛型的接口的第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 * */
public class Impl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println("First Way: " + s);
    }
}
