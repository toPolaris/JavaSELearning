package CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * java.utils.Collections是集合工具类，用来对集合进行操作
 *   public static <T> boolean addAll(Collection<T> c, T... elements)：往集合中添加一些元素。
 *   public static void shuffle(List<?> list)：打乱集合顺序。
 *   public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序。
 *   public static <T> void sort(List<T> list, Comparator<? super T> )：将集合中元素按照指定规则排序。
 * */
public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3, 5, 4);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        /*
         * Java中提供了两种比较实现方法，使用java.lang.Comparable接口实现或在需要做排序的时候选择的java.util.Comparator接口完成
         * public int compare(String o1, String o2)：比较其两个参数的顺序。
         * */
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, "abc", "bca", "cab");
        System.out.println(stringArrayList);//[abc, bca, cab]

        Collections.sort(stringArrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);//重写方法，按首字符倒序
            }
        });
        System.out.println(stringArrayList);//[cab, bca, abc]

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Susan", 20));
        personArrayList.add(new Person("Tom", 19));
        personArrayList.add(new Person("Jack", 22));
        personArrayList.add(new Person("John", 18));
        System.out.println(personArrayList);
        //[{name: 'Susan', age: 20}, {name: 'Tom', age: 19}, {name: 'Jack', age: 22}, {name: 'John', age: 18}]

        Collections.sort(personArrayList);
        System.out.println(personArrayList);
        //[{name: 'John', age: 18}, {name: 'Tom', age: 19}, {name: 'Susan', age: 20}, {name: 'Jack', age: 22}]

        personArrayList.add(new Person("Rose", 19));
        System.out.println(personArrayList);
        //[{name: 'John', age: 18}, {name: 'Tom', age: 19}, {name: 'Susan', age: 20}, {name: 'Jack', age: 22}, {name:
        // 'Rose', age: 19}]

        //可以添加更多的规则
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int difference = o1.getAge() - o2.getAge();//年龄升序
                if (difference == 0) {
                    difference = o1.getName().charAt(0) - o2.getName().charAt(0);//姓名首字母升序
                }
                return difference;
            }
        });
        System.out.println(personArrayList);
        //[{name: 'John', age: 18}, {name: 'Rose', age: 19}, {name: 'Tom', age: 19}, {name: 'Susan', age: 20}, {name:
        // 'Jack', age: 22}]
    }
}
