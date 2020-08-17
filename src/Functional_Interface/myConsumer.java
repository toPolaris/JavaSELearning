package Functional_Interface;

import java.util.function.Consumer;

/**
 * learning.Functional_Interface
 * Created on 2020/8/8 16:54
 *
 * @author Protein
 */
public class myConsumer {
    private static void myPrint(Consumer<String> c1, Consumer<String> c2, String[] strings) {
        for (String string : strings) {
            c1.andThen(c2).accept(string);
        }
    }

    public static void main(String[] args) {
        String[] str = {"a", "bbb", "cc", "d", "eeee"};
        /*myPrint((s) -> {
                    System.out.print(s);
                },
                (s) -> {
                    System.out.println(s.length());
                },
                str);*/
        //简化
        myPrint(s -> System.out.print(s),
                s -> System.out.println(s.length()),
                str);
    }
}
