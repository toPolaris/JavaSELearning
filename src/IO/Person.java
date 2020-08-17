package IO;

import java.io.Serializable;

/**
 * learning.IO
 * Created on 2020/8/1 19:29
 *
 * @author Protein
 */
public class Person implements Serializable {
    /**
     * 当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，抛出InvalidClassException异常。
     * 发生这个异常的原因如下：
     * 该类的序列版本号与从流中读取的类描述符的版本号不匹配
     * 该类包含未知数据类型
     * 该类没有可访问的无参数构造方法
     * Serializable接口给需要序列化的类，提供了一个序列版本号————serialVersionUID，该版本号的目的在于验证序列化的对象和对应类是否版本匹配。
     */
    //可以手动设置
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    //transient是瞬态关键字，被修饰成员变量,不能被序列化
    private transient int index;

    public Person() {
    }

    public Person(String name, int age, int index) {
        this.name = name;
        this.age = age;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", index=" + index +
                '}';
    }
}
