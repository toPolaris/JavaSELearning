package ObjectOriented;

public class Student {
    //成员变量，直接定义在类当中，在方法外面
    //成员方法，不需要写static关键字
    String name;
    int age;

    public void study() {
        System.out.println("Learning!");
    }

    public void sleep() {
        System.out.println("Sleeping!");
    }
}
