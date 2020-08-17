package ObjectOriented;

public class ObjectOriented02Parameter {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 18;
        stu.name = "Susan";
        printStu(stu);
    }

    //实际上传递的是地址，作为返回值也是返回地址
    public static void printStu(Student student) {
        System.out.println(student.age + "\n" + student.name);
    }
}
