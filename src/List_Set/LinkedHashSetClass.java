package List_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * java.util.LinkedHashSet是HashSet的一个子类，它是链表和哈希表组合的一个数据存储结构，可以记录元素存取顺序
 * */
public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//1 2 4 3
        }
    }
}
