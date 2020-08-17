package Method;

/*
 * JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化成如下格式：
 *   修饰符 返回值类型 方法名(参数类型... 形参名){  } 等价于 修饰符 返回值类型 方法名(参数类型[] 形参名){  }
 * 一个方法最多只能有一个可变参数，如果除了可变参数外有其他参数传入，那么可变参数必须是参数列表最后一个
 * */
public class VariadicParameter {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80));//360
    }

    private static int sum(int... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        return sum;
    }
}
