package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 20:32
 * Description: what's thread-safe? how to ensure thread-safe
 */
/*
 * 线程安全问题都是由全局变量及静态变量引起的。
 * 若每个线程中对全局变量、静态变量只有读操作，而无写操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般需要考虑线程同步，否则线程安全无法保证。
 * 线程同步：
 *   同步代码块->同步方法->锁机制
 * 同步代码块：
 *   Java提供synchronized关键字完成这个操作，synchronized用于方法的某个区块，表示对该部分资源互斥访问
 *   格式：synchronized(同步锁){
 *           同步的代码
 *        }
 *   同步锁：对象的同步锁只是一个概念，可以理解为在对象上标记了一个锁。
 *   锁对象可以是任意类型，多个线程对象要使用同一把锁。
 *   注意：任何时候最多允许一个线程拥有同步锁，谁拿到锁就进入代码块，其他的线程只能在外等着（BLOCKED）。
 * 同步方法：使用synchronized修饰的方法，就叫做同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等待。
 *   格式：public synchronized void method(){
 *           可能会产生线程安全问题的代码
 *        }
 *   对于非static方法，同步锁就是this。对于static方法，我们使用当前方法所在类的字节码对象（类名.class）
 * Lock锁（同步锁）：
 *   java.util.concurrent.locks.Lock机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作
 *   除去同步代码块/同步方法具有的功能，Lock拥有更强大的功能，更体现面向对象
 *   public void lock()：加同步锁。
 *   public void unlock()：释放同步锁。
 * */
public class Thread_safe {
    public static void main(String[] args) {
        verify01();
        //verify02();
        //verify03();
    }

    private static void verify03() {
        Demo03 demo03 = new Demo03();//创建Runnable接口的实现类对象
        //使用Runnable接口的实现类对象创建Thread类对象
        Thread t0 = new Thread(demo03);
        Thread t1 = new Thread(demo03);
        Thread t2 = new Thread(demo03);
        //开启多线程
        t0.start();
        t1.start();
        t2.start();
    }

    private static void verify02() {
        Demo02 demo02 = new Demo02();//创建Runnable接口的实现类对象
        //使用Runnable接口的实现类对象创建Thread类对象
        Thread t0 = new Thread(demo02);
        Thread t1 = new Thread(demo02);
        Thread t2 = new Thread(demo02);
        //开启多线程
        t0.start();
        t1.start();
        t2.start();
    }

    private static void verify01() {
        Demo01 demo01 = new Demo01();//创建Runnable接口的实现类对象
        //使用Runnable接口的实现类对象创建Thread类对象
        Thread t0 = new Thread(demo01);
        Thread t1 = new Thread(demo01);
        Thread t2 = new Thread(demo01);
        //开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
