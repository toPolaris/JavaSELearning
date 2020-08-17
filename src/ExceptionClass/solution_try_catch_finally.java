package ExceptionClass;

import java.io.FileNotFoundException;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 16:37
 * Description: use "try...catch...finally" to deal with exception
 */
public class solution_try_catch_finally {
    /*
     * try-catch的方式就是捕获异常
     * 格式：
     *   try{
     *       编写可能会出现异常的代码
     *   }catch(异常类型  e){
     *       处理异常的代码
     *   }
     * */
    public static void main(String[] args) {
        try {//捕获异常
            read("b.txt");
        } catch (FileNotFoundException e) {//异常类型与try中抛出的异常类型一致
            System.out.println(e);
        }
        /*
         * 现在产生一个需求，无论程序是否抛出异常，我都需要打印一个Over出来
         * 显然try...catch无法满足要求，Java提供的finally代码块便满足这种需求
         * finally代码块的代码无论是否抛出异常总是会被执行
         * 由于这个特性的存在，finally中最好不要用return语句
         * */ finally {
            System.out.println("Over!");
        }
    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {
            //设定：不是a.txt就是异常
            throw new FileNotFoundException("Exception: File Not Found!");
        }
    }
}
