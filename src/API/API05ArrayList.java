package API;

import java.util.ArrayList;
import java.util.Random;

/*
 * 数组的长度不可更改，ArrayList集合的长度可以随意更改
 * */
public class API05ArrayList {
    public static void main(String[] args) {
        /*
         * ArrayList<E>，<E>表示泛型，从JDK1.7开始，右侧<>可以不写内容，E不能是基本数据类型
         * */
        ArrayList<String> strList = new ArrayList<>();//ArrayList<String> strlist = new ArrayList<String>()
        System.out.println(strList);//[]
        strList.add("Susan");
        System.out.println(strList);//[susan]
        strList.add("Tom");//[Susan,Tom]
        /*
         * 常用方法：
         *   public E add(E e)：向集合中添加与泛型一致的元素
         *   public E get(int index)：从集合中获取索引index的元素，返回值是元素
         *   public E remove(int index)：从集合中删除索引index的元素，返回值是元素
         *   public int size()：获取集合的长度，返回值为长度
         * */
        System.out.println(strList.add("Jack"));//true
        System.out.println(strList);//[Susan, Tom, Jack]
        System.out.println(strList.size());//3
        //遍历
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println(strList.remove(0));//Susan
        System.out.println(strList.get(0));//Tom

        /*
         * 如果希望向集合存储基本数据类型，则使用包装类（位于java.lang下）
         * 基本类型   包装类
         * byte      Byte
         * short     Short
         * int       Integer
         * long      Long
         * float     Float
         * double    Double
         * char      Character
         * boolean   Boolean
         * 从JDK1.5开始，支持自动拆装箱：
         *   自动装箱：基本类型->包装类型
         *   自动拆箱：包装类型->基本类型
         * */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        int num = list.get(1);
        System.out.println(num);
        list.clear();
        System.out.println("--------------------------");
        
        //练习：
        //练习1：用集合储存产生在10-20的十个数字，并遍历输出
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(11) + 10);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------");

        //练习2：添加三个Person对象并遍历
        Person[] person = new Person[3];//创建一个对象数组
        person[0] = new Person("Susan", 18);
        person[1] = new Person("Tom", 19);
        person[2] = new Person("Jack", 17);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person[0]);
        personList.add(person[1]);
        personList.add(person[2]);
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName() + "   " + personList.get(i).getAge());
        }
        System.out.println("--------------------------");

        //练习3：使用{元素@元素@...}的方式输出练习1的集合
        printArrayList(list);
        System.out.println("--------------------------");

        //练习4：筛选练习1集合中的偶数元素，并返回
        ArrayList<Integer> list_;
        list_ = screenArrayList(list);
        System.out.println(list_);
        System.out.println("--------------------------");
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.println(list.get(i) + "}");
            }
        }
    }

    public static ArrayList<Integer> screenArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> list_ = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list_.add(list.get(i));
            }
        }
        return list_;
    }
}
