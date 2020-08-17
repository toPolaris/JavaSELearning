package Method;

/*
 * 满足其一：参数个数不同、参数类型不同、多类型参数顺序不同
 * 与参数名称、方法返回值类型、修饰符无关（不可构成重载）
 * */
public class Method03Overload {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        return a == b;
    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public boolean isSame(short a, short b) {
        return a == b;
    }
}
