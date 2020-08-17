package Functional_Interface;

import java.util.function.Supplier;

/**
 * learning.Functional_Interface
 * Created on 2020/8/8 16:47
 *
 * @author Protein
 */
public class mySupplier {
    private static String getString(Supplier<String> s) {
        return s.get();
    }

    public static void main(String[] args) {
        //test
        System.out.println(getString(() -> "hello World!"));

        String[] strings = {"a", "bbb", "cc", "d", "eeee"};
        System.out.println(getString(() -> {
            String tempStr = strings[0];
            for (String string : strings) {
                if (string.length() > tempStr.length()) {
                    tempStr = string;
                }
            }
            return tempStr;
        }));
    }
}
