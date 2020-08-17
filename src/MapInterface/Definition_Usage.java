package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Collection接口定义了单列集合规范，每次储存一个元素
 * Map（java.util.Map）接口定义了双列集合规范，每次储存一对元素，称为键值对（Key-Value），Map中的键值对不能有相同的Key，可以有相同的Value
 * 常用子类：
 *   HashMap<K,V>：使用哈希表存储数据，存取顺序不一定一致，需要重写hashCode和equals方法保证Key不重复。
 *   LinkedHashMap<K,V>：HashMap下的子类，使用哈希表和链表结构储存数据，链表可以保证元素存取顺序一致
 * Map接口中的常用方法：
 *   public V put(K key, V value)：添加键值对Key-Value，如果存在Key则更新值Value，并返回被替换的旧值，不存在则储存键值对并返回null
 *   public V remove(Object key)：移除键值对，返回被删除元素的值Value，不存在则返回null
 *   public V get(Object key)：查找键Key获取对应的值Value，不存在则返回null
 *   boolean containsKey(Object key)：判断是否有键Key
 *   public Set<K> keySet()：获取Map集合中所有的键并存储到Set集合中
 *   public Set<Map.Entry<K,V>> entrySet()：获取到Map集合中所有的键值对对象的集合（Set）
 * */
public class Definition_Usage {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println(hashMap.put("Susan", 18));//首次存储key返回null
        hashMap.put("Jack", 19);
        System.out.println(hashMap);//{Susan=18, Jack=19}
        System.out.println(hashMap.put("Jack", 20));//19
        System.out.println(hashMap);//{Susan=18, Jack=20}

        System.out.println(hashMap.remove("Jack"));//20
        System.out.println(hashMap.remove("Tom"));//null
        System.out.println(hashMap);//{Susan=18}

        //值得注意的是，此处可以用int接受Susan的Value，即自动拆箱
        //这样做有风险，如果查找的Key（如此处的Rose）不存在，依然使用int接受会产生空指针异常
        //所以最好使用包装类而不是基本数据类型
        Integer Susan_v = hashMap.get("Susan");
        System.out.println(Susan_v);//18
        System.out.println(hashMap.get("Rose"));//null

        /*
         * 接下来展示两种Map集合遍历方式
         * 一是借助keyset方法，二是借助entryset方法
         * */
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Susan", 20);
        myHashMap.put("Tom", 19);
        myHashMap.put("Jack", 18);
        myHashMap.put("Rose", 19);

        //第一种方法
        Set<String> keySet = myHashMap.keySet();//获取键集
        for (String name : keySet) {//根据Key找到Value并输出
            System.out.println(name + "-->" + myHashMap.get(name));
            //Tom-->19 Susan-->20 Rose-->19 Jack-->18
            //从这可以看出存取顺序不一致
        }

        //第二种方法
        //public K getKey()：获取Entry对象中的键；public V getValue()：获取Entry对象中的值。
        Set<Map.Entry<String, Integer>> entrySet = myHashMap.entrySet();//获取所有Entry对象的集合
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {//遍历每个Entry对象
            System.out.println(stringIntegerEntry.getKey() + "-->" + stringIntegerEntry.getValue());
            //Tom-->19 Susan-->20 Rose-->19 Jack-->18
        }

        //HashMap也可以存储自定义类
        //当给HashMap中存放自定义对象时，自定义对象作为key存在时，必须重写对象的hashCode和equals方法保证唯一性
        Map<Person, Integer> personIntegerMap = new LinkedHashMap<>();//使用LinkedHashMap可以使存取顺序一致
        personIntegerMap.put(new Person("Susan", 19), 1);
        personIntegerMap.put(new Person("Tom", 17), 2);
        personIntegerMap.put(new Person("Jack", 20), 3);

        Set<Person> myKeySet = personIntegerMap.keySet();
        for (Person person : myKeySet) {
            System.out.println(person + "-->" + personIntegerMap.get(person));
            //有序：Person{name='Susan', age=19}-->1 Person{name='Tom', age=17}-->2 Person{name='Jack', age=20}-->3
        }
    }
}
