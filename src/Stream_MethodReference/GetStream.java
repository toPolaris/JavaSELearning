package Stream_MethodReference;

import java.util.*;
import java.util.stream.Stream;

/**
 * learning.Stream_MethodReference
 * Created on 2020/8/8 18:00
 *
 * @author Protein
 */
public class GetStream {
    public static void main(String[] args) {
        //所有Collection集合都可以通过 stream 默认方法获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream01 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream02 = set.stream();
        Vector<String> vector = new Vector<>();
        Stream<String> stream03 = vector.stream();

        //从Map中获取流
        Map<String, String> map = new HashMap<>();
        //获取Map中Key的流
        Stream<String> keyStream = map.keySet().stream();
        //获取Map中Value的流
        Stream<String> valueStream = map.values().stream();
        //获取Map中Entry的流
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

        //从数组中获取流
        String[] strings = new String[10];
        //of方法的参数其实是可变参数，所以支持数组。
        Stream<String> stringStream = Stream.of(strings);
    }
}
