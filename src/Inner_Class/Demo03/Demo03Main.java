package Inner_Class.Demo03;

public class Demo03Main {
    public static void main(String[] args) {
        //使用匿名内部类
        Demo03 demo03 = new Demo03() {
            @Override
            public void method() {
                System.out.println("Using: Anonymous Inner Class!");
            }
        };
        demo03.method();
        //匿名对象
        new Demo03() {
            @Override
            public void method() {
                System.out.println("Using: Anonymous Object with Anonymous Inner Class!");
            }
        }.method();
    }
}
