package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 20:53
 * Description:
 */
public class Demo02 implements Runnable {
    private int left = 200;

    @Override
    public void run() {
        while (true) {
            sell();
        }
    }

    private synchronized void sell() {
        if (left > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " --> " + (--left));
        }
    }
}
