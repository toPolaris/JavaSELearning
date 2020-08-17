package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 15:24
 * Description: definition & usage
 */
/*
 * public static ExecutorService newFixedThreadPool(int nThreads)：返回线程池对象。
 *   创建的是有界线程池，也就是池中的线程个数可以指定最大数量
 * public Future<?> submit(Runnable task)：获取线程池中的某一个线程对象，并执行
 *   Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。
 * 使用线程池中线程对象的步骤：
 *   1. 创建线程池对象。
 *   2. 创建Runnable接口子类对象。（task）
 *   3. 提交Runnable接口子类对象。（take task）
 *   4. 关闭线程池（一般不做）。
 * */
public class Thread_Pool {
    public static void main(String[] args) {
        /*创建线程池对象*/
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /*创建Runnable实例*/
        RunnableImpl r = new RunnableImpl();
        /*从线程池中获取线程对象，调用run方法*/
        executorService.submit(r);
        /*再次获取对象并运行*/
        executorService.submit(r);
        executorService.submit(r);
        /*关闭线程池*/
        executorService.shutdown();
    }
}
