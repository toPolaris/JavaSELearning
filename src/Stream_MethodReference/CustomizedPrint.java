package Stream_MethodReference;

/**
 * learning.Stream_MethodReference
 * Created on 2020/8/8 19:42
 *
 * @author Protein
 */
public class CustomizedPrint {
    public static void lowerPrint(String str) {
        System.out.println("CustomizedPrint-lowerPrint: " + str.toLowerCase());
    }

    public void upperPrint(String str) {
        System.out.println("CustomizedPrint-upperPrint: " + str.toUpperCase());
    }
}
