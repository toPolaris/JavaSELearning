package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericMain {
    public static void main(String[] args) {
        //含有泛型的类
        GenericClass<String> gc = new GenericClass<>();//创建对象时指定参数类型，不写则默认为Object
        gc.setVar("Susan");

        //含有泛型的方法
        gc.method01(gc.getVar());//传递是什么类型，方法泛型就是什么类型
        GenericClass.method02(gc.getVar());//静态方法最好直接调用，不建议创建对象使用

        //含有泛型的接口
        Impl1 impl1 = new Impl1();
        impl1.method("Interface with Generic");
        Impl2<String> impl2 = new Impl2<>();
        impl2.method("Interface with Generic");

        /*
         * 泛型的通配符--“？”，表示任意的数据类型，作为方法的参数使用
         * 泛型没有继承概念
         * Java不能创建泛型数组
         * 泛型的上限限定: ? extends E  代表使用的泛型只能是E类型的子类/本身
         * 泛型的下限限定: ? super E    代表使用的泛型只能是E类型的父类/本身
         * */
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Susan");
        arr2.add("Tom");
        arr2.add("Jack");
        //ArrayList<?> arr3 = new ArrayList<?>();错误用法
        printArrayList(arr1);
        printArrayList(arr2);

        //泛型的限定用法
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        //getElement1(list2);//报错
        getElement1(list3);
        //getElement1(list4);//报错

        //getElement2(list1);//报错
        //getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
    }

    //使用通配符定义一个遍历所有类型的ArrayList集合
    public static void printArrayList(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();//使用Object类型接受任意数据类型的元素
            System.out.println(object);
        }
    }

    // 泛型的上限：此时的泛型?必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll) {

    }

    // 泛型的下限：此时的泛型?必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll) {

    }
}
