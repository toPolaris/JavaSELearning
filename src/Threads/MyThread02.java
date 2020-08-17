package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 17:44
 * Description:
 */
public class MyThread02 implements Runnable {
    //重写run方法
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            //使用getName获取线程名称
            sum += i;
            System.out.println(Thread.currentThread().getName() + " --> " + i + " --> " + sum);
        }
    }
}
