package CollectionClass;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java.util.Collection接口，所有单列集合的最顶层的接口，定义了所有单列集合共性的方法，任意的单列集合都可以使用Collection接口中的方法
 * 共性的方法：
 *   public boolean add(E e)：把给定的对象添加到当前集合中 。
 *   public void clear()：清空集合中所有的元素。
 *   public boolean remove(E e)：把给定的对象在当前集合中删除。
 *   public boolean contains(E e)：判断当前集合中是否包含给定的对象。
 *   public boolean isEmpty()：判断当前集合是否为空。
 *   public int size()：返回集合中元素的个数。
 *   public Object[] toArray()：把集合中的元素，存储到数组中。
 * */

public class Definition_Usage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Susan");
        collection.add("Tom");
        collection.add("Jack");

        System.out.println(collection.contains("Tom"));//true
        System.out.println(collection.remove("Silly"));//false
        System.out.println(collection.size());//3

        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//Susan Tom Jack
        }
        collection.clear();
        System.out.println(collection.isEmpty());//true
    }
}
