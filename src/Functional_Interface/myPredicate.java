package Functional_Interface;

import java.util.function.Predicate;

/**
 * learning.Functional_Interface
 * Created on 2020/8/8 17:08
 *
 * @author Protein
 */
public class myPredicate {
    private static void is2(String str, Predicate<String> p) {
        System.out.println("Length of " + "\"" + str + "\" " + (p.test(str) ? "is" : "is not") + " 2.");
    }

    private static void is2and(String str, Predicate<String> p, Predicate<String> pn) {
        System.out.println("\"" + str + "\": begin with \"N\" and length 2? " + (p.and(pn).test(str) ? "Yes" : "No"));
    }

    private static void is2or(String str, Predicate<String> p, Predicate<String> pn) {
        System.out.println("\"" + str + "\": begin with \"N\" or length 2? " + (p.or(pn).test(str) ? "Yes" : "No"));
    }

    private static void is2negate(String str, Predicate<String> p) {
        System.out.println("Length of " + "\"" + str + "\" is not 2? " + (p.negate().test(str) ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        is2("Ni", str -> str.length() == 2);

        is2and("Ni",
                s -> s.length() == 2,
                s -> s.startsWith("N"));

        is2or("Nnn",
                s -> s.length() == 2,
                s -> s.startsWith("N"));

        is2negate("Ni", str -> str.length() == 2);
    }
}
