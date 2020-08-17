package Inner_Class;

public class Demo01 {

    int num = 30;
    private String name;

    public Demo01() {
    }

    public Demo01(String name) {
        this.name = name;
    }

    public void methodDemo01Outer() {
        System.out.println("Demo01: Method Outside!");
        new Demo01Inner().methodDemo01Inner();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Demo01Inner {//成员内部类
        int num = 20;

        public void methodDemo01Inner() {
            System.out.println("Demo01: Method Inside!");
            System.out.println("Get Outside Class Name: " + name);
        }

        public void method02Demo01Inner() {
            int num = 10;
            System.out.println("Demo01 num: " + Demo01.this.num);//30
            System.out.println("Demo01Inner num: " + this.num);//20
            System.out.println("Demo01Inner method num: " + num);//10
        }
    }
}
