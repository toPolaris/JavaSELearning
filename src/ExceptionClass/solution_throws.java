package ExceptionClass;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 13:35
 * Description:  use "throws" to deal with an exception
 */
public class solution_throws {
    /*
     * 声明异常throws
     * 声明异常：将问题标识出来，报告给调用者。
     *       如果方法内通过throw抛出了编译时异常，而没有捕获处理（稍后讲解该方式），那么必须通过throws进行声明，让调用者去处理。
     * 关键字throws运用于方法声明之上，表示当前方法不处理异常，而是提醒该方法的调用者来处理异常（抛出异常）。
     * 格式：修饰符 返回值类型 方法名（参数） throws 异常类名1,异常类名2…{   }
     * 注：
     *   1.throws关键字必须写在方法声明处
     *   2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
     *   3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常，如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
     *   4.调用了一个声明抛出异常的方法,我们就必须的处理声明的异常
     *       · 继续使用throws声明抛出交给方法的调用者处理，最终交给JVM
     *       · try...catch自己处理异常
     * */
    //继承关系：FileNotFoundException extends IOException extends Exception
    //如果抛出的多个异常对象有子父类关系,那么直接声明父类异常即可，下面三种throws均可
    //public static void main(String[] args) throws FileNotFoundException,IOException {
    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws Exception {
        //readFile("c:\\a.tx");//Exception in thread "main" java.io.IOException: Exception: Not a ".txt" Suffix!
        //readFile("c:\\b.txt");//Exception in thread "main" java.io.FileNotFoundException: Exception: Wrong File Path!
        readFile("c:\\a.txt");//Read Successfully!
    }

    /*
     * 要求对传递的文件路径进行合法性判断，路径不是以“.txt”结尾产生IOException异常，路径不是"c:\\a.txt"，产生FileNotFoundException异常
     *     FileNotFoundException是编译异常，必须处理这个异常，可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
     * */
    public static void readFile(String fileName) throws /*FileNotFoundException可省*/ IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("Exception: Not a \".txt\" Suffix!");
        }
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("Exception: Wrong File Path!");
        }
        System.out.println("Read Successfully!");
    }
}
