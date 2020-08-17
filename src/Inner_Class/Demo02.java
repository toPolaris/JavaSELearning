package Inner_Class;

public class Demo02 {
    public void method() {
        int constInt = 100;
        class Inner {
            final String str = "Inner!";

            public void methodInner() {
                System.out.println(str + constInt);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
