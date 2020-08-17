package Stream_MethodReference;

/**
 * learning.Stream_MethodReference
 * Created on 2020/8/8 19:50
 *
 * @author Protein
 */
public class CustomizedPrintChild extends CustomizedPrint {
    @Override
    public void upperPrint(String str) {
        System.out.println("CustomizedPrintChild-upperPrint: " + str.toUpperCase());
    }

    public void SubclassPrint(MyPrint mp) {
        mp.print("SubclassPrint: Hello World!");
    }

    public void show() {
        SubclassPrint(super::upperPrint);
    }

    public void showAgain() {
        SubclassPrint(this::upperPrint);
    }
}
