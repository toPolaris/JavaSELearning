package Stream_MethodReference;

import java.util.stream.Stream;

/**
 * learning.Stream_MethodReference
 * Created on 2020/8/8 18:23
 *
 * @author Protein
 */
public class StreamMethod {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        Stream<String> nameStream = Stream.of("Susan", "Tom", "Jack", "Rose");
        nameStream.filter(name -> name.length() > 3).forEach(name -> System.out.println(name));
        System.out.println("-----------------------");

        Stream<String> test = Stream.of("100", "300", "-100", "0");
        Stream<Integer> testMap = test.map(str -> Integer.parseInt(str));
        testMap.limit(2).forEach(integer -> System.out.println(integer));
        System.out.println("-----------------------");

        testMap = Stream.of("100", "300", "-100", "0").map(str -> Integer.parseInt(str));
        testMap.skip(2).forEach(integer -> System.out.println(integer));
        System.out.println("-----------------------");

        Stream<String> test01 = Stream.of("Hello ");
        Stream<String> test02 = Stream.of("World!");
        Stream<String> concatStream = Stream.concat(test01, test02);
        concatStream.forEach(e -> System.out.println(e));
        System.out.println("-----------------------");

        Stream<Integer> integerStream = Stream.of(10, 20, 30);
        System.out.println(integerStream.count());
        System.out.println("-----------------------");
    }
}
