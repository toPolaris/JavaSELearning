package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 17:01
 * Description: what's thread? how to create a thread?
 */
/*
 * 并发与并行：
 *   并发：一个时间段内发生多个事件，交替进行
 *   并行：某一时刻发生多个事件，同时进行
 * 进程与线程：
 *   进程：一个内存中运行的应用程序，每个进程拥有独立的内存空间，一个应用程序可以同时运行多个进程
 *        进程也是程序的一次执行过程，是系统运行程序的基本单位
 *        系统运行一个程序即是一个进程从创建、运行到消亡的过程
 *   线程：线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程
 *        一个进程可以有多个线程，拥有多个线程的程序也被成为多线程程序
 *   一个程序运行后至少有一个进程，一个进程中可以包含多个线程
 * 线程调度：
 *   分时调度：所有线程轮流使用 CPU 的使用权，平均分配每个线程占用 CPU 的时间
 *   抢占式调度：优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一个（线程随机性），Java使用的为抢占式调度
 * 抢占式调度解析：
 *   CPU使用抢占式调度模式在多个线程间进行着高速的切换。对于CPU的一个核而言，某个时刻，只能执行一个线程，CPU在多个线程间切换速度极快，看上去就是在同一时刻运行。
 *   其实，多线程程序并不能提高程序的运行速度，但能够提高程序运行效率，让CPU的使用率更高。
 * 创建线程类：
 *   第一种方法：
 *       Java使用java.lang.Thread类代表线程，所有的线程对象都必须是Thread类或其子类的实例。
 *       每个线程的作用是完成一定的任务，实际上就是执行一段程序流即一段顺序执行的代码。
 *       Java使用线程执行体来代表这段程序流，通过继承Thread类来创建并启动多线程，步骤如下：
 *           1. 创建Thread类的子类，重写该类的run()方法，run()方法的方法体就代表了线程需要完成的任务，也称为线程执行体。
 *           2. 创建Thread子类的实例，即创建线程对象
 *           3. 调用线程对象的start()方法来启动该线程
 *       Thread类：
 *           构造方法：
 *           public Thread()：分配一个新的线程对象。
 *           public Thread(String name)：分配一个指定名字的新的线程对象。
 *           public Thread(Runnable target)：分配一个带有指定目标新的线程对象。
 *           public Thread(Runnable target,String name)：分配一个带有指定目标新的线程对象并指定名字。
 *           常用方法：
 *           public String getName()：获取当前线程名称。
 *           public void start()：导致此线程开始执行; Java虚拟机调用此线程的run方法。
 *           public void run()：此线程要执行的任务在此处定义代码。
 *           public static void sleep(long millis)：使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 *           public static Thread currentThread()：返回对当前正在执行的线程对象的引用。
 *   第二种方式：
 *       1. 定义Runnable接口的实现类，并重写该接口的run()方法（线程执行体）
 *       2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
 *       3. 调用线程对象的start()方法来启动线程。
 * 多线程原理：...
 *
 *
 * */
public class definition {
    public static void main(String[] args) {
        /*第一种方法*/
        //创建实例
        MyThread01 myThread01 = new MyThread01("nT01");
        //使用start方法启动线程
        //myThread01.start();
        //main方法中也运行这样的循环
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println("main" + " --> " + i + " --> " + sum);
        }
        /*
         * 运行结果中有一段这样的输出：
         *   main --> 181 --> 16471
         *   nT01 --> 0 --> 0
         *   main --> 182 --> 16653
         *   nT01 --> 1 --> 1
         *   main --> 183 --> 16836
         *   nT01 --> 2 --> 3
         *   main --> 184 --> 17020
         *   nT01 --> 3 --> 6
         * 由此可以看出main线程（又称为主线程）与创建的nT01线程交替抢占CPU使用权运行代码
         * 每次运行程序交替部分出现位置均不同，体现了线程运行的随机性
         * */
        /*第二种方法*/
        MyThread02 myThread02 = new MyThread02();//创建Runnable实现类对象
        Thread t = new Thread(myThread02, "nT02");//创建Thread对象
        t.start();//调用start方法启用线程
        /*运行结果与第一种方法相似*/
        /*
         * Thread和Runnable的区别：
         *   一个类继承Thread不适合资源共享，如果实现了Runnable接口，就很容易的实现资源共享。
         * 实现Runnable接口比继承Thread类所具有的优势：
         *   1. 适合多个相同的程序代码的线程去共享同一个资源。
         *   2. 可以避免java中的单继承的局限性。
         *   3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
         *   4. 线程池只能放入实现Runnable或Callable类线程，不能直接放入继承Thread的类。
         *   扩充：在java中，每次程序运行至少启动2个线程————main线程和垃圾收集线程。
         *       每当使用java命令执行一个类的时候，实际上都会启动一个JVM，每一个JVM其实在就是在操作系统中启动了一个进程。
         * */
        /*
         * 对于第二种方法也可以使用匿名内部类创建线程
         * */
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("main" + " --> " + i);
                }
            }
        };
        new Thread(r).start();//调用
    }
}
