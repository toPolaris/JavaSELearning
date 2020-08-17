package Static;

/*
 * 注意：
 *   1.静态不能直接访问非静态
 *       内存中先有静态内容，后有非静态内容
 *   2.静态方法中不能用this
 *       this代表当前对象，静态与对象无关
 * */

public class Static01StaticField {
    public static void main(String[] args) {
        Student s1 = new Student("Susan", 18);
        Student.classroom = "101";
        Student s2 = new Student("Tom", 19);
        Student s3 = new Student("Jack", 20);
        System.out.println("Name: " + s1.getName() + "  age: " + s1.getAge() + "  ID: " + s1.getId() + "  Classroom: "
                + Student.classroom);
        Student.classroom = "102";
        System.out.println("Name: " + s2.getName() + "  age: " + s2.getAge() + "  ID: " + s2.getId() + "  Classroom: "
                + Student.classroom);
        System.out.println("Name: " + s3.getName() + "  age: " + s3.getAge() + "  ID: " + s3.getId() + "  Classroom: "
                + Student.classroom);
        //普通方法必须通过对象调用，静态方法可以使用类调用也可以使用对象调用，且最好使用类调用，静态变量同理
        //对于本类中的静态方法，则也可以直接调用，而不需要ClassName.StaticMethod()
        s1.normalMethod();
        Student.staticMethod();
        Student.staticMethod();
    }
}
