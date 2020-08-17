package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 15:28
 * Description:
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("2 3 3 3 3 3 3 3 3 3");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("a w s l\n" + Thread.currentThread().getName());
        System.out.println("o h h h h h h h h h");
    }
}
