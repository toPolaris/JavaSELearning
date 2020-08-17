package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 12:56
 * Description: definition of exception
 */

/*
 * 异常的根类是java.lang.Throwable，其下有两个子类：java.lang.Error与java.lang.Exception，平常所说的异常指java.lang.Exception
 * Error无法被程序员处理，Exception可以被处理
 * Throwable中的常用方法：
 *   public void printStackTrace()：打印异常的详细信息。包含了异常的类型、原因、出现的位置，在开发和调试阶段，都得使用printStackTrace。
 *   public String getMessage()：获取发生异常的原因。提示给用户的时候，仅提示错误原因。
 *   public String toString()：获取异常的类型和异常描述信息（不用）。
 * 异常（Exception）的分类：
 *   编译时期异常：checked异常。编译时期检查，没有处理异常则编译失败。
 *   运行时期异常：runtime异常。运行时期检查异常，在编译时期，运行异常不会编译器检测（不报错）。
 * */
public class definition {
}
