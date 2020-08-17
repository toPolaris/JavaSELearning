package Iterator_foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/*
 * java.util.Iterator接口：迭代器(对集合进行遍历)
 * 常用方法：
 *   boolean hasNext()：如果仍有元素可以迭代，则返回true。
 *   E next()：返回迭代的下一个元素。
 * 使用步骤：
 *   1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
 *   2.使用hasNext判断是否存在下一个元素
 *   3.使用next取出集合中的下一个元素
 * */
public class Definition_Usage {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            collection.add(random.nextInt(100));
        }

        //使用迭代器遍历
        Iterator<Integer> iterator = collection.iterator();//得到实现类对象
        while (iterator.hasNext()) {//判断是否存在下一个元素
            System.out.println(iterator.next());//取出下一个元素
        }
    }
}
