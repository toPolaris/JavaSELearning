package Stream_MethodReference;

/**
 * learning.Stream_MethodReference
 * Created on 2020/8/8 19:22
 *
 * @author Protein
 */
public class MethodReference {
    private static void printDemo(MyPrint mp) {
        mp.print("Hello World!");
    }

    private static void namePrint(String name, PersonBuilder pb) {
        System.out.println(pb.builder(name).getName());
    }

    private static int[] initIntArray(int length, ArrayBuilder ab) {
        return ab.builder(length);
    }

    public static void main(String[] args) {
        printDemo(System.out::println);
        CustomizedPrint cp = new CustomizedPrint();
        printDemo(cp::upperPrint);
        printDemo(CustomizedPrint::lowerPrint);
        CustomizedPrintChild cpc = new CustomizedPrintChild();
        cpc.show();
        cpc.showAgain();
        namePrint("Susan", name -> new Person(name));
        namePrint("Tom", Person::new);
        int[] intArray01 = initIntArray(10, int[]::new);
        int[] intArray02 = initIntArray(20, length -> new int[length]);
        System.out.println(intArray01 + "-->" + intArray01.length);
        System.out.println(intArray02 + "-->" + intArray02.length);
    }
}
