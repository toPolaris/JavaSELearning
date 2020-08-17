package Iterator_foreach;

import java.util.ArrayList;

/*
 * 增强for循环：底层使用迭代器，采用for循环格式简化Iterator的书写，JDK1.5后出现的新特性
 * 所有单列集合均可使用增强for循环
 * 使用格式：
 *   for(集合/数组的数据类型 变量名 : 集合名/数组名) {
 *       System.out.println(变量名);
 *   }
 * */
public class foreach {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Susan");
        arrayList.add("Tom");
        arrayList.add("Jack");
        arrayList.add("July");

        for (String string : arrayList) {
            System.out.println(string);
        }
    }
}
