package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 14:33
 * Description: how does Wake-up Waiting Work?
 */
/*
 * 线程间通信：多个线程对统一资源进行操作
 * 等待唤醒机制：
 *   方法：wait、notify、notifyAll
 * */
public class Wakeup_Waiting {
    public static void main(String[] args) {
        Tool tool = new Tool();
        Production production = new Production("Production", tool);
        Usage usage = new Usage("Usage", tool);
        usage.start();
        production.start();
    }
}
