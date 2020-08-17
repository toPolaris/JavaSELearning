package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 17:24
 * Description: how to define and use a customized exception class
 */
/*
 * Java给我们提供许多不同的异常类，但在具体使用中我们仍然需要定义一些异常类来满足需求
 * 定义一个异常类：
 *   · 编译期异常：自定义类继承于java.lang.Exception
 *   · 运行时异常：自定义类继承于java.lang.RuntimeException
 * */
public class custom {
    /*
     * 实例：模拟注册操作，如果用户名已存在，则抛出编译期异常RegisterException或运行时异常RuntimeRegisterException并给出提示
     * */
    static String[] users = {"Susan", "Jack", "Tom"};//已存在用户名

    public static void main(String[] args) {
        checker("Rose");//Register Successfully!
        checker("Susan");//ExceptionClass.RegisterException: RegisterException: Susan existed!
        checkerRuntime("Rose");//Register Successfully!
        checkerRuntime("Susan");//Exception in thread "main" ExceptionClass.RuntimeRegisterException:
        // RuntimeRegisterException: Susan existed!
    }

    public static void checker(String name) {
        for (String str : users) {
            if (str.equals(name)) {
                try {
                    throw new RegisterException("RegisterException: " + name + " existed!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("Register Successfully!");
    }

    public static void checkerRuntime(String name) {
        for (String str : users) {
            if (str.equals(name)) {
                throw new RuntimeRegisterException("RuntimeRegisterException: " + name + " existed!");
            }
        }
        System.out.println("Register Successfully!");
    }
}
