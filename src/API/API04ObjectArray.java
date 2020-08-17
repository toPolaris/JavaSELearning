package API;

/*
 * 数组一旦创建，程序运行期间长度不可发生改变
 * */
public class API04ObjectArray {
    public static void main(String[] args) {
        Person[] objectArray = new Person[3];//创建一个对象数组
        objectArray[0] = new Person("Susan", 18);
        objectArray[1] = new Person("Tom", 19);
        objectArray[2] = new Person("Jack", 17);
        System.out.println(objectArray[0]);
        System.out.println(objectArray[1]);
        System.out.println(objectArray[2]);
        System.out.println(objectArray[0].getName() + objectArray[0].getAge());
        System.out.println(objectArray[1].getName() + objectArray[1].getAge());
        System.out.println(objectArray[2].getName() + objectArray[2].getAge());

    }
}
