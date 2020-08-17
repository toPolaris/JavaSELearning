package MapInterface;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * JDK9的新特性：List、Set、Map接口里边增加了一个静态的方法of，可以给集合一次性添加多个元素
 * 注：of方法只是Map、List、Set这三个接口的静态方法，其父类接口和子类实现并没有这类方法，比如HashSet，ArrayList等
 *    of方法的返回值是一个不能改变的集合，不能再添加元素
 *    Set和Map接口在调用of方法的时候不能有重复的元素
 * */
public class Addition_of_JDK9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        //list.add(5);//Exception:UnsupportedOperationException
        Set<Character> set = Set.of('a', 'b', 'c');
        //Set<Character> set_ = Set.of('a','b','c','a');//Exception:IllegalArgumentException
        Map<String, Integer> map = Map.of("Susan", 19, "Tom", 20, "Jack", 18);
        //map.remove("Susan");//Exception:UnsupportedOperationException
        System.out.println(list);//[1, 2, 3, 4]
        System.out.println(set);//[c, b, a]
        System.out.println(map);//{Jack=18, Tom=20, Susan=19}
    }
}
