package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 20:58
 * Description:
 */
public class Demo03 implements Runnable {
    Lock lock = new ReentrantLock();
    private int left = 200;

    @Override
    public void run() {
        while (true) {
            lock.lock();//上锁
            if (left > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " --> " + (--left));
            }
            lock.unlock();//解锁
        }
    }
}
