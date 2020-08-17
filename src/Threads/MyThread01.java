package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/28 17:20
 * Description: use first method to create a thread class
 */
public class MyThread01 extends Thread {
    //constructor
    public MyThread01(String name) {
        //调用父类的String参数的构造方法
        super(name);
    }

    /*重写run方法*/
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            //使用getName获取线程名称
            sum += i;
            System.out.println(getName() + " --> " + i + " --> " + sum);
        }
    }
}
