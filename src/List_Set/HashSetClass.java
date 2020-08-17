package List_Set;

import java.util.HashSet;

/*
 * java.util.HashSet是Set接口的一个实现类，元素是无序(即存取顺序不一致)、不可重复。
 * java.util.HashSet底层的实现其实是一个java.util.HashMap支持。
 * HashSet是根据对象的哈希值来确定元素在集合中的存储位置，具有良好的存取和查找性能。
 * 保证元素唯一性的方式依赖于：hashCode与equals方法。
 * HashSet中存放自定义类型元素时，需要重写对象中的hashCode和equals方法，建立自己的比较方式，才能保证唯一性。
 * */
public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("abc");
        hashSet.add("bca");
        hashSet.add("cab");
        hashSet.add("abc");

        System.out.println(hashSet);//[bca, abc, cab]

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(new Person("Susan", 19));
        personHashSet.add(new Person("Tom", 18));
        personHashSet.add(new Person("Jack", 20));
        personHashSet.add(new Person("Susan", 19));

        System.out.println(personHashSet);//[Person{name='Tom', age=18}, Person{name='Jack', age=20}, 
        // Person{name='Susan', age=19}]
    }
}
