package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 14:51
 * Description: produce the tool
 */
public class Production extends Thread {
    private final Tool tool;

    public Production(String name, Tool tool) {
        super(name);
        this.tool = tool;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {//生产工具
            System.out.println(Thread.currentThread().getName() + "Running!");
            synchronized (tool) {
                if (tool.state) {//工具存在线程等待
                    try {
                        tool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //工具不存在，生产工具
                    System.out.println("Start producing tool!");
                    tool.inner = "Fe";
                    tool.outer = "Al";
                    tool.state = true;
                    tool.index = count++;
                    System.out.println("Product: " + tool.inner + "&" + tool.outer + " tool, index: " + tool.index);
                    tool.notify();//唤醒等待的使用线程
                }
                if (count == 10) break;
            }
        }
    }
}
