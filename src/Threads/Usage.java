package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 14:44
 * Description: 创建一个线程类用来使用Tool
 */
public class Usage extends Thread {
    private final Tool tool;

    public Usage(String name, Tool tool) {
        super(name);
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "Running!");
            synchronized (tool) {
                if (!tool.state) {
                    try {
                        tool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Using: " + tool.inner + "&" + tool.outer + " tool, index: " + tool.index);
                    tool.state = false;
                    if (tool.index == 9) break;
                    tool.notify();
                }
            }
        }
    }
}
