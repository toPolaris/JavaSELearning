package List_Set;

import java.util.LinkedList;

/*
 * java.util.LinkedList集合数据存储的结构是链表结构。方便元素添加、删除的集合。
 * 常用方法：
 *   public void addFirst(E e)：将指定元素插入此列表的开头。
 *   public void addLast(E e)：将指定元素添加到此列表的结尾。
 *   public E getFirst()：返回此列表的第一个元素。
 *   public E getLast()：返回此列表的最后一个元素。
 *   public E removeFirst()：移除并返回此列表的第一个元素。
 *   public E removeLast()：移除并返回此列表的最后一个元素。
 *   public E pop()：从此列表所表示的堆栈处弹出一个元素。
 *   public void push(E e)：将元素推入此列表所表示的堆栈。
 *   public boolean isEmpty()：如果列表不包含元素，则返回true。
 * 开发时，LinkedList集合也可以作为堆栈，队列的结构使用。
 * */
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("1");
        linkedList.addFirst("2");
        linkedList.addFirst("3");
        System.out.println(linkedList);//[3, 2, 1]

        System.out.println(linkedList.getFirst());//3
        System.out.println(linkedList.getLast());//1

        System.out.println(linkedList.removeFirst());//3
        System.out.println(linkedList.removeLast());//1

        while (linkedList.isEmpty() == false) {
            System.out.println(linkedList.pop());//2
        }

        System.out.println(linkedList);//[]
    }
}
