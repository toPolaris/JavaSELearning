package API;

import java.util.Random;

/*
 * Random类用来生成随机数字
 * 使用步骤：
 *   1.导包：import java.util.Random
 *   2.创建：Random r = new Random()
 *   3.使用：获取随机int数字，范围是int的表示返回，int num = r.nextInt()
 *          获取随机int数字，参数代表范围，左闭右开区间，int num = r.nextInt(n)，[0,n)
 *              欲获得[m,n]之间的随机数：[m,n]->[m,n+1)->[0,n+1-m)+m
 * */
public class API03Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
        num = r.nextInt(20) + 10;
        System.out.println(num);//[10,29]->[10,30)->[0,20)
        num = r.nextInt();
        randomGame(num);
    }

    //使用二分法猜测随机生成的数字
    public static void randomGame(int rnum) {
        int low = Integer.MIN_VALUE;
        int hig = Integer.MAX_VALUE;
        int mid = (low + hig) / 2;
        int i = 0;
        while (true) {
            i++;
            System.out.println("i = " + i + ", low = " + low + ", mid = " + mid + ", hig = " + hig);
            if (rnum > mid) {
                low = mid;
                long temp = (low + hig) / 2;//防止数据溢出
                mid = (int) (temp) + 1;
            } else if (rnum < mid) {
                hig = mid;
                long temp = (low + hig) / 2;
                mid = (int) (temp);
            } else {
                System.out.println("Guess = " + mid + ", Random = " + rnum);
                break;
            }
        }
    }
}
