package List_Set;

import java.util.ArrayList;
import java.util.List;

/*
 * java.util.List接口继承自Collection接口，所有元素以线性方式储存，元素有序
 * 特点：存取有序、带索引、可重复
 * 常用方法：
 *   public void add(int index, E element)：将指定的元素，添加到该集合中的指定位置上。
 *   public E get(int index)：返回集合中指定位置的元素。
 *   public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素。
 *   public E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值的更新前的元素。
 * */
public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Susan");
        list.add("Jack");
        System.out.println(list);//[Tom, Susan, Jack]

        list.add(1, "John");
        System.out.println(list);//[Tom, John, Susan, Jack]

        System.out.println("remove: " + list.remove(0));//remove: Tom
        System.out.println(list);//[John, Susan, Jack]

        list.set(0, "Rose");
        System.out.println(list);//[Rose, Susan, Jack]

        for (String s : list) {
            System.out.println(s);//Rose Susan Jack
        }
    }
}
