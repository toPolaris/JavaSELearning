package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 20:41
 * Description: an example for ensuring thread-safe
 * suppose you'll sell an item, total number: 200
 */
public class Demo01 implements Runnable {
    Object object = new Object();//create a locked object
    private int left = 200;//remaining

    @Override
    public void run() {//start selling
        while (true) {
            synchronized (object) {
                if (left > 0) {
                    try {
                        Thread.sleep(100);//time for selling
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " --> " + (--left));
                }
            }
        }
    }
}
