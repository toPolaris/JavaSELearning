package Functional_Interface;

import java.util.function.Function;

/**
 * learning.Functional_Interface
 * Created on 2020/8/8 17:38
 *
 * @author Protein
 */
public class myFunction {
    private static void Conversion(String str, Function<String, Integer> function) {
        System.out.println(function.apply(str));
    }

    private static void ConversionAndThen(String str, Function<String, Integer> f1, Function<Integer, Integer> f2) {
        System.out.println(f1.andThen(f2).apply(str));
    }

    public static void main(String[] args) {
        Conversion("2000", s -> Integer.parseInt(s));
        ConversionAndThen("2201",
                s -> Integer.parseInt(s),
                i -> i / 100);
    }
}
