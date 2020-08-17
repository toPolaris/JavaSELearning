package Generic;

/*
 * 含有泛型的接口的第二种使用方式：创建一个与接口相同泛型的含泛型类，创建对象时指定泛型的具体类型
 * */
public class Impl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println("Second Way: " + i);
    }
}
