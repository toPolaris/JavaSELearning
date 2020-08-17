package Functional_Interface;

import java.util.Arrays;
import java.util.Comparator;

/**
 * learning.Functional_Interface
 * Created on 2020/8/8 16:24
 *
 * @author Protein
 */
public class DemoMain {
    private static void test(int flag, Demo demo) {
        if (flag == 1) {
            demo.method();
        }
    }

    private static void newThread(Runnable t) {
        new Thread(t).start();
    }

    private static Comparator<String> myComparator() {
        return (a, b) -> a.length() - b.length();
    }

    public static void main(String[] args) {
        int f = 1;
        String msg = "Method in Functional Interface is Running!";
        /*test(f, () -> {
            System.out.println(msg);
        });*/
        //简化写法
        test(f, () -> System.out.println(msg));

        newThread(() -> System.out.println("Thread is Running!"));

        String[] strings = {"a", "bbb", "cc", "d", "eeee"};
        Arrays.sort(strings, myComparator());
        System.out.println(Arrays.toString(strings));
    }
}
