package Static;

/*
 * static修饰的成员变量和成员方法都是属于类的，而不是对象
 * */
public class Student {
    static String classroom;
    private static int idCount = 0;//学号计数器
    private int id;//学号
    private String name;
    private int age;

    public Student() {
        this.id = idCount++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public static void staticMethod() {
        System.out.println("Static Method!");
    }

    public void normalMethod() {
        System.out.println("Normal Method!");
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
