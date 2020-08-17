package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 16:56
 * Description: attentions about the solutions to exception
 */
public class attentions {
    /*
     * 当遇到多个异常时，处理方法有：
     *   1.使用多个try...catch分别捕捉，分别处理
     *   2.使用一个try，多个catch一次捕捉，多次处理
     *       try{
     *           可能出现异常的代码
     *       }catch(异常类型A  e){ A类型异常处理办法
     *           处理异常的代码
     *       }catch(异常类型B  e){ B类型异常处理办法
     *           处理异常的代码
     *       }
     *       注意：多个catch中的异常不能相同，如果catch中的多个异常之间有子父类异常的关系，那么子类异常要求在上面的catch处理，父类异常在下面的catch处理。
     *   3.使用一个try...catch一次处理多个异常
     * */
    /*
     * 注意事项：
     *   · 运行时异常被抛出可以不处理，即不捕获也不声明抛出
     *   · 父类抛出异常时，子类重写父类方法抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
     *   · 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。如果子类产生异常，只能捕获处理，不能声明抛出
     * */
}
