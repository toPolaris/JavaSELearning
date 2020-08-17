package Static;

public class Static02Memory {
    public static void main(String[] args) {
        Student s1 = new Student("Susan", 18);
        Student.classroom = "101";
        //根据类名称访问静态变量时，全程与对象无关，只和类有关
        /*
         * Method Area:
         *   static area:
         *       classroom --> "101"
         *   Student.class {
         *       private String name;
         *       private int age;
         *       static String classroom;
         *   }
         * Stack:
         *   Student s1 --> addr1
         *   Student.classroom = "101"(static area: classroom --> "101")
         * Heap:
         *   addr1: new Student()
         *       name --> "Susan"
         *       age --> 18
         * */
    }
}
